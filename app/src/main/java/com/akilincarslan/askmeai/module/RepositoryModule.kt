package com.akilincarslan.askmeai.module

import com.akilincarslan.askmeai.network.services.profile.ProfileRemoteDataSource
import com.akilincarslan.askmeai.repos.ProfileRepository
import com.akilincarslan.askmeai.repos.ProfileRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Provides
    @Singleton
    fun providesProfileRepository(dataSource: ProfileRemoteDataSource) : ProfileRepository {
        return ProfileRepositoryImpl(dataSource)
    }
}