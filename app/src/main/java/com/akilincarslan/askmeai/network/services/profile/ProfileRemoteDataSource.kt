package com.akilincarslan.askmeai.network.services.profile

import com.akilincarslan.askmeai.model.responses.ProfileResponse

interface ProfileRemoteDataSource {
    suspend fun fetchProfileInfo() :ProfileResponse
}