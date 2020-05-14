package com.skillbox.blog.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Builder
@Accessors(chain = true)
public class RequestPasswordDto {

  private String code;
  @Size(min = 6)
  private String password;
  private String captcha;
  @JsonProperty("captcha_secret")
  private String captchaSecret;
}
