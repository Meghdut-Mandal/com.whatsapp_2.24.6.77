package X;

import android.os.ConditionVariable;

/* renamed from: X.1Jw  reason: invalid class name and case insensitive filesystem */
public class C26361Jw {
    public final C19730wQ A00;
    public final AnonymousClass16D A01;
    public final C19970wo A02;
    public final C20310xM A03;
    public final AnonymousClass17S A04;
    public final AnonymousClass17X A05;
    public final AnonymousClass12P A06;
    public final AnonymousClass12O A07;
    public final AnonymousClass1LN A08;
    public final C20170x8 A09;
    public final C20810yC A0A;
    public final AnonymousClass1LM A0B;
    public final C220412q A0C;
    public final C25221Fl A0D;
    public final C21010yW A0E;
    public final AnonymousClass17V A0F;

    public void A00(AnonymousClass3T1 r5, C46752bc r6, Integer num, Integer num2) {
        C45392Re r3 = new C45392Re();
        int i = 1;
        if (r6.A01 != 1) {
            i = 2;
        }
        r3.A01 = Integer.valueOf(i);
        r3.A02 = num;
        r3.A00 = num2;
        r3.A05 = Long.valueOf(r6.A0I);
        if (r5 != null) {
            r3.A04 = Long.valueOf((long) r5.A05);
            Integer A042 = this.A0D.A04(r5);
            if (A042 != null) {
                r3.A04 = Long.valueOf((long) A042.intValue());
            }
        }
        AnonymousClass11F r2 = r6.A1J.A00;
        if (r2 != null) {
            r3.A06 = this.A0F.A03(r2.getRawString());
            r3.A03 = Long.valueOf((long) this.A0C.A03(r2));
        }
        this.A0E.Bly(r3);
    }

    public C26361Jw(C19730wQ r2, AnonymousClass16D r3, C19970wo r4, C220412q r5, C20310xM r6, AnonymousClass17S r7, C25221Fl r8, AnonymousClass17X r9, AnonymousClass12P r10, AnonymousClass12O r11, AnonymousClass1LN r12, C20170x8 r13, C20810yC r14, C21010yW r15, AnonymousClass17V r16, AnonymousClass1LM r17) {
        ConditionVariable conditionVariable = C18740tg.A00;
        this.A02 = r4;
        this.A0A = r14;
        this.A00 = r2;
        this.A0C = r5;
        this.A0E = r15;
        this.A01 = r3;
        this.A07 = r11;
        this.A09 = r13;
        this.A0F = r16;
        this.A06 = r10;
        this.A04 = r7;
        this.A03 = r6;
        this.A0B = r17;
        this.A05 = r9;
        this.A08 = r12;
        this.A0D = r8;
    }
}
