package com.plcoding.ktorpushnotifications.data.remote

interface ApiService {

    suspend fun sendNotification(title: String, description: String)

    companion object {
        const val SEND_NOTIFICATION = "http://192.168.0.2:8083/sendNotification"
    }
}