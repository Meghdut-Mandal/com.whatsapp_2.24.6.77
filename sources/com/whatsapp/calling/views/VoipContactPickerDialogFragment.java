package com.whatsapp.calling.views;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass00F;
import X.AnonymousClass09Y;
import X.AnonymousClass143;
import X.AnonymousClass1RC;
import X.AnonymousClass3JX;
import X.AnonymousClass3UE;
import X.AnonymousClass3XL;
import X.AnonymousClass4ZV;
import X.C105545Fb;
import X.C165307tD;
import X.C19550w8;
import X.C224514j;
import X.C36361kB;
import X.C36411kG;
import X.C36431kI;
import X.C585930h;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.whatsapp.R;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.contact.picker.VoipContactPickerFragment;

public class VoipContactPickerDialogFragment extends Hilt_VoipContactPickerDialogFragment {
    public C105545Fb A00;
    public C585930h A01;
    public final ContactPickerFragment A02 = new VoipContactPickerFragment();
    public final AnonymousClass005 A03 = C36431kI.A0x(new C165307tD(this, 2));

    public void A1S(Bundle bundle, View view) {
        Dialog dialog;
        if (this.A02.A0E(5411) && (dialog = this.A02) != null) {
            dialog.getWindow().setSoftInputMode(16);
        }
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0E = C36361kB.A0E(LayoutInflater.from(A0h()), viewGroup, R.layout.f9nameremoved);
        AnonymousClass3JX r5 = (AnonymousClass3JX) this.A03.get();
        Bundle A07 = AnonymousClass001.A07();
        A07.putBoolean("for_group_call", true);
        A07.putStringArrayList("contacts_to_exclude", AnonymousClass143.A07(r5.A02));
        AnonymousClass3XL A04 = AnonymousClass3UE.A04(A0a(), r5.A01, r5.A03);
        if (A04 != null) {
            A07.putParcelable("share_sheet_data", A04);
        }
        Integer num = r5.A00;
        if (num != null) {
            A07.putBoolean("use_custom_multiselect_limit", true);
            A07.putInt("custom_multiselect_limit", num.intValue());
        }
        ContactPickerFragment contactPickerFragment = this.A02;
        Bundle A072 = AnonymousClass001.A07();
        A072.putBundle("extras", A07);
        contactPickerFragment.A17(A072);
        AnonymousClass09Y A0S = C36411kG.A0S(this);
        A0S.A0A(contactPickerFragment, R.id.fragment_container);
        A0S.A04();
        return A0E;
    }

    public void A1L() {
        super.A1L();
        Dialog dialog = this.A02;
        if (dialog != null) {
            dialog.setOnKeyListener(new AnonymousClass4ZV(this, 1));
        }
    }

    public void A1M() {
        int i;
        super.A1M();
        Dialog dialog = this.A02;
        if (dialog != null && dialog.getWindow() != null) {
            Window window = this.A02.getWindow();
            if (!C19550w8.A04() || !this.A02.A0E(5411)) {
                if (((AnonymousClass3JX) this.A03.get()).A03) {
                    i = C224514j.A00(window.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved);
                } else {
                    i = R.color.f6nameremoved;
                }
                window.setNavigationBarColor(AnonymousClass00F.A00(window.getContext(), i));
                return;
            }
            AnonymousClass1RC.A08(window, C224514j.A00(window.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved), 1);
        }
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        A1d(0, R.style.f13nameremoved);
    }
}
