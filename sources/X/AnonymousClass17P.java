package X;

import com.whatsapp.util.Log;

/* renamed from: X.17P  reason: invalid class name */
public final class AnonymousClass17P {
    public final C19460v5 A00;
    public final AnonymousClass12g A01;
    public final AnonymousClass176 A02;
    public final C18950u5 A03 = new C18950u5(100000, 100000, 1000000, false);
    public final AnonymousClass005 A04;
    public final AnonymousClass005 A05;
    public final AnonymousClass005 A06;
    public final AnonymousClass005 A07;
    public final AnonymousClass005 A08;
    public final AnonymousClass005 A09;
    public final AnonymousClass005 A0A;
    public final AnonymousClass00T A0B;
    public final C19700wN A0C;
    public final C19970wo A0D;

    public AnonymousClass17P(C19460v5 r5, C19700wN r6, C19970wo r7, AnonymousClass12g r8, AnonymousClass176 r9, AnonymousClass17B r10, AnonymousClass005 r11, AnonymousClass005 r12, AnonymousClass005 r13, AnonymousClass005 r14, AnonymousClass005 r15, AnonymousClass005 r16, AnonymousClass005 r17) {
        AnonymousClass00C.A0D(r10, 1);
        AnonymousClass00C.A0D(r7, 2);
        AnonymousClass00C.A0D(r6, 3);
        AnonymousClass00C.A0D(r5, 4);
        AnonymousClass00C.A0D(r8, 5);
        AnonymousClass00C.A0D(r9, 6);
        AnonymousClass00C.A0D(r11, 7);
        AnonymousClass00C.A0D(r12, 8);
        AnonymousClass00C.A0D(r13, 9);
        AnonymousClass00C.A0D(r14, 10);
        AnonymousClass00C.A0D(r15, 11);
        AnonymousClass005 r2 = r16;
        AnonymousClass00C.A0D(r2, 12);
        AnonymousClass005 r1 = r17;
        AnonymousClass00C.A0D(r1, 13);
        this.A0D = r7;
        this.A0C = r6;
        this.A00 = r5;
        this.A01 = r8;
        this.A02 = r9;
        this.A08 = r11;
        this.A07 = r12;
        this.A06 = r13;
        this.A0A = r14;
        this.A09 = r15;
        this.A05 = r2;
        this.A04 = r1;
        this.A0B = new AnonymousClass00U(new AnonymousClass17Q(r10));
    }

    public static final void A00(AnonymousClass3T1 r3, AnonymousClass17P r4, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(", message_type=");
        int i = r3.A1I;
        sb.append(i);
        String obj = sb.toString();
        C18740tg.A0D(false, obj);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FMessageDatabaseSubsystem/");
        sb2.append(str2);
        sb2.append("; ");
        sb2.append(obj);
        Log.w(sb2.toString());
        r4.A0C.A0E(str3, String.valueOf(i), false);
    }
}
