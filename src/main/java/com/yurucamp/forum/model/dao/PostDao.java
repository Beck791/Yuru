package com.yurucamp.forum.model.dao;

import com.yurucamp.forum.model.PostBean;

public interface PostDao {

	PostBean insertPoTitle(PostBean poTitle);

	PostBean updatePoTitle(PostBean poTitle);

	PostBean deleteOnePoTitle(PostBean poTitle);

	PostBean insertPoContent(PostBean poContent);

	PostBean updatePoContent(PostBean poContent);

	PostBean deletePoContent(PostBean poContent);

}