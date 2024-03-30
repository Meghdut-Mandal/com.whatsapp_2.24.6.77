package com.whatsapp.conversation.conversationrow.components.contextcard;

import X.AnonymousClass00C;
import X.AnonymousClass01G;
import X.AnonymousClass11F;
import X.AnonymousClass141;
import X.AnonymousClass147;
import X.AnonymousClass1RY;
import X.AnonymousClass4ZG;
import X.AnonymousClass5ZS;
import X.C05250Oz;
import X.C18800tq;
import X.C22929Ayf;
import X.C27751Pr;
import X.C27851Qb;
import X.C27861Qc;
import X.C36331k8;
import X.C36341k9;
import X.C36381kD;
import X.C36391kE;
import X.C39731tR;
import X.C53982sD;
import X.C65533Sl;
import X.C86724Ma;
import X.C87204Nw;
import X.C88554Td;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.WaImageView;

public final class GroupPhotoHeader extends WaImageView implements C22929Ayf {
    public C87204Nw A00;
    public C27751Pr A01;
    public C39731tR A02;
    public boolean A03;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GroupPhotoHeader(Context context) {
        this(context, (AttributeSet) null, 0);
        AnonymousClass00C.A0D(context, 1);
    }

    public final void setPathDrawableHelper(C27751Pr r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    public final void setViewModelFactory(C87204Nw r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public void A03() {
        if (!this.A03) {
            this.A03 = true;
            C27861Qc r2 = (C27861Qc) ((C27851Qb) generatedComponent());
            C18800tq r1 = r2.A0M;
            AnonymousClass5ZS.A00(this, C36341k9.A0T(r1));
            this.A01 = C36381kD.A0b(r1);
            this.A00 = (C87204Nw) r2.A04.get();
        }
    }

    public final C27751Pr getPathDrawableHelper() {
        C27751Pr r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("pathDrawableHelper");
    }

    public final C87204Nw getViewModelFactory() {
        C87204Nw r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("viewModelFactory");
    }

    public final void A04(AnonymousClass141 r5, AnonymousClass1RY r6) {
        AnonymousClass01G r3 = (AnonymousClass01G) C36391kE.A0E(this);
        C65533Sl r0 = AnonymousClass147.A01;
        AnonymousClass11F r02 = null;
        if (r5 != null) {
            r02 = r5.A0H;
        }
        AnonymousClass147 A032 = C65533Sl.A03(r02);
        if (A032 != null) {
            C87204Nw viewModelFactory = getViewModelFactory();
            AnonymousClass00C.A0D(r3, 0);
            C39731tR r03 = (C39731tR) AnonymousClass4ZG.A00(r3, A032, viewModelFactory, 4).A00(C39731tR.class);
            this.A02 = r03;
            if (r03 == null) {
                throw C36331k8.A0a();
            }
            C88554Td.A00(r3, r03.A00, new C86724Ma(r6, this, r5), 47);
        }
        r6.A04(this, new C53982sD(this, 6), r5, C36391kE.A06(this));
    }

    public LinearLayout.LayoutParams getHeaderLayoutParams() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, C36391kE.A06(this));
        layoutParams.gravity = 1;
        return layoutParams;
    }

    public View getHeaderView() {
        return this;
    }

    public /* synthetic */ GroupPhotoHeader(Context context, AttributeSet attributeSet, int i, int i2, C05250Oz r7) {
        this(context, C36381kD.A0I(attributeSet, i2), C36391kE.A01(i2, i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupPhotoHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
        A03();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GroupPhotoHeader(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AnonymousClass00C.A0D(context, 1);
    }
}
