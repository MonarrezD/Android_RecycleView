package com.example.recycleview_character;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import com.example.recycleview_character.Models.Protagonista;
import com.example.recycleview_character.Adapter.ProtagonistaAdapter;
import java.util.ArrayList;
import java.util.List;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Protagonista>protagonistas = new ArrayList<>();

        protagonistas.add(new Protagonista("Pomni","Female","Life"));
        protagonistas.add(new Protagonista("Zooble","Female","Life"));
        protagonistas.add(new Protagonista("Ragathan","Female","Life"));
        protagonistas.add(new Protagonista("Kinger","Male","Life"));


        ProtagonistaAdapter po=new ProtagonistaAdapter(protagonistas);
        RecyclerView rv=(RecyclerView) findViewById(R.id.rvProtagonista);
        rv.setAdapter(po);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setHasFixedSize(true);
    }
}