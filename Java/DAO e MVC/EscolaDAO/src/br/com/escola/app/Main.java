/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.escola.app;

import br.com.escola.model.Aluno;
import br.com.escola.dao.AlunoDAO;

import java.util.Scanner;

/**
 *
 * @author MIGUELVARGASFERREIRA responsabilidade: usar o DAO e receber dados do
 * usuário
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AlunoDAO dao = new AlunoDAO();
        System.out.println("Quantos alunos deseja cadastrar? ");
        int quantidade = sc.nextInt();
        sc.nextLine();
        // loop para cadstrar alunos
        for (int i = 1; i <= quantidade; i++) {
            System.out.println("Digite o nome do aluno" + i + " : ");
            String nome = sc.nextLine();
            // cria o aluno (model)

            Aluno aluno = new Aluno(nome);
            // Envia para o DAO salvar no banco
            dao.cadastrar(aluno);

        }
        System.out.println("=== Alunos Cadastrados ===");
        dao.list().forEach(aluno -> {
            System.out.println(aluno.getId() + " - " + aluno.getNome());
        });
                sc.close();
        }
    
    }
