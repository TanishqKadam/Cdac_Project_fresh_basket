package com.freshbasket.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
@Table(name = "stock_details")
@JsonInclude(Include.NON_NULL)
public class StockDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id", unique = true, nullable = false, length = 10)
	private Integer id;

	@Column(name = "stock_item", nullable = false, length = 50, unique = true)
	private String stockItem;

	@Column(nullable = false, length = 10)
	private int quantity;

	@Column(name = "price_per_unit", precision = 12)
	private float pricePerUnit;

	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;

	@ManyToOne
	@JoinColumn(name = "farmer_id")
	private Farmer farmer1;

	@Column(name = "product_image", length = 400)
	private String imagePath;

	public StockDetails() {
		System.out.println("StockDetails Constructor invoked");
	}

	public StockDetails(Integer id, String stockItem, float pricePerUnit) {
		super();
		this.id = id;
		this.stockItem = stockItem;
		this.pricePerUnit = pricePerUnit;
	}

	public StockDetails(Integer id, String stockItem, int quantity, float pricePerUnit, Category category) {
		super();
		this.id = id;
		this.stockItem = stockItem;
		this.quantity = quantity;
		this.pricePerUnit = pricePerUnit;
		this.category = category;
	}

	public StockDetails(Integer id, String stockItem, int quantity, float pricePerUnit, Category category,
			String imagePath) {
		super();
		this.id = id;
		this.stockItem = stockItem;
		this.quantity = quantity;
		this.pricePerUnit = pricePerUnit;
		this.category = category;
		this.imagePath = imagePath;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStockItem() {
		return stockItem;
	}

	public void setStockItem(String stockItem) {
		this.stockItem = stockItem;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(float pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Farmer getFarmer1() {
		return farmer1;
	}

	public void setFarmer1(Farmer farmer1) {
		this.farmer1 = farmer1;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	@Override
	public String toString() {
		return "StockDetails [id=" + id + ", stockItem=" + stockItem + ", quantity=" + quantity + ", pricePerUnit="
				+ pricePerUnit + ", category=" + category + ", farmer1=" + farmer1 + ", imagePath=" + imagePath + "]";
	}

}
