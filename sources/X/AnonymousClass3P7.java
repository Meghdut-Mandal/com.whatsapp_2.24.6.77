package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.3P7  reason: invalid class name */
public final class AnonymousClass3P7 {
    public final AnonymousClass17Y A00;
    public final AnonymousClass196 A01;
    public final AnonymousClass16D A02;
    public final C62533Gn A03;
    public final AnonymousClass3QT A04;
    public final AnonymousClass2Fm A05;
    public final C88714Tt A06;
    public final AnonymousClass312 A07;
    public final C20430xY A08;
    public final C19770wU A09;

    public final void A01(AnonymousClass3IL r14, AnonymousClass11F r15, Long l, String str, String str2) {
        C19770wU r2;
        C80273v8 r1;
        String str3 = str;
        AnonymousClass00C.A0D(str3, 1);
        boolean A1V = AnonymousClass000.A1V(r14);
        if (r15 != null) {
            AnonymousClass141 r10 = new AnonymousClass141(r15);
            AnonymousClass16D r4 = this.A02;
            ArrayList A0Q = r4.A05.A0Q(r15);
            AnonymousClass3QT r12 = this.A04;
            r10.A0R = AnonymousClass3QT.A00(r12.A04);
            r10.A0Q = AnonymousClass3QT.A00(r12.A05);
            r10.A0P = r12.A02();
            r10.A0O = AnonymousClass3QT.A00(r12.A03);
            r10.A0s = true;
            if (l != null) {
                r10.A0L(l.longValue());
            }
            if (this.A07.A00.isChecked()) {
                r10.A07 = 0;
            } else {
                r10.A07 = 1;
            }
            if (A1V) {
                AnonymousClass141 r11 = null;
                if (str2 != null) {
                    AnonymousClass2Fm r22 = this.A05;
                    String str4 = r22.A01;
                    String A022 = r22.A02();
                    if (str4 != null ? !str4.equals(A022) : A022 != null) {
                        if (l != null) {
                            AnonymousClass141 A052 = r4.A05(l.longValue());
                            if (A052 != null) {
                                ArrayList A0I = AnonymousClass001.A0I();
                                Iterator it = A0Q.iterator();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    if (((AnonymousClass141) next).A0B()) {
                                        A0I.add(next);
                                    }
                                }
                                int size = A0I.size();
                                C19770wU r3 = this.A09;
                                int i = 4;
                                if (size > 1) {
                                    i = 3;
                                }
                                C80273v8.A00(r3, this, A052, i);
                            }
                        } else {
                            return;
                        }
                    }
                }
                r10.A0F = r14;
                if (!(l == null || (r11 = r4.A05(l.longValue())) == null)) {
                    r10.A0k = r11.A0k;
                }
                Iterator it2 = A0Q.iterator();
                while (it2.hasNext()) {
                    if (A00(C36391kE.A0f(it2), r10)) {
                        this.A06.Bfh(C36431kI.A0D());
                        return;
                    }
                }
                ArrayList A0I2 = AnonymousClass001.A0I();
                Iterator it3 = A0Q.iterator();
                while (it3.hasNext()) {
                    Object next2 = it3.next();
                    if (((AnonymousClass141) next2).A0I() != r10.A0I()) {
                        A0I2.add(next2);
                    }
                }
                ArrayList A0q = C36361kB.A0q(A0I2);
                A0q.add(r10);
                this.A09.Boy(new C1503474x((Object) A0q, (Object) this, (Object) r10, (Object) r11, 27));
                return;
            }
            r10.A0F = new AnonymousClass3IL(-5, str3);
            ArrayList A0I3 = AnonymousClass001.A0I();
            Iterator it4 = A0Q.iterator();
            while (it4.hasNext()) {
                if (A00(C36391kE.A0f(it4), r10)) {
                    this.A06.Bfh(C36431kI.A0D());
                    return;
                }
            }
            ArrayList A0I4 = AnonymousClass001.A0I();
            Iterator it5 = A0Q.iterator();
            while (it5.hasNext()) {
                Object next3 = it5.next();
                if (((AnonymousClass141) next3).A0B()) {
                    A0I4.add(next3);
                }
            }
            boolean z = false;
            if (!(A0I4 instanceof Collection) || !A0I4.isEmpty()) {
                Iterator it6 = A0I4.iterator();
                while (true) {
                    if (it6.hasNext()) {
                        if (C36391kE.A0f(it6).A0k) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (A0I4.isEmpty()) {
                r2 = this.A09;
                r1 = new C80273v8(this, r10, 2);
            } else {
                r10.A0k = z;
                A0I3.add(r10);
                A0I3.addAll(A0I4);
                r2 = this.A09;
                r1 = new C80273v8(this, A0I3, 5);
            }
            r2.Boy(r1);
        }
    }

    public AnonymousClass3P7(AnonymousClass17Y r2, AnonymousClass196 r3, AnonymousClass16D r4, C62533Gn r5, AnonymousClass3QT r6, AnonymousClass2Fm r7, C88714Tt r8, AnonymousClass312 r9, C20430xY r10, C19770wU r11) {
        C36321k7.A1B(r2, r11, r3, r4, r10);
        AnonymousClass00C.A0D(r6, 7);
        C36321k7.A14(r9, r5, r7);
        this.A00 = r2;
        this.A09 = r11;
        this.A01 = r3;
        this.A02 = r4;
        this.A08 = r10;
        this.A06 = r8;
        this.A04 = r6;
        this.A07 = r9;
        this.A03 = r5;
        this.A05 = r7;
    }

    public static final boolean A00(AnonymousClass141 r3, AnonymousClass141 r4) {
        String A0J = r3.A0J();
        String A0J2 = r4.A0J();
        if (A0J == null) {
            if (A0J2 != null) {
                return false;
            }
        } else if (!A0J.equals(A0J2)) {
            return false;
        }
        AnonymousClass3IL r0 = r3.A0F;
        AnonymousClass00C.A0B(r0);
        String str = r0.A01;
        AnonymousClass3IL r02 = r4.A0F;
        AnonymousClass00C.A0B(r02);
        if (str.equals(r02.A01)) {
            return true;
        }
        return false;
    }
}
