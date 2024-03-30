package X;

import com.whatsapp.jid.Jid;
import java.util.Set;

/* renamed from: X.1ut  reason: invalid class name and case insensitive filesystem */
public final class C40081ut extends AnonymousClass04R implements AnonymousClass4QF {
    public final C001700s A00 = C36431kI.A0S();
    public final AnonymousClass1FV A01;
    public final Jid A02;
    public final C19770wU A03;

    public void A0R() {
        Set set = this.A01.A08;
        synchronized (set) {
            set.remove(this);
        }
    }

    public void Bce(AnonymousClass3Q1 r3, C223313w r4) {
        Boolean bool;
        if (AnonymousClass00C.A0J(r4, this.A02) && (bool = r3.A01) != null) {
            this.A00.A0C(bool);
        }
    }

    public C40081ut(AnonymousClass1FV r2, Jid jid, C19770wU r4) {
        C36321k7.A0x(r4, r2);
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = jid;
    }
}
