package me.developeralfa.tastytomatoes;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by devalfa on 11/4/18.
 */
@Entity
public class Movie {
    @PrimaryKey
    int id;
    String name;
    String rating;
    String poster_url;
    String backdrop_url;
    boolean isPopular;
}
