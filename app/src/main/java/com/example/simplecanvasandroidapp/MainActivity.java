package com.example.simplecanvasandroidapp;
import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    CanvasClass canvasClass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        canvasClass = new CanvasClass(this);
        canvasClass.setBackgroundColor(Color.BLACK);
        setContentView(canvasClass);
    }
}