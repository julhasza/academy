package Controller;

import java.util.Calendar;
import java.util.Date;

public class Calcular_Idade{
    public int Calcular_Idade(Date Data_Nasc);
      Date hoje = new Date();// o new Date pega a data atual do momento da execução
      Calendar calendario = Calendar.getInstance();
      calendario.setTime(hoje);
      int dia_at = calendario.get(Calendar.DAY_OF_MONTH);
      int mes_at = calendario.get(Calendar.MONTH) + 1;
      int ano_at = calendario.get(Calendar.YEAR);

      calendario.setTime(Data_Nasc);
      int dia_at = calendario.get(Calendar.DAY_OF_MONTH);
      int mes_at = calendario.get(Calendar.MONTH) + 1;
      int ano_at = calendario.get(Calendar.YEAR);

      int Idade = ano_at-ano_aniv;
      if(mes_at < mes_aniv){
          Idade--;
     } else if ((mes_at == mes_aniv) && (dia_at < dia_aniv)){
          Idade--;
      }
      if(Idade<0){
          Idade = 0;
      }
     return Idade;
   }
}
