package X;

import android.content.Context;

/* renamed from: X.8fz  reason: invalid class name */
public class AnonymousClass8fz extends AIB {
    public final /* synthetic */ AnonymousClass1XD A00;
    public final /* synthetic */ AnonymousClass1XC A01;
    public final /* synthetic */ AZ9 A02;
    public final /* synthetic */ C23075B3f A03;
    public final /* synthetic */ boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8fz(Context context, AnonymousClass1XD r2, C29221Vu r3, AnonymousClass1XC r4, AZ9 az9, C23075B3f b3f, C19640wH r7, boolean z) {
        super(context, r3, r7);
        this.A01 = r4;
        this.A03 = b3f;
        this.A02 = az9;
        this.A04 = z;
        this.A00 = r2;
    }

    public void A06(C202059ky r3) {
        C23075B3f b3f = this.A03;
        if (b3f != null) {
            b3f.BOb(r3, 11);
        }
        AnonymousClass1XD r0 = this.A00;
        if (r0 != null) {
            r0.Bf0(r3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005a, code lost:
        if ("true".equals(r1) != false) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.C203399nx r10) {
        /*
            r9 = this;
            X.B3f r2 = r9.A03
            if (r2 == 0) goto L_0x000a
            r1 = 11
            r0 = 0
            r2.BOb(r0, r1)
        L_0x000a:
            X.8gi r5 = new X.8gi
            r5.<init>()
            X.1XC r6 = r9.A01
            X.1VY r1 = r6.A0A
            X.AZ9 r0 = r9.A02
            java.util.ArrayList r0 = r1.A04(r0, r10)
            r5.A01 = r0
            X.9nx r0 = X.C203399nx.A03(r10)
            if (r0 == 0) goto L_0x0062
            java.lang.String r7 = "after"
            X.9u9 r4 = new X.9u9
            r4.<init>()
            X.1AL[] r3 = r0.A0k()
            if (r3 == 0) goto L_0x0060
            r2 = 0
        L_0x002f:
            int r0 = r3.length
            if (r2 >= r0) goto L_0x0060
            r0 = r3[r2]
            java.lang.String r8 = r0.A02
            java.lang.String r1 = r0.A03
            boolean r0 = r7.equals(r8)
            if (r0 == 0) goto L_0x0043
            r4.A00 = r1
        L_0x0040:
            int r2 = r2 + 1
            goto L_0x002f
        L_0x0043:
            java.lang.String r0 = "last"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0040
            java.lang.String r0 = "1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x005c
            java.lang.String r0 = "true"
            boolean r1 = r0.equals(r1)
            r0 = 0
            if (r1 == 0) goto L_0x005d
        L_0x005c:
            r0 = 1
        L_0x005d:
            r4.A01 = r0
            goto L_0x0040
        L_0x0060:
            r5.A00 = r4
        L_0x0062:
            boolean r0 = r9.A04
            if (r0 == 0) goto L_0x0086
            X.1Db r2 = r6.A06
            X.0wo r0 = r2.A01
            long r3 = X.C19970wo.A00(r0)
            android.content.SharedPreferences$Editor r1 = X.C90494aF.A0E(r2)
            java.lang.String r0 = "payments_all_transactions_last_sync_time"
            X.C36341k9.A0w(r1, r0, r3)
            X.1Dc r2 = r2.A02
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "updateAllTransactionsLastSyncTimeMilli to: "
            java.lang.String r0 = X.C36381kD.A0z(r0, r1, r3)
            r2.A06(r0)
        L_0x0086:
            r6.A03(r5)
            X.1XD r0 = r9.A00
            if (r0 == 0) goto L_0x0090
            r0.Bf1(r5)
        L_0x0090:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8fz.A07(X.9nx):void");
    }

    public void A05(C202059ky r1) {
        A06(r1);
    }
}
