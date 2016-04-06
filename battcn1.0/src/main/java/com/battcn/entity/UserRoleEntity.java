package com.battcn.entity;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * 用户 角色 关联 实体
 * @author yujia
 *
 */
@Table(name = "t_mp_user_role")
public class UserRoleEntity implements java.io.Serializable {

	@Transient
	private static final long serialVersionUID = -1725421157391663600L;

	@Column(name = "userId")
	private Long userId;
	@Column(name = "roleId")
	private Long roleId;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

}
