package com.example.blog.service.impl;

import com.example.blog.entity.Blog;
import com.example.blog.mapper.BlogMapper;
import com.example.blog.service.BlogService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogMapper blogMapper;

    @Override
    public Blog getById(Long id) {
        return blogMapper.selectById(id);
    }
    public PageInfo<Blog> page(Page page){
        List<Blog> blogs = blogMapper.selectByCondition(page.getPageSize(),page.getStartRow());
        return new PageInfo<>(blogs);
    }
}

