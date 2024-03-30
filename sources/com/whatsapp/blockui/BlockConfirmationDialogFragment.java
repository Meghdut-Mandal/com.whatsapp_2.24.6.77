package com.whatsapp.blockui;

import X.AVW;
import X.AnonymousClass00C;
import X.AnonymousClass0FM;
import X.AnonymousClass141;
import X.AnonymousClass143;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass3LW;
import X.AnonymousClass3O6;
import X.AnonymousClass3PR;
import X.AnonymousClass3VM;
import X.AnonymousClass4PK;
import X.AnonymousClass4XL;
import X.C012005e;
import X.C18740tg;
import X.C21060yb;
import X.C225314u;
import X.C32681e1;
import X.C32881eL;
import X.C33751fs;
import X.C36321k7;
import X.C36331k8;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C36401kF;
import X.C36431kI;
import X.C39001qm;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

public class BlockConfirmationDialogFragment extends Hilt_BlockConfirmationDialogFragment {
    public AnonymousClass4PK A00;
    public AnonymousClass3O6 A01;
    public AnonymousClass16D A02;
    public AnonymousClass171 A03;
    public C33751fs A04;
    public C21060yb A05;
    public AnonymousClass3PR A06;
    public C32881eL A07;
    public UserJid A08;
    public C32681e1 A09;
    public String A0A;

    public static BlockConfirmationDialogFragment A03(UserJid userJid, String str, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        BlockConfirmationDialogFragment blockConfirmationDialogFragment = new BlockConfirmationDialogFragment();
        Bundle A072 = C36331k8.A07(userJid);
        A072.putString("entryPoint", str);
        A072.putBoolean("deleteChatOnBlock", z);
        A072.putBoolean("showSuccessToast", z4);
        A072.putBoolean("showReportAndBlock", z3);
        A072.putInt("postBlockNavigation", i2);
        A072.putInt("postBlockAndReportNavigation", i);
        A072.putBoolean("enableReportCheckboxByDefault", z2);
        blockConfirmationDialogFragment.A17(A072);
        return blockConfirmationDialogFragment;
    }

    public Dialog A1a(Bundle bundle) {
        int i;
        Object[] objArr;
        String A0H;
        Bundle A0b = A0b();
        C225314u r11 = (C225314u) A0h();
        C18740tg.A06(r11);
        C18740tg.A06(A0b);
        this.A0A = A0b.getString("entryPoint", (String) null);
        String string = A0b.getString("jid", (String) null);
        boolean z = A0b.getBoolean("deleteChatOnBlock", false);
        boolean z2 = A0b.getBoolean("showSuccessToast", false);
        boolean z3 = A0b.getBoolean("showReportAndBlock", false);
        boolean z4 = A0b.getBoolean("enableReportCheckboxByDefault", false);
        int i2 = A0b.getInt("postBlockNavigation", 0);
        int i3 = A0b.getInt("postBlockAndReportNavigation", 0);
        UserJid A0l = C36431kI.A0l(string);
        C18740tg.A06(A0l);
        this.A08 = A0l;
        AnonymousClass141 A0D = this.A02.A0D(A0l);
        AnonymousClass3PR r3 = this.A06;
        String str = this.A0A;
        UserJid userJid = this.A08;
        C36331k8.A1I(str, userJid);
        AnonymousClass3PR.A00(r3, userJid, str, 0);
        C39001qm A002 = AnonymousClass3LW.A00(r11);
        UserJid userJid2 = this.A08;
        if (AnonymousClass143.A0H(userJid2)) {
            i = R.string.f12nameremoved;
            objArr = new Object[1];
            AnonymousClass00C.A0D(userJid2, 0);
            A0H = null;
        } else {
            i = R.string.f12nameremoved;
            objArr = new Object[1];
            A0H = this.A03.A0H(A0D);
        }
        String A0q = C36401kF.A0q(this, A0H, objArr, 0, i);
        CheckBox checkBox = null;
        if (z3) {
            boolean A0E = this.A02.A0E(6186);
            int i4 = R.layout.f9nameremoved;
            if (A0E) {
                i4 = R.layout.f9nameremoved;
            }
            View inflate = LayoutInflater.from(A1D()).inflate(i4, (ViewGroup) null, false);
            if (A0E) {
                C36391kE.A0O(inflate, R.id.dialog_title).setText(A0q);
            } else {
                A002.setTitle(A0q);
            }
            checkBox = (CheckBox) C012005e.A02(inflate, R.id.checkbox);
            if (z4) {
                checkBox.setChecked(true);
            }
            TextView A0O = C36391kE.A0O(inflate, R.id.dialog_message);
            int i5 = R.string.f12nameremoved;
            if (A0E) {
                i5 = R.string.f12nameremoved;
            }
            A0O.setText(i5);
            TextView A0O2 = C36391kE.A0O(inflate, R.id.checkbox_header);
            int i6 = R.string.f12nameremoved;
            if (A0E) {
                i6 = R.string.f12nameremoved;
            }
            A0O2.setText(i6);
            TextView A0O3 = C36391kE.A0O(inflate, R.id.checkbox_message);
            if (A0E) {
                SpannableStringBuilder A022 = this.A09.A02(A1D(), new AVW(this, 35), C36401kF.A0q(this, "learn-more", new Object[1], 0, R.string.f12nameremoved), "learn-more");
                C36331k8.A10(A0O3, this.A02);
                C36371kC.A1I(A0O3, this.A05);
                A0O3.setText(A022);
            } else {
                A0O3.setText(R.string.f12nameremoved);
            }
            C36361kB.A18(C012005e.A02(inflate, R.id.checkbox_container), checkBox, 14);
            A002.setView(inflate);
        } else {
            A002.setTitle(A0q);
        }
        AnonymousClass3VM r9 = new AnonymousClass3VM(checkBox, r11, this, A0D, i3, i2, z, z2);
        AnonymousClass4XL A003 = AnonymousClass4XL.A00(this, 24);
        A002.setPositiveButton(R.string.f12nameremoved, r9);
        AnonymousClass0FM A0R = C36431kI.A0R(A003, A002, R.string.f12nameremoved);
        A0R.setCanceledOnTouchOutside(true);
        return A0R;
    }

    public void A1O(Context context) {
        super.A1O(context);
        if (context instanceof AnonymousClass4PK) {
            this.A00 = (AnonymousClass4PK) context;
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        AnonymousClass3PR r3 = this.A06;
        String str = this.A0A;
        UserJid userJid = this.A08;
        C36321k7.A0w(str, userJid);
        AnonymousClass3PR.A00(r3, userJid, str, 2);
    }
}
