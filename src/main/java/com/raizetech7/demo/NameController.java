package com.raizetech7.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NameController{

  @GetMapping("/names")
    public List<Name> getNames(){
      return List.of(new Name("masami","teramoto"),new Name("natsumi","imai"));
  }
}
