package me.developeralfa.tastytomatoes;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;

/**
 * Created by devalfa on 12/4/18.
 */
@Entity
public class PopularMovies {
    @ForeignKey(entity = Movie.class,childColumns = "movie_id",parentColumns = "id",onUpdate = 5)
    int movie_id;
}
