package com.brave.blank.erm.Homeclass;

/**
 * Created by jeonyongjin on 2016. 7. 30..
 */
public class HomeclassList {
    private String date;
    private String section;
    private String confirmsubmit;

    public void setDate(String date){
        this.date = date;
    }
    public void setSection(int index){
        if(index == 0){
            this.section = "받아쓰기";
        }
        else if(index == 1){
            this.section = "말해보기";
        }
    }
    public void setButtonText(boolean flag){
        if(flag){
            this.confirmsubmit = "미제출";
        }
        else if(!flag){
            this.confirmsubmit = "제출완료";
        }
    }
    public String getDate(){
        return this.date;
    }
    public String getsection(){
        return this.section;
    }
    public String getConfirmsubmit(){
        return this.confirmsubmit;
    }
}
