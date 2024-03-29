package com.example.manfredi.dodgeorama;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by Manfredi on 08/02/2017.
 */

public class Entity {

    protected int mX, mY;
    protected int mSpeed;

    public Bitmap getBitmap() {
        return mBitmap;
    }

    protected Bitmap mBitmap;
    protected static final int MIN_SPEED = 1;
    protected static final int MAX_SPEED = 20;

    public Entity(int mX, int mY) {
        this.mX = mX;
        this.mY = mY;
    }

    public Entity() {
        this.mX = 0;
        this.mY = 0;
        mSpeed = 0;
    }

    public void render(Canvas canvas, Paint paint) {
        canvas.drawBitmap(this.getBitmap(), this.getX(), this.getY(), paint);
    }

    public int getX() {
        return mX;
    }

    public void setX(int mX) {
        this.mX = mX;
    }

    public int getY() {
        return mY;
    }

    public void setY(int mY) {
        this.mY = mY;
    }

    public int getSpeed() {
        return mSpeed;
    }

    public void setSpeed(int mSpeed) {
        this.mSpeed = mSpeed;
    }

    public int getWidth() {return 0;}

    public int getHeight() {return 0;}

    public void update() {
        mX += mSpeed;
    }
}
