package com.whatsapp.mediacomposer.dialog;

import X.AnonymousClass00C;
import X.AnonymousClass00S;
import X.AnonymousClass099;
import X.AnonymousClass0FM;
import X.AnonymousClass3LW;
import X.C012005e;
import X.C162387oV;
import X.C163297py;
import X.C36391kE;
import X.C36401kF;
import X.C36441kJ;
import X.C39001qm;
import X.C90514aH;
import android.app.Dialog;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.base.WaDialogFragment;

public final class DataWarningDialog extends WaDialogFragment {
    public final AnonymousClass00S A00;
    public final AnonymousClass00S A01;
    public final AnonymousClass00S A02;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
    }

    public DataWarningDialog(AnonymousClass00S r1, AnonymousClass00S r2, AnonymousClass00S r3) {
        this.A00 = r1;
        this.A02 = r2;
        this.A01 = r3;
    }

    public Dialog A1a(Bundle bundle) {
        C39001qm A05 = AnonymousClass3LW.A05(this);
        View A0Q = C90514aH.A0Q(LayoutInflater.from(A0h()), (ViewGroup) null, R.layout.f9nameremoved);
        String A0n = A0n(R.string.f12nameremoved);
        AnonymousClass00C.A08(A0n);
        C162387oV r6 = new C162387oV(this, 1);
        String A0q = C36401kF.A0q(this, A0n, new Object[1], 0, R.string.f12nameremoved);
        AnonymousClass00C.A08(A0q);
        int A0C = AnonymousClass099.A0C(A0q, A0n, 0, false);
        SpannableString A0O = C36441kJ.A0O(A0q);
        A0O.setSpan(r6, A0C, A0n.length() + A0C, 33);
        TextView A0O2 = C36391kE.A0O(A0Q, R.id.messageTextView);
        C012005e.A0L(A0O2);
        A0O2.setHighlightColor(0);
        A0O2.setText(A0O);
        A0O2.setContentDescription(A0q);
        C36391kE.A1J(A0O2);
        A05.setView(A0Q);
        A05.A0a(false);
        A05.A0S(new C163297py(this, 31), A0n(R.string.f12nameremoved));
        A05.A0Q(new C163297py(this, 30), A0n(R.string.f12nameremoved));
        AnonymousClass0FM create = A05.create();
        AnonymousClass00C.A08(create);
        return create;
    }
}
