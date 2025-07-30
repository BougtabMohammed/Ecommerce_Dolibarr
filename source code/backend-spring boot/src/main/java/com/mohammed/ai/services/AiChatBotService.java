package com.mohammed.ai.services;

import com.mohammed.exception.ProductException;
import com.mohammed.response.ApiResponse;

public interface AiChatBotService {

    ApiResponse aiChatBot(String prompt,Long productId,Long userId) throws ProductException;
}
