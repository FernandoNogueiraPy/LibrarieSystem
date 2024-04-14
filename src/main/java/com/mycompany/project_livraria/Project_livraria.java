package com.mycompany.project_livraria;

import java.util.List;
import Entitys.EntityBook;
import Storage.Books;
import java.util.Scanner;
import Functions.MethodsLibrarie;

/* @author Moltt */

public class Project_livraria {
    
    private List<EntityBook> available_books;
    private Scanner scanner;

    public Project_livraria() {
        this.available_books = Books.AvailableBooks();
        this.scanner = new Scanner(System.in);
    }
    
    public void start() {
        int opcao;
      
        do {
            System.out.println("Menu:");
            System.out.println("1. Inserir um livro");
            System.out.println("2. Excluir um livro");
            System.out.println("3. Mostrar todos os livros");
            System.out.println("4. Buscar um livro");
            System.out.println("0. Sair\n");
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcao) {
                case 1:
                    MethodsLibrarie.BookInsert(available_books);
                    break;
                case 2:
                    MethodsLibrarie.BookDelete(available_books);
                    break;
                case 3:
                    MethodsLibrarie.AllBooks(available_books);
                    break;
                case 4:
                    MethodsLibrarie.BookSearch(available_books);
                    break;
       
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
        
        scanner.close();
    }
    
    public static void main(String[] args) {
        Project_livraria project = new Project_livraria();
        project.start();
    }
}



