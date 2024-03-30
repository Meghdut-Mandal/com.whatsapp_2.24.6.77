package X;

import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6sh  reason: invalid class name and case insensitive filesystem */
public final class C144716sh implements C30631aW {
    public final long A00;
    public final long A01;
    public final C19970wo A02;
    public final C19420v0 A03;
    public final AnonymousClass1RU A04;
    public final AnonymousClass005 A05;
    public final AnonymousClass005 A06;

    public /* synthetic */ void BV3() {
    }

    public void BV2() {
        boolean z;
        AnonymousClass3S9 r12;
        String str;
        String A002;
        String A032;
        String A0v;
        C07250Wx r14;
        Context context;
        int i;
        if (this.A04.A0B()) {
            Log.i("AccountSwitchingDailyCron/onDailyCronNoMessageStore");
            for (AnonymousClass3KU r7 : AnonymousClass6C2.A00(this.A05)) {
                if (!r7.A03 || r7.A02) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("AccountSwitchingDailyCron/onDailyCronNoMessageStore/account : ");
                    A0u.append(AnonymousClass3LV.A01(r7.A08));
                    A0u.append(", isLoggedIn : ");
                    A0u.append(r7.A03);
                    A0u.append(", isCompanion : ");
                    C36331k8.A1S(A0u, r7.A02);
                } else {
                    long j = r7.A05;
                    long j2 = j + this.A00;
                    C19970wo r8 = this.A02;
                    if (j2 > C19970wo.A00(r8) || j2 <= C36341k9.A0B(C36341k9.A0E(this.A03), "last_daily_cron")) {
                        long j3 = j + this.A01;
                        if (j3 <= C19970wo.A00(r8) && j3 > C36341k9.A0B(C36341k9.A0E(this.A03), "last_daily_cron")) {
                            AnonymousClass6V1 r1 = (AnonymousClass6V1) this.A06.get();
                            z = false;
                            Log.i("InactiveAccountNotificationManager/showLogoutAccountNotification");
                            r12 = r1.A03;
                            str = r7.A08;
                            A002 = AnonymousClass6V1.A00(C108325Tb.LOGGED_OUT_ACCOUNT, str);
                            A032 = r1.A03(r7);
                            C19630wG r13 = r1.A07;
                            A0v = C36371kC.A0v(r13, R.string.f12nameremoved);
                            r14 = null;
                            context = r13.A00;
                            i = 5;
                        }
                    } else {
                        AnonymousClass6V1 r15 = (AnonymousClass6V1) this.A06.get();
                        z = false;
                        Log.i("InactiveAccountNotificationManager/showDeleteAccountNotification");
                        r12 = r15.A03;
                        str = r7.A08;
                        A002 = AnonymousClass6V1.A00(C108325Tb.DELETE_ACCOUNT, str);
                        A032 = r15.A03(r7);
                        C19630wG r16 = r15.A07;
                        A0v = C36371kC.A0v(r16, R.string.f12nameremoved);
                        r14 = null;
                        context = r16.A00;
                        i = 6;
                    }
                    r12.A03(AnonymousClass190.A1B(context, str, i, z), r14, A0v, A002, A032, R.drawable.notifybar, i, false, false);
                }
            }
        }
    }

    public C144716sh(AnonymousClass1RU r4, C19970wo r5, C19420v0 r6, AnonymousClass005 r7, AnonymousClass005 r8) {
        C36321k7.A1B(r5, r4, r6, r7, r8);
        this.A02 = r5;
        this.A04 = r4;
        this.A03 = r6;
        this.A05 = r7;
        this.A06 = r8;
        TimeUnit timeUnit = TimeUnit.DAYS;
        this.A01 = timeUnit.toMillis(25);
        this.A00 = timeUnit.toMillis(55);
    }
}
