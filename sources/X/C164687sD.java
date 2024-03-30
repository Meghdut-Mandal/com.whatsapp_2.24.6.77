package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.whatsapp.home.ui.StarredMessagesPlaceholderActivity;
import com.whatsapp.mediacomposer.ImageComposerFragment;
import com.whatsapp.mediacomposer.MediaComposerActivity;
import com.whatsapp.mediacomposer.MediaComposerFragment;
import com.whatsapp.mediacomposer.bottombar.filterswipe.FilterSwipeView;

/* renamed from: X.7sD  reason: invalid class name and case insensitive filesystem */
public class C164687sD implements C010904r {
    public Object A00;
    public final int A01;

    public C164687sD(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final AnonymousClass09H BRE(View view, AnonymousClass09H r11) {
        ViewTreeObserver viewTreeObserver;
        int i;
        int i2;
        if (this.A01 != 0) {
            MediaComposerActivity mediaComposerActivity = (MediaComposerActivity) this.A00;
            AnonymousClass09I r4 = r11.A00;
            AnonymousClass0XH A05 = r4.A05();
            if (A05 != null) {
                i = A05.A04();
            } else {
                i = r4.A0C(7).A03;
            }
            Rect rect = mediaComposerActivity.A1p;
            int i3 = r4.A0C(7).A01;
            int i4 = mediaComposerActivity.A00;
            int i5 = 0;
            if (i > i4) {
                i5 = i - i4;
            }
            rect.set(i3, i5, r4.A0C(7).A02, r4.A0C(7).A00);
            for (AnonymousClass02E r1 : mediaComposerActivity.A2m()) {
                if ((r1 instanceof ImageComposerFragment) || (r1 instanceof MediaComposerFragment)) {
                    ((MediaComposerFragment) r1).A1g(rect);
                }
            }
            if (i > mediaComposerActivity.A00) {
                i2 = i;
            } else {
                i2 = AnonymousClass000.A0a(mediaComposerActivity.A04).topMargin;
            }
            mediaComposerActivity.A02.setPadding(rect.left, i2, rect.right, rect.bottom);
            C129126Fh r5 = mediaComposerActivity.A10;
            int i6 = rect.left;
            int i7 = mediaComposerActivity.A00;
            if (i7 != -1) {
                i7 = Math.max(i, i7);
            }
            r5.A04 = new Rect(i6, i7, rect.right, rect.bottom);
            C146636vv r12 = mediaComposerActivity.A0u;
            int i8 = -rect.left;
            int i9 = -rect.right;
            FilterSwipeView filterSwipeView = r12.A04.A01;
            filterSwipeView.setPadding(i8, filterSwipeView.getPaddingTop(), i9, filterSwipeView.getPaddingBottom());
            return r11;
        }
        StarredMessagesPlaceholderActivity starredMessagesPlaceholderActivity = (StarredMessagesPlaceholderActivity) this.A00;
        AnonymousClass00C.A0D(r11, 2);
        AnonymousClass09T A0C = r11.A00.A0C(7);
        AnonymousClass00C.A08(A0C);
        starredMessagesPlaceholderActivity.A01 = A0C.A03;
        ViewGroup viewGroup = starredMessagesPlaceholderActivity.A04;
        ViewGroup.LayoutParams layoutParams = null;
        View view2 = null;
        if (viewGroup != null) {
            view2 = C36411kG.A0L(viewGroup);
        }
        starredMessagesPlaceholderActivity.A02 = view2;
        if (view2 != null) {
            layoutParams = view2.getLayoutParams();
        }
        AnonymousClass00C.A0E(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        starredMessagesPlaceholderActivity.A03 = layoutParams;
        View view3 = starredMessagesPlaceholderActivity.A02;
        if (!(view3 == null || (viewTreeObserver = view3.getViewTreeObserver()) == null)) {
            C164757sK.A00(viewTreeObserver, starredMessagesPlaceholderActivity, 8);
        }
        return AnonymousClass09H.A01;
    }
}
