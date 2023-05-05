package com.ssafy.ssafit.controller;

import com.ssafy.ssafit.domain.Review;
import com.ssafy.ssafit.domain.Video;
import com.ssafy.ssafit.service.ReviewService;
import com.ssafy.ssafit.service.VideoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class VideoController {


    private final VideoService videoService;
    private final ReviewService reviewService;

    @PostMapping("video")
    public String findByPart(String part, Model model) {
        List<Video> VideoList = videoService.findByPart(part);
        model.addAttribute("list", VideoList);
        return "index";
    }

    @PostMapping("detail")
    public String godetail(Long videoid, Model model) {

        Video video = videoService.findById(videoid);
        model.addAttribute("videoid", video.getId());
        model.addAttribute("youtubeid",video.getYoutubeid());
        List<Review> allreview = reviewService.getAllreview(videoid);
        model.addAttribute("reviews", allreview);

        return "review";
    }

}
