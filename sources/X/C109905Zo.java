package X;

import android.text.TextUtils;
import android.widget.ImageView;

/* renamed from: X.5Zo  reason: invalid class name and case insensitive filesystem */
public abstract class C109905Zo {
    public static void A00(ImageView imageView, AnonymousClass9HG r11, C196089Xp r12, C134966bu r13) {
        ImageView imageView2 = imageView;
        C53332r9.A00(imageView);
        if (r13 != null) {
            String str = r13.A01;
            if (!TextUtils.isEmpty(str)) {
                AnonymousClass9HG r5 = r11;
                C196089Xp r1 = r12;
                r1.A01(imageView2, new C206759tv(r13.A00, str, (String) null, 0, 0), (C22914AyQ) null, r5, C143006pp.A00, C143036ps.A00, 2);
            }
        }
    }
}
