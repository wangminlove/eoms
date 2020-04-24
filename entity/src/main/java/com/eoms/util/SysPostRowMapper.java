package com.eoms.util;

import com.eoms.entity.SysPost;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

   /**
    * @文件名称：SysPostRowMapper.java
    * @创建时间：2020-04-21 15:02:44
    * @创  建  人：王敏 
    * @文件描述：SysPostRowMapper 类
    * @文件版本：V0.01 
    */ 
public class SysPostRowMapper implements RowMapper<SysPost> {
	@Override
	public SysPost mapRow(ResultSet resultSet, int i) throws SQLException {
		String postId = resultSet.getString("post_id");
		String postName = resultSet.getString("post_name");
		String deleted = resultSet.getString("deleted");
		String postLevel = resultSet.getString("post_level");
		String parentId = resultSet.getString("parent_id");
		String description = resultSet.getString("description");
		SysPost SysPost = new SysPost();
		SysPost.setPostId(postId);
		SysPost.setPostName(postName);
		SysPost.setDeleted(deleted);
		SysPost.setPostLevel(postLevel);
		SysPost.setParentId(parentId);
		SysPost.setDescription(description);
		return SysPost;
	}
}

