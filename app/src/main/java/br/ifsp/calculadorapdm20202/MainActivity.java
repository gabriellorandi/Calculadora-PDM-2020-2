package br.ifsp.calculadorapdm20202;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button zeroBt;
    private Button umBt;
    private Button doisBt;
    private Button limparBt;

    private TextView visorTv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        visorTv = findViewById(R.id.visorTv);
        visorTv.setText("");

    }

    @Override
    public void onClick(View view) {

        StringBuilder stringBuilder = new StringBuilder();

        String resultado = visorTv.getText().toString();

        switch (view.getId()) {

            case R.id.bt0:
                visorTv.setText( stringBuilder.append(resultado)
                                            .append(getString( R.string.text0))
                                            .toString() );
                break;

            case R.id.bt1:
                visorTv.setText( stringBuilder.append(resultado)
                                            .append(getString(R.string.text1))
                                            .toString() );
                break;

            case R.id.bt2:
                visorTv.setText( stringBuilder.append(resultado)
                                            .append(getString(R.string.text2))
                                            .toString() );
                break;

            case R.id.bt3:
                visorTv.setText( stringBuilder.append(resultado)
                                            .append(getString(R.string.text3))
                                            .toString() );
                break;

            case R.id.bt4:
                visorTv.setText( stringBuilder.append(resultado)
                                            .append(getString(R.string.text4))
                                            .toString() );
                break;

            case R.id.bt5:
                visorTv.setText( stringBuilder.append(resultado)
                                            .append(getString(R.string.text5))
                                            .toString() );
                break;

            case R.id.bt6:
                visorTv.setText( stringBuilder.append(resultado)
                                            .append(getString(R.string.text6))
                                            .toString() );
                break;

            case R.id.bt7:
                visorTv.setText( stringBuilder.append(resultado)
                                            .append(getString(R.string.text7))
                                            .toString() );
                break;

            case R.id.bt8:
                visorTv.setText( stringBuilder.append(resultado)
                                            .append(getString(R.string.text8))
                                            .toString() );
                break;

            case R.id.bt9:
                visorTv.setText( stringBuilder.append(resultado)
                                            .append(getString(R.string.text9))
                                            .toString() );
                break;

            case R.id.limparTela:
                visorTv.setText("");
                break;
        }
    }
}