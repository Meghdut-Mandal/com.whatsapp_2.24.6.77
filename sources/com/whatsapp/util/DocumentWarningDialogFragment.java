package com.whatsapp.util;

import X.AnonymousClass00C;
import X.AnonymousClass0FM;
import X.AnonymousClass16D;
import X.AnonymousClass17Y;
import X.AnonymousClass1A1;
import X.AnonymousClass1TA;
import X.AnonymousClass3LW;
import X.AnonymousClass3T1;
import X.AnonymousClass3Y9;
import X.AnonymousClass3YK;
import X.C19700wN;
import X.C19770wU;
import X.C20310xM;
import X.C21010yW;
import X.C24801Dv;
import X.C36331k8;
import X.C36341k9;
import X.C36361kB;
import X.C36381kD;
import X.C36391kE;
import X.C36421kH;
import X.C39001qm;
import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.whatsapp.R;

public final class DocumentWarningDialogFragment extends Hilt_DocumentWarningDialogFragment {
    public AnonymousClass0FM A00;
    public C24801Dv A01;
    public C19700wN A02;
    public AnonymousClass17Y A03;
    public AnonymousClass16D A04;
    public C20310xM A05;
    public AnonymousClass1TA A06;
    public C21010yW A07;
    public AnonymousClass1A1 A08;
    public C19770wU A09;

    public final AnonymousClass3T1 A1k(long j) {
        AnonymousClass1A1 r0 = this.A08;
        if (r0 != null) {
            return C36421kH.A0R(r0, j);
        }
        throw C36331k8.A0d("fMessageDatabase");
    }

    public Dialog A1a(Bundle bundle) {
        Window window;
        View A0K = C36381kD.A0K(A0c(), R.layout.f9nameremoved);
        AnonymousClass00C.A0B(A0K);
        C36391kE.A0O(A0K, R.id.dialog_message).setText(A0b().getInt("warning_id", R.string.f12nameremoved));
        boolean z = A0b().getBoolean("allowed_to_open");
        Resources A0G = C36341k9.A0G(this);
        int i = R.string.f12nameremoved;
        if (z) {
            i = R.string.f12nameremoved;
        }
        CharSequence text = A0G.getText(i);
        AnonymousClass00C.A0B(text);
        TextView A0O = C36391kE.A0O(A0K, R.id.open_button);
        A0O.setText(text);
        A0O.setOnClickListener(new AnonymousClass3YK(this, A0O, 4, z));
        boolean z2 = A0b().getBoolean("allowed_to_open");
        View A0G2 = C36361kB.A0G(A0K, R.id.cancel_button);
        if (z2) {
            AnonymousClass3Y9.A00(A0G2, this, 45);
        } else {
            A0G2.setVisibility(8);
        }
        C39001qm A042 = AnonymousClass3LW.A04(this);
        A042.A0j(A0K);
        AnonymousClass0FM create = A042.create();
        this.A00 = create;
        if (!(create == null || (window = create.getWindow()) == null)) {
            C36341k9.A0r(A0a(), window, R.color.f6nameremoved);
        }
        AnonymousClass0FM r0 = this.A00;
        AnonymousClass00C.A0B(r0);
        return r0;
    }
}
