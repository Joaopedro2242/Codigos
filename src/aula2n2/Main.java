
package aula2n2;

import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {
    int opc = 0;
    Aluno aluno = null;
    String Nome, Ra, Curso;
    while (opc != 3){
    opc = Integer.parseInt(
           JOptionPane.showInputDialog( "1 - Cadastrar Aluno\n2 - Mostrar Aluno\n3 - Sair"));
         switch(opc){
             case 1 : 
                 Ra = JOptionPane.showInputDialog("Digite o Ra: ");
                 Nome = JOptionPane.showInputDialog("Digite o Nome: ");
                 Curso = JOptionPane.showInputDialog("Digite o Curso: ");
                 aluno = new Aluno();
                 aluno.setRa(Ra);
                 aluno.setNome(Nome);
                 aluno.setCurso(Curso);
                 break;
                 
             case 2 :
                 if(aluno == null)
                     JOptionPane.showMessageDialog(null, "Nenhum aluno cadastrado.", "Atenção", JOptionPane.WARNING_MESSAGE);
                 else
                     JOptionPane.showMessageDialog(null, aluno.imprimir());
                 break;
                
             case 3 : break;
             default :
                 JOptionPane.showMessageDialog(null, "Opção Inválida", "Atenção", JOptionPane.ERROR_MESSAGE);
             
   
}
    
}
    }}