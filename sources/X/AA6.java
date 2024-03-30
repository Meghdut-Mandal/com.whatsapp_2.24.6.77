package X;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class AA6 implements C30631aW {
    public final C24881Ed A00;
    public final AnonymousClass1EV A01;
    public final AnonymousClass1EU A02;
    public final C29161Vo A03;
    public final C202179lC A04;
    public final C1033354w A05;
    public final C20810yC A06;
    public final C29931Yo A07;
    public final C29201Vs A08;
    public final C29171Vp A09;
    public final C29211Vt A0A;
    public final C29191Vr A0B;
    public final C19770wU A0C;

    public void BV2() {
        C202009kr A002;
        AnonymousClass1EV r6 = this.A01;
        if (r6.A03()) {
            C24881Ed r7 = this.A00;
            Integer[] numArr = new Integer[4];
            boolean A1b = C36361kB.A1b(numArr, 20);
            numArr[1] = 401;
            AnonymousClass000.A1L(numArr, 417, 2);
            AnonymousClass000.A1L(numArr, 418, 3);
            Integer[] numArr2 = new Integer[1];
            AnonymousClass000.A1L(numArr2, 40, A1b ? 1 : 0);
            List A0U = r7.A0U(numArr, numArr2, -1);
            if (A0U.size() > 0) {
                C29161Vo r2 = this.A03;
                C202009kr A003 = r2.A00();
                this.A02.A05().Blk(A003, A0U);
                r2.A01(A003);
            }
        }
        C29171Vp r5 = this.A09;
        synchronized (r5) {
            C29161Vo r3 = r5.A01;
            long A004 = C19970wo.A00(r3.A01);
            long j = A004 - (A004 % 86400000);
            ArrayList A0I = AnonymousClass001.A0I();
            SharedPreferences sharedPreferences = r3.A00;
            if (sharedPreferences == null) {
                sharedPreferences = r3.A02.A00("payment_daily_usage_preferences");
                r3.A00 = sharedPreferences;
            }
            Map<String, ?> all = sharedPreferences.getAll();
            SharedPreferences sharedPreferences2 = r3.A00;
            if (sharedPreferences2 == null) {
                sharedPreferences2 = r3.A02.A00("payment_daily_usage_preferences");
                r3.A00 = sharedPreferences2;
            }
            SharedPreferences.Editor edit = sharedPreferences2.edit();
            Iterator A0y = AnonymousClass000.A0y(all);
            while (A0y.hasNext()) {
                Map.Entry A11 = AnonymousClass000.A11(A0y);
                String obj = A11.getValue().toString();
                if (!obj.isEmpty() && (A002 = C202009kr.A00(obj)) != null && A002.A0G < j) {
                    A0I.add(A002);
                    edit.remove(C90494aF.A0f(A11));
                }
            }
            edit.apply();
            A0I.size();
            Iterator it = A0I.iterator();
            while (it.hasNext()) {
                C202009kr r4 = (C202009kr) it.next();
                C21010yW r32 = r5.A00;
                C176608cO r22 = new C176608cO();
                r22.A05 = Long.valueOf(r4.A0H);
                r22.A06 = Long.valueOf(r4.A02);
                r22.A09 = Long.valueOf(r4.A05);
                r22.A07 = Long.valueOf(r4.A03);
                r22.A08 = Long.valueOf(r4.A04);
                r22.A0F = Long.valueOf(r4.A0B);
                r22.A0E = Long.valueOf(r4.A0A);
                r22.A0C = Long.valueOf(r4.A08);
                r22.A0B = Long.valueOf(r4.A07);
                r22.A0D = Long.valueOf(r4.A09);
                r22.A0A = Long.valueOf(r4.A06);
                r22.A04 = Long.valueOf(r4.A01);
                r22.A00 = C36441kJ.A0y(r4.A0D.size());
                r22.A01 = C36441kJ.A0y(r4.A0F.size());
                r22.A03 = Long.valueOf(r4.A00);
                r22.A02 = C36441kJ.A0y(r4.A0E.size());
                r22.A0G = r4.A0C;
                r32.Bly(r22);
            }
        }
        this.A0A.A04();
        SharedPreferences A005 = this.A08.A00.A00("hybrid_payment_methods_used");
        AnonymousClass00C.A08(A005);
        C90504aG.A12(A005);
        this.A0B.A04();
        if (r6.A03() && this.A06.A0E(991)) {
            C1033354w r52 = this.A05;
            int nextInt = new Random().nextInt(C1033354w.A0E);
            Locale locale = Locale.US;
            Object[] A0L = AnonymousClass001.A0L();
            AnonymousClass000.A1J(A0L, nextInt);
            String.format(locale, "BloksAssetManager/triggerBackgroundFetchWithJitter triggering bloks fetch in %d ms", A0L);
            r52.A03.BpM(new AnonymousClass751(r52), "BloksAssetmanager/trigger-bg-fetch", (long) nextInt);
        }
        C20810yC r1 = this.A06;
        if (r1.A0E(629) || r1.A0E(605)) {
            C29931Yo r42 = this.A07;
            C19420v0 r33 = r42.A05;
            if (C36371kC.A1U(C36341k9.A0E(r33), "payment_background_batch_require_fetch") && r33.A2V("payment_backgrounds_batch_last_fetch_timestamp", TimeUnit.DAYS.toMillis(7))) {
                r42.A04.A0H(new C35761jD(r42, r42.A08.A00(), 9));
            }
        }
    }

    public void BV3() {
        AVX.A00(this.A0C, this, 0);
    }

    public AA6(C1033354w r1, C24881Ed r2, C20810yC r3, AnonymousClass1EV r4, AnonymousClass1EU r5, C29931Yo r6, C29201Vs r7, C29161Vo r8, C29171Vp r9, C29211Vt r10, C29191Vr r11, C202179lC r12, C19770wU r13) {
        this.A00 = r2;
        this.A08 = r7;
        this.A0A = r10;
        this.A0B = r11;
        this.A07 = r6;
        this.A03 = r8;
        this.A09 = r9;
        this.A01 = r4;
        this.A02 = r5;
        this.A04 = r12;
        this.A05 = r1;
        this.A06 = r3;
        this.A0C = r13;
    }
}
