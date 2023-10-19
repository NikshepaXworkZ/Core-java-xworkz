package com.xworkz.policestation.officers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Officer {
    private int officerId;
    private String name;
    private String postName;
    private int age;
   private String gender;//constants
  private String  bloodGroup;
   private String address;
   private String emailId;

}
