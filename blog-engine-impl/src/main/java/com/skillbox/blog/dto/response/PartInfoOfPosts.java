package com.skillbox.blog.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PartInfoOfPosts {

  private int id;
  private String time;
  private PartInfoOfUser user;
  private String title;
  private String announce;
  private int likeCount;
  private int dislikeCount;
  private int commentCount;
  private int viewCount;
}