package br.com.fiap.demolayout;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import br.com.fiap.demolayout.adapter.ListaAdapter;

public class ListaActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        ListView lv = (ListView) findViewById(R.id.lvMain);
        lv.setAdapter(new ListaAdapter(this));
    }

}
