package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.7sL  reason: invalid class name and case insensitive filesystem */
public class C164767sL implements ViewTreeObserver.OnGlobalLayoutListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C164767sL(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj3;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public void onGlobalLayout() {
        ViewTreeObserver viewTreeObserver;
        boolean isAlive;
        boolean isAlive2;
        switch (this.A03) {
            case 0:
                View view = (View) this.A00;
                ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
                C120765s2 r2 = (C120765s2) this.A01;
                viewTreeObserver2.removeOnGlobalLayoutListener(r2.A01);
                C93214g9 r1 = ((C100384uv) this.A02).A01;
                if (r1 == null) {
                    throw C36331k8.A0d("parametricSlider");
                }
                r1.A00(r2, view.getHeight());
                return;
            case 1:
                try {
                    C36411kG.A1O(this.A00);
                    if ((!isAlive && viewTreeObserver == null) || !isAlive2) {
                        throw AnonymousClass001.A08("Given null or dead view tree observer.");
                    }
                    return;
                } finally {
                    viewTreeObserver = (ViewTreeObserver) this.A01;
                    if ((viewTreeObserver.isAlive() || (viewTreeObserver = ((View) this.A02).getViewTreeObserver()) != null) && viewTreeObserver.isAlive()) {
                        viewTreeObserver.removeOnGlobalLayoutListener(this);
                        throw th;
                    } else {
                        IllegalArgumentException A08 = AnonymousClass001.A08("Given null or dead view tree observer.");
                    }
                }
            default:
                View view2 = (View) this.A01;
                C36351kA.A1C(view2, this);
                C133586Zc.A0F((C133586Zc) this.A00, (Float) this.A02, view2.getMeasuredHeight(), false);
                return;
        }
    }
}
