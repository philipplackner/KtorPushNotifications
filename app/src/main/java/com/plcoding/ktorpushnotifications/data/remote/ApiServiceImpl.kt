package com.plcoding.ktorpushnotifications.data.remote

import io.ktor.client.*
import io.ktor.client.request.*

class ApiServiceImpl(
    private val client: HttpClient
) : ApiService {

    override suspend fun sendNotification(title: String, description: String) {
        try {
            client.get<String> {
                url(ApiService.SEND_NOTIFICATION)
                parameter("title", title)
                parameter("description", description)
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}