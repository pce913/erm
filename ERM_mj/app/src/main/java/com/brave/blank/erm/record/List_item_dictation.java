package com.brave.blank.erm.record;

/**
 * Created by IT on 2016-07-26.
 */
public class List_item_dictation {
    String dictation_date, teacher_id, dictation_answer, dictation_answer_rate, dictation_playnum;

    public String getDictation_date() {return dictation_date;}

    public String getTeacher_id() {return teacher_id;}

    public String getDictation_answer() {return dictation_answer;}

    public String getDictation_answer_rate() {return dictation_answer_rate;}

    public String getDictation_playnum() {return dictation_playnum;}

    List_item_dictation(String  dictation_date, String teacher_id, String dictation_answer, String dictation_answer_rate, String dictation_playnum) {
        this.dictation_date = dictation_date;
        this.teacher_id = teacher_id;
        this.dictation_answer = dictation_answer;
        this.dictation_answer_rate = dictation_answer_rate;
        this.dictation_playnum = dictation_playnum;
    }
}
