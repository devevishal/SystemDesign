package org.design.designpattern.builder;

public class TestBuilder {

    public static void main(String[] args) {

        UserExam userExam = null;
        try {
            userExam = new UserExam.Builder()
                    .setEnglishMarks(50)
                    .setHindiMarks(-1)
                    .setMathMarks(70)
                    .build();
        }catch (Exception e){
            System.out.println("Some error while creating objects "+e.getMessage());
        }


        System.out.println(userExam.getEnglishMarks());
        System.out.println(userExam.getHindiMarks());
        System.out.println(userExam.getMathMarks());
    }
}
