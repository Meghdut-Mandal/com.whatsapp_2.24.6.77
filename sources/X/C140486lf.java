package X;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* renamed from: X.6lf  reason: invalid class name and case insensitive filesystem */
public final class C140486lf implements C160347kr {
    public /* bridge */ /* synthetic */ Object B1l(Context context, Object obj, Object obj2, Object obj3) {
        C98134qw r3 = (C98134qw) obj;
        C98194r2 r4 = (C98194r2) obj2;
        C36321k7.A0x(r3, r4);
        r3.setForegroundCompat(r4.A03);
        return null;
    }

    public /* bridge */ /* synthetic */ boolean BtZ(Object obj, Object obj2, Object obj3, Object obj4) {
        C98194r2 r4 = (C98194r2) obj;
        C98194r2 r5 = (C98194r2) obj2;
        C36321k7.A0w(r4, r5);
        Drawable drawable = r4.A03;
        Drawable drawable2 = r5.A03;
        if (drawable == null) {
            if (drawable2 != null) {
                return true;
            }
            return false;
        } else if (drawable2 == null || drawable.equals(drawable2)) {
            return false;
        } else {
            return true;
        }
    }

    public /* bridge */ /* synthetic */ void BwG(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        C98134qw r3 = (C98134qw) obj;
        AnonymousClass00C.A0D(r3, 1);
        r3.setForegroundCompat((Drawable) null);
    }

    public /* synthetic */ String BB1() {
        return AnonymousClass5YX.A01(this);
    }
}
