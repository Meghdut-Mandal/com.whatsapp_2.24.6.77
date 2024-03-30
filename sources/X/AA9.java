package X;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public final class AA9 implements C159417jK {
    public final C24811Dw A00;

    public AA9(C24811Dw r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public static final C176638cR A00(AnonymousClass3S8 r3) {
        C176638cR r2 = new C176638cR();
        r2.A0M = Long.valueOf(r3.A0M);
        r2.A0K = Long.valueOf(r3.A0J);
        r2.A0J = Long.valueOf(r3.A0L);
        r2.A0L = Long.valueOf(r3.A0K);
        r2.A0O = Long.valueOf(r3.A0O);
        r2.A0N = Long.valueOf(r3.A0N);
        r2.A0U = Long.valueOf(r3.A0U);
        r2.A0Q = Long.valueOf(r3.A0Q);
        r2.A0S = Long.valueOf(r3.A0S);
        r2.A0R = Long.valueOf(r3.A0R);
        r2.A0T = Long.valueOf(r3.A0T);
        r2.A0V = Long.valueOf(r3.A0V);
        r2.A05 = Long.valueOf(r3.A05);
        r2.A02 = Long.valueOf(r3.A02);
        r2.A08 = Long.valueOf(r3.A08);
        r2.A03 = Long.valueOf(r3.A03);
        r2.A04 = Long.valueOf(r3.A04);
        r2.A09 = Long.valueOf(r3.A09);
        r2.A01 = Long.valueOf(r3.A01);
        r2.A00 = Long.valueOf(r3.A00);
        r2.A06 = Long.valueOf(r3.A06);
        r2.A07 = Long.valueOf(r3.A07);
        r2.A0P = Long.valueOf(r3.A0P);
        r2.A0A = Long.valueOf(r3.A0A);
        r2.A0B = Long.valueOf(r3.A0B);
        r2.A0C = Long.valueOf(r3.A0C);
        r2.A0D = Long.valueOf(r3.A0D);
        r2.A0F = Long.valueOf(r3.A0F);
        r2.A0G = Long.valueOf(r3.A0G);
        r2.A0H = Long.valueOf(r3.A0H);
        r2.A0I = Long.valueOf(r3.A0I);
        r2.A0E = Long.valueOf(r3.A0E);
        return r2;
    }

    public static final C176628cQ A01(C131446Pb r3) {
        C176628cQ r2 = new C176628cQ();
        r2.A0G = Long.valueOf(r3.A0F);
        r2.A0F = Long.valueOf(r3.A0E);
        r2.A0J = Long.valueOf(r3.A0I);
        r2.A0H = Long.valueOf(r3.A0G);
        r2.A0I = Long.valueOf(r3.A0H);
        r2.A0N = Long.valueOf(r3.A0M);
        r2.A0M = Long.valueOf(r3.A0L);
        r2.A0Q = Long.valueOf(r3.A0P);
        r2.A0O = Long.valueOf(r3.A0N);
        r2.A0P = Long.valueOf(r3.A0O);
        r2.A02 = Long.valueOf(r3.A01);
        r2.A03 = Long.valueOf(r3.A02);
        r2.A04 = Long.valueOf(r3.A03);
        r2.A08 = Long.valueOf(r3.A07);
        r2.A07 = Long.valueOf(r3.A06);
        r2.A09 = Long.valueOf(r3.A08);
        r2.A01 = Long.valueOf(r3.A00);
        r2.A0K = Long.valueOf(r3.A0J);
        r2.A0L = Long.valueOf(r3.A0K);
        r2.A06 = Long.valueOf(r3.A05);
        r2.A05 = Long.valueOf(r3.A04);
        r2.A0A = Long.valueOf(r3.A09);
        r2.A0C = Long.valueOf(r3.A0B);
        r2.A0B = Long.valueOf(r3.A0A);
        r2.A0D = Long.valueOf(r3.A0C);
        r2.A0E = Long.valueOf(r3.A0D);
        r2.A00 = r3.A0Q;
        return r2;
    }

    public void BV1() {
        C176628cQ A01;
        Double valueOf;
        Double valueOf2;
        Long valueOf3;
        Long valueOf4;
        Long valueOf5;
        Long valueOf6;
        Long valueOf7;
        Long valueOf8;
        C200979iZ A002;
        C24811Dw r0 = this.A00;
        C24841Dz r5 = r0.A02;
        AnonymousClass00T r2 = r5.A01.A01;
        String A0t = C36371kC.A0t((SharedPreferences) r2.getValue(), "media_engagement_daily_received_key");
        AnonymousClass3S8 A003 = AnonymousClass96l.A00(A0t);
        if (!(A0t == null || A0t.length() == 0)) {
            SharedPreferences.Editor A0A = C36351kA.A0A(r2);
            A0A.remove("media_engagement_daily_received_key");
            A0A.apply();
        }
        C21010yW r1 = r5.A00;
        if (A003 == null) {
            A003 = new AnonymousClass3S8(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        }
        r1.Bly(A00(A003));
        String A0t2 = C36371kC.A0t((SharedPreferences) r2.getValue(), "media_engagement_daily_sent_key");
        C131446Pb A004 = C1899996m.A00(A0t2);
        if (!(A0t2 == null || A0t2.length() == 0)) {
            SharedPreferences.Editor A0A2 = C36351kA.A0A(r2);
            A0A2.remove("media_engagement_daily_sent_key");
            A0A2.apply();
        }
        if (A004 != null) {
            A01 = A01(A004);
        } else {
            A01 = A01(new C131446Pb((Boolean) null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
        }
        r1.Bly(A01);
        long A012 = C24811Dw.A01(r0);
        AnonymousClass1E0 r4 = r0.A01;
        ArrayList A0I = AnonymousClass001.A0I();
        SharedPreferences sharedPreferences = r4.A00;
        if (sharedPreferences == null) {
            sharedPreferences = r4.A01.A00("media_daily_usage_preferences_v1");
            r4.A00 = sharedPreferences;
        }
        Map<String, ?> all = sharedPreferences.getAll();
        SharedPreferences sharedPreferences2 = r4.A00;
        if (sharedPreferences2 == null) {
            sharedPreferences2 = r4.A01.A00("media_daily_usage_preferences_v1");
            r4.A00 = sharedPreferences2;
        }
        SharedPreferences.Editor edit = sharedPreferences2.edit();
        Iterator A0y = AnonymousClass000.A0y(all);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            String obj = A11.getValue().toString();
            if (!obj.isEmpty() && (A002 = C200979iZ.A00(obj)) != null && A002.A0C < A012) {
                A0I.add(A002);
                edit.remove(C90494aF.A0f(A11));
            }
        }
        edit.apply();
        Iterator it = A0I.iterator();
        while (it.hasNext()) {
            C200979iZ r52 = (C200979iZ) it.next();
            C21010yW r42 = r0.A00;
            C176578cL r3 = new C176578cL();
            long j = r52.A01;
            Long l = null;
            if (j == 0) {
                valueOf = null;
            } else {
                valueOf = Double.valueOf((double) j);
            }
            r3.A02 = valueOf;
            long j2 = r52.A00;
            if (j2 == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Double.valueOf((double) j2);
            }
            r3.A01 = valueOf2;
            long j3 = r52.A05;
            if (j3 == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Long.valueOf(j3);
            }
            r3.A09 = valueOf3;
            long j4 = r52.A04;
            if (j4 == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Long.valueOf(j4);
            }
            r3.A08 = valueOf4;
            long j5 = r52.A07;
            if (j5 == 0) {
                valueOf5 = null;
            } else {
                valueOf5 = Long.valueOf(j5);
            }
            r3.A0B = valueOf5;
            long j6 = r52.A02;
            if (j6 == 0) {
                valueOf6 = null;
            } else {
                valueOf6 = Long.valueOf(j6);
            }
            r3.A06 = valueOf6;
            long j7 = r52.A03;
            if (j7 == 0) {
                valueOf7 = null;
            } else {
                valueOf7 = Long.valueOf(j7);
            }
            r3.A07 = valueOf7;
            long j8 = r52.A06;
            if (j8 == 0) {
                valueOf8 = null;
            } else {
                valueOf8 = Long.valueOf(j8);
            }
            r3.A0A = valueOf8;
            long j9 = r52.A08;
            if (j9 != 0) {
                l = Long.valueOf(j9);
            }
            r3.A0C = l;
            r3.A0D = Long.valueOf(r52.A0C);
            r3.A04 = Integer.valueOf(r52.A0A);
            r3.A05 = Integer.valueOf(r52.A0B);
            r3.A03 = Integer.valueOf(r52.A09);
            r3.A00 = Boolean.valueOf(r52.A0D);
            r42.Bly(r3);
        }
    }
}
