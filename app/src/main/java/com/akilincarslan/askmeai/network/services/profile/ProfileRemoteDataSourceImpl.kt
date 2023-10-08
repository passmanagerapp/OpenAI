package com.akilincarslan.askmeai.network.services.profile

import com.akilincarslan.askmeai.model.responses.ProfileResponse

class ProfileRemoteDataSourceImpl(
    private val service: ProfileService
) : ProfileRemoteDataSource {
    override suspend fun fetchProfileInfo(): ProfileResponse {
        return service.fetchUserProfile()
    }
}