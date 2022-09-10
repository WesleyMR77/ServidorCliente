/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conexaotcp;

import java.io.ObjectInputStream;
import java.net.Socket;
import java.sql.Date;

public class Client {
	public static void main(String[] args) {
		try {
			Socket client = new Socket("localhost", 8888);
			Message m = new Message();
                        ObjectInputStream entrada = new ObjectInputStream(client.getInputStream());
                        String data = (String) entrada.readObject();
			System.out.println("Informação recebida:" + data);
			client.close();
			System.out.println("Conexão encerrada");
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}

			
			
