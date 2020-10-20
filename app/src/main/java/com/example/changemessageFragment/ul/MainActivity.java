package com.example.changemessageFragment.ul;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;

import androidx.appcompat.app.AppCompatActivity;

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
 * @see ViewMessageActivity#onCreate(Bundle)
 */

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "SendMessageActivity";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Log.i(TAG, "SendMessageActivity: onCreate()");


    }

    /**
     * Método que se ejecuta cuando se pulsa el boton btAbout
     * Se ha implementado mediante el atributo android:onclick en
     * activity sendmessage.
     * @param view botón donde de ha realizado click
     */

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
//endregion de

}