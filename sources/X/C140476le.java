package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.6le  reason: invalid class name and case insensitive filesystem */
public final class C140476le implements C160347kr {
    public /* bridge */ /* synthetic */ Object B1l(Context context, Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        C98194r2 r4 = (C98194r2) obj2;
        C36321k7.A0x(view, r4);
        view.setBackground(r4.A02);
        return null;
    }

    public /* bridge */ /* synthetic */ boolean BtZ(Object obj, Object obj2, Object obj3, Object obj4) {
        C98194r2 r4 = (C98194r2) obj;
        C98194r2 r5 = (C98194r2) obj2;
        C36321k7.A0w(r4, r5);
        Drawable drawable = r4.A02;
        Drawable drawable2 = r5.A02;
        if (drawable == null) {
            if (drawable2 != null) {
                return true;
            }
            return false;
        } else if (!drawable.equals(drawable2)) {
            return true;
        } else {
            return false;
        }
    }

    public /* bridge */ /* synthetic */ void BwG(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        View view = (View) obj;
        AnonymousClass00C.A0D(view, 1);
        view.setBackground((Drawable) null);
    }

    public /* synthetic */ String BB1() {
        return AnonymousClass5YX.A01(this);
    }
}
