package com.crh.clean.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@Getter
@Setter
public class TrashDto {

  @JsonProperty("설치 장소 유형")
  private String 설치장소유형;

  @JsonProperty("설치연도")
  private int 설치연도;

  @JsonProperty("설치위치(도로명주소)")
  private String 설치위치도로명주소;

  @JsonProperty("세부 위치")
  private String 세부위치;

  @JsonProperty("수거 쓰레기 종류")
  private String 수거쓰레기종류;

  @JsonProperty("쓰레기통 형태")
  private String 쓰레기통형태;

  @JsonProperty("연번")
  private int 연번;

  @JsonProperty("자치구명")
  private String 자치구명;

  @JsonProperty("행정(동)")
  private String 행정동;

}
