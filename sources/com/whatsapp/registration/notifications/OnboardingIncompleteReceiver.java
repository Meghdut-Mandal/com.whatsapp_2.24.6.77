package com.whatsapp.registration.notifications;

import X.AnonymousClass00C;
import X.AnonymousClass011;
import X.AnonymousClass12U;
import X.AnonymousClass190;
import X.C18830tt;
import X.C19420v0;
import X.C19630wG;
import X.C19970wo;
import X.C21520zN;
import X.C25271Fq;
import X.C36321k7;
import X.C36331k8;
import X.C36361kB;
import X.C36441kJ;
import X.C56042vd;
import X.C65983Uf;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public final class OnboardingIncompleteReceiver extends BroadcastReceiver {
    public C19970wo A00;
    public C19630wG A01;
    public C25271Fq A02;
    public C19420v0 A03;
    public C21520zN A04;
    public AnonymousClass190 A05;
    public AnonymousClass12U A06;
    public final Object A07;
    public volatile boolean A08;

    public void onReceive(Context context, Intent intent) {
        String str;
        if (!this.A08) {
            synchronized (this.A07) {
                if (!this.A08) {
                    C18830tt.APs(C56042vd.A00(context), this);
                    this.A08 = true;
                }
            }
        }
        C36321k7.A0w(context, intent);
        Log.i("OnboardingIncompleteReceiver/onReceive()");
        AnonymousClass12U r0 = this.A06;
        if (r0 != null) {
            if (!r0.A03()) {
                AnonymousClass12U r02 = this.A06;
                if (r02 == null) {
                    throw C36331k8.A0d("registrationStateManager");
                } else if (r02.A00() != 10) {
                    C21520zN r1 = this.A04;
                    if (r1 != null) {
                        int A072 = r1.A07(7978);
                        int i = R.string.f12nameremoved;
                        int i2 = R.string.f12nameremoved;
                        if (A072 == 2) {
                            i = R.string.f12nameremoved;
                            i2 = R.string.f12nameremoved;
                        }
                        C19630wG r03 = this.A01;
                        if (r03 != null) {
                            String A0m = C36361kB.A0m(r03.A00, i);
                            C19630wG r04 = this.A01;
                            if (r04 != null) {
                                String A0m2 = C36361kB.A0m(r04.A00, R.string.f12nameremoved);
                                C19630wG r05 = this.A01;
                                if (r05 != null) {
                                    String A0A = C36321k7.A0A(r05.A00, A0m2, i2);
                                    AnonymousClass00C.A08(A0A);
                                    AnonymousClass011 A19 = C36441kJ.A19(A0m, A0A);
                                    String str2 = (String) A19.first;
                                    String str3 = (String) A19.second;
                                    if (this.A00 != null) {
                                        C25271Fq r06 = this.A02;
                                        if (r06 != null) {
                                            C65983Uf.A0L(context, r06, str2, str2, str3);
                                            C19420v0 r07 = this.A03;
                                            if (r07 != null) {
                                                C36331k8.A0w(C19420v0.A00(r07), "pref_onboarding_incomplete_notif_shown", true);
                                                str = "OnboardingIncompleteReceiver/onReceive/notification-sent";
                                                Log.i(str);
                                                return;
                                            }
                                            throw C36331k8.A0d("sharedPreferences");
                                        }
                                        throw C36331k8.A0d("waNotificationManager");
                                    }
                                    throw C36331k8.A0d("time");
                                }
                                throw C36331k8.A0d("waContext");
                            }
                            throw C36331k8.A0d("waContext");
                        }
                        throw C36331k8.A0d("waContext");
                    }
                    throw C36331k8.A0d("abPreChatdProps");
                }
            }
            str = "OnboardingIncompleteReceiver/onReceive/registration-already-complete";
            Log.i(str);
            return;
        }
        throw C36331k8.A0d("registrationStateManager");
    }

    public OnboardingIncompleteReceiver(int i) {
        this.A08 = false;
        this.A07 = C36441kJ.A11();
    }

    public OnboardingIncompleteReceiver() {
        this(0);
    }
}
