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
			Socket c = new Socket("localhost", 8888);
			Message m = new Message();
			String data = (String) m.getMessage();
			System.out.println("Informação recebida:" + data);
			//m.close();
			System.out.println("Conexão encerrada");
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}
