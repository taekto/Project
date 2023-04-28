package com.ssafy.ssafit.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @RequiredArgsConstructor @ToString
public class Video {
    final String id;
    final String title;
    final String part;
    final String channelName;
    final String url;
}
