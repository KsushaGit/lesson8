public class Test {


        int a;




        public Test(int i){
            this.a=i;
        }

        Test testIncTen(){
            Test test =new Test(a+10);
            return test;

        }
}
