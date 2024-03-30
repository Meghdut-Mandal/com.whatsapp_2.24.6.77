package com.whatsapp.components;

import X.AnonymousClass1QZ;
import X.AnonymousClass1RJ;
import X.C18700tb;
import X.C36341k9;
import X.C36401kF;
import X.C36411kG;
import X.C36441kJ;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

public class ConversationListRowHeaderView extends LinearLayout implements C18700tb {
    public TextEmojiLabel A00;
    public WaTextView A01;
    public AnonymousClass1RJ A02;
    public AnonymousClass1RJ A03;
    public AnonymousClass1QZ A04;
    public boolean A05;

    public void A01() {
        if (!this.A05) {
            this.A05 = true;
            generatedComponent();
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

    public WaImageView getUnreadImportantIndicatorView() {
        return (WaImageView) this.A02.A01();
    }

    public WaTextView getUnreadIndicatorView() {
        return (WaTextView) this.A03.A01();
    }

    public ConversationListRowHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
        A00(context);
    }

    private void A00(Context context) {
        View.inflate(context, R.layout.f9nameremoved, this);
        this.A00 = C36401kF.A0P(this, R.id.conversations_row_contact_name);
        this.A01 = C36411kG.A0Z(this, R.id.conversations_row_date);
        this.A03 = C36341k9.A0Y(this, R.id.conversations_row_unread_indicator);
        this.A02 = C36341k9.A0Y(this, R.id.conversations_row_important_indicator);
        setOrientation(0);
    }

    public TextEmojiLabel getContactNameView() {
        return this.A00;
    }

    public WaTextView getDateView() {
        return this.A01;
    }

    public ConversationListRowHeaderView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A01();
        A00(context);
    }

    public ConversationListRowHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
        A00(context);
    }

    public ConversationListRowHeaderView(Context context) {
        super(context);
        A01();
        A00(context);
    }

    public ConversationListRowHeaderView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A01();
    }
}
