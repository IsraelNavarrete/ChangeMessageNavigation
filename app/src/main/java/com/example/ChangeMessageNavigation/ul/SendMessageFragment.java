package com.example.ChangeMessageNavigation.ul;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Toast;

import com.example.ChangeMessageNavigation.ChangeMessageApplication;
import com.example.ChangeMessageNavigation.R;
import com.example.ChangeMessageNavigation.model.Message;

import java.util.Random;


public class SendMessageFragment extends Fragment {

    public static final String TAG = "SendMessageFragment";
    private Button btSendMessage;
    private EditText edMessage;
    private SeekBar skSize;
    private ShowMessageListener callback;
    private Button btAbout;
    //Atributo de instancia que no pertenece al diseño
    private int number;

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
        Log.i(TAG, "SendMessageFragment: onAttach()");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "SendMessageFragment: onCreate()");
        setRetainInstance(true);
        number = new Random().nextInt(101);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.i(TAG, "SendMessageFragment: onCreateView()");
        return inflater.inflate(R.layout.fragment_send_message, container, false);

    }

    @Override
    public void onViewCreated(@NonNull final View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //Buscamos por ID
        btSendMessage = view.findViewById(R.id.btSendMessage);
        edMessage = view.findViewById(R.id.edMessage);
        skSize = view.findViewById(R.id.skSize);
        btAbout=view.findViewById(R.id.btAbout);

        Toast.makeText(getActivity(), "numero generado:"+number,Toast.LENGTH_SHORT).show();
        btSendMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               // Bundle bundle = new Bundle();
                //1.1 Crear un objeto message
                //Message message = new Message(((ChangeMessageApplication)getActivity().getApplication()).getUser(),
                //        edMessage.getText().toString(),"16/10/2020",skSize.getProgress());
                //bundle.putSerializable("message",message);

                //Ejemplo 1
                Message message = new Message(((ChangeMessageApplication)getActivity().getApplication()).getUser(),
                                                edMessage.getText().toString(),"16/10/2020",skSize.getProgress());
                //Creamos un objeto de la accion en el cual guardamos el mensaje directamente
                SendMessageFragmentDirections.ActionSendMessageFragmentToViewMessageFragment action =
                        SendMessageFragmentDirections.actionSendMessageFragmentToViewMessageFragment(message);

                //Esta linea va desde SendMessage hasta viewMessage y le pasamos la accion
                NavHostFragment.findNavController(SendMessageFragment.this).navigate(action);
            }
        });

        btAbout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                showAbout();
            }
        });

        Log.i(TAG, "SendMessageFragment: onViewCreated()");
    }

    /**
     * Metodo que se ejecuta con el boton btAbout y enseña informacion de la aplicacion
     */
    public void showAbout(){
        NavHostFragment.findNavController(this).navigate(R.id.action_sendMessageFragment_to_aboutActivity);
    }

    //region Método ciclo de vida
    @Override
    public void onStart() {
        super.onStart();
        Log.i(TAG, "SendMessageFragment: onStart()");


    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG, "SendMessageFragment: onResume()");

    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG, "SendMessageFragment: onPause()");

    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG, "SendMessageFragment: onSaveInstanceState()");

    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        Log.i(TAG, "SendMessageFragment: onViewStateRestored()");

    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i(TAG, "SendMessageFragment: onStop()");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "SendMessageFragment: onDestroy()");

    }
    //endregion

}