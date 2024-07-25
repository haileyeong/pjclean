package com.crh.clean.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotNull
  @Column(unique = true, length = 50)
  private String email;

  @NotNull
  @Column(name = "oauth_id")
  private int oauthId;

  @NotNull
  @Column(length = 20)
  private String pwd;

  @NotNull
  @Column(length = 20)
  private String name;

  @NotNull
  @Column(unique = true, length = 20)
  private String nickname;

  @NotNull
  @Column(nullable = false, length = 11)
  private String phone;

  @NotNull
  @Column(nullable = false)
  private int point = 0;

  @NotNull
  @Column(name = "created_at", updatable = false)
  private LocalDateTime createdAt = LocalDateTime.now();

  @NotNull
  @Column(name = "deleted_at")
  private LocalDateTime deletedAt;
}
