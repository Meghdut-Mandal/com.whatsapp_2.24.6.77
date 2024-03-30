package X;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* renamed from: X.6ps  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C143036ps implements C22916AyS {
    public static final /* synthetic */ C143036ps A00 = new C143036ps();

    public final void Ba4(Bitmap bitmap, C21097A8i a8i, boolean z) {
        ImageView BCZ = a8i.BCZ();
        if (BCZ != null) {
            BCZ.setBackgroundColor(0);
            BCZ.setImageBitmap(bitmap);
            BCZ.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
    }
}
