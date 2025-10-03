package br.com.fiap.Checkpoint2.repository;

import br.com.fiap.Checkpoint2.model.OrderModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderModel, Long> {


}
