import Classificacoes.Paciente;
import Extras.Guias;
import Extras.PlanoSaude;
import Pessoa.Conta;
import Pessoa.Contato;
import Pessoa.Endereco;
import Pessoa.Fisico;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //===================================================================================================

        //CRIAÇÃO DO PACIENTE GENERICO

        Fisico fisicoPaciente = new Fisico(70, 1.71, "O+");
        Endereco enderecoPaciente = new Endereco("Rua ABC", "43", "00000001", "Casa");
        Contato contatoPaciente = new Contato("5511999999999", "paciente@gmail.com");
        Conta contaPaciente = new Conta("José", "123");
        PlanoSaude planoPaciente = new PlanoSaude("Santander", "High");

        Paciente paciente = new Paciente("José Oliveira", "12345678901", 18, fisicoPaciente, enderecoPaciente, contatoPaciente, contaPaciente, 01, planoPaciente);

        //===================================================================================================

        //CRIAÇÃO DE CONTEÚDOS GUIAS

        Guias g1 = new Guias("O que são os teleatendimentos", "Teleatendimento", "Os teleatendimentos do IMREA (Instituto de Medicina Física e Reabilitação) do Hospital das Clínicas (HC) são consultas realizadas de forma remota, por meio de videochamadas, entre profissionais de saúde e pacientes em processo de reabilitação. Essa modalidade permite que os pacientes recebam orientações médicas, fisioterapêuticas, psicológicas e de outras áreas da saúde sem precisar se deslocar até o hospital, garantindo continuidade no tratamento com mais comodidade e acessibilidade, especialmente para pessoas com mobilidade reduzida ou que vivem longe da unidade.");
        Guias g2 = new Guias("Como se preparar para o teleatendimento", "Teleatendimento", "Antes do teleatendimento, escolha um local tranquilo e com boa iluminação. Certifique-se de que seu celular ou computador está carregado e com acesso à internet. Tenha em mãos seus documentos, exames recentes e uma lista de dúvidas ou sintomas. Se precisar de ajuda com a tecnologia, peça apoio a um familiar. Estar pronto com antecedência ajuda a garantir que a consulta ocorra sem imprevistos.");
        Guias g3 = new Guias("Dicas para usar o celular ou computador com facilidade", "Inclusão digital", "Para acessar o teleatendimento, você precisará usar aplicativos como Google Meet ou Zoom. Aprenda o básico: como ligar o aparelho, abrir o navegador, entrar no link da consulta e ativar a câmera e o microfone. Use letras grandes na tela e o modo silencioso para evitar distrações. Se tiver dificuldades, peça orientação a um parente ou cuidador. Com prática, a navegação se torna mais fácil e segura.");

        //===================================================================================================

        while (true){

            System.out.println("Seja bem-vindo ao sistema de simulação dos GuideDevs. Selecione qual cargo deseja simular:");
            System.out.println("0 - Sair");
            System.out.println("1 - Paciente");
            System.out.println("2 - Médico");

            System.out.print("Digite: ");
            int escolha = sc.nextInt();

            while (true) {
                switch (escolha) {
                    case 0:
                        System.out.println("Você encerrou o programa.");
                        sc.next();
                        break;
                    case 1:

                        System.out.println("===========================================================================");
                        System.out.println("Seja bem-vindo, " + paciente.getConta().getUsuario() + "!");
                        System.out.println("O que você deseja realizar?");
                        System.out.println("0 - Sair");
                        System.out.println("1 - Visualizar meus dados");
                        System.out.println("2 - Desejo alterar meus dados");
                        System.out.println("3 - Agendar consulta");
                        System.out.println("4 - Confirmar consulta");
                        System.out.println("5 - Desmacar consulta");
                        System.out.println("6 - Acessar conteúdos guias");
                        System.out.println("7 - Falar com o suporte");

                        System.out.print("Digite: ");
                        int num = sc.nextInt();

                        switch (num) {
                            case 0:
                                break;
                            case 1:
                                paciente.visualizarDados();
                                System.out.println("0 - Voltar");
                                System.out.print("Digite: ");
                                sc.nextInt();
                                break;
                            case 2:
                                paciente.alterarDadosCadastro();
                                break;
                            case 6:
                                System.out.println("Qual conteúdo você deseja acessar?");
                                System.out.println("0 - Voltar");
                                System.out.println("1 - " + g1.getTitulo());
                                System.out.println("2 - " + g2.getTitulo());
                                System.out.println("3 - " + g3.getTitulo());

                                System.out.print("Digite: ");
                                int escolha_material = sc.nextInt();
                                switch (escolha_material) {
                                    case 0:
                                        break;
                                    case 1:
                                        g1.mostrarConteudo();
                                        break;
                                    case 2:
                                        g2.mostrarConteudo();
                                        break;
                                    case 3:
                                        g3.mostrarConteudo();
                                        break;
                                }
                        }
                }
            }
        }
    }
}