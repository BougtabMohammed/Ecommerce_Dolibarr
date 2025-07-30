package com.mohammed.service;

import com.mohammed.model.Home;
import com.mohammed.model.HomeCategory;

import java.util.List;

public interface HomeService {

    Home creatHomePageData(List<HomeCategory> categories);

}
