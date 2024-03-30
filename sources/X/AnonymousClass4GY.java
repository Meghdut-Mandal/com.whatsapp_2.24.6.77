package X;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.4GY  reason: invalid class name */
public final class AnonymousClass4GY extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C596934x $visibleMessages;
    public final /* synthetic */ AnonymousClass3K9 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4GY(AnonymousClass3K9 r2, C596934x r3) {
        super(0);
        this.this$0 = r2;
        this.$visibleMessages = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass3L1 r0;
        AnonymousClass1GM r02;
        C65013Qj r03;
        AnonymousClass3K9 r4 = this.this$0;
        HashSet hashSet = this.$visibleMessages.A00;
        AnonymousClass1ST r3 = r4.A01;
        HashSet A16 = C36441kJ.A16();
        synchronized (r3.A0F) {
            Iterator it = r3.A0B().iterator();
            while (it.hasNext()) {
                AnonymousClass2bU A0r = C36441kJ.A0r(it);
                if (C64933Qa.A04(A0r)) {
                    A16.add(A0r);
                }
            }
        }
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it2 = A16.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            AnonymousClass2bU r1 = (AnonymousClass2bU) next;
            if (!hashSet.contains(r1) && ((r03 = r1.A01) == null || r03.A0E < 70)) {
                A0I.add(next);
            }
        }
        Iterator it3 = A0I.iterator();
        while (it3.hasNext()) {
            r3.A0E(C36441kJ.A0r(it3));
        }
        ArrayList A0I2 = AnonymousClass001.A0I();
        Iterator it4 = hashSet.iterator();
        while (it4.hasNext()) {
            Object next2 = it4.next();
            C36391kE.A1V(next2, A0I2, A16.contains(next2) ? 1 : 0);
        }
        Iterator it5 = A0I2.iterator();
        while (it5.hasNext()) {
            r4.A00.A02(C36441kJ.A0r(it5));
        }
        AnonymousClass3K9 r12 = this.this$0;
        HashSet hashSet2 = this.$visibleMessages.A01;
        C29641Xk r6 = r12.A02;
        HashSet A162 = C36441kJ.A16();
        AnonymousClass1TR r42 = r6.A0A;
        r42.A06(new AnonymousClass411(A162, 14));
        ArrayList A0I3 = AnonymousClass001.A0I();
        Iterator it6 = A162.iterator();
        while (it6.hasNext()) {
            Object next3 = it6.next();
            if (true ^ hashSet2.contains(next3)) {
                A0I3.add(next3);
            }
        }
        Iterator it7 = A0I3.iterator();
        while (it7.hasNext()) {
            AnonymousClass3T1 A0l = C36391kE.A0l(it7);
            if (C64933Qa.A00(A0l) instanceof C28981Uw) {
                r02 = r42;
            } else {
                r02 = r6.A0B;
            }
            r02.A08(A0l);
        }
        ArrayList A0I4 = AnonymousClass001.A0I();
        Iterator it8 = hashSet2.iterator();
        while (it8.hasNext()) {
            Object next4 = it8.next();
            AnonymousClass3T1 r13 = (AnonymousClass3T1) next4;
            if (!A162.contains(r13) && (r0 = r13.A0a) != null && !r0.A09) {
                A0I4.add(next4);
            }
        }
        Iterator it9 = A0I4.iterator();
        while (it9.hasNext()) {
            r6.A01(C36391kE.A0l(it9), 1);
        }
        return AnonymousClass0AJ.A00;
    }
}
