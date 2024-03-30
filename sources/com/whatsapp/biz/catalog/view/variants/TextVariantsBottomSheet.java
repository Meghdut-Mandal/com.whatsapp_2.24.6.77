package com.whatsapp.biz.catalog.view.variants;

import X.AnonymousClass00C;
import X.AnonymousClass0XL;
import X.AnonymousClass5X0;
import X.AnonymousClass7U3;
import X.C02460Ak;
import X.C109885Zm;
import X.C115935jg;
import X.C1255260f;
import X.C134606bJ;
import X.C134746bX;
import X.C165127sv;
import X.C165147sx;
import X.C18820ts;
import X.C19550w8;
import X.C36331k8;
import X.C36341k9;
import X.C36391kE;
import X.C36401kF;
import X.C36421kH;
import X.C36441kJ;
import X.C90504aG;
import X.C95444ky;
import X.C95994mc;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;

public final class TextVariantsBottomSheet extends Hilt_TextVariantsBottomSheet {
    public RecyclerView A00;
    public C115935jg A01;
    public C1255260f A02;
    public C18820ts A03;
    public C95444ky A04;

    public void A1S(Bundle bundle, View view) {
        Parcelable parcelable;
        String str;
        Parcelable parcelable2;
        Bundle bundle2;
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        ImageView A0G = C36401kF.A0G(view, R.id.text_variants_selection_dismiss);
        Bundle bundle3 = this.A0A;
        if (bundle3 == null || !bundle3.getBoolean("USE_BACK_ARROW_FOR_CLOSE_ARG")) {
            A0G.setImageResource(R.drawable.ic_close);
            C36421kH.A0z(A0G, this, R.string.f12nameremoved);
        } else {
            A0G.setImageResource(R.drawable.ic_back);
            C36421kH.A0z(A0G, this, R.string.f12nameremoved);
            C18820ts r0 = this.A03;
            if (r0 != null && C36401kF.A1X(r0)) {
                A0G.setScaleX(-1.0f);
            }
        }
        C36421kH.A10(A0G, this, 44);
        boolean A09 = C19550w8.A09();
        C95994mc r6 = null;
        Bundle bundle4 = this.A0A;
        if (A09) {
            if (bundle4 != null) {
                parcelable = (Parcelable) bundle4.getParcelable("TEXT_OPTIONS_DATA", C134746bX.class);
            }
            parcelable = null;
        } else {
            if (bundle4 != null) {
                parcelable = bundle4.getParcelable("TEXT_OPTIONS_DATA");
            }
            parcelable = null;
        }
        C134746bX r10 = (C134746bX) parcelable;
        TextView A0O = C36391kE.A0O(view, R.id.variants_screen_title);
        Object[] objArr = new Object[1];
        if (r10 != null) {
            str = r10.A00;
        } else {
            str = "";
        }
        A0O.setText(C36401kF.A0q(this, str, objArr, 0, R.string.f12nameremoved));
        C95444ky r02 = this.A04;
        if (r02 == null) {
            throw C36331k8.A0d("viewModel");
        }
        Number A0z = C36441kJ.A0z(r02.A00);
        if (A0z == null && ((bundle2 = this.A0A) == null || (A0z = Integer.valueOf(bundle2.getInt("START_WITH_SELECTION_ARG"))) == null)) {
            A0z = 0;
        }
        int intValue = A0z.intValue();
        boolean A092 = C19550w8.A09();
        Bundle bundle5 = this.A0A;
        if (A092) {
            if (bundle5 != null) {
                parcelable2 = (Parcelable) bundle5.getParcelable("OTHER_OPTION_SELECTED_ARG", C134606bJ.class);
            }
            parcelable2 = null;
        } else {
            if (bundle5 != null) {
                parcelable2 = bundle5.getParcelable("OTHER_OPTION_SELECTED_ARG");
            }
            parcelable2 = null;
        }
        C134606bJ r7 = (C134606bJ) parcelable2;
        RecyclerView A0J = C90504aG.A0J(view, R.id.text_variants_list);
        if (!(r10 == null || this.A01 == null)) {
            C95444ky r1 = this.A04;
            if (r1 == null) {
                throw C36331k8.A0d("viewModel");
            }
            r6 = new C95994mc(r7, new C109885Zm(), new C165127sv(r1, 0), r10, intValue);
        }
        A0J.setAdapter(r6);
        this.A00 = A0J;
        View view2 = view;
        while (true) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams instanceof C02460Ak) {
                AnonymousClass0XL r3 = ((C02460Ak) layoutParams).A0B;
                if (r3 instanceof BottomSheetBehavior) {
                    ((BottomSheetBehavior) r3).A0D = C36341k9.A0G(this).getDisplayMetrics().heightPixels - C36341k9.A0G(this).getDimensionPixelSize(R.dimen.f7nameremoved);
                    break;
                }
            }
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                view2 = (View) parent;
                if (view2 == null) {
                    break;
                }
            } else {
                break;
            }
        }
        C95444ky r03 = this.A04;
        if (r03 == null) {
            throw C36331k8.A0d("viewModel");
        }
        C165147sx.A02(A0m(), r03.A00, AnonymousClass5X0.A02(this, 2), 35);
        C95444ky r04 = this.A04;
        if (r04 == null) {
            throw C36331k8.A0d("viewModel");
        }
        C165147sx.A02(A0m(), r04.A02, new AnonymousClass7U3(view, this), 34);
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        this.A04 = (C95444ky) C36441kJ.A0b(this).A00(C95444ky.class);
    }
}
