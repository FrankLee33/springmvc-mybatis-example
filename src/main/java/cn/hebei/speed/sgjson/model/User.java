package cn.hebei.speed.sgjson.model;

import java.util.Date;

import lombok.Data;

@Data
public class User implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2056309779139418430L;
	private Long id;
	private String login_name;
	private String full_name;
	private String picture;
	private char sex;
	private String email;
	private Date last_login_time;
	private String last_login_ip;
	private String remarks;
}
