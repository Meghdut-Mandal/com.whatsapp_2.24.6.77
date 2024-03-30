package com.whatsapp.components;

import X.AnonymousClass00C;
import X.AnonymousClass0BT;
import X.AnonymousClass11F;
import X.AnonymousClass147;
import X.AnonymousClass1QZ;
import X.AnonymousClass3HA;
import X.C05250Oz;
import X.C18700tb;
import X.C225314u;
import X.C27111My;
import X.C27851Qb;
import X.C27861Qc;
import X.C36331k8;
import X.C36381kD;
import X.C36391kE;
import X.C36441kJ;
import X.C45632Sc;
import X.C48872iC;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.whatsapp.R;

public final class InviteViaLinkView extends RelativeLayout implements C18700tb {
    public AnonymousClass3HA A00;
    public AnonymousClass1QZ A01;
    public boolean A02;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public InviteViaLinkView(Context context) {
        this(context, (AttributeSet) null, 0);
        AnonymousClass00C.A0D(context, 1);
    }

    public final void setGroupInviteClickUtils(AnonymousClass3HA r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final void setupOnClick(AnonymousClass11F r8, C225314u r9, C45632Sc r10, AnonymousClass147 r11) {
        C36331k8.A1I(r8, r9);
        setOnClickListener(new C48872iC(r9, r10, r11, r8, this, 0));
    }

    public static /* synthetic */ void setupOnClick$default(InviteViaLinkView inviteViaLinkView, AnonymousClass11F r2, C225314u r3, C45632Sc r4, AnonymousClass147 r5, int i, Object obj) {
        if ((i & 8) != 0) {
            r5 = null;
        }
        inviteViaLinkView.setupOnClick(r2, r3, r4, r5);
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A01;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass3HA getGroupInviteClickUtils() {
        AnonymousClass3HA r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("groupInviteClickUtils");
    }

    public /* synthetic */ InviteViaLinkView(Context context, AttributeSet attributeSet, int i, int i2, C05250Oz r7) {
        this(context, C36381kD.A0I(attributeSet, i2), C36391kE.A01(i2, i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InviteViaLinkView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
        if (!this.A02) {
            this.A02 = true;
            this.A00 = C27111My.A2H(((C27861Qc) ((C27851Qb) generatedComponent())).A0L);
        }
        View.inflate(context, R.layout.f9nameremoved, this);
        if (attributeSet == null) {
            setId(R.id.invite_via_link_button);
            setLayoutParams(new RelativeLayout.LayoutParams(-1, getResources().getDimensionPixelSize(R.dimen.f7nameremoved)));
            setBackground(AnonymousClass0BT.A00(context.getTheme(), getResources(), R.drawable.selector_orange_gradient));
            setGravity(16);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public InviteViaLinkView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AnonymousClass00C.A0D(context, 1);
    }
}
