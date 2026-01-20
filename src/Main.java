import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Day 1
//        String name= "Mahammod";
//        int x = 23;
//        double y = 3.4;
//        boolean z = false;

//        int a=10;
//        int b = 123;
//        System.out.println("+ :"+(a+b));
//        System.out.println("- :"+(a-b));
//        System.out.println("* :"+(a*b));
//        System.out.println("/ :"+(a/b));
//        System.out.println("% :"+(a%b));
//
//        System.out.println(++a);
//        System.out.println(a == b);
//        System.out.println(a<b);
//      int f = 23;
//       f += 5;
//        System.out.println(f);

//        while(true){
//            try{
//                System.out.println("q for Exit.");
//                Scanner input = new Scanner(System.in);
//                System.out.println("Plz Enter your name: ");
//                String name = input.nextLine();
//                if (name.equalsIgnoreCase("q")){
//                    break;
//                }
//                System.out.println("Plz Enter your age: ");
//                int age = input.nextInt();
//                input.nextLine();
//                System.out.println("Plz Enter your city: ");
//                String city = input.nextLine();
//                String formater = String.format("Hello %s your are %d and you live in %s",name,age,city);
//                System.out.println(formater);
//            }catch (Exception e){
//                System.out.println("Plz Enter just a number.");
//            }
//        }


//        for(int i = 0 ; i<=50 ; i++){
//            if (i%2 == 0){
//                System.out.println(i);
//                if (i==36){
//                    break;
//                }
//
//            }
//        }

//        int score = 8;
//        if (score > 90 && score<100){
//            System.out.println("A+");
//
//        }else if (score > 70 && score <90){
//            System.out.println("A");
//        }else if (score >60 && score <70){
//            System.out.println("B");
//        }else if (score >50 && score<60){
//            System.out.println("C");
//        }else if (score<50){
//            System.out.println("Failed");
//        }else {
//            System.out.println("your number in Incorrect.");
//        }
//        int day = 3;
//        String dayName= switch (day){
//            case 1 -> "Saturday";
//            case 2 -> "Sunday";
//            case 3 -> "Monday";
//            case 4 -> "Tuesday";
//            case 5 -> "Wednesday";
//            case 6 -> "Thursday";
//            case 7 -> "Friday";
//            default -> "Invalid day";
//        };
//        System.out.println(dayName);



//        day 3
//        Arrays
//String color ="red";
//String colors ="red","blue";
String [] colors1 = new String[5];
colors1[0]="red";
colors1[1]="blue";
colors1[2]="yellow";
colors1[3]="pink";
colors1[4]="green";


String [] colors2 = {"red","blue","pink","yellow","green","purple"};
//        System.out.println(colors2[0]);
////        System.out.println(colors2[1]);
////        System.out.println(colors2[2]);
////        System.out.println(colors2[3]);
////        System.out.println(colors2[4]);
////        System.out.println(colors2[5]);
//
//
//        for (int i = 0; i<colors2.length; i++){
//            System.out.println(colors2[i]);
//        }


        int[] numbers ={2,4,5,-76,87,-9,6,66,7,7,88,4,2,2};
        int sum=0;
        int max= numbers[0];
        int min =numbers[0];
        double avg = 0.0;
        for (int i = 0 ; i<numbers.length;i++){
            sum+=numbers[i];
            if (numbers[i] > max){
                max= numbers[i];
            }
            if (numbers[i]< min){
                min= numbers[i];
            }

        }

        avg = (double) sum / numbers.length;
        System.out.println("Sum is: "+sum );
        System.out.printf("Average is: %.2f",avg);
        System.out.println();
        System.out.println("Max is: "+max );
        System.out.println("Min is: "+min );





    }
}