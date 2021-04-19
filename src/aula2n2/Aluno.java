
package aula2n2;


public class Aluno {
   private String Nome;
   private String Ra;
   private String Curso;
   
   public void setRa (String Ra){
       this.Ra = Ra;
       
       }
   public String getRa(){
       return Ra;
   }
   
   public void setNome (String Nome){
       this.Nome = Nome;
   }
   public String getNome (){
       return Nome;
   }
   public void setCurso(String Curso){
       this.Curso = Curso;
   }
   public String getCurso(){
       return Curso;
   }
   public String imprimir(){
       return "Ra: " + Ra + "\nNome: " + Nome + "\nCurso: " + Curso;
   }
 }
