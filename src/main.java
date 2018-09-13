import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        int countScore = 0;
        String userAns;

        String question1 = "What is the age of Harambe? ";
        String question2 = "How many letters are in no? ";
        String question3 = "What's the most popular music genre? ";
        String question4 = "How many people live in Atlantis? ";
        String question5 = "What's the price of high end phones today?,\nMake sure to add the $ sign and commas if you have any. ";

        String ans1 = "17";
        String ans2 = "2";
        String ans3 = "Rap";
        String ans4 = "20 million";
        String ans5 = "$1,000";


        Scanner quest = new Scanner(System.in);
        for (int i = 0; i < 6; i++){
            countScore += 0;
            System.out.println(question1);
            String userAns1 = quest.next();

            if (userAns1.equalsIgnoreCase(ans1)){
                System.out.println("Right! ");
                countScore = countScore + 1;
            }else {
                System.out.println("Wrong! " + ans1 + " is the correct answer!");

            }

            System.out.println("Your Answer: " + userAns1);

            System.out.println(question2);
            String userAns2 = quest.next();

            if (userAns2.equalsIgnoreCase(ans2)){
                System.out.println("Right! ");
                countScore = countScore + 1;
            }else {
                System.out.println("Wrong! " + ans2 + " is the correct answer!");

            }

            System.out.println("Your Answer: " + userAns2);


            System.out.println(question3);
            String userAns3 = quest.next();

            if (userAns3.equalsIgnoreCase(ans3)){
                System.out.println("Right! ");
                countScore = countScore + 1;
            }else {
                System.out.println("Wrong! " + ans3 + " is the correct answer!");

            }

            System.out.println("Your Answer: " + userAns3);

            System.out.println(question4);
            String userAns4 = quest.next();

            if (userAns4.equalsIgnoreCase(ans4)){
                System.out.println("Right! ");
                countScore = countScore + 1;
            }else {
                System.out.println("Wrong! " + ans4 + " is the correct answer!");

            }

            System.out.println("Your Answer: " + userAns4);


            System.out.println(question5);
            String userAns5 = quest.next();

            if (userAns5.equalsIgnoreCase(ans5)){
                System.out.println("Right! ");
                countScore = countScore + 1;
            }else {
                System.out.println("Wrong! " + ans5 + " is the correct answer!");

            }

            System.out.println("Your Answer: " + userAns5);


            break;
        }
        System.out.println("Total questions right: " + countScore);
    }
}
