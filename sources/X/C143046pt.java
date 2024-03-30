package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import java.util.List;

/* renamed from: X.6pt  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C143046pt implements C22916AyS {
    public static final /* synthetic */ C143046pt A00 = new C143046pt();

    public final void Ba4(Bitmap bitmap, C21097A8i a8i, boolean z) {
        List list = AnonymousClass0D3.A0I;
        AnonymousClass00C.A0D(a8i, 0);
        ImageView BCZ = a8i.BCZ();
        if (BCZ != null) {
            BCZ.setBackgroundColor(0);
            BCZ.setImageBitmap(bitmap);
            BCZ.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
    }
}
