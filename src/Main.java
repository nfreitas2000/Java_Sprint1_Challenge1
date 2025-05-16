import Classificacoes.Medico;
import Classificacoes.Paciente;
import Extras.Consulta;
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
        Conta contaPaciente = new Conta("Paciente José", "123");
        PlanoSaude planoPaciente = new PlanoSaude("Santander", "High");

        Paciente paciente = new Paciente("José Oliveira", "12345678901", 18, fisicoPaciente, enderecoPaciente, contatoPaciente, contaPaciente, 01, planoPaciente);

        //===================================================================================================

        //CRIAÇÃO DE CONTEÚDOS GUIAS

        Guias g1 = new Guias("O que são os teleatendimentos", "Teleatendimento", "Os teleatendimentos do IMREA (Instituto de Medicina Física e Reabilitação) do Hospital das Clínicas (HC) são consultas realizadas de forma remota, por meio de videochamadas, entre profissionais de saúde e pacientes em processo de reabilitação. Essa modalidade permite que os pacientes recebam orientações médicas, fisioterapêuticas, psicológicas e de outras áreas da saúde sem precisar se deslocar até o hospital, garantindo continuidade no tratamento com mais comodidade e acessibilidade, especialmente para pessoas com mobilidade reduzida ou que vivem longe da unidade.");
        Guias g2 = new Guias("Como se preparar para o teleatendimento", "Teleatendimento", "Antes do teleatendimento, escolha um local tranquilo e com boa iluminação. Certifique-se de que seu celular ou computador está carregado e com acesso à internet. Tenha em mãos seus documentos, exames recentes e uma lista de dúvidas ou sintomas. Se precisar de ajuda com a tecnologia, peça apoio a um familiar. Estar pronto com antecedência ajuda a garantir que a consulta ocorra sem imprevistos.");
        Guias g3 = new Guias("Dicas para usar o celular ou computador com facilidade", "Inclusão digital", "Para acessar o teleatendimento, você precisará usar aplicativos como Google Meet ou Zoom. Aprenda o básico: como ligar o aparelho, abrir o navegador, entrar no link da consulta e ativar a câmera e o microfone. Use letras grandes na tela e o modo silencioso para evitar distrações. Se tiver dificuldades, peça orientação a um parente ou cuidador. Com prática, a navegação se torna mais fácil e segura.");

        //===================================================================================================

        //CRIAÇÃO DO MEDICO GENERICO

        Fisico fisicoMedico = new Fisico(81, 1.92, "AB-");
        Endereco enderecoMedico = new Endereco("Rua Manaus", "513", "00000002", "Prédio");
        Contato contatoMedico = new Contato("5511888888888", "medico@gmail.com");
        Conta contaMedico = new Conta("Medico Douglas", "med123");

        Medico medico = new Medico("Douglas Carvalho dos Santos", "10987654321", 31, fisicoMedico, enderecoMedico, contatoMedico, contaMedico, 02, 15000, "Ortopedista");

        //===================================================================================================

        // CRIAÇÃO DE CONSULTA GENERICA

        Consulta consulta = new Consulta("14/06/2025", "14:00", paciente, medico);

        //===================================================================================================

        // CRIAÇÃO DE CONTA TESTE

        Conta conta_teste = new Conta();

        //===================================================================================================
        while (true) {
            System.out.println("Seja bem-vindo ao sistema de simulação dos GuideDevs. Selecione qual cargo deseja simular:");
            System.out.println("0 - Sair");
            System.out.println("1 - Paciente");
            System.out.println("2 - Médico");
            System.out.println("3 - Simulador de Login");

            System.out.print("Digite: ");
            int escolha = sc.nextInt();

            if (escolha == 0) {
                System.out.println("===========================================================================");
                System.out.println("Você encerrou o programa.");
                System.out.println("===========================================================================");
                sc.nextLine();
                break;
            } else if (escolha == 1) {
                while (true) {
                    System.out.println("===========================================================================");
                    System.out.println("Seja bem-vindo, paciente " + paciente.getConta().getUsuario() + "!");
                    System.out.println("O que você deseja realizar?");
                    System.out.println("0 - Sair");
                    System.out.println("1 - Visualizar meus dados");
                    System.out.println("2 - Desejo alterar meus dados");
                    System.out.println("3 - Visualizar minhas consultas agendadas");
                    System.out.println("4 - Acessar conteúdos guias");

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
                            continue;
                        case 2:
                            paciente.alterarDadosCadastro();
                            continue;
                        case 3:
                            consulta.exibirDadosConsulta();
                            System.out.println("0 - Voltar");
                            System.out.print("Digite: ");
                            sc.nextInt();
                            continue;
                        case 4:
                            System.out.println("Qual conteúdo você deseja acessar?");
                            System.out.println("0 - Voltar");
                            System.out.println("1 - " + g1.getTitulo());
                            System.out.println("2 - " + g2.getTitulo());
                            System.out.println("3 - " + g3.getTitulo());

                            System.out.print("Digite: ");
                            int escolha_material = sc.nextInt();

                            switch (escolha_material) {
                                case 0:
                                    continue;
                                case 1:
                                    g1.mostrarConteudo();
                                    continue;
                                case 2:
                                    g2.mostrarConteudo();
                                    continue;
                                case 3:
                                    g3.mostrarConteudo();
                                    continue;
                                default:
                                    System.out.println("Opção inválida! Tente novamente.");
                                    continue;
                            }
                        default:
                            System.out.println("===========================================================================");
                            System.out.println("Opção inválida! Tente novamente.");
                            continue;
                    }break;
                }
            }else if (escolha == 2) {
                while (true){
                    System.out.println("===========================================================================");
                    System.out.println("Seja bem-vindo, doutor " + medico.getConta().getUsuario() + "!");
                    System.out.println("O que você deseja realizar?");
                    System.out.println("0 - Sair");
                    System.out.println("1 - Visualizar meus dados");
                    System.out.println("2 - Alterar meus dados");
                    System.out.println("3 - Visualizar consultas agendadas");
                    System.out.println("4 - Visualizar dados dos pacientes");
                    System.out.println("5 - Gerenciar horários");


                    System.out.print("Digite: ");
                    int num_medico = sc.nextInt();

                    switch (num_medico) {
                        case 0:
                            break;
                        case 1:
                            medico.visualizarDados();
                            System.out.println("0 - Voltar");
                            System.out.print("Digite: ");
                            sc.nextInt();
                            continue;
                        case 2:
                            medico.alterarDadosCadastro();
                            continue;
                        case 3:
                            consulta.exibirDadosConsulta();
                            System.out.println("0 - Voltar");
                            System.out.print("Digite: ");
                            sc.nextInt();
                            continue;
                        case 4:
                            medico.visualizarDadosPaciente(paciente);
                            System.out.println("0 - Voltar");
                            System.out.print("Digite: ");
                            sc.nextInt();
                            continue;
                        case 5:
                            System.out.println("===========================================================================");
                            System.out.println("O que você deseja fazer:");
                            System.out.println("1 - Marcar entrada");
                            System.out.println("2 - Marcar saída");
                            System.out.println("3 - Visualizar entradas e saidas hoje");

                            System.out.print("Digite: ");
                            int num_horarios = sc.nextInt();

                            switch (num_horarios){
                                case 1:
                                    System.out.println("===========================================================================");
                                    medico.marcarHorarioEntrada();
                                    continue;
                                case 2:
                                    System.out.println("===========================================================================");
                                    medico.marcarHorarioSaida();
                                    continue;
                                case 3:
                                    System.out.println("===========================================================================");
                                    medico.visualizarHorarios();
                                    continue;
                            }
                        default:
                            System.out.println("===========================================================================");
                            System.out.println("Opção inválida! Tente novamente.");
                            continue;
                    }break;
                }
            } else if (escolha == 3) {
                while (true) {
                    System.out.println("===========================================================================");
                    System.out.println("Essa é uma área de testes de login. Aqui você pode testa funções relaciodadas ao login de um usuário: ");
                    System.out.println("0 - Sair");
                    System.out.println("1 - Criar um login");
                    System.out.println("2 - Verificar se o login é funcional");

                    System.out.print("Digite: ");
                    int num_login = sc.nextInt();

                    switch (num_login) {
                        case 0:
                            break;
                        case 1:
                            conta_teste.criarLogin();
                            continue;
                        case 2:
                            conta_teste.realizarLogin();
                            continue;
                        default:
                            System.out.println("===========================================================================");
                            System.out.println("Opção inválida! Tente novamente.");
                            continue;
                    }break;
                }
            } else {
                System.out.println("===========================================================================");
                System.out.println("Opção inválida! Tente novamente.");
                System.out.println("===========================================================================");
            }
        }
    }
}
