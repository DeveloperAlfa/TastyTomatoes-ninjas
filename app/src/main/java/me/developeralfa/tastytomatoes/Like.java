package me.developeralfa.tastytomatoes;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;

/**
 * Created by devalfa on 11/4/18.
 */
@Entity
public class Like {

    @ForeignKey(entity = Movie.class,parentColumns = "id",childColumns = "movie_id",onUpdate = 5 )
    int movie_id;
    @ForeignKey(entity = User.class,parentColumns = "id",childColumns = "user_id",onUpdate = 5 )
    int user_id;
}
