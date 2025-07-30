package com.mohammed.service;

import com.mohammed.model.Seller;
import com.mohammed.model.SellerReport;

public interface SellerReportService {
    SellerReport getSellerReport(Seller seller);
    SellerReport updateSellerReport( SellerReport sellerReport);

}
