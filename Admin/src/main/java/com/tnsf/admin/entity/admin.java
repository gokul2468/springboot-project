package com.tnsf.admin.entity;

	public class admin {
		private Long id;
		private String username;
		private String email;
		private String password;
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getUsername() {
			return username;
		}
		public admin() {
			super();
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}

}
