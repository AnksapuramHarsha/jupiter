package com.example.contenturl.controller

import com.example.contenturl.model.customer_urls
import com.example.contenturl.service.customer_urlService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class customer_urlController(private val customerUrlservice: customer_urlService) {

    @GetMapping("/urls")
    fun getAllCustomersUrls(): ResponseEntity<List<customer_urls>> {
        val customers = customerUrlservice.getAllCustomersUrls()
        return ResponseEntity(customers, HttpStatus.OK)
    }
}