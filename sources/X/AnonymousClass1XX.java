package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.ConditionVariable;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.Iterator;

/* renamed from: X.1XX  reason: invalid class name */
public class AnonymousClass1XX implements AnonymousClass1FP {
    public C48962iL A00;
    public final AnonymousClass1XY A01;
    public final AnonymousClass1X4 A02;
    public final C19600wD A03;
    public final C19970wo A04;
    public final C19420v0 A05;
    public final C20310xM A06;
    public final AnonymousClass12P A07;
    public final AnonymousClass1YR A08;
    public final C26171Jd A09;
    public final AnonymousClass1YT A0A;
    public final C19770wU A0B;
    public final AnonymousClass005 A0C;
    public final AnonymousClass1GJ A0D;

    public static void A00(AnonymousClass1XX r3, AnonymousClass3T1 r4, Runnable runnable) {
        boolean z = r4.A1J.A00 instanceof C28981Uw;
        AnonymousClass005 r0 = r3.A0C;
        if (z) {
            ((C20280xJ) r0.get()).A02(r4);
            return;
        }
        C20280xJ r32 = (C20280xJ) r0.get();
        C124675yc r2 = new C124675yc(r32.A07, r4);
        r2.A07 = true;
        r2.A06 = true;
        C20280xJ.A00(r32, new C128776Do(r2), (AnonymousClass777) null, runnable);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A01(X.AnonymousClass3T1 r12) {
        /*
            r11 = this;
            int r2 = r12.A0D
            r1 = 20
            r10 = 0
            if (r2 == r1) goto L_0x0014
            r0 = 7
            if (r2 != r0) goto L_0x0015
            X.3Qa r0 = r12.A1J
            X.11F r0 = r0.A00
            boolean r0 = X.AnonymousClass143.A0G(r0)
            if (r0 == 0) goto L_0x0015
        L_0x0014:
            return r10
        L_0x0015:
            int r5 = r12.A1I
            java.lang.String r4 = " "
            java.lang.String r7 = "app/unsent/skip "
            r6 = 1
            if (r5 == r6) goto L_0x00c2
            r0 = 2
            if (r5 == r0) goto L_0x00c2
            r0 = 3
            if (r5 == r0) goto L_0x00c2
            r0 = 5
            if (r5 == r0) goto L_0x009a
            r0 = 13
            if (r5 == r0) goto L_0x00c2
            r0 = 16
            if (r5 == r0) goto L_0x009a
            if (r5 == r1) goto L_0x00c2
            r0 = 82
            if (r5 == r0) goto L_0x00c2
            r0 = 90
            if (r5 == r0) goto L_0x0092
            r0 = 42
            if (r5 == r0) goto L_0x00c2
            r0 = 43
            if (r5 == r0) goto L_0x00c2
            switch(r5) {
                case 7: goto L_0x00b3;
                case 8: goto L_0x0092;
                case 9: goto L_0x00c2;
                case 10: goto L_0x0092;
                default: goto L_0x0044;
            }
        L_0x0044:
            boolean r0 = r12 instanceof X.AnonymousClass2bU
            if (r0 == 0) goto L_0x00e5
            X.1GJ r8 = r11.A0D
            r1 = r12
            X.2bU r1 = (X.AnonymousClass2bU) r1
            boolean r0 = r8.A0K(r1)
            if (r0 != 0) goto L_0x0070
            X.1Gl r0 = X.AnonymousClass6Y1.A02(r1)
            boolean r0 = X.AnonymousClass6Y1.A09(r0)
            if (r0 == 0) goto L_0x00e5
            long r2 = r1.A00
            int r0 = r1.A0B
            long r0 = (long) r0
            android.util.Pair r0 = r8.A0C(r2, r0)
            java.lang.Object r0 = r0.first
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00e5
        L_0x0070:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            X.3Qa r0 = r12.A1J
            java.lang.String r0 = r0.A01
            r1.append(r0)
            r1.append(r4)
            r1.append(r5)
            java.lang.String r0 = " need transcode"
        L_0x0087:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r10
        L_0x0092:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "app/unsent/skip/call "
            goto L_0x00ba
        L_0x009a:
            r3 = r12
            X.2bL r3 = (X.AnonymousClass2bL) r3
            double r0 = r3.A01
            r8 = 0
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x0044
            double r0 = r3.A00
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x0044
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "app/unsent/skip/location "
            goto L_0x00ba
        L_0x00b3:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "app/unsent/skip/system "
        L_0x00ba:
            r1.append(r0)
            X.3Qa r0 = r12.A1J
            java.lang.String r0 = r0.A01
            goto L_0x0087
        L_0x00c2:
            r0 = r12
            X.2bU r0 = (X.AnonymousClass2bU) r0
            X.3Qj r0 = r0.A01
            if (r0 == 0) goto L_0x0044
            boolean r0 = r0.A0Q
            if (r0 != 0) goto L_0x0044
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            X.3Qa r0 = r12.A1J
            java.lang.String r0 = r0.A01
            r1.append(r0)
            r1.append(r4)
            r1.append(r5)
            java.lang.String r0 = " autoretry disabled"
            goto L_0x0087
        L_0x00e5:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1XX.A01(X.3T1):boolean");
    }

    public void BYy() {
        AnonymousClass12P r0 = this.A07;
        r0.A06();
        if (r0.A08) {
            Iterator it = this.A08.A02().iterator();
            while (it.hasNext()) {
                AnonymousClass3T1 r9 = (AnonymousClass3T1) it.next();
                long A002 = C19970wo.A00(this.A04);
                long j = r9.A0I;
                if (j + 10800000 < A002 && j + 86400000 >= A002 && A01(r9)) {
                    C19420v0 r6 = this.A05;
                    if (((SharedPreferences) r6.A00.get()).getLong("last_unsent_notification_time", 0) + 86400000 < A002) {
                        Log.i("Posting notification about unsent messages");
                        C19420v0.A00(r6).putLong("last_unsent_notification_time", A002).apply();
                        AnonymousClass1YT r5 = this.A0A;
                        Context context = r5.A00.A00;
                        String string = context.getString(R.string.f12nameremoved);
                        String string2 = context.getString(R.string.f12nameremoved);
                        PendingIntent A003 = C65743Th.A00(context, 1, AnonymousClass190.A03(context), 0);
                        C07700Yy A022 = C20600xp.A02(context);
                        A022.A0M = "failure_notifications@1";
                        A022.A0G(string);
                        A022.A09(System.currentTimeMillis());
                        A022.A06(3);
                        A022.A0I(true);
                        A022.A0F(string);
                        A022.A0E(string2);
                        A022.A0D = A003;
                        A022.A0B.icon = R.drawable.notifybar;
                        r5.A01.A02(6, A022.A05());
                        r5.A02 = true;
                        return;
                    }
                    return;
                }
            }
        }
    }

    public AnonymousClass1XX(AnonymousClass1XY r2, AnonymousClass1X4 r3, C19600wD r4, C19970wo r5, C19420v0 r6, C20310xM r7, AnonymousClass12P r8, AnonymousClass1YR r9, C26171Jd r10, AnonymousClass1GJ r11, AnonymousClass1YT r12, C19770wU r13, AnonymousClass005 r14) {
        ConditionVariable conditionVariable = C18740tg.A00;
        this.A04 = r5;
        this.A01 = r2;
        this.A0B = r13;
        this.A02 = r3;
        this.A0D = r11;
        this.A06 = r7;
        this.A0C = r14;
        this.A08 = r9;
        this.A05 = r6;
        this.A09 = r10;
        this.A07 = r8;
        this.A03 = r4;
        this.A0A = r12;
    }
}
