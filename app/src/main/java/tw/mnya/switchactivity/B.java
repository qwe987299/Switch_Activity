package tw.mnya.switchactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class B extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("B");
        setContentView(R.layout.activity_b);

        Button btn_to_A = (Button) findViewById(R.id.btn_to_A);

        btn_to_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(B.this, MainActivity.class);
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
