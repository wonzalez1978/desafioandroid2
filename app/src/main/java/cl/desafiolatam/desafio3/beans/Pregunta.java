package cl.desafiolatam.desafio3.beans;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Pregunta {
    @SerializedName("category")
    private String category;
    @SerializedName("type")
    private String type;
    @SerializedName("difficulty")
    private String difficulty;
    @SerializedName("questions")
    private String question;
    @SerializedName("correct_answer")
    private String correct_answer;
    @SerializedName("incorrect_answers")
    private ArrayList<String> incorrect_answers;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getCorrect_answer() {
        return correct_answer;

    }

    public void setCorrect_answer(String correct_answer) {
        this.correct_answer = correct_answer;
    }

    public ArrayList<String> getIncorrect_answers() {
        return incorrect_answers;
    }

    public void setIncorrect_answers(ArrayList<String> incorrect_answers) {
        this.incorrect_answers = incorrect_answers;
    }
}
