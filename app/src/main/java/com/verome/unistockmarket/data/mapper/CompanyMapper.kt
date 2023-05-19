package com.verome.unistockmarket.data.mapper

import com.verome.unistockmarket.data.local.CompanyListingEntity
import com.verome.unistockmarket.data.remote.dto.CompanyInfoDto
import com.verome.unistockmarket.domain.model.CompanyInfo
import com.verome.unistockmarket.domain.model.CompanyListing

fun CompanyListingEntity.toCompanyListing(): CompanyListing {
    return CompanyListing(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyListing.toCompanyListingEntity(): CompanyListingEntity {
    return CompanyListingEntity(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyInfoDto.toCompanyInfo(): CompanyInfo {
    return CompanyInfo(
        symbol = symbol ?: "",
        description = description ?: "",
        name = name ?: "",
        country = country ?: "",
        industry = industry ?: ""
    )
}