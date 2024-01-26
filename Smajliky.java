

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cz.itnetwork.smajliky;
import java.util.Scanner;
/**
 *
 * @author estra
 */
public class Smajliky {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in,"Windows-1250");
       String pokracovat = "ano";

        while (pokracovat.equals("ano")) {
        
       System.out.println(" zadej smajlika: ");
       String smajlik = scanner.nextLine();
       
       ////// MOJE BEZ "SWITCH"
       
          if( (smajlik.contains(":-)") ) || (smajlik.contains(":)"))){
       System.out.println("smajlik je vesely");
              System.out.println();
       }else if((smajlik.contains(":-(")) ||  (smajlik.contains(":("))){
           System.out.println("smajlik je smutny");
              System.out.println();
       }else if((smajlik.contains(":-P")) || (smajlik.contains(":P"))){
           System.out.println("smajlik vyplazuje jazyk");
              System.out.println();
       }else if((smajlik.contains(":-*")) || (smajlik.contains(":*"))){
           System.out.println("smajlik je zamilovany");
              System.out.println();
       }else if((smajlik.contains("o.O"))){
          System.out.println("smajlik je zmateny");
              System.out.println();
       }else if((smajlik.contains(">:(")) || (smajlik.contains(">:-("))){
        System.out.println("smajlik je nasrany");
              System.out.println();
       }else if((smajlik.contains(">:-O")) || (smajlik.contains(">:0"))){
              System.out.println("smajlik vztekle rve");
              System.out.println();
       }else if((smajlik.contains(":-/")) || (smajlik.contains(":/"))) {
              System.out.println("smajlik je nejisty");
              System.out.println();
       }else if ((smajlik.contains("<3"))){
            System.out.println("srdicko");
              System.out.println();
        } else { 
         System.out.println("smajlik je neznamy"); 
              System.out.println();
       }
                 System.out.println("Chces zadat další příklad? [ano/ne]");
            System.out.println();
            pokracovat = scanner.nextLine();
            System.out.println();
        }
        System.out.println("adios, amigo");
    }
}
    


       
    /*      
        //////////// MOJE SE "SWITCH" ////
         
         switch (smajlik){
          case  ":)":
             System.out.println("smajlik je vesely");
              break;
          case ":-)" :
             System.out.println("smajlik je vesely");
             break;
          case ":(":
              System.out.println("smajlik je smutny");
              break;
          case ":-(" :
              System.out.println("smajlik je smutny");
              break;
          case ":-P" :
              System.out.println("smajlik vyplazuje jazyk");
              break;
          case ":P" :
              System.out.println("smajlik vyplazuje jazyk");
              break;
          case ":*" :
              System.out.println("smajlik je zamilovany");
              break;
          case ":-*":
              System.out.println("smajlik je zamilovany");
              break;
      
      default: 
          System.out.println("smajlik je neznamy");
              
              }}}
       
       */
      /* 
       //////  ITnetwork ////
         
           
       smajlik = smajlik.trim().toUpperCase();
        smajlik = smajlik.replace("-","");
              switch (smajlik){
        case ":)" :
            System.out.println("tvuj smajlik je vesely");
            break;
        case ":(" :
            System.out.println("tvuj smajlik je smutny");
            break;
        case ":P"    :
            System.out.println("tvuj smajlik vyplazuje jazyk");
            break;
        case ":*" :
            System.out.println("tvuj smajlik je zamilovany");
            break;
        default:
            System.out.println("tvuj smajlik je neznamy");
       }
        
    }
}
*/