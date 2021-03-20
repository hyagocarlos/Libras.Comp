package aplicativotcc.cursoandroid.com.aplicativotcc;

import android.icu.text.Normalizer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.MediaController;
import android.widget.VideoView;

public class SecondActivity extends AppCompatActivity {

    Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mToolbar = (Toolbar) findViewById(R.id.toolbar1);
        mToolbar.setNavigationIcon(R.drawable.ic_action_arrow_left); // icone do botão voltar

        VideoView videoView = (VideoView) findViewById(R.id.video_view);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null){
            mToolbar.setTitle(bundle.getString("TermoName"));

            String termo = tratarString(bundle.getString("TermoName"));
            if (mToolbar.getTitle().toString().equalsIgnoreCase("Aba"));
            {
                String videoPath = "android.resource://" + getPackageName() + "/" + getResources().getIdentifier(termo, "raw", getPackageName());
                Uri uri = Uri.parse(videoPath);
                videoView.setVideoURI(uri);
                videoView.start();

                MediaController mediaController = new MediaController(this);
                videoView.setMediaController(mediaController);
                mediaController.setAnchorView(videoView);
            }
            setSupportActionBar(mToolbar);

        }

    }
    private String tratarString(String s){
        return s.toLowerCase()
                .replace(' ', '_')
                .replace('ç', 'c')
                .replace('à', 'a')
                .replace('á', 'a')
                .replace('â', 'a')
                .replace('ã', 'a')
                .replace('é', 'e')
                .replace('ê', 'e')
                .replace('í', 'i')
                .replace('ô', 'o')
                .replace('ó', 'o')
                .replace('õ', 'o')
                .replace('ú', 'u');
    }
}
