package com.christ.anshuo.test2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyIdNumber implements IdNumber{
    private String idNum;
    public void setIdNum(String id){
        this.idNum = id;
    }
    public MyIdNumber(){

    }
    public MyIdNumber(String id){
        this.idNum = id;
    }
    @Override
    public boolean isValid() {
        return idNum.length()==18;
    }

    @Override
    public Date getBornDate() {
        String dateStr=idNum.substring(6,14);
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyMMdd");
        try{
            return simpleDateFormat.parse(dateStr);
        }catch (ParseException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public String getGender() {
        char ch=idNum.charAt(idNum.length()-2);
        return ch%2==0?"女":"男";
    }
    public static void main(String[] args){
        MyIdNumber myIdNumber = new MyIdNumber("360732199612076113");
        System.out.println(myIdNumber.isValid());
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(simpleDateFormat.format(myIdNumber.getBornDate()));
        System.out.println(myIdNumber.getGender());
    }
}
