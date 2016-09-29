package pe.edu.upc.walkapp.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Gonzalo on 27/09/2016.
 */

public class Path {
    private String description;
    private Date date;
    private Route start;
    private User user;
    private boolean publicPath;
    private ArrayList<User> participants;

    public Path(Date date, Route start, User user, boolean publicPath) {
        this.date = date;
        this.start = start;
        this.user = user;
        this.publicPath = publicPath;
    }

    public ArrayList<User> getParticipants() {
        return participants;
    }

    public ArrayList<String> getParticipantsName() {
        ArrayList<String> names=new ArrayList<>();
        for (User u: participants) {
            names.add(u.getFullName());
        }
        return names;
    }
    public void setParticipants(ArrayList<User> participants) {
        this.participants = participants;
    }

    protected Path(Parcel in) {
        description = in.readString();
        publicPath = in.readByte() != 0;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Route getStart() {
        return start;
    }

    public void setStart(Route start) {
        this.start = start;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isPublicPath() {
        return publicPath;
    }

    public void setPublicPath(boolean publicPath) {
        this.publicPath = publicPath;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
