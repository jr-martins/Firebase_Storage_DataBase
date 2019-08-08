package com.example.firebaseds;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView cardView_Upload;
    private CardView cardView_Download;
    private CardView cardView_Database_LerDados;
    private CardView cardView_Database_Gravar_Alterar_Excluir;
    private CardView cardView_Empresa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        cardView_Upload = findViewById(R.id.cardView_StorageUpload);
        cardView_Download = findViewById(R.id.cardView_StorageDownload);
        cardView_Database_LerDados = findViewById(R.id.cardView_LerDados);
        cardView_Database_Gravar_Alterar_Excluir = findViewById(R.id.cardView_DataBase_GravarAlterarExcluir);
        cardView_Empresa = findViewById(R.id.cardView_Empresas);

        cardView_Upload.setOnClickListener(this);
        cardView_Download.setOnClickListener(this);
        cardView_Database_LerDados.setOnClickListener(this);
        cardView_Database_Gravar_Alterar_Excluir.setOnClickListener(this);
        cardView_Empresa.setOnClickListener(this);
    }

    //---------------------------Tratamento de clicks----------------------------------//
    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.cardView_StorageDownload:

                break;

            case R.id.cardView_StorageUpload:

                break;

            case R.id.cardView_LerDados:

                break;

            case R.id.cardView_DataBase_GravarAlterarExcluir:

                break;

            case R.id.cardView_Empresas:

                break;




        }

    }
}
