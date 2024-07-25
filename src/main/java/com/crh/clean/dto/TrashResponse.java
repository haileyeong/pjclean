package com.crh.clean.dto;

import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TrashResponse {

  private int currentCount;
  private List<TrashDto> data;
  private int matchCount;
  private int page;
  private int perPage;
  private int totalCount;
}
