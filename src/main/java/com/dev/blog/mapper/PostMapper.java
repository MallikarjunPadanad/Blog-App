package com.dev.blog.mapper;

import com.dev.blog.domain.CreatePostRequest;
import com.dev.blog.domain.UpdatePostRequest;
import com.dev.blog.domain.dtos.CreatePostRequestDto;
import com.dev.blog.domain.dtos.PostDto;
import com.dev.blog.domain.dtos.UpdatePostRequestDto;
import com.dev.blog.domain.entities.Post;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PostMapper {

    @Mapping(target = "author", source = "author")
    @Mapping(target = "category", source = "category")
    @Mapping(target = "tags", source = "tags")
    @Mapping(target = "status", source = "status")
    PostDto toDto(Post post);

    CreatePostRequest toCreatePostRequest(CreatePostRequestDto dto);

    UpdatePostRequest toUpdatePostRequest(UpdatePostRequestDto dto);

}