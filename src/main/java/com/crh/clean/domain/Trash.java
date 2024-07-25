package com.crh.clean.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Trash {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotNull
  @Column(length = 255)
  private String location;

  @NotNull
  @Column(length = 255)
  private String address;

  @Column private Double lat;

  @NotNull private Double lng;
}
