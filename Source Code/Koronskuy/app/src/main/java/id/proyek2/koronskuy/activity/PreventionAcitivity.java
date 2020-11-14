
package id.proyek2.koronskuy.activity;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import id.proyek2.koronskuy.R;
import id.proyek2.koronskuy.adapter.ListPreventionAdapter;
import id.proyek2.koronskuy.model.PreventData;
import id.proyek2.koronskuy.model.Prevention;

public class PreventionAcitivity extends AppCompatActivity {
    private RecyclerView rvPrevens;
    private ArrayList<Prevention> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prevention);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(R.string.prevention);
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        rvPrevens = findViewById(R.id.rv_prevens);
        rvPrevens.setHasFixedSize(true);

        list.addAll(PreventData.getListData());
        showRecycleList();
    }

    private void showRecycleList() {
        rvPrevens.setLayoutManager(new LinearLayoutManager(this));
        ListPreventionAdapter listPreventionAdapter = new ListPreventionAdapter(list);
        rvPrevens.setAdapter(listPreventionAdapter);

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}