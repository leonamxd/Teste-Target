package br.target;

public class Questão4 {

	public static void main(String[] args) {
        
        System.out.println("Considerando que a distância entre Ribeirão Preto e Franca é de 100 km, e que o caminhão leva 5 minutos a mais para passar em cada um dos dois pedágios, podemos encontrar a distância percorrida por cada veículo até o ponto de encontro e, a partir disso, descobrir qual deles está mais próximo de Ribeirão Preto.");
        System.out.println("Vamos chamar de \"d\" a distância percorrida pelo carro até o ponto de encontro. O caminhão percorrerá uma distância ligeiramente menor, já que demora mais tempo para passar pelos pedágios. Vamos chamar essa distância de \"d - x\", onde \"x\" é a distância adicional percorrida pelo carro enquanto o caminhão passa pelos pedágios.");
        System.out.println("Usando a fórmula \"distância = velocidade x tempo\", podemos escrever:");
        System.out.println("d = 110t");
        System.out.println("d - x = 80t + 10/60");
        System.out.println("O tempo que o caminhão leva a mais para passar pelos dois pedágios é de 2 x 5/60 = 1/6 horas, ou 10 minutos. Portanto:");
        System.out.println("x = 110 x 1/6 = 18,33 km");
        System.out.println("Substituindo o valor de \"x\" na segunda equação, temos:");
        System.out.println("d - 18,33 = 80t + 10/60");
        System.out.println("Agora podemos igualar as duas equações e resolver para \"t\":");
        System.out.println("110t = 80t + 18,33 + 10/60");
        System.out.println("30t = 18,58");
        System.out.println("t = 0,62 horas");
        System.out.println("Substituindo o valor de \"t\" na primeira equação, encontramos:");
        System.out.println("d = 110 x 0,62 = 68,2 km");
        System.out.println("Portanto, o ponto de encontro estará a 68,2 km de Ribeirão Preto e 31,8 km de Franca. Como o carro percorreu uma distância maior até o ponto de encontro, ele estará mais próximo de Ribeirão Preto. O caminhão, por sua vez, estará mais próximo de Franca.");
	}
}