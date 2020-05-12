package com.example.mainsearchteacher;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import java.util.HashMap;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainStudent extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_student);
        ButterKnife.bind(this);

        ScheduleManager.getInstance(this);


    }

    private void openFragment(Fragment fragment) {
        FragmentManager fragmentManager = this.getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.add(R.id.container, fragment);

        fragmentTransaction.addToBackStack("order_confirmation_fragment");

        fragmentTransaction.commit();
    }

    @OnClick(R.id.ivt_1_1_btn)
    public void click_1_1_ivt(){

        String key = getResources().getStringArray(R.array.groups_name)[0];
        Schedule ivt_1_1 = ScheduleManager.getInstance(this).getSchedules().get(key);

        openFragment(new ScheduleFragment(ivt_1_1));
    }

    private void myNewMethod(){
        //TODO stuff
    }

    @OnClick(R.id.ivt_1_2_btn)
    public void click_1_2_ivt(){

        String key = getResources().getStringArray(R.array.groups_name)[0];
        Schedule ivt_1_1 = ScheduleManager.getInstance(this).getSchedules().get(key);

        openFragment(new ScheduleFragment(ivt_1_1));
    }
    @OnClick(R.id.ivt_1_3_btn)
    public void click_1_3_ivt(){

        String key = getResources().getStringArray(R.array.groups_name)[0];
        Schedule ivt_1_1 = ScheduleManager.getInstance(this).getSchedules().get(key);

        openFragment(new ScheduleFragment(ivt_1_1));
    }
    @OnClick(R.id.ivt_1_4_btn)
    public void click_1_4_ivt(){

        String key = getResources().getStringArray(R.array.groups_name)[0];
        Schedule ivt_1_1 = ScheduleManager.getInstance(this).getSchedules().get(key);

        openFragment(new ScheduleFragment(ivt_1_1));
    }
    @OnClick(R.id.ivt_2_1_btn)
    public void click_2_1_ivt(){

        String key = getResources().getStringArray(R.array.groups_name)[0];
        Schedule ivt_1_1 = ScheduleManager.getInstance(this).getSchedules().get(key);

        openFragment(new ScheduleFragment(ivt_1_1));
    }
    @OnClick(R.id.ivt_2_2_btn)
    public void click_2_2_ivt(){

        String key = getResources().getStringArray(R.array.groups_name)[0];
        Schedule ivt_1_1 = ScheduleManager.getInstance(this).getSchedules().get(key);

        openFragment(new ScheduleFragment(ivt_1_1));
    }
    @OnClick(R.id.ivt_2_3_btn)
    public void click_2_3_ivt(){

        String key = getResources().getStringArray(R.array.groups_name)[0];
        Schedule ivt_1_1 = ScheduleManager.getInstance(this).getSchedules().get(key);

        openFragment(new ScheduleFragment(ivt_1_1));
    }
    @OnClick(R.id.ivt_2_4_btn)
    public void click_2_4_ivt(){

        String key = getResources().getStringArray(R.array.groups_name)[0];
        Schedule ivt_1_1 = ScheduleManager.getInstance(this).getSchedules().get(key);

        openFragment(new ScheduleFragment(ivt_1_1));
    }
    @OnClick(R.id.ivt_2_5_btn)
    public void  click_2_5_ivt(){

        String key = getResources().getStringArray(R.array.groups_name)[0];
        Schedule ivt_1_1 = ScheduleManager.getInstance(this).getSchedules().get(key);

        openFragment(new ScheduleFragment(ivt_1_1));
    }
    @OnClick(R.id.ivt_2_6_btn)
    public void click_2_6_ivt(){

        String key = getResources().getStringArray(R.array.groups_name)[0];
        Schedule ivt_1_1 = ScheduleManager.getInstance(this).getSchedules().get(key);

        openFragment(new ScheduleFragment(ivt_1_1));
    }
    @OnClick(R.id.ivt_2_7_btn)
    public void click_2_7_ivt(){

        String key = getResources().getStringArray(R.array.groups_name)[0];
        Schedule ivt_1_1 = ScheduleManager.getInstance(this).getSchedules().get(key);

        openFragment(new ScheduleFragment(ivt_1_1));
    }
    @OnClick(R.id.ivt_3_1_btn)
    public void click_3_1_ivt(){

        String key = getResources().getStringArray(R.array.groups_name)[0];
        Schedule ivt_1_1 = ScheduleManager.getInstance(this).getSchedules().get(key);

        openFragment(new ScheduleFragment(ivt_1_1));
    }
    @OnClick(R.id.ivt_3_2_btn)
    public void click_3_2_ivt(){

        String key = getResources().getStringArray(R.array.groups_name)[0];
        Schedule ivt_1_1 = ScheduleManager.getInstance(this).getSchedules().get(key);

        openFragment(new ScheduleFragment(ivt_1_1));
    }
    @OnClick(R.id.ivt_3_3_btn)
    public void click_3_3_ivt(){

        String key = getResources().getStringArray(R.array.groups_name)[0];
        Schedule ivt_1_1 = ScheduleManager.getInstance(this).getSchedules().get(key);

        openFragment(new ScheduleFragment(ivt_1_1));
    }
    @OnClick(R.id.ivt_3_4_btn)
    public void click_3_4_ivt(){

        String key = getResources().getStringArray(R.array.groups_name)[0];
        Schedule ivt_1_1 = ScheduleManager.getInstance(this).getSchedules().get(key);

        openFragment(new ScheduleFragment(ivt_1_1));
    }
    @OnClick(R.id.ivt_3_5_btn)
    public void click_3_5_ivt(){

        String key = getResources().getStringArray(R.array.groups_name)[0];
        Schedule ivt_1_1 = ScheduleManager.getInstance(this).getSchedules().get(key);

        openFragment(new ScheduleFragment(ivt_1_1));
    }
    @OnClick(R.id.ivt_3_6_btn)
    public void click_3_6_ivt(){

        String key = getResources().getStringArray(R.array.groups_name)[0];
        Schedule ivt_1_1 = ScheduleManager.getInstance(this).getSchedules().get(key);

        openFragment(new ScheduleFragment(ivt_1_1));
    }
    @OnClick(R.id.ivt_4_1_btn)
    public void click_4_1_ivt(){

        String key = getResources().getStringArray(R.array.groups_name)[0];
        Schedule ivt_1_1 = ScheduleManager.getInstance(this).getSchedules().get(key);

        openFragment(new ScheduleFragment(ivt_1_1));
    }
    @OnClick(R.id.ivt_4_2_btn)
    public void click_4_2_ivt(){

        String key = getResources().getStringArray(R.array.groups_name)[0];
        Schedule ivt_1_1 = ScheduleManager.getInstance(this).getSchedules().get(key);

        openFragment(new ScheduleFragment(ivt_1_1));
    }
    @OnClick(R.id.ivt_4_3_btn)
    public void click_4_3_ivt(){

        String key = getResources().getStringArray(R.array.groups_name)[0];
        Schedule ivt_1_1 = ScheduleManager.getInstance(this).getSchedules().get(key);

        openFragment(new ScheduleFragment(ivt_1_1));
    }
    @OnClick(R.id.ivt_4_4_btn)
    public void click_4_4_ivt(){

        String key = getResources().getStringArray(R.array.groups_name)[0];
        Schedule ivt_1_1 = ScheduleManager.getInstance(this).getSchedules().get(key);

        openFragment(new ScheduleFragment(ivt_1_1));
    }
    @OnClick(R.id.ivt_4_5_btn)
    public void click_4_5_ivt(){

        String key = getResources().getStringArray(R.array.groups_name)[0];
        Schedule ivt_1_1 = ScheduleManager.getInstance(this).getSchedules().get(key);

        openFragment(new ScheduleFragment(ivt_1_1));
    }
    @OnClick(R.id.ivt_4_6_btn)
    public void click_4_6_ivt(){

        String key = getResources().getStringArray(R.array.groups_name)[0];
        Schedule ivt_1_1 = ScheduleManager.getInstance(this).getSchedules().get(key);

        openFragment(new ScheduleFragment(ivt_1_1));
    }
    @OnClick(R.id.teacherlist)
    public void goListTeacher(){

        openFragment(new TeacherSchedule());}
}
