package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        //ATIVIDADE DA PROVA A1
        
        //Scanner
        Scanner sc = new Scanner(System.in);

        //Variáveis usadas no código:
        int candidatoVotosXYZ = 0;
        int candidatoVotosABC = 0;
        int candidatoVotosMNO = 0;
        int votosIndecisos = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        
        /*
        Aqui há uma estrutura de repetição com FOR(pois já sabemos qual é quantidade total de eleitores),
        onde dentro é criado um menu para cada eleitor escolher o seu candidato ([1], [2], [3] ou [4]).
        O voto é computado e o programa segue o looping, perguntando ao próximo usuário o seu voto.
        Mas, se voto do eleitor (atual) for fora do pedido ( como mostra a linha 39), ele será inválidado e o programa pedirá novamente o voto daquele usuário. 
        */
        for (int i = 1; i <= 20; i++) {
            boolean votoValido = false;
            while (!votoValido) {
                System.out.println("Olá Usuário " + i + ":" );
                System.out.println("----------ELEIÇÕES---------- \n[1] Candidato XYZ\n[2] Candidato ABC ");
                System.out.println("[3]Candidato MNO\n[4]Indeciso");
                System.out.println( "Olá! Digite o número para o candidato escolhido (Pode votar somente 1 vez)");
                int voto = sc.nextInt();

                if (voto == 1) { //Armazena o voto do candidato 1 e valida.
                    candidatoVotosXYZ++;
                    votoValido = true;
                    System.out.println("Voto do usuário " + i +": Candidato XYZ!\n");
                    a++;
                } else if (voto == 2) { //Armazena o voto do candidato 2 e valida.
                    candidatoVotosABC++;
                    votoValido = true;
                    
                    System.out.println("Voto do usuário " + i +": Candidato ABC!\n");
                    b++;
                } else if (voto == 3) { //Armazena o voto do candidato 3 e valida.
                    candidatoVotosMNO++;
                    votoValido = true;
                    System.out.println("Voto do usuário " + i +" Candidato MNO!\n");
                    c++;
                } else if (voto == 4) { //Armazena o voto do candidato 4 e valida.
                    votosIndecisos++;
                    votoValido = true;
                    System.out.println("Voto do usuário " + i +": Indeciso!\n");
                    d++;
                } else { //Pede para o usuário escreve-lo novamente.
                    System.out.println("Voto inválido, usuário " + i +". Tente novamente!\n");
                }
            }
        }

        //Criando a variável dos votos válidos com a média de todos os votos dos candidatos juntos  
        int votosValidos = candidatoVotosXYZ + candidatoVotosABC + candidatoVotosMNO;
        
        //Descobrir a porcentagem de cada candidato com base nos votos válidos e em cada candidato
        double XYZperc = (double) candidatoVotosXYZ / votosValidos * 100;
        double ABCperc = (double) candidatoVotosABC / votosValidos * 100;
        double MNOperc = (double) candidatoVotosMNO / votosValidos * 100;
        
        //Descobrir a porcentagem dos votos Inválidos e indecisos
        double percIndecisos = (double) votosIndecisos / 20 * 100;

        /*Aqui, o programa mostra qual é a porcentagem votos válidos de cada Candidato
        e mostra também a quantidade de votos que cada opção recebeu.
        */
        System.out.println("-------RESULTADO DAS ELEIÇÕES:-------");
        System.out.printf("\nXYZ: %.2f%% (recebeu: " + a + " votos)\n", XYZperc);
        System.out.printf("ABC: %.2f%% (recebeu: " + b + " votos)\n", ABCperc);
        System.out.printf("MNO: %.2f%% (recebeu: " + c + " votos)\n", MNOperc);
        System.out.println("Indecisos: " + percIndecisos + "% (recebeu: " + d + " votos)");
    
        System.out.println(System.lineSeparator() + "\nObrigado por testar o código! :D");
    
        sc.close();
    
    //FIM DO PROGRAMA! 
    }
}
