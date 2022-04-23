
import com.builder.cars.Car;
import com.builder.builders.CarBuilder;
import com.builder.builders.CarManualBuilder;
import com.builder.director.Director;
import com.builder.cars.CarManual;

public class Principal {

    public static void main(String[] args) {
        Director director = new Director();

        // Director obtém o objeto construtor do cliente concreto(código do aplicativo). 
        // Isso porque o aplicativo sabe melhor qual
        // construtor a ser usado para obter um produto específico.
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);
        // O produto final geralmente é recuperado de um objeto construtor, pois
        // Diretor não tem conhecimento e não depende de construtores concreto e
        // produtos.
        Car car = builder.getResult();
        System.out.println("Carro construido:\n" + car.print());

        
        // O diretor pode conhecer várias receitas de construção.
        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructCityCar(manualBuilder);
        CarManual carManual = manualBuilder.getResult();
        System.out.println("\nCarro manual construido:\n" + carManual.print());
    }
}
