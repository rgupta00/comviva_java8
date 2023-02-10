package com.blogapp.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class ErrorDetails {
	private String details;
	private String name;
	private String statusCode;
	private LocalDateTime timestemp;
	
}
