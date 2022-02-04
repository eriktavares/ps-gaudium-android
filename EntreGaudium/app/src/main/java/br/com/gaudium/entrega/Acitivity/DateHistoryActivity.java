package br.com.gaudium.entrega.Acitivity;

import androidx.appcompat.app.AppCompatActivity;

import br.com.gaudium.entrega.R;
import br.com.gaudium.entrega.model.EntregadorObj;


import android.content.Intent;
import android.os.Bundle;

import android.widget.TextView;

public class DateHistoryActivity extends AppCompatActivity {

    private TextView coletorNameTextView;
    private TextView coletorDescriptionTextView;
    private TextView coletorDeliveriesTextView;
    private TextView coletorSaldTextView;
    private TextView coletornoteTextView;
    private TextView  coletorCargoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_history);
        getTextViewsActivity();

    }
    private void getTextViewsActivity()
    {
         coletorNameTextView=findViewById(R.id.data_history_activity_coletor_name);
        coletorCargoTextView=findViewById(R.id.data_history_activity_coletor_cargo);
         coletorDescriptionTextView=findViewById(R.id.data_history_activity_Coletor_description);
         coletorDeliveriesTextView= findViewById(R.id.data_history_activity_entregas);
         coletorSaldTextView=findViewById(R.id.data_history_activity_saldo);
         coletornoteTextView=findViewById(R.id.data_history_activity_nota);
        Intent it=this.getIntent();
        EntregadorObj obj=it.getParcelableExtra("Coletor");
        obj.getPedido().getEntregas();
    }
    private void startupTextViews()
    {
        
    }

}