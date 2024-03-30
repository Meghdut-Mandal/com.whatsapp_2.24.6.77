package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.6lh  reason: invalid class name and case insensitive filesystem */
public final class C140506lh implements C160347kr {
    public /* bridge */ /* synthetic */ Object B1l(Context context, Object obj, Object obj2, Object obj3) {
        C98134qw r3 = (C98134qw) obj;
        C98194r2 r4 = (C98194r2) obj2;
        C36321k7.A0x(r3, r4);
        r3.setOnTouchListener((View.OnTouchListener) null);
        r3.A00 = null;
        View.OnClickListener onClickListener = r4.A04;
        if (onClickListener != null) {
            r3.setOnClickListener(onClickListener);
        }
        r3.setOnFocusChangeListener((View.OnFocusChangeListener) null);
        r3.setFocusable(false);
        r3.setFocusableInTouchMode(false);
        r3.setEnabled(r4.A07);
        return null;
    }

    public /* bridge */ /* synthetic */ void BwG(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        C98134qw r4 = (C98134qw) obj;
        AnonymousClass00C.A0D(r4, 1);
        r4.setOnTouchListener((View.OnTouchListener) null);
        r4.A00 = null;
        r4.setOnClickListener((View.OnClickListener) null);
        r4.setClickable(false);
        r4.setOnLongClickListener((View.OnLongClickListener) null);
        r4.setLongClickable(false);
        r4.setOnFocusChangeListener((View.OnFocusChangeListener) null);
        r4.setFocusable(false);
        r4.setFocusableInTouchMode(false);
    }

    public /* synthetic */ String BB1() {
        return AnonymousClass5YX.A01(this);
    }

    public /* bridge */ /* synthetic */ boolean BtZ(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }
}
