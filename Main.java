

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int op = 0;

        ArrayList<Cliente> listCliente = new ArrayList<Cliente>();

        ArrayList<Veiculo> listVeiculo = new ArrayList<Veiculo>();

        ArrayList<Locacao> listAlugado = new ArrayList<Locacao>();

        while(true) {
            new Clear().clearConsole();
            System.out.print("\n  Locadora de Veiculos\n\n  1 - Cadastrar veículo\n  2 - Cadastrar cliente\n  3 - Locação de veículo\n  4 - Listagem de veículos cadastrados\n  5 - Listagem de veículos disponíveis\n  6 - Listagem de cliente\n  7 - Sair\n");
            if(op == -666){
                System.out.print("\n  Opção invalida!");
            }
            System.out.print("\n  Escolha uma opcão: ");
                op = leitor.nextInt();

                leitor.nextLine();
            

            switch (op) {
                case 1: // cadastrar veiculo
                    Veiculo veiculo = new Veiculo();
                    veiculo.CadastrarVeiculo();
                    while(true) {
                        new Clear().clearConsole();
                        System.out.print("\n  Cadastro veiculo\n\n  Deseja adicionar veiculo\n\n  1 - Sim\n  2 - Não\n");
					
                        System.out.print("\n  Escolha uma opcão: ");
                        
                            op = leitor.nextInt();
                        
                            leitor.nextLine();
                        
                        if(op == 1) {
                            listVeiculo.add(veiculo);
    						break;
    					} else if(op == 2) {
    						System.out.println("Obrigada, volte sempre!");
    						break;
    					}
                    }
    			
                case 2: // cadastrar cliente
                    Cliente cliente = new Cliente();
                    cliente.Cadastrar();
                    while(true) {
                        new Clear().clearConsole();
                        System.out.printf("\n  Cadastro cliente\n\n  Deseja adicionar cadastro: %s\n\n  1 - Sim\n  2 - Não\n", cliente.getNome(), cliente.getEnd(), cliente.getTelefone(), cliente.getIdade(), cliente.getRg(), cliente.getCpf());
                            leitor.nextLine();
                        }
                        if(op == 1) {
                            listCliente.add(cliente);
    						break;
    					} else if(op == 2) {
    						System.out.println("obrigado, volte sempre!");
    						break;
    					}
    					
                case 3: // locação de veículo
                    if (listCliente.size() == 0){
                        leitor.nextLine();
                        System.out.println("  Nem um cliente cadastrado!!!");
                        leitor.nextLine();
                    }
                    else {
                      int clienteAL=0;
                      int carroAL=0;
                      System.out.println("  Clientes disponíveis: ");
                      for(int x = 0; x < listCliente.size(); x++){
                          cliente = listCliente.get(x);
                          System.out.println("  "+x+1 + " " + cliente.getNome(), cliente.getEnd(), cliente.getTelefone(), cliente.getIdade(), cliente.getRg(), cliente.getCpf());
                      }
                      while(true) {
                        try {
                          System.out.print("\n  Escolha um locatário: ");
                          clienteAL = leitor.nextInt();
                        } catch(InputMismatchException a) {
                          System.out.print("\n  Tente novamente, digite apenas números");
                          leitor.nextLine();
                        }
                        if (clienteAL < listCliente.size() || clienteAL > listCliente.size()) {
                          System.out.println("Favor informar cliente que foram listados!");
                        }
                        else break;
                      }


                      new Clear().clearConsole();
                      System.out.print(" Veiculos Disponiveis\n" + listVeiculo.size());
                      for(int x = 0; x < listVeiculo.size(); x++){
                          if(listVeiculo.get(x).isDisponivel()){
                              System.out.printf("\n%2d  ", x+1);

                          }
                      }
                      while(true) {
                        
                          System.out.print("\n  Escolha um carro: ");
                          carroAL = leitor.nextInt();
                                                 leitor.nextLine();
                        }
                        if (clienteAL < listCliente.size() || clienteAL > listCliente.size()) {
                          System.out.println("Favor informar carro que foram listados!");
                        }
                        else break;
                      }

                      Locacao alugado = new Locacao();
                      alugado.alugar(clienteAL-1,listVeiculo.get(carroAL-1));

                      while(true) {
                          new Clear().clearConsole();
                          System.out.printf("\n  Locação de Veículos\n\n  Deseja adicionar aluguel: \n\n  1 - Sim\n  2 - Não\n");
             		
                          System.out.print("\n  Escolha uma opcão: ");
                    
                              op = leitor.nextInt();
                       
                              leitor.nextLine();
                          
                          if(op == 1) {
                              while(true) {
                                leitor.nextLine();
                                
                              listVeiculo.get(carroAL-1).setDisponivel(false);
                              listAlugado.add(alugado);
                              System.out.println("Veiculo alugado!");
                              }
      						break;
      					} else if(op == 2) {
      						System.out.println("obrigado, volte sempre!");
      						break;
      				   }
                    }

                    break;
                    }
                case 4: // Lista de veículos
                    new Clear().clearConsole();
                    System.out.print("\n  Listagem de veículos cadastrados\n\n      Tipo   Descrição");
                    for(int x = 0; x < listVeiculo.size(); x++){
                        System.out.printf("\n  %2d  ", x+1);
                        System.out.printf("Carros:", listVeiculo.get(x).getMarca(), listVeiculo.get(x).getMotor(), listVeiculo.get(x).getCor(),listVeiculo.get(x).getMarca(),listVeiculo.get(x).getCombustivel(), listVeiculo.get(x).getKm());
                   
                    }
                    System.out.print("\n\n  Pressione enter para continuar ");
                    leitor.nextLine();
                    leitor.nextLine();
                    break;
}
    
                case 5: // lista de veiculos disponiveis
                	
                    new Clear().clearConsole();
                    System.out.print("\n  Listagem de veículos cadastrados\n\n      Tipo   Descrição                       Placa     Partida  Num. passageiros");
                    for(int x = 0; x < listVeiculo.size(); x++){
                        if(listVeiculo.get(x).isDisponivel()){
                            System.out.printf("\n  %2d  ", x+1);
                            System.out.printf("Carros:", listVeiculo.get(x).getMarca(), listVeiculo.get(x).getMotor(), listVeiculo.get(x).getCor(),listVeiculo.get(x).getMarca(),listVeiculo.get(x).getCombustivel(), listVeiculo.get(x).getKm());
                            
                        }
            
                                   }
                    System.out.print("\n\n  Pressione enter para continuar ");
                    leitor.nextLine();
                    leitor.nextLine();
                    break;
                	
                	
                	
                	
                	
                case 6:
                    new Clear().clearConsole();
                    System.out.print("\n  Listagem de cliente\n\n      Nome                            Endereço           Telefone  Idade	RG	CPF");
                    for(int x = 0; x < listCliente.size(); x++){
                        System.out.printf("\n  %2d  ", x+1);
                        System.out.printf("%-30s  %-11d   %-5d  %-30s", listCliente.get(x).getNome(), listCliente.get(x).getEnd(),  listCliente.get(x).getTelefone(),listCliente.get(x).getIdade(), listCliente.get(x).getRg(),listCliente.get(x).getCpf();
                    }
                    System.out.print("\n\n  Pressione enter para continuar ");
                    leitor.nextLine();

                    leitor.nextLine();
                    break;
                case 7:
                    System.exit(0);
                default:

        }
    }
}