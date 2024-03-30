package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.button.WDSButtonGroup;
import com.whatsapp.wds.components.internal.header.WDSHeader;

/* renamed from: X.1rH  reason: invalid class name and case insensitive filesystem */
public final class C39121rH extends ConstraintLayout implements AnonymousClass4SZ {
    public final Button A00 = ((Button) C36361kB.A0G(this, R.id.primary_button));
    public final Button A01 = ((Button) C36361kB.A0G(this, R.id.secondary_button));
    public final WDSButtonGroup A02 = ((WDSButtonGroup) C36361kB.A0G(this, R.id.button_group));
    public final WaTextView A03 = C36341k9.A0Q(this, R.id.footnote);
    public final WDSHeader A04 = ((WDSHeader) C36361kB.A0G(this, R.id.header));

    public C39121rH(Context context) {
        super(context, (AttributeSet) null);
        int A05 = C36441kJ.A05(context.getResources(), R.dimen.f7nameremoved);
        setPadding(A05, 0, A05, 0);
        C36341k9.A0q(context, this, R.color.f6nameremoved);
        View.inflate(context, R.layout.f9nameremoved, this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002a, code lost:
        if (r2 != null) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setViewState(X.C50992my r5) {
        /*
            r4 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r5, r0)
            com.whatsapp.wds.components.internal.header.WDSHeader r1 = r4.A04
            X.3Jp r0 = r5.A02
            r1.setViewState(r0)
            java.lang.CharSequence r1 = r5.A03
            com.whatsapp.WaTextView r0 = r4.A03
            X.C65723Tf.A03(r0, r1)
            r0.setText(r1)
            X.3Ik r3 = r5.A00
            X.3Ik r2 = r5.A01
            android.widget.Button r0 = r4.A00
            r1 = 4
            X.C55992vX.A00(r0, r3, r1)
            android.widget.Button r0 = r4.A01
            X.C55992vX.A00(r0, r2, r1)
            com.whatsapp.wds.components.button.WDSButtonGroup r1 = r4.A02
            if (r3 != 0) goto L_0x002c
            r0 = 8
            if (r2 == 0) goto L_0x002d
        L_0x002c:
            r0 = 0
        L_0x002d:
            r1.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39121rH.setViewState(X.2my):void");
    }
}
