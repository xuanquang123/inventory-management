package inventory.model;
// Generated May 10, 2021, 4:18:41 PM by Hibernate Tools 5.4.30.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.springframework.web.multipart.MultipartFile;

/**
 * ProductInfo generated by hbm2java
 */
public class ProductInfo implements java.io.Serializable {

	private Integer id;
	private Category category;
	private String name;
	private String code;
	private String description;
	private String imgUrl;
	private int activeFlag;
	private Date createDate;
	private Date updateDate;
	private Set productInStocks = new HashSet(0);
	private Set histories = new HashSet(0);
	private Set invoices = new HashSet(0);
	private MultipartFile multipartFile;
 
	public ProductInfo() {
	}

	public ProductInfo(Category category, String name, String code, String description, String imgUrl, int activeFlag,
			Date createDate, Date updateDate) {
		this.category = category;
		this.name = name;
		this.code = code;
		this.description = description;
		this.imgUrl = imgUrl;
		this.activeFlag = activeFlag;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}

	public ProductInfo(Category category, String name, String code, String description, String imgUrl, int activeFlag,
			Date createDate, Date updateDate, Set productInStocks, Set histories, Set invoices) {
		this.category = category;
		this.name = name;
		this.code = code;
		this.description = description;
		this.imgUrl = imgUrl;
		this.activeFlag = activeFlag;
		this.createDate = createDate;
		this.updateDate = updateDate;
		this.productInStocks = productInStocks;
		this.histories = histories;
		this.invoices = invoices;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImgUrl() {
		return this.imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public int getActiveFlag() {
		return this.activeFlag;
	}

	public void setActiveFlag(int activeFlag) {
		this.activeFlag = activeFlag;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Set getProductInStocks() {
		return this.productInStocks;
	}

	public void setProductInStocks(Set productInStocks) {
		this.productInStocks = productInStocks;
	}

	public Set getHistories() {
		return this.histories;
	}

	public void setHistories(Set histories) {
		this.histories = histories;
	}

	public Set getInvoices() {
		return this.invoices;
	}

	public void setInvoices(Set invoices) {
		this.invoices = invoices;
	}

	public MultipartFile getMultipartFile() {
		return multipartFile;
	}

	public void setMultipartFile(MultipartFile multipartFile) {
		this.multipartFile = multipartFile;
	}
}
