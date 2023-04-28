package com.ssafy.ssafit.controller;

import com.ssafy.ssafit.dao.ReviewDao;
import com.ssafy.ssafit.dto.Review;
import com.ssafy.ssafit.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class ReviewController {

    @Autowired
    ReviewService reviewService;

    @GetMapping("registform")
    public String registForm(String id, Model model) {
        model.addAttribute("youtubeId", id);
        return "makereview";
    }

    @PostMapping("registreview")
    public String registReview(Review review, Model model) {
        reviewService.regist(review);
        String id = review.getYoutubeid();
        List<Review> reviews = reviewService.selectById(id);
        model.addAttribute("reviews", reviews);
        model.addAttribute("youtubeId", id);
        return "review";
    }

    @PostMapping({"cancel","return"})
    public String cancelReview(String reviewVideoId, Model model) {
        List<Review> reviews = reviewService.selectById(reviewVideoId);
        model.addAttribute("reviews", reviews);
        model.addAttribute("youtubeId", reviewVideoId);
        return "review";
    }

    @GetMapping("reviewdetail")
    public String detailReview(@RequestParam("reviewid") String reviewid, Model model) {
        Review selectReview = reviewService.detail(reviewid);
        reviewService.updateReviewCount(reviewid);
        model.addAttribute("review", selectReview);

        return "reviewdetail";
    }

    @GetMapping("modify")
    public String ModifyForm(Review review, Model model) {
        model.addAttribute("review", review);
        return "reviewcorrect";
    }

    @PostMapping("modify")
    public String ModifyReview(Review review, Model model) {
        reviewService.modify(review);
        List<Review> reviews = reviewService.selectById(review.getYoutubeid());
        model.addAttribute("reviews", reviews);
        model.addAttribute("youtubeId", review.getYoutubeid());
        return "review";

    }

    @PostMapping("delete")
    public String deleteReview(String  reviewid, Model model) {
        Review deleteReview = reviewService.detail(reviewid);
        System.out.println(reviewid);
        reviewService.remove(reviewid);
        List<Review> reviews = reviewService.selectById(deleteReview.getYoutubeid());
        model.addAttribute("reviews", reviews);
        model.addAttribute("youtubeId", deleteReview.getYoutubeid());
        return "review";

    }



}
