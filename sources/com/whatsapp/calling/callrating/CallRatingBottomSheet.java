package com.whatsapp.calling.callrating;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass01I;
import X.AnonymousClass1RC;
import X.AnonymousClass5X0;
import X.AnonymousClass7KX;
import X.AnonymousClass7SR;
import X.AnonymousClass7SS;
import X.C012005e;
import X.C165167sz;
import X.C16550pQ;
import X.C36341k9;
import X.C36361kB;
import X.C36401kF;
import X.C36411kG;
import X.C36431kI;
import X.C90524aI;
import X.C99254sw;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.calling.callrating.util.NonDraggableBottomSheetBehaviour;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.Iterator;

public final class CallRatingBottomSheet extends BottomSheetDialogFragment implements C16550pQ {
    public View A00;
    public WaTextView A01;
    public NonDraggableBottomSheetBehaviour A02;
    public WDSButton A03;
    public final AnonymousClass00T A04 = C36431kI.A1I(new AnonymousClass7KX(this));

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.f9nameremoved, viewGroup);
        if (inflate == null) {
            return null;
        }
        View[] viewArr = new View[2];
        viewArr[0] = C012005e.A02(inflate, R.id.close_button);
        Iterator it = C36341k9.A0m(C012005e.A02(inflate, R.id.not_now_button), viewArr, 1).iterator();
        while (it.hasNext()) {
            C36361kB.A17(C36431kI.A0K(it), this, 46);
        }
        this.A01 = C36401kF.A0Q(inflate, R.id.title_text);
        this.A00 = C012005e.A02(inflate, R.id.bottom_sheet);
        WDSButton A0y = C36431kI.A0y(inflate, R.id.submit_button);
        C36361kB.A17(A0y, this, 45);
        this.A03 = A0y;
        BottomSheetBehavior A022 = BottomSheetBehavior.A02(C012005e.A02(inflate, R.id.bottom_sheet));
        AnonymousClass00C.A0E(A022, "null cannot be cast to non-null type com.whatsapp.calling.callrating.util.NonDraggableBottomSheetBehaviour<@[FlexibleNullability] android.view.View?>");
        NonDraggableBottomSheetBehaviour nonDraggableBottomSheetBehaviour = (NonDraggableBottomSheetBehaviour) A022;
        nonDraggableBottomSheetBehaviour.A0W(3);
        nonDraggableBottomSheetBehaviour.A0d(true);
        nonDraggableBottomSheetBehaviour.A0c(true);
        nonDraggableBottomSheetBehaviour.A0h = false;
        nonDraggableBottomSheetBehaviour.A00 = false;
        this.A02 = nonDraggableBottomSheetBehaviour;
        Dialog dialog = this.A02;
        if (dialog != null) {
            AnonymousClass1RC.A02(R.color.f6nameremoved, dialog);
        }
        AnonymousClass00T r5 = this.A04;
        C165167sz.A00(A0m(), C90524aI.A0L(r5).A0A, new AnonymousClass7SR(this), 46);
        C165167sz.A00(A0m(), C90524aI.A0L(r5).A08, new AnonymousClass7SS(this), 45);
        C165167sz.A00(A0m(), C90524aI.A0L(r5).A09, AnonymousClass5X0.A02(this, 18), 47);
        return inflate;
    }

    public void A1J() {
        super.A1J();
        this.A03 = null;
        this.A01 = null;
        this.A00 = null;
    }

    public void A1M() {
        super.A1M();
        BottomSheetBehavior A022 = BottomSheetBehavior.A02(C36411kG.A0K(A0d()));
        AnonymousClass00C.A08(A022);
        A022.A0W(3);
    }

    public void A1Q(Bundle bundle) {
        Window window;
        super.A1Q(bundle);
        A1d(0, R.style.f13nameremoved);
        AnonymousClass01I A0h = A0h();
        if (A0h != null && (window = A0h.getWindow()) != null) {
            window.setStatusBarColor(0);
        }
    }

    public Dialog A1a(Bundle bundle) {
        return new C99254sw(A0a(), C90524aI.A0L(this.A04), A1Y());
    }
}
