package X;

import android.graphics.Bitmap;

public interface B3A {
    void dispose();

    int getHeight();

    int getWidth();

    int getXOffset();

    int getYOffset();

    void renderFrame(int i, int i2, Bitmap bitmap);
}
