package com.RecycleView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class rvadapter extends RecyclerView.Adapter<rvviewholder> {

    String s1[];
    Context c;

    public rvadapter(Context ctx,String s[]){
        c=ctx;
        s1=s;
    }

    @NonNull
    @Override
    public rvviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(c);
        View viewl =layoutInflater.inflate(R.layout.view,parent,false);
        return new rvviewholder(viewl);
    }

    @Override
    public void onBindViewHolder(@NonNull rvviewholder holder, int position) {

        holder.name.setText(s1[position]);
        holder.imageView.setImageResource(R.drawable.ic_launcher_foreground);

    }

    @Override
    public int getItemCount() {
        return s1.length;
    }
}

class rvviewholder extends RecyclerView.ViewHolder{
    TextView name;
    ImageView imageView;
    public rvviewholder(@NonNull View itemView) {
        super(itemView);
        name=itemView.findViewById(R.id.name);
        imageView=itemView.findViewById(R.id.img);

    }
}