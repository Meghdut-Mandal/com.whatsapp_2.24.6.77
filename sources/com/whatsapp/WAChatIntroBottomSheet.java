package com.whatsapp;

import X.C012005e;
import X.C16550pQ;
import X.C36361kB;
import X.C36391kE;
import X.C44122Lf;
import X.C48732hx;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class WAChatIntroBottomSheet extends RoundedBottomSheetDialogFragment implements C16550pQ {
    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0E = C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
        C48732hx r1 = new C48732hx(this, 4);
        C012005e.A02(A0E, R.id.close_button).setOnClickListener(r1);
        C012005e.A02(A0E, R.id.continue_button).setOnClickListener(r1);
        C36391kE.A0O(A0E, R.id.header).setText(C44122Lf.A02(A1D(), R.string.f12nameremoved));
        C36391kE.A0O(A0E, R.id.bodyLineItemText2).setText(C44122Lf.A02(A1D(), R.string.f12nameremoved));
        return A0E;
    }

    public int A1Y() {
        return R.style.f13nameremoved;
    }
}
