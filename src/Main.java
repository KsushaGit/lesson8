import java.util.Arrays;

public class Main {

    /* public static void m() // example, all the methods are overloaded
     {
         System.out.println("()");
     }

    public static void m(int a)
     {
         System.out.println("(int a)");
     }
     public static void m(int a, int b)
     {
         System.out.println("(int a, int b)");
     }
     public static void m( int ...a)
     {
         System.out.println("(int ...a)");
     }
     public static int m ( double a)
     {
         System.out.println("(double a)");
         return 20;
     } */
   // public static void main(String[] args) {

       /* m();
        m(10);
        m(10 , 20);
        m(10,20,30,40,50);
        m(1.2);

}
}
*/
/*****
       //??

        Test test = new Test(2);
        Test test1 = test.testIncTen();
        //System.out.println();
        System.out.println(test1.a);

        test1 = test1.testIncTen();
        System.out.println(test1.a);


 */


 /*public static void main (String[] args){

    Girl ira =new Girl ( "Ia", 25);
            System.out.println(ira);
    ira.setAge(10000);
            System.out.println(ira);

            Supergirl ket = new Supergirl("Ket" , 30, true);

            ket.goToCinema();
    }  */


 // correct

public static void main (String[] args) throws CloneNotSupportedException {

   /* Point point= new Point(10,10);
    Point point1= new Point(10,10);

    System.out.println(point.equals(point1));
    System.out.println(point.hashCode());
    System.out.println(point1.hashCode());

    System.out.println(point.toString());
    System.out.println(point.getClass() == Point.class);// often method for using, to compare class
    Object clone = point.clone(); */

   // final int COUNT1 =5; // final как constant, поэтому пишем большими буквами
    final int COUNT [] = {1,2,4,5,6};
    COUNT[0]=10000;
    System.out.println(Arrays.toString(COUNT));

}



}

