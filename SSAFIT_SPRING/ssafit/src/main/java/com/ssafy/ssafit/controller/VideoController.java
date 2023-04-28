package com.ssafy.ssafit.controller;

import com.ssafy.ssafit.dto.Review;
import com.ssafy.ssafit.dto.Video;
import com.ssafy.ssafit.service.ReviewService;
import com.ssafy.ssafit.service.UserService;
import com.ssafy.ssafit.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class VideoController {

    @Autowired
    private VideoService videoservice;

    @Autowired
    private ReviewService reviewService;


    @PostMapping("video")
    public String partVideo(String part, Model model) {
        List<Video> videos = videoservice.selectByPart(part);
        model.addAttribute("list",videos);
        return "index";
    }

    @PostMapping("detail")
    public String detailVideo(String id, Model model) {
        List<Review> reviews = reviewService.selectById(id);
        model.addAttribute("reviews", reviews);
        model.addAttribute("youtubeId", id);
        return "review";
    }



}
