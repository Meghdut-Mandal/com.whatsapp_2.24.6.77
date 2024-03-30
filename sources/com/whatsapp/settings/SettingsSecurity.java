package com.whatsapp.settings;

import X.AnonymousClass155;
import X.AnonymousClass17Y;
import X.AnonymousClass19A;
import X.AnonymousClass1OD;
import X.AnonymousClass3Y8;
import X.AnonymousClass4XY;
import X.AnonymousClass6YV;
import X.C012005e;
import X.C18800tq;
import X.C18830tt;
import X.C20380xT;
import X.C20810yC;
import X.C21060yb;
import X.C236919l;
import X.C24801Dv;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C36421kH;
import X.C36441kJ;
import X.C89364Wg;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

public class SettingsSecurity extends AnonymousClass155 {
    public AnonymousClass1OD A00;
    public AnonymousClass19A A01;
    public C236919l A02;
    public C20380xT A03;
    public boolean A04;

    public void A2F() {
        if (!this.A04) {
            this.A04 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A01 = C36361kB.A0c(A0B);
            this.A03 = C36331k8.A0I(A0B);
            this.A02 = (C236919l) A0B.A5Q.get();
            this.A00 = (AnonymousClass1OD) A0B.A2j.get();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.f12nameremoved);
        setContentView((int) R.layout.f9nameremoved);
        int A1X = C36341k9.A1X(this);
        CompoundButton compoundButton = (CompoundButton) C012005e.A02(this.A00, R.id.security_notifications);
        compoundButton.setChecked(this.A09.A2C());
        AnonymousClass4XY.A00(compoundButton, this, 19);
        C20810yC r15 = this.A0D;
        AnonymousClass17Y r12 = this.A05;
        C24801Dv r11 = this.A01;
        C21060yb r14 = this.A08;
        TextEmojiLabel A0O = C36401kF.A0O(this.A00, R.id.settings_security_toggle_info);
        boolean A2H = this.A02.A01.A2H();
        int i = R.string.f12nameremoved;
        if (A2H) {
            i = R.string.f12nameremoved;
        }
        String str = "learn-more";
        AnonymousClass6YV.A0E(this, this.A03.A04("security-and-privacy", "security-code-change-notification"), r11, r12, A0O, r14, r15, C36391kE.A0v(this, "learn-more", new Object[A1X], 0, i), str);
        C20810yC r152 = this.A0D;
        AnonymousClass17Y r122 = this.A05;
        C24801Dv r112 = this.A01;
        C21060yb r142 = this.A08;
        AnonymousClass6YV.A0E(this, this.A04.A00("https://www.whatsapp.com/security"), r112, r122, C36401kF.A0O(this.A00, R.id.settings_security_info_text), r142, r152, C36351kA.A0w(this, "learn-more", A1X, R.string.f12nameremoved), str);
        TextView A0O2 = C36391kE.A0O(this.A00, R.id.settings_security_toggle_title);
        boolean A2H2 = this.A02.A01.A2H();
        int i2 = R.string.f12nameremoved;
        if (A2H2) {
            i2 = R.string.f12nameremoved;
        }
        A0O2.setText(i2);
        AnonymousClass3Y8.A00(findViewById(R.id.security_notifications_group), compoundButton, 29);
        if (this.A0D.A0E(1071)) {
            View A022 = C012005e.A02(this.A00, R.id.e2ee_settings_layout);
            View A023 = C012005e.A02(this.A00, R.id.settings_security_top_container);
            AnonymousClass3Y8.A00(C012005e.A02(this.A00, R.id.security_settings_learn_more), this, 30);
            C36381kD.A1B(A022, A023);
            boolean A0E = this.A0D.A0E(5112);
            boolean A0E2 = this.A0D.A0E(4869);
            boolean A0E3 = this.A0D.A0E(4870);
            if (A0E) {
                if (A0E2) {
                    C36391kE.A0P(A022, R.id.e2ee_bottom_sheet_title).setText(R.string.f12nameremoved);
                }
                if (A0E3) {
                    int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
                    C012005e.A02(this.A00, R.id.e2ee_settings_layout).setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
                    ImageView A0N = C36391kE.A0N(A022, R.id.e2ee_bottom_sheet_image);
                    A0N.getLayoutParams().height = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
                    A0N.requestLayout();
                    A0N.setImageResource(R.drawable.vec_e2ee_illustration);
                    TextView A0P = C36391kE.A0P(A022, R.id.e2ee_bottom_sheet_title);
                    A0P.setTextAppearance(this, R.style.f13nameremoved);
                    A0P.setTextSize(24.0f);
                    A0P.setGravity(17);
                    TextView A0P2 = C36391kE.A0P(A022, R.id.e2ee_bottom_sheet_summary);
                    A0P2.setGravity(17);
                    A0P2.setLineSpacing(15.0f, 1.0f);
                    A01(C36421kH.A0J(A022, R.id.e2ee_bottom_sheet_list_image_one));
                    A01(C36421kH.A0J(A022, R.id.e2ee_bottom_sheet_list_image_two));
                    A01(C36421kH.A0J(A022, R.id.e2ee_bottom_sheet_list_image_three));
                    A01(C36421kH.A0J(A022, R.id.e2ee_bottom_sheet_list_image_four));
                    A01(C36421kH.A0J(A022, R.id.e2ee_bottom_sheet_list_image_five));
                    A07(C36411kG.A0Z(A022, R.id.e2ee_bottom_sheet_list_item_one));
                    A07(C36411kG.A0Z(A022, R.id.e2ee_bottom_sheet_list_item_two));
                    A07(C36411kG.A0Z(A022, R.id.e2ee_bottom_sheet_list_item_three));
                    A07(C36411kG.A0Z(A022, R.id.e2ee_bottom_sheet_list_item_four));
                    A07(C36411kG.A0Z(A022, R.id.e2ee_bottom_sheet_list_item_five));
                    TextView A0O3 = C36391kE.A0O(this.A00, R.id.security_settings_learn_more);
                    A0O3.setTextAppearance(this, R.style.f13nameremoved);
                    A0O3.setGravity(17);
                    A0O3.setPadding(0, getResources().getDimensionPixelSize(R.dimen.f7nameremoved), 0, dimensionPixelSize);
                    TextView A0O4 = C36391kE.A0O(this.A00, R.id.settings_security_toggle_info);
                    A0O4.setText(R.string.f12nameremoved);
                    A0O4.setTextAppearance(this, R.style.f13nameremoved);
                    A0O4.setLineSpacing(4.0f, 1.0f);
                    int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
                    int dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
                    A0O4.setPadding(0, dimensionPixelSize2, 0, 0);
                    TextView A0O5 = C36391kE.A0O(this.A00, R.id.settings_security_toggle_learn_more);
                    A0O5.setText(R.string.f12nameremoved);
                    A0O5.setTextAppearance(this, R.style.f13nameremoved);
                    A0O5.setVisibility(0);
                    AnonymousClass3Y8.A00(A0O5, this, 31);
                    A0O5.setPadding(0, dimensionPixelSize3, 0, 0);
                }
            }
        }
    }

    public SettingsSecurity(int i) {
        this.A04 = false;
        C89364Wg.A00(this, 30);
    }

    private void A01(WaImageView waImageView) {
        int color = getResources().getColor(R.color.f6nameremoved);
        if (waImageView != null) {
            waImageView.setColorFilter(color);
            waImageView.setPadding(0, 0, 0, 0);
        }
    }

    private void A07(WaTextView waTextView) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        int A06 = C36441kJ.A06(getResources(), R.dimen.f7nameremoved, getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
        int A022 = C36361kB.A02(this, R.dimen.f7nameremoved) + C36361kB.A02(this, R.dimen.f7nameremoved);
        if (waTextView != null) {
            waTextView.setTextAppearance(this, R.style.f13nameremoved);
            waTextView.setPadding(dimensionPixelSize, A06, dimensionPixelSize, A022);
        }
    }

    public SettingsSecurity() {
        this(0);
    }
}
