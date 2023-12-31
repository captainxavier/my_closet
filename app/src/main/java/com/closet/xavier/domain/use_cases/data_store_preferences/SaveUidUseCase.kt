package com.closet.xavier.domain.use_cases.data_store_preferences

import com.closet.xavier.data.data_store_prefence.repository.DataStorePreferencesRepository
import javax.inject.Inject

class SaveUidUseCase @Inject constructor(private val repository: DataStorePreferencesRepository) {
    suspend operator fun invoke(userUid: String) {
        repository.saveUserUid(userUid)
    }
}