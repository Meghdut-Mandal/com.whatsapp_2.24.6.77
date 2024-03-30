package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* renamed from: X.1Pr  reason: invalid class name and case insensitive filesystem */
public class C27751Pr {
    public final C20810yC A00;

    public static Drawable A00(Resources.Theme theme, Resources resources, AnonymousClass7fA r4, C20810yC r5, int i) {
        if (C20800yB.A01(C21000yV.A02, r5, 1257)) {
            return new C91274bk(theme, resources, r4, i);
        }
        return new C91284bl(theme, resources, r4, i);
    }

    public Drawable A01(Resources resources, Bitmap bitmap, AnonymousClass7fA r6) {
        if (C20800yB.A01(C21000yV.A02, this.A00, 1257)) {
            return new C91274bk(resources, bitmap, r6);
        }
        return new C91284bl(resources, bitmap, r6);
    }

    public C27751Pr(C20810yC r1) {
        this.A00 = r1;
    }
}
