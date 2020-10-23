package com.example.ChangeMessageNavigation.ul;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.ChangeMessageNavigation.R;
import com.example.ChangeMessageNavigation.model.Message;

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

public class MainActivity extends AppCompatActivity  {

    private static final String TAG = "SendMessageActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "SendMessageActivity: onCreate()");
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

    //Callback donde se debe guardar el estado dinámico de la actividad
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG, "SendMessageActivity: onSaveInstanceState()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "SendMessageActivity: onPause()");

    }

    //Callback donde se restaura el estado dinámico de la actividad
    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG, "SendMessageActivity: onRestoreInstanceState()");
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