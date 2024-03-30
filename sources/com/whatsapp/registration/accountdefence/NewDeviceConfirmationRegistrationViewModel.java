package com.whatsapp.registration.accountdefence;

import X.AnonymousClass000;
import X.AnonymousClass00N;
import X.AnonymousClass04R;
import X.AnonymousClass05R;
import X.AnonymousClass12U;
import X.AnonymousClass13I;
import X.AnonymousClass1X8;
import X.AnonymousClass3G5;
import X.AnonymousClass3TX;
import X.C18740tg;
import X.C19420v0;
import X.C19460v5;
import X.C19630wG;
import X.C19770wU;
import X.C19970wo;
import X.C25271Fq;
import X.C28201Rs;
import X.C29501Ww;
import X.C36341k9;
import X.C36351kA;
import X.C36371kC;
import X.C36441kJ;
import X.C62623Gw;
import X.C62653Gz;
import X.C90444aA;
import androidx.lifecycle.OnLifecycleEvent;
import com.whatsapp.util.Log;

public class NewDeviceConfirmationRegistrationViewModel extends AnonymousClass04R implements AnonymousClass00N {
    public String A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final C19460v5 A05;
    public final C19630wG A06;
    public final C25271Fq A07;
    public final C19420v0 A08;
    public final AnonymousClass13I A09;
    public final C62623Gw A0A;
    public final C29501Ww A0B;
    public final AnonymousClass12U A0C;
    public final AnonymousClass1X8 A0D;
    public final C62653Gz A0E;
    public final AnonymousClass3TX A0F;
    public final C28201Rs A0G = C36441kJ.A0t();
    public final C28201Rs A0H = C36441kJ.A0t();
    public final C19770wU A0I;
    public final C19970wo A0J;

    public long A0S() {
        AnonymousClass3G5 r1 = this.A0E.A05;
        Log.i("AccountDefenceLocalDataRepository/getRetryTimeForResendingNotice");
        long A082 = C36371kC.A08(r1.A00.A00("AccountDefenceLocalDataRepository_prefs"), "com.whatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.retry_time_reached_resending_notice");
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AccountDefenceLocalDataRepository/getRetryTimeForResendingNotice/result ");
        A0u.append(A082);
        A0u.append(" cur_time=");
        C36351kA.A1S(A0u, System.currentTimeMillis());
        long currentTimeMillis = System.currentTimeMillis();
        if (A082 > currentTimeMillis) {
            return A082 - currentTimeMillis;
        }
        return -1;
    }

    public void A0T() {
        C28201Rs r1;
        int i;
        Log.i("NewDeviceConfirmationRegistrationViewModel/resetRegistration");
        this.A0E.A00();
        if (this.A03) {
            Log.i("NewDeviceConfirmationRegistrationViewModel/resetRegistration/changenumber");
            C29501Ww r2 = this.A0B;
            C29501Ww.A02(r2, 3, true);
            r2.A0F();
            r1 = this.A0H;
            i = 5;
        } else {
            Log.i("NewDeviceConfirmationRegistrationViewModel/resetRegistration/resetting registration");
            this.A0B.A09();
            r1 = this.A0H;
            i = 6;
        }
        C36341k9.A17(r1, i);
    }

    @OnLifecycleEvent(AnonymousClass05R.ON_PAUSE)
    public void onActivityPaused() {
        Log.i("NewDeviceConfirmationRegistrationViewModel/onLifecyclePause");
        this.A02 = false;
        C62653Gz r1 = this.A0E;
        Log.i("AccountDefenceDataManager/stopFetchingDeviceConfirmation");
        r1.A04.A01();
    }

    @OnLifecycleEvent(AnonymousClass05R.ON_RESUME)
    public void onActivityResumed() {
        Log.i("NewDeviceConfirmationRegistrationViewModel/onLifecycleResume");
        this.A02 = true;
        C62653Gz r4 = this.A0E;
        String str = this.A00;
        C18740tg.A06(str);
        String str2 = this.A01;
        C18740tg.A06(str2);
        r4.A01(new C90444aA(this, 1), str, str2);
    }

    @OnLifecycleEvent(AnonymousClass05R.ON_START)
    public void onActivityStarted() {
        this.A0F.A04("device_confirm");
    }

    @OnLifecycleEvent(AnonymousClass05R.ON_STOP)
    public void onActivityStopped() {
        Log.i("NewDeviceConfirmationRegistrationViewModel/onLifecycleStop");
        this.A0A.A00();
    }

    public NewDeviceConfirmationRegistrationViewModel(C19460v5 r2, C19970wo r3, C19630wG r4, C25271Fq r5, C19420v0 r6, AnonymousClass13I r7, C62623Gw r8, C29501Ww r9, AnonymousClass12U r10, AnonymousClass1X8 r11, C62653Gz r12, AnonymousClass3TX r13, C19770wU r14) {
        this.A0J = r3;
        this.A06 = r4;
        this.A0I = r14;
        this.A0E = r12;
        this.A0F = r13;
        this.A09 = r7;
        this.A0A = r8;
        this.A0B = r9;
        this.A08 = r6;
        this.A0D = r11;
        this.A07 = r5;
        this.A05 = r2;
        this.A0C = r10;
    }
}
