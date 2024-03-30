package X;

import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9dH  reason: invalid class name and case insensitive filesystem */
public final class C198329dH {
    public C001700s A00;
    public C001700s A01;
    public C001700s A02;
    public C001700s A03;
    public C001700s A04;
    public C001700s A05;
    public C001700s A06;
    public C001700s A07;
    public C001700s A08;
    public C001700s A09;
    public C001700s A0A;
    public final AnonymousClass17Y A0B;
    public final AnonymousClass1KK A0C;
    public final AnonymousClass6MH A0D;
    public final AnonymousClass6VE A0E;
    public final AnonymousClass8V9 A0F;
    public final C31771cM A0G;
    public final C29461Ws A0H;
    public final AnonymousClass9Y1 A0I;
    public final AnonymousClass8VB A0J;
    public final UserJid A0K;
    public final C23042B1n A0L = new B8J(this, 0);
    public final C23042B1n A0M = new B8J(this, 1);
    public final C19770wU A0N;

    public static final Boolean A00(C198329dH r3, String str) {
        List A0w;
        C001700s r0 = r3.A01;
        if (r0 == null || (A0w = C36401kF.A0w(r0)) == null) {
            return null;
        }
        Iterator it = A0w.iterator();
        while (it.hasNext()) {
            C207269up r1 = C165617ti.A0M(it).A02;
            if (AnonymousClass00C.A0J(r1.A0F, str)) {
                if (r1.A0B != null) {
                    return C36371kC.A0m();
                }
                return null;
            }
        }
        return null;
    }

    public C198329dH(AnonymousClass17Y r3, AnonymousClass1KK r4, AnonymousClass6MH r5, AnonymousClass6VE r6, AnonymousClass8V9 r7, C31771cM r8, C29461Ws r9, AnonymousClass9Y1 r10, AnonymousClass8VB r11, UserJid userJid, C19770wU r13) {
        C36321k7.A1B(userJid, r3, r13, r5, r6);
        C36321k7.A10(r8, r9);
        AnonymousClass00C.A0D(r4, 10);
        AnonymousClass00C.A0D(r10, 11);
        this.A0K = userJid;
        this.A0B = r3;
        this.A0N = r13;
        this.A0D = r5;
        this.A0E = r6;
        this.A0G = r8;
        this.A0H = r9;
        this.A0J = r11;
        this.A0F = r7;
        this.A0C = r4;
        this.A0I = r10;
    }
}
