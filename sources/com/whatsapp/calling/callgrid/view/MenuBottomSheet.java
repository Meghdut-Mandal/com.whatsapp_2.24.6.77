package com.whatsapp.calling.callgrid.view;

import X.AnonymousClass000;
import X.C012005e;
import X.C165167sz;
import X.C16550pQ;
import X.C18740tg;
import X.C36341k9;
import X.C36361kB;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.calling.callgrid.viewmodel.MenuBottomSheetViewModel;
import com.whatsapp.jid.UserJid;

public class MenuBottomSheet extends Hilt_MenuBottomSheet implements C16550pQ {
    public int A00 = 0;
    public LinearLayout A01;
    public MenuBottomSheetViewModel A02;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
    }

    public void A1S(Bundle bundle, View view) {
        super.A1S(bundle, view);
        LinearLayout linearLayout = (LinearLayout) view;
        this.A01 = linearLayout;
        C36361kB.A17(C012005e.A02(linearLayout, R.id.close), this, 35);
        MenuBottomSheetViewModel menuBottomSheetViewModel = this.A02;
        if (menuBottomSheetViewModel != null) {
            C165167sz.A00(A0m(), menuBottomSheetViewModel.A04, this, 35);
        }
    }

    public int A1Y() {
        return R.style.f13nameremoved;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        MenuBottomSheetViewModel menuBottomSheetViewModel = this.A02;
        if (menuBottomSheetViewModel != null) {
            int i = this.A00;
            if (i == 6 || i == 7 || i == 8) {
                C18740tg.A0D(AnonymousClass000.A1V(menuBottomSheetViewModel.A01), "MenuBottomSheetViewModel/onCallLinkShareOptionSelected/ callLinkData is null");
                menuBottomSheetViewModel.A0B.A0D(C36341k9.A0I(menuBottomSheetViewModel.A01, i));
                return;
            }
            UserJid userJid = menuBottomSheetViewModel.A02;
            if (userJid != null || i == 0) {
                menuBottomSheetViewModel.A0C.A0D(C36341k9.A0I(userJid, i));
            }
        }
    }
}
