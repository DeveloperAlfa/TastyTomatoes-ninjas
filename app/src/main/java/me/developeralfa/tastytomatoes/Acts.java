package me.developeralfa.tastytomatoes;

import android.arch.persistence.room.ForeignKey;

/**
 * Created by devalfa on 12/4/18.
 */

public class Acts {
    @ForeignKey(entity = Movie.class,parentColumns = "id",childColumns = "movie_id",onUpdate = 5)
    int movie_id;
    @ForeignKey(entity = Actor.class,parentColumns = "id",childColumns = "actor_id",onUpdate = 5)
    int actor_id;
}
