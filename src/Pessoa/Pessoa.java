package Pessoa;

import java.util.Scanner;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected int idade;
    protected Fisico fisico;
    protected Contato contato;
    protected Endereco endereco;
    protected Conta conta;

    /***************************** CONSTRUTOR *******************************/

    public Pessoa(String nome, String cpf, int idade, Fisico fisico, Contato contato, Endereco endereco, Conta conta){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.contato = contato;
        this.endereco = endereco;
        this.fisico = fisico;
        this.conta = conta;
    }

    public Pessoa() {}

    /***************************** GETS *******************************/
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    public Fisico getFisico() {
        return fisico;
    }

    public Contato getContato() {
        return contato;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Conta getConta() {
        return conta;
    }

    /***************************** SETS *******************************/
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setFisico(Fisico fisico) {
        this.fisico = fisico;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    /***************************** METODOS *******************************/


    public void getDadosPessoa(){
        System.out.println("===========================================================================");
        System.out.println("Pessoais --- ");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9) );
        System.out.println("Idade: " + idade + " anos" + "\n");
        System.out.println("Fisico --- " + "\n" + fisico.getDadosFisicos() + "\n");
        System.out.println("Contato --- " + "\n" + contato.getDadosContato() + "\n");
        System.out.println("Endereço --- " + "\n" + endereco.getDadosEndereco() + "\n");
    }

    public void visualizarDados(){
        System.out.println("===========================================================================");
        System.out.println("Usuário: " + conta.getUsuario());
        getDadosPessoa();
        System.out.println("---------------------------------------------------------------------------");
    }

    public void alterarDadosCadastro(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual tipo de dado você alterar?");
        System.out.println("0 - Voltar");
        System.out.println("1 - Pessoais");
        System.out.println("2 - Fisicos");
        System.out.println("3 - Contato");
        System.out.println("4 - Endereço");
        System.out.println("5 - Conta");

        System.out.print("Digite: ");

        int troca = sc.nextInt();
        sc.nextLine();

        switch (troca) {
            case 0:
                break;
            case 1:
                while (true) {
                    System.out.println("Qual dos itens você deseja alterar?");
                    System.out.println("0 - Voltar");
                    System.out.println("1 - Nome");
                    System.out.println("2 - Idade");
                    System.out.println("3 - CPF");

                    System.out.print("Digite: ");
                    int alterar_pessoal = sc.nextInt();
                    sc.nextLine();

                    switch (alterar_pessoal) {
                        case 0:
                            break;
                        case 1:
                            System.out.print("Digite o seu nome: ");
                            setNome(sc.nextLine());
                            System.out.println("===========================================================================");
                            System.out.println("Nome atualizado!");
                            break;
                        case 2:
                            System.out.print("Digite quantos anos você tem: ");
                            int idadeDigitada = sc.nextInt();
                            System.out.println("===========================================================================");
                            if (idadeDigitada > 120 || idadeDigitada < 0) {
                                System.out.println("Idade inválida. Tente novamente.");
                            } else {
                                setIdade(idadeDigitada);
                                System.out.println("Idade atualizada!");
                            }
                            break;
                        case 3:
                            System.out.print("Digite seu CPF (apenas números): ");
                            String cpfDigitado = sc.next();
                            System.out.println("===========================================================================");
                            if (cpfDigitado.length() == 11) {
                                setCpf(cpfDigitado);
                                System.out.println("CPF atualizado!");
                            } else {
                                System.out.println("CPF inválido. Tente novamente.");
                            }
                            break;
                        default:
                            System.out.println("Valor digitado inválido. Tente novamente.");
                            break;
                    }
                    break;
                }
                break;
            case 2:
                System.out.println("Qual dos itens você deseja alterar?");
                System.out.println("0 - Voltar");
                System.out.println("1 - Peso");
                System.out.println("2 - Altura");
                System.out.println("3 - Tipo sanguíneo");

                System.out.print("Digite: ");
                int alterar_fisico = sc.nextInt();
                sc.nextLine();

                switch (alterar_fisico) {
                    case 0:
                        break;
                    case 1:
                        System.out.print("Digite seu peso em kg (somente números): ");
                        double pesoDigitado = sc.nextDouble();
                        System.out.println("===========================================================================");
                        if (pesoDigitado < 0 || pesoDigitado > 500) {
                            System.out.println("Peso inválido.");
                        } else {
                            fisico.setPeso(pesoDigitado);
                            System.out.println("Peso atualizado!");
                        }
                        break;
                    case 2:
                        System.out.print("Digite sua altura em metros (somente números:): ");
                        double alturaDigitada = sc.nextDouble();
                        System.out.println("===========================================================================");
                        if (alturaDigitada < 0 || alturaDigitada > 3) {
                            System.out.println("Altura inválida.");
                        } else {
                            fisico.setAltura(alturaDigitada);
                            System.out.println("Altura atualizada!");
                        }
                        break;
                    case 3:
                        System.out.print("Digite seu tipo sanguíneo (Ex: AB+, O-)");
                        String sangueDigitado = sc.next();
                        System.out.println("===========================================================================");
                        if (sangueDigitado.length() > 3) {
                            System.out.println("Tipo sanguíneo inválido.");
                        } else {
                            fisico.setTipoSanguineo(sangueDigitado.toUpperCase());
                            System.out.println("Tipo sanguíneo atualizado!");
                        }
                        break;
                    default:
                        System.out.println("Item não reconhecido. Tente novamente.");
                        break;
                }
                break;
            case 3:
                System.out.println("Qual dos itens você deseja alterar?");
                System.out.println("0 - Voltar");
                System.out.println("1 - Telefone");
                System.out.println("2 - E-mail");

                System.out.print("Digite: ");
                int alterar_contato = sc.nextInt();
                sc.nextLine();

                switch (alterar_contato) {
                    case 0:
                        break;
                    case 1:
                        System.out.print("Digite seu telefone: ");
                        String telefoneDigitado = sc.nextLine();
                        System.out.println("===========================================================================");
                            contato.setTelefone(telefoneDigitado);
                            System.out.println("Telefone atualizado!");
                        break;
                    case 2:
                        System.out.print("Digite seu email: ");
                        String emailDigitado = sc.nextLine();
                        System.out.println("===========================================================================");
                        if (emailDigitado.contains("@")) {
                            contato.setEmail(emailDigitado);
                            System.out.println("E-mail atualizado.");
                        } else {
                            System.out.println("E-mail inválido. Tenha certeza que contém '@'.");
                        }
                        break;
                    default:
                        System.out.println("Item não reconhecido. Tente novamente.");
                        break;
                }
                break;
            case 4:
                System.out.println("Qual dos itens você deseja alterar?");
                System.out.println("0 - Voltar");
                System.out.println("1 - Rua");
                System.out.println("2 - Número");
                System.out.println("3 - CEP");
                System.out.println("4 - Complemento");

                System.out.print("Digite: ");
                int alterar_endereco = sc.nextInt();
                sc.nextLine();

                switch (alterar_endereco) {
                    case 0:
                        break;
                    case 1:
                        System.out.print("Digite o nome da sua rua: ");
                        String ruaDigitada = sc.nextLine();
                        System.out.println("===========================================================================");
                            endereco.setRua(ruaDigitada);
                            System.out.println("Rua atualizado!");
                        break;
                    case 2:
                        System.out.print("Digite o número da sua moradia: ");
                        String numeroDigitado = sc.nextLine();
                        System.out.println("===========================================================================");
                            endereco.setNumero(numeroDigitado);
                            System.out.println("Número atualizado.");
                        break;
                    case 3:
                        System.out.print("Digite o seu CEP (apenas números [Ex. XXXXXXXX]): ");
                        String cepDigitado = sc.nextLine();
                        System.out.println("===========================================================================");
                        endereco.setCep(cepDigitado);
                        System.out.println("CEP atualizado!");
                        break;
                    case 4:
                        System.out.print("Digite o complemento: ");
                        String complementoDigita = sc.nextLine();
                        System.out.println("===========================================================================");
                        endereco.setComplemento(complementoDigita);
                        System.out.println("Complemento atualizado.");
                        break;
                    default:
                        System.out.println("===========================================================================");
                        System.out.println("Item não reconhecido. Tente novamente.");
                        break;
                }
                break;
        }
    }
}
