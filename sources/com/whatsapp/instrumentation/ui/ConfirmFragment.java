package com.whatsapp.instrumentation.ui;

import X.AnonymousClass000;
import X.AnonymousClass1N3;
import X.AnonymousClass3Y3;
import X.AnonymousClass4OD;
import X.C20810yC;
import X.C36361kB;
import X.C36391kE;
import X.C36431kI;
import X.C54652tI;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;

public class ConfirmFragment extends Hilt_ConfirmFragment {
    public AnonymousClass1N3 A00;
    public C20810yC A01;
    public AnonymousClass4OD A02;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
    }

    public void A1O(Context context) {
        super.A1O(context);
        if (context instanceof AnonymousClass4OD) {
            this.A02 = (AnonymousClass4OD) context;
        }
    }

    public void A1S(Bundle bundle, View view) {
        int i;
        TextView A0P;
        int i2;
        AnonymousClass3Y3.A00(view.findViewById(R.id.instrumentation_auth_complete_button), this, 31);
        Bundle bundle2 = this.A0A;
        if (bundle2 != null) {
            i = bundle2.getInt("content_variant");
        } else {
            i = 0;
        }
        TextView A0P2 = C36391kE.A0P(view, R.id.instrumentation_auth_complete_bullet_one);
        if (A0P2 != null) {
            A0P2.setText(R.string.f12nameremoved);
        }
        TextView A0P3 = C36391kE.A0P(view, R.id.instrumentation_auth_complete_bullet_one_body);
        if (A0P3 != null) {
            A0P3.setText(R.string.f12nameremoved);
        }
        TextView A0P4 = C36391kE.A0P(view, R.id.instrumentation_auth_complete_bullet_two);
        if (A0P4 != null) {
            int i3 = R.string.f12nameremoved;
            if (i == 2) {
                i3 = R.string.f12nameremoved;
            }
            A0P4.setText(i3);
        }
        TextView A0P5 = C36391kE.A0P(view, R.id.instrumentation_auth_complete_bullet_three);
        if (A0P5 != null) {
            A0P5.setText(R.string.f12nameremoved);
        }
        if (i == 2 || i == 1) {
            TextView A0P6 = C36391kE.A0P(view, R.id.instrumentation_auth_complete_bullet_two_body);
            if (A0P6 != null) {
                int i4 = R.string.f12nameremoved;
                if (i == 2) {
                    i4 = R.string.f12nameremoved;
                }
                A0P6.setText(i4);
            }
            TextView A0P7 = C36391kE.A0P(view, R.id.instrumentation_auth_complete_bullet_three_body);
            if (A0P7 != null) {
                A0P7.setText(R.string.f12nameremoved);
            }
            String obj = this.A00.A00("https://faq.whatsapp.com/836703167795647").toString();
            TextView A0P8 = C36391kE.A0P(view, R.id.instrumentation_auth_complete_link);
            if (A0P8 != null) {
                A0P8.setText(R.string.f12nameremoved);
                C54652tI.A00(A0P8, this.A01, AnonymousClass000.A1b(obj), R.string.f12nameremoved);
            }
            A0P = C36391kE.A0P(view, R.id.instrumentation_auth_complete_button);
            if (A0P != null) {
                i2 = R.string.f12nameremoved;
            } else {
                return;
            }
        } else {
            TextView A0P9 = C36391kE.A0P(view, R.id.instrumentation_auth_complete_bullet_two_body);
            if (A0P9 != null) {
                A0P9.setText(R.string.f12nameremoved);
            }
            TextView A0P10 = C36391kE.A0P(view, R.id.instrumentation_auth_complete_bullet_three_body);
            if (A0P10 != null) {
                A0P10.setText(R.string.f12nameremoved);
            }
            String obj2 = this.A00.A00("https://faq.whatsapp.com/general/security-and-privacy/how-to-use-whatsapp-on-ray-ban-stories/").toString();
            TextView A0P11 = C36391kE.A0P(view, R.id.instrumentation_auth_complete_link);
            if (A0P11 != null) {
                A0P11.setText(R.string.f12nameremoved);
                C54652tI.A00(A0P11, this.A01, C36431kI.A1Z(obj2, 1), R.string.f12nameremoved);
            }
            A0P = C36391kE.A0P(view, R.id.instrumentation_auth_complete_button);
            if (A0P != null) {
                i2 = R.string.f12nameremoved;
            } else {
                return;
            }
        }
        A0P.setText(i2);
    }
}
