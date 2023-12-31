package com.raizetech7.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Map;


@RestController
public class NameController {

    //クエリ文字列を受け取れるように変更
    @GetMapping("/names")
    public Name getNames(@RequestParam int id) {
        return new Name(id, "masami", "teramoto");
    }


    @PostMapping("/names")
    public ResponseEntity<String> create(@RequestBody CreateForm form) {
        URI url = UriComponentsBuilder.fromUriString("http://localhost:8080")
                .path("/names/id")
                .build()
                .toUri();
        return ResponseEntity.created(url).body("name successfully created");

    }

    @PatchMapping("/names/{id}")
    public ResponseEntity<Map<String, String>> update(@PathVariable("id") int id, @RequestBody UpdateForm form) {
        return ResponseEntity.ok(Map.of("message", "name successfully updated"));
    }

}

