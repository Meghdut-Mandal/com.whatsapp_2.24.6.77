package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass1RJ;
import X.AnonymousClass2IR;
import X.AnonymousClass395;
import X.AnonymousClass3P8;
import X.AnonymousClass3RY;
import X.AnonymousClass3UF;
import X.C012005e;
import X.C33511fU;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36441kJ;
import X.C63193Jc;
import X.C66963Xz;
import X.C67123Yp;
import X.C87184Nu;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class TemplateButtonListBottomSheet extends Hilt_TemplateButtonListBottomSheet {
    public C63193Jc A00;
    public AnonymousClass395 A01;
    public TextEmojiLabel A02;
    public WaImageButton A03;
    public List A04;
    public List A05;

    public void A1S(Bundle bundle, View view) {
        C67123Yp r15;
        View view2 = view;
        AnonymousClass00C.A0D(view2, 0);
        super.A1S(bundle, view2);
        WaImageButton waImageButton = (WaImageButton) C012005e.A02(view2, R.id.button_list_bottom_sheet_close_button);
        this.A03 = waImageButton;
        if (waImageButton != null) {
            C66963Xz.A00(waImageButton, this, 5);
        }
        TextEmojiLabel A0O = C36401kF.A0O(view2, R.id.template_message_bottom_sheet_title);
        this.A02 = A0O;
        AnonymousClass00C.A0B(A0O);
        C63193Jc r1 = this.A00;
        if (r1 != null) {
            C63193Jc.A00(A0a(), A0O, r1);
            Integer[] numArr = new Integer[10];
            AnonymousClass000.A1J(numArr, R.id.hidden_bottom_sheet_template_message_button_1);
            AnonymousClass000.A1K(numArr, R.id.hidden_bottom_sheet_template_message_button_2);
            C36331k8.A1V(numArr, R.id.hidden_bottom_sheet_template_message_button_3);
            C36341k9.A1T(numArr, R.id.hidden_bottom_sheet_template_message_button_4);
            C36341k9.A1U(numArr, R.id.hidden_bottom_sheet_template_message_button_5);
            C36371kC.A1S(numArr, R.id.hidden_bottom_sheet_template_message_button_6);
            C36381kD.A1T(numArr, R.id.hidden_bottom_sheet_template_message_button_7);
            C36361kB.A1V(numArr, R.id.hidden_bottom_sheet_template_message_button_8);
            numArr[8] = Integer.valueOf(R.id.hidden_bottom_sheet_template_message_button_9);
            List A0m = C36341k9.A0m(Integer.valueOf(R.id.hidden_bottom_sheet_template_message_button_10), numArr, 9);
            ArrayList A0I = AnonymousClass001.A0I();
            Iterator it = A0m.iterator();
            while (it.hasNext()) {
                A0I.add(C36341k9.A0X(view2, C36341k9.A0A(it)));
            }
            this.A04 = C36441kJ.A15(A0I);
            Integer[] numArr2 = new Integer[9];
            AnonymousClass000.A1J(numArr2, R.id.hidden_bottom_sheet_template_message_divider_1);
            AnonymousClass000.A1K(numArr2, R.id.hidden_bottom_sheet_template_message_divider_2);
            C36331k8.A1V(numArr2, R.id.hidden_bottom_sheet_template_message_divider_3);
            C36341k9.A1T(numArr2, R.id.hidden_bottom_sheet_template_message_divider_4);
            C36341k9.A1U(numArr2, R.id.hidden_bottom_sheet_template_message_divider_5);
            C36371kC.A1S(numArr2, R.id.hidden_bottom_sheet_template_message_divider_6);
            C36381kD.A1T(numArr2, R.id.hidden_bottom_sheet_template_message_divider_7);
            C36361kB.A1V(numArr2, R.id.hidden_bottom_sheet_template_message_divider_8);
            List A0m2 = C36341k9.A0m(Integer.valueOf(R.id.hidden_bottom_sheet_template_message_divider_9), numArr2, 8);
            ArrayList A0I2 = AnonymousClass001.A0I();
            Iterator it2 = A0m2.iterator();
            while (it2.hasNext()) {
                A0I2.add(C36341k9.A0X(view2, C36341k9.A0A(it2)));
            }
            ArrayList A15 = C36441kJ.A15(A0I2);
            this.A05 = A15;
            AnonymousClass395 r12 = this.A01;
            if (r12 != null) {
                List<AnonymousClass1RJ> list = this.A04;
                TemplateButtonListLayout templateButtonListLayout = r12.A03;
                List<AnonymousClass3P8> list2 = r12.A04;
                TemplateButtonListBottomSheet templateButtonListBottomSheet = r12.A02;
                AnonymousClass2IR r24 = r12.A00;
                C87184Nu r6 = r12.A01;
                if (list != null) {
                    for (AnonymousClass1RJ r13 : list) {
                        if (r13.A00 != null) {
                            TextView A0V = C36441kJ.A0V(r13);
                            C36391kE.A1K(A0V);
                            A0V.setSelected(false);
                            A0V.setVisibility(8);
                        }
                    }
                }
                Iterator it3 = A15.iterator();
                while (it3.hasNext()) {
                    AnonymousClass1RJ r14 = (AnonymousClass1RJ) it3.next();
                    if (r14.A00 != null) {
                        r14.A01().setVisibility(8);
                    }
                }
                if (list != null) {
                    int min = Math.min(list.size(), list2.size());
                    for (int i = 0; i < min; i++) {
                        AnonymousClass1RJ r2 = (AnonymousClass1RJ) list.get(i);
                        C33511fU.A03(C36441kJ.A0V(r2));
                        AnonymousClass3P8 r16 = (AnonymousClass3P8) list2.get(i);
                        if (r16 != null) {
                            TextEmojiLabel textEmojiLabel = (TextEmojiLabel) r2.A01();
                            int i2 = r16.A06;
                            if (i2 == 1) {
                                AnonymousClass3RY r132 = templateButtonListLayout.A03;
                                Context context = templateButtonListLayout.getContext();
                                AnonymousClass00C.A0D(context, 0);
                                C36321k7.A0v(textEmojiLabel, 1, templateButtonListBottomSheet);
                                AnonymousClass00C.A0D(r6, 4);
                                C63193Jc.A00(context, textEmojiLabel, r132.A00);
                                int i3 = R.color.f6nameremoved;
                                if (r16.A04) {
                                    i3 = R.color.f6nameremoved;
                                }
                                Drawable A012 = AnonymousClass3UF.A01(context, R.drawable.ic_action_reply, i3);
                                A012.setAlpha(204);
                                AnonymousClass3RY.A01(context, A012, textEmojiLabel, r16);
                                boolean z = r16.A04;
                                textEmojiLabel.setSelected(z);
                                if (!z) {
                                    AnonymousClass3RY r162 = r132;
                                    Context context2 = context;
                                    r15 = new C67123Yp(r162, context2, textEmojiLabel, A012, r16, r6, templateButtonListBottomSheet, 1);
                                } else {
                                    r15 = null;
                                }
                                textEmojiLabel.setOnClickListener(r15);
                            } else if (i2 == 2 || i2 == 3) {
                                templateButtonListLayout.A02.A01(templateButtonListLayout.getContext(), textEmojiLabel, r24, templateButtonListBottomSheet, r16, templateButtonListLayout.isEnabled(), true);
                            }
                        }
                        r2.A03(0);
                    }
                }
                int i4 = 0;
                boolean z2 = false;
                for (AnonymousClass3P8 r0 : list2) {
                    boolean A1S = AnonymousClass000.A1S(r0.A06, 1);
                    if (i4 == 0) {
                        z2 = A1S;
                    } else if (z2 != A1S) {
                        ((AnonymousClass1RJ) A15.get(i4 - 1)).A03(0);
                        return;
                    }
                    i4++;
                }
                return;
            }
            return;
        }
        throw C36331k8.A0d("conversationFont");
    }

    public void A1J() {
        super.A1J();
        this.A03 = null;
        this.A02 = null;
        this.A04 = null;
        this.A05 = null;
    }

    public int A1i() {
        return R.layout.f9nameremoved;
    }
}
