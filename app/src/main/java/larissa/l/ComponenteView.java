package larissa.l;

import androidx.appcompat.app.AppCompatActivity;

public class ComponenteView extends AppCompatActivity {

    @Override
    protected void OnCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_component_view);
        Bundle bundle = getIntent().getExtras();
        String fruta = bundle.getString("fruta");

        TextView textView = findViewById(R.id.textView);
        textView.setText(fruta);
    }
}
