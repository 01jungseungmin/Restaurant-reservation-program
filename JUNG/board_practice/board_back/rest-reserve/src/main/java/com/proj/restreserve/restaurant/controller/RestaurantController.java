package com.proj.restreserve.restaurant.controller;

import com.proj.restreserve.restaurant.entity.Restaurant;
import com.proj.restreserve.restaurant.dto.RestaurantDto;
import com.proj.restreserve.restaurant.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class RestaurantController {

    private final RestaurantService restaurantService;

    @GetMapping("/user/restaurant/list")
    public ResponseEntity<List<RestaurantDto>> restaurantlist(@RequestParam(required = false) String category, @RequestParam(required = false) String vibe) {
        List<RestaurantDto> restaurantDtos = restaurantService.restaurantAll(category, vibe);
        return ResponseEntity.ok(restaurantDtos);
    }
    @PostMapping("/user/restaurant/list/favorite/{restaurantid}")
    public ResponseEntity<String> addFavoriteRestaurant(@PathVariable String restaurantid) {
        restaurantService.addFavoriteRestaurant(restaurantid);
        return ResponseEntity.ok("Favorite restaurant added successfully.");
    }
}