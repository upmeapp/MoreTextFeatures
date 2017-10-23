package assaf.zfani.moretextfeatures;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ////////input-filter////////
        EditText editText=(EditText)findViewById(R.id.editText);
        editText.setFilters(new InputFilter[]{new InputFilter.AllCaps(), new InputFilter.LengthFilter(5)});
        ///////////////////////////

        ///////Spinner////////////
        findViewById(R.id.buttonSaver).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView= (TextView)findViewById(R.id.textView);
                Spinner spinner = (Spinner)findViewById(R.id.spinner);
                TextView selected = (TextView)spinner.getSelectedView();
                textView.setText(selected.getText());
            }
        });

        //////////////////////////

    }
}
