package com.whatsapp.chatinfo.view.custom;

import X.AnonymousClass00C;
import X.AnonymousClass088;
import X.C33511fU;
import X.C33521fV;
import X.C36371kC;
import X.C36411kG;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.ListItemWithLeftIcon;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;
import com.whatsapp.wds.components.button.WDSButton;

public abstract class PnhWithBulletsBottomSheet extends WDSBottomSheetDialogFragment implements View.OnClickListener {
    public ListItemWithLeftIcon A00;
    public ListItemWithLeftIcon A01;
    public ListItemWithLeftIcon A02;
    public WaImageView A03;
    public WaTextView A04;
    public WaTextView A05;
    public WDSButton A06;
    public WDSButton A07;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return C36371kC.A0J(layoutInflater, viewGroup, R.layout.f9nameremoved, false);
    }

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        this.A03 = (WaImageView) view.findViewById(R.id.pnh_image);
        this.A05 = C36411kG.A0Z(view, R.id.pnh_title);
        this.A06 = (WDSButton) view.findViewById(R.id.pnh_primary_button);
        this.A07 = (WDSButton) view.findViewById(R.id.pnh_secondary_button);
        this.A00 = (ListItemWithLeftIcon) view.findViewById(R.id.pnh_point_1);
        this.A01 = (ListItemWithLeftIcon) view.findViewById(R.id.pnh_point_2);
        this.A02 = (ListItemWithLeftIcon) view.findViewById(R.id.pnh_point_3);
        WaTextView A0Z = C36411kG.A0Z(view, R.id.pnh_own_number);
        A0Z.setTextDirection(3);
        if (this instanceof CreatorPrivacyNewsletterBottomSheet) {
            C33511fU.A03(A0Z);
            A0Z.setTextSize(14.0f);
        } else {
            AnonymousClass088.A07(A0Z, 8, 24, 2, 2);
        }
        this.A04 = A0Z;
        WDSButton wDSButton = this.A07;
        if (wDSButton != null) {
            wDSButton.setOnClickListener(this);
        }
        WDSButton wDSButton2 = this.A06;
        if (wDSButton2 != null) {
            wDSButton2.setOnClickListener(this);
        }
        WaTextView waTextView = this.A05;
        AnonymousClass00C.A0E(waTextView, "null cannot be cast to non-null type android.view.View");
        C33521fV.A07(waTextView, true);
    }

    public void A1J() {
        super.A1J();
        WDSButton wDSButton = this.A07;
        if (wDSButton != null) {
            wDSButton.setOnClickListener((View.OnClickListener) null);
        }
        WDSButton wDSButton2 = this.A06;
        if (wDSButton2 != null) {
            wDSButton2.setOnClickListener((View.OnClickListener) null);
        }
        this.A04 = null;
        this.A05 = null;
        this.A07 = null;
        this.A06 = null;
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
        this.A03 = null;
    }
}
