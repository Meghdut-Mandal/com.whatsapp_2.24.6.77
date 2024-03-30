package X;

import androidx.core.widget.NestedScrollView;
import com.whatsapp.privacy.usernotice.UserNoticeBottomSheetDialogFragment;

/* renamed from: X.6hk  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C138366hk implements C16720pz {
    public final /* synthetic */ UserNoticeBottomSheetDialogFragment A00;

    public /* synthetic */ C138366hk(UserNoticeBottomSheetDialogFragment userNoticeBottomSheetDialogFragment) {
        this.A00 = userNoticeBottomSheetDialogFragment;
    }

    public final void Bfu(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        UserNoticeBottomSheetDialogFragment userNoticeBottomSheetDialogFragment = this.A00;
        UserNoticeBottomSheetDialogFragment.A06(userNoticeBottomSheetDialogFragment, false, false);
        UserNoticeBottomSheetDialogFragment.A05(userNoticeBottomSheetDialogFragment);
        Runnable runnable = userNoticeBottomSheetDialogFragment.A0C;
        if (runnable != null) {
            userNoticeBottomSheetDialogFragment.A05.A0G(runnable);
        }
        if ((userNoticeBottomSheetDialogFragment.A00.getY() - C36441kJ.A02(userNoticeBottomSheetDialogFragment.A04)) - ((float) userNoticeBottomSheetDialogFragment.A04.getScrollY()) >= 0.0f) {
            C1497372o r3 = new C1497372o(userNoticeBottomSheetDialogFragment, 27);
            userNoticeBottomSheetDialogFragment.A0C = r3;
            userNoticeBottomSheetDialogFragment.A05.A0I(r3, 600);
        }
    }
}
