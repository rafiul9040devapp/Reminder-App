package com.rafiul.reminderapp.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.rafiul.reminderapp.model.Reminder

@Database(entities = [Reminder::class], version = 1, exportSchema = false)
abstract class ReminderDatabase : RoomDatabase() {
    abstract fun reminderDao(): ReminderDao
}
