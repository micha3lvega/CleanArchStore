package co.com.micha3lvega.store.domain.model;

import java.io.Serializable;

import org.springframework.validation.annotation.Validated;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Validated
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "customers")
public class Customer implements Serializable {

	private static final long serialVersionUID = -2298005983214907280L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String email;
}
