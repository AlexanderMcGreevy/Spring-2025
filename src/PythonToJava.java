import java.util.*;

public class PythonToJava {

   //class level variables gp here
    public String testing;

    //def clapHands():
    // print('clap')
    public void clapHands(int num){
    System.out.println("clap");}
}
    //def clapHandsNum():
    //return 3
  // public int clapHandsNum(){
   // return 3;
  // }





    public static void main(String[] args) {
        //PythonToJava ptj = new PythonToJava();
        //ptj.clapHands(num: 4);

        //print('hello')
        System.out.println( "Hello World!");

        //print(3,'hi',45)
        System.out.println( 3 + "hi" + 45);

        //name=input("Enter your name')
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Hello " + name);

        int number = 2;
        //None in python is ike null in Java

        Integer num1=3;

        boolean isSnowing=true;
        //and  or  not
        //&&   ||   !
        //If number < 5:
        if(number < 5) {
            System.out.println("Less than 5");
        }
        else if(number>5){
            System.out.println("Greater than 5");
        }
        else{
            System.out.println("Equal to 5");
        }

        //str == 'hello'
        String str = "hello";
        str.equals("hello");

        //List1=[1,2,3]
        List<Integer> List1 = new ArrayList<Integer>();
        List1.add(1);
        List1.add(2);
        List1.add(3);
        List<Integer> list2 = Arrays.asList(1,2,3);

        //list1[0] = 1
        List1.set(0, 1);
        //print(list1[0])
        System.out.println(List1.get(0));

        //dist1={'123':'test'}
        Map<String, String> dist1 = new HashMap<>();
        dist1.put("123","Test");

        //for x in range(1,10,2):
        for(int x=1;x<=10;x+=2){//increase by one is x++
            System.out.println(x);
        }

        // for x in list1
        for (Integer x : List1){}

        //while number < 5
        while(number <5){number++;}

        do{
            System.out.println(number);
            number++;

        }while(number<5);



}
