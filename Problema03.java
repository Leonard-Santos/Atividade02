import javax.swing.*;

public class Problema03
{
   public static void main(String [] Args)
   {
      int dia;
      int mes;
      int ano;
      
      dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia por favor"));
      mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mes por favor"));
      ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano por favor"));
      
      System.out.println(dia + "/" + mes + "/" + ano);
   }
}      