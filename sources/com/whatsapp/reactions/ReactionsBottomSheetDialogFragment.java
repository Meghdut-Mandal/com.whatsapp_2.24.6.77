package com.whatsapp.reactions;

import X.AnonymousClass04H;
import X.AnonymousClass11F;
import X.AnonymousClass143;
import X.AnonymousClass147;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass17X;
import X.AnonymousClass17Y;
import X.AnonymousClass1A1;
import X.AnonymousClass1A3;
import X.AnonymousClass1LV;
import X.AnonymousClass1Pp;
import X.AnonymousClass1SV;
import X.AnonymousClass1X4;
import X.AnonymousClass1YC;
import X.AnonymousClass22A;
import X.AnonymousClass31C;
import X.AnonymousClass3UW;
import X.AnonymousClass3UX;
import X.AnonymousClass6DR;
import X.C012005e;
import X.C132986Wc;
import X.C138726ib;
import X.C16550pQ;
import X.C17690rq;
import X.C18820ts;
import X.C19730wQ;
import X.C19770wU;
import X.C19930wk;
import X.C220412q;
import X.C24801Dv;
import X.C27761Ps;
import X.C34831hi;
import X.C36341k9;
import X.C36381kD;
import X.C36401kF;
import X.C36411kG;
import X.C39871u3;
import X.C61923Ea;
import X.C63943Ma;
import X.C65533Sl;
import X.C65973Ue;
import X.C68183bT;
import X.C68293bf;
import X.C80313vC;
import X.C81143wX;
import X.C88944Uq;
import X.C93024fQ;
import android.app.Dialog;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;
import com.whatsapp.WaTabLayout;
import com.whatsapp.WaViewPager;

public class ReactionsBottomSheetDialogFragment extends Hilt_ReactionsBottomSheetDialogFragment implements C16550pQ {
    public C17690rq A00 = new C63943Ma(this, 2);
    public C24801Dv A01;
    public AnonymousClass17Y A02;
    public C19730wQ A03;
    public AnonymousClass1X4 A04;
    public WaTabLayout A05;
    public WaViewPager A06;
    public C88944Uq A07;
    public AnonymousClass1LV A08;
    public AnonymousClass1Pp A09;
    public AnonymousClass16D A0A;
    public AnonymousClass171 A0B;
    public C27761Ps A0C;
    public AnonymousClass31C A0D;
    public C18820ts A0E;
    public AnonymousClass1A3 A0F;
    public C220412q A0G;
    public AnonymousClass17X A0H;
    public AnonymousClass1YC A0I;
    public AnonymousClass11F A0J;
    public AnonymousClass22A A0K;
    public AnonymousClass1A1 A0L;
    public AnonymousClass1SV A0M;
    public C19770wU A0N;
    public boolean A0O;
    public C19930wk A0P;

    public static void A03(View view, ReactionsBottomSheetDialogFragment reactionsBottomSheetDialogFragment, int i) {
        AnonymousClass6DR A0L2 = reactionsBottomSheetDialogFragment.A05.A0L(i);
        if (A0L2 == null) {
            AnonymousClass6DR A082 = reactionsBottomSheetDialogFragment.A05.A08();
            A082.A01 = view;
            C93024fQ r0 = A082.A02;
            if (r0 != null) {
                r0.A06();
            }
            WaTabLayout waTabLayout = reactionsBottomSheetDialogFragment.A05;
            waTabLayout.A0I(A082, WaTabLayout.A00(waTabLayout, i, true), waTabLayout.A0h.isEmpty());
            return;
        }
        A0L2.A01 = null;
        C93024fQ r02 = A0L2.A02;
        if (r02 != null) {
            r02.A06();
        }
        A0L2.A01 = view;
        C93024fQ r03 = A0L2.A02;
        if (r03 != null) {
            r03.A06();
        }
    }

    public void A1S(Bundle bundle, View view) {
        AnonymousClass147 A012;
        View view2 = view;
        super.A1S(bundle, view2);
        C012005e.A02(view2, R.id.reactions_bottom_sheet_handle).setVisibility(C36381kD.A00(A1o() ? 1 : 0));
        if (A1o()) {
            view2.setBackground((Drawable) null);
        } else {
            Window window = A1Z().getWindow();
            if (window != null) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.dimAmount = 0.3f;
                window.setAttributes(attributes);
            }
        }
        C220412q r8 = this.A0G;
        AnonymousClass1A1 r10 = this.A0L;
        AnonymousClass1SV r11 = this.A0M;
        C39871u3 r12 = (C39871u3) new AnonymousClass04H(new C68183bT(this.A04, this.A07, r8, this.A0J, r10, r11, this.A0O), this).A00(C39871u3.class);
        this.A05 = (WaTabLayout) C012005e.A02(view2, R.id.reactions_bottom_sheet_tab_layout);
        this.A06 = (WaViewPager) C012005e.A02(view2, R.id.reactions_bottom_sheet_view_pager);
        C19930wk r13 = new C19930wk(this.A0N, false);
        this.A0P = r13;
        AnonymousClass17Y r5 = this.A02;
        C19730wQ r6 = this.A03;
        AnonymousClass1Pp r7 = this.A09;
        AnonymousClass16D r82 = this.A0A;
        AnonymousClass171 r9 = this.A0B;
        C18820ts r112 = this.A0E;
        AnonymousClass22A r2 = new AnonymousClass22A(A0a(), A0m(), r5, r6, r7, r82, r9, this.A0C, r112, r12, r13);
        this.A0K = r2;
        this.A06.setAdapter(r2);
        this.A06.A0L(C68293bf.A00, false);
        this.A06.A0K(new C138726ib(this.A05));
        this.A05.post(C81143wX.A00(this, 4));
        C34831hi r62 = r12.A06;
        AnonymousClass3UW.A00(A0m(), r62, r12, this, 32);
        LayoutInflater from = LayoutInflater.from(A1D());
        AnonymousClass3UW.A00(A0m(), r12.A03.A02, from, this, 31);
        for (C61923Ea r4 : C36401kF.A0w(r62)) {
            r4.A02.A08(A0m(), new AnonymousClass3UX(from, this, r4, 7));
        }
        C65973Ue.A01(A0m(), r62, this, 14);
        C65973Ue.A01(A0m(), r12.A07, this, 13);
        C65973Ue.A01(A0m(), r12.A08, this, 11);
        AnonymousClass11F r1 = this.A0J;
        if (AnonymousClass143.A0G(r1) && (A012 = C65533Sl.A01(r1)) != null && this.A0G.A05(A012) == 3) {
            C80313vC.A01(this.A0N, this, A012, 17);
        }
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C36411kG.A0J(layoutInflater, viewGroup, R.layout.f9nameremoved);
    }

    public Dialog A1a(Bundle bundle) {
        Dialog A1a = super.A1a(bundle);
        Window window = A1a.getWindow();
        if (window != null) {
            window.setFlags(C132986Wc.A0F, C132986Wc.A0F);
        }
        return A1a;
    }

    public void A1n(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = C36341k9.A0G(this).getDimensionPixelSize(R.dimen.f7nameremoved);
        view.setLayoutParams(layoutParams);
        BottomSheetBehavior A022 = BottomSheetBehavior.A02(view);
        A022.A0V(layoutParams.height);
        A022.A0W(3);
    }
}
