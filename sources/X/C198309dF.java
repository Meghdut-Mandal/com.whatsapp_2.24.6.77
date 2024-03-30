package X;

import android.content.SharedPreferences;
import com.whatsapp.jid.UserJid;
import java.util.Objects;

/* renamed from: X.9dF  reason: invalid class name and case insensitive filesystem */
public class C198309dF {
    public final C195399Ud A00;
    public final C19970wo A01;
    public final C19630wG A02;
    public final C20310xM A03;
    public final C25821Hu A04;
    public final AnonymousClass1EP A05;
    public final C20810yC A06;
    public final AnonymousClass1CF A07;
    public final C30571aQ A08;
    public final AnonymousClass1DL A09;
    public final AnonymousClass3GO A0A;
    public final C203129nM A0B;
    public final AnonymousClass3PX A0C;
    public final C203099nI A0D;
    public final C24961El A0E;
    public final AnonymousClass005 A0F;
    public final AnonymousClass005 A0G;
    public final AnonymousClass1C4 A0H;
    public final C30961b3 A0I;
    public final AnonymousClass005 A0J;
    public final AnonymousClass005 A0K;

    public static void A00(C198309dF r13, AnonymousClass3T1 r14, C21337AHp aHp) {
        C198309dF r3 = r13;
        if (r13.A06.A0E(5869)) {
            UserJid A0L = r14.A0L();
            boolean equals = Objects.equals(aHp.A0q, "MARKETING");
            C62673Hb A0Q = r14.A0Q();
            if (A0L != null && A0Q != null && equals) {
                AnonymousClass3L0 A012 = ((AnonymousClass185) r13.A0K.get()).A01(C36401kF.A0b(A0L));
                if (A0Q.A00 && A012 != null && A012.A01 == 2) {
                    C30961b3.A00(A0L, r13.A0I, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 0);
                    AnonymousClass005 r32 = r3.A0J;
                    C30921az r6 = (C30921az) r32.get();
                    C30971b4 r0 = r6.A07;
                    C19970wo r4 = r6.A00;
                    long A002 = C19970wo.A00(r4);
                    SharedPreferences.Editor A0A2 = C36351kA.A0A(r0.A01);
                    A0A2.putBoolean(A0L.getRawString(), true);
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0A2.putLong(AnonymousClass000.A0q(C165607th.A0r(A0L, "pref_disclosure_eligibility_ts_", A0u), A0u), A002);
                    A0A2.apply();
                    if (!((SharedPreferences) r6.A08.A01.getValue()).getBoolean("pref_disclosure_tos_state", false)) {
                        AnonymousClass9IQ r5 = new AnonymousClass9IQ(r4, r6.A04);
                        AnonymousClass9IP r42 = new AnonymousClass9IP(A0L, r6);
                        AnonymousClass19A r9 = r5.A01;
                        String A092 = r9.A09();
                        C35911jS r1 = new C35911jS(C36371kC.A11(new C35891jQ((Long) 20231028L, Long.valueOf(C36371kC.A09(r5.A00)))), 18, A092);
                        C203399nx r11 = r1.A00;
                        AnonymousClass00C.A08(r11);
                        r9.A0E(new BAV(r5, r1, r42, 2), r11, A092, 433, 32000);
                    }
                    ((C30921az) r32.get()).A03(A0L);
                }
            }
        }
    }

    public C198309dF(C195399Ud r2, C19970wo r3, C19630wG r4, C20310xM r5, C25821Hu r6, AnonymousClass1EP r7, C20810yC r8, AnonymousClass1CF r9, C30571aQ r10, AnonymousClass1DL r11, AnonymousClass1C4 r12, AnonymousClass3GO r13, C30961b3 r14, C203129nM r15, AnonymousClass3PX r16, C203099nI r17, C24961El r18, AnonymousClass005 r19, AnonymousClass005 r20, AnonymousClass005 r21, AnonymousClass005 r22) {
        this.A02 = r4;
        this.A01 = r3;
        this.A06 = r8;
        this.A0H = r12;
        this.A09 = r11;
        this.A03 = r5;
        this.A0E = r18;
        this.A00 = r2;
        this.A08 = r10;
        this.A0C = r16;
        this.A0D = r17;
        this.A0G = r19;
        this.A0K = r20;
        this.A0B = r15;
        this.A0A = r13;
        this.A0F = r21;
        this.A05 = r7;
        this.A04 = r6;
        this.A0I = r14;
        this.A0J = r22;
        this.A07 = r9;
    }
}
