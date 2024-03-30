package X;

import android.view.ViewGroup;
import com.whatsapp.wds.components.textlayout.WDSTextLayout;
import java.util.Objects;

/* renamed from: X.4NX  reason: invalid class name */
public final class AnonymousClass4NX extends C12690iV {
    public final /* synthetic */ WDSTextLayout A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4NX(WDSTextLayout wDSTextLayout, Object obj) {
        super(obj);
        this.A00 = wDSTextLayout;
    }

    public void A00(Object obj, Object obj2, C17960sM r7) {
        AnonymousClass4SZ r0;
        C56012va r6 = (C56012va) obj2;
        if (obj.getClass() != r6.getClass()) {
            WDSTextLayout wDSTextLayout = this.A00;
            wDSTextLayout.removeAllViews();
            wDSTextLayout.A01 = null;
            wDSTextLayout.A00 = null;
            if (r6 instanceof C50992my) {
                ViewGroup.LayoutParams layoutParams = wDSTextLayout.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                layoutParams.height = -2;
                wDSTextLayout.setLayoutParams(layoutParams);
                C39121rH r02 = new C39121rH(C36371kC.A0B(wDSTextLayout));
                wDSTextLayout.addView(r02);
                wDSTextLayout.A00 = r02;
            } else if (r6 instanceof C51002mz) {
                ViewGroup.LayoutParams layoutParams2 = wDSTextLayout.getLayoutParams();
                Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                layoutParams2.height = -1;
                wDSTextLayout.setLayoutParams(layoutParams2);
                C39131rI r03 = new C39131rI(C36371kC.A0B(wDSTextLayout));
                wDSTextLayout.addView(r03);
                wDSTextLayout.A01 = r03;
            } else if (r6 instanceof C51012n0) {
                ViewGroup.LayoutParams layoutParams3 = wDSTextLayout.getLayoutParams();
                Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                layoutParams3.height = -2;
                wDSTextLayout.setLayoutParams(layoutParams3);
            }
        }
        WDSTextLayout wDSTextLayout2 = this.A00;
        if (r6 instanceof C50992my) {
            r0 = wDSTextLayout2.A00;
        } else if (r6 instanceof C51002mz) {
            r0 = wDSTextLayout2.A01;
        } else {
            r6.equals(C51012n0.A00);
            return;
        }
        if (r0 != null) {
            r0.setViewState(r6);
        }
    }
}
