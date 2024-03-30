package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.4Yi  reason: invalid class name and case insensitive filesystem */
public class C89904Yi implements ViewTreeObserver.OnPreDrawListener {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C89904Yi(Object obj, int i, int i2, Object obj2) {
        this.A03 = i2;
        this.A01 = obj2;
        this.A02 = obj;
        this.A00 = i;
    }

    public boolean onPreDraw() {
        Drawable popupDrawable;
        if (this.A03 != 0) {
            AnonymousClass3HK r5 = (AnonymousClass3HK) this.A01;
            if (!r5.A0F) {
                AnonymousClass80Q r1 = (AnonymousClass80Q) this.A02;
                if (!r1.A09.A02 && !r1.A0A.A02) {
                    return false;
                }
                r5.A0F = true;
                r5.A01.requestLayout();
                return false;
            }
            C36351kA.A1D(r5.A01, this);
            int i = r5.A01.getLayoutParams().height;
            int height = r5.A01.getHeight();
            r5.A01.getLayoutParams().height = this.A00;
            r5.A01.requestLayout();
            int transcriptMode = r5.A02.getTranscriptMode();
            AnonymousClass4VW r3 = new AnonymousClass4VW(this, i, height, 1);
            C429121e r2 = new C429121e(this, transcriptMode);
            r3.setDuration(300);
            r3.setAnimationListener(r2);
            r5.A01.startAnimation(r3);
            return false;
        }
        View view = (View) this.A02;
        C36351kA.A1D(view, this);
        AnonymousClass2IR r22 = (AnonymousClass2IR) this.A01;
        int i2 = this.A00;
        if (i2 == 0) {
            popupDrawable = r22.getPopupDrawable();
        } else if (i2 != 1) {
            popupDrawable = r22.getPinAnimDrawable();
        } else {
            popupDrawable = r22.getKeepAnimDrawable();
        }
        C89004Uw r0 = r22.A0c;
        if (r0 == null || popupDrawable == null) {
            return true;
        }
        r0.B0z(popupDrawable, view);
        return true;
    }
}
