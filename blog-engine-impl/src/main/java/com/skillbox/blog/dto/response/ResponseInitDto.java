package com.skillbox.blog.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResponseInitDto {

  private String title;
  private String subtitle;
  private String phone;
  private String email;
  private String copyright;
  private String copyrightFrom;
}
