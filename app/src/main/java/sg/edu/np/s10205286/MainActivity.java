package sg.edu.np.s10205286;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent receiveUser = getIntent();
        int index = receiveUser.getIntExtra("id", 0);
        User currentUser = ListActivity.userList.get(index);

        // Intent receiveRanNum = getIntent();
        // User user_one = new User("Yan Jie" + " " + receiveRanNum.getIntExtra("ranNum", 0), "Hi! I'm Yan Jie from Ngee Ann Polytechnic. I love gaming and anime and would love to make friends with anyone :D", 1, false);

        TextView name = findViewById(R.id.username);
        name.setText(currentUser.name);

        TextView desc = findViewById(R.id.user_description);
        desc.setText(currentUser.description);

        Button fllw_btn = findViewById(R.id.btnFollow);

        fllw_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();

                // If followed = true
                if (currentUser.followed) {
                    fllw_btn.setText("Follow");

                    CharSequence text = "Unfollowed!";
                    currentUser.followed = false;

                    Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
                    toast.show();
                }
                else { // If followed = false
                    fllw_btn.setText("Unfollow");

                    CharSequence text = "Followed!";
                    currentUser.followed = true;

                    Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        Log.d("debug", "create");
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