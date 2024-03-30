package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass001;
import X.AnonymousClass01z;
import X.AnonymousClass1QZ;
import X.AnonymousClass1RJ;
import X.AnonymousClass1TF;
import X.AnonymousClass2IR;
import X.AnonymousClass3F4;
import X.C18700tb;
import X.C18800tq;
import X.C20810yC;
import X.C33511fU;
import X.C34021gK;
import X.C36321k7;
import X.C36341k9;
import X.C36351kA;
import X.C36391kE;
import X.C36401kF;
import X.C36431kI;
import X.C36441kJ;
import X.C64993Qh;
import X.C87184Nu;
import X.C88854Uh;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import java.util.Iterator;
import java.util.List;

public class TemplateRowContentLayout extends LinearLayout implements C18700tb {
    public TextEmojiLabel A00;
    public C64993Qh A01;
    public C20810yC A02;
    public AnonymousClass1TF A03;
    public AnonymousClass1QZ A04;
    public View A05;
    public AnonymousClass01z A06;
    public TextEmojiLabel A07;
    public AnonymousClass2IR A08;
    public C87184Nu A09;
    public AnonymousClass1RJ A0A;
    public boolean A0B;
    public final List A0C;

    private void A00(Context context) {
        setOrientation(1);
        View.inflate(context, R.layout.f9nameremoved, this);
        this.A07 = C36401kF.A0P(this, R.id.top_message);
        this.A00 = C36401kF.A0P(this, R.id.bottom_message);
        this.A0A = C36341k9.A0Y(this, R.id.template_button_list);
        this.A05 = findViewById(R.id.button_divider);
        List<TextView> list = this.A0C;
        list.add(findViewById(R.id.action_btn_1));
        list.add(findViewById(R.id.action_btn_2));
        list.add(findViewById(R.id.action_btn_3));
        for (TextView A032 : list) {
            C33511fU.A03(A032);
        }
    }

    public void A02(AnonymousClass01z r13, AnonymousClass2IR r14, C87184Nu r15) {
        TextEmojiLabel textEmojiLabel;
        int A022;
        AnonymousClass2IR r6 = r14;
        this.A08 = r14;
        this.A09 = r15;
        this.A06 = r13;
        AnonymousClass3F4 BIE = ((C88854Uh) r14.getFMessage()).BIE();
        String str = BIE.A03;
        String str2 = BIE.A02;
        if (!TextUtils.isEmpty(str)) {
            r14.setMessageText(str2, this.A07, r14.getFMessage());
            C36321k7.A0r(this.A02, this.A07);
            this.A00.setLinkHandler((C34021gK) null);
            this.A07.setVisibility(0);
            r6.A1s(this.A00, r14.getFMessage(), str, false, true);
            this.A00.setTextSize(r14.A0r.A03(r14.getResources(), -1));
            textEmojiLabel = this.A00;
            A022 = r14.getSecondaryTextColor();
        } else {
            r14.setMessageText(str2, this.A00, r14.getFMessage());
            C36321k7.A0r(this.A02, this.A00);
            this.A07.setVisibility(8);
            this.A00.setTextSize(r14.getTextFontSize());
            textEmojiLabel = this.A00;
            A022 = C36351kA.A02(r14.getContext(), r14.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved);
        }
        textEmojiLabel.setTextColor(A022);
        this.A05.setVisibility(8);
        Iterator it = this.A0C.iterator();
        while (it.hasNext()) {
            C36431kI.A0K(it).setVisibility(8);
        }
        this.A0A.A03(0);
        ((TemplateButtonListLayout) this.A0A.A01()).A02(r13, r14, r15);
    }

    public void A01() {
        if (!this.A0B) {
            this.A0B = true;
            C18800tq A0W = C36391kE.A0W(generatedComponent());
            this.A02 = C36341k9.A0V(A0W);
            this.A01 = A0W.A62();
            this.A03 = (AnonymousClass1TF) A0W.AV5.get();
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A04;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    public TextEmojiLabel getContentTextView() {
        if (this.A07.getVisibility() == 0) {
            return this.A07;
        }
        return this.A00;
    }

    public TemplateRowContentLayout(Context context) {
        super(context);
        A01();
        this.A0C = AnonymousClass001.A0I();
        A00(context);
    }

    public TextEmojiLabel getFooterTextView() {
        return this.A00;
    }

    public void setEnabled(boolean z) {
        C87184Nu r1;
        AnonymousClass01z r0;
        super.setEnabled(z);
        AnonymousClass2IR r2 = this.A08;
        if (r2 != null && (r1 = this.A09) != null && (r0 = this.A06) != null) {
            A02(r0, r2, r1);
        }
    }

    public static void setupContentView(C20810yC r0, TextEmojiLabel textEmojiLabel) {
        C36321k7.A0r(r0, textEmojiLabel);
    }

    public TemplateRowContentLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
        this.A0C = AnonymousClass001.A0I();
        A00(context);
    }

    public TemplateRowContentLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A01();
    }

    public TemplateRowContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
        this.A0C = AnonymousClass001.A0I();
        A00(context);
    }
}
