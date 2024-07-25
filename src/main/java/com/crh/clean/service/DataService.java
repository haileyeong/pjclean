package com.crh.clean.service;

import com.crh.clean.domain.Trash;
import com.crh.clean.dto.TrashDto;
import com.crh.clean.dto.TrashResponse;
import com.crh.clean.repository.TrashRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DataService {

  private final TrashRepository trashRepository;
  private final ApiService apiService;

  public void savedData() {
    int page = 1;
    int perPage = 20;

    while (true) {
      TrashResponse response = apiService.dataFromApi(page, perPage);
      if (response == null || response.getData().isEmpty()) {
        break;
      }

      for (TrashDto dto : response.getData()) {
        Trash entity = Trash.fromDto(dto);
        trashRepository.save(entity);
      }

      if (response.getCurrentCount() < perPage) {
        break;
      }

      page++;
    }
  }

}
