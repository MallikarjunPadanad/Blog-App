package com.dev.blog.mapper.impl;

import com.dev.blog.domain.dtos.CategoryDto;
import com.dev.blog.domain.entities.Category;
import com.dev.blog.mapper.CategoryMapper;
import org.springframework.stereotype.Component;


@Component
public class CategoryMapperImpl implements CategoryMapper {
    @Override
    public CategoryDto toDto(Category category) {

    }
}
