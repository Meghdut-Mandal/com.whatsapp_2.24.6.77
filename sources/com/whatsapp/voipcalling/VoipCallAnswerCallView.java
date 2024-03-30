package com.whatsapp.voipcalling;

import X.C012005e;
import X.C107275Ni;
import X.C27851Qb;
import X.C27861Qc;
import X.C36341k9;
import X.C36391kE;
import X.C36401kF;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public class VoipCallAnswerCallView extends C107275Ni {
    public View A00;
    public View A01;
    public View A02;
    public ImageView A03;
    public ImageView A04;
    public ImageView A05;
    public TextView A06;
    public TextView A07;
    public TextView A08;
    public boolean A09;

    private void A00() {
        this.A03.clearAnimation();
        this.A04.clearAnimation();
        this.A05.clearAnimation();
        this.A06.clearAnimation();
        this.A07.clearAnimation();
        this.A08.clearAnimation();
    }

    public void A02(CallInfo callInfo, String str, boolean z) {
        Log.i("voip/VoipCallAnswerCallView/show");
        super.A02(callInfo, str, z);
        A00();
        setVisibility(0);
        setupCallAnswerBtns(z);
    }

    public VoipCallAnswerCallView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A09) {
            this.A09 = true;
            this.A00 = C36341k9.A0V(((C27861Qc) ((C27851Qb) generatedComponent())).A0M);
        }
        View.inflate(getContext(), R.layout.f9nameremoved, this);
        this.A03 = C36401kF.A0G(this, R.id.accept_incoming_call_view);
        this.A06 = C36391kE.A0O(this, R.id.accept_incoming_call_hint);
        this.A04 = C36401kF.A0G(this, R.id.decline_incoming_call_view);
        this.A07 = C36391kE.A0O(this, R.id.decline_incoming_call_hint);
        this.A05 = C36401kF.A0G(this, R.id.reply_incoming_call_view);
        this.A08 = C36391kE.A0O(this, R.id.decline_with_message_hint);
        this.A00 = C012005e.A02(this, R.id.accept_call_swipe_up_hint_view);
        this.A01 = C012005e.A02(this, R.id.decline_call_swipe_up_hint_view);
        this.A02 = C012005e.A02(this, R.id.reply_call_swipe_up_hint_view);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setupCallAnswerBtns(boolean r12) {
        /*
            r11 = this;
            int r0 = r11.getVisibility()
            if (r0 != 0) goto L_0x0110
            r0 = 2131427367(0x7f0b0027, float:1.8476348E38)
            android.view.View r10 = r11.findViewById(r0)
            com.whatsapp.calling.views.CallResponseLayout r10 = (com.whatsapp.calling.views.CallResponseLayout) r10
            r2 = 1
            X.7fX r0 = new X.7fX
            r0.<init>(r11, r2)
            r10.A02 = r0
            r10.A06 = r2
            r0 = 2131429418(0x7f0b082a, float:1.8480508E38)
            android.view.View r9 = r11.findViewById(r0)
            com.whatsapp.calling.views.CallResponseLayout r9 = (com.whatsapp.calling.views.CallResponseLayout) r9
            r1 = 2
            X.7fX r0 = new X.7fX
            r0.<init>(r11, r1)
            r9.A02 = r0
            r0 = 2131433286(0x7f0b1746, float:1.8488353E38)
            android.view.View r8 = r11.findViewById(r0)
            com.whatsapp.calling.views.CallResponseLayout r8 = (com.whatsapp.calling.views.CallResponseLayout) r8
            boolean r0 = r11.A05
            int r0 = X.C36381kD.A00(r0)
            r8.setVisibility(r0)
            r6 = 0
            X.7fX r0 = new X.7fX
            r0.<init>(r11, r6)
            r8.A02 = r0
            r8.A07 = r2
            android.widget.ImageView r3 = r11.A03
            r10.A01 = r3
            android.widget.ImageView r7 = r11.A04
            r9.A01 = r7
            android.widget.ImageView r4 = r11.A05
            r8.A01 = r4
            android.view.View r5 = r11.A00
            r5.setVisibility(r6)
            r0 = r5
            com.whatsapp.components.AnimatingArrowsLayout r0 = (com.whatsapp.components.AnimatingArrowsLayout) r0
            android.animation.AnimatorSet r0 = r0.A03
            r0.start()
            android.view.View r2 = r11.A01
            r2.clearAnimation()
            r1 = 4
            r2.setVisibility(r1)
            android.view.View r0 = r11.A02
            r0.clearAnimation()
            r0.setVisibility(r1)
            r10.A00 = r5
            r9.A00 = r2
            r8.A00 = r0
            boolean r2 = r11.A04
            com.whatsapp.voipcalling.CallInfo r0 = r11.A02
            boolean r1 = r0.videoEnabled
            if (r2 == 0) goto L_0x0129
            r0 = 2131232562(0x7f080732, float:1.8081237E38)
            if (r1 == 0) goto L_0x0086
            r0 = 2131232560(0x7f080730, float:1.8081233E38)
        L_0x0086:
            r3.setImageResource(r0)
        L_0x0089:
            boolean r0 = r11.A05
            if (r0 == 0) goto L_0x0111
            r2 = 2131894768(0x7f1221f0, float:1.942435E38)
            r1 = 2131886147(0x7f120043, float:1.9406865E38)
        L_0x0093:
            android.widget.TextView r5 = r11.A06
            r5.setText(r2)
            r5.setVisibility(r6)
            r3.setVisibility(r6)
            android.content.Context r0 = r11.getContext()
            X.C36331k8.A0q(r0, r3, r1)
            r11.A00()
            android.view.animation.AnimationSet r0 = X.AnonymousClass3UE.A03(r3)
            r3.startAnimation(r0)
            boolean r1 = r11.A05
            r0 = 4
            if (r1 != 0) goto L_0x00b5
            r0 = 0
        L_0x00b5:
            r7.setVisibility(r6)
            android.widget.TextView r3 = r11.A07
            r3.setVisibility(r0)
            boolean r1 = r11.A05
            r0 = 2131232936(0x7f0808a8, float:1.8081995E38)
            if (r1 == 0) goto L_0x00c7
            r0 = 2131232098(0x7f080562, float:1.8080296E38)
        L_0x00c7:
            r7.setImageResource(r0)
            boolean r0 = r11.A05
            r2 = 2131895892(0x7f122654, float:1.942663E38)
            r1 = 2131888638(0x7f1209fe, float:1.9411917E38)
            if (r0 == 0) goto L_0x00da
            r2 = 2131894769(0x7f1221f1, float:1.9424352E38)
            r1 = 2131888641(0x7f120a01, float:1.9411923E38)
        L_0x00da:
            android.content.Context r0 = r11.getContext()
            X.C36331k8.A0q(r0, r7, r1)
            r3.setText(r2)
            r0 = 9
            X.AnonymousClass6UI.A00(r7, r11, r0)
            boolean r0 = r11.A05
            int r0 = X.C36381kD.A00(r0)
            r4.setVisibility(r6)
            android.widget.TextView r1 = r11.A08
            r1.setVisibility(r0)
            r0 = 10
            X.AnonymousClass6UI.A00(r4, r11, r0)
            if (r12 == 0) goto L_0x0110
            r0 = 2131886139(0x7f12003b, float:1.9406848E38)
            r5.setText(r0)
            r0 = 2131888639(0x7f1209ff, float:1.941192E38)
            r3.setText(r0)
            r0 = 2131893558(0x7f121d36, float:1.9421896E38)
            r1.setText(r0)
        L_0x0110:
            return
        L_0x0111:
            java.lang.String r1 = X.C114145gi.A07
            java.lang.String r0 = r11.A03
            boolean r0 = r1.equals(r0)
            r2 = 2131894767(0x7f1221ef, float:1.9424348E38)
            r1 = 2131886138(0x7f12003a, float:1.9406846E38)
            if (r0 == 0) goto L_0x0093
            r2 = 2131894770(0x7f1221f2, float:1.9424354E38)
            r1 = 2131889205(0x7f120c35, float:1.9413067E38)
            goto L_0x0093
        L_0x0129:
            if (r1 == 0) goto L_0x0089
            r0 = 2131232088(0x7f080558, float:1.8080275E38)
            goto L_0x0086
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipCallAnswerCallView.setupCallAnswerBtns(boolean):void");
    }

    public VoipCallAnswerCallView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VoipCallAnswerCallView(Context context) {
        this(context, (AttributeSet) null);
    }
}
