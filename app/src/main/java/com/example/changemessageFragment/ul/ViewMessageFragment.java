package com.example.changemessageFragment.ul;

import android.os.Bundle;

import androidx.fragment.app.Fragment;


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
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_view_message, container, false);
        tvMessage = getActivity().findViewById(R.id.tvMessage);
        Bundle bundle = getArguments();
        //tenemos que comprobar si el objeto tiene valores
        if (bundle != null)
        {
            //Actualizamos el texto y el tamaño
            Message message = (Message)bundle.getSerializable("message");
            tvMessage.setText(message.getMessage());
            tvMessage.setTextSize(message.getSize());
        }
        return view;
    }
}