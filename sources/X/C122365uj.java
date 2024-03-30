package X;

import android.content.Context;
import android.os.Build;
import android.os.ConditionVariable;

/* renamed from: X.5uj  reason: invalid class name and case insensitive filesystem */
public class C122365uj {
    public C114235gt A00;
    public AnonymousClass04S A01;
    public boolean A02;
    public boolean A03;

    public C122365uj(Context context) {
        ConditionVariable conditionVariable = C18740tg.A00;
        if (Build.VERSION.SDK_INT >= 23) {
            this.A00 = new C114235gt(context);
            this.A01 = new C165167sz(this, 12);
        }
    }
}
