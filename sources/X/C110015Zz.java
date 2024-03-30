package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import java.lang.ref.Reference;

/* renamed from: X.5Zz  reason: invalid class name and case insensitive filesystem */
public abstract class C110015Zz {
    public static void A00(ImageView imageView, C16680pu r4, C16680pu r5, AnonymousClass6KT r6, String str, String str2) {
        Bitmap bitmap;
        if (str2 != null && AnonymousClass000.A1X(r4.get())) {
            str = str2;
        }
        C1258261k r42 = new C1258261k(imageView, r5);
        AnonymousClass00C.A0D(str, 0);
        C002000v r3 = r6.A00;
        Reference reference = (Reference) r3.A04(str);
        if (reference == null || (bitmap = (Bitmap) reference.get()) == null) {
            C36391kE.A1Q(new AnonymousClass5MD(r3, r42, r6.A01, str), r6.A02);
            return;
        }
        r42.A00(bitmap);
    }
}
