package com.whatsapp.languageselector;

import X.AnonymousClass001;
import X.AnonymousClass02E;
import X.AnonymousClass0Q4;
import X.AnonymousClass359;
import X.AnonymousClass4TI;
import X.AnonymousClass4YC;
import X.AnonymousClass4ZQ;
import X.C011004s;
import X.C012005e;
import X.C16550pQ;
import X.C18820ts;
import X.C19730wQ;
import X.C21060yb;
import X.C36321k7;
import X.C36341k9;
import X.C36381kD;
import X.C36391kE;
import X.C36431kI;
import X.C37851nJ;
import X.C48752hz;
import X.C67283Zf;
import X.C87964Qw;
import X.C87974Qx;
import X.C87984Qy;
import X.C89184Vo;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Point;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.BottomSheetListView;
import com.whatsapp.R;
import com.whatsapp.wds.components.button.WDSButton;

public class LanguageSelectorBottomSheet extends Hilt_LanguageSelectorBottomSheet implements C16550pQ {
    public BottomSheetListView A00;
    public C19730wQ A01;
    public C21060yb A02;
    public C18820ts A03;
    public C87974Qx A04;
    public C87984Qy A05;
    public AnonymousClass4TI A06;
    public AnonymousClass359 A07;

    public static LanguageSelectorBottomSheet A03() {
        LanguageSelectorBottomSheet languageSelectorBottomSheet = new LanguageSelectorBottomSheet();
        Bundle A072 = AnonymousClass001.A07();
        A072.putInt("HEADER_TEXT_KEY", R.string.f12nameremoved);
        A072.putBoolean("SHOW_CONTINUE_CTA", true);
        A072.putInt("CONTINUE_CTA_GLYPH", R.drawable.ic_link_action);
        languageSelectorBottomSheet.A17(A072);
        return languageSelectorBottomSheet;
    }

    public void A19() {
        super.A19();
        AnonymousClass4TI r0 = this.A06;
        if (r0 != null) {
            r0.BZY();
        }
        this.A05 = null;
        this.A06 = null;
        this.A04 = null;
        this.A07 = null;
    }

    public void A1B() {
        super.A1B();
        AnonymousClass4TI r0 = this.A06;
        if (r0 != null) {
            r0.BZY();
        }
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C48752hz r0;
        Object A0i;
        View inflate = layoutInflater.inflate(R.layout.f9nameremoved, viewGroup);
        int i = 8;
        C012005e.A02(inflate, R.id.topHandle).setVisibility(C36381kD.A00(A1o() ? 1 : 0));
        C48752hz.A00(C012005e.A02(inflate, R.id.closeButton), this, 20);
        Bundle bundle2 = this.A0A;
        if (bundle2 == null) {
            bundle2 = AnonymousClass001.A07();
        }
        C36391kE.A0O(inflate, R.id.appLanguageText).setText(bundle2.getInt("HEADER_TEXT_KEY", R.string.f12nameremoved));
        this.A00 = (BottomSheetListView) C012005e.A02(inflate, R.id.languageSelectorListView);
        WDSButton A0y = C36431kI.A0y(inflate, R.id.continue_cta);
        Bundle bundle3 = this.A0A;
        if (bundle3 == null) {
            bundle3 = AnonymousClass001.A07();
        }
        if (bundle3.getBoolean("SHOW_CONTINUE_CTA", false)) {
            i = 0;
        }
        Bundle bundle4 = this.A0A;
        if (bundle4 == null) {
            bundle4 = AnonymousClass001.A07();
        }
        A0y.setIcon(bundle4.getInt("CONTINUE_CTA_GLYPH", 0));
        A0y.setVisibility(i);
        if (i == 0) {
            r0 = new C48752hz(this, 21);
        } else {
            r0 = null;
        }
        A0y.setOnClickListener(r0);
        AnonymousClass02E r02 = this.A0I;
        if (r02 == null || !(r02 instanceof C87964Qw)) {
            if (A0i() instanceof C87964Qw) {
                A0i = A0i();
            }
            return inflate;
        }
        A0i = A0f();
        C37851nJ B8G = ((C87964Qw) A0i).B8G();
        this.A00.setAdapter(B8G);
        this.A00.setOnItemClickListener(new AnonymousClass4YC(B8G, this, 2));
        BottomSheetListView bottomSheetListView = this.A00;
        bottomSheetListView.setOnScrollListener(new C67283Zf(C012005e.A02(inflate, R.id.divider), bottomSheetListView, this, C36341k9.A0G(this).getDimensionPixelSize(R.dimen.f7nameremoved)));
        return inflate;
    }

    public void A1M() {
        Dialog dialog;
        Window window;
        super.A1M();
        AnonymousClass4TI r0 = this.A06;
        if (r0 != null) {
            r0.BZa();
        }
        if (!A1o() && (dialog = this.A02) != null && (window = dialog.getWindow()) != null) {
            AnonymousClass0Q4.A00(window, false);
            dialog.findViewById(R.id.container).setFitsSystemWindows(false);
            dialog.findViewById(R.id.coordinator).setFitsSystemWindows(false);
            C011004s.A07(dialog.findViewById(R.id.container), new AnonymousClass4ZQ(this, 1));
        }
    }

    public int A1Y() {
        return R.style.f13nameremoved;
    }

    public void A1n(View view) {
        BottomSheetBehavior A022 = BottomSheetBehavior.A02(view);
        if (!A1o()) {
            A022.A0a(new C89184Vo(A022, this, 0));
        } else {
            A022.A0h = true;
        }
        Point point = new Point();
        C36321k7.A0K(A0i(), point);
        A022.A0V((int) (C36341k9.A0G(this).getFraction(R.fraction.language_selector_bottom_sheet_peek_height, 1, 1) * ((float) point.y)));
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        C87984Qy r0 = this.A05;
        if (r0 != null) {
            r0.BZZ();
        }
        AnonymousClass4TI r02 = this.A06;
        if (r02 != null) {
            r02.BZY();
        }
    }
}
