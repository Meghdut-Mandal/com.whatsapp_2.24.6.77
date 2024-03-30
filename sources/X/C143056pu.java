package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import java.util.List;

/* renamed from: X.6pu  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C143056pu implements C22916AyS {
    public static final /* synthetic */ C143056pu A00 = new C143056pu();

    public final void Ba4(Bitmap bitmap, C21097A8i a8i, boolean z) {
        List list = AnonymousClass0D3.A0I;
        ImageView BCZ = a8i.BCZ();
        if (BCZ != null) {
            BCZ.setBackgroundColor(0);
            BCZ.setImageBitmap(bitmap);
            BCZ.setScaleType(ImageView.ScaleType.FIT_XY);
        }
    }
}
