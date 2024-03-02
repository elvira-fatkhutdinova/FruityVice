package com.elvirafatkhutdinova.fruityvice.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.elvirafatkhutdinova.fruityvice.data.db.model.FruitEntity
import com.elvirafatkhutdinova.fruityvice.data.db.model.NutritionEntity

@Database(
    entities = [FruitEntity::class, NutritionEntity::class],
    version = 1,
    exportSchema = false
)
abstract class FruityDatabase : RoomDatabase() {
    companion object {

        @Volatile
        private var INSTANCE: FruityDatabase? = null

        fun getDatabase(context: Context): FruityDatabase {

            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    FruityDatabase::class.java,
                    "fruity_database.db"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}