package aplicativotcc.cursoandroid.com.aplicativotcc;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class SobreActivity extends AppCompatActivity {

    private Toolbar toolbarS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);

        //ficar sempre na posicão vertical
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        toolbarS = (Toolbar) findViewById(R.id.toolbar_principal);
        toolbarS.setTitle("Sobre o projeto");
        toolbarS.setNavigationIcon(R.drawable.ic_action_arrow_left);
        setSupportActionBar(toolbarS);
    }
}
