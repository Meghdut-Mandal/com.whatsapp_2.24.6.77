package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass01z;
import X.AnonymousClass1QZ;
import X.AnonymousClass1RJ;
import X.AnonymousClass1TF;
import X.AnonymousClass2IR;
import X.AnonymousClass395;
import X.AnonymousClass3P8;
import X.AnonymousClass3RY;
import X.AnonymousClass3UF;
import X.AnonymousClass3YF;
import X.C18700tb;
import X.C18800tq;
import X.C19700wN;
import X.C203099nI;
import X.C33511fU;
import X.C36341k9;
import X.C36371kC;
import X.C36391kE;
import X.C36411kG;
import X.C36441kJ;
import X.C37351mE;
import X.C63193Jc;
import X.C64993Qh;
import X.C66973Ya;
import X.C87184Nu;
import X.C88854Uh;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import java.util.Collections;
import java.util.List;

public class TemplateButtonListLayout extends LinearLayout implements C18700tb {
    public C19700wN A00;
    public C63193Jc A01;
    public C64993Qh A02;
    public AnonymousClass3RY A03;
    public AnonymousClass1TF A04;
    public C203099nI A05;
    public AnonymousClass1QZ A06;
    public boolean A07;
    public final List A08;
    public final List A09;

    private void setSeeAllButton(TextEmojiLabel textEmojiLabel, AnonymousClass01z r8, List list, AnonymousClass2IR r10, C87184Nu r11) {
        setButtonIconAndText(textEmojiLabel);
        TemplateButtonListBottomSheet templateButtonListBottomSheet = new TemplateButtonListBottomSheet();
        templateButtonListBottomSheet.A01 = new AnonymousClass395(r10, r11, templateButtonListBottomSheet, this, list);
        AnonymousClass3YF.A00(textEmojiLabel, templateButtonListBottomSheet, r8, 40);
    }

    public void A01(Context context) {
        setOrientation(1);
        View.inflate(context, R.layout.f9nameremoved, this);
        AnonymousClass1RJ A0Y = C36341k9.A0Y(this, R.id.hidden_template_message_button_1);
        AnonymousClass1RJ A0Y2 = C36341k9.A0Y(this, R.id.hidden_template_message_button_2);
        AnonymousClass1RJ A0Y3 = C36341k9.A0Y(this, R.id.hidden_template_message_button_3);
        List list = this.A08;
        list.add(A0Y);
        list.add(A0Y2);
        list.add(A0Y3);
        AnonymousClass1RJ A0Y4 = C36341k9.A0Y(this, R.id.hidden_template_message_divider_1);
        AnonymousClass1RJ A0Y5 = C36341k9.A0Y(this, R.id.hidden_template_message_divider_2);
        AnonymousClass1RJ A0Y6 = C36341k9.A0Y(this, R.id.hidden_template_message_divider_3);
        List list2 = this.A09;
        list2.add(A0Y4);
        list2.add(A0Y5);
        list2.add(A0Y6);
    }

    public void A00() {
        if (!this.A07) {
            this.A07 = true;
            C18800tq A0W = C36391kE.A0W(generatedComponent());
            this.A02 = A0W.A62();
            this.A03 = new AnonymousClass3RY(C36371kC.A0V(A0W));
            this.A01 = C36371kC.A0V(A0W);
            this.A00 = C36391kE.A0V(A0W);
            this.A05 = A0W.ALP();
            this.A04 = (AnonymousClass1TF) A0W.AV5.get();
        }
    }

    public void A02(AnonymousClass01z r26, AnonymousClass2IR r27, C87184Nu r28) {
        C66973Ya r0;
        AnonymousClass2IR r16 = r27;
        C88854Uh r2 = (C88854Uh) r16.getFMessage();
        List list = r2.BIE().A06;
        if (list != null) {
            C203099nI.A03(this.A05, "Render Time", list);
            list = C36441kJ.A15(r2.BIE().A06);
            list.removeAll(Collections.singletonList((Object) null));
        }
        List<AnonymousClass1RJ> list2 = this.A09;
        for (AnonymousClass1RJ r1 : list2) {
            if (r1.A00 != null) {
                r1.A01().setVisibility(8);
            }
        }
        int i = 0;
        for (AnonymousClass1RJ r22 : this.A08) {
            if (r22.A00 != null) {
                TextView A0V = C36441kJ.A0V(r22);
                C36391kE.A1K(A0V);
                A0V.setSelected(false);
                A0V.setVisibility(8);
            }
            if (!(list == null || i >= list.size() || list.get(i) == null)) {
                AnonymousClass3P8 r12 = (AnonymousClass3P8) list.get(i);
                if (!this.A04.A09(r12)) {
                    C33511fU.A03(C36441kJ.A0V(r22));
                    C87184Nu r11 = r28;
                    if (i != 2 || list.size() <= 3) {
                        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) r22.A01();
                        int i2 = r12.A06;
                        if (i2 == 1) {
                            AnonymousClass3RY r10 = this.A03;
                            Context context = getContext();
                            AnonymousClass00C.A0D(context, 0);
                            C36341k9.A1E(textEmojiLabel, 1, r11);
                            C63193Jc.A00(context, textEmojiLabel, r10.A00);
                            int A052 = C36341k9.A05(context);
                            if (r12.A04) {
                                A052 = R.color.f6nameremoved;
                            }
                            Drawable A012 = AnonymousClass3UF.A01(context, R.drawable.ic_action_reply, A052);
                            A012.setAlpha(204);
                            AnonymousClass3RY.A01(context, A012, textEmojiLabel, r12);
                            boolean z = r12.A04;
                            textEmojiLabel.setSelected(z);
                            if (!z) {
                                AnonymousClass3RY r18 = r10;
                                Context context2 = context;
                                r0 = new C66973Ya(r18, context2, textEmojiLabel, A012, r12, r11, 2);
                            } else {
                                r0 = null;
                            }
                            textEmojiLabel.setOnClickListener(r0);
                        } else if (i2 == 2 || i2 == 3) {
                            this.A02.A01(getContext(), textEmojiLabel, r16, (TemplateButtonListBottomSheet) null, r12, isEnabled(), false);
                        }
                    } else {
                        TextEmojiLabel textEmojiLabel2 = (TextEmojiLabel) r22.A01();
                        setSeeAllButton(textEmojiLabel2, r26, list, r16, r11);
                    }
                    C36411kG.A1L(r22, 0);
                    ((AnonymousClass1RJ) list2.get(i)).A03(0);
                }
            }
            i++;
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A06;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A06 = r0;
        }
        return r0.generatedComponent();
    }

    public TemplateButtonListLayout(Context context) {
        super(context);
        A00();
        this.A08 = AnonymousClass001.A0I();
        this.A09 = AnonymousClass001.A0I();
        A01(context);
    }

    private void setButtonIconAndText(TextEmojiLabel textEmojiLabel) {
        Drawable A022 = AnonymousClass3UF.A02(getContext(), R.drawable.ic_format_list_bulleted, C36341k9.A05(getContext()));
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        textEmojiLabel.setText(C37351mE.A00(textEmojiLabel.getPaint(), A022, getResources().getString(R.string.f12nameremoved), dimensionPixelSize, getResources().getInteger(R.integer.f8nameremoved)));
        C63193Jc r2 = this.A01;
        textEmojiLabel.setTextSize(r2.A03(getResources(), r2.A00));
    }

    public TemplateButtonListLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A00();
    }

    public TemplateButtonListLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        this.A08 = AnonymousClass001.A0I();
        this.A09 = AnonymousClass001.A0I();
        A01(context);
    }
}
