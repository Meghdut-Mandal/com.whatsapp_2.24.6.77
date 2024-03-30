package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import java.util.List;

/* renamed from: X.6pv  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C143066pv implements C22916AyS {
    public static final /* synthetic */ C143066pv A00 = new C143066pv();

    public final void Ba4(Bitmap bitmap, C21097A8i a8i, boolean z) {
        List list = AnonymousClass0D3.A0I;
        ImageView BCZ = a8i.BCZ();
        if (BCZ != null) {
            BCZ.setBackgroundColor(0);
            BCZ.setImageBitmap(bitmap);
            BCZ.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
    }
}
