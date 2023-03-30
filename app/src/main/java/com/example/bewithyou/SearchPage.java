package com.example.bewithyou;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SearchView;
import android.widget.TextView;

import java.time.temporal.Temporal;
import java.util.List;

public class SearchPage extends AppCompatActivity implements SearchView.OnQueryTextListener{
    private SearchView searchView;
    private EditText editText;
    private TextView textView;
    private Button button;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_page);

        searchView =findViewById(R.id.search_bar);
        searchView.setOnQueryTextListener(this);

        textView =findViewById(R.id.result);
        editText = findViewById(R.id.search);
        button = findViewById(R.id.buttonSearch);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getData.addToCart("lavander", "43", "2", "lavander", new Callback<String>() {
                    @Override
                    public void onSuccess(String data) {
                        System.out.println(data.toString());
                    }

                    @Override
                    public void onError(String errorMessage) {
                        System.out.println(errorMessage);

                    }
                });
            }
        });
    }

    @Override
    public boolean onQueryTextSubmit(String s) {

        return false;
    }

    @Override
    public boolean onQueryTextChange(String s) {
        return false;
    }
}