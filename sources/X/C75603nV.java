package X;

import com.whatsapp.mediacomposer.bottombar.recipients.QuickShareRecipientsView;

/* renamed from: X.3nV  reason: invalid class name and case insensitive filesystem */
public final class C75603nV implements C160657lN {
    public boolean A00 = true;
    public final QuickShareRecipientsView A01;

    public C75603nV(QuickShareRecipientsView quickShareRecipientsView) {
        AnonymousClass00C.A0D(quickShareRecipientsView, 1);
        this.A01 = quickShareRecipientsView;
    }

    public void B5T() {
    }

    public void Bru(AnonymousClass4U9 r2) {
        this.A01.setRecipientsListener$app_product_mediacomposer_mediacomposer_non_modified(r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (X.AnonymousClass143.A0M(r5) != false) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Brt(X.AnonymousClass3XT r4, java.util.List r5, boolean r6) {
        /*
            r3 = this;
            X.C36321k7.A0w(r5, r4)
            com.whatsapp.mediacomposer.bottombar.recipients.QuickShareRecipientsView r2 = r3.A01
            boolean r0 = X.AnonymousClass143.A0N(r5)
            if (r0 == 0) goto L_0x0012
            boolean r1 = X.AnonymousClass143.A0M(r5)
            r0 = 0
            if (r1 == 0) goto L_0x0014
        L_0x0012:
            r0 = 8
        L_0x0014:
            r2.setVisibility(r0)
            r2.setUpButtonLabel$app_product_mediacomposer_mediacomposer_non_modified(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75603nV.Brt(X.3XT, java.util.List, boolean):void");
    }

    public boolean isEnabled() {
        return this.A00;
    }

    public void Bqq(boolean z) {
        this.A00 = z;
    }
}
