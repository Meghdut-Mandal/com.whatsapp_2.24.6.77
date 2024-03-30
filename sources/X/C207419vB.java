package X;

import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import com.whatsapp.payments.ui.compliance.ConfirmLegalNameBottomSheetFragment;

/* renamed from: X.9vB  reason: invalid class name and case insensitive filesystem */
public final class C207419vB implements ViewTreeObserver.OnGlobalLayoutListener {
    public boolean A00;
    public final /* synthetic */ ConfirmLegalNameBottomSheetFragment A01;

    public C207419vB(ConfirmLegalNameBottomSheetFragment confirmLegalNameBottomSheetFragment) {
        this.A01 = confirmLegalNameBottomSheetFragment;
    }

    public void onGlobalLayout() {
        ConfirmLegalNameBottomSheetFragment confirmLegalNameBottomSheetFragment = this.A01;
        if (confirmLegalNameBottomSheetFragment.A0B != null) {
            boolean A002 = AnonymousClass1N2.A00(confirmLegalNameBottomSheetFragment.A1a());
            if (A002 != this.A00) {
                this.A00 = A002;
                ScrollView scrollView = confirmLegalNameBottomSheetFragment.A03;
                if (scrollView != null) {
                    scrollView.fullScroll(130);
                    return;
                }
                throw C36331k8.A0d("scrollView");
            }
            return;
        }
        throw C36331k8.A0d("imeUtils");
    }
}
