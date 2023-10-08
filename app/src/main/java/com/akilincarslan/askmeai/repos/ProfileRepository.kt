package com.akilincarslan.askmeai.repos

import com.akilincarslan.askmeai.model.responses.ProfileResponse

interface ProfileRepository {
    suspend fun fetchProfileInfo(): ProfileResponse

}