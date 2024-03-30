package X;

import android.content.SharedPreferences;

/* renamed from: X.1az  reason: invalid class name and case insensitive filesystem */
public final class C30921az {
    public final C19970wo A00;
    public final C19420v0 A01;
    public final C20310xM A02;
    public final C20810yC A03;
    public final AnonymousClass19A A04;
    public final C30951b2 A05;
    public final C30961b3 A06;
    public final C30971b4 A07;
    public final C30991b6 A08;
    public final C238019x A09;
    public final C19770wU A0A;

    public C30921az(C19970wo r2, C19420v0 r3, C20310xM r4, C20810yC r5, AnonymousClass19A r6, C30951b2 r7, C30961b3 r8, C30971b4 r9, C30991b6 r10, C238019x r11, C19770wU r12) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r5, 2);
        AnonymousClass00C.A0D(r12, 3);
        AnonymousClass00C.A0D(r6, 4);
        AnonymousClass00C.A0D(r3, 5);
        AnonymousClass00C.A0D(r11, 6);
        AnonymousClass00C.A0D(r4, 7);
        AnonymousClass00C.A0D(r7, 8);
        AnonymousClass00C.A0D(r8, 9);
        AnonymousClass00C.A0D(r9, 10);
        AnonymousClass00C.A0D(r10, 11);
        this.A00 = r2;
        this.A03 = r5;
        this.A0A = r12;
        this.A04 = r6;
        this.A01 = r3;
        this.A09 = r11;
        this.A02 = r4;
        this.A05 = r7;
        this.A06 = r8;
        this.A07 = r9;
        this.A08 = r10;
    }

    public final void A02(AnonymousClass11F r11) {
        AnonymousClass00C.A0D(r11, 0);
        C30991b6 r4 = this.A08;
        C19970wo r3 = this.A00;
        r4.A00(C19970wo.A00(r3), true);
        A03(r11);
        AnonymousClass9IQ r0 = new AnonymousClass9IQ(r3, this.A04);
        AnonymousClass9R2 r2 = new AnonymousClass9R2(r11, this);
        AnonymousClass19A r32 = r0.A01;
        String A092 = r32.A09();
        C203399nx r5 = new C35911jS(A092, (Long) 20231028L).A00;
        AnonymousClass00C.A08(r5);
        r32.A0E(new BAY(r2, 2), r5, A092, 434, 20000);
    }

    public static final void A00(C30921az r2, AnonymousClass00S r3) {
        if (C20800yB.A01(C21000yV.A02, r2.A03, 6730)) {
            r3.invoke();
        }
    }

    public static final boolean A01(AnonymousClass11F r7, C30921az r8) {
        if (((SharedPreferences) r8.A08.A01.getValue()).getBoolean("pref_disclosure_tos_state", false)) {
            C30971b4 r1 = r8.A07;
            if (r1.A00(r7)) {
                StringBuilder sb = new StringBuilder();
                sb.append("pref_disclosure_eligibility_ts_");
                sb.append(r7.getRawString());
                long j = ((SharedPreferences) r1.A01.getValue()).getLong(sb.toString(), 0);
                C20810yC r2 = r8.A03;
                if (C19970wo.A00(r8.A00) - j > ((long) C20800yB.A00(C21000yV.A02, r2, 5990)) * 1000) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final boolean A04(AnonymousClass11F r4) {
        if (!C20800yB.A01(C21000yV.A02, this.A03, 5869) || !this.A07.A00(r4) || !((SharedPreferences) this.A08.A01.getValue()).getBoolean("pref_disclosure_tos_state", false)) {
            return false;
        }
        return true;
    }

    public final void A03(AnonymousClass11F r7) {
        if (A01(r7, this)) {
            AnonymousClass00T r4 = this.A07.A01;
            StringBuilder sb = new StringBuilder();
            sb.append("pref_disclosure_system_message_shown_");
            sb.append(r7.getRawString());
            if (!((SharedPreferences) r4.getValue()).getBoolean(sb.toString(), false)) {
                SharedPreferences.Editor edit = ((SharedPreferences) r4.getValue()).edit();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("pref_disclosure_system_message_shown_");
                sb2.append(r7.getRawString());
                edit.putBoolean(sb2.toString(), true).apply();
                this.A0A.Boy(new C35761jD(this, r7, 19));
            }
        }
    }
}
