package com.example.changemessageFragment.ul;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.changemessageFragment.ChangeMessageApplication;
import com.example.changemessageFragment.R;
import com.example.changemessageFragment.model.Message;

/**
 * <h1>Función de la clase</h1>
 * <p>Esta clase envia un texto a otra actividad y le indica el tamaño del texto.</p>
 * <h2>Aprendizaje</h2>
 * <ul>
 *     <li>Qué es un Contexto</li>
 *     <li>Qué se pueden introducir etiquetas HTML dentro de los comentario Javadod</li>
 *     <li>Qué es un objeto {@link android.os.Bundle} </li>
 *     <li>El paso de mensaje de dos Activity mediante la clase <a target="_blank" href="https://developer.android.com/reference/android/content/Intent">Intent</a></li>
 * </ul>
 *
 * @author Israel Navarrete
 * @version 1.0
 * @see MainActivity#onCreate(Bundle)
 */

public class MainActivity extends AppCompatActivity implements SendMessageFragment.ShowMessageListener {

    private static final String TAG = "SendMessageActivity";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Log.i(TAG, "SendMessageActivity: onCreate()");

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        //Creamos un fragment de la clase SendMessage
        SendMessageFragment fragment = new SendMessageFragment();

        ft.add(R.id.content, fragment,SendMessageFragment.TAG);
        //Hacemos el commit para que se guarde completamente
        ft.commit();
    }



    //region Ciclo de vida de la Activity
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "SendMessageActivity: onStart()");


    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "SendMessageActivity: onResume()");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "SendMessageActivity: onPause()");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "SendMessageActivity: onStop()");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "SendMessageActivity: onDestroy()");

    }

    /**
     * Método de la interfaz SendMessageFragment.ShowMessage
     * @param message
     */
    @Override
    public void showMessage(Message message) {
        Toast.makeText(this,"Mensaje"+message.toString(),Toast.LENGTH_LONG).show();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        //Creamos un fragment de la clase SendMessage
        //ViewMessageFragment fragment = new ViewMessageFragment();



        Bundle bundle = new Bundle();
        bundle.putSerializable("message",message);

        //Se utiliza el método estático de inicializacion de la clase fragment
        ViewMessageFragment fragment = ViewMessageFragment.newInstance(bundle);

        fragment.setArguments(bundle);
        ft.replace(R.id.content,fragment,ViewMessageFragment.TAG);
        //Hacemos el commit para que se guarde completamente
        ft.commit();
    }


//endregion de

}