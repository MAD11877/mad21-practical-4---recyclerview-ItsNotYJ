package sg.edu.np.s10205286;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class ListActivity extends AppCompatActivity {
    static ArrayList<User> userList = new ArrayList<User>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        Random temp = new Random();
        for(int i = 0; i < 20; i++) {
            String name = "Name" + temp.nextInt();
            String description = "Description " + temp.nextInt();

            userList.add(new User(name, description, i, temp.nextBoolean()));
        }

        RecyclerView rv = findViewById(R.id.rvList);
        UsersAdapter listAdapter = new UsersAdapter(this, userList);
        LinearLayoutManager mlm = new LinearLayoutManager(this);

        rv.setLayoutManager(mlm);
        rv.setAdapter(listAdapter);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("debug", "start");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("debug", "stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("debug", "destroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("debug", "pause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("debug", "resume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("debug", "restart");
    }
}