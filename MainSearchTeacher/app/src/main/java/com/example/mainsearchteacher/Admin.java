package com.example.mainsearchteacher;

public class Admin implements IPerson {

    String name;
    String role;

    public Admin(){

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getRole() {
        return "Admin";
    }
//    String password="";
//    String login="";

    public static class FindResultObject {
        private int number_day;
        private int number_para;
        private String desription;


        public FindResultObject() {
        }

        public FindResultObject(int number_day, int number_para, String desription) {
            this.number_day = number_day;
            this.number_para = number_para;
            this.desription = desription;
        }

        public int getNumber_day() {
            return number_day;
        }

        public void setNumber_day(int number_day) {
            this.number_day = number_day;
        }

        public int getNumber_para() {
            return number_para;
        }

        public void setNumber_para(int number_para) {
            this.number_para = number_para;
        }

        public String getDesription() {
            return desription;
        }

        public void setDesription(String desription) {
            this.desription = desription;
        }
    }
}
