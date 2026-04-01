package org.example;

import java.util.ArrayList;
import java.util.List;

public class ContainsCheck {

  public static void main(String[] args) {
    List<String> stringList = new ArrayList<>();
    stringList.add("backupVersionController-defaultBackupAndRestoreService-defaultCommonService-abc");
    stringList.add("backupVersionController-defaultBackupAndRestoreService");
    stringList.add("defaultCommonService-abc-backupVersionController-defaultBackupAndRestoreService");
    stringList.add("defaultCommonService-abc-backupVersionController");

    String substringToCheck = "backupVersionController-abc-defaultCommonService";

    for (String str : stringList) {
      if (str.contains(substringToCheck)) {
        System.out.println("'" + substringToCheck + "' is present in: " + str);
      } else {
        System.out.println("'" + substringToCheck + "' is NOT present in: " + str);
      }
    }
  }
}
