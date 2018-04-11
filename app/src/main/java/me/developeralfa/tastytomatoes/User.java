package me.developeralfa.tastytomatoes;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by devalfa on 11/4/18.
 */
@Entity
public class User {
    @PrimaryKey
    int id;
    String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
