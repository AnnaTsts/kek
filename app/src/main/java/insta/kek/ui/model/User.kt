package insta.kek.ui.model

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import java.util.*


@Entity(tableName = "USER")
class User(
    @PrimaryKey(autoGenerate = true)
    var id: Long?,

    @ColumnInfo(name = "username")
    var username: String,

    @ColumnInfo(name = "email")
    var email: String,

    @ColumnInfo(name = "name")
    var name: String,

    @ColumnInfo(name = "registration_date")
    var registrationDate: Date,

    @ColumnInfo(name = "img_src")
    var imgSrc: String,

    @ColumnInfo(name = "is_active")
    var isActive: Boolean
) {
    constructor() : this(
        null, "", "", "", Date(), "",
        true
    )
}