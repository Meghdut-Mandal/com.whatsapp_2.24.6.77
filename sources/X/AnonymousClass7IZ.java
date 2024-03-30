package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.foundation.gestures.ScrollableKt;

/* renamed from: X.7IZ  reason: invalid class name */
public final class AnonymousClass7IZ extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C94854it this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7IZ(C94854it r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        boolean z;
        if (!AnonymousClass000.A1X(C109185Wp.A00(this.this$0, ScrollableKt.A03))) {
            C94854it r2 = this.this$0;
            long j = C112155dR.A00;
            ViewGroup viewGroup = (View) C109205Wr.A00(C131966Ro.A03, r2);
            while (true) {
                ViewParent parent = viewGroup.getParent();
                if (parent != null && (parent instanceof ViewGroup)) {
                    ViewGroup viewGroup2 = (ViewGroup) parent;
                    boolean shouldDelayChildPressedState = viewGroup2.shouldDelayChildPressedState();
                    viewGroup = viewGroup2;
                    if (shouldDelayChildPressedState) {
                        break;
                    }
                } else {
                    z = false;
                }
            }
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
