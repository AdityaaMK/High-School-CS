package com.adityaamk.writingreadingdatademo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    String file = "demo.txt";
    String dataToWrite = "WritingReadingDataDemo\n demo is working";
    String currentLine;
    StringBuffer allInfo;
    BufferedReader bufferedReader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try{
            OutputStreamWriter writer = new OutputStreamWriter(openFileOutput(file, Context.MODE_PRIVATE));
            writer.write(dataToWrite);
            writer.close();
            bufferedReader = new BufferedReader(new InputStreamReader(openFileInput(file)));
            allInfo = new StringBuffer();
            while ((currentLine = bufferedReader.readLine()) != null){
                allInfo.append(currentLine);
            }
            Log.d("TAG", allInfo.toString());
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
