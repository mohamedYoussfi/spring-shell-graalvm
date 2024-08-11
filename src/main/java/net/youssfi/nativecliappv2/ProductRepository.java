package net.youssfi.nativecliappv2;

import net.youssfi.nativecliappv2.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
