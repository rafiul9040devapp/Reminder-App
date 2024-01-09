package com.rafiul.reminderapp.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Reminder(

    @PrimaryKey(autoGenerate = true)
    val id: Long?,

    @ColumnInfo
    val title: String,

    @ColumnInfo
    val description: String,

    @ColumnInfo
    val date: Long,
    @ColumnInfo
    val time: Long,

    @ColumnInfo
    val repeatType: Int
)
