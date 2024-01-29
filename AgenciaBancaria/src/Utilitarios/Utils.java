package Utilitarios;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Utils {

	static NumberFormat formatandoValores = new DecimalFormat("R$ #,##0.00");

	public static String doubleToString(Double valor) {
		return formatandoValores.format(valor);
	}

}


//código em Java que utiliza a classe NumberFormat e DecimalFormat 
//para formatar um valor Double como uma string com um formato específico de moeda brasileira (R$).

//static NumberFormat formatandoValores = new DecimalFormat("R$ #,##0.00");
//Aqui, você cria um objeto DecimalFormat chamado formatandoValores com o padrão de formatação "R$ #,##0.00".
//Esse padrão formata o número como uma quantia em reais brasileiros, com duas casas decimais e separadores de milhares.
