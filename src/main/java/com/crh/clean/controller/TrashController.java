package com.crh.clean.controller;

import com.crh.clean.service.DataService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TrashController {

  private final DataService dataService;

  @GetMapping("/save-data")
  public String saveData() {
    dataService.savedData();
    return "데이터 저장 완료";
  }
}
