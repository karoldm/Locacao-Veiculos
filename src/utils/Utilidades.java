
package utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

/**
 *
 * @author karolyne Marques
 */
public final class Utilidades {
    
    //função para calcular os dias entre duas datas
     public static int daysBetween(Calendar CLocacao, Calendar CDevolucao){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MM yyyy");
        
        int dayLocacao =  CLocacao.get(Calendar.DATE);
        int monthLocacao = CLocacao.get(Calendar.MONTH)+1;
        int yearLocacao = CLocacao.get(Calendar.YEAR);
        
        int dayDevolucao =  CDevolucao.get(Calendar.DATE);
        int monthDevolucao = CDevolucao.get(Calendar.MONTH)+1;
        int yearDevolucao = CDevolucao.get(Calendar.YEAR);

        String dateLocacao = (dayLocacao < 10 ?
                "0" + Integer.toString(dayLocacao):
                Integer.toString(dayLocacao))
                + " " + (monthLocacao < 10 ?
                "0" + Integer.toString(monthLocacao):
                Integer.toString(monthLocacao))
                + " " + Integer.toString(yearLocacao);
        
        String dateDevolucao = (dayDevolucao < 10 ?
                "0" + Integer.toString(dayDevolucao): 
                Integer.toString(dayDevolucao))
                + " " + (monthDevolucao < 10 ?
                "0" + Integer.toString(monthDevolucao): 
                Integer.toString(monthDevolucao))
                + " " + Integer.toString(yearDevolucao);
        
        LocalDate date1 = LocalDate.parse(dateLocacao, dtf);
        LocalDate date2 = LocalDate.parse(dateDevolucao, dtf);
        
        int daysBetween = (int)ChronoUnit.DAYS.between(date1, date2); 
        
        return daysBetween;
     }
    
     //função para ferificar se existem algum parâmetro vazio
     public static boolean hasNull(String[] itens){
         for(String item: itens){
             if(item.equals("")) return true;
         }
         return false;
     }

     //função para verificar de data é válida e retornar ela em formato Calendar
     public static Calendar getValidDate(String dia, String mes, String ano){
         int diaInt = Integer.parseInt(dia);
         int mesInt = Integer.parseInt(mes);
         int anoInt = Integer.parseInt(ano);
         
         if(diaInt < 1) return null;
         
         switch (mesInt){
             case 1:
             case 3:
             case 5:
             case 7:
             case 8:
             case 10:
             case 12:
                 if(diaInt > 31) return null;
                 break;
             case 2:
             case 4:
             case 6:
             case 9:
             case 11:
                 if(diaInt > 30) return null;
                 break;
             default: 
                 return null;
         }
         
        Calendar date = Calendar.getInstance();
        date.set(anoInt, mesInt-1, diaInt);
        
        return date;
     }
}
