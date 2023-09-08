public class ExemploFor {
    public static void main(String[] args) {
        String alunos[] = {"Felipe", "Jonas", "Julia", "Marcos"};

        // for (int i = 0; i < alunos.length; i++){
        //     System.out.println("O aluno no índice " + i + " é " + alunos[i]);
        // }

        // Forma abreviada
        for(String aluno : alunos){
            System.out.println("Nome do aluno é " + aluno);
        }
    } 
}