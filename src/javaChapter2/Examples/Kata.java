package javaChapter2.Examples;

public class Kata {
    public static String gradeSystem(int score){

        String grade = "Please enter a valid grade";

        if((score >= 90) && (score <= 100)){
                 grade = "The Student got an A";
            }

        if ((score < 90) && (score >= 80)){
                 grade = "The Student got an B";
        }

        if ((score < 80) && (score >= 70)){
                grade =  "The Student got an C";
            }

        if ((score < 70) && (score >= 60)){
                 grade = "The Student got an D";}

        if ((score < 60) && (score >= 0)){
                 grade = "The Student got an F";
            }

        return grade;
}

}
