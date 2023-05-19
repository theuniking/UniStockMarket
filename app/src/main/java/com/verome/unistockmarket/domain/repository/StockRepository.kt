package com.verome.unistockmarket.domain.repository

import com.verome.unistockmarket.domain.model.CompanyInfo
import com.verome.unistockmarket.domain.model.CompanyListing
import com.verome.unistockmarket.domain.model.IntradayInfo
import com.verome.unistockmarket.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {

    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>

    suspend fun getIntradayInfo(
        symbol: String
    ): Resource<List<IntradayInfo>>

    suspend fun getCompanyInfo(
        symbol: String
    ): Resource<CompanyInfo>
}