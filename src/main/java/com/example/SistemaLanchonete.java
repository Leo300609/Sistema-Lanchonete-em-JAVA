package com.example;

import java.util.Scanner;

public class SistemaLanchonete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadePedidos = 0;
        double valorTotalVendas = 0.0;
        double maiorValor = 0.0;
        double menorValor = 0.0;
        
        int opcaoContinuar = 1;

        System.out.println("=== SISTEMA DE PEDIDOS ===\n");

        do {
            System.out.print("Nome do cliente: ");
            String nomeCliente = scanner.nextLine();

            double valorCompra = 0.0;
            boolean valorValido = false;
            
            while (!valorValido) {
                System.out.print("Valor da compra (ex: 35,50): ");
                String entradaValor = scanner.nextLine();
                
                try {
                    valorCompra = Double.parseDouble(entradaValor.replace(",", "."));

                    if (valorCompra > 0) {
                        valorValido = true;
                    } else {
                        System.out.println("Erro: O valor da compra deve ser maior que zero.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Erro: Digite um número válido.");
                }
            }

            quantidadePedidos++;
            valorTotalVendas += valorCompra;

            if (quantidadePedidos == 1) {
                maiorValor = valorCompra;
                menorValor = valorCompra;
            } else {
                if (valorCompra > maiorValor) {
                    maiorValor = valorCompra;
                }
                if (valorCompra < menorValor) {
                    menorValor = valorCompra;
                }
            }

            System.out.println("\nCadastrar novo pedido?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            System.out.print("Opção: ");
            opcaoContinuar = Integer.parseInt(scanner.nextLine());
            System.out.println();

        } while (opcaoContinuar == 1);

        System.out.println("===== RELATÓRIO FINAL =====");
        if (quantidadePedidos > 0) {
            double ticketMedio = valorTotalVendas / quantidadePedidos;

            System.out.printf("Quantidade de pedidos: %d\n", quantidadePedidos);
            System.out.printf("Valor total vendido: R$ %.2f\n", valorTotalVendas);
            System.out.printf("Ticket médio: R$ %.2f\n", ticketMedio);
            System.out.printf("Maior compra: R$ %.2f\n", maiorValor);
            System.out.printf("Menor compra: R$ %.2f\n", menorValor);
        } else {
            System.out.println("Nenhum pedido foi cadastrado durante o dia.");
        }

        scanner.close();
    }
}