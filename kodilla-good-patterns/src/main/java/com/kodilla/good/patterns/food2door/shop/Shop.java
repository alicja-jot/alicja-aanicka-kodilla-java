package com.kodilla.good.patterns.food2door.shop;

import com.kodilla.good.patterns.food2door.dto.RequestDto;
import com.kodilla.good.patterns.food2door.dto.ResponseDto;

public interface Shop {
    ResponseDto orderInShop(RequestDto requestDto);
}
