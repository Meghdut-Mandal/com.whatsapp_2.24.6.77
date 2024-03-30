package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass00C;
import X.AnonymousClass1RJ;
import X.C36341k9;
import X.C36361kB;
import X.C79443tj;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;

public final class ConversationRowMediaControlView extends FrameLayout {
    public final View A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextView A03;
    public final AnonymousClass1RJ A04;
    public final AnonymousClass1RJ A05;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ConversationRowMediaControlView(Context context) {
        this(context, (AttributeSet) null);
        AnonymousClass00C.A0D(context, 1);
    }

    public final View getButton() {
        return this.A00;
    }

    public final AnonymousClass1RJ getCancelBtnViewStubHolder() {
        return this.A04;
    }

    public final ImageView getIcon() {
        return this.A01;
    }

    public final TextView getPrimaryTextView() {
        return this.A02;
    }

    public final AnonymousClass1RJ getProgressBarViewStubHolder() {
        return this.A05;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationRowMediaControlView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
        LayoutInflater.from(context).inflate(R.layout.f9nameremoved, this, true);
        this.A04 = C36341k9.A0X(this, R.id.media_control_cancel_btn);
        AnonymousClass1RJ A0X = C36341k9.A0X(this, R.id.media_control_progress_bar);
        this.A05 = A0X;
        A0X.A07(C79443tj.A00);
        this.A01 = C36341k9.A0L(this, R.id.media_control_icon);
        this.A00 = C36361kB.A0G(this, R.id.media_control_btn);
        this.A02 = C36341k9.A0M(this, R.id.media_control_primary_text);
        this.A03 = C36341k9.A0M(this, R.id.media_control_secondary_text);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ConversationRowMediaControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AnonymousClass00C.A0D(context, 1);
    }
}
