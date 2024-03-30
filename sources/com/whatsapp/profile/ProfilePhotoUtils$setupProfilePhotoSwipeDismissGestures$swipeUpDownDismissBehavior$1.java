package com.whatsapp.profile;

import X.AnonymousClass00C;
import X.AnonymousClass0Z5;
import X.C225314u;
import X.C36321k7;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.whatsapp.gesture.VerticalSwipeDismissBehavior;
import com.whatsapp.mediaview.PhotoView;

public final class ProfilePhotoUtils$setupProfilePhotoSwipeDismissGestures$swipeUpDownDismissBehavior$1 extends VerticalSwipeDismissBehavior {
    public final /* synthetic */ PhotoView A00;

    public boolean A0L(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        AnonymousClass00C.A0D(coordinatorLayout, 0);
        C36321k7.A0v(view, 1, motionEvent);
        if (motionEvent.getPointerCount() <= 1 && !this.A00.A0B()) {
            return super.A0L(motionEvent, view, coordinatorLayout);
        }
        AnonymousClass0Z5 r0 = this.A04;
        if (r0 != null) {
            r0.A0A();
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfilePhotoUtils$setupProfilePhotoSwipeDismissGestures$swipeUpDownDismissBehavior$1(C225314u r1, PhotoView photoView) {
        super(r1);
        this.A00 = photoView;
    }
}
