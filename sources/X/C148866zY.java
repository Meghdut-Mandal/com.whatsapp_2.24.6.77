package X;

import android.graphics.Bitmap;

/* renamed from: X.6zY  reason: invalid class name and case insensitive filesystem */
public final class C148866zY implements C160197kc {
    public final /* synthetic */ AnonymousClass6KE A00;

    public C148866zY(AnonymousClass6KE r1) {
        this.A00 = r1;
    }

    public void BZt() {
        AnonymousClass6KE r0 = this.A00;
        C140456lc r5 = r0.A01;
        C1271967i r4 = r0.A00;
        C160377ku r3 = r0.A02;
        C1273868b A01 = C1273868b.A01("ImageFailed");
        A01.A09(C90484aE.A0g(), 1);
        C1273868b.A06(r4, r5, A01, r3);
    }

    public void Bj4() {
        AnonymousClass6KE r0 = this.A00;
        C140456lc r5 = r0.A01;
        C1271967i r4 = r0.A00;
        C160377ku r3 = r0.A02;
        C1273868b A01 = C1273868b.A01("ImageRequested");
        A01.A09(C90484aE.A0g(), 1);
        C1273868b.A06(r4, r5, A01, r3);
    }

    public void Bj5(Bitmap bitmap) {
        AnonymousClass6KE r0 = this.A00;
        C140456lc r5 = r0.A01;
        C1271967i r4 = r0.A00;
        C160377ku r3 = r0.A02;
        C1273868b A01 = C1273868b.A01("ImageFinalRendered");
        A01.A09(C90484aE.A0g(), 1);
        C1273868b.A06(r4, r5, A01, r3);
    }
}
