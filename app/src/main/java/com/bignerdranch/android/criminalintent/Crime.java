package com.bignerdranch.android.criminalintent;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * Created by Claudiordgz on 1/11/2015.
 */
public class Crime {

    public Crime() {
        // Generate unique identifier
        setId(UUID.randomUUID());
        setDate(new Date());
    }

    public UUID getId() {
        return mId;
    }

    public void setId(UUID id) {
        this.mId = id;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public String getFormattedDate() {
        SimpleDateFormat dt = new SimpleDateFormat("EEEE, MMM dd,yyyy");
        String date = dt.format(getDate());
        return date;
    }

    public void setDate(Date date) {

        this.mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        this.mSolved = solved;
    }

    @Override
    public String toString() {
        return mTitle;
    }

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;
}
