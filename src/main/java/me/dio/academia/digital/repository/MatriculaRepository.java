package me.dio.academia.digital.repository;

import me.dio.academia.digital.entity.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long> {

    @Query(value = "Select * From tb_matriculas m " +
            "Inner Join tb_alunos a ON m.aluno_id = a.id" +
            "Where a.bairro = :bairro", nativeQuery = true)

    List<Matricula> findByAlunoBairro(String bairro);
}
