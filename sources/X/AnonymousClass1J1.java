package X;

import android.util.Base64;
import com.whatsapp.Me;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1J1  reason: invalid class name */
public final class AnonymousClass1J1 {
    public final C19730wQ A00;
    public final C220412q A01;
    public final C20810yC A02;
    public final C21010yW A03;
    public final AnonymousClass1J3 A04;
    public final C19770wU A05;
    public final AnonymousClass005 A06;
    public final C19970wo A07;
    public final C25271Fq A08;
    public final C19420v0 A09;
    public final AnonymousClass1J2 A0A;

    public AnonymousClass1J1(C19730wQ r2, C19970wo r3, C25271Fq r4, C19420v0 r5, C220412q r6, C20810yC r7, C21010yW r8, AnonymousClass1J3 r9, AnonymousClass1J2 r10, C19770wU r11, AnonymousClass005 r12) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r7, 2);
        AnonymousClass00C.A0D(r2, 3);
        AnonymousClass00C.A0D(r6, 4);
        AnonymousClass00C.A0D(r8, 5);
        AnonymousClass00C.A0D(r11, 6);
        AnonymousClass00C.A0D(r10, 7);
        AnonymousClass00C.A0D(r12, 8);
        AnonymousClass00C.A0D(r5, 9);
        AnonymousClass00C.A0D(r4, 10);
        AnonymousClass00C.A0D(r9, 11);
        this.A07 = r3;
        this.A02 = r7;
        this.A00 = r2;
        this.A01 = r6;
        this.A03 = r8;
        this.A05 = r11;
        this.A0A = r10;
        this.A06 = r12;
        this.A09 = r5;
        this.A08 = r4;
        this.A04 = r9;
    }

    public static final void A01(AnonymousClass1J1 r11, AnonymousClass3T1 r12, Integer num, Integer num2, Long l, String str, int i) {
        AnonymousClass1J1 r3 = r11;
        if (C20800yB.A01(C21000yV.A02, r11.A02, 3127)) {
            A02(r3, r12, num, num2, l, str, (String) null, i, 4);
        }
    }

    public final void A03(AnonymousClass3T1 r9) {
        AnonymousClass3T1 r2 = r9;
        if (r9.A0D == 13 && !r9.A1J.A02 && C65773Tk.A03(r9)) {
            A01(this, r2, (Integer) null, (Integer) null, (Long) null, (String) null, 5);
        }
    }

    public final void A04(String str) {
        AnonymousClass00C.A0D(str, 0);
        if (C20800yB.A01(C21000yV.A02, this.A02, 3127)) {
            AnonymousClass2T4 r1 = new AnonymousClass2T4();
            r1.A08 = 2;
            r1.A07 = 7;
            r1.A0F = str;
            A00(r1, this);
            this.A03.Bly(r1);
        }
    }

    public final void A05(Collection collection) {
        AnonymousClass00C.A0D(collection, 0);
        this.A05.Boy(new C35761jD(collection, this, 2));
    }

    public static final void A00(AnonymousClass2T4 r3, AnonymousClass1J1 r4) {
        String str;
        if (C20800yB.A01(C21000yV.A02, r4.A02, 3127)) {
            r3.A00 = Boolean.valueOf(!r4.A09.A2G());
            r3.A02 = Boolean.valueOf(r4.A08.A00.A01());
            C19730wQ r0 = r4.A00;
            r0.A0G();
            Me me = r0.A00;
            if (me == null || (str = AnonymousClass1M4.A01(me.cc, me.number)) == null) {
                str = "ZZ";
            }
            r3.A0J = str;
        }
    }

    public static final void A02(AnonymousClass1J1 r8, AnonymousClass3T1 r9, Integer num, Integer num2, Long l, String str, String str2, int i, int i2) {
        String str3;
        Integer A042;
        String str4;
        Integer num3;
        Boolean bool;
        String A062;
        AnonymousClass2T4 r4 = new AnonymousClass2T4();
        C20810yC r3 = r8.A02;
        C21000yV r2 = C21000yV.A02;
        if (!C20800yB.A01(r2, r3, 3127) || !(r9 instanceof AnonymousClass2cW)) {
            str3 = null;
        } else {
            str3 = ((AnonymousClass2cW) r9).A00.A05;
        }
        r4.A0K = str3;
        r4.A08 = Integer.valueOf(i);
        r4.A07 = Integer.valueOf(i2);
        r4.A06 = num;
        r4.A05 = num2;
        UserJid A0L = r9.A0L();
        Long l2 = null;
        if (!(A0L == null || (A062 = AnonymousClass3U8.A06(A0L)) == null)) {
            l2 = Long.valueOf(Long.parseLong(A062));
        }
        r4.A0A = l2;
        C65773Tk r1 = C65773Tk.A00;
        AnonymousClass3P8 A002 = C65773Tk.A00(r3, r9);
        if (A002 == null) {
            A042 = null;
        } else {
            A042 = r1.A04(r3, A002);
        }
        r4.A09 = A042;
        r4.A0B = Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - r9.A0I));
        StringBuilder sb = new StringBuilder();
        C64933Qa r6 = r9.A1J;
        sb.append(r6.A01);
        sb.append(r9.A0I);
        String obj = sb.toString();
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            byte[] bytes = obj.getBytes(AnonymousClass0S4.A05);
            AnonymousClass00C.A08(bytes);
            instance.update(bytes);
            str4 = Base64.encodeToString(instance.digest(), 11);
        } catch (NoSuchAlgorithmException e) {
            Log.e("OTP: Error computing sessionId for logging", e);
            str4 = null;
        }
        r4.A0I = str4;
        r4.A0E = str;
        r4.A0C = l;
        if (!C20800yB.A01(r2, r8.A04.A00, 7493)) {
            str2 = null;
        }
        r4.A0G = str2;
        A00(r4, r8);
        if (C20800yB.A01(r2, r3, 3127)) {
            AnonymousClass11F r62 = r6.A00;
            if (r62 != null) {
                int i3 = 1;
                if (r8.A01.A0N(r62)) {
                    i3 = 2;
                }
                num3 = Integer.valueOf(i3);
            } else {
                num3 = null;
            }
            r4.A04 = num3;
            if (r62 != null) {
                bool = Boolean.valueOf(!AnonymousClass1CR.A02(((C20670xw) r8.A06.get()).A04, r62.getRawString()).A0A());
            } else {
                bool = null;
            }
            r4.A01 = bool;
        }
        if (i == 4 && C20800yB.A01(r2, r3, 3127) && C20800yB.A01(r2, r3, 6673)) {
            if (r9 instanceof AnonymousClass2cW) {
                r4.A03 = Boolean.valueOf(((AnonymousClass2cW) r9).A00.A07);
            }
            r4.A0D = Long.valueOf((long) r8.A00.A04());
        }
        r8.A03.Bly(r4);
    }
}
