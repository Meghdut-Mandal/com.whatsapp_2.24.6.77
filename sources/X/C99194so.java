package X;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.privacy.usernotice.UserNoticeBottomSheetDialogFragment;

/* renamed from: X.4so  reason: invalid class name and case insensitive filesystem */
public class C99194so extends C06570Uc {
    public final /* synthetic */ BottomSheetBehavior A00;
    public final /* synthetic */ UserNoticeBottomSheetDialogFragment A01;

    public void A02(View view, float f) {
    }

    public void A03(View view, int i) {
        if (i != 3) {
            this.A00.A0W(3);
        }
    }

    public C99194so(BottomSheetBehavior bottomSheetBehavior, UserNoticeBottomSheetDialogFragment userNoticeBottomSheetDialogFragment) {
        this.A01 = userNoticeBottomSheetDialogFragment;
        this.A00 = bottomSheetBehavior;
    }
}
