package com.sparta.spring04week.entity;

import java.time.LocalDateTime;

public interface ShowAllBoardList {
    LocalDateTime getCreatedAt();
    LocalDateTime getModifiedAt();
    Long getId();
    String getTitle();
    String getContent();
    String getUsername();
}


