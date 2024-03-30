package X;

import android.app.Activity;
import android.view.View;

/* renamed from: X.3Yc  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C66993Yc implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Activity A02;
    public final /* synthetic */ AnonymousClass17Y A03;
    public final /* synthetic */ C20810yC A04;
    public final /* synthetic */ C32661dz A05;
    public final /* synthetic */ AnonymousClass00S A06;

    public /* synthetic */ C66993Yc(Activity activity, AnonymousClass17Y r2, C20810yC r3, C32661dz r4, AnonymousClass00S r5, int i, int i2) {
        this.A04 = r3;
        this.A03 = r2;
        this.A02 = activity;
        this.A05 = r4;
        this.A00 = i;
        this.A01 = i2;
        this.A06 = r5;
    }

    public final void onClick(View view) {
        C20810yC r4 = this.A04;
        AnonymousClass17Y r3 = this.A03;
        Activity activity = this.A02;
        C32661dz r5 = this.A05;
        int i = this.A00;
        int i2 = this.A01;
        AnonymousClass00S r1 = this.A06;
        new AnonymousClass190();
        C53742ro.A00(activity, r3, r4, r5, i, i2);
        if (r1 != null) {
            r1.invoke();
        }
    }
}
