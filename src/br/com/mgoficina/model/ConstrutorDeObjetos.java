package br.com.mgoficina.model;

import java.util.Arrays;
import java.util.Random;

public class ConstrutorDeObjetos {

	public static String nome[] = {"Daniela", "Fabiano", "Sophia", "Otávio", "Helena", "Araújo", "Valentina", "Bernardo",
			"Laura", "Juliano", "Isabella", "Caetano", "Manuela", "Lorenzo", "Fernanda", "Marcelo", "Júlia",
			"Pedro", "Heloísa", "Ronaldo", "Luiza", "Enzo", "Lorena", "Fernando", "Lívia",
			"Luciano", "Giovanna", "Geraldo", "Marcela", "Adriano", "Cecília", "Osvaldo", "Lara",
			"João", "Larissa", "Valdomiro", "Isadora", "Gustavo", "Mariana", "Murilo", "Paola",
			"Henrique", "Stella", "Benício", "Eduarda", "Armando", "Lavínia", "Alfredo", "Ludmila",
			"Lígia", "Eduardo", "Gislaina", "Damião", "Felipa", "Leonardo", "Sara", "Bryan",
			"Elisa", "Antonella", "Melissa", "Celso", "Rafaela", "Antônio",
			"Angela", "Bruno", "Carla", "Edivaldo", "Marina", "Roberto", "Sheila", "Gérson", "Eloá",
			"Francisco", "Alícia", "Sebastião", "Luna", "Rodrigo", "Agatha", "Caio", "Milena", "Augusto",
			"Vitória", "Thiago", "Olívia", "Enrico", "Rebeca", "Bento", "Bianca",
			"Nathan", "Pietra", "Reinaldo", "Letícia", "Gabriela", "Maria", "Luan", "Clara", "John",
			"Allana", "Russo", "Mirella", "Ian", "Catarina"};
	
	public static String sobrenome[] = {"Abravanel", "Abreu", "Almeida", "Alves", "Amaral",
			"Andrade", "Avelar", "Azevedo", "Bagattini", "Barbosa", "Barros", "Bastos",
			"Bezerra", "Bitencourt", "Bonfim", "Borges", "Bosch", "Brandão", "Calazans",
			"Camargo", "Candido", "Cardoso", "Carvalho", "Cerqueira", "Cervantes", "Chaves",
			"Costa", "Cunha", "da Silva", "de Assis", "de Moraes", "de Oliveira", "Dias",
			"dos Santos", "Durre", "Dutra", "Esteves", "Farias", "Fernandes", "Ferreira",
			"Fonseca", "Freitas", "Fuzzeto", "Gaspar", "Gomes", "Gonçalves", "Guedes",
			"Hansen", "Hoffman", "Kneipp", "Leite", "Lima", "Lopes", "Macedo", "Machado",
			"Marcondes", "Marques", "Martins", "Mazzioti", "Meira", "Melo", "Mendes",
			"Meneghel", "Menezes", "Moraes", "Morais", "Moreira", "Mozer", "Nascimento",
			"Nogueira", "Noronha", "Novaes", "Nucci", "Nunes", "Oliveira", "Pacheco",
			"Pereira", "Pravatto", "Prianti", "Públio", "Ramos", "Reis", "Ribeiro",
			"Righetto", "Rizzo", "Rocha", "Rodrigues", "Salles", "Santana", "Santos",
			"Saraiva", "Selicani", "Senna", "Silva", "Soares", "Souto", "Teixeira", "Vieira"};

	public static String cpf[] = {"705.036.758-30", "624.118.614-00", "388.655.308-63", "028.867.013-27", "775.214.142-92",
			"540.473.154-00", "648.603.385-10", "560.202.166-32", "744.241.448-60", "747.835.535-80",
			"672.283.048-96", "343.255.474-52", "561.511.108-97", "511.750.020-20", "684.451.256-21",
			"413.070.568-73", "603.687.612-23", "788.438.277-66", "686.031.681-05", "705.580.035-83",
			"700.828.243-55", "780.224.824-80", "283.383.833-68", "362.140.277-20", "426.882.788-94",
			"811.643.218-46", "073.218.472-09", "726.051.008-04", "410.283.600-45", "353.081.871-26",
			"401.546.432-03", "253.884.002-39", "250.341.383-87", "046.721.613-40", "321.043.036-56",
			"488.547.261-09", "624.535.218-53", "044.227.285-55", "031.472.644-67", "216.250.822-23",
			"414.360.878-21", "544.213.656-53", "502.728.600-77", "783.687.508-30", "203.526.347-66",
			"517.610.056-85", "327.387.044-33", "563.015.753-18", "570.561.622-82", "506.153.537-54",
			"278.456.386-33", "366.313.751-18", "877.384.085-88", "483.680.635-66", "775.204.067-33", 
			"636.742.881-09", "627.567.673-60", "072.337.351-58", "301.843.151-07", "272.374.636-40",
			"486.656.136-09", "025.312.066-71", "633.612.208-58", "750.184.545-04", "111.116.854-79",
			"164.376.226-52", "537.022.745-45", "640.821.621-86", "248.153.266-06", "747.152.420-01",
			"342.435.088-52", "372.043.842-29", "374.578.603-39", "235.382.132-40", "451.242.434-22",
			"606.136.061-40", "364.740.465-97", "605.060.123-28", "222.221.752-08", "603.301.451-00",
			"554.820.076-34", "030.182.677-37", "146.777.178-34", "238.152.664-16", "737.387.018-00",
			"047.741.515-64", "086.012.663-39", "114.550.342-07", "552.482.268-30", "317.678.854-15",
			"780.784.434-55", "128.631.713-48", "026.205.825-12", "348.376.213-25", "400.223.451-75",
			"512.388.030-59", "600.486.602-48", "018.811.808-08", "058.317.872-30", "185.685.804-91"};

	public static int idade[] = {18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32,
			33, 34,	35, 36, 37, 38, 39, 40, 41,	42, 43, 44, 45, 46, 47, 48, 49, 50};

	public static void main(String[] args) {

		buildClient(50);

	}

	// Criar método que salva em um arquivo txt a construcao de um objeto

	public static void imprimir(String[] nome) {
		Arrays.sort(nome);
		for (int i = 0; i < nome.length; i++) {
			System.out.println("Posição " + i + " - " + nome[i]);
		}
	}

	public static void buildClient(int number) {

		char sexo;
		
		Random randomName = new Random();

		for (int i = 0; i < number; i++) {
			int index = randomName.nextInt(nome.length);
			int sobrenomeIndex = randomName.nextInt(sobrenome.length);
			int cpfIndex = randomName.nextInt(cpf.length);
			int idadeIndex = randomName.nextInt(idade.length);
			
			if (nome[index].endsWith("o") || nome[index].endsWith("n")) {
				sexo = 'M';
			} else {
				sexo = 'F';
			}
			
			System.out.println("Cliente cliente" + (i+1) + " = new Cliente(\"" + nome[index] + " " + sobrenome[sobrenomeIndex]
					+ "\", \"" + cpf[cpfIndex] + "\", " + idade[idadeIndex] + ", \'" + sexo + "\', " + (i+1) + "L);");
		}

	}

}
