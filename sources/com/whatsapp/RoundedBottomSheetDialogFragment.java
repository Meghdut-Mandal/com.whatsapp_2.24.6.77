package com.whatsapp;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass5Pp;
import X.AnonymousClass5Q3;
import X.AnonymousClass5Q4;
import X.AnonymousClass5Q5;
import X.AnonymousClass5Q6;
import X.AnonymousClass62I;
import X.AnonymousClass6ZC;
import X.C120485ra;
import X.C16550pQ;
import X.C20810yC;
import X.C36321k7;
import X.C36361kB;
import android.app.Dialog;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.privacy.disclosure.ui.fragment.PrivacyDisclosureBottomSheetFragment;

@Deprecated
public abstract class RoundedBottomSheetDialogFragment extends Hilt_RoundedBottomSheetDialogFragment {
    public C120485ra A00;
    public AnonymousClass62I A01 = null;

    public int A1Y() {
        if (this instanceof PrivacyDisclosureBottomSheetFragment) {
            return R.style.f13nameremoved;
        }
        return R.style.f13nameremoved;
    }

    public AnonymousClass62I A1j() {
        AnonymousClass62I r1 = this.A01;
        if (r1 == null) {
            AnonymousClass5Pp r4 = new AnonymousClass5Pp(this);
            C120485ra r3 = this.A00;
            Class<?> cls = getClass();
            AnonymousClass00C.A0D(cls, 0);
            C20810yC r12 = r3.A01;
            if (r12.A0E(3856)) {
                r1 = new AnonymousClass5Q3(r4);
            } else if (!C16550pQ.class.isAssignableFrom(cls) || !r12.A0E(3316)) {
                r1 = AnonymousClass5Q6.A00;
            } else {
                r1 = new AnonymousClass5Q4(r3.A00, r4);
            }
            this.A01 = r1;
        }
        return r1;
    }

    public int A1m() {
        Point point = new Point();
        C36321k7.A0K(A0i(), point);
        Rect A06 = AnonymousClass001.A06();
        C36361kB.A0C(A0i()).getWindowVisibleDisplayFrame(A06);
        return point.y - A06.top;
    }

    public Dialog A1a(Bundle bundle) {
        boolean z = A1j().A01;
        Dialog A1a = super.A1a(bundle);
        if (!z) {
            A1a.setOnShowListener(new AnonymousClass6ZC(A1a, this));
        }
        return A1a;
    }

    public void A1n(View view) {
        BottomSheetBehavior A02 = BottomSheetBehavior.A02(view);
        A02.A0W(3);
        A02.A0h = true;
        A02.A0Y(view.getHeight(), false);
    }

    public boolean A1o() {
        if ((A1j() instanceof AnonymousClass5Q3) || (A1j() instanceof AnonymousClass5Q5)) {
            return true;
        }
        return false;
    }
}
