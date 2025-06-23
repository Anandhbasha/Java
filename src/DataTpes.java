public class DataTpes {
    public static void main(String[] args) {

        //operators
            //arithmetic
//            +,-,*,/,%
//        int a = 10;
//        int b= 18;
//        int c = (a*b)/b;
//        System.out.println(a+b);
//        System.out.println(b-a);
//        System.out.println(b*a);
//        System.out.println(b/a);
//        System.out.println(b%a);
//
//            //logical
//        System.out.println(b<18 && a>=10);
//        System.out.println(b<18 || a>10);
//        System.out.println(b!=a);
//            //comparison
//        System.out.println(a<b);
//        System.out.println(a>b);
//        System.out.println(a>=b);
//        System.out.println(a<=b);
//        //Statements
//            //if
////            if(a>b){
////                System.out.println("The condition is true B value is :" +b );
////            }
////            //if else
////        if(a>b){
////            System.out.println("The condition is true B value is :" +b );
////        }
////        else{
////            System.out.println("The condition is False A value is :" +a );
////        }
//            //else if
//        int age = 19;
//        String country = "India";
//        String State = "Kerala";
////        if(age>18){
////            if(country=="India"){
////                if(State=="TN"){
////                    System.out.println("The Person is Able to Vote");
////                }
////            }
////        }
//        if(age>18){
//            System.out.println("He is Able to vote");
//        } else if (age>10) {
//            System.out.println("Unable to Vote");
//        }
//        else {
//            System.out.println("He is Child");
//        }
//        //switch
//        String today = "Wednesday";
//        switch (today){
//            case "Sunday":
//                System.out.println("Today is Sunday");
//                break;
//            case "Monday":
//                System.out.println("Today is Monday");
//                break;
//            case "Tuesday":
//                System.out.println("Today is Tuesday");
//                break;
//            case "Wednesday":
//                System.out.println("Today is Wednesday");
//                break;
//            case "Thursday":
//                System.out.println("Today is Thursday");
//                break;
//            case "Friday":
//                System.out.println("Today is Friday");
//                break;
//            default:
//                System.out.println("Today is Sat");
//        }
//        //contdition
//            //while
//                while(a<b){
//                    //a=10
////                    b=18
//
////                    System.out.println("the a value is :" + a);
////                    System.out.println("the b value is :" + b);
////                    a=a+1;
//                    //a=11
////                    12
////                    18
//                }
//                System.out.println(a);
//            //do while
//            do{
//                System.out.println("the a value is :" + a);
//                System.out.println("the b value is :" + b);
//            }while (a>b);
//            // for
//
//        int [] marks = {80,90,70,55,88};
//        System.out.println(marks[1]);
//        for (int i=0;i< marks.length;i++){
//            System.out.println("The array value are :" +marks[i]);
//        }
        //
          //OPP
        //class
        //object
//        class Cars{
//            String carName = "Benz";
//            String carName1 = "BMW";
//        }
//
//        Cars car = new Cars();
//        System.out.println(car.carName);
//        System.out.println(car.carName1);
//
//      }
//        class student{
//            static int a = 20;
//        }
//        System.out.println(student.a);

//        class Students{
//            static String School_name = "PSG";
//            int rollNumber ;
//            String name;
//            Students(int r,String n){
//                rollNumber =r;
//                name = n;
//            }
//            void massage(){
//                System.out.println(rollNumber + "name is :" + name + "he is Studing at" + School_name);
//            }
//        }
//        Students s = new Students(101,"xyz");
//        Students s1 = new Students(102,"abc");
//        s.massage();
//        s1.massage();
//        class student {
//            protected String name;
//            student(String name){
//                this.name = name;
//
//            }
//            void result(){
//                System.out.println(this.name);
//            }
//
//        }
//        class student extends staff{
//
//        }
//        student n = new student("Mahesh");
//        n.result();
        int x = 10;
        String names = "xyz";
        for (int a = names.length() - 1; a >= 0; a--) {
            String outs = "";
            for (int b = a; b < names.length(); b++) {
                outs += names.charAt(b);
            }
            System.out.println(outs);
        }
    }



}
