package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.3vY  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C80533vY implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C603237k A03;
    public final /* synthetic */ UserJid A04;

    public /* synthetic */ C80533vY(C603237k r1, UserJid userJid, int i, int i2, long j) {
        this.A03 = r1;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = j;
        this.A04 = userJid;
    }

    public final void run() {
        C603237k r4 = this.A03;
        int i = this.A00;
        int i2 = this.A01;
        long j = this.A02;
        UserJid userJid = this.A04;
        C45292Qu r6 = new C45292Qu();
        r6.A01 = Integer.valueOf(i);
        r6.A02 = Integer.valueOf(i2);
        r6.A03 = Long.valueOf(j);
        boolean z = true;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        C20810yC r1 = r4.A00;
        boolean A0E = r1.A0E(2888);
        Boolean valueOf = Boolean.valueOf(A0E);
        boolean A0E2 = r1.A0E(2887);
        Boolean valueOf2 = Boolean.valueOf(A0E2);
        AnonymousClass61D r0 = r4.A02;
        if (!A0E && !A0E2) {
            z = false;
        }
        r0.A00(userJid, new C76413op(r6, userJid, valueOf, valueOf2, countDownLatch), z);
        try {
            countDownLatch.await();
            r4.A01.Bly(r6);
        } catch (InterruptedException e) {
            Log.e("log interrupted", e);
        }
    }
}
