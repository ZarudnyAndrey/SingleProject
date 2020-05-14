package com.skillbox.blog.dto.response;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResponsePostDto {

  private int id;
  private String time;
  private PartInfoOfUser user;
  private String title;
  private String text;
  private int likeCount;
  private int dislikeCount;
  private int commentCount;
  private int viewCount;
  private List<PartComment> comments;
  private String[] tags;
}
