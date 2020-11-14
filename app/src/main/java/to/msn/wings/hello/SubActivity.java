package to.msn.wings.hello;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Intent i = getIntent();
        String txtName = i.getStringExtra("txtName");
        Toast.makeText(this,
                String.format("こんにちは、%sさん！", txtName),
                Toast.LENGTH_SHORT).show();
    }

    public void btnBack_onClick(View v) {
        finish();
    }
}

//package to.msn.wings.hello;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.appcompat.app.AppCompatActivity;
//import android.view.View;
//import android.widget.Toast;

//public class SubActivity extends AppCompatActivity {
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_sub);
//
//        intent i = getIntent();
//        String txtName = i.getStringExtra("txtName");
//        Toast.makeText(this,
//                String.format("こんにちは、%sさん！", txtName),
//                Toast.LENGTH_SHORT).show();
//    }
//
//    public void btnBack_onClick(View v) {
//        finish();
//    }
//}

//    @Override
//    protected void onRestart() {
//        Log.d("LIFE", "sub_onRestart");
//        super.onRestart();
//    }
//
//    @Override
//    protected void onPause() {
//        Log.d("LIFE", "sub_onPause");
//        super.onPause();
//    }
//
//    @Override
//    protected void onResume() {
//        Log.d("LIFE", "sub_onResume");
//        super.onResume();
//    }
//
//    @Override
//    protected void onStart() {
//        Log.d("LIFE", "sub_onStart");
//        super.onStart();
//    }
//
//    @Override
//    protected void onStop() {
//        Log.d("LIFE", "sub_onStop");
//        super.onStop();
//    }
//
//    @Override
//    protected void onDestroy() {
//        Log.d("LIFE", "sub_onDestroy");
//        super.onDestroy();
//    }
//}

