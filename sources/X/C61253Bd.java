package X;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.Objects;

/* renamed from: X.3Bd  reason: invalid class name and case insensitive filesystem */
public abstract class C61253Bd {
    public void A00(View view) {
        View.OnLayoutChangeListener onLayoutChangeListener;
        int i;
        if (!(this instanceof C50782lZ)) {
            boolean z = this instanceof C50792la;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (z) {
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                layoutParams.height = -1;
                view.setLayoutParams(layoutParams);
                if (!C011304x.A03(view) || view.isLayoutRequested()) {
                    onLayoutChangeListener = new AnonymousClass4YA(this, view, 5);
                    view.addOnLayoutChangeListener(onLayoutChangeListener);
                }
                BottomSheetBehavior A02 = BottomSheetBehavior.A02(view);
                C36351kA.A1G(A02, view.getHeight());
                A02.A0Z(new C89184Vo(this, A02, 1));
                return;
            }
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            layoutParams.height = -2;
            view.setLayoutParams(layoutParams);
            if (!C011304x.A03(view) || view.isLayoutRequested()) {
                i = 4;
            } else {
                C36351kA.A1G(BottomSheetBehavior.A02(view), view.getHeight());
                return;
            }
        } else if (!C011304x.A03(view) || view.isLayoutRequested()) {
            i = 5;
        } else {
            BottomSheetBehavior A022 = BottomSheetBehavior.A02(view);
            A022.A0V(C36441kJ.A07(C36411kG.A0K(view)));
            A022.A0W(4);
            A022.A0h = true;
            return;
        }
        onLayoutChangeListener = new AnonymousClass4XX((Object) view, i);
        view.addOnLayoutChangeListener(onLayoutChangeListener);
    }
}
