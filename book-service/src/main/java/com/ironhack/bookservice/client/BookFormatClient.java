package com.ironhack.bookservice.client;


import com.ironhack.bookservice.controller.dto.BookFormatDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@FeignClient("book-format-service")
public interface BookFormatClient {

    @GetMapping("/format/{isbn}")
    @ResponseStatus(HttpStatus.OK)
    public String[] getBookFormat(@PathVariable String isbn);

    @PostMapping("/format")
    @ResponseStatus(HttpStatus.CREATED)
    public void createBookFormat(@RequestBody @Valid BookFormatDto bookFormatDto);

}
