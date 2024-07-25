package com.crh.clean.service;

import com.crh.clean.domain.Trash;
import com.crh.clean.dto.TrashDto;
import com.crh.clean.dto.TrashResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class ApiService {

  private final RestTemplate restTemplate;

  public TrashResponse dataFromApi(int page, int perPage) {
    String url =
        String.format(
            "https://api.odcloud.kr/api/15038231/v1/uddi:66c73c0e-7fb1-4fcf-b885-b23e1f6390c3?page=%d&perPage=%d&serviceKey=kJEAL8iiWtfCSWPJh8D2ep4XqSsi5OC1x9PPqL9jTrM5N6sVaWC9pWWmfZSHxi8M9f6FHEMPuC1u3Dvg89/llw==",
            page, perPage);
    return restTemplate.getForObject(url, TrashResponse.class);
  }
}
