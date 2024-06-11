package org.design.designpattern.creational.builder;

import lombok.Builder;

public class UserExam {

    private int hindiMarks;
    private int EnglishMarks;
    private int mathMarks;

    // constructor has to be private,
    // because we don't want to create object of this class since its immutable.
    private UserExam() {
    }

    public int getHindiMarks() {
        return hindiMarks;
    }

    public int getEnglishMarks() {
        return EnglishMarks;
    }

    public int getMathMarks() {
        return mathMarks;
    }


    public static class Builder{
        private int hindiMarks;
        private int EnglishMarks;
        private int mathMarks;

        public Builder setHindiMarks(int marks){
            this.hindiMarks = marks;
            return this;
        }

        public Builder setEnglishMarks(int marks){
            this.EnglishMarks = marks;
            return this;
        }

        public Builder setMathMarks(int marks){
            this.mathMarks = marks;
            return this;
        }

        public UserExam build(){
            if(hindiMarks < 0 || EnglishMarks < 0 || mathMarks < 0){
                throw new IllegalArgumentException("Invalid marks");
            }
            UserExam exam = new UserExam();
            exam.hindiMarks = this.hindiMarks;
            exam.EnglishMarks = this.EnglishMarks;
            exam.mathMarks = this.mathMarks;
            return exam;

        }

    }
}
