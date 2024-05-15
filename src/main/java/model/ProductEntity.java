package model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("products")
public class ProductEntity {

	private String productId;
	private String productName;
	private String price;
	private String imageURL;
	private String category;
	private String productType;
	private String productDesc;
	
}
