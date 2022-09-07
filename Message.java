/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conexaotcp;

import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class Message {
	public static void main(String[] args) {
		try {
                    
			ServerSocket servidor = new ServerSocket(8888);
			System.out.println("Servidor ouvindo a porta 8888");
			while (true) {
				Socket socket = servidor.accept();
				System.out.println("Cliente conectado: " + socket.getInetAddress().getHostAddress());
				ObjectOutputStream saida = new ObjectOutputStream(socket.getOutputStream());
				saida.flush();
				saida.writeObject(getMessage());
				saida.close();
				socket.close();
			}
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
        
        public static String getMessage(){
            String phrases[] = new String[12];
            phrases[0] = "Essa mensagem é de resposta";
            phrases[1] = "Você gostaria de saber sobre o ...? erro na conexão :) ";
            phrases[2] = "Olhe para o alto, olhe para baixo, olhe para frente e olhe para traz, viu alguma coisa?";
            phrases[3] = "Tudo que desse cai, pera não, tudo que sobre desce!";
            phrases[4] = "Qual o seu celular? não precisa responder ;)";
            String message =  phrases[new Random().nextInt(5)];
            
            return message;
        }
}
