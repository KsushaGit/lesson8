public class Girl {


    private String name;
    private int age;

    public Girl(String name, int age) { // genereate Claa higlhlite
        this.name = name;
        this.age = age;
    }




    public void setAge(int age) {

        if (age>20&& age<30)

        this.age = age;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

   void  goToCinema(){

       System.out.println("GO with me= " + name);
   }




    @Override// override to string
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
