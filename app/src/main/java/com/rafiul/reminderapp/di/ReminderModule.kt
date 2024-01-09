package com.rafiul.reminderapp.di

import android.content.Context
import androidx.room.Room
import com.rafiul.reminderapp.database.ReminderDao
import com.rafiul.reminderapp.database.ReminderDatabase
import com.rafiul.reminderapp.repository.ReminderRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ReminderModule {
    @Singleton
    @Provides
    fun provideReminderDao(@ApplicationContext context: Context): ReminderDao {
        return Room.databaseBuilder(
            context.applicationContext,
            ReminderDatabase::class.java,
            "reminder_database"
        ).build().reminderDao()
    }

    @Singleton
    @Provides
    fun provideReminderRepository(reminderDao: ReminderDao): ReminderRepository {
        return ReminderRepository(reminderDao)
    }
}
