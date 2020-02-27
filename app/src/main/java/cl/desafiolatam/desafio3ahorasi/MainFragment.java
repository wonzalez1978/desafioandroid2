package cl.desafiolatam.desafio3ahorasi;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {
String question2;
    public MainFragment newInstance(String question) {
        MainFragment fragment = new MainFragment();
        Bundle arguments = new Bundle();
        arguments.putString("QUESTION", question);
        Log.d("MainActivity", "newInstance: " + question);
        fragment.setArguments(arguments);
        return fragment;


        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        question2 = getArguments().getString("QUESTION");
        Log.d("MainFragment", "onCreateView: " + question2);

        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView pregunta = view.findViewById(R.id.textView2);
        pregunta.setText(question2);
    }
}
