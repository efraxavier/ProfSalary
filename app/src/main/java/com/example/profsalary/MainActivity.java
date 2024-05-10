package com.example.profsalary;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView textViewSalarioProfessorTitular;
    private TextView textViewSalarioProfessorHorista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewSalarioProfessorTitular = findViewById(R.id.textViewSalarioProfessorTitular);
        textViewSalarioProfessorHorista = findViewById(R.id.textViewSalarioProfessorHorista);

        // Exemplo de uso das classes ProfessorTitular e ProfessorHorista
        ProfessorTitular professorTitular = new ProfessorTitular();
        professorTitular.setNome("Fulano");
        professorTitular.setMatricula("123");
        professorTitular.setIdade(40);
        professorTitular.setAnosInstituicao(10); // Exemplo: 10 anos de instituição
        professorTitular.setSalario(3000); // Salário inicial

        // Calcular o salário do professor titular
        professorTitular.calcularSalario();

        // Exibir o salário do professor titular no TextView
        textViewSalarioProfessorTitular.setText("Salário do Professor Titular: " + professorTitular.getSalario());

        ProfessorHorista professorHorista = new ProfessorHorista();
        professorHorista.setNome("Ciclano");
        professorHorista.setMatricula("456");
        professorHorista.setIdade(35);
        professorHorista.setHorasAula(40); // Exemplo: 40 horas de aula
        professorHorista.setValorHoraAula(50.0); // Valor da hora aula

        // Calcular o salário do professor horista
        professorHorista.calcularSalario();

        // Exibir o salário do professor horista no TextView
        textViewSalarioProfessorHorista.setText("Salário do Professor Horista: " + professorHorista.getSalario());
    }
}
