package com.example.mainsearchteacher;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;




public class TeacherSchedule extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

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

    @BindView(R.id.editText)
    public EditText editText;

    LayoutInflater inflater;
    ViewGroup container;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public TeacherSchedule() {
        // Required empty public constructor
    }


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
        this.inflater=inflater;
        this.container=container;
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_teacher_schedule, container, false);
//        v.findViewById(R.id.textView);
        ButterKnife.bind(this, v);
        return v;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

    @OnClick(R.id.button)
    public void findteacher(){
        String text=editText.getText().toString();

        Schedule ivt_1_1=ScheduleManager.getInstance(getActivity()).getSchedules().get(getActivity().getResources().getStringArray(R.array.groups_name)[0]);

        ArrayList<Admin.FindResultObject> matches=ScheduleManager.getClasseswithTeacher(ivt_1_1,text);


        for(int i=0 ; i<matches.size(); i++){
            View child = inflater.inflate(R.layout.para_item, container, false);

            TextView num = child.findViewById(R.id.textView2);
            TextView value = child.findViewById(R.id.textView3);
            num.setText(""+matches.get(i).getNumber_para());
            value.setText(""+matches.get(i).getDesription());

            if(matches.get(i).getNumber_day()==1){
                mondayParas.addView(child);
            }
            else if(matches.get(i).getNumber_day()==2){
                tuesdayParas.addView(child);
            }
            else if(matches.get(i).getNumber_day()==3){
                wednesdayParas.addView(child);
            }
            else if(matches.get(i).getNumber_day()==4){
                thursdayParas.addView(child);
            }
            else if(matches.get(i).getNumber_day()==5){
                fridayParas.addView(child);
            }



        }

    }

}
