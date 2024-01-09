package com.rafiul.reminderapp.repository

import androidx.lifecycle.LiveData
import com.rafiul.reminderapp.database.ReminderDao
import com.rafiul.reminderapp.model.Reminder
import javax.inject.Inject

class ReminderRepository @Inject constructor(private val reminderDao: ReminderDao) {
    val allReminders: LiveData<List<Reminder>> = reminderDao.getAllReminders()

    suspend fun insert(reminder: Reminder) {
        reminderDao.insertReminder(reminder)
    }

    suspend fun update(reminder: Reminder) {
        reminderDao.updateReminder(reminder)
    }


    suspend fun delete(reminder: Reminder) {
        reminderDao.deleteReminder(reminder)
    }
}
