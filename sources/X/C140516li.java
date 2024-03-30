package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.6li  reason: invalid class name and case insensitive filesystem */
public class C140516li implements C160347kr {
    public /* bridge */ /* synthetic */ Object B1l(Context context, Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        C98204r3 r5 = (C98204r3) obj2;
        if (r5.A01 <= 0) {
            return null;
        }
        if (r5.A0D.A00 == 1) {
            view.setVerticalFadingEdgeEnabled(true);
        } else {
            view.setHorizontalFadingEdgeEnabled(true);
        }
        view.setFadingEdgeLength(r5.A01);
        return null;
    }

    public /* bridge */ /* synthetic */ boolean BtZ(Object obj, Object obj2, Object obj3, Object obj4) {
        return C36381kD.A1U(((C98204r3) obj).A01, ((C98204r3) obj2).A01);
    }

    public /* bridge */ /* synthetic */ void BwG(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        View view = (View) obj;
        view.setVerticalFadingEdgeEnabled(false);
        view.setHorizontalFadingEdgeEnabled(false);
        view.setFadingEdgeLength(0);
    }

    public /* synthetic */ String BB1() {
        return AnonymousClass5YX.A01(this);
    }
}
