package com.crh.clean.service;

import com.crh.clean.repository.TrashRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TrashService {

  private final TrashRepository trashRepository;



}
