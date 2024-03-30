package com.whatsapp.conversation.conversationrow;

import X.C36411kG;
import X.C38511p5;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class ConversationRowParticipantHeaderQuotedView extends C38511p5 {
    public View getSecondaryNameView() {
        return getChildAt(2);
    }

    public View getPrimaryNameView() {
        return C36411kG.A0L(this);
    }

    public ConversationRowParticipantHeaderQuotedView(Context context) {
        super(context);
    }

    public /* bridge */ /* synthetic */ void setShouldTruncateNameViewWhenNeeded(boolean z) {
        this.A00 = z;
    }

    public ConversationRowParticipantHeaderQuotedView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ConversationRowParticipantHeaderQuotedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
