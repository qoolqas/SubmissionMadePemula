package com.example.contact;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ContactAdapater extends RecyclerView.Adapter<ContactAdapater.ContactViewHolder> {


    private int[] images;

    private Context context;
    private String[] name;
    private String [] number;

    public ContactAdapater (int[] images, Context context, String[] name, String[] number)
    {
        this.images =  images;
        this.context = context;
        this.name = name;
        this.number = number;
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.list_item_layout, viewGroup, false);
        return new ContactViewHolder(view,context,images,name,number);

    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder contactViewHolder, int position) {
        int image_id = images[position];
        contactViewHolder.imgIcon.setImageResource(image_id);
        contactViewHolder.txtTitle.setText(name[position]);

    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class ContactViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imgIcon;
        TextView txtTitle;
        Context context;
        int[] images;
        String [] name;
        String [] number;
        public ContactViewHolder(@NonNull View itemView, Context context, int[] images, String[] name, String[] number) {
            super(itemView);
            imgIcon = (ImageView) itemView.findViewById(R.id.imgIcon);
            txtTitle = (TextView) itemView.findViewById(R.id.txtTitle);
            itemView.setOnClickListener(this);
            this.context = context;
            this.images = images;
            this.name = name;
            this.number = number;

        }

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(context, DisplayActivity.class);
//            intent.putExtra(DisplayActivity.EXTRA_NAME, "+62 852 1520 0532");
            intent.putExtra("image_id", images[getAdapterPosition()]);
            intent.putExtra("name_id", number[getAdapterPosition()]);

            context.startActivity(intent);

        }
    }
}
