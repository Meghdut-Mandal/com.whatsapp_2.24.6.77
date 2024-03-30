package X;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: X.4su  reason: invalid class name and case insensitive filesystem */
public class C99244su extends BottomSheetBehavior {
    public boolean A00;
    public final /* synthetic */ AnonymousClass6WR A01;

    public boolean A0P(View view, CoordinatorLayout coordinatorLayout, int i) {
        this.A00 = true;
        return super.A0P(view, coordinatorLayout, i);
    }

    public C99244su(AnonymousClass6WR r1) {
        this.A01 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        if (r1.A03.A00(r5) != null) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0042, code lost:
        if (r0 != null) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0L(android.view.MotionEvent r5, android.view.View r6, androidx.coordinatorlayout.widget.CoordinatorLayout r7) {
        /*
            r4 = this;
            boolean r0 = r4.A00
            r3 = 0
            if (r0 != 0) goto L_0x000c
            boolean r0 = r6.isShown()
            if (r0 == 0) goto L_0x000c
        L_0x000b:
            return r3
        L_0x000c:
            int r1 = r5.getPointerCount()
            r0 = 2
            if (r1 >= r0) goto L_0x000b
            X.6WR r0 = r4.A01
            X.6cU r0 = r0.A0T
            com.whatsapp.mediacomposer.MediaComposerFragment r0 = r0.A01
            X.6wC r1 = r0.A0E
            if (r1 == 0) goto L_0x004a
            X.64m r0 = r1.A0P
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x000b
            X.6cW r1 = r1.A0S
            X.6LZ r0 = r1.A04
            X.6Ft r0 = r0.A00
            if (r0 != 0) goto L_0x0034
            com.whatsapp.mediacomposer.doodle.DoodleView r0 = r1.A03
            X.6Ft r0 = r0.A00(r5)
            r2 = 0
            if (r0 == 0) goto L_0x0035
        L_0x0034:
            r2 = 1
        L_0x0035:
            X.5mJ r0 = r1.A08
            X.6Ft r0 = r0.A00
            if (r0 != 0) goto L_0x0044
            com.whatsapp.mediacomposer.doodle.DoodleView r0 = r1.A03
            X.6Ft r0 = r0.A01(r5)
            r1 = 0
            if (r0 == 0) goto L_0x0045
        L_0x0044:
            r1 = 1
        L_0x0045:
            if (r2 != 0) goto L_0x000b
            if (r1 == 0) goto L_0x004a
            return r3
        L_0x004a:
            boolean r0 = super.A0L(r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C99244su.A0L(android.view.MotionEvent, android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout):boolean");
    }

    public boolean A0M(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        if (this.A01.A0O.A00(motionEvent)) {
            return true;
        }
        try {
            if (!this.A00 || !super.A0M(motionEvent, view, coordinatorLayout)) {
                return false;
            }
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }
}
