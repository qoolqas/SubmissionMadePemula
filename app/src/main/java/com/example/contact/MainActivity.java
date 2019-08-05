package com.example.contact;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    String[] name = {"Alfara", "Ame", "Arif", "Elfando", "Faresa", "Ferry", "Indra", "Pina", "Sisi"};
    String[] number = {"+62 852 1520 0532", "+62 852 1563 1242", "+62 852 1533 1235", "+62 852 1643 1244",
            "+62 852 1563 1232","+62 852 1563 1623","+62 852 1563 1166","+62 852 1563 1242","+62 852 1563 2422"};
    private int[] images = {R.drawable.alfara,R.drawable.ame,R.drawable.arif,R.drawable.elfando,R.drawable.faresa,
                            R.drawable.ferry,R.drawable.indra,R.drawable.pina,R.drawable.sisi};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView contact = (RecyclerView) findViewById(R.id.contact);
        contact.setLayoutManager(new LinearLayoutManager(this));
        contact.setAdapter(new ContactAdapater(images, this, name,number));
        recyclerView = findViewById(R.id.contact);
        recyclerView.setHasFixedSize(true);

        RecyclerView.ItemDecoration divider = new DividerItemDecoration(this,DividerItemDecoration.VERTICAL);
        contact.addItemDecoration(divider);
    }
}
