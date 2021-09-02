package com.geektech.classworkapplication6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.geektech.classworkapplication6.databinding.ActivityMainBinding;
import com.geektech.classworkapplication6.fragments.FirstFragment;

public class MainActivity extends AppCompatActivity {

    //private TextView textView;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());

        View view = binding.getRoot();
        setContentView(view);

        binding.tvMainText.setOnClickListener(v->{
                Toast.makeText(this, "Good",Toast.LENGTH_SHORT).show();
             });


        //textView = findViewById(R.id.tvMainText);

       // textView.setOnClickListener(v->{
        //    Toast.makeText(this, "Good",Toast.LENGTH_SHORT).show();
       // });

        getSupportFragmentManager().beginTransaction().replace(R.id.flMainCont, new FirstFragment()).commit();

    }
}