package com.whatsapp.pininchat.expirationDialog;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass3LW;
import X.AnonymousClass3PQ;
import X.AnonymousClass3T1;
import X.AnonymousClass3UY;
import X.AnonymousClass4MF;
import X.AnonymousClass4XE;
import X.C1264564b;
import X.C1497372o;
import X.C18800tq;
import X.C19970wo;
import X.C20810yC;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36411kG;
import X.C36431kI;
import X.C36441kJ;
import X.C39001qm;
import X.C39991uS;
import X.C52612ps;
import X.C58312zf;
import X.C64933Qa;
import X.C65993Ug;
import X.C68003bB;
import X.C84344Cw;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.whatsapp.R;
import java.util.ArrayList;

public final class PinInChatExpirationDialogFragment extends Hilt_PinInChatExpirationDialogFragment {
    public C58312zf A00;
    public C39991uS A01;
    public AnonymousClass3T1 A02;
    public final AnonymousClass00T A03 = C36431kI.A1I(new C84344Cw(this));

    public Dialog A1a(Bundle bundle) {
        C58312zf r1 = this.A00;
        if (r1 != null) {
            C64933Qa r8 = (C64933Qa) this.A03.getValue();
            AnonymousClass00C.A08(r8);
            AnonymousClass3T1 r7 = this.A02;
            C18800tq r12 = r1.A00.A02;
            C19970wo A0V = C36351kA.A0V(r12);
            C20810yC A0V2 = C36341k9.A0V(r12);
            this.A01 = new C39991uS(C36351kA.A0M(r12), A0V, A0V2, (C1264564b) r12.A6X.get(), (AnonymousClass3PQ) r12.A6W.get(), r7, r8, C36351kA.A0n(r12), C36341k9.A0Z(r12));
            C39001qm A04 = AnonymousClass3LW.A04(this);
            A04.A0d(R.string.f12nameremoved);
            C39001qm.A05(this, A04, 33, R.string.f12nameremoved);
            A04.A0l(this, C68003bB.A00, R.string.f12nameremoved);
            View A0J = C36371kC.A0J(C36381kD.A0J(this), (ViewGroup) null, R.layout.f9nameremoved, false);
            AnonymousClass3T1 r13 = this.A02;
            C39991uS r0 = this.A01;
            if (r13 != null) {
                if (r0 == null) {
                    throw C36331k8.A0d("viewModel");
                } else if (r0.A0S(r13)) {
                    C36411kG.A1L(C36341k9.A0X(A0J, R.id.pin_messages_ephemeral_message_disclaimer_view_stub), 0);
                }
            } else if (r0 == null) {
                throw C36331k8.A0d("viewModel");
            } else {
                C65993Ug.A00(this, r0.A06, new AnonymousClass4MF(A0J, this), 34);
                C39991uS r3 = this.A01;
                if (r3 == null) {
                    throw C36331k8.A0d("viewModel");
                }
                r3.A07.Boy(new C1497372o(r3, 19));
            }
            RadioGroup radioGroup = (RadioGroup) C36361kB.A0G(A0J, R.id.expiration_options_radio_group);
            int A05 = C36441kJ.A05(C36341k9.A0G(this), R.dimen.f7nameremoved);
            int A052 = C36441kJ.A05(C36341k9.A0G(this), R.dimen.f7nameremoved);
            if (this.A01 == null) {
                throw C36331k8.A0d("viewModel");
            }
            C52612ps[] values = C52612ps.values();
            ArrayList<C52612ps> A0I = AnonymousClass001.A0I();
            for (C52612ps r14 : values) {
                if (!r14.debugMenuOnlyField) {
                    A0I.add(r14);
                }
            }
            for (C52612ps r2 : A0I) {
                RadioButton radioButton = new RadioButton(A1D());
                radioGroup.addView(radioButton);
                radioButton.setTag(r2.name());
                String A032 = AnonymousClass3UY.A03(this.A01, r2.durationInDisplayUnit, r2.displayUnit);
                if (r2.debugMenuOnlyField) {
                    A032 = AnonymousClass000.A0q(" [Internal Only]", AnonymousClass000.A0v(A032));
                }
                radioButton.setText(A032);
                C39991uS r02 = this.A01;
                if (r02 == null) {
                    throw C36331k8.A0d("viewModel");
                }
                radioButton.setChecked(C36361kB.A1a(r2, r02.A00));
                RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-1, -2);
                layoutParams.setMargins(0, A05, 0, A05);
                radioButton.setLayoutParams(layoutParams);
                radioButton.setPaddingRelative(A052, 0, 0, 0);
            }
            radioGroup.setOnCheckedChangeListener(new AnonymousClass4XE(this, radioGroup, 3));
            A04.setView(A0J);
            return C36371kC.A0O(A04);
        }
        throw C36331k8.A0d("viewModelFactory");
    }
}
