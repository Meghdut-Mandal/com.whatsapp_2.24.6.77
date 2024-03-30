package X;

import com.whatsapp.util.Log;

/* renamed from: X.1RV  reason: invalid class name */
public final class AnonymousClass1RV {
    public final AnonymousClass005 A00;
    public final AnonymousClass005 A01;
    public final AnonymousClass005 A02;
    public final AnonymousClass005 A03;

    public AnonymousClass1RV(AnonymousClass005 r2, AnonymousClass005 r3, AnonymousClass005 r4, AnonymousClass005 r5) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r3, 2);
        AnonymousClass00C.A0D(r4, 3);
        AnonymousClass00C.A0D(r5, 4);
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = r4;
        this.A02 = r5;
    }

    public int A00() {
        AnonymousClass005 r5 = this.A01;
        if (((C20060wx) r5.get()).A02() < AnonymousClass1V2.A01((C20060wx) r5.get(), (C20810yC) this.A00.get())) {
            StringBuilder sb = new StringBuilder();
            sb.append("AccountSwitcherBridgeImpl/shouldAllowSwitchingAccounts/low on storage; available storage = ");
            sb.append(((C20060wx) r5.get()).A02());
            Log.i(sb.toString());
            return 1;
        } else if (((AnonymousClass1MK) this.A03.get()).A00()) {
            Log.i("AccountSwitcherBridgeImpl/shouldAllowSwitchingAccounts/call in progress");
            return 2;
        } else if (!((C33101ei) this.A02.get()).A0Q.get()) {
            return 0;
        } else {
            Log.i("AccountSwitcherBridgeImpl/shouldAllowSwitchingAccounts/backup in progress");
            return 3;
        }
    }
}
