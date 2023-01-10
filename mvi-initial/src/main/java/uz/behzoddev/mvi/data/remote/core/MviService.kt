package uz.behzoddev.mvi.data.remote.core

import retrofit2.http.GET
import uz.behzoddev.mvi.data.remote.dto.User

interface MviService {
    @GET("users")
    suspend fun fetchUsers(): List<User>
}