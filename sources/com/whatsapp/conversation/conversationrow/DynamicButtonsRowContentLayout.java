package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass000;
import X.AnonymousClass1QZ;
import X.AnonymousClass2IR;
import X.AnonymousClass37E;
import X.AnonymousClass3T1;
import X.C18700tb;
import X.C202359le;
import X.C20810yC;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36431kI;
import X.C36441kJ;
import X.C61583Cq;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

public class DynamicButtonsRowContentLayout extends LinearLayout implements C18700tb {
    public C20810yC A00;
    public AnonymousClass1QZ A01;
    public boolean A02;
    public final TextEmojiLabel A03;
    public final TextEmojiLabel A04;

    public DynamicButtonsRowContentLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    private void setupContentView(TextEmojiLabel textEmojiLabel) {
        C36331k8.A1A(this.A00, textEmojiLabel);
        textEmojiLabel.setAutoLinkMask(0);
        textEmojiLabel.setLinksClickable(false);
        textEmojiLabel.setClickable(false);
        textEmojiLabel.setLongClickable(false);
    }

    public void A00(AnonymousClass2IR r16) {
        int i;
        TextEmojiLabel textEmojiLabel;
        int A022;
        AnonymousClass2IR r9 = r16;
        AnonymousClass3T1 fMessage = r9.getFMessage();
        AnonymousClass37E A002 = C61583Cq.A00(fMessage);
        if (A002 != null) {
            String str = A002.A00;
            String str2 = A002.A01;
            if (!TextUtils.isEmpty(str)) {
                Context context = getContext();
                Object[] objArr = new Object[1];
                Context context2 = getContext();
                int i2 = fMessage.A1I;
                if (i2 != 0) {
                    i = R.string.f12nameremoved;
                    if (i2 != 1) {
                        i = R.string.f12nameremoved;
                        if (i2 != 3) {
                            i = R.string.f12nameremoved;
                            if (i2 != 5) {
                                i = R.string.f12nameremoved;
                                if (i2 != 9) {
                                    i = 0;
                                }
                            }
                        }
                    }
                } else {
                    i = R.string.f12nameremoved;
                }
                StringBuilder sb = new StringBuilder(C36381kD.A0r(context, context2.getString(i), objArr, R.string.f12nameremoved));
                String A0b = fMessage.A0b();
                if (!TextUtils.isEmpty(A0b) && i2 == 0) {
                    sb.append(A0b);
                }
                r9.setContentDescription(AnonymousClass000.A0q(C202359le.A00(fMessage), sb));
                if (!TextUtils.isEmpty(str2)) {
                    TextEmojiLabel textEmojiLabel2 = this.A04;
                    r9.setMessageText(str, textEmojiLabel2, fMessage);
                    textEmojiLabel2.setVisibility(0);
                    textEmojiLabel = this.A03;
                    r9.A1s(textEmojiLabel, fMessage, str2, true, false);
                    textEmojiLabel.setTextSize(r9.A0r.A03(r9.getResources(), -1));
                    A022 = r9.getSecondaryTextColor();
                } else {
                    textEmojiLabel = this.A03;
                    r9.A1s(textEmojiLabel, fMessage, str, true, true);
                    A022 = C36351kA.A02(r9.getContext(), C36431kI.A0A(this.A04, r9, 8), R.attr.f4nameremoved, R.color.f6nameremoved);
                }
                textEmojiLabel.setTextColor(A022);
            }
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A01;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public DynamicButtonsRowContentLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A02) {
            this.A02 = true;
            this.A00 = C36341k9.A0V(C36391kE.A0W(generatedComponent()));
        }
        setOrientation(1);
        View.inflate(context, R.layout.f9nameremoved, this);
        TextEmojiLabel A0P = C36401kF.A0P(this, R.id.top_message);
        this.A04 = A0P;
        TextEmojiLabel A0P2 = C36401kF.A0P(this, R.id.bottom_message);
        this.A03 = A0P2;
        setupContentView(A0P);
        setupContentView(A0P2);
    }

    public DynamicButtonsRowContentLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
