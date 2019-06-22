package entity;

import java.io.Serializable;
import java.util.List;

/**
 * 封装分页结果的实体类
 * @author Administrator
 *
 */
public class PageResult implements Serializable {
	private long total;//总记录数
	private List rows;//当前页结果
	
	public PageResult(long total, List rows) {
		super();
		this.total = total;
		this.rows = rows;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public List getRows() {
		return rows;
	}

	public void setRows(List rows) {
		this.rows = rows;
	}
}
