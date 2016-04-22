package com.app.quiz.quizz;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
/**
 * Created by jasser on 15-Apr-16.
 */
public class Options extends Activity {
    Button btnhard,btnintermediate,btnsimple,btntime,btnuntime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.optionsmenu);
        btnhard = (Button) findViewById(R.id.btnhard);
        btnsimple = (Button) findViewById(R.id.btnsimple);
        btnintermediate = (Button) findViewById(R.id.btnintermediate);
        btntime = (Button) findViewById(R.id.btntime);
        btnuntime = (Button) findViewById(R.id.btnuntime);
        btntime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Options.this,
                        QuestionActivity.class);
                startActivity(intent);
                finish();
            }
        });
        btnuntime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Options.this,
                        QuestionActivity1.class);
                startActivity(intent);
                finish();
            }
        });
        btnhard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Options.this,
                        QuestionActivity.class);
                startActivity(intent);
                finish();
            }
        });
        btnsimple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        btnintermediate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}