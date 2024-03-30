package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.4ax  reason: invalid class name and case insensitive filesystem */
public final class C90834ax extends BroadcastReceiver {
    public final C29061Ve A00;

    public C90834ax(C29061Ve r1) {
        C18740tg.A06(r1);
        this.A00 = r1;
    }

    public void onReceive(Context context, Intent intent) {
        if (getResultCode() == -1) {
            AnonymousClass61Z r8 = new AnonymousClass61Z(getResultData(), getResultExtras(true).getLong("timestamp", Long.MAX_VALUE));
            intent.getPackage();
            String str = intent.getPackage();
            C29061Ve r6 = this.A00;
            AnonymousClass61Z BFs = r6.BFs();
            if (BFs.A01 == null || (r8.A01 != null && r8.A00 < BFs.A00)) {
                r6.BrX(r8);
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("updated phone id from ");
                A0u.append(BFs);
                A0u.append(" to ");
                A0u.append(r8);
                C36321k7.A1Q(" based on package ", str, A0u);
                return;
            }
            return;
        }
        intent.getPackage();
    }
}
