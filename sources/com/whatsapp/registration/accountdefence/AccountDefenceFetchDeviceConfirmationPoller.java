package com.whatsapp.registration.accountdefence;

import X.AnonymousClass000;
import X.AnonymousClass00N;
import X.AnonymousClass37K;
import X.AnonymousClass3KD;
import X.AnonymousClass3UV;
import X.C18740tg;
import X.C19420v0;
import X.C19630wG;
import X.C19770wU;
import X.C19930wk;
import X.C19970wo;
import X.C21060yb;
import X.C36321k7;
import X.C80313vC;
import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

public class AccountDefenceFetchDeviceConfirmationPoller implements AnonymousClass00N {
    public long A00;
    public C19930wk A01;
    public final C21060yb A02;
    public final C19630wG A03;
    public final C19420v0 A04;
    public final AnonymousClass3UV A05;
    public final C19770wU A06;
    public final AtomicBoolean A07 = new AtomicBoolean(true);
    public final C19970wo A08;

    public static synchronized void A00(AnonymousClass3KD r8, AnonymousClass37K r9, AccountDefenceFetchDeviceConfirmationPoller accountDefenceFetchDeviceConfirmationPoller) {
        int i;
        synchronized (accountDefenceFetchDeviceConfirmationPoller) {
            if (accountDefenceFetchDeviceConfirmationPoller.A07.get()) {
                Log.i("FetchDeviceConfirmationPoller/scheduleNextRequestOrStopPolling/poller needs to stop because of app lifecycle");
            } else if (r8 == null || (i = r8.A00) == 1 || i == 13 || i == 11) {
                Log.i("FetchDeviceConfirmationPoller/scheduleNextRequestOrStopPolling/poller needs to stop because of terminal result");
            } else if (System.currentTimeMillis() - accountDefenceFetchDeviceConfirmationPoller.A00 > 900000) {
                Log.i("FetchDeviceConfirmationPoller/scheduleNextRequestOrStopPolling/poller needs to stop because of timeout");
            } else {
                C18740tg.A06(r8);
                int i2 = 5000;
                if (i == 12) {
                    i2 = 8000;
                }
                double d = (double) i2;
                double d2 = 0.8d * d;
                long random = (long) ((Math.random() * ((d * 1.2d) - d2)) + d2);
                C36321k7.A1V("FetchDeviceConfirmationPoller/onRequestComplete/scheduleNextRequest nextDelay: ", AnonymousClass000.A0u(), random);
                accountDefenceFetchDeviceConfirmationPoller.A01.A02();
                accountDefenceFetchDeviceConfirmationPoller.A01.A03(C80313vC.A00(accountDefenceFetchDeviceConfirmationPoller, r9, 28), random);
            }
            accountDefenceFetchDeviceConfirmationPoller.A01();
        }
    }

    public synchronized void A01() {
        Log.i("FetchDeviceConfirmationPoller/onRequestComplete/stopPolling");
        this.A07.set(true);
        C19930wk r0 = this.A01;
        if (r0 != null) {
            r0.A02();
        }
    }

    public AccountDefenceFetchDeviceConfirmationPoller(C21060yb r3, C19970wo r4, C19630wG r5, C19420v0 r6, AnonymousClass3UV r7, C19770wU r8) {
        this.A08 = r4;
        this.A03 = r5;
        this.A06 = r8;
        this.A02 = r3;
        this.A04 = r6;
        this.A05 = r7;
    }
}
