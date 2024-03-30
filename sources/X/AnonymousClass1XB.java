package X;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1XB  reason: invalid class name */
public class AnonymousClass1XB implements C20420xX, C19680wL {
    public boolean A00;
    public boolean A01;
    public final AnonymousClass17Y A02;
    public final AnonymousClass19J A03;
    public final C19600wD A04;
    public final AnonymousClass1XE A05;
    public final AnonymousClass1XC A06;
    public final AnonymousClass1EZ A07;
    public final C24871Ec A08;
    public final C24601Db A09;
    public final C24611Dc A0A = C24611Dc.A00("PaymentsConnectivityManager", "network", "COMMON");

    public synchronized void BUP(AnonymousClass3K7 r5) {
        C24611Dc r3 = this.A0A;
        StringBuilder sb = new StringBuilder();
        sb.append("Connectivity connected: ");
        boolean z = r5.A02;
        sb.append(z);
        r3.A06(sb.toString());
        if (this.A00 && !z) {
            A00();
        }
    }

    public synchronized void BYl() {
        AnonymousClass1EZ r0;
        this.A0A.A06("ChatConnectivity connected");
        if (this.A00 && (r0 = this.A07) != null && r0.A0F()) {
            C24601Db r1 = this.A09;
            if (C19970wo.A00(r1.A01) - r1.A03().getLong("payments_pending_transactions_last_sync_time", 0) > TimeUnit.DAYS.toMillis(1)) {
                this.A05.A00(new AEF(this));
            }
        }
    }

    public /* synthetic */ void BYm() {
    }

    public synchronized void BYn() {
        this.A0A.A06("ChatConnectivity disconnected");
        if (this.A00) {
            A00();
        }
    }

    public /* synthetic */ void BYo() {
    }

    public /* synthetic */ void BYp() {
    }

    private void A00() {
        Map map;
        Set keySet;
        AnonymousClass1XD r2;
        C24871Ec r6 = this.A08;
        synchronized (r6) {
            map = r6.A00;
            keySet = map.keySet();
        }
        for (Object next : keySet) {
            synchronized (r6) {
                r2 = (AnonymousClass1XD) map.get(next);
            }
            C202059ky r1 = new C202059ky(7);
            synchronized (r6) {
                r6.A01.remove(next);
            }
            r2.Bf0(r1);
        }
        r6.A00();
        this.A01 = false;
    }

    public AnonymousClass1XB(AnonymousClass17Y r4, AnonymousClass19J r5, C19600wD r6, AnonymousClass1EZ r7, C24871Ec r8, C24601Db r9, AnonymousClass1XE r10, AnonymousClass1XC r11) {
        this.A02 = r4;
        this.A03 = r5;
        this.A09 = r9;
        this.A07 = r7;
        this.A08 = r8;
        this.A06 = r11;
        this.A04 = r6;
        this.A05 = r10;
    }
}
