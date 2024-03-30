package X;

import com.whatsapp.datasharingdisclosure.ui.ConsumerMarketingDisclosureFragment;
import com.whatsapp.datasharingdisclosure.ui.DisclosureFragment;

/* renamed from: X.2sB  reason: invalid class name and case insensitive filesystem */
public class C53962sB implements AnonymousClass4P1 {
    public Object A00;
    public final int A01;

    public C53962sB(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void B2v() {
        switch (this.A01) {
            case 0:
                Integer A0o = C36371kC.A0o();
                Integer A0i = C36361kB.A0i();
                AnonymousClass2Q2 r1 = new AnonymousClass2Q2();
                r1.A01 = A0o;
                r1.A00 = A0i;
                r1.A02 = null;
                ((C603337l) this.A00).A01.Bly(r1);
                return;
            case 1:
                DisclosureFragment disclosureFragment = (DisclosureFragment) this.A00;
                if (disclosureFragment instanceof ConsumerMarketingDisclosureFragment) {
                    ConsumerMarketingDisclosureFragment consumerMarketingDisclosureFragment = (ConsumerMarketingDisclosureFragment) disclosureFragment;
                    C30961b3 r3 = consumerMarketingDisclosureFragment.A01;
                    if (r3 != null) {
                        AnonymousClass11F r2 = consumerMarketingDisclosureFragment.A03;
                        AnonymousClass00C.A0D(r2, 0);
                        C30961b3.A00(r2, r3, (Integer) null, 2, (Integer) null, (Integer) null, (Integer) null, 5);
                        return;
                    }
                    throw C36331k8.A0d("disclosureLoggingUtil");
                }
                return;
            case 2:
                AnonymousClass3TX r22 = ((C62043En) this.A00).A00;
                r22.A08("verification_complete_dialog", "click_verification_complete_dialog_learn_more");
                r22.A04("verification_complete_dialog");
                return;
            default:
                C36341k9.A0v(C36331k8.A05(((AnonymousClass3DM) this.A00).A00), "pref_flash_call_education_link_clicked", 1);
                return;
        }
    }
}
