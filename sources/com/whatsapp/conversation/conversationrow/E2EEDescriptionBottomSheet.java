package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass001;
import X.C012005e;
import X.C16550pQ;
import X.C165737u4;
import X.C203529oE;
import X.C20810yC;
import X.C222013h;
import X.C24801Dv;
import X.C32791eC;
import X.C36341k9;
import X.C36361kB;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C36421kH;
import X.C36441kJ;
import X.C56002vY;
import X.C66953Xy;
import X.C90184Zk;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

public class E2EEDescriptionBottomSheet extends Hilt_E2EEDescriptionBottomSheet implements C16550pQ {
    public static boolean A04;
    public int A00;
    public C24801Dv A01;
    public C20810yC A02;
    public C32791eC A03;

    public static E2EEDescriptionBottomSheet A03(int i) {
        E2EEDescriptionBottomSheet e2EEDescriptionBottomSheet = new E2EEDescriptionBottomSheet();
        Bundle A07 = AnonymousClass001.A07();
        A07.putInt("entry_point", i);
        e2EEDescriptionBottomSheet.A17(A07);
        return e2EEDescriptionBottomSheet;
    }

    private void A05(WaImageView waImageView) {
        int color = C36341k9.A0G(this).getColor(R.color.f6nameremoved);
        if (waImageView != null) {
            waImageView.setColorFilter(color);
            waImageView.setPadding(0, 0, 0, 0);
        }
    }

    private void A06(WaTextView waTextView) {
        int dimensionPixelSize = C36341k9.A0G(this).getDimensionPixelSize(R.dimen.f7nameremoved);
        int A06 = C36441kJ.A06(C36341k9.A0G(this), R.dimen.f7nameremoved, C36341k9.A0G(this).getDimensionPixelSize(R.dimen.f7nameremoved));
        int A062 = C36441kJ.A06(C36341k9.A0G(this), R.dimen.f7nameremoved, C36341k9.A0G(this).getDimensionPixelSize(R.dimen.f7nameremoved));
        if (waTextView != null) {
            waTextView.setTextAppearance(A1D(), R.style.f13nameremoved);
            waTextView.setPadding(dimensionPixelSize, A06, 0, A062);
        }
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
    }

    public void A1S(Bundle bundle, View view) {
        int i;
        int i2;
        super.A1S(bundle, view);
        Bundle bundle2 = this.A0A;
        if (!(bundle2 == null || (i = bundle2.getInt("entry_point", -1)) == -1)) {
            boolean A0E = this.A02.A0E(5111);
            boolean A0E2 = this.A02.A0E(4869);
            boolean A0E3 = this.A02.A0E(4870);
            TextView A0O = C36391kE.A0O(view, R.id.e2ee_bottom_sheet_title);
            if (A0E && A0E2) {
                A0O.setText(R.string.f12nameremoved);
            }
            TextView A0O2 = C36391kE.A0O(view, R.id.e2ee_bottom_sheet_summary);
            if (A0E && A0E3) {
                C36341k9.A10(view, R.id.e2ee_description_close_button, 8);
                view.findViewById(R.id.e2ee_scroll_view).setPadding(0, C36341k9.A0G(this).getDimensionPixelSize(R.dimen.f7nameremoved), 0, 0);
                A0O.setTextSize(24.0f);
                A0O2.setLineSpacing(15.0f, 1.0f);
                A05(C36421kH.A0J(view, R.id.e2ee_bottom_sheet_image_item_one));
                A05(C36421kH.A0J(view, R.id.e2ee_bottom_sheet_image_item_two));
                A05(C36421kH.A0J(view, R.id.e2ee_bottom_sheet_image_item_three));
                A05(C36421kH.A0J(view, R.id.e2ee_bottom_sheet_image_item_four));
                A05(C36421kH.A0J(view, R.id.e2ee_bottom_sheet_image_item_five));
                A06(C36411kG.A0Z(view, R.id.e2ee_bottom_sheet_list_item_one));
                A06(C36411kG.A0Z(view, R.id.e2ee_bottom_sheet_list_item_two));
                A06(C36411kG.A0Z(view, R.id.e2ee_bottom_sheet_list_item_three));
                A06(C36411kG.A0Z(view, R.id.e2ee_bottom_sheet_list_item_four));
                A06(C36411kG.A0Z(view, R.id.e2ee_bottom_sheet_list_item_five));
            }
            if (A04) {
                A0O.setText(R.string.f12nameremoved);
                A0O2.setText(R.string.f12nameremoved);
                View findViewById = view.findViewById(R.id.e2ee_bottom_sheet_image_item_two);
                if (findViewById != null) {
                    findViewById.setVisibility(8);
                }
                View findViewById2 = view.findViewById(R.id.e2ee_bottom_sheet_list_item_two);
                if (findViewById2 != null) {
                    findViewById2.setVisibility(8);
                }
                View findViewById3 = view.findViewById(R.id.e2ee_bottom_sheet_image_item_five);
                if (findViewById3 != null) {
                    findViewById3.setVisibility(8);
                }
                View findViewById4 = view.findViewById(R.id.e2ee_bottom_sheet_list_item_five);
                if (findViewById4 != null) {
                    findViewById4.setVisibility(8);
                }
            } else if (8 == i) {
                A0O.setText(R.string.f12nameremoved);
                A0O2.setText(R.string.f12nameremoved);
            }
            ImageView A0G = C36401kF.A0G(view, R.id.e2ee_bottom_sheet_image);
            if (C222013h.A05) {
                C165737u4 r4 = new C165737u4();
                A0G.setImageDrawable(r4);
                C203529oE.A06(A1D(), R.raw.wds_anim_e2ee_description).A02(new C90184Zk(r4, 0));
            } else {
                if (!A0E || !A0E3) {
                    i2 = R.drawable.e2ee_description;
                } else {
                    A0G.getLayoutParams().height = C36341k9.A0G(this).getDimensionPixelSize(R.dimen.f7nameremoved);
                    A0G.requestLayout();
                    i2 = R.drawable.vec_e2ee_illustration;
                }
                A0G.setImageResource(i2);
            }
            this.A03.A00(i, 1);
            this.A00 = i;
        }
        View A022 = C012005e.A02(view, R.id.e2ee_bottom_sheet_learn_more_button);
        View A023 = C012005e.A02(view, R.id.e2ee_description_close_button);
        C66953Xy.A00(A022, this, 48);
        C66953Xy.A00(A023, this, 49);
    }

    public Dialog A1a(Bundle bundle) {
        Dialog A1a = super.A1a(bundle);
        A1a.setOnShowListener(new C56002vY(this, 2));
        return A1a;
    }
}
