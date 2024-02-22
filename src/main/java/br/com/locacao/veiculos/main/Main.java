package br.com.locacao.veiculos.main;

import br.com.locacao.veiculos.main.models.Automovel;
import br.com.locacao.veiculos.main.models.Cliente;
import br.com.locacao.veiculos.main.models.Locacao;
import br.com.locacao.veiculos.main.models.Marca;
import br.com.locacao.veiculos.main.models.Modelo;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
    	
    	Marca marca = new Marca("Honda ");

        Modelo modelo = new Modelo("Sedan", marca);

        Automovel automovel = new Automovel();
        automovel.setModelo(modelo);
        automovel.setPlacaAutomovel("GRP2004");
        automovel.setCorAutomovel("Preto");

        Cliente cliente = new Cliente();
        cliente.setCpfCliente(11122233344L);
        cliente.setNomeCliente("Gabriel Rocha Paes");

        Locacao locacao = new Locacao();
        locacao.setCliente(cliente);
        locacao.setDataHoraLocacao(new Date());
        locacao.setQuilometragemLocacao(10000L);
        locacao.setValorLocacao(200.00);

        System.out.println("Informações do Automóvel:");
        System.out.println(automovel.consultarAutomovel());
        System.out.println();

        System.out.println("Informações do Cliente:");
        System.out.println(cliente.consultarCliente());
        System.out.println();

        System.out.println("Informações da Locação:");
        System.out.println("Data e Hora da Locação: " + locacao.getDataHoraLocacao());
        System.out.println("Quilometragem da Locação: " + locacao.getQuilometragemLocacao());
        System.out.println("Valor da Locação: " + locacao.getValorLocacao());
    }
}
