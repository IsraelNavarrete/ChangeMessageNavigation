package com.example.changemessageFragment.ul;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.changemessageFragment.R;
import com.example.changemessageFragment.model.Message;


public class ViewMessageFragment extends Fragment {

    public static final String TAG = "ViewMessageFragment";
    private TextView tvMessage;


    public ViewMessageFragment() {
        // Required empty public constructor
    }

    public static ViewMessageFragment newInstance(Bundle bundle) {
        ViewMessageFragment v = new ViewMessageFragment();
        if (bundle!=null)
        {
            v.setArguments(bundle);
        }
        return v;
    }


    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.i(TAG, "ViewMessageFragment: onAttach()");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "ViewMessageFragment: onCreate()");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_view_message, container, false);
        //Error null pointer hay que coger el id del view no de la activity
        tvMessage = view.findViewById(R.id.tvMessage);
        Bundle bundle = getArguments();
        //tenemos que comprobar si el objeto tiene valores
        if (bundle != null)
        {
            //Actualizamos el texto y el tamaño
            Message message = (Message)bundle.getSerializable("message");
            tvMessage.setText(message.getMessage());
            tvMessage.setTextSize(message.getSize());
        }
        Log.i(TAG, "ViewMessageFragment: onCreateView()");
        return view;
    }


    //region Metodos ciclo de vida
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.i(TAG, "ViewMessageFragment: onViewCreated()");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i(TAG, "ViewMessageFragment: onStart()");


    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG, "ViewMessageFragment: onResume()");

    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG, "ViewMessageFragment: onPause()");

    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i(TAG, "ViewMessageFragment: onStop()");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "ViewMessageFragment: onDestroy()");

    }
//endregion

}