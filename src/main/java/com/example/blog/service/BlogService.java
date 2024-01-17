package com.example.blog.service;

import com.example.blog.entity.Blog;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;

public interface BlogService {
    public Blog getById(Long id);
    public PageInfo<Blog> page(Page page);
}
