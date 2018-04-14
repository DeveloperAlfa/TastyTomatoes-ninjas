package me.developeralfa.tastytomatoes;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by devalfa on 12/4/18.
 */
@Entity
public class Actor {
    @PrimaryKey
    int id;
    String name;
    String photo_url;
}
