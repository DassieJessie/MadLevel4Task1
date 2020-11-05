package com.example.shoppinlistapp.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "productTable")
data class Product(

    @ColumnInfo(name = "quantity")
    var productQuantity : Int,

    @ColumnInfo(name = "name")
    var productName : String,

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo
    var id : Long? = null
)