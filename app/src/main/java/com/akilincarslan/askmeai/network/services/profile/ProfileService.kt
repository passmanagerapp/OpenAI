package com.akilincarslan.askmeai.network.services.profile

import com.akilincarslan.askmeai.constants.NetworkConstant
import com.akilincarslan.askmeai.model.responses.ProfileResponse
import retrofit2.http.GET

interface ProfileService {

    @GET(NetworkConstant.Endpoint.Home.PROFILE)
    suspend fun fetchUserProfile() : ProfileResponse
}