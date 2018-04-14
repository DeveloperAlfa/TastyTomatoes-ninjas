package me.developeralfa.tastytomatoes;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;

/**
 * Created by devalfa on 14/4/18.
 */
@Entity
public class tagged {
    @ForeignKey(entity = Movie.class,parentColumns = "id",childColumns = "movie_id",onUpdate = 5 )
    int movie_id;
    @ForeignKey(entity = Tags.class,parentColumns = "id",childColumns = "tag_id",onUpdate = 5 )
    int tag_id ;
}
