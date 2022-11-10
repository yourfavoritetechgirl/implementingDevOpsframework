package com.simplilearn.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.simplilearn.pojo.EProduct;

@Repository
public class EProductDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<EProduct> getProducts(){
		
		return jdbcTemplate.query("SELECT * FROM eproduct_12072022;",  new RowMapper<EProduct>(){

			@Override
			public EProduct mapRow(ResultSet rs, int rowNum) throws SQLException {
				EProduct product = new EProduct();
				product.setProductId(rs.getLong(1));
				product.setProductName(rs.getString(2));
				product.setProductPrice(rs.getDouble(3));
				return product;
			}				
		});
	}

}
