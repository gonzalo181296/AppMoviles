package pe.edu.upc.walkapp.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import pe.edu.upc.walkapp.R;

public class PathActivity extends AppCompatActivity {
    TextView descriptionTextView, timeTextView, dateTextView;
    ListView participantsListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_path);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        descriptionTextView = (TextView) findViewById(R.id.descriptionTextView);
        timeTextView = (TextView) findViewById(R.id.timeTextView);
        dateTextView = (TextView) findViewById(R.id.dateTextView);
        participantsListView = (ListView) findViewById(R.id.participantsListView);

        // Recover data from calling Intent

        Bundle bundle = getIntent().getExtras();
        descriptionTextView.setText(bundle.getString("description"));
        dateTextView.setText(bundle.getString("date"));
        timeTextView.setText(bundle.getString("time"));
        ArrayList<String> participants=bundle.getStringArrayList("participants");
        String[] values=participants.toArray(new String[participants.size()]);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.content_path ,R.id.participantsListView ,values);
        participantsListView.setAdapter(adapter);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
