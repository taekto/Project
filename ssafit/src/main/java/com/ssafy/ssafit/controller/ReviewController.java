package com.ssafy.ssafit.controller;

import com.ssafy.ssafit.domain.Review;
import com.ssafy.ssafit.domain.Video;
import com.ssafy.ssafit.service.ReviewService;
import com.ssafy.ssafit.service.VideoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ReviewController {
    private final ReviewService reviewService;
    private final VideoService videoService;
    @GetMapping("registform")
    public String goregistform(Long videoid, Model model) {
        Video video = videoService.findById(videoid);
        model.addAttribute("videoid", videoid);
        return "makereview";
    }

    @PostMapping("registreview")
    public String Registreview(Long videoid, Review review, Model model) {
        Video video = videoService.findById(videoid);

        review.setVideo(video);
        reviewService.Registreview(review);
        List<Review> allreview = reviewService.getAllreview(review.getVideo().getId());
        model.addAttribute("reviews", allreview);
        model.addAttribute("videoid", videoid);
        model.addAttribute("youtubeid",video.getYoutubeid());
        return "review";
    }

    @GetMapping("reviewdetail")
    public String goreviewdetail(Long videoid, Review review, Model model) {
        model.addAttribute("review", review);
        model.addAttribute("videoid", videoid);
        return "reviewdetail";
    }

    @PostMapping("return")
    public String returnreview(Long videoid, Model model) {
        Video video = videoService.findById(videoid);

        List<Review> allreview = reviewService.getAllreview(videoid);

        model.addAttribute("reviews", allreview);
        model.addAttribute("videoid", videoid);
        model.addAttribute("youtubeid",video.getYoutubeid());
        return "review";
    }

    @GetMapping("modify")
    public String gomodifyreview(Long videoid, Review review, Model model) {

        model.addAttribute("review", review);
        model.addAttribute("videoid",videoid);
        return "reviewcorrect";

    }

    @PostMapping("modify")
    public String modifyreview(Long videoid, Review review, Model model) {
        Video video = videoService.findById(videoid);

        reviewService.Updatereview(review);


        List<Review> allreview = reviewService.getAllreview(videoid);
        model.addAttribute("reviews", allreview);
        model.addAttribute("videoid", videoid);
        model.addAttribute("youtubeid",video.getYoutubeid());
        return "review";
    }

    @PostMapping("delete")
    public String removereview(Long videoid, Review review, Model model) {
        reviewService.removereview(review);
        Video video = videoService.findById(videoid);
        List<Review> allreview = reviewService.getAllreview(videoid);
        model.addAttribute("reviews", allreview);
        model.addAttribute("videoid", videoid);
        model.addAttribute("youtubeid",video.getYoutubeid());
        return "review";

    }

}
