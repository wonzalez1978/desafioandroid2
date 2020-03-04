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

import java.util.List;

import cl.desafiolatam.desafio3ahorasi.models.Question;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {
String question2;
List<Question> questions;
   /*public MainFragment newInstance(String question) {

        MainFragment fragment = new MainFragment();
        Bundle arguments = new Bundle();
        arguments.putString("QUESTION", question);
        Log.d("MainActivity", "newInstance: " + question);
        fragment.setArguments(arguments);
        return fragment;
        // Required empty public constructor
    }*/

    public MainFragment(List<Question> questions) {
        this.questions = questions;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView pregunta = view.findViewById(R.id.textView2);
        pregunta.setText(questions.get(0).getQuestion());
    }
}
