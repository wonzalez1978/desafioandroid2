package cl.desafiolatam.desafio3ahorasi;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.provider.CallLog;
import android.util.Log;
import android.widget.Toast;

import java.util.List;

import cl.desafiolatam.desafio3ahorasi.api.Api;
import cl.desafiolatam.desafio3ahorasi.api.RetrofitClient;
import cl.desafiolatam.desafio3ahorasi.models.Question;
import cl.desafiolatam.desafio3ahorasi.models.Result;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
String question1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //mostrar fragment en activity
        getSupportFragmentManager().beginTransaction()
                .add(R.id.container, new MainFragment().newInstance(question1))
                .commit();
        Api apiService = RetrofitClient.getInstance().create(Api.class);
        Call<Result>call = apiService.getAllQuestions();
        call.enqueue(new Callback<Result>() {
            @Override
            public void onResponse(Call<Result> call, Response<Result> response) {
                List <Question> questionList = response.body().getResults();
                question1 = questionList.get(0).getQuestion();
                Toast.makeText(MainActivity.this, questionList.get(0).getQuestion(), Toast.LENGTH_SHORT).show();
                Log.d("MainActivity", "onResponse: " + questionList.get(0).getQuestion());
            }

            @Override
            public void onFailure(Call<Result> call, Throwable t) {

            }
        });

    }
}
