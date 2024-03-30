package com.whatsapp.calling.views;

import X.AnonymousClass1QZ;
import X.C18700tb;
import X.C27851Qb;
import X.C27861Qc;
import X.C33521fV;
import X.C36351kA;
import X.C36391kE;
import X.C36431kI;
import X.C36441kJ;
import X.C90504aG;
import X.C93124fp;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;

public class VoipReturnToCallBanner extends C93124fp implements C18700tb {
    public AnonymousClass1QZ A00;
    public boolean A01;
    public final TextView A02;
    public final TextView A03;
    public final WaImageView A04;

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A00;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public void setCallNotificationTimer(long j) {
        TextView textView = this.A02;
        textView.setVisibility(0);
        C90504aG.A16(textView, this.A08, C36391kE.A0B(j));
        textView.setTag(Long.valueOf(j));
    }

    public VoipReturnToCallBanner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            C27861Qc.A0f((C27861Qc) ((C27851Qb) generatedComponent()), this);
        }
    }

    public VoipReturnToCallBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            C27861Qc.A0f((C27861Qc) ((C27851Qb) generatedComponent()), this);
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.f9nameremoved, this, true);
        TextView A0O = C36391kE.A0O(inflate, R.id.call_notification_timer);
        this.A02 = A0O;
        this.A03 = C36391kE.A0O(inflate, R.id.call_notification_title);
        this.A04 = C36431kI.A0X(inflate, R.id.call_notification_icon);
        A0O.setFocusable(true);
        setTimerAccessibility(A0O);
        setBannerClickListener(context, this);
        C33521fV.A02(this);
        setVisibility(C36351kA.A00(this.A01.A00() ? 1 : 0));
        C36391kE.A1K(A0O);
        A0O.setTag((Object) null);
    }

    public VoipReturnToCallBanner(Context context) {
        this(context, (AttributeSet) null);
    }
}
