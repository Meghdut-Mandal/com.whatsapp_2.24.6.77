package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.7yJ  reason: invalid class name and case insensitive filesystem */
public final class C167577yJ extends AnonymousClass04R {
    public final C001600r A00;
    public final C001600r A01;
    public final C001600r A02;
    public final C001600r A03;
    public final C001700s A04;
    public final C19460v5 A05;
    public final C19730wQ A06;
    public final AnonymousClass9UA A07;
    public final AnonymousClass9OT A08;
    public final C19970wo A09;
    public final C19630wG A0A;
    public final C18820ts A0B;
    public final UserJid A0C;
    public final AnonymousClass1A1 A0D;
    public final C19770wU A0E;
    public final String A0F;
    public final String A0G;
    public final C001700s A0H;
    public final C001700s A0I;

    public C167577yJ(C19460v5 r3, C19730wQ r4, AnonymousClass9UA r5, AnonymousClass9OT r6, C19970wo r7, C19630wG r8, C18820ts r9, UserJid userJid, C64933Qa r11, AnonymousClass1A1 r12, C19770wU r13, String str, String str2) {
        C36321k7.A1B(r11, str, str2, userJid, r7);
        C36321k7.A10(r4, r8);
        C36391kE.A1U(r9, r12);
        AnonymousClass00C.A0D(r13, 12);
        AnonymousClass00C.A0D(r3, 13);
        this.A0G = str;
        this.A0F = str2;
        this.A0C = userJid;
        this.A09 = r7;
        this.A06 = r4;
        this.A0A = r8;
        this.A08 = r6;
        this.A0B = r9;
        this.A0D = r12;
        this.A07 = r5;
        this.A0E = r13;
        this.A05 = r3;
        C001700s A0S = C36431kI.A0S();
        this.A0I = A0S;
        this.A02 = A0S;
        C001700s A0S2 = C36431kI.A0S();
        this.A04 = A0S2;
        this.A03 = A0S2;
        C001700s A0S3 = C36431kI.A0S();
        this.A0H = A0S3;
        this.A01 = A0S3;
        r6.A00 = A0S;
        r6.A01 = A0S3;
        this.A00 = AnonymousClass0VV.A00(C207659vZ.A00, A0S);
        AnonymousClass3T1 A032 = this.A0D.A03(r11);
        if (A032 != null && A032.A0L() != null && !A032.A1J.A02) {
            C19460v5 r1 = this.A05;
            if (r1.A05()) {
                r1.A02();
                throw AnonymousClass001.A0A("logCartViewed");
            }
        }
    }
}
