package com.example.chanung.mysamplefragment.StoredExercise;

/**
 * Created by jeonyongjin on 2016. 8. 1..
 */
public class StoredExerciseList {
    private String section;
    private String date;
    private String exercise_sentence;
    private String Section[] = {"자음/모음 말하기","문장 말하기", "단어 말하기", "받침 말하기"};

    public void setSection(int section_number) {
//        switch(section_number){
//            case '0':
//                this.section = Section[0];
//            case '1':
//                this.section = Section[1];
//            case '2':
//                this.section = Section[2];
//            case '3':
//                this.section = Section[3];
//        }
        if(section_number == 0){
            this.section = Section[0];
        }
        else if(section_number == 1){
            this.section = Section[1];
        }
        else if(section_number == 2){
            this.section = Section[2];
        }
        else if(section_number == 3){
            this.section = Section[3];
        }
    }
    public void setDate(long date) {
        this.date = String.valueOf(date);
    }
    public void setExercise_sentence(String exercise_sentence) {
        this.exercise_sentence = exercise_sentence;
    }
    public String getSection() {
        return section;
    }
    public String getDate() {
        return date;
    }
    public String getExercise_sentence() {
        return exercise_sentence;
    }
}
