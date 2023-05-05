package com.ssafy.ssafit.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Video {

    @Id @GeneratedValue
    @Column(name = "video_id")
    private Long id;

    private String youtubeid;
    private String title;
    private String part;
    private String channelName;
    private String url;

    @OneToMany(mappedBy = "video")
    private List<Review> reviews = new ArrayList<>();


}
