package br.ufmg.coltec.e03_adapters;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import br.ufmg.coltec.e03_adapters.PlaceAdapter;
import br.ufmg.coltec.e03_adapters.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PlaceAdapter adapter = new PlaceAdapter(this);
        ListView listView = findViewById(R.id.places_list);
        listView.setAdapter(adapter);
    }
}
