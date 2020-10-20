package com.example.changemessageFragment.ul;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.changemessageFragment.R;
import com.example.changemessageFragment.model.Message;
import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;


public class ViewMessageActivity extends AppCompatActivity {

    /**
    Este método crea la activity y es un método callback
    */

    private static final String TAG = "ViewMessageActivity";
    private TextView tvMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Se inicializa la interfaz
        setContentView(R.layout.activity_view_message);
        tvMessage = findViewById(R.id.tvMessage);
        //TODO Inicializar los widget
        Logger.addLogAdapter(new AndroidLogAdapter());
        Logger.i(TAG, "ViewMessageActivity: onCreate()");

        //1. Recoger el Intent
        Intent intent = getIntent();
        //2. Recoger objeto Bundle
        Bundle bundle = intent.getExtras();
        Message message = (Message)bundle.getSerializable("message");

        //3. Actualizar la vista
        tvMessage.setText(message.getMessage());
        tvMessage.setTextSize(message.getSize());


    }

        @Override
        protected void onStart() {
            super.onStart();
            Logger.i(TAG,"ViewMessageActivity: onStart()");


        }

        @Override
        protected void onResume() {
            super.onResume();
            Logger.i(TAG,"ViewMessageActivity: onResume()");

        }

        @Override
        protected void onPause() {
            super.onPause();
            Logger.i(TAG,"ViewMessageActivity: onPause()");

        }

        @Override
        protected void onStop() {
            super.onStop();
            Logger.i(TAG,"ViewMessageActivity: onStop()");

        }

        @Override
        protected void onDestroy() {
            super.onDestroy();
            Logger.i(TAG,"ViewMessageActivity: onDestroy()");

        }


}