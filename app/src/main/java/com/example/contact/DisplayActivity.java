package com.example.contact;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {
    ImageView imageView;
    TextView number;
    public static final String EXTRA_NAME = "extra_name";
//    EXTRA_NAME[] = {"+62 852 1520 0532", "12312312", "123123123", "21312312", "123123123","123123123","1231231231",
//    "2312312312", "123123123"}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        imageView = findViewById(R.id.display);
        number = findViewById(R.id.number);


        imageView.setImageResource(getIntent().getIntExtra("image_id", 00));
        number.setText(getIntent().getStringExtra("name_id"));

    }
}
