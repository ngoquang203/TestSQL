package com.example.testsql;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Logins logins = new Logins();
        ArrayList<Logins> list = new ArrayList<>();
        try {
            list = Logins.getuserlist();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0;i<list.size();++i){
            Log.e(list.get(i).getUser(),list.get(i).getPass());
        }
    }
}