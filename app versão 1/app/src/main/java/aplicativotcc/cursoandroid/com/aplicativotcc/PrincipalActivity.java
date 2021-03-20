package aplicativotcc.cursoandroid.com.aplicativotcc;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class PrincipalActivity extends AppCompatActivity {

    //atributos
    private ImageButton botaoGlossario;
    private ImageButton botaoAlfabeto;
    private ImageButton botaoNumero;
    private ImageButton botaoSobre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        //deixar a tela apenas na vertical
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        //cast e método passando os ids
        botaoGlossario = (ImageButton) findViewById(R.id.glossarioId);
        botaoAlfabeto = (ImageButton) findViewById(R.id.alfabetoId);
        botaoNumero = (ImageButton) findViewById(R.id.numerosId);
        botaoSobre = (ImageButton) findViewById(R.id.sobreId);

        //evento de clique
        botaoGlossario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // o start activit recebe o intent passando as activity para outra
                startActivity(new Intent(PrincipalActivity.this, GlossarioActivity.class));
            }
        });
        botaoAlfabeto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PrincipalActivity.this, Alfabeto.class));
            }
        });
        botaoNumero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PrincipalActivity.this, Numeros.class));
            }
        });
        botaoSobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PrincipalActivity.this, SobreActivity.class));
            }
        });
    }
}
