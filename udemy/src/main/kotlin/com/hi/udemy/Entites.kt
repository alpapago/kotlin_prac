package com.hi.udemy

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
class User(
    var userId:String,
    var password:String,
    @Id @GeneratedValue var id:Long?=null)
