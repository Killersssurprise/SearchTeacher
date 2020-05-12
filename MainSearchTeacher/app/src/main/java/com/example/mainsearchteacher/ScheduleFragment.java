package com.example.mainsearchteacher;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import butterknife.BindView;
import butterknife.ButterKnife;


public class ScheduleFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    Schedule s;

    @BindView(R.id.mondayParas)
    public LinearLayout mondayParas;

    @BindView(R.id.tuesdayParas)
    public LinearLayout tuesdayParas;

    @BindView(R.id.wednesdayParas)
    public LinearLayout wednesdayParas;

    @BindView(R.id.thursdayParas)
    public LinearLayout thursdayParas;

    @BindView(R.id.fridayParas)
    public LinearLayout fridayParas;

    public ScheduleFragment(Schedule s) {
        // Required empty public constructor
        this.s = s;
    }


//    // TODO: Rename and change types and number of parameters
//    public static ScheduleFragment newInstance(String param1, String param2) {
//        ScheduleFragment fragment = new ScheduleFragment();
//        Bundle args = new Bundle();
//        args.putString(ARG_PARAM1, param1);
//        args.putString(ARG_PARAM2, param2);
//        fragment.setArguments(args);
//        return fragment;
//    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_schedule, container, false);
//        v.findViewById(R.id.textView);
        ButterKnife.bind(this, v);


        /////////////////////
        Set<Integer> keys  = s.getMonday().keySet();
        TreeSet<Integer> sortedKeys = new TreeSet<>(keys);
        for(Integer i : sortedKeys){

            View child = inflater.inflate(R.layout.para_item, container, false);

            TextView num = child.findViewById(R.id.textView2);
            TextView value = child.findViewById(R.id.textView3);
            num.setText(""+i);
            value.setText(""+s.getMonday().get(i));
            mondayParas.addView(child);

        }

        //////////////
        Set<Integer> keys_tuesday  = s.getTuesday().keySet();
        TreeSet<Integer> sortedKeys_tuesday = new TreeSet<>(keys_tuesday);
        for(Integer i : sortedKeys_tuesday){

            View child = inflater.inflate(R.layout.para_item, container, false);

            TextView num = child.findViewById(R.id.textView2);
            TextView value = child.findViewById(R.id.textView3);
            num.setText(""+i);
            value.setText(""+s.getTuesday().get(i));
            tuesdayParas.addView(child);

        }
        Set<Integer> keys_wednesday  = s.getTuesday().keySet();
        TreeSet<Integer> sortedKeys_wednesday = new TreeSet<>(keys_wednesday);
        for(Integer i : sortedKeys_wednesday){

            View child = inflater.inflate(R.layout.para_item, container, false);

            TextView num = child.findViewById(R.id.textView2);
            TextView value = child.findViewById(R.id.textView3);
            num.setText(""+i);
            value.setText(""+s.getWednesday().get(i));
            wednesdayParas.addView(child);

        }
        Set<Integer> keys_thursday  = s.getTuesday().keySet();
        TreeSet<Integer> sortedKeys_thursday = new TreeSet<>(keys_thursday);
        for(Integer i : sortedKeys_thursday){

            View child = inflater.inflate(R.layout.para_item, container, false);

            TextView num = child.findViewById(R.id.textView2);
            TextView value = child.findViewById(R.id.textView3);
            num.setText(""+i);
            value.setText(""+s.getThursday().get(i));
            thursdayParas.addView(child);

        }
        Set<Integer> keys_friday  = s.getTuesday().keySet();
        TreeSet<Integer> sortedKeys_friday = new TreeSet<>(keys_friday);
        for(Integer i : sortedKeys_friday){

            View child = inflater.inflate(R.layout.para_item, container, false);

            TextView num = child.findViewById(R.id.textView2);
            TextView value = child.findViewById(R.id.textView3);
            num.setText(""+i);
            value.setText(""+s.getFriday().get(i));
            fridayParas.addView(child);

        }
        Set<Integer> keys_teacher_list  = s.getTuesday().keySet();
        TreeSet<Integer> sortedKeys_teacher_list = new TreeSet<>(keys_teacher_list);
        for(Integer i :  sortedKeys_teacher_list){

            View child = inflater.inflate(R.layout.para_item, container, false);

            TextView num = child.findViewById(R.id.textView2);
            TextView value = child.findViewById(R.id.textView3);
            num.setText(""+i);
            value.setText(""+s.getTeacherlist().get(i));
            fridayParas.addView(child);

        }


        return v;
    }
}
