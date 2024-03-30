package X;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.privacy.disclosure.ui.fragment.PrivacyDisclosureBottomSheetFragment;

/* renamed from: X.4sp  reason: invalid class name and case insensitive filesystem */
public final class C99204sp extends C06570Uc {
    public final /* synthetic */ BottomSheetBehavior A00;
    public final /* synthetic */ PrivacyDisclosureBottomSheetFragment A01;
    public final /* synthetic */ boolean A02;

    public void A02(View view, float f) {
    }

    public void A03(View view, int i) {
        if (i == 4 || i == 5) {
            AnonymousClass01I A0h = this.A01.A0h();
            if (A0h != null) {
                AnonymousClass01z supportFragmentManager = A0h.getSupportFragmentManager();
                AnonymousClass00C.A08(supportFragmentManager);
                C55062u0.A00(supportFragmentManager, C52002oj.RESULT_BACK);
            }
        } else if (this.A02) {
            this.A00.A0W(3);
        }
    }

    public C99204sp(BottomSheetBehavior bottomSheetBehavior, PrivacyDisclosureBottomSheetFragment privacyDisclosureBottomSheetFragment, boolean z) {
        this.A01 = privacyDisclosureBottomSheetFragment;
        this.A02 = z;
        this.A00 = bottomSheetBehavior;
    }
}
