package X;

import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2kK  reason: invalid class name and case insensitive filesystem */
public class C50172kK extends C132446Tt {
    public AnonymousClass16A A00;
    public final C19730wQ A01;
    public final C26421Kc A02;
    public final C20430xY A03;
    public final UserJid A04;
    public final WeakReference A05;
    public final CountDownLatch A06 = new CountDownLatch(1);

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        this.A02.unregisterObserver(this.A00);
        C225314u A0W = C36411kG.A0W(this.A05);
        if (A0W != null) {
            A0W.Bnv();
            A0W.A33(C36431kI.A0E(A0W, this.A04, (Integer) null), false);
        }
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C131666Pz r1;
        AnonymousClass6NS r0;
        if (this.A01.A0L()) {
            r1 = new C131666Pz(C108515Tu.A0B);
            r0 = AnonymousClass6NS.A0D;
        } else {
            r1 = new C131666Pz(C108515Tu.A09);
            r0 = AnonymousClass6NS.A0C;
        }
        r1.A00 = r0;
        r1.A02 = true;
        r1.A04(this.A04);
        if (!this.A03.A02(r1.A01()).A00()) {
            return null;
        }
        try {
            this.A06.await(AnonymousClass6X5.A0L, TimeUnit.MILLISECONDS);
            return null;
        } catch (InterruptedException unused) {
            Log.w("ConversationRowContact/OpenBusinessProfileNotInContactListTask was interrupted while waiting for biz identity response.");
            return null;
        }
    }

    public void A09() {
        this.A02.unregisterObserver(this.A00);
    }

    public void A0A() {
        C225314u A0W = C36411kG.A0W(this.A05);
        if (A0W != null) {
            A0W.Bu2(0, R.string.f12nameremoved);
        }
        this.A02.registerObserver(this.A00);
    }

    public C50172kK(C19730wQ r3, AnonymousClass155 r4, C26421Kc r5, C20430xY r6, UserJid userJid) {
        this.A05 = AnonymousClass001.A0F(r4);
        this.A01 = r3;
        this.A03 = r6;
        this.A02 = r5;
        this.A04 = userJid;
        this.A00 = new C69253dE(this, userJid);
    }
}
