package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.9d6  reason: invalid class name and case insensitive filesystem */
public final class C198219d6 {
    public String A00;
    public String A01;
    public final C19700wN A02;
    public final AnonymousClass1KK A03;
    public final AnonymousClass1KM A04;
    public final C20810yC A05;
    public final C19770wU A06;
    public final AnonymousClass9Y1 A07;
    public final C116615ks A08;
    public final AnonymousClass9UB A09;
    public final AnonymousClass9ER A0A;

    public C198219d6(C19700wN r2, AnonymousClass1KK r3, AnonymousClass1KM r4, AnonymousClass9Y1 r5, C116615ks r6, AnonymousClass9UB r7, AnonymousClass9ER r8, C20810yC r9, C19770wU r10) {
        C36321k7.A17(r5, r3, r10, 3);
        C36321k7.A13(r4, r2, r9);
        this.A08 = r6;
        this.A0A = r8;
        this.A07 = r5;
        this.A03 = r3;
        this.A06 = r10;
        this.A04 = r4;
        this.A02 = r2;
        this.A05 = r9;
        this.A09 = r7;
    }

    public static final C200939iV A00(C198219d6 r9, AnonymousClass6A4 r10, C207109uZ r11, String str, String str2, String str3) {
        UserJid userJid = r10.A00;
        int i = r9.A08.A00;
        int A002 = C36371kC.A00(r9.A0A.A00.A08.A0M(userJid) ? 1 : 0) * 9;
        return new C200939iV(new AnonymousClass9K5(r10.A01, str, str2), r9.A09.A00(r11, AnonymousClass96V.A00()), userJid, str3, r9.A07.A02, A002, i, i);
    }
}
