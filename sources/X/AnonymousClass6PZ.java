package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.6PZ  reason: invalid class name */
public final class AnonymousClass6PZ {
    public long A00 = 1;
    public AnonymousClass6EA A01;
    public Boolean A02;
    public Boolean A03;
    public String A04;
    public String A05;
    public final C19420v0 A06;
    public final C28941Us A07;
    public final C20810yC A08;
    public final C21010yW A09;
    public final AnonymousClass1KU A0A;
    public final C19770wU A0B;

    public AnonymousClass6PZ(C19420v0 r3, C28941Us r4, C20810yC r5, C21010yW r6, AnonymousClass1KU r7, C19770wU r8) {
        AnonymousClass00C.A0D(r8, 1);
        C36321k7.A1A(r6, r4, r5, r3, 2);
        this.A0B = r8;
        this.A09 = r6;
        this.A0A = r7;
        this.A07 = r4;
        this.A08 = r5;
        this.A06 = r3;
    }

    public final void A01(Boolean bool, Long l, String str, String str2, String str3, String str4) {
        if (this.A01 == null) {
            Log.e("Cannot log flows screen progress without a valid session id.");
            return;
        }
        if (str != null) {
            this.A04 = str;
        }
        this.A02 = bool;
        if (l != null) {
            this.A00 = l.longValue();
        }
        this.A0B.Boy(new AnonymousClass73K(this, str2, str3, str4, 1));
        A02(this.A04, this.A02);
    }

    public static final void A00(AnonymousClass6PZ r5, C1042158s r6) {
        String str;
        Integer num;
        Integer num2;
        Integer num3;
        AnonymousClass6EA r2 = r5.A01;
        if (r2 != null) {
            r6.A03 = Integer.valueOf(r2.A02);
            r6.A0A = r5.A0A.A00(r2.A04);
            r6.A0I = r2.A07;
            r6.A0J = r2.A0B;
            r6.A0K = r2.A0C;
            r6.A0G = r2.A09;
            r6.A02 = Boolean.valueOf(r2.A0D);
            r6.A0M = r2.A0A;
            r6.A00 = Boolean.valueOf(r2.A01);
            r6.A08 = Long.valueOf(r2.A00);
            r6.A0H = r2.A08;
            C20810yC r4 = r5.A08;
            if (r4.A0E(6381)) {
                C222813r r0 = UserJid.Companion;
                UserJid A002 = C222813r.A00(r2.A04);
                if (A002 != null) {
                    num3 = r5.A07.A00(A002);
                } else {
                    num3 = null;
                }
                r6.A0F = r2.A06;
                r6.A0E = r2.A05;
                r6.A04 = num3;
            }
            AnonymousClass6BP r3 = r2.A03;
            if (r4.A0E(6551)) {
                Long l = null;
                if (r3 != null) {
                    str = r3.A02;
                } else {
                    str = null;
                }
                r6.A09 = str;
                if (r3 != null) {
                    num = Integer.valueOf(r3.A00);
                } else {
                    num = null;
                }
                r6.A05 = num;
                if (!(r3 == null || (num2 = r3.A01) == null)) {
                    l = C90484aE.A0h(num2);
                }
                r6.A06 = l;
            }
            r2.A00++;
        }
    }

    public final void A02(String str, Boolean bool) {
        if (this.A08.A0E(7840)) {
            C1502274l.A00(this.A0B, this, bool, str, 48);
        }
    }

    public final void A03(String str, boolean z) {
        if (this.A01 == null) {
            Log.e("Cannot log flow finished without a valid session id.");
        } else {
            this.A0B.Boy(new C80383vJ(this, str, 5, z));
        }
    }
}
