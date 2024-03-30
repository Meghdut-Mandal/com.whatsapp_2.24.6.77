package X;

import com.whatsapp.jid.UserJid;
import java.util.Set;

/* renamed from: X.0xV  reason: invalid class name and case insensitive filesystem */
public final class C20400xV implements AnonymousClass00M {
    public Set A00;
    public final C19700wN A01;
    public final C19730wQ A02;
    public final C237819v A03;
    public final C231817m A04;
    public final Object A05 = new Object();

    public C20400xV(C19700wN r2, C19730wQ r3, C237819v r4, C231817m r5) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r3, 2);
        AnonymousClass00C.A0D(r5, 3);
        AnonymousClass00C.A0D(r4, 4);
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = r5;
        this.A03 = r4;
    }

    public final boolean A01(UserJid userJid) {
        boolean contains;
        AnonymousClass00C.A0D(userJid, 0);
        if (this.A02.A0M(userJid)) {
            return false;
        }
        synchronized (this.A05) {
            if (this.A00 == null) {
                A00(this);
            }
            Set set = this.A00;
            if (set == null) {
                AnonymousClass00C.A0G("hostedUserJids");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
            contains = set.contains(userJid);
        }
        return contains;
    }

    public static final void A00(C20400xV r4) {
        if (C224714l.A02()) {
            r4.A01.A0E("hostedjids-load-mainthread", (String) null, true);
            synchronized (r4.A05) {
                r4.A00 = r4.A04.A02();
            }
        } else {
            synchronized (r4.A05) {
                r4.A00 = r4.A04.A02();
            }
        }
        if (r4.A00 == null) {
            AnonymousClass00C.A0G("hostedUserJids");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
    }
}
