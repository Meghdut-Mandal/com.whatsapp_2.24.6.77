package com.whatsapp;

import X.AnonymousClass1QZ;
import X.AnonymousClass1RJ;
import X.C012005e;
import X.C18700tb;
import X.C19420v0;
import X.C27851Qb;
import X.C27861Qc;
import X.C36341k9;
import X.C36351kA;
import X.C36401kF;
import X.C36431kI;
import X.C36441kJ;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import com.whatsapp.wds.components.button.WDSButton;

public class EmptyTellAFriendView extends ScrollView implements C18700tb {
    public WaTextView A00;
    public C19420v0 A01;
    public AnonymousClass1QZ A02;
    public AnonymousClass1RJ A03;
    public WDSButton A04;
    public boolean A05;

    public void A01() {
        if (!this.A05) {
            this.A05 = true;
            this.A01 = C36351kA.A0Y(((C27861Qc) ((C27851Qb) generatedComponent())).A0M);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A02;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public void setInviteButtonClickListener(View.OnClickListener onClickListener) {
        this.A04.setOnClickListener(onClickListener);
    }

    public EmptyTellAFriendView(Context context) {
        super(context);
        A01();
        A00(true);
    }

    private void A00(boolean z) {
        View.inflate(getContext(), R.layout.f9nameremoved, this);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.A04 = C36431kI.A0y(this, R.id.invite_button_tell_a_friend);
        this.A00 = C36401kF.A0Q(this, R.id.subtitle_tell_a_friend);
        if (!z) {
            View A022 = C012005e.A02(this, R.id.container);
            C36341k9.A0z(A022, A022.getPaddingLeft(), 0);
        }
        boolean equals = String.valueOf(91).equals(this.A01.A0f());
        WaTextView waTextView = this.A00;
        int i = R.string.f12nameremoved;
        if (equals) {
            i = R.string.f12nameremoved;
        }
        waTextView.setText(i);
        this.A03 = C36341k9.A0Y(this, R.id.empty_invite_image);
    }

    public void setImage(int i) {
        if (getResources().getBoolean(R.bool.f5nameremoved)) {
            this.A03.A03(0);
            ((ImageView) this.A03.A01()).setImageResource(i);
        }
    }

    public EmptyTellAFriendView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
        A00(true);
    }

    public EmptyTellAFriendView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A01();
    }

    public EmptyTellAFriendView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
        A00(true);
    }

    public EmptyTellAFriendView(Context context, boolean z) {
        super(context);
        A01();
        A00(z);
    }
}
