package to.msn.wings.hello;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox chk = findViewById(R.id.chk);
        chk.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener() {
                    public void onCheckedChanged(CompoundButton buttonView,
                                                 boolean isChecked) {
                        Toast.makeText(MainActivity.this,
                                isChecked ? "メール送信をオン" : "メール送信をオフ",
                                Toast.LENGTH_SHORT).show();
                }
        });

        ToggleButton toggle = findViewById(R.id.toggle);
        toggle.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener() {
                    public void onCheckedChanged(CompoundButton buttonView,
                                                 boolean isChecked) {
                        Toast.makeText(MainActivity.this,
                                isChecked ? "メール送信をオン" : "メール送信をオフ",
                                Toast.LENGTH_SHORT).show();
            }
        });

        RadioGroup rgroup = findViewById(R.id.rgroup);
        rgroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radio = group.findViewById(checkedId);
                Toast.makeText(MainActivity.this,
                        String.format("「%s」が選択されました。", radio.getText()),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void btnSend_onClick(View view) {
        EditText txtName = findViewById(R.id.txtName);
        TextView txtResult = findViewById(R.id.txtResult);
        txtResult.setText(String.format("こんにちは、%sさん！", txtName.getText()));
    }
}

