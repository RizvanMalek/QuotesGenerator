package com.quotes.randomquotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ViewActivity extends AppCompatActivity {

    TextView tv;
    Button btn;
    public String  QUOTES[] = {
            "\"Be yourself; everyone else is already taken.\" ― Oscar Wilde",
            "\"A room without books is like a body without a soul.\" ― Marcus Tullius Cicero",
            "\"Be the change that you wish to see in the world.\" ― Mahatma Gandhi",
            "\"If you tell the truth, you don't have to remember anything.\" ― Mark Twain",
            "\"If you want to know what a man's like, take a good look at how he treats his inferiors, not his equals.\" ― J.K. Rowling",
            "\"To live is the rarest thing in the world. Most people exist, that is all. \"― Oscar Wilde",
            "\"Without music, life would be a mistake.\" ― Friedrich Nietzsche",
            "\"Always forgive your enemies, nothing annoys them so much.\" ― Oscar Wilde",
            "\"Life isn't about getting and having, it's about giving and being.\" –Kevin Kruse",
            "\"Whatever the mind of man can conceive and believe, it can achieve.\" –Napoleon Hill",
            "\"Strive not to be a success, but rather to be of value.\" –Albert Einstein",
    };
    int num = (int) (Math.random()*10)%10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        tv = findViewById(R.id.tv);
        btn = findViewById(R.id.btnGen);

        tv.setText(QUOTES[num]);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = (int) (Math.random()*10)%10;
                tv.setText(QUOTES[num]);
            }
        });
    }

}