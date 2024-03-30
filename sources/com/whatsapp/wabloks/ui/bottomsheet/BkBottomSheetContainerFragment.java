package com.whatsapp.wabloks.ui.bottomsheet;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass00I;
import X.AnonymousClass02E;
import X.AnonymousClass09Y;
import X.AnonymousClass6JY;
import X.AnonymousClass6MP;
import X.C142326oh;
import X.C158077fl;
import X.C18860tw;
import X.C36341k9;
import X.C36361kB;
import X.C36411kG;
import X.C90514aH;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.wabloks.ui.WaBloksActivity;
import java.util.Stack;

public class BkBottomSheetContainerFragment extends Hilt_BkBottomSheetContainerFragment {
    public LinearLayout A00;
    public AnonymousClass00I A01;
    public C158077fl A02;
    public AnonymousClass005 A03;

    public static BkBottomSheetContainerFragment A03(boolean z) {
        BkBottomSheetContainerFragment bkBottomSheetContainerFragment = new BkBottomSheetContainerFragment();
        Bundle A07 = AnonymousClass001.A07();
        A07.putBoolean("restore_saved_instance", z);
        bkBottomSheetContainerFragment.A17(A07);
        return bkBottomSheetContainerFragment;
    }

    public void A1R(Bundle bundle) {
        Bundle bundle2 = this.A0A;
        if (bundle2 == null || !bundle2.getBoolean("restore_saved_instance", false)) {
            AnonymousClass09Y A0O = C36341k9.A0O(A0i());
            A0O.A08(this);
            A0O.A00(true);
        }
        super.A1R(bundle);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.A02 != null) {
            WaBloksActivity waBloksActivity = (WaBloksActivity) A0i();
            C158077fl r1 = this.A02;
            if (!(r1 == null || r1.B7y() == null)) {
                C142326oh.A0B(waBloksActivity.A01, r1);
            }
        }
        ((AnonymousClass6MP) this.A03.get()).A00(C18860tw.A00(A1D()));
        Stack stack = AnonymousClass6JY.A01;
        if (!stack.isEmpty()) {
            stack.pop();
        }
        super.onDismiss(dialogInterface);
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object obj;
        Object obj2;
        View A0E = C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
        this.A00 = C90514aH.A0U(A0E, R.id.wa_bloks_bottom_sheet_fragment_container);
        AnonymousClass00I r0 = this.A01;
        if (!(r0 == null || (obj = r0.A00) == null || (obj2 = r0.A01) == null)) {
            AnonymousClass09Y A0S = C36411kG.A0S(this);
            A0S.A0F((AnonymousClass02E) obj, (String) obj2, this.A00.getId());
            A0S.A00(false);
        }
        return A0E;
    }
}
