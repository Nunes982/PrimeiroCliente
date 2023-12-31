package primeiro.cliente.cursoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class TelaSplashActivity extends AppCompatActivity {

    int tempoDeDelay = 1000 * 15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_splash);

        abrirActivityPrincipal();
    }

    private void abrirActivityPrincipal() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent telaPrincipal = new Intent(TelaSplashActivity.this, MainActivity.class);
                startActivity(telaPrincipal);
                finish();

            }
        },tempoDeDelay);

    }
}