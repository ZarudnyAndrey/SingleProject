package com.skillbox.blog.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PartComment {

  private int id;
  private String time;
  private PartInfoOfUser user;
  private String text;
}
