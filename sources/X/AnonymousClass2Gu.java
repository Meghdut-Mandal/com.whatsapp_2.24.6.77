package X;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import com.whatsapp.R;

/* renamed from: X.2Gu  reason: invalid class name */
public class AnonymousClass2Gu extends AnonymousClass28d {
    public final C62553Gp A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass2Gu(X.AnonymousClass01L r30, X.C32621dv r31, X.AnonymousClass17Y r32, X.C19730wQ r33, X.AnonymousClass1LI r34, X.AnonymousClass3CG r35, X.C26421Kc r36, X.C24361Cd r37, X.AnonymousClass1Pp r38, X.AnonymousClass16I r39, X.AnonymousClass171 r40, X.C27761Ps r41, X.C18820ts r42, X.AnonymousClass1A5 r43, X.AnonymousClass141 r44, X.AnonymousClass1H2 r45, X.C20810yC r46, X.C233117z r47, X.C177538dx r48, X.AnonymousClass1EM r49, X.AnonymousClass13J r50, X.C19770wU r51) {
        /*
            r29 = this;
            r18 = 0
            r16 = r41
            r15 = r40
            r14 = r39
            r13 = r38
            r12 = r37
            r11 = r36
            r10 = r35
            r9 = r34
            r8 = r33
            r7 = r32
            r2 = r51
            r26 = r50
            r25 = r49
            r3 = r48
            r23 = r47
            r22 = r46
            r21 = r45
            r20 = r44
            r6 = r31
            r19 = r43
            r5 = r30
            r17 = r42
            r4 = r29
            r24 = r3
            r27 = r2
            r28 = r18
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r0 = 1
            X.2tM r1 = new X.2tM
            r1.<init>(r4, r0)
            X.3Gp r0 = new X.3Gp
            r0.<init>(r15, r1, r3, r2)
            r4.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2Gu.<init>(X.01L, X.1dv, X.17Y, X.0wQ, X.1LI, X.3CG, X.1Kc, X.1Cd, X.1Pp, X.16I, X.171, X.1Ps, X.0ts, X.1A5, X.141, X.1H2, X.0yC, X.17z, X.8dx, X.1EM, X.13J, X.0wU):void");
    }

    public void A0H() {
        super.A0H();
        this.A00.A00();
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        Bundle A002;
        super.onActivityCreated(activity, bundle);
        this.A0D.setText(R.string.f12nameremoved);
        if (this.A0L) {
            A002 = null;
        } else {
            A002 = AnonymousClass3CG.A00(activity, this.A0U.findViewById(R.id.transition_start), this.A0Y);
        }
        A0E(new C67113Yo((Object) this, (Object) activity, (Object) A002, 33));
        C33521fV.A03(this.A05, R.string.f12nameremoved);
    }

    public void onActivityDestroyed(Activity activity) {
        super.onActivityDestroyed(activity);
        C62553Gp r3 = this.A00;
        C49672jV r2 = r3.A00;
        if (r2 != null) {
            r2.A0D(false);
            Handler handler = r2.A00;
            if (handler != null) {
                handler.removeCallbacks(r2.A01);
            }
            r2.A00 = null;
            r2.A01 = null;
            r3.A00 = null;
        }
    }
}
