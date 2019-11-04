package tw.mnya.switchactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("A");
        setContentView(R.layout.activity_main);

        Button btn_to_B = (Button) findViewById(R.id.btn_to_B);

        btn_to_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, B.class);
                startActivity(intent);
            }
        });

    }

    // Disable back button
    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }

}
