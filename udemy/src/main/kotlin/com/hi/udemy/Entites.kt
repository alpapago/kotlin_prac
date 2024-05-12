package com.hi.udemy

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name="member")
class User(
    var userId:String,
    var password:String,
    @Id @GeneratedValue var id:Long?=null)
