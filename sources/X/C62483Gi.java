package X;

import com.whatsapp.jid.UserJid;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.3Gi  reason: invalid class name and case insensitive filesystem */
public class C62483Gi {
    public final C20810yC A00;
    public final C21010yW A01;
    public final AnonymousClass1KU A02;
    public final C19770wU A03;
    public final AtomicInteger A04;

    public C62483Gi(C20810yC r3, C21010yW r4, AnonymousClass1KU r5, C19770wU r6) {
        AtomicInteger atomicInteger = new AtomicInteger();
        this.A04 = atomicInteger;
        this.A00 = r3;
        this.A03 = r6;
        this.A01 = r4;
        this.A02 = r5;
        atomicInteger.set(1);
    }

    public void A00(UserJid userJid, Integer num, Integer num2) {
        Integer A0o = C36371kC.A0o();
        if (this.A00.A0E(1669)) {
            Integer num3 = num2;
            this.A03.Boy(new AnonymousClass753(num3, this, num, userJid, A0o, 14));
        }
    }

    public void A01(UserJid userJid, Integer num, Integer num2) {
        Integer A0p = C36371kC.A0p();
        if (this.A00.A0E(1669)) {
            Integer num3 = num2;
            this.A03.Boy(new AnonymousClass753(num3, this, num, userJid, A0p, 14));
        }
    }
}
