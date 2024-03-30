package com.whatsapp.settings;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass3LW;
import X.AnonymousClass3W3;
import X.AnonymousClass3WD;
import X.AnonymousClass4XP;
import X.C36341k9;
import X.C36431kI;
import X.C39001qm;
import X.C87264Oc;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.R;

public class MultiSelectionDialogFragment extends Hilt_MultiSelectionDialogFragment {
    public int A00;
    public C87264Oc A01;
    public boolean[] A02;
    public String A03;
    public String[] A04;

    public static MultiSelectionDialogFragment A03(boolean[] zArr, int i, int i2) {
        MultiSelectionDialogFragment multiSelectionDialogFragment = new MultiSelectionDialogFragment();
        Bundle A07 = AnonymousClass001.A07();
        A07.putInt("dialogId", i);
        A07.putInt("dialogTitleResId", i2);
        A07.putInt("itemsResId", R.array.f3nameremoved);
        A07.putBooleanArray("selectedItems", zArr);
        multiSelectionDialogFragment.A17(A07);
        return multiSelectionDialogFragment;
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        if (A0h() instanceof C87264Oc) {
            Bundle bundle2 = this.A0A;
            this.A00 = bundle2.getInt("dialogId");
            this.A03 = A0n(bundle2.getInt("dialogTitleResId"));
            this.A04 = C36341k9.A0G(this).getStringArray(bundle2.getInt("itemsResId"));
            this.A02 = bundle2.getBooleanArray("selectedItems");
            this.A01 = (C87264Oc) A0h();
            return;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Activity must implement ");
        throw AnonymousClass000.A0g(C87264Oc.class.getSimpleName(), A0u);
    }

    public Dialog A1a(Bundle bundle) {
        C39001qm A05 = AnonymousClass3LW.A05(this);
        A05.setTitle(this.A03);
        A05.A0X(new AnonymousClass3WD(this), this.A04, this.A02);
        A05.setPositiveButton(R.string.f12nameremoved, new AnonymousClass4XP(this, 36));
        return C36431kI.A0R(AnonymousClass3W3.A00, A05, R.string.f12nameremoved);
    }
}
