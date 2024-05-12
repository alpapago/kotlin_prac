package com.hi.udemy.user.dto.res

data class LoginResponseDto (
    val email: String,
    val name:String,
    val tel:String,
    // S3 연결된 프로필 이미지 url
    // val profile:String
)