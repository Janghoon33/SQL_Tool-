package com.jh.tool.model;

import java.sql.Date;
import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
@Entity
@Table(name="sw_execute_log")
public class sw_execute_log {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="database_id", referencedColumnName = "database_id")
	private sw_database sw_database;
	
	@Column
	private String client_ip;
	
	@Column
	@CreatedDate
	private LocalDateTime exec_date;
	
	@Column
	private String sql_text;
	
	@Column
	private String sql_type;
	
	@Column
	private boolean result;
	
	@Column
	private String message;

	
	
	
}
