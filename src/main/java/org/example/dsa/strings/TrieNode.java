package org.example.dsa.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrieNode {
  Map<Character, TrieNode> children;
  boolean isEndOfWord;

  public static void main(String[] args) {
    Trie trie = new Trie();

    trie.insert("hello");
    trie.insert("world");
    trie.insert("hey");
    System.out.println(trie.search("hello")); // true
    System.out.println(trie.search("hell"));  // false
    System.out.println(trie.startsWith("hell")); // true
    System.out.println(trie.search("world")); // true
    System.out.println(trie.getStartsWith("he"));
  }


  public TrieNode() {
    children = new HashMap<>();
    isEndOfWord = false;
  }

  static class Trie{
    private final TrieNode root;

    public Trie() {
      root = new TrieNode();
    }

    // Insert a word into the Trie
    public void insert(String word) {
      TrieNode node = root;
      for (char ch : word.toCharArray()) {
        node.children.putIfAbsent(ch, new TrieNode());
        node = node.children.get(ch);
      }
      node.isEndOfWord = true;
    }

    // Search for a word in the Trie
    public boolean search(String word) {
      TrieNode node = root;
      for (char ch : word.toCharArray()) {
        if (!node.children.containsKey(ch)) {
          return false;
        }
        node = node.children.get(ch);
      }
      return node.isEndOfWord;
    }

    // Check if a prefix exists in the Trie
    public boolean startsWith(String prefix) {
      TrieNode node = root;
      for (char ch : prefix.toCharArray()) {
        if (!node.children.containsKey(ch)) {
          return false;
        }
        node = node.children.get(ch);
      }
      return true;
    }

    public List<String> getStartsWith(String prefix){
      TrieNode node=root;
      List<String> words=new ArrayList<>();
      for(char ch:prefix.toCharArray()){
        if(!node.children.containsKey(ch)){
         return words;
        }
        node= node.children.get(ch);
      }
      collectWords(node, prefix, words);
      return words;
    }

    private void collectWords(TrieNode node, String prefix, List<String> words) {
      if (node.isEndOfWord) {
        words.add(prefix);
      }
      for (Map.Entry<Character, TrieNode> entry : node.children.entrySet()) {
        collectWords(entry.getValue(), prefix + entry.getKey(), words);
      }
    }
  }
}
