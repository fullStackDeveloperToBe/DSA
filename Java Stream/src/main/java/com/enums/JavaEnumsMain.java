package com.enums;

public class JavaEnumsMain {
    public static void main(String[] args) {
        JavaEnums daysOfWeek = JavaEnums.Sunday;
        if(JavaEnums.Sunday.equals(daysOfWeek)) {
            System.out.println(daysOfWeek+" is the daysOfWeek");
        }
        for(JavaEnums d : JavaEnums.values()) {
            System.out.print(d+" ");
        }
    }
}
