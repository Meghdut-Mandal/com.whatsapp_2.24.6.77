package com.whatsapp.expressionstray.conversation;

import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass00F;
import X.AnonymousClass00T;
import X.AnonymousClass01z;
import X.AnonymousClass0A2;
import X.AnonymousClass11F;
import X.AnonymousClass190;
import X.AnonymousClass1BF;
import X.AnonymousClass1N2;
import X.AnonymousClass3NG;
import X.AnonymousClass3Y1;
import X.AnonymousClass55M;
import X.AnonymousClass6O1;
import X.AnonymousClass7LS;
import X.AnonymousClass7LT;
import X.AnonymousClass7LU;
import X.AnonymousClass7LV;
import X.AnonymousClass7gY;
import X.AnonymousClass7gZ;
import X.C000800j;
import X.C001400p;
import X.C008903u;
import X.C012005e;
import X.C019308f;
import X.C023109s;
import X.C023509x;
import X.C109325Xd;
import X.C119575q5;
import X.C12560iI;
import X.C136186du;
import X.C154427Sd;
import X.C162917pM;
import X.C163247pt;
import X.C163447qD;
import X.C163637qW;
import X.C165177t0;
import X.C18820ts;
import X.C20810yC;
import X.C33311f5;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C36441kJ;
import X.C85064Fq;
import X.C85074Fr;
import X.C87794Qe;
import X.C88234Rx;
import X.C90514aH;
import X.C95314kY;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ViewFlipper;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.expressionstray.ExpressionsSearchViewModel;
import com.whatsapp.expressionstray.ExpressionsSearchViewModel$onDismiss$1;
import com.whatsapp.expressionstray.ExpressionsSearchViewModel$onTabsUpdated$1;

public final class ExpressionsKeyboardSearchBottomSheet extends Hilt_ExpressionsKeyboardSearchBottomSheet {
    public View A00;
    public View A01;
    public ViewGroup A02;
    public ImageView A03;
    public ViewFlipper A04;
    public ViewPager A05;
    public MaterialButton A06;
    public MaterialButton A07;
    public MaterialButton A08;
    public MaterialButton A09;
    public MaterialButtonToggleGroup A0A;
    public WaEditText A0B;
    public C18820ts A0C;
    public AnonymousClass6O1 A0D;
    public AnonymousClass7gY A0E;
    public AnonymousClass7gZ A0F;
    public C119575q5 A0G;
    public C95314kY A0H;
    public C20810yC A0I;
    public C87794Qe A0J;
    public AnonymousClass190 A0K;
    public AnonymousClass11F A0L;
    public AnonymousClass1BF A0M;
    public C88234Rx A0N;
    public AnonymousClass1N2 A0O;
    public AnonymousClass005 A0P;
    public String A0Q;
    public boolean A0R;
    public final AnonymousClass00T A0S;
    public final AnonymousClass00T A0T;
    public final int A0U = R.layout.f9nameremoved;

    public void A1S(Bundle bundle, View view) {
        String str;
        Bundle bundle2;
        String string;
        ViewFlipper viewFlipper;
        ImageView imageView;
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        this.A02 = C36411kG.A0O(view, R.id.expressions_view_root);
        this.A04 = (ViewFlipper) C012005e.A02(view, R.id.flipper);
        this.A00 = C012005e.A02(view, R.id.browser_view);
        this.A05 = (ViewPager) C012005e.A02(view, R.id.browser_content);
        this.A03 = C36401kF.A0G(view, R.id.back);
        this.A01 = C012005e.A02(view, R.id.clear_search_btn);
        this.A0B = (WaEditText) C012005e.A02(view, R.id.search_bar);
        this.A0A = (MaterialButtonToggleGroup) C012005e.A02(view, R.id.browser_tabs);
        this.A07 = (MaterialButton) C012005e.A02(view, R.id.emojis);
        this.A06 = (MaterialButton) C012005e.A02(view, R.id.avatar_stickers);
        this.A08 = (MaterialButton) C012005e.A02(view, R.id.gifs);
        this.A09 = (MaterialButton) C012005e.A02(view, R.id.stickers);
        AnonymousClass11F r0 = this.A0L;
        C95314kY r4 = null;
        if (r0 != null) {
            str = r0.getRawString();
        } else {
            str = null;
        }
        AnonymousClass01z A0k = A0k();
        AnonymousClass00T r2 = this.A0T;
        int A022 = C36331k8.A02(r2);
        AnonymousClass00C.A0B(A0k);
        this.A0H = new C95314kY(A0k, str, A022, true, true);
        ViewPager viewPager = this.A05;
        if (viewPager != null) {
            C18820ts r02 = this.A0C;
            if (r02 != null) {
                viewPager.setLayoutDirection(C36401kF.A1X(r02) ? 1 : 0);
                C95314kY r1 = this.A0H;
                if (r1 != null) {
                    viewPager.setOffscreenPageLimit(r1.A04.size());
                    r4 = r1;
                }
                viewPager.setAdapter(r4);
                viewPager.A0K(new C163637qW(this, 1));
            } else {
                throw C36321k7.A09();
            }
        }
        Context A1D = A1D();
        if (!(A1D == null || (imageView = this.A03) == null)) {
            C18820ts r12 = this.A0C;
            if (r12 != null) {
                C36321k7.A0L(A1D, imageView, r12, R.drawable.ic_back);
            } else {
                throw C36321k7.A09();
            }
        }
        if (C36331k8.A02(r2) == 7 && (viewFlipper = this.A04) != null) {
            C36391kE.A1C(C36341k9.A0G(this), viewFlipper, R.color.f6nameremoved);
        }
        AnonymousClass00T r5 = this.A0S;
        C165177t0.A00(A0m(), ((ExpressionsSearchViewModel) r5.getValue()).A07, new C154427Sd(this), 14);
        LifecycleCoroutineScopeImpl A002 = C33311f5.A00(this);
        ExpressionsKeyboardSearchBottomSheet$observeExpressionsSideEffects$1 expressionsKeyboardSearchBottomSheet$observeExpressionsSideEffects$1 = new ExpressionsKeyboardSearchBottomSheet$observeExpressionsSideEffects$1(this, (C023509x) null);
        C008903u r42 = C008903u.A00;
        Integer num = C023109s.A00;
        AnonymousClass0A2.A02(num, r42, expressionsKeyboardSearchBottomSheet$observeExpressionsSideEffects$1, A002);
        WaEditText waEditText = this.A0B;
        if (waEditText != null) {
            waEditText.addTextChangedListener(new C162917pM(this, 1));
            waEditText.setOnFocusChangeListener(new C163247pt(waEditText, this, 0));
            waEditText.setOnEditorActionListener(new C136186du(waEditText, this));
        }
        MaterialButtonToggleGroup materialButtonToggleGroup = this.A0A;
        if (materialButtonToggleGroup != null) {
            materialButtonToggleGroup.A06.add(new C163447qD(this, 2));
        }
        View view2 = this.A01;
        if (view2 != null) {
            AnonymousClass3Y1.A00(view2, this, 25);
        }
        ImageView imageView2 = this.A03;
        if (imageView2 != null) {
            AnonymousClass3Y1.A00(imageView2, this, 24);
        }
        MaterialButton materialButton = this.A07;
        String str2 = null;
        if (materialButton != null) {
            Context A1D2 = A1D();
            String str3 = null;
            if (A1D2 != null) {
                str3 = A1D2.getString(R.string.f12nameremoved);
            }
            materialButton.setContentDescription(str3);
        }
        MaterialButton materialButton2 = this.A08;
        if (materialButton2 != null) {
            Context A1D3 = A1D();
            String str4 = null;
            if (A1D3 != null) {
                str4 = A1D3.getString(R.string.f12nameremoved);
            }
            materialButton2.setContentDescription(str4);
        }
        MaterialButton materialButton3 = this.A06;
        if (materialButton3 != null) {
            Context A1D4 = A1D();
            String str5 = null;
            if (A1D4 != null) {
                str5 = A1D4.getString(R.string.f12nameremoved);
            }
            materialButton3.setContentDescription(str5);
        }
        MaterialButton materialButton4 = this.A09;
        if (materialButton4 != null) {
            Context A1D5 = A1D();
            if (A1D5 != null) {
                str2 = A1D5.getString(R.string.f12nameremoved);
            }
            materialButton4.setContentDescription(str2);
        }
        ExpressionsSearchViewModel expressionsSearchViewModel = (ExpressionsSearchViewModel) r5.getValue();
        AnonymousClass0A2.A02(num, r42, new ExpressionsSearchViewModel$onTabsUpdated$1(expressionsSearchViewModel, (C023509x) null, C36331k8.A02(r2)), C109325Xd.A00(expressionsSearchViewModel));
        C20810yC r13 = this.A0I;
        if (r13 == null) {
            throw C36321k7.A07();
        } else if (r13.A0E(3403) && C36331k8.A02(r2) == 8 && (bundle2 = this.A0A) != null && (string = bundle2.getString("contextual_suggestion_query")) != null) {
            this.A0R = true;
            WaEditText waEditText2 = this.A0B;
            if (waEditText2 != null) {
                waEditText2.setText(string);
            }
        }
    }

    public void A1k(AnonymousClass3NG r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.A00.A06 = false;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        AnonymousClass00C.A0D(dialogInterface, 0);
        WaEditText waEditText = this.A0B;
        if (waEditText != null) {
            waEditText.A0B();
            waEditText.clearFocus();
        }
        AnonymousClass7gY r0 = this.A0E;
        if (r0 != null) {
            r0.BXD();
        }
        ExpressionsSearchViewModel A0b = C90514aH.A0b(this);
        C36331k8.A1T(new ExpressionsSearchViewModel$onDismiss$1(A0b, (C023509x) null), C109325Xd.A00(A0b));
        super.onDismiss(dialogInterface);
    }

    public static final void A03(Bitmap bitmap, ExpressionsKeyboardSearchBottomSheet expressionsKeyboardSearchBottomSheet, C119575q5 r4) {
        MaterialButton materialButton;
        if (bitmap != null) {
            MaterialButton materialButton2 = expressionsKeyboardSearchBottomSheet.A06;
            if (materialButton2 != null) {
                materialButton2.setIconTint((ColorStateList) null);
            }
            MaterialButton materialButton3 = expressionsKeyboardSearchBottomSheet.A06;
            if (materialButton3 != null) {
                materialButton3.setIcon(new BitmapDrawable(materialButton3.getResources(), bitmap));
                if (!AnonymousClass00C.A0J(r4, AnonymousClass55M.A00)) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(0.0f);
                    materialButton3.A01.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                    return;
                }
                materialButton3.A01.clearColorFilter();
                return;
            }
            return;
        }
        Context A1D = expressionsKeyboardSearchBottomSheet.A1D();
        if (A1D != null && (materialButton = expressionsKeyboardSearchBottomSheet.A06) != null) {
            materialButton.setIconTint(AnonymousClass00F.A04(A1D, R.drawable.expression_tab_icon_color_selector));
            materialButton.setIconResource(R.drawable.ic_avatar_tray_normal);
        }
    }

    public ExpressionsKeyboardSearchBottomSheet() {
        AnonymousClass7LT r1 = new AnonymousClass7LT(this);
        C000800j r6 = C000800j.NONE;
        AnonymousClass00T A002 = C001400p.A00(r6, new AnonymousClass7LU(r1));
        C019308f A1A = C36441kJ.A1A(ExpressionsSearchViewModel.class);
        this.A0S = new C12560iI(new AnonymousClass7LV(A002), new C85074Fr(this, A002), new C85064Fq(A002), A1A);
        this.A0T = C001400p.A00(r6, new AnonymousClass7LS(this));
    }

    public void A1H() {
        super.A1H();
        this.A0J = null;
        this.A0N = null;
        this.A0E = null;
        this.A0H = null;
        this.A0F = null;
    }

    public int A1i() {
        return this.A0U;
    }
}
