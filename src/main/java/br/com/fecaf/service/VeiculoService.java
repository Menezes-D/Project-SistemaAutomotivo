package br.com.fecaf.service;


import br.com.fecaf.model.Veiculo;
import br.com.fecaf.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Optional;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository veiculoRepository;

    public List<Veiculo> listarVeiculos() {
        return veiculoRepository.findAll();
    }

    public Veiculo salvarVeiculo(Veiculo veiculo) {
        return veiculoRepository.save(veiculo);
    }

    public Optional<Veiculo> consultarVeiculo(Integer id) {
        return veiculoRepository.findById(id);
    }

    public void deletarVeiculo(Integer id) {
        veiculoRepository.deleteById(id);
    }

    public Veiculo atualizarVeiculo(Integer id, Veiculo veiculoAtualizado) {
        Optional<Veiculo> veiculoExistente = veiculoRepository.findById(id);

        if (veiculoExistente.isPresent()) {
            Veiculo veiculo = veiculoExistente.get();
            veiculo.setMarca(veiculoAtualizado.getMarca());
            veiculo.setModelo(veiculoAtualizado.getModelo());
            veiculo.setPreco(veiculoAtualizado.getPreco());
            veiculo.setAnoFabricacao(veiculoAtualizado.getAnoFabricacao());
            veiculo.setCor(veiculoAtualizado.getCor());
            veiculo.setQuilometragem(veiculoAtualizado.getQuilometragem());
            veiculo.setStatusDisponibilidade(veiculoAtualizado.getStatusDisponibilidade());

            return veiculoRepository.save(veiculo);
        }else {
            throw new RuntimeException("Veiculo não encontrado com o ID: " + id);
        }
    }
}
