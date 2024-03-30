package X;

import com.whatsapp.status.audienceselector.StatusRecipientsActivity;

/* renamed from: X.8TT  reason: invalid class name */
public abstract class AnonymousClass8TT extends C173788Ta {
    public boolean A00 = false;

    public void A2F() {
        if (!this.A00) {
            this.A00 = true;
            StatusRecipientsActivity statusRecipientsActivity = (StatusRecipientsActivity) this;
            C27111My r4 = (C27111My) C36421kH.A0H(this);
            C18800tq r2 = r4.A5g;
            C165567td.A11(r2, statusRecipientsActivity);
            C18830tt r1 = r2.A00;
            C165567td.A0v(r2, r1, statusRecipientsActivity, C36321k7.A05(r2, r1, statusRecipientsActivity));
            C173788Ta.A0x(statusRecipientsActivity, r2);
            A0u(r4, r2, statusRecipientsActivity);
        }
    }

    public AnonymousClass8TT() {
        C23140B7a.A00(this, 15);
    }

    public static void A0u(C27111My r1, C18800tq r2, StatusRecipientsActivity statusRecipientsActivity) {
        statusRecipientsActivity.A03 = (AnonymousClass16E) r2.A80.get();
        statusRecipientsActivity.A01 = (AnonymousClass164) r2.A99.get();
        statusRecipientsActivity.A04 = (C29731Xt) r2.A81.get();
        statusRecipientsActivity.A00 = (AnonymousClass3Bu) r1.A1S.get();
        statusRecipientsActivity.A02 = (C144576sT) r2.A8T.get();
    }
}
