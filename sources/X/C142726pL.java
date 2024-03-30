package X;

import com.whatsapp.cron.daily.RandomizedDailyCronWorker;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6pL  reason: invalid class name and case insensitive filesystem */
public class C142726pL implements C19710wO {
    public final C19420v0 A00;
    public final C21570zS A01;
    public final C19970wo A02;
    public final AnonymousClass12P A03;
    public final AnonymousClass005 A04;

    public synchronized void A00(boolean z) {
        long j;
        C19420v0 r6 = this.A00;
        long j2 = C36341k9.A0E(r6).getLong("next_randomized_daily_cron", 0);
        long A002 = C19970wo.A00(this.A02);
        if (j2 <= 0 || j2 - A002 > 86400000) {
            j = (long) new Random().nextInt(43200000);
        } else if (j2 > A002) {
            AnonymousClass6XI.A02(j2);
            if (z) {
                C36341k9.A0w(C19420v0.A00(r6), "next_randomized_daily_cron", j2);
                C97384pE r4 = new C97384pE(RandomizedDailyCronWorker.class);
                r4.A02(Math.abs(j2 - A002), TimeUnit.MILLISECONDS);
                r4.A06("tag.whatsapp.cron.daily.randomized");
                C90514aH.A0V(this.A01).A07((C97404pG) r4.A00(), C023109s.A00, "tag.whatsapp.cron.daily.randomized");
            }
        } else {
            AnonymousClass12P r0 = this.A03;
            r0.A06();
            if (r0.A08) {
                Iterator A0q = C90474aD.A0q(this.A04);
                while (A0q.hasNext()) {
                    ((C159417jK) A0q.next()).BV1();
                }
            }
            j2 += 86400000;
            if (j2 < A002) {
                j = j2 % 86400000;
            }
            AnonymousClass6XI.A02(j2);
            C36341k9.A0w(C19420v0.A00(r6), "next_randomized_daily_cron", j2);
            C97384pE r42 = new C97384pE(RandomizedDailyCronWorker.class);
            r42.A02(Math.abs(j2 - A002), TimeUnit.MILLISECONDS);
            r42.A06("tag.whatsapp.cron.daily.randomized");
            C90514aH.A0V(this.A01).A07((C97404pG) r42.A00(), C023109s.A00, "tag.whatsapp.cron.daily.randomized");
        }
        j2 = j + A002;
        AnonymousClass6XI.A02(j2);
        C36341k9.A0w(C19420v0.A00(r6), "next_randomized_daily_cron", j2);
        C97384pE r422 = new C97384pE(RandomizedDailyCronWorker.class);
        r422.A02(Math.abs(j2 - A002), TimeUnit.MILLISECONDS);
        r422.A06("tag.whatsapp.cron.daily.randomized");
        C90514aH.A0V(this.A01).A07((C97404pG) r422.A00(), C023109s.A00, "tag.whatsapp.cron.daily.randomized");
    }

    public String BIB() {
        return "RandomizedDailyCronExecutor";
    }

    public void BRL() {
        A00(false);
    }

    public /* synthetic */ void BRM() {
    }

    public C142726pL(C19970wo r1, C19420v0 r2, AnonymousClass12P r3, C21570zS r4, AnonymousClass005 r5) {
        this.A02 = r1;
        this.A01 = r4;
        this.A03 = r3;
        this.A00 = r2;
        this.A04 = r5;
    }
}
