package com.whatsapp.payments.ui.viewmodel;

import X.AnonymousClass04R;
import X.AnonymousClass1EU;
import X.AnonymousClass1YQ;
import X.AnonymousClass6O3;
import X.AnonymousClass75B;
import X.C001700s;
import X.C121835tn;
import X.C175728ax;
import X.C196199Yc;
import X.C19770wU;
import X.C198019cl;
import X.C198299dE;
import X.C19970wo;
import X.C20810yC;
import X.C36431kI;
import com.whatsapp.jid.UserJid;
import java.util.concurrent.TimeUnit;

public class PaymentIncentiveViewModel extends AnonymousClass04R {
    public final C001700s A00 = C36431kI.A0S();
    public final C001700s A01 = C36431kI.A0S();
    public final C001700s A02 = C36431kI.A0S();
    public final C19970wo A03;
    public final C196199Yc A04;
    public final AnonymousClass1EU A05;
    public final AnonymousClass1YQ A06;
    public final C19770wU A07;

    public static boolean A02(C196199Yc r7, AnonymousClass6O3 r8, PaymentIncentiveViewModel paymentIncentiveViewModel) {
        if (r7 == null) {
            return false;
        }
        int A002 = r8.A00(TimeUnit.MILLISECONDS.toSeconds(C19970wo.A00(paymentIncentiveViewModel.A03)));
        C20810yC r2 = r7.A07;
        if (!r2.A0E(842) || A002 != 1) {
            return false;
        }
        C198299dE r1 = r8.A01;
        C198019cl r5 = r8.A02;
        return r1 != null && r5 != null && r2.A0E(842) && r1.A05 > ((long) (r5.A01 + r5.A00)) && r5.A04;
    }

    public static int A01(UserJid userJid, PaymentIncentiveViewModel paymentIncentiveViewModel) {
        if (userJid == null) {
            return 6;
        }
        AnonymousClass1EU r4 = paymentIncentiveViewModel.A05;
        AnonymousClass1EU.A00(r4);
        C175728ax A052 = r4.A06.A05(userJid);
        long seconds = TimeUnit.MILLISECONDS.toSeconds(C19970wo.A00(paymentIncentiveViewModel.A03));
        AnonymousClass6O3 A012 = paymentIncentiveViewModel.A06.A01();
        C196199Yc BFZ = r4.A05().BFZ();
        if (BFZ == null) {
            return 6;
        }
        int A002 = A012.A00(seconds);
        C198299dE r7 = A012.A01;
        C198019cl r10 = A012.A02;
        int i = 6;
        if (r7 != null) {
            char c = 3;
            if (BFZ.A07.A0E(842) && r10 != null) {
                if (r7.A05 <= ((long) (r10.A01 + r10.A00))) {
                    c = 2;
                } else if (r10.A04) {
                    c = 1;
                }
            }
            int A022 = BFZ.A02(A052, userJid, r7);
            if (!(c == 3 || A022 == 3)) {
                if (c == 2) {
                    i = 4;
                } else if (A022 != 0) {
                    i = 5;
                    if (A022 != 2) {
                        i = 0;
                    }
                } else {
                    i = 3;
                }
            }
        }
        if (A002 == 0) {
            return 6;
        }
        if (A002 == 4) {
            return 1;
        }
        if (A002 == 3) {
            return 6;
        }
        return i;
    }

    public void A0S() {
        C121835tn.A00(this.A01, this.A06.A01(), (Throwable) null, 0);
    }

    public void A0T(boolean z) {
        this.A07.Boy(new AnonymousClass75B(this, z));
    }

    public PaymentIncentiveViewModel(C19970wo r2, AnonymousClass1EU r3, AnonymousClass1YQ r4, C19770wU r5) {
        this.A03 = r2;
        this.A07 = r5;
        this.A05 = r3;
        this.A04 = r3.A05().BFZ();
        this.A06 = r4;
    }
}
