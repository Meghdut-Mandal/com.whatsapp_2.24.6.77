package X;

import com.whatsapp.biz.linkedaccounts.LinkedAccountMediaViewFragment;

/* renamed from: X.3bb  reason: invalid class name and case insensitive filesystem */
public class C68253bb implements AnonymousClass02G {
    public int A00;
    public final /* synthetic */ LinkedAccountMediaViewFragment A01;

    public void BcA(int i) {
    }

    public void BcC(int i) {
    }

    public C68253bb(LinkedAccountMediaViewFragment linkedAccountMediaViewFragment) {
        this.A01 = linkedAccountMediaViewFragment;
        this.A00 = linkedAccountMediaViewFragment.A03;
    }

    public void BcB(int i, float f, int i2) {
        if (this.A00 != i) {
            LinkedAccountMediaViewFragment linkedAccountMediaViewFragment = this.A01;
            linkedAccountMediaViewFragment.A01 = i;
            this.A00 = i;
            if (linkedAccountMediaViewFragment.A02 == 0) {
                int i3 = 27;
                if (linkedAccountMediaViewFragment.A00 == 0) {
                    i3 = 26;
                }
                linkedAccountMediaViewFragment.A06.A03(linkedAccountMediaViewFragment.A07, i3);
                return;
            }
            AnonymousClass3NM.A00(linkedAccountMediaViewFragment.A05, linkedAccountMediaViewFragment.A0E, 3);
        }
    }
}
