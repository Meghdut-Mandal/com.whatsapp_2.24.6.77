package X;

import com.whatsapp.webview.ui.WaInAppBrowsingActivity;

/* renamed from: X.24Z  reason: invalid class name */
public abstract class AnonymousClass24Z extends AnonymousClass155 {
    public boolean A00 = false;

    public static void A01(C18800tq r1, C18830tt r2, WaInAppBrowsingActivity waInAppBrowsingActivity) {
        waInAppBrowsingActivity.A02 = (C32691e2) r1.A4R.get();
        waInAppBrowsingActivity.A04 = C18830tt.ACx(r2);
        waInAppBrowsingActivity.A03 = (AnonymousClass1DW) r1.A2f.get();
        waInAppBrowsingActivity.A05 = (C24051Aw) r1.A3E.get();
    }

    public void A2F() {
        if (!this.A00) {
            this.A00 = true;
            WaInAppBrowsingActivity waInAppBrowsingActivity = (WaInAppBrowsingActivity) this;
            C18800tq r2 = ((C27111My) C36421kH.A0H(this)).A5g;
            C36321k7.A0c(r2, waInAppBrowsingActivity);
            C18830tt r1 = r2.A00;
            C36321k7.A0X(r2, r1, waInAppBrowsingActivity, C36321k7.A05(r2, r1, waInAppBrowsingActivity));
            A01(r2, r1, waInAppBrowsingActivity);
        }
    }

    public AnonymousClass24Z() {
        C89374Wh.A00(this, 23);
    }
}
