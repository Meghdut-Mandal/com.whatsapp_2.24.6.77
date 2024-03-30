package X;

import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import com.whatsapp.R;
import com.whatsapp.mediacomposer.VideoComposerFragment;
import java.util.concurrent.CancellationException;

/* renamed from: X.7q8  reason: invalid class name and case insensitive filesystem */
public class C163397q8 implements View.OnAttachStateChangeListener {
    public Object A00;
    public final int A01;

    public C163397q8(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager;
        if (2 - this.A01 == 0) {
            C93014fP r2 = (C93014fP) this.A00;
            if (r2.A0A != null && (accessibilityManager = r2.A0E) != null && C011304x.A02(r2)) {
                AnonymousClass0VP.A00(accessibilityManager, r2.A0A);
            }
        }
    }

    public void onViewDetachedFromWindow(View view) {
        C16970qV<ViewParent> r1;
        Boolean bool;
        AccessibilityManager accessibilityManager;
        switch (this.A01) {
            case 0:
                C92424dv r3 = (C92424dv) this.A00;
                ViewParent parent = r3.getParent();
                C14400lZ r2 = C14400lZ.A00;
                if (parent == null) {
                    r1 = C12850il.A00;
                } else {
                    r1 = new C12760ic(new C14530lm(parent), r2);
                }
                for (ViewParent viewParent : r1) {
                    if (viewParent instanceof View) {
                        View view2 = (View) viewParent;
                        AnonymousClass00C.A0D(view2, 0);
                        Object tag = view2.getTag(R.id.is_pooling_container_tag);
                        if ((tag instanceof Boolean) && (bool = (Boolean) tag) != null && bool.booleanValue()) {
                            return;
                        }
                    }
                }
                C158777iD r0 = r3.A00;
                if (r0 != null) {
                    r0.dispose();
                }
                r3.A00 = null;
                r3.requestLayout();
                return;
            case 1:
                view.removeOnAttachStateChangeListener(this);
                ((C007403e) this.A00).B2S((CancellationException) null);
                return;
            case 2:
                C93014fP r02 = (C93014fP) this.A00;
                C16700pw r12 = r02.A0A;
                if (r12 != null && (accessibilityManager = r02.A0E) != null) {
                    AnonymousClass0VP.A01(accessibilityManager, r12);
                    return;
                }
                return;
            default:
                AnonymousClass00C.A0D(view, 0);
                view.removeCallbacks(((VideoComposerFragment) this.A00).A0a);
                view.removeOnAttachStateChangeListener(this);
                return;
        }
    }
}
