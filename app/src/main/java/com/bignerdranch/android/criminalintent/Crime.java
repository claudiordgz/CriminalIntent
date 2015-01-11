package com.bignerdranch.android.criminalintent;

import java.util.UUID;

/**
 * Created by Claudiordgz on 1/11/2015.
 */
public class Crime {

    public Crime() {
        // Generate unique identifier
        setId(UUID.randomUUID());
    }

    public UUID getId() {
        return mId;
    }

    public void setId(UUID mId) {
        this.mId = mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    private UUID mId;
    private String mTitle;
}
