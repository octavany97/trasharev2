package id.ac.umn.trashare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetailEventYayasanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_event_yayasan);

        TextView txtTitle = (TextView) findViewById(R.id.txtTitle);
        txtTitle.setText(getIntent().getStringExtra("name"));

        TextView txtPenyelenggara = (TextView) findViewById(R.id.txtPenyelenggara);
        txtPenyelenggara.setText(getIntent().getStringExtra("penyelenggara"));

        TextView txtDesc = (TextView) findViewById(R.id.txtDescription);
        txtDesc.setText(getIntent().getStringExtra("deskripsi"));

        Button btnSaran = (Button) findViewById(R.id.btnSaran);
        btnSaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        Button btnFinish = (Button) findViewById(R.id.btnFinish);
        btnFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
