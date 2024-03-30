package X;

/* renamed from: X.1XE  reason: invalid class name */
public class AnonymousClass1XE implements AnonymousClass1XD {
    public int A00;
    public int A01;
    public final C19970wo A02;
    public final C24881Ed A03;
    public final C24601Db A04;
    public final AnonymousClass1EU A05;
    public final C24611Dc A06 = C24611Dc.A00("PaymentUnfinishedTransactionsSyncer", "network", "COMMON");
    public final AnonymousClass1EZ A07;
    public final AnonymousClass1EV A08;
    public final C19770wU A09;

    public synchronized void A00(C22957Az9 az9) {
        if (!this.A08.A04(0) || !this.A07.A0F()) {
            this.A06.A06("skipped as account setup is incomplete.");
        } else {
            this.A09.Boy(new C35761jD(this, az9, 4));
        }
    }

    public void Bes(C202059ky r4) {
        C24611Dc r2 = this.A06;
        StringBuilder sb = new StringBuilder();
        sb.append("onRequestError: ");
        sb.append(r4);
        r2.A05(sb.toString());
        C23075B3f BBn = this.A05.A05().BBn();
        if (BBn != null) {
            BBn.BOb(r4, 10);
        }
    }

    public void Bf0(C202059ky r4) {
        C24611Dc r2 = this.A06;
        StringBuilder sb = new StringBuilder();
        sb.append("onResponseError: ");
        sb.append(r4);
        r2.A05(sb.toString());
        C23075B3f BBn = this.A05.A05().BBn();
        if (BBn != null) {
            BBn.BOb(r4, 10);
        }
    }

    public void Bf1(AnonymousClass9KX r6) {
        C23075B3f BBn = this.A05.A05().BBn();
        if (BBn != null) {
            BBn.BOb((C202059ky) null, 10);
        }
        if (r6.A02) {
            int i = this.A00 + 1;
            this.A00 = i;
            C24611Dc r4 = this.A06;
            StringBuilder sb = new StringBuilder();
            sb.append("finished syncing ");
            sb.append(i);
            sb.append(" transactions; total to sync: ");
            sb.append(this.A01);
            r4.A06(sb.toString());
            if (this.A01 == this.A00) {
                long A002 = C19970wo.A00(this.A02);
                this.A04.A03().edit().putLong("payments_pending_transactions_last_sync_time", A002).apply();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("updatePendingTransactionsLastSyncTimeMilli to: ");
                sb2.append(A002);
                r4.A06(sb2.toString());
            }
        }
    }

    public AnonymousClass1XE(C19970wo r4, C24881Ed r5, AnonymousClass1EZ r6, C24601Db r7, AnonymousClass1EV r8, AnonymousClass1EU r9, C19770wU r10) {
        this.A02 = r4;
        this.A09 = r10;
        this.A05 = r9;
        this.A04 = r7;
        this.A07 = r6;
        this.A08 = r8;
        this.A03 = r5;
    }
}
