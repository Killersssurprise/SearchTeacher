package com.example.mainsearchteacher;

import android.app.Activity;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;

public class ScheduleManager {
    public static ScheduleManager instance;
    private Activity activity;
    private HashMap<String, Schedule> schedules;

    private ScheduleManager(Activity a){
        schedules = new HashMap<>();
        this.activity = a;

        loadDataFromFile();
        //инициализация ВСЕХ расписаний всех групп
        Schedule ivt_1_1 = new Schedule();
        HashMap<Integer, String> monday = new HashMap<>();
        monday.put(1, "Русский язык, доц. Казанцева И. Г., ауд. №264");
        monday.put(2, "Математика, ст. преп. Лозовая Л.В, ауд. №264");
        monday.put(3,"Прикладная физическая культура");
        monday.put(4,"Математика, ст. преп. Лозовая Л.В., ауд. №217");
        ivt_1_1.setMonday(monday);
        HashMap<Integer, String> tuesday = new HashMap<>();
        tuesday.put(1, "Основы программирования, ст. преп. Маруга М.М., ауд.№419");
        tuesday.put(2, "Математика, ст. преп. Лозовая Л.В, ауд. №264");
        tuesday.put(3,"Информатика, ст. преп. Мартыненко А.М., ауд.№209");
        tuesday.put(4,"Дискретная математика, доц. Володин Н.А., ауд.№408");
        tuesday.put(5,"Иностранный язык, доц.Муромская Е.С., ауд.№264");
        ivt_1_1.setTuesday(tuesday);
        HashMap<Integer, String>  wednesday = new HashMap<>();
        wednesday.put(1, "Основы программирования, доц. Шарий Т.В., ауд.№301");
        wednesday.put(2, "Физика, ст. пр. Шерстюк Ю.В., ауд.№227");
        wednesday.put(3, "Физика, доц. Коломенская В.В., ауд. №322");
        wednesday.put(4, "Иностранный язык, доц. Муромская Е.С., ауд. №421");
        ivt_1_1.setWednesday(wednesday);
        HashMap<Integer, String>   thursday = new HashMap<>();
        thursday.put(1, "Психология, доц. Лох К.В., ауд.№264");
        thursday.put(2, "Математика, ст. пр. Лозовая Л.В., ауд.№105");
        thursday.put(3, "Информатика, ст. пр. Мартыненко А.М.  ауд.№ 301");
        thursday.put(4, "Психология, Король Н.В., ауд.№421");
        ivt_1_1.setThursday(thursday);
        HashMap<Integer, String>  friday = new HashMap<>();
        friday.put(1,"Окно");
        friday.put(2, "Окно");
        friday.put(3, "Окно");
        friday.put(4,"Дискретная математика, ст.пр. Маруга М.М., ауд.№408");
        friday.put(5,"Русский язык, доц. Суслова И.А., ауд.№408 (межфак)");
        ivt_1_1.setFriday(friday);



        schedules.put(a.getResources().getStringArray(R.array.groups_name)[0], ivt_1_1);
//        schedules.put(a.getResources().getStringArray(R.array.groups_name)[1], ivt_1_1);

        Schedule teacher_list = new Schedule();
        HashMap<Integer, String>  teachers = new HashMap<>();
        teachers.put(1,"Бодряга В.Е.");
        teachers.put(2,"Бодряга В.В.");
        teachers.put(3,"Бондаренко В.В.");
        teachers.put(4,"Бондаренко В.И.");
        teachers.put(5,"Гукай А.Е");
        teachers.put(6,"Ермоленко Т.В.");
        teachers.put(7,"Кожемякин Ю.А.");
        teachers.put(8,"Толстых В.К. ");
        teachers.put(9,"Котнеко Ю.В.");
        teachers.put(10,"Котенко В.Н.");
        teachers.put(11,"Котова О.В.");
        teachers.put(12,"Лихолетов А.В.");
        teachers.put(13,"Ломонос Г.Т.");
        teachers.put(14,"Мартыненко А.М.");
        teachers.put(15,"Маруга М.М.");
        teachers.put(16,"Шарий Т.В.");
        teacher_list.setTeacherlist(teachers);

    }

    public static ArrayList<Admin.FindResultObject> getClasseswithTeacher(Schedule schedule, String teacher){


        ArrayList<Admin.FindResultObject> output=new ArrayList<>();

        HashMap<Integer, String> monday=schedule.getMonday();
        HashMap<Integer, String> tuesday=schedule.getTuesday();
        HashMap<Integer, String> wednesday=schedule.getWednesday();
        HashMap<Integer, String> thursday=schedule.getThursday();
        HashMap<Integer, String> friday=schedule.getFriday();
        for(Integer p:monday.keySet()){
            if(monday.get(p).toLowerCase().contains(teacher.toLowerCase())){
                output.add(new Admin.FindResultObject(1,p,monday.get(p)));
            }}
           for(Integer r:tuesday.keySet()){
               if(tuesday.get(r).toLowerCase().contains(teacher.toLowerCase())){
                   output.add(new Admin.FindResultObject(2,r,tuesday.get(r)));
           }}
        for(Integer b:wednesday.keySet()){
            if(wednesday.get(b).toLowerCase().contains(teacher.toLowerCase())){
                output.add(new Admin.FindResultObject(3,b,wednesday.get(b)));
            }}
        for(Integer c:thursday.keySet()){
            if(thursday.get(c).toLowerCase().contains(teacher.toLowerCase())){
                output.add(new Admin.FindResultObject(4,c,thursday.get(c)));
            }}
        for(Integer z: friday.keySet()){
            if( friday.get(z).toLowerCase().contains(teacher.toLowerCase())){
                output.add(new Admin.FindResultObject(5,z, friday.get(z)));
            }}

        return output;
    }
    public static ScheduleManager getInstance(Activity a){
        if(instance == null)
            instance = new ScheduleManager(a);
        return instance;
    }


    public void saveDataToFile(){
        //записываем в файл
    }

    public HashMap<String, Schedule> getSchedules(){
        return this.schedules;
    }

    public void loadDataFromFile(){
        //считываем данные из файла в instance
    }


}
