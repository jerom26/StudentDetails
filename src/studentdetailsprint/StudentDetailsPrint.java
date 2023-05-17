/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentdetailsprint;

/**
 *
 * @author srinivsi
 */
public class StudentDetailsPrint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // array of object decalration
         Student[] list = new Student[3];
         Scanner in = new Scanner(System.in);
         for(int i = 0;i<list.length;i++)
         {
             String n = in.next();
             int a = in.next();
             Student s1 = new Student(n,a);
             list[i] = s1;
         }
         for(int i=0;i<list.length;i++)
         {
             System.out.println(list [i].getName()+ " "  +list[i].getAge());
         }
    }
    
}
