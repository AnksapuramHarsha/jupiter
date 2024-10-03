package com.example.contenturl.service

import com.example.contenturl.model.customer_urls
import com.example.contenturl.repository.customer_urlsRepository
import org.springframework.stereotype.Service

@Service
class customer_urlService(private val customerUrlsrepository: customer_urlsRepository) {
    fun getAllCustomersUrls(): List<customer_urls> {
        return customerUrlsrepository.findAll()
    }
}