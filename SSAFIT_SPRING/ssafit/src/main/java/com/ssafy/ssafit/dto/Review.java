package com.ssafy.ssafit.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @RequiredArgsConstructor @ToString
public class Review {
    final String id;
    final String youtubeid;
    final String title;
    final String writer;
    final String content;
    final int viewcount;
}
