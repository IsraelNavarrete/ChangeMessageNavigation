package com.example.changemessageFragment.ul;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;

import com.example.changemessageFragment.ChangeMessageApplication;
import com.example.changemessageFragment.R;
import com.example.changemessageFragment.model.Message;


public class SendMessageFragment extends Fragment {

    public static final String TAG = "SendMessageFragment";
    private Button btSendMessage;
    private EditText edMessage;
    private SeekBar skSize;
    private ShowMessageListener callback;


    /**
     * Interfaz que debe implemetar toda clase que necesite el objeto message
     */
    public interface ShowMessageListener
    {
        void showMessage(Message message);
    }


    public SendMessageFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        //Obligamos a implemetar la interfaz
        try {
            callback = (ShowMessageListener) context;
        }
        catch (ClassCastException e)
        {
            throw  new ClassCastException(getActivity().toString() + "must implement ShowMessageListener");
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_send_message, container, false);
        btSendMessage = view.findViewById(R.id.btSendMessage);
        edMessage = view.findViewById(R.id.edMessage);
        skSize = view.findViewById(R.id.skSize);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        btSendMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //1.1 Crear un objeto message
                Message message = new Message(((ChangeMessageApplication)getActivity().getApplication()).getUser(),
                        edMessage.getText().toString(),"16/10/2020",skSize.getProgress());
                callback.showMessage(message);
            }
        });


    }
    public void showAbout(View view){
        Intent intent = new Intent(getActivity(), AboutActivity.class);
        startActivity(intent);
    }
}