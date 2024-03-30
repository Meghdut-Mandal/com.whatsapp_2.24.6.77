package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1GR  reason: invalid class name */
public final class AnonymousClass1GR {
    public final C19730wQ A00;
    public final AnonymousClass16D A01;
    public final AnonymousClass17X A02;
    public final C20500xf A03;
    public final AnonymousClass1C6 A04;
    public final AnonymousClass1A5 A05;

    public AnonymousClass1GR(C19730wQ r2, AnonymousClass16D r3, AnonymousClass1A5 r4, AnonymousClass17X r5, C20500xf r6, AnonymousClass1C6 r7) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r7, 2);
        AnonymousClass00C.A0D(r6, 3);
        AnonymousClass00C.A0D(r3, 4);
        AnonymousClass00C.A0D(r5, 5);
        AnonymousClass00C.A0D(r4, 6);
        this.A00 = r2;
        this.A04 = r7;
        this.A03 = r6;
        this.A01 = r3;
        this.A02 = r5;
        this.A05 = r4;
    }

    public final boolean A00(AnonymousClass2bU r8) {
        AnonymousClass141 r4;
        AnonymousClass11F r1;
        AnonymousClass11F r12 = r8.A1J.A00;
        if (r12 == null) {
            return false;
        }
        AnonymousClass141 A012 = this.A05.A01(r12);
        if (A012.A0G()) {
            AnonymousClass11F A0J = r8.A0J();
            AnonymousClass16D r13 = this.A01;
            UserJid A0G = r13.A0G((GroupJid) A012.A06(GroupJid.class));
            AnonymousClass141 r5 = null;
            if (A0G != null) {
                r4 = r13.A0D(A0G);
            } else {
                r4 = null;
            }
            C19730wQ r0 = this.A00;
            r0.A0G();
            PhoneUserJid phoneUserJid = r0.A03;
            if (A0J != null) {
                r5 = r13.A0D(A0J);
            }
            AnonymousClass147 r14 = (AnonymousClass147) A012.A06(AnonymousClass147.class);
            if ((r14 == null || !this.A02.A0H(r14)) && ((r4 == null || (r4.A0F == null && !C1901797e.A00(phoneUserJid, r4.A0H))) && ((r5 == null || r5.A0F == null) && ((r1 = (AnonymousClass11F) A012.A06(AnonymousClass11F.class)) == null || AnonymousClass1C6.A00(r1, this.A04) != 1)))) {
                return false;
            }
            return true;
        } else if (A012.A0F != null || AnonymousClass3M3.A01(this.A03, A012.A0H)) {
            return true;
        } else {
            AnonymousClass11F r15 = (AnonymousClass11F) A012.A06(AnonymousClass11F.class);
            if (r15 == null || AnonymousClass1C6.A00(r15, this.A04) != 1) {
                return false;
            }
            return true;
        }
    }
}
