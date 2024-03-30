package X;

import android.app.Activity;

/* renamed from: X.637  reason: invalid class name */
public final class AnonymousClass637 {
    public final /* synthetic */ C124325xy A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ AnonymousClass3GB A02;

    public AnonymousClass637(Activity activity, C124325xy r2, AnonymousClass3GB r3) {
        this.A02 = r3;
        this.A00 = r2;
        this.A01 = activity;
    }

    public void A00(Exception exc) {
        this.A02.A00();
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Error with native auth, fallback to web: ");
        AnonymousClass000.A1C(exc, A0u);
        AnonymousClass1UT.A01(C36331k8.A0i(" , ", A0u, exc), (Throwable) null);
        C124325xy r4 = this.A00;
        r4.A02.Bp3(new C1498272x(this.A01, r4, 0));
    }
}
