package com.example.mainsearchteacher;

import java.util.HashMap;

public class Schedule {

    private HashMap<Integer, String> monday;
    private HashMap<Integer, String> tuesday;
    private HashMap<Integer, String> wednesday;
    private HashMap<Integer, String> thursday;
    private HashMap<Integer, String> friday;
    private HashMap<Integer, String> teacherlist;


    public Schedule(){
        monday = new HashMap<>();
        tuesday = new HashMap<>();
        wednesday = new HashMap<>();
        thursday = new HashMap<>();
        friday = new HashMap<>();
        teacherlist=new HashMap<>();

    }

    public void setMonday(HashMap<Integer, String> data){
        this.monday = data;
    }
    public HashMap<Integer, String> getMonday(){
        return monday;
    }

    public  void setTuesday(HashMap<Integer, String> data){ this.tuesday =data ;}
    public HashMap<Integer, String> getTuesday(){ return tuesday; }

    public  void setWednesday(HashMap<Integer, String> data){ this.wednesday =data ;}
    public HashMap<Integer, String> getWednesday(){ return wednesday; }

    public  void setThursday(HashMap<Integer, String> data){ this.thursday =data ;}
    public HashMap<Integer, String> getThursday(){ return thursday; }

    public  void setFriday(HashMap<Integer, String> data){ this. friday =data ;}
    public HashMap<Integer, String> getFriday(){ return  friday; }

    public  void setTeacherlist(HashMap<Integer, String> data){ this. teacherlist =data ;}
    public HashMap<Integer, String> getTeacherlist(){ return  teacherlist; }


//    public static Schedule readFromFile(String path){
//
//        File file = new File(path);
//
//        try {
//            FileInputStream stream = new FileInputStream(file);
//
////            String line = "Котенко 419"///////
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        return null;
//    }

}
