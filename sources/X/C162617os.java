package X;

import com.whatsapp.privacy.disclosure.ui.PrivacyDisclosureContainerActivity;

/* renamed from: X.7os  reason: invalid class name and case insensitive filesystem */
public class C162617os extends C06320Td {
    public Object A00;
    public final int A01;

    public C162617os(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public /* bridge */ /* synthetic */ void A00(Object obj, int i) {
        int i2 = this.A01;
        Object obj2 = this.A00;
        if (i2 != 0) {
            PrivacyDisclosureContainerActivity privacyDisclosureContainerActivity = (PrivacyDisclosureContainerActivity) obj2;
            if (privacyDisclosureContainerActivity.A00) {
                privacyDisclosureContainerActivity.finish();
                return;
            }
            return;
        }
        C1255260f r1 = (C1255260f) obj2;
        if (AnonymousClass00C.A0J(obj, r1.A00)) {
            r1.A00 = null;
        }
    }
}
