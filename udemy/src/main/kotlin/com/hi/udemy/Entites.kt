package com.hi.udemy

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name="member")
class User(
    @Id @GeneratedValue var id:Long?=null,

    var userId:String,
    var password:String,
    var telNumber:String,
    var nickname: String,
    var nickname2: String,
    )
