package X;

import android.graphics.Rect;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.whatsapp.home.ui.HomePlaceholderActivity;

/* renamed from: X.3ZN  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3ZN implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ FrameLayout.LayoutParams A01;
    public final /* synthetic */ HomePlaceholderActivity.HomePlaceholderView A02;
    public final /* synthetic */ HomePlaceholderActivity A03;

    public /* synthetic */ AnonymousClass3ZN(FrameLayout.LayoutParams layoutParams, HomePlaceholderActivity.HomePlaceholderView homePlaceholderView, HomePlaceholderActivity homePlaceholderActivity, int i) {
        this.A03 = homePlaceholderActivity;
        this.A00 = i;
        this.A01 = layoutParams;
        this.A02 = homePlaceholderView;
    }

    public final void onGlobalLayout() {
        HomePlaceholderActivity homePlaceholderActivity = this.A03;
        int i = this.A00;
        FrameLayout.LayoutParams layoutParams = this.A01;
        HomePlaceholderActivity.HomePlaceholderView homePlaceholderView = this.A02;
        AnonymousClass00C.A0D(layoutParams, 2);
        Rect A06 = AnonymousClass001.A06();
        homePlaceholderActivity.getWindow().findViewById(16908290).getWindowVisibleDisplayFrame(A06);
        int height = A06.height() + i;
        if (height != homePlaceholderActivity.A00) {
            layoutParams.height = height;
            homePlaceholderView.requestLayout();
            homePlaceholderActivity.A00 = height;
        }
    }
}
