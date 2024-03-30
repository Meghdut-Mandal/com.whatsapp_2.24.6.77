package com.whatsapp.community;

import X.AnonymousClass141;
import X.AnonymousClass1Pp;
import X.AnonymousClass1RY;
import X.C144446sC;
import X.C18820ts;
import X.C36321k7;
import X.C36341k9;
import X.C36401kF;
import X.C36431kI;
import X.C87654Pq;
import X.C92894ew;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaImageView;

public class CommunityStackView extends C92894ew implements C87654Pq {
    public WaImageView A00;
    public AnonymousClass1Pp A01;
    public C18820ts A02;

    public void setParentGroupProfilePhoto(AnonymousClass141 r5, AnonymousClass1RY r6) {
        r6.A06(this.A00, new C144446sC(this.A01, C36341k9.A0F(this).getDimensionPixelSize(R.dimen.f7nameremoved)), r5, false);
    }

    public CommunityStackView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.f9nameremoved, this, true);
        this.A00 = C36431kI.A0X(this, R.id.parent_group_profile_photo);
        C36321k7.A0L(context, C36401kF.A0G(this, R.id.community_stack_pile_bottom_crescents), this.A02, R.drawable.vec_community_avatar_stacked_frame);
    }

    public View getTransitionView() {
        return this.A00;
    }

    public CommunityStackView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CommunityStackView(Context context) {
        this(context, (AttributeSet) null);
    }
}
