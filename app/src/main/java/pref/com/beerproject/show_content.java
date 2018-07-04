package pref.com.beerproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class show_content extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_content);
        Intent intent=getIntent();
        String name=intent.getStringExtra(MyAdapter.name);
        String style=intent.getStringExtra(MyAdapter.style);
        String id=intent.getStringExtra(MyAdapter.id);
        TextView textname=(TextView)findViewById(R.id.txtName);
        TextView textstyle=(TextView)findViewById(R.id.txtStyle);
        TextView textid=(TextView)findViewById(R.id.txtID);
        textname.setText("Name: "+name);
        textstyle.setText("Style: "+style);
        textid.setText("ID: "+id);

    }
}
