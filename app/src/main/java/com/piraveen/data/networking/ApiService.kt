package com.piraveen.data.networking

import com.piraveen.data.model.PhotosSearchResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("?method=flickr.photos.search&format=json&nojsoncallback=1&api_key=873aa7a6882640372aa70014d983d242")
    suspend fun fetchImages(@Query(value = "text") searchTerm: String): PhotosSearchResponse
}
