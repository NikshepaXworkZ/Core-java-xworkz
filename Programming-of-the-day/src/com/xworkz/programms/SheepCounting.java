package com.xworkz.programms;

public class SheepCounting {
    public static void main(String[] args) {
        Boolean[] sheeps = {true, true, true, false,
                true, true, true, true,
                true, false, true, false,
                true, false, false, true,
                true, true, true, true,
                false, false, true, true};
        SheepCounting sheepCount=new SheepCounting();
        sheepCount.sheepCount(sheeps);
    }
    int count=0;
    public void sheepCount(Boolean[] sheep) {
        for(int sheepss=0;sheepss<sheep.length;sheepss++){
            if(sheep[sheepss]!=null){
                if (sheep[sheepss]==true) {
                    count++;
                }
            }
        }
        System.out.println("total no of sheeps are: "+count);
    }
}
/*programming question: Consider an array/list of sheep where some sheep may be missing from their place.
 We need a function that counts the number of sheep present in the array (true means present).
[true,  true,  true,  false,
  true,  true,  true,  true ,
  true,  false, true,  false,
  true,  false, false, true ,
  true,  true,  true,  true ,
  false, false, true,  true]
Hint: Don’t forget to check for bad values like null/undefined*/
//prgm6