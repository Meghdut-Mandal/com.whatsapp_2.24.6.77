package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* renamed from: X.2sZ  reason: invalid class name and case insensitive filesystem */
public abstract class C54202sZ {
    public static Bitmap A00(Drawable... drawableArr) {
        int length = drawableArr.length;
        if (length == 0) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(Math.max(drawableArr[0].getIntrinsicWidth(), 0), Math.max(drawableArr[0].getIntrinsicHeight(), 0), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i = 0;
        do {
            Drawable drawable = drawableArr[i];
            drawable.setBounds(0, 0, Math.max(drawable.getIntrinsicWidth(), 0), Math.max(drawable.getIntrinsicHeight(), 0));
            drawable.draw(canvas);
            i++;
        } while (i < length);
        return createBitmap;
    }
}
