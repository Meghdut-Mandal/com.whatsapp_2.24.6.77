package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: X.0Pl  reason: invalid class name and case insensitive filesystem */
public abstract class C05370Pl {
    public static final Bitmap A00(Drawable drawable, int i, int i2) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() == null) {
                throw AnonymousClass001.A08("bitmap is null");
            } else if (i == bitmapDrawable.getBitmap().getWidth() && i2 == bitmapDrawable.getBitmap().getHeight()) {
                return bitmapDrawable.getBitmap();
            } else {
                return Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), i, i2, true);
            }
        } else {
            Rect bounds = drawable.getBounds();
            int i3 = bounds.left;
            int i4 = bounds.top;
            int i5 = bounds.right;
            int i6 = bounds.bottom;
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            drawable.setBounds(0, 0, i, i2);
            drawable.draw(new Canvas(createBitmap));
            drawable.setBounds(i3, i4, i5, i6);
            return createBitmap;
        }
    }
}
