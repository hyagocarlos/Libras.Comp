package aplicativotcc.cursoandroid.com.aplicativotcc;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Alfabeto extends AppCompatActivity {

    private Toolbar toolbarA;
    //private Button botaoVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alfabeto);

        //ficar sempre na posicão vertical
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        toolbarA = (Toolbar) findViewById(R.id.toolbar_principal);
        toolbarA.setTitle(getResources().getString(R.string.Alfabeto)); // titulo da toolbar
        toolbarA.setNavigationIcon(R.drawable.ic_action_arrow_left); // icone do botão voltar
        setSupportActionBar(toolbarA);

        //botaoVoltar = (Button) findViewById(R.id.botaoVoltarId);

        //toolbarA.setLogo(R.drawable.toolbar_logo_alfabeto);
        //setSupportActionBar(toolbarA);
    }

}
