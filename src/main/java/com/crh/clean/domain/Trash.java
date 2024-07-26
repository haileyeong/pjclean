package com.crh.clean.domain;

import com.crh.clean.dto.TrashDto;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Builder
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class Trash {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id; // 연번

  @NotNull
  @Column(length = 255)
  private String region; // 자치구명

  @NotNull
  @Column(length = 255)
  private String address; // 설치위치(도로명주소)

  @NotNull private String district; // 행정(동)

  @NotNull private String detailAddress; // 세부 위치

  @NotNull private String locationType; // 설치 장소 유형

  @NotNull private String type; // 쓰레기통 형태

  @NotNull private String trashType; // 수거 쓰레기 종류

  @NotNull private int year; // 설치연도

  public Trash() {}

  public static Trash fromDto(TrashDto dto) {
    return Trash.builder()
        .region(dto.get자치구명())
        .address(dto.get설치위치도로명주소())
        .district(dto.get행정동())
        .detailAddress(dto.get세부위치())
        .locationType(dto.get설치장소유형())
        .type(dto.get쓰레기통형태())
        .trashType(dto.get수거쓰레기종류())
        .year(dto.get설치연도())
        .build();
  }
}
