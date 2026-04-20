package mx.uv.javc.inventario;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import mx.uv.javc.inventario.entity.Producto;
import mx.uv.javc.inventario.repository.ProductoRepository;

@SpringBootApplication
public class InventarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventarioApplication.class, args);
	}

	@Bean
    CommandLineRunner initData(ProductoRepository repository) {
       /* return args -> {
			Producto p1 = new Producto();
			p1.setNombre("Laptop Dell");
        	p1.setDescripcion("Laptop 15\" i7 16GB RAM");
        	p1.setPrecio(18999.99);
        	p1.setStock(12);
        	p1.setCategoria("Electrónica");
        	repository.save(p1);
        }; */
		return args -> {
            repository.save(new Producto(null, "Laptop Dell", "Laptop 15\" i7 16GB RAM", 18999.99, 12, "Electrónica", null));
            repository.save(new Producto(null, "Mouse inalámbrico", "Mouse Logitech MX Master 3", 899.99, 45, "Accesorios", null));
            repository.save(new Producto(null, "Audífonos Sony", "Audífonos con cancelación de ruido", 2499.99, 8, "Audio", null));
            System.out.println("Datos de prueba cargados en la base de datos");
        };
    }
}
