package aplicativotcc.cursoandroid.com.aplicativotcc;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class Numeros extends AppCompatActivity {

    private Toolbar toolbarN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeros);

        //ficar sempre na posição vertical
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        toolbarN = (Toolbar) findViewById(R.id.toolbar_principal);
        toolbarN.setTitle(getResources().getString(R.string.Numero));
        toolbarN.setNavigationIcon(R.drawable.ic_action_arrow_left); // icone do botão voltar
        setSupportActionBar(toolbarN);
    }
}
