package aplicativotcc.cursoandroid.com.aplicativotcc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

public class GlossarioActivity extends AppCompatActivity {

    //Declaração das variáveis do escopo
    private Toolbar toobar_principal;
    ListView listView;
    private EditText et_buscar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glossario);

        //utilize o método findViewById() para recuperar as Views pelo ID e guardar nas variáveis.
        toobar_principal = (Toolbar) findViewById(R.id.toolbar_principal);
        toobar_principal.setTitle(getResources().getString(R.string.Glossario));
        toobar_principal.setNavigationIcon(R.drawable.ic_action_arrow_left); // icone do botão voltar da toolbar
        setSupportActionBar(toobar_principal);
        listView = (ListView) findViewById(R.id.listView);
        et_buscar = (EditText) findViewById(R.id.et_buscar);


        //logo que aparece na toolbar
        //toobar_principal.setLogo(R.drawable.toolbar_logo);
        //setSupportActionBar(toobar_principal);

        final ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(GlossarioActivity.this,
                android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.termos));

        //Evento do clique OnClickListener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(GlossarioActivity.this, SecondActivity.class);
                intent.putExtra("TermoName", listView.getItemAtPosition(i).toString());
                startActivity(intent);
            }
        });
        listView.setAdapter(mAdapter);

        et_buscar.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                mAdapter.getFilter().filter(charSequence);

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
}
