package com.whatsapp.conversation.conversationrow.components.contextcard;

import X.AnonymousClass00C;
import X.AnonymousClass5ZS;
import X.C05250Oz;
import X.C18800tq;
import X.C22929Ayf;
import X.C27751Pr;
import X.C36331k8;
import X.C36341k9;
import X.C36381kD;
import X.C36391kE;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.whatsapp.WaImageView;

public final class CommunityPhotoHeader extends WaImageView implements C22929Ayf {
    public C27751Pr A00;
    public boolean A01;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CommunityPhotoHeader(Context context) {
        this(context, (AttributeSet) null, 0);
        AnonymousClass00C.A0D(context, 1);
    }

    public final void setPathDrawableHelper(C27751Pr r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public void A03() {
        if (!this.A01) {
            this.A01 = true;
            C18800tq A0W = C36391kE.A0W(generatedComponent());
            AnonymousClass5ZS.A00(this, C36341k9.A0T(A0W));
            this.A00 = C36381kD.A0b(A0W);
        }
    }

    public final C27751Pr getPathDrawableHelper() {
        C27751Pr r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("pathDrawableHelper");
    }

    public LinearLayout.LayoutParams getHeaderLayoutParams() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, C36391kE.A06(this));
        layoutParams.gravity = 1;
        return layoutParams;
    }

    public View getHeaderView() {
        return this;
    }

    public /* synthetic */ CommunityPhotoHeader(Context context, AttributeSet attributeSet, int i, int i2, C05250Oz r7) {
        this(context, C36381kD.A0I(attributeSet, i2), C36391kE.A01(i2, i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommunityPhotoHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
        A03();
        setScaleType(ImageView.ScaleType.FIT_CENTER);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CommunityPhotoHeader(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AnonymousClass00C.A0D(context, 1);
    }
}
