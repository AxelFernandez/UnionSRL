package com.axelfernandez.unionsrl;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        try {
            Thread.sleep(2000);
        } catch (Exception e) {

        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Consultas de Horarios");
        final Spinner spinnerrecorrido = (Spinner) findViewById(R.id.spinnerrecorrido);
        final Spinner spinnerpartida = (Spinner) findViewById(R.id.spinnerpartida);
        final Spinner spinnerllegada = (Spinner) findViewById(R.id.spinnerllegada);
        final Button botonbuscar = (Button) findViewById(R.id.button);


        ArrayAdapter spinner_adapter = ArrayAdapter.createFromResource(this, R.array.puntopartida_todos, android.R.layout.simple_spinner_item);
        spinner_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerpartida.setAdapter(spinner_adapter);
        spinnerpartida.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (spinnerpartida.getItemAtPosition(i).toString().equals("Alvear")){
                    ArrayAdapter spinner_adapter = ArrayAdapter.createFromResource( getBaseContext(), R.array.puntodestino_si_alvear, android.R.layout.simple_spinner_item);
                    spinner_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinnerllegada.setAdapter(spinner_adapter);
                    spinnerllegada.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            if(spinnerllegada.getItemAtPosition(i).equals("Bowen")){
                                ArrayAdapter spinner_adapter = ArrayAdapter.createFromResource( getBaseContext(), R.array.recorridos_si_bowen_alvear, android.R.layout.simple_spinner_item);
                                spinner_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                spinnerrecorrido.setAdapter(spinner_adapter);
                            }
                            if(spinnerllegada.getItemAtPosition(i).equals("Carmensa")){
                                ArrayAdapter spinner_adapter = ArrayAdapter.createFromResource( getBaseContext(), R.array.recorridos_si_alvear_carmensa, android.R.layout.simple_spinner_item);
                                spinner_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                spinnerrecorrido.setAdapter(spinner_adapter);
                            }
                            if(spinnerllegada.getItemAtPosition(i).equals("Punta Del Agua")){
                                ArrayAdapter spinner_adapter = ArrayAdapter.createFromResource( getBaseContext(), R.array.recorridos_si_puntadeagua_alvear, android.R.layout.simple_spinner_item);
                                spinner_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                spinnerrecorrido.setAdapter(spinner_adapter);
                            }
                            if(spinnerllegada.getItemAtPosition(i).equals("Real del Padre")){
                                ArrayAdapter spinner_adapter = ArrayAdapter.createFromResource( getBaseContext(), R.array.recorridos_si_alvear_realdelpadre, android.R.layout.simple_spinner_item);
                                spinner_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                spinnerrecorrido.setAdapter(spinner_adapter);
                            }

                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });

                }
                if (spinnerpartida.getItemAtPosition(i).toString().equals("Bowen")){
                    ArrayAdapter spinner_adapter = ArrayAdapter.createFromResource( getBaseContext(), R.array.puntodestino_si_bowen, android.R.layout.simple_spinner_item);
                    spinner_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinnerllegada.setAdapter(spinner_adapter);
                    spinnerllegada.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            if(spinnerllegada.getItemAtPosition(i).equals("Alvear")){
                                ArrayAdapter spinner_adapter = ArrayAdapter.createFromResource( getBaseContext(), R.array.recorridos_si_bowen_alvear, android.R.layout.simple_spinner_item);
                                spinner_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                spinnerrecorrido.setAdapter(spinner_adapter);}
                            if(spinnerllegada.getItemAtPosition(i).equals("Cementerio")){
                                ArrayAdapter spinner_adapter = ArrayAdapter.createFromResource( getBaseContext(), R.array.recorridos_si_bowen_cementerio, android.R.layout.simple_spinner_item);
                                spinner_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                spinnerrecorrido.setAdapter(spinner_adapter);}
                        }


                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }

                if (spinnerpartida.getItemAtPosition(i).toString().equals("Carmensa")){
                    ArrayAdapter spinner_adapter = ArrayAdapter.createFromResource( getBaseContext(), R.array.puntodestino_si_carmensa_si_puntadeagua_si_realdelpadre, android.R.layout.simple_spinner_item);
                    spinner_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinnerllegada.setAdapter(spinner_adapter);
                    spinnerllegada.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            if(spinnerllegada.getItemAtPosition(i).equals("Alvear")){
                                ArrayAdapter spinner_adapter = ArrayAdapter.createFromResource( getBaseContext(), R.array.recorridos_si_alvear_carmensa, android.R.layout.simple_spinner_item);
                                spinner_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                spinnerrecorrido.setAdapter(spinner_adapter);}
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }
                if (spinnerpartida.getItemAtPosition(i).toString().equals("Punta Del Agua")){
                    ArrayAdapter spinner_adapter = ArrayAdapter.createFromResource( getBaseContext(), R.array.puntodestino_si_carmensa_si_puntadeagua_si_realdelpadre, android.R.layout.simple_spinner_item);
                    spinner_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinnerllegada.setAdapter(spinner_adapter);
                    spinnerllegada.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            if(spinnerllegada.getItemAtPosition(i).equals("Alvear")){
                                ArrayAdapter spinner_adapter = ArrayAdapter.createFromResource( getBaseContext(), R.array.recorridos_si_puntadeagua_alvear, android.R.layout.simple_spinner_item);
                                spinner_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                spinnerrecorrido.setAdapter(spinner_adapter);}
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }

                if (spinnerpartida.getItemAtPosition(i).toString().equals("Cementerio")){
                    ArrayAdapter spinner_adapter = ArrayAdapter.createFromResource( getBaseContext(), R.array.puntodestino_si_cementerio, android.R.layout.simple_spinner_item);
                    spinner_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinnerllegada.setAdapter(spinner_adapter);
                    spinnerllegada.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            if(spinnerllegada.getItemAtPosition(i).equals("Bowen")){
                                ArrayAdapter spinner_adapter = ArrayAdapter.createFromResource( getBaseContext(), R.array.recorridos_si_bowen_cementerio, android.R.layout.simple_spinner_item);
                                spinner_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                spinnerrecorrido.setAdapter(spinner_adapter);}
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }

                if (spinnerpartida.getItemAtPosition(i).toString().equals("Real del Padre")){
                    ArrayAdapter spinner_adapter = ArrayAdapter.createFromResource( getBaseContext(), R.array.puntodestino_si_carmensa_si_puntadeagua_si_realdelpadre, android.R.layout.simple_spinner_item);
                    spinner_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinnerllegada.setAdapter(spinner_adapter);
                    spinnerllegada.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            if(spinnerllegada.getItemAtPosition(i).equals("Alvear")){
                                ArrayAdapter spinner_adapter = ArrayAdapter.createFromResource( getBaseContext(), R.array.recorridos_si_alvear_realdelpadre, android.R.layout.simple_spinner_item);
                                spinner_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                spinnerrecorrido.setAdapter(spinner_adapter);}
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        botonbuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String recorrido = spinnerrecorrido.getSelectedItem().toString();
                String partida = spinnerpartida.getSelectedItem().toString();
                String destino = spinnerllegada.getSelectedItem().toString();
                Intent intent = new Intent(v.getContext(), Busqueda.class);
                intent.putExtra("recorrido", recorrido.toString());
                intent.putExtra("partida", partida.toString());
                intent.putExtra("destino", destino.toString());

                startActivityForResult(intent, 0);
            }


        });



    }
}
