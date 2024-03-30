package X;

import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.4a6  reason: invalid class name and case insensitive filesystem */
public class C90404a6 implements AnonymousClass1NL {
    public Object A00;
    public final int A01;

    public C90404a6(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BTN(AnonymousClass11F r4, UserJid userJid, C64933Qa r6, int i) {
        C19930wk r2;
        Runnable r1;
        int i2 = this.A01;
        Object obj = this.A00;
        if (i2 != 0) {
            r2 = ((AnonymousClass3TQ) obj).A07;
            r1 = new C80403vL(this, r4, r6, 24);
        } else {
            r2 = ((C40021ub) obj).A0M;
            r1 = new C80263v7(this, r4, 8);
        }
        r2.execute(r1);
    }

    public /* synthetic */ void BTO(AnonymousClass11F r1, C64933Qa r2) {
    }

    public /* synthetic */ void BTP(AnonymousClass11F r4, C64933Qa r5) {
        if (this.A01 != 0) {
            ((AnonymousClass3TQ) this.A00).A07.execute(new C80403vL(this, r4, r5, 25));
        }
    }

    public /* synthetic */ void BTQ(C64933Qa r3, List list) {
        if (this.A01 != 0) {
            ((AnonymousClass3TQ) this.A00).A07.execute(C81043wN.A00);
        }
    }

    public /* synthetic */ void BaT(AnonymousClass11F r1) {
    }
}
