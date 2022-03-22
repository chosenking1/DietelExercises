package assignmentsAndClassworks;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandomChristmasQuestion {

    public static void main(String[] args) {
        RandomChristmasQuestion go = new RandomChristmasQuestion();
        go.randomNumber();
        go.display(go.setResultsMethod());
    }
//public RandomChristmasQuestion(int totalCorrectAnswers, char[] allAnswers, ArrayList<Character> allCorrectAnswers){
//        this.totalCorrectAnswers = totalCorrectAnswers;
//        this.allAnswers = allAnswers;
//        this.allCorrectAnswers = allCorrectAnswers;
//}
    private void randomNumber() {
        int limit;
        Random digit = new Random();
        for(limit = 0; limit < 5; limit++){

            int number = 1 + digit.nextInt(20);
//            RandomChristmasQuestion go = new RandomChristmasQuestion();
            questionsMethod(number);

        }


    }

    private void questionsMethod(int number) {
        //RandomChristmasQuestion go = new RandomChristmasQuestion();


        int count = 0;
        String question = "";
        char answer = ' ';

        switch (number) {

            case 1 -> {
                question = """
                        1. Question: Which Christmas song is the highest-selling single of all time?
                        Answer: 'White Christmas' by Bing Crosby.""";
                answer = 'c';
                //   char answer = go.inputMethod();
            }
            case 2 -> {
                question = """
                        2. Question: Who wrote 'A Christmas Carol'?

                        Answer: Charles Dickens.""";
                //   char answer = go.inputMethod();
                answer = 'b';
            }
            case 3 -> {
                question = """
                        3. Question: Name the highest-grossing movie about Christmas.

                               Answer: 'How The Grinch Stole Christmas.'""";
                //   char answer = go.inputMethod();
                answer = 'b';
            }
            case 4 -> {
                question = """
                        4. Question: 'Jingle bells', the most popular Christmas song was originally a thanksgiving song. True or false?

                                Answer: True.""";
                //  char answer = go.inputMethod();
                answer = 'T';
            }
            case 5 -> {
                question = """
                        5. Question: Which popular Christmas song was played in space?

                                Answer: 'Jingle bells'.""";
                // char answer = go.inputMethod();
                answer = 'a';
            }
            case 6 -> {
                question = """
                        6. Question: Which famous Christmas carol talks about the gifts received during the twelve days of Christmas?

                                Answer: The Twelve Days Of Christmas.""";
                // char answer = go.inputMethod();
                answer = 'c';
            }
            case 7 -> {
                question = """
                        7. Question: What do the Twelve Days of Christmas signify?

                        Answer: The duration between the birth of Jesus and the day the three wise men visited baby Jesus.""";
                // char answer = go.inputMethod();
                answer = 'b';
            }
            case 8 -> {
                question = """
                        8. Question: Who wrote the popular Christmas song 'Frosty The Snowman'?

                        Answer: A. Walter Rollins and Steve Nelson.""";
                answer = 'a';

            }
            case 9 -> {
                question = """
                        9. Question: Who sang the song 'Frosty The Snowman'?
                            
                        Answer: Gene Autry and Cass County Boys.""";
                answer = 'a';

            }
            case 10 -> {
                question = """
                        10. Question: Name the highest-grossing Christmas movie of all time.
                                                
                        Answer: 'Home Alone' (1990).""";
                answer = 'a';

            }
            case 11 -> {
                question = """
                        11. Question: Which famous poem popularized Santa?
                                                
                        Answer: 'Twas the Night Before Christmas'.""";
                answer = 'a';

            }
            case 12 -> {
                question = """
                        12. Question: Which ornament is present on the tip of elves' shoes?
                                                
                        Answer: Bells.""";
                answer = 'a';

            }
            case 13 -> {
                question = """
                        13. Question: Which country started the tradition of decorating the Christmas trees?
                                                
                        Answer: Germany.""";
                answer = 'a';

            }

            case 14 -> {
                question = """
                        14. Question: What is the duration between Christmas and Epiphany?
                                                
                               Answer: 12 days.""";
                answer = 'a';

            }
            case 15 -> {
                question = """
                        15. Question: What is placed at the top of the Christmas tree?
                                                
                        Answer: Angel.""";
                answer = 'a';

            }
            case 16 -> {
                question = """
                        16. Question: Which country sends a huge Christmas tree to London, every year?
                                                
                                Answer: Norway.""";
                answer = 'a';

            }
            case 17 -> {
                question = """
                        17. Question: When is Christmas celebrated in Russia?
                                                
                        Answer: 7 January.""";
                answer = 'a';

            }
            case 18 -> {
                question = """
                        18. Question: Which famous scientist was born on 25 December?
                                                
                               Answer: Sir Isaac Newton.""";
                answer = 'a';

            }
            case 19 -> {
                question = """
                        19. Question: When is midnight mass celebrated?
                                                
                             Answer: At midnight on Christmas Eve.""";
                answer = 'a';

            }
            case 20 -> {
                question = """
                        20. Question: Which country celebrates its Independence day on Christmas Eve every year?
                                                
                                Answer: Libya.""";
                answer = 'a';

            }

        }
        display(question);
        char choice = inputMethod();

//        if(choice == answer){
//            //(answer);
//           count++;
//
//        }
        char[] allAnswers = new char[5];
        int choices = 0;
        for(choices = 0; choices < allAnswers.length; choices++){
            allAnswers[choices] = choice;

        }
      display(count);



        for(choices = 0; choices < allAnswers.length; choices++){
            display(allAnswers[choices]);
        }


//       arrayForAnswers(choice);
       // setResultsMethod(totalCorrectAnswers);

    }


    private char inputMethod() {
        Scanner scanner = new Scanner(System.in);
       char input = scanner.next().charAt(0);
        return input;
    }

    private void display(String choice) {
        System.out.println(choice);
    }

    private void display(char choice) {
        System.out.println(choice);
    }

    private void display(int choice) {
        System.out.println(choice);
    }

//    private void userCorrectAnswers(char answer){
//        ArrayList<Character> result = new ArrayList<>();
//        result.add(answer);
//        allCorrectAnswers = result;
//    }
//
//    private void arrayForAnswers(char choice){
//        //char[] allAnswers = new char[5];
//        int choices = 0;
//        for(choices = 0; choices < allAnswers.length; choices++){
//            allAnswers[choices] = choice;
//            //allAnswers = allAnswers;
//        }
//    }

    private int setResultsMethod(){
        int totalScore = 0;
        totalScore++;
        return totalScore;

//        int choices;
//        for(choices = 0; choices < this.allAnswers.length; choices++){
//            display(allAnswers[choices]);
//        }
//            for(choices = 0; choices < this.allCorrectAnswers.size(); choices++){
//            display(allCorrectAnswers.get(choices));
//        }
    }
//    private int getResultMethod(){
//
//        return totalCorrectAnswers;
//    }
}










//        21. Question: Is it true that Santa Claus has to travel 822 homes per second, to deliver presents on the night before Christmas? Yes or no?
//
//        Answer: Yes!
//
//        22. Question: Why is it necessary to water the Christmas tree?
//
//        Answer: Because each year, hundreds of fires are caused due to dry Christmas trees causing loss to life and property.
//
//        23. Question: How many packages are shipped every year?
//
//        Answer: 850 million.
//
//        24. Question: What is the scariest part of Christmas?
//
//        Answer: Krampus looking for misbehaving children.