package to.msn.wings.Hello;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
//import android.support.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnSend_onClick(View v) {
        EditText txtKeywd = findViewById(R.id.txtKeywd);
        Intent i = new Intent(Intent.ACTION_VIEW,
                Uri.parse(txtKeywd.getText().toString()));

    /*Intent i = new Intent(Intent.ACTION_SENDTO,
      Uri.parse(txtKeywd.getText().toString()));*/

    /*Intent i = new Intent(Intent.ACTION_WEB_SEARCH);
    i.putExtra(SearchManager.QUERY, txtKeywd.getText().toString());*/

        startActivity(i);
    }
}
