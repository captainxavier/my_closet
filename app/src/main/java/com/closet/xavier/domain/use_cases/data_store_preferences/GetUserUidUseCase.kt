package com.closet.xavier.domain.use_cases.data_store_preferences

import com.closet.xavier.data.data_store_prefence.repository.DataStorePreferencesRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetUserUidUseCase @Inject constructor(private val repository: DataStorePreferencesRepository) {
    operator fun invoke(): Flow<String> {
        return repository.getUserUid()
    }
}