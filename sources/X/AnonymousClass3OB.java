package X;

import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.3OB  reason: invalid class name */
public class AnonymousClass3OB {
    public final C19730wQ A00;
    public final AnonymousClass1DT A01;
    public final AnonymousClass1A6 A02;
    public final C19970wo A03;
    public final C19420v0 A04;
    public final AnonymousClass189 A05;
    public final AnonymousClass187 A06;
    public final AnonymousClass18I A07;
    public final C20310xM A08;
    public final AnonymousClass17X A09;
    public final C238019x A0A;
    public final C19770wU A0B;
    public final C237819v A0C;

    public AnonymousClass3OB(C19730wQ r1, AnonymousClass1DT r2, C237819v r3, AnonymousClass1A6 r4, C19970wo r5, C19420v0 r6, AnonymousClass189 r7, AnonymousClass187 r8, AnonymousClass18I r9, C20310xM r10, AnonymousClass17X r11, C238019x r12, C19770wU r13) {
        this.A03 = r5;
        this.A00 = r1;
        this.A0B = r13;
        this.A07 = r9;
        this.A01 = r2;
        this.A06 = r8;
        this.A08 = r10;
        this.A05 = r7;
        this.A04 = r6;
        this.A02 = r4;
        this.A0A = r12;
        this.A09 = r11;
        this.A0C = r3;
    }

    public static HashSet A00(AnonymousClass3OB r7, UserJid userJid) {
        HashSet A0F;
        HashSet A0F2;
        HashSet A16 = C36441kJ.A16();
        C19730wQ r2 = r7.A00;
        PhoneUserJid A0e = C36371kC.A0e(r2);
        if (r2.A0M(A0e)) {
            A0F = new HashSet(r7.A02.A06());
        } else {
            A0F = r7.A09.A07.A0F(A0e);
        }
        if (r2.A0M(userJid)) {
            A0F2 = new HashSet(r7.A02.A06());
        } else {
            A0F2 = r7.A09.A07.A0F(userJid);
        }
        Iterator it = A0F2.iterator();
        while (it.hasNext()) {
            AnonymousClass144 r5 = (AnonymousClass144) it.next();
            if (A0F.contains(r5)) {
                C20760y7 A052 = r7.A09.A07.A0C(r5).A05();
                if (A052.contains(userJid) && (A052.contains(C36441kJ.A0n(r2)) || A052.contains(r2.A08()) || (r5 instanceof C177618e5))) {
                    A16.add(r5);
                }
            }
        }
        return A16;
    }
}
