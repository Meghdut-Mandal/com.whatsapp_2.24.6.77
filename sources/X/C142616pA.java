package X;

import android.text.TextUtils;
import java.util.Random;

/* renamed from: X.6pA  reason: invalid class name and case insensitive filesystem */
public class C142616pA implements C159177iw {
    public int A00;
    public String A01;
    public Random A02;
    public final C142646pD A03;
    public final C21010yW A04;
    public final C121365t1 A05;
    public final AnonymousClass1QW A06;

    public void A02(int i, int i2) {
        AnonymousClass593 A002 = AnonymousClass593.A00(i);
        A002.A0E = Integer.valueOf(i2);
        A002.A06 = 1;
        A01(this, A002);
    }

    public void BOy(Integer num, Integer num2, Integer num3, String str, String str2, String str3, int i) {
        Long A0m;
        AnonymousClass58V r1 = new AnonymousClass58V();
        r1.A09 = this.A01;
        r1.A00 = 0;
        r1.A06 = str;
        if (num == null) {
            A0m = null;
        } else {
            A0m = C90514aH.A0m(num);
        }
        r1.A05 = A0m;
        if (num2 != null) {
            r1.A03 = C90514aH.A0m(num2);
        }
        if (num3 != null) {
            r1.A04 = C90514aH.A0m(num3);
        }
        r1.A08 = str2;
        r1.A07 = str3;
        this.A04.Bly(r1);
    }

    public static void A00(C142616pA r3) {
        Random random = r3.A02;
        if (random == null) {
            random = new Random();
            r3.A02 = random;
        }
        String hexString = Long.toHexString(random.nextLong());
        r3.A01 = hexString;
        C142646pD r1 = r3.A03;
        AnonymousClass00C.A0D(hexString, 0);
        r1.A01 = hexString;
    }

    public static void A01(C142616pA r1, AnonymousClass593 r2) {
        r2.A0S = r1.A01;
        r2.A0A = Integer.valueOf(r1.A00);
        r2.A0H = C36411kG.A0t();
        r1.A04.Bly(r2);
    }

    public void BOY(Integer num, Integer num2) {
        Long l;
        AnonymousClass58V r2 = new AnonymousClass58V();
        r2.A00 = C36361kB.A0i();
        r2.A09 = this.A01;
        Long l2 = null;
        if (num != null) {
            l = C90514aH.A0m(num);
        } else {
            l = null;
        }
        r2.A01 = l;
        if (num2 != null) {
            l2 = C90514aH.A0m(num2);
        }
        r2.A02 = l2;
        this.A04.Bly(r2);
    }

    public C142616pA(C121365t1 r1, C142646pD r2, C21010yW r3, AnonymousClass1QW r4) {
        this.A04 = r3;
        this.A06 = r4;
        this.A05 = r1;
        this.A03 = r2;
    }

    public void A03(Double d, Integer num, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2) {
        if (!TextUtils.isEmpty(str4) && num != null && str3 != null) {
            AnonymousClass58Z r2 = new AnonymousClass58Z();
            r2.A08 = str4;
            r2.A04 = C36441kJ.A0y(i);
            r2.A01 = num;
            r2.A02 = Integer.valueOf(i2);
            r2.A07 = str;
            r2.A09 = str2;
            r2.A0A = str3;
            r2.A06 = str5;
            r2.A05 = str6;
            r2.A00 = d;
            C177848eT r4 = this.A05.A01;
            Long A0y = C36441kJ.A0y(C36371kC.A01(r4.A00(), "pref_saved_search_session_action_order"));
            r2.A03 = A0y;
            C36341k9.A0v(C90474aD.A0H(r4), "pref_saved_search_session_action_order", A0y.intValue() + 1);
            this.A04.Bly(r2);
        }
    }

    public void A04(Integer num, int i, int i2) {
        AnonymousClass593 A002 = AnonymousClass593.A00(i);
        A002.A0B = Integer.valueOf(i2);
        A002.A09 = num;
        A01(this, A002);
    }

    public void A05(Integer num, int i, int i2) {
        AnonymousClass593 A002 = AnonymousClass593.A00(i);
        A002.A0D = Integer.valueOf(i2);
        A002.A09 = num;
        A01(this, A002);
    }
}
