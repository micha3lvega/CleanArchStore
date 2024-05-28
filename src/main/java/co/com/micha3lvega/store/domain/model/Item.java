package co.com.micha3lvega.store.domain.model;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item implements Serializable {

	private static final long serialVersionUID = -5202341948160695728L;

	private Product product;
	private BigDecimal value;
	private int quantity;

}
