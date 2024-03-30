package X;

import com.whatsapp.RequestPermissionActivity;

/* renamed from: X.27h  reason: invalid class name */
public abstract class AnonymousClass27h extends C224914p {
    public boolean A00 = false;

    public static void A0L(C18800tq r2, RequestPermissionActivity requestPermissionActivity) {
        requestPermissionActivity.A04 = (C19770wU) r2.A9Y.get();
        C18830tt r1 = r2.A00;
        requestPermissionActivity.A06 = (AnonymousClass3TX) r1.A1p.get();
        requestPermissionActivity.A01 = (C20430xY) r2.A2H.get();
        requestPermissionActivity.A02 = (C21060yb) r2.A8W.get();
        requestPermissionActivity.A05 = (AnonymousClass1JD) r1.A5x.get();
        requestPermissionActivity.A03 = (C20830yE) r2.A9E.get();
        requestPermissionActivity.A04 = (C19420v0) r2.A9G.get();
        requestPermissionActivity.A00 = (AnonymousClass3E0) r1.A0A.get();
    }

    public void A2F() {
        if (!this.A00) {
            this.A00 = true;
            A0L(((C27111My) C36421kH.A0H(this)).A5g, (RequestPermissionActivity) this);
        }
    }

    public AnonymousClass27h() {
        C89314Wb.A00(this, 4);
    }
}
