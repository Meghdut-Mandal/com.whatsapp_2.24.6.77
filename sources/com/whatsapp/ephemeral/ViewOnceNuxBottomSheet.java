package com.whatsapp.ephemeral;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass01z;
import X.AnonymousClass11F;
import X.AnonymousClass143;
import X.AnonymousClass17V;
import X.AnonymousClass1LX;
import X.AnonymousClass2QZ;
import X.AnonymousClass3T1;
import X.AnonymousClass3Y0;
import X.C012005e;
import X.C16550pQ;
import X.C20380xT;
import X.C20810yC;
import X.C21010yW;
import X.C24801Dv;
import X.C36391kE;
import X.C36401kF;
import X.C595134f;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;

public class ViewOnceNuxBottomSheet extends Hilt_ViewOnceNuxBottomSheet implements C16550pQ {
    public int A00 = -1;
    public C24801Dv A01;
    public C20810yC A02;
    public C21010yW A03;
    public AnonymousClass17V A04;
    public AnonymousClass1LX A05;
    public C20380xT A06;
    public boolean A07 = true;
    public String A08 = "-1";
    public boolean A09;
    public boolean A0A;

    public static boolean A06(AnonymousClass01z r5, C595134f r6, AnonymousClass1LX r7, AnonymousClass3T1 r8) {
        String str;
        if (AnonymousClass000.A1W(r8)) {
            str = "ephemeral_view_once";
        } else {
            str = "ephemeral_view_once_receiver";
        }
        if (r7.A00.A01((Object) null, str) || r5.A0N("view_once_nux_v2") != null) {
            return false;
        }
        A03(r5, r6, r8, false);
        return true;
    }

    public static void A05(ViewOnceNuxBottomSheet viewOnceNuxBottomSheet, boolean z) {
        int i;
        AnonymousClass2QZ r3 = new AnonymousClass2QZ();
        String str = viewOnceNuxBottomSheet.A08;
        if (!str.equals("-1")) {
            r3.A00 = Boolean.valueOf(viewOnceNuxBottomSheet.A09);
            r3.A03 = viewOnceNuxBottomSheet.A04.A03(str);
            int i2 = 2;
            if (viewOnceNuxBottomSheet.A00 == 42) {
                i2 = 1;
            }
            r3.A01 = Integer.valueOf(i2);
            if (viewOnceNuxBottomSheet.A07) {
                i = 2;
                if (z) {
                    i = 7;
                }
            } else {
                i = 5;
                if (z) {
                    i = 10;
                }
            }
            r3.A02 = Integer.valueOf(i);
            viewOnceNuxBottomSheet.A03.Bly(r3);
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        String str;
        AnonymousClass1LX r1 = this.A05;
        if (this.A07) {
            str = "ephemeral_view_once";
        } else {
            str = "ephemeral_view_once_receiver";
        }
        r1.A00.A00(str, (Object) null);
        super.onDismiss(dialogInterface);
    }

    public static void A03(AnonymousClass01z r6, C595134f r7, AnonymousClass3T1 r8, boolean z) {
        AnonymousClass11F r1;
        Bundle A072 = AnonymousClass001.A07();
        if (r8 != null && (r1 = r8.A1J.A00) != null) {
            C36401kF.A14(A072, r1, "CHAT_JID");
            A072.putInt("MESSAGE_TYPE", r8.A1I);
            A072.putBoolean("IN_GROUP", AnonymousClass143.A0G(r1));
            A072.putBoolean("IS_SENDER", false);
        } else if (r7 != null) {
            AnonymousClass11F r12 = r7.A01;
            C36401kF.A14(A072, r12, "CHAT_JID");
            A072.putInt("MESSAGE_TYPE", r7.A00);
            A072.putBoolean("IN_GROUP", AnonymousClass143.A0G(r12));
        }
        A072.putBoolean("FORCE_SHOW", z);
        ViewOnceNuxBottomSheet viewOnceNuxBottomSheet = new ViewOnceNuxBottomSheet();
        viewOnceNuxBottomSheet.A17(A072);
        viewOnceNuxBottomSheet.A1f(r6, "view_once_nux_v2");
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Bundle A0b = A0b();
        this.A09 = A0b.getBoolean("IN_GROUP", false);
        this.A08 = A0b.getString("CHAT_JID", "-1");
        this.A00 = A0b.getInt("MESSAGE_TYPE", -1);
        this.A0A = A0b.getBoolean("FORCE_SHOW", false);
        this.A07 = A0b.getBoolean("IS_SENDER", true);
        return layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
    }

    public void A1L() {
        String str;
        super.A1L();
        if (!this.A0A) {
            AnonymousClass1LX r3 = this.A05;
            if (this.A07) {
                str = "ephemeral_view_once";
            } else {
                str = "ephemeral_view_once_receiver";
            }
            if (r3.A00.A01((Object) null, str)) {
                A1c();
            }
        }
    }

    public void A1S(Bundle bundle, View view) {
        int i;
        super.A1S(bundle, view);
        View A022 = C012005e.A02(view, R.id.vo_sp_bottom_sheet_ok_button);
        View A023 = C012005e.A02(view, R.id.vo_sp_close_button);
        View A024 = C012005e.A02(view, R.id.vo_sp_bottom_sheet_learn_more_button);
        TextView A0O = C36391kE.A0O(view, R.id.vo_sp_title);
        TextView A0O2 = C36391kE.A0O(view, R.id.vo_sp_first_bullet_summary);
        TextView A0O3 = C36391kE.A0O(view, R.id.vo_sp_second_bullet_summary);
        if (this.A07) {
            A0O.setText(R.string.f12nameremoved);
            A0O2.setText(R.string.f12nameremoved);
            i = R.string.f12nameremoved;
        } else if (this.A02.A0E(2802)) {
            A0O.setText(R.string.f12nameremoved);
            A0O2.setText(R.string.f12nameremoved);
            i = R.string.f12nameremoved;
        } else if (this.A00 == 42) {
            A0O.setText(R.string.f12nameremoved);
            A0O2.setText(R.string.f12nameremoved);
            i = R.string.f12nameremoved;
        } else {
            A0O.setText(R.string.f12nameremoved);
            A0O2.setText(R.string.f12nameremoved);
            i = R.string.f12nameremoved;
        }
        A0O3.setText(i);
        AnonymousClass3Y0.A01(A022, this, 40);
        AnonymousClass3Y0.A01(A023, this, 41);
        AnonymousClass3Y0.A01(A024, this, 42);
        A05(this, false);
    }
}
