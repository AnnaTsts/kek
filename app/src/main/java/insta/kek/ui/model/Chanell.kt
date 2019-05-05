package insta.kek.ui.model

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import java.util.*

@Entity
class Chanell(
    @PrimaryKey(autoGenerate = true)
    var id: Long?,
    @ColumnInfo(name = "creator_id")
    var creatorId: Long,
    @ColumnInfo(name = "chanell_type_id")
    var chanelTyre: Long,
    @ColumnInfo(name = "chanell_name")
    var chanelName: String,
    @ColumnInfo(name = "creation_date")
    var creationDate: Date,
    @ColumnInfo(name = "img_src")
    var imgSrc: String
)