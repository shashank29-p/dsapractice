package org.example.dsa.bitmanipulation;

public class SingleNumber2 {


  public static void main(String[] args) {

    /*
    * Trick:
   sum % 3 == 0 → that bit is from duplicates → ignore
   sum % 3 != 0 → that bit is from single number → keep

  bit 2 → sum=0 → 0%3=0 → ignore
  bit 1 → sum=4 → 4%3=1 → keep ✅
  bit 0 → sum=1 → 1%3=1 → keep ✅

  result = 011 = 3 ✅
  *
  * For every bit position i (0 to 31):
    Count how many numbers have 1 at position i
         ↓
    If count % 3 != 0
         ↓
    Single number owns this bit → turn it ON in result
    */

    int[] nums = {2, 2, 2, 3};

    int result=0;

    for(int i=0;i<32;i++){
        int sum=0;
      for(int num:nums){
        if(((num>>i)& 1)==1){
          sum++;
        }
      }

      if(sum%3!=0){
        /*
         3 = 011  ← expected answer

          i=0: sum%3 != 0 → result |= (1<<0) → result = 001
          i=1: sum%3 != 0 → result |= (1<<1) → result = 011
          i=2: sum%3 == 0 → skip
          result = 011 = 3 ✅
        * */
        result|=(1<<i);
      }
    }

    System.out.println(result);

  }
}
