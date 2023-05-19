package com.verome.unistockmarket.di

import com.verome.unistockmarket.data.csv.CSVParser
import com.verome.unistockmarket.data.csv.CompanyListingsParser
import com.verome.unistockmarket.data.csv.IntradayInfoParser
import com.verome.unistockmarket.data.repository.StockRepositoryImpl
import com.verome.unistockmarket.domain.model.CompanyListing
import com.verome.unistockmarket.domain.model.IntradayInfo
import com.verome.unistockmarket.domain.repository.StockRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindCompanyListingsParser(
        companyListingsParser: CompanyListingsParser
    ): CSVParser<CompanyListing>

    @Binds
    @Singleton
    abstract fun bindIntradayInfoParser(
        intradayInfoParser: IntradayInfoParser
    ): CSVParser<IntradayInfo>

    @Binds
    @Singleton
    abstract fun bindStockRepository(
        stockRepositoryImpl: StockRepositoryImpl
    ): StockRepository
}