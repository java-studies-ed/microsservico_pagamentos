package br.com.alurafood.pagamentos.dto;

import java.math.BigDecimal;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import br.com.alurafood.pagamentos.model.Status;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PagamentoDto {
	private Long id;
	private BigDecimal valor;
	private String nome;
	private String numero;
	private String expiracao;
	private Status status;
	private Long pedidoId;
	private Long formaDePagamentoId;

}
