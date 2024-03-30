package X;

import android.content.SharedPreferences;
import com.whatsapp.registration.accountdefence.AccountDefenceFetchDeviceConfirmationPoller;
import com.whatsapp.util.Log;

/* renamed from: X.3Gz  reason: invalid class name and case insensitive filesystem */
public class C62653Gz {
    public final C21060yb A00;
    public final C19630wG A01;
    public final C19420v0 A02;
    public final AnonymousClass3UV A03;
    public final AccountDefenceFetchDeviceConfirmationPoller A04;
    public final AnonymousClass3G5 A05;
    public final C19770wU A06;
    public final C19970wo A07;

    public void A00() {
        Log.i("AccountDefenceDataManager/resetRegistration");
        Log.i("AccountDefenceDataManager/stopFetchingDeviceConfirmation");
        this.A04.A01();
        AnonymousClass3G5 r1 = this.A05;
        Log.i("AccountDefenceLocalDataRepository/clearAllData");
        SharedPreferences.Editor A0G = C36381kD.A0G(r1.A00, "AccountDefenceLocalDataRepository_prefs");
        A0G.clear();
        if (!A0G.commit()) {
            Log.e("AccountDefenceLocalDataRepository/clearAllData/error");
        }
    }

    public void A01(C88524Ta r5, String str, String str2) {
        Log.i("AccountDefenceDataManager/startFetchingDeviceConfirmation");
        AnonymousClass37K r3 = new AnonymousClass37K(r5, str, str2);
        AccountDefenceFetchDeviceConfirmationPoller accountDefenceFetchDeviceConfirmationPoller = this.A04;
        synchronized (accountDefenceFetchDeviceConfirmationPoller) {
            Log.i("FetchDeviceConfirmationPoller/onRequestComplete/startPolling");
            if (accountDefenceFetchDeviceConfirmationPoller.A01 == null) {
                accountDefenceFetchDeviceConfirmationPoller.A01 = C36411kG.A0r(accountDefenceFetchDeviceConfirmationPoller.A06);
            }
            accountDefenceFetchDeviceConfirmationPoller.A07.set(false);
            accountDefenceFetchDeviceConfirmationPoller.A00 = System.currentTimeMillis();
            accountDefenceFetchDeviceConfirmationPoller.A01.execute(C80313vC.A00(accountDefenceFetchDeviceConfirmationPoller, r3, 29));
        }
    }

    public C62653Gz(C21060yb r1, C19970wo r2, C19630wG r3, C19420v0 r4, AnonymousClass3UV r5, AccountDefenceFetchDeviceConfirmationPoller accountDefenceFetchDeviceConfirmationPoller, AnonymousClass3G5 r7, C19770wU r8) {
        this.A07 = r2;
        this.A01 = r3;
        this.A06 = r8;
        this.A00 = r1;
        this.A05 = r7;
        this.A02 = r4;
        this.A03 = r5;
        this.A04 = accountDefenceFetchDeviceConfirmationPoller;
    }
}
