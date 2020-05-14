package com.skillbox.blog.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResponseStatisticsDto {

  private int postsCount;
  private int likesCount;
  private int dislikesCount;
  private int viewsCount;
  private String firstPublication;
}
