package edu.cnm.deepdive;

public class PartTwoOfStringMethods {

  public static void main(String[] args) {
    String str = "java";
    String str2 = "Java";
    String str3 = "ja";

    System.out.println(str.equals(str2));//will print false because of the J.
    System.out.println(str.equalsIgnoreCase(str2));//will print true.
    System.out.println("abc".equalsIgnoreCase("ABC"));//prints true.

    //startsWith() and endsWith()
    System.out.println();
    System.out.println(str.startsWith("j"));//true
    System.out.println(str.startsWith(str3));//true
    System.out.println(str.startsWith("J"));//false
    System.out.println(str.startsWith("J".toLowerCase()));//true
    System.out.println(str.endsWith("va"));//true

    //contains()
    System.out.println();
    System.out.println(str.contains(str3));//true
    System.out.println(str.contains("av"));//true
    System.out.println("Java".contains("j"));//false
    System.out.println("Java".contains("j".toUpperCase()));//true

    //replace()
    System.out.println();
    String myString = "Java" + " " + "is" + " " + "cool";
    System.out.println(myString.replace('a', 'A'));//JAvA is cool
    System.out.println(myString.replace(" ", "_"));//Java_is_cool
    System.out.println(myString.replace("is", "_"));//Java _ cool
    System.out.println(myString);//still the same original String

    //trim() removes white space at the beginning and the end
    System.out.println("Java".trim());//will simply print Java
    System.out.println(" Java is cool ");// Java is cool //
    System.out.println(" Java is cool ".trim());//Java is cool//


  }

}
