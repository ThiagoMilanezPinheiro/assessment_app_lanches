package br.milanez.lanches.appLanchesMilanez.model.leitura;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

import br.milanez.lanches.appLanchesMilanez.model.negocio.Bebida;
import br.milanez.lanches.appLanchesMilanez.model.negocio.Pizza;
import br.milanez.lanches.appLanchesMilanez.model.negocio.PizzaDoce;
import exceptions.AdicionalCaldaInvalidaException;
import exceptions.MedidaNegativaException;
import exceptions.PorcaoInvalidaException;

public class ArquivoTeste {

	public static void main(String[] args) {
		
		String dir = "C:/Users/thiag/eclipse-workspace/appLanchesMilanez/appLanchesMilanez/";
		
		String arquivo = "pedidos.txt";
		
		try {
			FileReader leitura = new FileReader(dir+arquivo);			
			BufferedReader in = new BufferedReader(leitura);
			
			FileWriter escrita = new FileWriter(dir+"out_"+arquivo);
			BufferedWriter out = new BufferedWriter(escrita);
			
			String linha = in.readLine();
			
			while(linha != null) {
				String[] campos = linha.split(";");
				System.out.println(Arrays.toString(campos));
				
				if(campos.length != 5) {
					switch (campos[0].toUpperCase()) {
					case "B":
						Bebida bebida = new Bebida(campos[1], Float.valueOf(campos[2]), Boolean.valueOf(campos[3]), Boolean.valueOf(campos[4]));
						bebida.setMedida(Float.valueOf(campos[5]));
						bebida.setMarca(campos[6]);
						
						
						out.write(bebida.obterValorProduto());
						break;

					case "P":
						Pizza pizza = new Pizza(campos[1], Float.valueOf(campos[2]), Boolean.valueOf(campos[3]), Boolean.valueOf(campos[4]));
						pizza.setEsfiha(Boolean.valueOf(campos[5]));
						pizza.setPorcao(Integer.valueOf(campos[6]));

						

						out.write(pizza.obterValorProduto());
						break;
						
					case "D":
						PizzaDoce pizzadoce = new PizzaDoce(campos[1], Float.valueOf(campos[2]), Boolean.valueOf(campos[3]));
						pizzadoce.setBorda(Boolean.valueOf(campos[4]));
						pizzadoce.setAdicionalCalda(Float.valueOf(campos[5]));

						out.write(pizzadoce.obterValorProduto());
						break;
						
					default:
						break;
					}
				}
				
				linha = in.readLine();
			}

			in.close();
			leitura.close();
			out.close();
			escrita.close();
			System.out.println(args.length == 1 ? args[0] : "Compra Finalizada com Sucesso!!!");
			
		} catch (IOException | MedidaNegativaException | PorcaoInvalidaException | AdicionalCaldaInvalidaException e) {
			System.out.println(e.getMessage());
		}		
		
	}

}
