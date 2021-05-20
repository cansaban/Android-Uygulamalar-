package com.cansaban.landmarkbook;

import android.graphics.Bitmap;

public class Singleton {
    private Bitmap chosenImage;
    private static Singleton singleton;

    public Bitmap getChosenImage() {
        return chosenImage;
    }

    public void setChosenImage(Bitmap chosenImage) {
        this.chosenImage = chosenImage;
    }

    private  Singleton(){  // bu constructor - bir obje oluşturulduğunda bu sınıftan çağrılacak ilk methodtur.  Gette setter davası

    }

    public static Singleton getInstance(){

        if(singleton == null ) {
            singleton = new Singleton();
        }
            return singleton;

    }

}
