package com.whatsapp.calling.lightweightcalling.view;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass1RJ;
import X.C05250Oz;
import X.C152427Kl;
import X.C152437Km;
import X.C152447Kn;
import X.C152457Ko;
import X.C152467Kp;
import X.C153287Nt;
import X.C157257cf;
import X.C36381kD;
import X.C36391kE;
import X.C36431kI;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.R;

public final class AudioChatBottomSheetFooterView extends ConstraintLayout {
    public C157257cf A00;
    public final AnonymousClass00T A01;
    public final AnonymousClass00T A02;
    public final AnonymousClass00T A03;
    public final AnonymousClass00T A04;
    public final AnonymousClass00T A05;
    public final AnonymousClass00T A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AudioChatBottomSheetFooterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
        this.A05 = C36431kI.A1I(new C152457Ko(this));
        this.A04 = C36431kI.A1I(new C152447Kn(this));
        this.A01 = C36431kI.A1I(new C152427Kl(this));
        this.A03 = C36431kI.A1I(new C153287Nt(context, this));
        this.A02 = C36431kI.A1I(new C152437Km(this));
        this.A06 = C36431kI.A1I(new C152467Kp(this));
        View.inflate(context, R.layout.f9nameremoved, this);
    }

    private final AnonymousClass1RJ getBluetoothButtonStub() {
        return (AnonymousClass1RJ) this.A01.getValue();
    }

    private final AnonymousClass1RJ getJoinButtonStub() {
        return (AnonymousClass1RJ) this.A02.getValue();
    }

    private final AnonymousClass1RJ getLeaveButtonStub() {
        return (AnonymousClass1RJ) this.A03.getValue();
    }

    private final AnonymousClass1RJ getMuteButtonStub() {
        return (AnonymousClass1RJ) this.A04.getValue();
    }

    private final AnonymousClass1RJ getSpeakerButtonStub() {
        return (AnonymousClass1RJ) this.A05.getValue();
    }

    private final AnonymousClass1RJ getStartButtonStub() {
        return (AnonymousClass1RJ) this.A06.getValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0077, code lost:
        if (r0 != false) goto L_0x0079;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(java.util.Collection r12) {
        /*
            r11 = this;
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()
            java.util.Iterator r10 = r12.iterator()
            r9 = 0
        L_0x0009:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x010c
            java.lang.Object r1 = r10.next()
            X.66I r1 = (X.AnonymousClass66I) r1
            boolean r3 = r1 instanceof X.AnonymousClass53B
            r8 = 1
            r7 = 0
            if (r3 == 0) goto L_0x00d0
            X.1RJ r4 = r11.getLeaveButtonStub()
        L_0x001f:
            r8 = 0
        L_0x0020:
            r6 = 0
        L_0x0021:
            boolean r0 = r1.A01
            r5 = 0
            if (r0 == 0) goto L_0x00c9
            android.view.View r4 = X.C36391kE.A0L(r4, r7)
            boolean r0 = r1.A00
            r4.setSelected(r0)
            if (r6 == 0) goto L_0x003b
            boolean r0 = r4 instanceof com.whatsapp.wds.components.button.WDSButton
            if (r0 == 0) goto L_0x003b
            r0 = r4
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r6)
        L_0x003b:
            android.content.Context r6 = r11.getContext()
            boolean r7 = r1 instanceof X.AnonymousClass53C
            if (r7 == 0) goto L_0x009e
            r0 = 2131895810(0x7f122602, float:1.9426464E38)
        L_0x0046:
            java.lang.String r6 = r6.getString(r0)
            if (r7 == 0) goto L_0x007e
            r0 = 2131895810(0x7f122602, float:1.9426464E38)
        L_0x004f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L_0x0061
            int r1 = r0.intValue()
            android.content.Context r0 = r11.getContext()
            java.lang.String r5 = r0.getString(r1)
        L_0x0061:
            X.AnonymousClass3UE.A06(r4, r6, r5)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            X.011 r0 = X.C36441kJ.A19(r4, r0)
            java.lang.Object r1 = r0.first
            java.lang.Object r0 = r0.second
            boolean r0 = X.AnonymousClass000.A1X(r0)
            if (r9 != 0) goto L_0x0079
            r9 = 0
            if (r0 == 0) goto L_0x007a
        L_0x0079:
            r9 = 1
        L_0x007a:
            r2.add(r1)
            goto L_0x0009
        L_0x007e:
            boolean r0 = r1 instanceof X.AnonymousClass53E
            if (r0 == 0) goto L_0x0087
            X.53E r1 = (X.AnonymousClass53E) r1
            int r0 = r1.A00
            goto L_0x004f
        L_0x0087:
            if (r3 == 0) goto L_0x008d
            r0 = 2131895966(0x7f12269e, float:1.942678E38)
            goto L_0x004f
        L_0x008d:
            boolean r0 = r1 instanceof X.AnonymousClass53F
            if (r0 == 0) goto L_0x0096
            X.53F r1 = (X.AnonymousClass53F) r1
            int r0 = r1.A00
            goto L_0x004f
        L_0x0096:
            boolean r0 = r1 instanceof X.AnonymousClass53D
            if (r0 == 0) goto L_0x0061
            r0 = 2131895949(0x7f12268d, float:1.9426745E38)
            goto L_0x004f
        L_0x009e:
            boolean r0 = r1 instanceof X.AnonymousClass53A
            if (r0 == 0) goto L_0x00a8
            r0 = r1
            X.53A r0 = (X.AnonymousClass53A) r0
            int r0 = r0.A00
            goto L_0x0046
        L_0x00a8:
            boolean r0 = r1 instanceof X.AnonymousClass53E
            if (r0 == 0) goto L_0x00b2
            r0 = r1
            X.53E r0 = (X.AnonymousClass53E) r0
            int r0 = r0.A01
            goto L_0x0046
        L_0x00b2:
            if (r3 == 0) goto L_0x00b8
            r0 = 2131895966(0x7f12269e, float:1.942678E38)
            goto L_0x0046
        L_0x00b8:
            boolean r0 = r1 instanceof X.AnonymousClass53F
            if (r0 == 0) goto L_0x00c2
            r0 = r1
            X.53F r0 = (X.AnonymousClass53F) r0
            int r0 = r0.A01
            goto L_0x0046
        L_0x00c2:
            r0 = r1
            X.53D r0 = (X.AnonymousClass53D) r0
            int r0 = r0.A00
            goto L_0x0046
        L_0x00c9:
            r0 = 8
            r4.A03(r0)
            goto L_0x0009
        L_0x00d0:
            boolean r0 = r1 instanceof X.AnonymousClass53E
            if (r0 == 0) goto L_0x00da
            X.1RJ r4 = r11.getMuteButtonStub()
            goto L_0x001f
        L_0x00da:
            boolean r0 = r1 instanceof X.AnonymousClass53A
            if (r0 == 0) goto L_0x00e4
            X.1RJ r4 = r11.getSpeakerButtonStub()
            goto L_0x001f
        L_0x00e4:
            boolean r0 = r1 instanceof X.AnonymousClass53D
            if (r0 == 0) goto L_0x00ee
            X.1RJ r4 = r11.getBluetoothButtonStub()
            goto L_0x001f
        L_0x00ee:
            boolean r0 = r1 instanceof X.AnonymousClass53F
            if (r0 == 0) goto L_0x00fd
            X.1RJ r4 = r11.getJoinButtonStub()
            r0 = r1
            X.53F r0 = (X.AnonymousClass53F) r0
            int r6 = r0.A02
            goto L_0x0021
        L_0x00fd:
            boolean r0 = r1 instanceof X.AnonymousClass53C
            if (r0 == 0) goto L_0x0107
            X.1RJ r4 = r11.getStartButtonStub()
            goto L_0x0020
        L_0x0107:
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        L_0x010c:
            android.content.res.Resources r1 = r11.getResources()
            r0 = 2131168382(0x7f070c7e, float:1.7951064E38)
            if (r9 == 0) goto L_0x0118
            r0 = 2131168377(0x7f070c79, float:1.7951054E38)
        L_0x0118:
            int r0 = r1.getDimensionPixelSize(r0)
            int r5 = r0 / 2
            java.util.Iterator r4 = r2.iterator()
        L_0x0122:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0141
            android.view.View r3 = X.C36431kI.A0K(r4)
            boolean r0 = r3 instanceof com.whatsapp.WaImageButton
            if (r0 == 0) goto L_0x0122
            X.3QI r0 = X.C65723Tf.A01(r3)
            int r2 = r0.A03
            int r1 = r0.A00
            X.3QI r0 = new X.3QI
            r0.<init>(r5, r2, r5, r1)
            X.C65723Tf.A02(r3, r0)
            goto L_0x0122
        L_0x0141:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetFooterView.A06(java.util.Collection):void");
    }

    public final C157257cf getListener() {
        return this.A00;
    }

    public final void setListener(C157257cf r1) {
        this.A00 = r1;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AudioChatBottomSheetFooterView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AnonymousClass00C.A0D(context, 1);
    }

    public /* synthetic */ AudioChatBottomSheetFooterView(Context context, AttributeSet attributeSet, int i, int i2, C05250Oz r7) {
        this(context, C36381kD.A0I(attributeSet, i2), C36391kE.A01(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AudioChatBottomSheetFooterView(Context context) {
        this(context, (AttributeSet) null, 0);
        AnonymousClass00C.A0D(context, 1);
    }
}
