package com.whatsapp.ephemeral;

import X.AnonymousClass001;
import X.AnonymousClass01z;
import X.AnonymousClass11F;
import X.AnonymousClass143;
import X.AnonymousClass17V;
import X.AnonymousClass2QZ;
import X.AnonymousClass3Y0;
import X.C012005e;
import X.C16550pQ;
import X.C19420v0;
import X.C20380xT;
import X.C21010yW;
import X.C24801Dv;
import X.C36391kE;
import X.C36401kF;
import X.C595134f;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;

public class ViewOnceSecondaryNuxBottomSheet extends Hilt_ViewOnceSecondaryNuxBottomSheet implements C16550pQ {
    public C24801Dv A00;
    public C19420v0 A01;
    public C21010yW A02;
    public AnonymousClass17V A03;
    public C20380xT A04;
    public int A05 = -1;
    public String A06 = "-1";
    public boolean A07;

    public static void A05(ViewOnceSecondaryNuxBottomSheet viewOnceSecondaryNuxBottomSheet, boolean z) {
        AnonymousClass2QZ r3 = new AnonymousClass2QZ();
        String str = viewOnceSecondaryNuxBottomSheet.A06;
        if (!str.equals("-1")) {
            r3.A00 = Boolean.valueOf(viewOnceSecondaryNuxBottomSheet.A07);
            r3.A03 = viewOnceSecondaryNuxBottomSheet.A03.A03(str);
            int i = 2;
            if (viewOnceSecondaryNuxBottomSheet.A05 == 42) {
                i = 1;
            }
            r3.A01 = Integer.valueOf(i);
            int i2 = 3;
            if (z) {
                i2 = 8;
            }
            r3.A02 = Integer.valueOf(i2);
            viewOnceSecondaryNuxBottomSheet.A02.Bly(r3);
        }
    }

    public static void A03(AnonymousClass01z r4, C595134f r5) {
        Bundle A072 = AnonymousClass001.A07();
        AnonymousClass11F r2 = r5.A01;
        A072.putString("CHAT_JID", r2.getRawString());
        A072.putInt("MESSAGE_TYPE", r5.A00);
        A072.putBoolean("IN_GROUP", AnonymousClass143.A0G(r2));
        ViewOnceSecondaryNuxBottomSheet viewOnceSecondaryNuxBottomSheet = new ViewOnceSecondaryNuxBottomSheet();
        viewOnceSecondaryNuxBottomSheet.A17(A072);
        viewOnceSecondaryNuxBottomSheet.A1f(r4, "view_once_nux_secondary");
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Bundle A0b = A0b();
        this.A07 = A0b.getBoolean("IN_GROUP", false);
        this.A06 = A0b.getString("CHAT_JID", "-1");
        this.A05 = A0b.getInt("MESSAGE_TYPE", -1);
        return layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
    }

    public void A1S(Bundle bundle, View view) {
        super.A1S(bundle, view);
        View A022 = C012005e.A02(view, R.id.vo_sp_bottom_sheet_ok_button);
        View A023 = C012005e.A02(view, R.id.vo_sp_close_button);
        View A024 = C012005e.A02(view, R.id.vo_sp_bottom_sheet_learn_more_button);
        ImageView A0G = C36401kF.A0G(view, R.id.vo_sp_image);
        TextView A0O = C36391kE.A0O(view, R.id.vo_sp_title);
        TextView A0O2 = C36391kE.A0O(view, R.id.vo_sp_summary);
        C36391kE.A18(A0a(), A0G, R.drawable.vo_camera_nux);
        A0O2.setText(R.string.f12nameremoved);
        A0O.setText(R.string.f12nameremoved);
        AnonymousClass3Y0.A01(A022, this, 43);
        AnonymousClass3Y0.A01(A023, this, 44);
        AnonymousClass3Y0.A01(A024, this, 45);
        A05(this, false);
    }
}
