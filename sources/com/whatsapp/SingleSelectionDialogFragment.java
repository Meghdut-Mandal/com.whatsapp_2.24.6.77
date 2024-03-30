package com.whatsapp;

import X.AnonymousClass001;
import X.AnonymousClass01I;
import X.AnonymousClass15P;
import X.AnonymousClass3LW;
import X.AnonymousClass4XL;
import X.C36341k9;
import X.C36371kC;
import X.C39001qm;
import android.app.Dialog;
import android.os.Bundle;
import androidx.appcompat.app.AlertDialog$Builder;

public class SingleSelectionDialogFragment extends Hilt_SingleSelectionDialogFragment {
    public int A00;
    public boolean A01;
    public int A02;
    public int A03;
    public int A04;
    public String A05;
    public CharSequence[] A06;
    public String[] A07;

    public static SingleSelectionDialogFragment A06(int i, int i2, int i3, int i4) {
        SingleSelectionDialogFragment singleSelectionDialogFragment = new SingleSelectionDialogFragment();
        Bundle A0G = C36371kC.A0G(i, i3, i2);
        A0G.putInt("itemsArrayResId", i4);
        singleSelectionDialogFragment.A17(A0G);
        return singleSelectionDialogFragment;
    }

    public AlertDialog$Builder A1k() {
        C39001qm A012;
        CharSequence[] charSequenceArr = this.A06;
        AnonymousClass01I A0i = A0i();
        if (charSequenceArr == null) {
            A012 = AnonymousClass3LW.A00(A0i);
        } else {
            A012 = AnonymousClass3LW.A01(A0i, R.style.f13nameremoved);
        }
        A012.setTitle(this.A05);
        int i = this.A02;
        this.A00 = i;
        CharSequence[] charSequenceArr2 = this.A06;
        if (charSequenceArr2 == null) {
            charSequenceArr2 = this.A07;
        }
        A012.A0U(AnonymousClass4XL.A00(this, 5), charSequenceArr2, i);
        if (this.A01) {
            C36371kC.A15(AnonymousClass4XL.A00(this, 6), A012, this.A04);
        }
        return A012;
    }

    public static Bundle A03(CharSequence[] charSequenceArr, int i, int i2, int i3) {
        Bundle A0G = C36371kC.A0G(i, i2, i3);
        A0G.putCharSequenceArray("itemsCharSequence", charSequenceArr);
        A0G.putBoolean("showConfirmation", true);
        return A0G;
    }

    public static Bundle A05(String[] strArr, int i, int i2, int i3) {
        Bundle A0G = C36371kC.A0G(i, i2, i3);
        A0G.putStringArray("items", strArr);
        A0G.putBoolean("showConfirmation", true);
        return A0G;
    }

    public static void A07(SingleSelectionDialogFragment singleSelectionDialogFragment) {
        AnonymousClass01I A0h = singleSelectionDialogFragment.A0h();
        if (A0h instanceof AnonymousClass15P) {
            ((AnonymousClass15P) A0h).Bgm(singleSelectionDialogFragment.A03, singleSelectionDialogFragment.A00);
        } else {
            Bundle A072 = AnonymousClass001.A07();
            A072.putInt("selectedIndex", singleSelectionDialogFragment.A00);
            singleSelectionDialogFragment.A0l().A0o("single_selection_dialog_result", A072);
        }
        singleSelectionDialogFragment.A1b();
    }

    public void A1Q(Bundle bundle) {
        String string;
        String[] stringArray;
        int i;
        super.A1Q(bundle);
        Bundle bundle2 = this.A0A;
        this.A03 = bundle2.getInt("dialogId");
        this.A02 = bundle2.getInt("currentIndex");
        if (bundle2.containsKey("dialogTitleResId")) {
            string = A0n(bundle2.getInt("dialogTitleResId"));
        } else {
            string = bundle2.getString("dialogTitle");
        }
        this.A05 = string;
        if (bundle2.containsKey("itemsArrayResId")) {
            stringArray = C36341k9.A0G(this).getStringArray(bundle2.getInt("itemsArrayResId"));
        } else {
            stringArray = bundle2.getStringArray("items");
        }
        this.A07 = stringArray;
        if (bundle2.containsKey("dialogPositiveButtonTextResId")) {
            i = bundle2.getInt("dialogPositiveButtonTextResId");
        } else {
            i = R.string.f12nameremoved;
        }
        this.A04 = i;
        if (bundle2.containsKey("itemsCharSequence")) {
            this.A06 = bundle2.getCharSequenceArray("itemsCharSequence");
        }
        this.A01 = bundle2.getBoolean("showConfirmation", false);
    }

    public Dialog A1a(Bundle bundle) {
        return A1k().create();
    }
}
