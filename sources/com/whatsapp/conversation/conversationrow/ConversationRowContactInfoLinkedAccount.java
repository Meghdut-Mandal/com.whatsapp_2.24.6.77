package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass00C;
import X.AnonymousClass00E;
import X.AnonymousClass1QZ;
import X.C18700tb;
import X.C36331k8;
import X.C36341k9;
import X.C36361kB;
import X.C36441kJ;
import X.C56832wx;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

public final class ConversationRowContactInfoLinkedAccount extends LinearLayout implements C18700tb {
    public WaTextView A00;
    public AnonymousClass1QZ A01;
    public boolean A02;
    public WaImageView A03;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ConversationRowContactInfoLinkedAccount(Context context) {
        this(context, (AttributeSet) null);
        AnonymousClass00C.A0D(context, 1);
    }

    public static /* synthetic */ void getAccountType$annotations() {
    }

    private final void setIcon(Drawable drawable) {
        WaImageView waImageView = this.A03;
        if (waImageView == null) {
            throw C36331k8.A0d(PublicKeyCredentialControllerUtility.JSON_KEY_ICON);
        }
        waImageView.setImageDrawable(drawable);
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A01;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    private final void A00(Context context, AttributeSet attributeSet) {
        Context context2;
        int i;
        View.inflate(context, R.layout.f9nameremoved, this);
        this.A03 = (WaImageView) C36361kB.A0G(this, R.id.linked_account_icon);
        this.A00 = C36341k9.A0Q(this, R.id.linked_account_info);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C56832wx.A01);
        AnonymousClass00C.A08(obtainStyledAttributes);
        try {
            int integer = obtainStyledAttributes.getInteger(0, 0);
            if (integer != 0) {
                if (integer == 1) {
                    context2 = getContext();
                    i = R.drawable.ic_business_instagram;
                }
            }
            context2 = getContext();
            i = R.drawable.ic_settings_fb;
            setIcon(AnonymousClass00E.A00(context2, i));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationRowContactInfoLinkedAccount(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        A00(context, attributeSet);
    }

    public ConversationRowContactInfoLinkedAccount(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationRowContactInfoLinkedAccount(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        A00(context, attributeSet);
    }
}
