package com.brave.blank.erm.record;

/**
 * Created by IT on 2016-07-26.
 */
public class List_item_speaking {
    String speaking_date, teacher_id, speaking_question, speaking_success_num, speaking_try_num;

    public String getSpeaking_date() {return speaking_date;}

    public String getTeacher_id() {return teacher_id;}

    public String getSpeaking_question() {return speaking_question;}

    public String getSpeaking_success_num() {return speaking_success_num;}

    public String getSpeaking_try_num() {return speaking_try_num;}

    List_item_speaking(String speaking_date, String teacher_id, String speaking_question, String speaking_success_num, String speaking_try_num) {
        this.speaking_date = speaking_date;
        this.teacher_id = teacher_id;
        this.speaking_question = speaking_question;
        this.speaking_success_num = speaking_success_num;
        this.speaking_try_num = speaking_try_num;
    }
}
