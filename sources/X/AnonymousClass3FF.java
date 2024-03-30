package X;

import com.whatsapp.jid.Jid;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.3FF  reason: invalid class name */
public class AnonymousClass3FF {
    public final C19730wQ A00;
    public final AnonymousClass189 A01;
    public final C20400xV A02;
    public final C230416y A03;
    public final AnonymousClass12O A04;
    public final AnonymousClass1FV A05;
    public final AnonymousClass3GL A06;
    public final C231417i A07;
    public final C20810yC A08;
    public final C19930wk A09;
    public final AnonymousClass1OF A0A;

    public Set A00(Set set) {
        if (!this.A08.A0E(7587)) {
            return set;
        }
        HashSet A16 = C36441kJ.A16();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Jid jid = (Jid) it.next();
            if (!AnonymousClass9ZV.A00(jid)) {
                A16.add(jid);
            }
        }
        return A16;
    }

    public AnonymousClass3FF(C19730wQ r2, AnonymousClass1OF r3, AnonymousClass189 r4, C20400xV r5, C230416y r6, AnonymousClass12O r7, AnonymousClass1FV r8, AnonymousClass3GL r9, C231417i r10, C20810yC r11, C19770wU r12) {
        this.A08 = r11;
        this.A00 = r2;
        this.A02 = r5;
        this.A04 = r7;
        this.A07 = r10;
        this.A01 = r4;
        this.A0A = r3;
        this.A06 = r9;
        this.A09 = C36411kG.A0r(r12);
        this.A05 = r8;
        this.A03 = r6;
    }
}
