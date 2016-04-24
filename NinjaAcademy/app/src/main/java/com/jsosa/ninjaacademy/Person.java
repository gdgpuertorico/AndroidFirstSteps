package com.jsosa.ninjaacademy;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by joelr on 4/24/2016.
 */
public class Person implements Parcelable {

    public Person(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String name;
    public String city;

    protected Person(Parcel in) {
        name = in.readString();
        city = in.readString();
    }

    public static final Creator<Person> CREATOR = new Creator<Person>() {
        @Override
        public Person createFromParcel(Parcel in) {
            return new Person(in);
        }

        @Override
        public Person[] newArray(int size) {
            return new Person[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(city);
    }
}
