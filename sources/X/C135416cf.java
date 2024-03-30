package X;

import android.os.SystemClock;
import android.view.View;
import android.view.animation.AlphaAnimation;
import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.6cf  reason: invalid class name and case insensitive filesystem */
public abstract class C135416cf implements View.OnClickListener {
    public long A00;

    public void onClick(View view) {
        C127956Ah r5;
        long j;
        AnonymousClass00C.A0D(view, 0);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean A1P = C36431kI.A1P(((elapsedRealtime - this.A00) > 500 ? 1 : ((elapsedRealtime - this.A00) == 500 ? 0 : -1)));
        this.A00 = elapsedRealtime;
        if (A1P) {
            C106795Lj r1 = (C106795Lj) this;
            int i = r1.A01;
            AnonymousClass5NI r52 = (AnonymousClass5NI) r1.A00;
            if (i != 0) {
                C127956Ah r0 = r52.A03;
                if (r0 == null || r0.A01.A08() != 0) {
                    AnonymousClass5NI.A00(r52.A0D);
                    if (!r52.A0A()) {
                        AlphaAnimation alphaAnimation = r52.A00;
                        if (alphaAnimation != null) {
                            alphaAnimation.cancel();
                        }
                        r52.A03();
                    }
                    r5 = r52.A03;
                    if (r5 != null) {
                        j = r5.A01.A08() - ((long) SearchActionVerificationClientService.NOTIFICATION_ID);
                        if (j < 0) {
                            j = 0;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                long j2 = 0;
                long A0A = C36371kC.A0A(r52.A07);
                C127956Ah r02 = r52.A03;
                if (r02 != null) {
                    j2 = r02.A01.A08();
                }
                if (j2 < A0A) {
                    AnonymousClass5NI.A00(r52.A0C);
                    if (!r52.A0A()) {
                        AlphaAnimation alphaAnimation2 = r52.A00;
                        if (alphaAnimation2 != null) {
                            alphaAnimation2.cancel();
                        }
                        r52.A03();
                    }
                    r5 = r52.A03;
                    if (r5 != null) {
                        j = r5.A01.A08() + ((long) SearchActionVerificationClientService.NOTIFICATION_ID);
                        long A09 = r5.A01.A09();
                        if (j > A09) {
                            j = A09;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            r5.A01(j);
            return;
        }
        AnonymousClass5NI r12 = (AnonymousClass5NI) ((C106795Lj) this).A00;
        if (r12.A0A()) {
            r12.A02();
        } else {
            r12.A03();
        }
    }
}
