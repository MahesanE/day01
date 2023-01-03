//always start with the package name
package day01;
//imports stuff like the scanner stuff but for now we doing simple stuff so no need
public class Hello{
 //public refers to who can see the file. Hello used here is always going to be the file name. 
 // after that the public static void main is the entry point. 
 public static void main(String[] args) {
    //printing out the contents of args array
    System.out.printf("args.length= %d\n",args.length);
    
    int i = 0;
    for (i=0; i < args.length; i++){
        System.out.printf(">>> args[%d]= %s\n",i,args[i]);
    }
 }
}   