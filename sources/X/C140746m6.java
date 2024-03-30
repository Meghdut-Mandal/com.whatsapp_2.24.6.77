package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.6m6  reason: invalid class name and case insensitive filesystem */
public final class C140746m6 implements C160347kr {
    public final /* synthetic */ C1271967i A00;
    public final /* synthetic */ C140456lc A01;
    public final /* synthetic */ C160377ku A02;

    public C140746m6(C1271967i r1, C140456lc r2, C160377ku r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ Object B1l(Context context, Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        AnonymousClass00C.A0D(view, 1);
        view.setOnClickListener(new C67113Yo(this.A00, this.A01, this.A02, 0));
        return null;
    }

    public /* bridge */ /* synthetic */ void BwG(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        View view = (View) obj;
        AnonymousClass00C.A0D(view, 1);
        view.setOnClickListener((View.OnClickListener) null);
        view.setClickable(false);
    }

    public /* synthetic */ String BB1() {
        return AnonymousClass5YX.A01(this);
    }

    public /* bridge */ /* synthetic */ boolean BtZ(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }
}
