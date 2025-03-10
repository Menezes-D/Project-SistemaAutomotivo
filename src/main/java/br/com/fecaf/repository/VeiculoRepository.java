package br.com.fecaf.repository;

import br.com.fecaf.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VeiculoRepository extends JpaRepository<Veiculo, Integer> {

    List<Veiculo> findByMarca(String marca);

    List<Veiculo> findByStatusDisponibilidade(String status);

    List<Veiculo> findByAnoFabricacao(Integer ano);
}
