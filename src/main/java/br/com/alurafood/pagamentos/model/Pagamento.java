package br.com.alurafood.pagamentos.model;

import java.math.BigDecimal;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "pagamentos")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pagamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Positive
	private BigDecimal valor;
	
	@NotBlank
	@Size(max=100)
	private String nome;
	
	@NotBlank
	@Size(max=19)
	private String numero;
	
	@NotBlank
	@Size(max=7)
	private String expiracao;
	
	@NotBlank
	@Size(min=3, max=3)
	private String codigo;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	static private Status status;
	
	@NotNull
	private Long pedidoId;
	
	@NotNull
	private Long formaDePagamentoId;

	public static void setStatus(Status status) {
		
		
	}
	
}
