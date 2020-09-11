package com.christ.anshuo;

public class Testone {
    public String getNumber(String str){
        String num="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
                num+=str.charAt(i);
            }
        }
        return num;
    }
    public String getNumber1(String str){
        return str.replaceAll("\\D","");
    }

    public static void main(String[] args) {
        Testone testone=new Testone();
        String str="Stock3num00Amar38sf0";
        //System.out.println(testone.getNumber(str));
        System.out.println(testone.getNumber1(str));
    }
}
