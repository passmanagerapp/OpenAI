package com.akilincarslan.askmeai.repos

import com.akilincarslan.askmeai.model.responses.ProfileResponse
import com.akilincarslan.askmeai.network.services.profile.ProfileRemoteDataSource
import javax.inject.Inject

class ProfileRepositoryImpl @Inject constructor(
    private val remoteDataSource: ProfileRemoteDataSource
) : ProfileRepository {

    override suspend fun fetchProfileInfo(): ProfileResponse {
        return remoteDataSource.fetchProfileInfo()
    }
}