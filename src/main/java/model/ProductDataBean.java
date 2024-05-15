package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDataBean {

	private String productId;
	private String productName;
	private String price;
	private String imageURL;
	private String category;
	private String productType;
	private String productDesc;
}
