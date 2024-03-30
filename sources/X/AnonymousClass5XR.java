package X;

/* renamed from: X.5XR  reason: invalid class name */
public abstract class AnonymousClass5XR {
    public static final AnonymousClass6V8 A00(AnonymousClass6V8 r37, AnonymousClass5RW r38) {
        int i;
        int i2;
        float f;
        AnonymousClass6V8 r0 = AnonymousClass6V8.A03;
        AnonymousClass6V8 r7 = r37;
        AnonymousClass6FJ r10 = r7.A02;
        long j = AnonymousClass6J2.A00;
        C161277mU r12 = r10.A0C;
        if (r12.equals(C138206hT.A00)) {
            r12 = AnonymousClass6RG.A00(AnonymousClass6J2.A01);
        }
        long j2 = r10.A01;
        if (AnonymousClass6U3.A03(j2)) {
            j2 = AnonymousClass6J2.A02;
        }
        AnonymousClass72W r11 = r10.A08;
        if (r11 == null) {
            r11 = AnonymousClass72W.A03;
        }
        AnonymousClass68R r02 = r10.A06;
        if (r02 != null) {
            i = r02.A00;
        } else {
            i = 0;
        }
        AnonymousClass68R r03 = new AnonymousClass68R(i);
        AnonymousClass68S r04 = r10.A07;
        if (r04 != null) {
            i2 = r04.A00;
        } else {
            i2 = 1;
        }
        AnonymousClass68S r05 = new AnonymousClass68S(i2);
        C129796Im r14 = r10.A05;
        if (r14 == null) {
            r14 = C129796Im.A01;
        }
        String str = r10.A0E;
        if (str == null) {
            str = "";
        }
        long j3 = r10.A02;
        if (AnonymousClass6U3.A03(j3)) {
            j3 = AnonymousClass6J2.A03;
        }
        AnonymousClass68U r06 = r10.A0A;
        if (r06 != null) {
            f = r06.A00;
        } else {
            f = 0.0f;
        }
        AnonymousClass68U r07 = new AnonymousClass68U(f);
        AnonymousClass6TV r15 = r10.A0D;
        if (r15 == null) {
            r15 = AnonymousClass6TV.A02;
        }
        AnonymousClass75Q r6 = r10.A09;
        if (r6 == null) {
            r6 = C129656Hy.A00.BAX();
        }
        long j4 = r10.A00;
        if (j4 == C133336Xx.A05) {
            j4 = AnonymousClass6J2.A00;
        }
        C131366Ot r3 = r10.A0B;
        if (r3 == null) {
            r3 = C131366Ot.A01;
        }
        AnonymousClass6PD r08 = r10.A03;
        if (r08 == null) {
            r08 = AnonymousClass6PD.A03;
        }
        C109085Wf r102 = r10.A04;
        if (r102 == null) {
            r102 = C94604iU.A00;
        }
        C109085Wf r21 = r102;
        C129796Im r22 = r14;
        AnonymousClass68R r23 = r03;
        AnonymousClass68S r24 = r05;
        AnonymousClass72W r25 = r11;
        AnonymousClass6PD r20 = r08;
        AnonymousClass6FJ r19 = new AnonymousClass6FJ(r20, r21, r22, r23, r24, r25, r6, r07, r3, r12, r15, str, j2, j3, j4);
        C129026Eq r32 = r7.A00;
        long j5 = C129636Hw.A00;
        int i3 = r32.A02;
        if (i3 == Integer.MIN_VALUE) {
            i3 = 5;
        }
        int i4 = r32.A03;
        if (AnonymousClass000.A1S(i4, 3)) {
            int ordinal = r38.ordinal();
            if (ordinal == 0) {
                i4 = 4;
            } else if (ordinal == 1) {
                i4 = 5;
            } else {
                throw C36441kJ.A18();
            }
        } else if (i4 == Integer.MIN_VALUE) {
            int ordinal2 = r38.ordinal();
            if (ordinal2 == 0) {
                i4 = 1;
            } else if (ordinal2 == 1) {
                i4 = 2;
            } else {
                throw C36441kJ.A18();
            }
        }
        long j6 = r32.A04;
        if (AnonymousClass6U3.A03(j6)) {
            j6 = C129636Hw.A00;
        }
        AnonymousClass6P5 r8 = r32.A06;
        if (r8 == null) {
            r8 = AnonymousClass6P5.A02;
        }
        C131236Og r62 = r32.A05;
        int i5 = r32.A01;
        if (i5 == 0) {
            i5 = 66305;
        }
        int i6 = r32.A00;
        if (i6 == Integer.MIN_VALUE) {
            i6 = 1;
        }
        AnonymousClass6P7 r09 = r32.A07;
        if (r09 == null) {
            r09 = AnonymousClass6P7.A02;
        }
        return new AnonymousClass6V8(new C129026Eq(r62, r8, r09, i3, i4, i5, i6, j6), r7.A01, r19);
    }
}
