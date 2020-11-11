package to.msn.wings.hello;

import androidx.appcompat.app.AppCompatActivity;

//import android.support.v7.app.AppCompatActivity:
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
//        レイアウトを整えている。
    }

    public void btnCurrent_onClick(View view) {
        TextView txt = findViewById(R.id.txtResult);
        txt.setText(new Date().toString());
        Log.d("CurrentTime",new Date().toString());
    }
}