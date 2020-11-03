package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView r1;
    String s1[],s2[];
    int imageResource[] ={ R.drawable.cat_image,R.drawable.cat_image,R.drawable.cat_image,R.drawable.cat_image,R.drawable.cat_image,R.drawable.cat_image

    };
    myownadapter ad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r1 = (RecyclerView)findViewById(R.id.myrecycler);

        s1=getResources().getStringArray(R.array.pet_name);
        s2=getResources().getStringArray(R.array.desc);

        ad=new myownadapter(this,s1,s2,imageResource);
    }
}
