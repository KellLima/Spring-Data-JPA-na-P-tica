package me.dio.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.dio.academia.digital.entity.Aluno;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaForm {

  private Long alunoId;

  @NotNull(message = "Preencha o campo corretamente.")
  @Positive(message = "O id do aluno precisa ser positivo.")
  private double peso;

  @NotNull(message = "Preencha o campo corretamente.")
  @Positive(message = "O id do aluno precisa ser positivo.")
  @DecimalMin(value = "150", message = "'{validateValue}' precisa ser no mínimo {value}.")
  private double altura;
}
