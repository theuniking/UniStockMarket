package com.verome.unistockmarket.presentation.company_info

import com.verome.unistockmarket.domain.model.CompanyInfo
import com.verome.unistockmarket.domain.model.IntradayInfo

data class CompanyInfoState(
    val stockInfos: List<IntradayInfo> = emptyList(),
    val company: CompanyInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)
