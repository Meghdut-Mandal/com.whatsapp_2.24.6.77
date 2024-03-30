package X;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import com.bloks.stdlib.components.bkcomponentscollection.StickyHeadersLinearLayoutManager;
import com.whatsapp.privacy.usernotice.UserNoticeBottomSheetDialogFragment;

/* renamed from: X.7sO  reason: invalid class name and case insensitive filesystem */
public class C164797sO implements ViewTreeObserver.OnGlobalLayoutListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public C164797sO(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void onGlobalLayout() {
        switch (this.A02) {
            case 0:
                ((ViewTreeObserver) this.A00).removeOnGlobalLayoutListener(this);
                StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager = (StickyHeadersLinearLayoutManager) this.A01;
                int i = stickyHeadersLinearLayoutManager.A01;
                if (i != -1) {
                    stickyHeadersLinearLayoutManager.A1g(i, stickyHeadersLinearLayoutManager.A00);
                    stickyHeadersLinearLayoutManager.A01 = -1;
                    stickyHeadersLinearLayoutManager.A00 = Integer.MIN_VALUE;
                    return;
                }
                return;
            case 1:
                C36351kA.A1C((View) this.A01, this);
                ((AnonymousClass00S) this.A00).invoke();
                return;
            case 2:
                ScrollView scrollView = (ScrollView) this.A01;
                if (((View) this.A00).hasFocus()) {
                    scrollView.smoothScrollBy(0, scrollView.getMaxScrollAmount());
                    return;
                }
                return;
            default:
                C36351kA.A1C((View) this.A01, this);
                UserNoticeBottomSheetDialogFragment userNoticeBottomSheetDialogFragment = (UserNoticeBottomSheetDialogFragment) this.A00;
                userNoticeBottomSheetDialogFragment.A03.setVisibility(4);
                userNoticeBottomSheetDialogFragment.A02.setVisibility(8);
                UserNoticeBottomSheetDialogFragment.A05(userNoticeBottomSheetDialogFragment);
                return;
        }
    }
}
