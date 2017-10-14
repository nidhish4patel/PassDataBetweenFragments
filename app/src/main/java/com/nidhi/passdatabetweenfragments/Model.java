package com.nidhi.passdatabetweenfragments;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by nidhi on 7/26/2017.
 */

public class Model implements Parcelable {

    String sFName;
    String sLName;
    String sQual;

    @Override
    public int describeContents() {
        return 0;
    }


    /**
     * Retrieving Student data from Parcel object
     * This constructor is invoked by the method createFromParcel(Parcel source) of
     * the object CREATOR
     **/
    public Model(Parcel parcel){
        this.sFName = parcel.readString();
        this.sLName = parcel.readString();
        this.sQual = parcel.readString();
    }


    @Override
    /**
     * Storing the Student data to Parcel object
     **/
    public void writeToParcel(Parcel dest, int i) {
// to store model data to parcel object.
        dest.writeString(sFName);
        dest.writeString(sLName);
        dest.writeString(sQual);
    }
    /**
     * A constructor that initializes the Student object
     **/
        public void Model(String sFName, String sLName, String sQual){
        this.sFName = sFName;
        this.sLName =  sLName;
        this. sQual = sQual;
    }

    //creator - used when un-parceling our parcle (creating the object)
    public static Parcelable.Creator<Model> CREATOR = new Parcelable.Creator<Model>() {


        @Override
        public Model createFromParcel(Parcel source) {
            return null;
        }

        @Override
        public Model[] newArray(int i) {
            return new Model[i];
        }
    };
}
