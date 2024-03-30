package com.whatsapp.calling.views;

import X.AnonymousClass13J;
import X.AnonymousClass17Y;
import X.AnonymousClass185;
import X.AnonymousClass1KK;
import X.AnonymousClass1QZ;
import X.AnonymousClass1RJ;
import X.AnonymousClass3UE;
import X.C012005e;
import X.C18700tb;
import X.C18800tq;
import X.C19770wU;
import X.C20810yC;
import X.C34681hT;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36371kC;
import X.C36391kE;
import X.C36441kJ;
import X.C90514aH;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.voipcalling.camera.VoipCameraManager;

public class VoipCallFooter extends LinearLayout implements C18700tb {
    public View.OnClickListener A00;
    public View.OnClickListener A01;
    public View A02;
    public ImageButton A03;
    public ImageButton A04;
    public ImageButton A05;
    public AnonymousClass17Y A06;
    public AnonymousClass1KK A07;
    public AnonymousClass185 A08;
    public C20810yC A09;
    public AnonymousClass13J A0A;
    public C19770wU A0B;
    public VoipCameraManager A0C;
    public AnonymousClass1QZ A0D;
    public boolean A0E;
    public View A0F;
    public boolean A0G;
    public final View A0H;
    public final ImageButton A0I;
    public final ImageButton A0J;
    public final ImageButton A0K;
    public final View A0L;
    public final View A0M;
    public final View A0N;
    public final ImageButton A0O;
    public final ImageButton A0P;
    public final AnonymousClass1RJ A0Q;

    private void setMuteButtonEnabled(boolean z) {
        AnonymousClass3UE.A08(this.A0J, z);
    }

    public void A01() {
        this.A0K.setImageResource(R.drawable.ic_voip_speaker_control);
        if (!this.A0G) {
            this.A0P.setImageResource(R.drawable.ic_voip_video_control);
        }
        C36331k8.A0q(getContext(), this.A0P, R.string.f12nameremoved);
        A00(false);
    }

    public void A02() {
        this.A0K.setImageResource(R.drawable.ic_voip_switch_camera_control);
        if (!this.A0G) {
            this.A0P.setImageResource(R.drawable.ic_voip_switch_to_voice_control);
        }
        C36331k8.A0q(getContext(), this.A0P, R.string.f12nameremoved);
        A00(true);
    }

    public void A03(int i) {
        float f = (float) i;
        this.A0I.setRotation(f);
        this.A0K.setRotation(f);
        this.A0J.setRotation(f);
        this.A0P.setRotation(f);
        this.A0O.setRotation(f);
        ImageButton imageButton = this.A04;
        if (imageButton != null) {
            imageButton.setRotation(f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (r9.A0A.BJo() == false) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007a, code lost:
        if (r13 != false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00bd, code lost:
        if (r16 != false) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00ef, code lost:
        if (X.AnonymousClass000.A1S(r6.A06, 6) != false) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0119, code lost:
        if (r15 != false) goto L_0x011b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(com.whatsapp.voipcalling.CallInfo r10, java.lang.String r11, int r12, boolean r13, boolean r14, boolean r15, boolean r16) {
        /*
            r9 = this;
            com.whatsapp.voipcalling.CallState r5 = r10.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r5 == r0) goto L_0x0091
            boolean r0 = com.whatsapp.voipcalling.Voip.A0A(r5)
            if (r0 != 0) goto L_0x0091
            boolean r0 = r10.isGroupCall
            if (r0 != 0) goto L_0x0014
            java.lang.String r0 = r10.callLinkToken
            if (r0 == 0) goto L_0x0018
        L_0x0014:
            boolean r0 = r10.videoEnabled
            if (r0 == 0) goto L_0x0021
        L_0x0018:
            X.13J r0 = r9.A0A
            boolean r1 = r0.BJo()
            r0 = 0
            if (r1 != 0) goto L_0x0022
        L_0x0021:
            r0 = 1
        L_0x0022:
            r4 = 1
            r3 = 0
            if (r0 != 0) goto L_0x003e
            java.lang.String r0 = "capi"
            boolean r0 = r0.equals(r11)
            if (r0 != 0) goto L_0x0036
            X.185 r0 = r9.A08
            boolean r0 = X.AnonymousClass3UL.A09(r0, r10)
            if (r0 == 0) goto L_0x01f6
        L_0x0036:
            X.0yC r0 = r9.A09
            boolean r0 = X.C34681hT.A0G(r0)
            if (r0 == 0) goto L_0x01f6
        L_0x003e:
            r6 = 1
        L_0x003f:
            android.view.View r1 = r9.A0N
            r2 = 8
            r0 = 0
            if (r6 == 0) goto L_0x0048
            r0 = 8
        L_0x0048:
            r1.setVisibility(r0)
            java.lang.String r0 = "capi"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x01d3
            X.0yC r1 = r9.A09
            r0 = 4067(0xfe3, float:5.699E-42)
            int r1 = r1.A07(r0)
            r0 = 2
            if (r1 < r0) goto L_0x01d3
            android.view.View r0 = r9.A02
            r0.setVisibility(r3)
            r0 = 2131429556(0x7f0b08b4, float:1.8480788E38)
            android.widget.ImageButton r0 = X.C90514aH.A0T(r9, r0)
            r9.A03 = r0
            X.AnonymousClass3UE.A08(r0, r4)
            android.widget.ImageButton r1 = r9.A03
            android.view.View$OnClickListener r0 = r9.A00
            r1.setOnClickListener(r0)
        L_0x0076:
            if (r6 == 0) goto L_0x007c
            r0 = 1082130432(0x40800000, float:4.0)
            if (r13 == 0) goto L_0x007d
        L_0x007c:
            r0 = 0
        L_0x007d:
            r9.setWeightSum(r0)
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.LINK
            if (r5 != r0) goto L_0x0092
            android.widget.ImageButton r0 = r9.A0K
            X.AnonymousClass3UE.A08(r0, r3)
            android.widget.ImageButton r0 = r9.A0P
            X.AnonymousClass3UE.A08(r0, r3)
            r9.setMuteButtonEnabled(r3)
        L_0x0091:
            return
        L_0x0092:
            X.6EE r6 = r10.self
            if (r6 != 0) goto L_0x009c
            java.lang.String r0 = "VoipCallFooter/updateAudioButtonsState Self info is null, skip"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x009c:
            boolean r0 = r10.videoEnabled
            r7 = 3
            android.widget.ImageButton r1 = r9.A0K
            if (r0 == 0) goto L_0x01ae
            if (r14 != 0) goto L_0x00bf
            int r8 = r6.A06
            r0 = 6
            boolean r0 = X.AnonymousClass000.A1S(r8, r0)
            if (r0 != 0) goto L_0x00bf
            com.whatsapp.voipcalling.camera.VoipCameraManager r0 = r9.A0C
            int r0 = r0.getCameraCount(r3)
            if (r0 <= r4) goto L_0x00bf
            boolean r0 = r6.A0C
            if (r0 != 0) goto L_0x00bf
            if (r15 != 0) goto L_0x00bf
            r0 = 1
            if (r16 == 0) goto L_0x00c0
        L_0x00bf:
            r0 = 0
        L_0x00c0:
            X.AnonymousClass3UE.A08(r1, r0)
            r1.setSelected(r3)
            android.widget.ImageButton r1 = r9.A0I
            boolean r0 = X.AnonymousClass000.A1S(r12, r7)
            r1.setSelected(r0)
            boolean r0 = r6.A0C
            r0 = r0 ^ 1
            X.AnonymousClass3UE.A08(r1, r0)
            boolean r0 = r9.A0G
            if (r0 == 0) goto L_0x01a5
            com.whatsapp.voipcalling.CallState r1 = r10.callState
            X.AnonymousClass00C.A0D(r1, r3)
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r1 == r0) goto L_0x00e7
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r1 != r0) goto L_0x00f1
        L_0x00e7:
            int r1 = r6.A06
            r0 = 6
            boolean r1 = X.AnonymousClass000.A1S(r1, r0)
            r0 = 1
            if (r1 == 0) goto L_0x00f2
        L_0x00f1:
            r0 = 0
        L_0x00f2:
            android.widget.ImageButton r1 = r9.A0P
            r1.setSelected(r0)
        L_0x00f7:
            android.view.View r7 = r9.A0L
            int r0 = X.C36351kA.A00(r13)
            r7.setVisibility(r0)
            if (r14 != 0) goto L_0x011b
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r5 == r0) goto L_0x010a
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r5 != r0) goto L_0x011b
        L_0x010a:
            boolean r0 = r10.isGroupCall
            if (r0 == 0) goto L_0x0112
            boolean r0 = r10.videoEnabled
            if (r0 == 0) goto L_0x011b
        L_0x0112:
            boolean r0 = r10.isCallOnHold()
            if (r0 != 0) goto L_0x011b
            r0 = 1
            if (r15 == 0) goto L_0x011c
        L_0x011b:
            r0 = 0
        L_0x011c:
            X.AnonymousClass3UE.A08(r1, r0)
            r9.setMuteButtonEnabled(r4)
            android.widget.ImageButton r1 = r9.A0J
            boolean r0 = r6.A0F
            r1.setSelected(r0)
            boolean r0 = r10.videoEnabled
            r9.A00(r0)
            X.0yC r1 = r9.A09
            X.13J r0 = r9.A0A
            boolean r1 = X.AnonymousClass3UE.A09(r1, r0, r10)
            X.1RJ r0 = r9.A0Q
            if (r1 == 0) goto L_0x01a1
            r0.A03(r3)
            android.widget.ImageButton r0 = r9.A04
            if (r0 != 0) goto L_0x014a
            r0 = 2131433554(0x7f0b1852, float:1.8488897E38)
            android.widget.ImageButton r0 = X.C90514aH.A0T(r9, r0)
            r9.A04 = r0
        L_0x014a:
            r0.setSelected(r15)
            android.widget.ImageButton r2 = r9.A04
            com.whatsapp.voipcalling.CallState r1 = r10.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r1 != r0) goto L_0x019f
            boolean r0 = r10.isSelfRequestingUpgrade()
            if (r0 != 0) goto L_0x019f
            X.6EE r0 = r10.self
            int r0 = r0.A06
            if (r0 != r4) goto L_0x019f
            if (r16 != 0) goto L_0x019f
        L_0x0163:
            X.AnonymousClass3UE.A08(r2, r4)
            android.widget.ImageButton r1 = r9.A04
            android.view.View$OnClickListener r0 = r9.A01
            r1.setOnClickListener(r0)
        L_0x016d:
            android.widget.ImageButton r0 = r9.A04
            if (r0 == 0) goto L_0x0091
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0091
            android.content.Context r4 = r9.getContext()
            android.widget.ImageButton r0 = r9.A04
            boolean r3 = r0.isSelected()
            android.widget.ImageButton r2 = r9.A04
            r0 = 2131893833(0x7f121e49, float:1.9422454E38)
            if (r3 == 0) goto L_0x018b
            r0 = 2131893835(0x7f121e4b, float:1.9422458E38)
        L_0x018b:
            java.lang.String r1 = r4.getString(r0)
            r0 = 2131893832(0x7f121e48, float:1.9422452E38)
            if (r3 == 0) goto L_0x0197
            r0 = 2131893834(0x7f121e4a, float:1.9422456E38)
        L_0x0197:
            java.lang.String r0 = r4.getString(r0)
            X.AnonymousClass3UE.A06(r2, r1, r0)
            return
        L_0x019f:
            r4 = 0
            goto L_0x0163
        L_0x01a1:
            r0.A03(r2)
            goto L_0x016d
        L_0x01a5:
            int r1 = r6.A06
            r0 = 6
            boolean r0 = X.AnonymousClass000.A1S(r1, r0)
            goto L_0x00f2
        L_0x01ae:
            boolean r0 = r6.A0C
            r0 = r0 ^ 1
            X.AnonymousClass3UE.A08(r1, r0)
            boolean r0 = X.AnonymousClass000.A1S(r12, r4)
            r1.setSelected(r0)
            android.widget.ImageButton r1 = r9.A0I
            boolean r0 = X.AnonymousClass000.A1S(r12, r7)
            r1.setSelected(r0)
            boolean r0 = r6.A0C
            r0 = r0 ^ 1
            X.AnonymousClass3UE.A08(r1, r0)
            android.widget.ImageButton r1 = r9.A0P
            r1.setSelected(r3)
            goto L_0x00f7
        L_0x01d3:
            X.185 r0 = r9.A08
            boolean r0 = X.AnonymousClass3UL.A09(r0, r10)
            if (r0 == 0) goto L_0x01ef
            X.0yC r1 = r9.A09
            r0 = 4067(0xfe3, float:5.699E-42)
            int r1 = r1.A07(r0)
            r0 = 2
            if (r1 < r0) goto L_0x01ef
            X.0wU r1 = r9.A0B
            r0 = 25
            X.C36411kG.A1M(r1, r9, r10, r0)
            goto L_0x0076
        L_0x01ef:
            android.view.View r0 = r9.A02
            r0.setVisibility(r2)
            goto L_0x0076
        L_0x01f6:
            r6 = 0
            goto L_0x003f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.views.VoipCallFooter.A04(com.whatsapp.voipcalling.CallInfo, java.lang.String, int, boolean, boolean, boolean, boolean):void");
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A0D;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A0D = r0;
        }
        return r0.generatedComponent();
    }

    public void setBluetoothButtonClickListener(View.OnClickListener onClickListener) {
        this.A0I.setOnClickListener(onClickListener);
    }

    public void setDialpadBtnSelected(boolean z) {
        this.A03.setSelected(z);
    }

    public void setEndCallButtonClickListener(View.OnClickListener onClickListener) {
        this.A0O.setOnClickListener(onClickListener);
    }

    public void setMuteButtonClickListener(View.OnClickListener onClickListener) {
        this.A0J.setOnClickListener(onClickListener);
    }

    public void setSpeakerButtonClickListener(View.OnClickListener onClickListener) {
        this.A0K.setOnClickListener(onClickListener);
    }

    public void setToggleVideoButtonClickListener(View.OnClickListener onClickListener) {
        this.A0P.setOnClickListener(onClickListener);
    }

    public void setToggleVideoButtonSelected(boolean z) {
        this.A0P.setSelected(z);
    }

    public void setViewPeopleBtnOnClickListener(View.OnClickListener onClickListener) {
        ImageButton imageButton = this.A05;
        if (imageButton != null) {
            imageButton.setOnClickListener(onClickListener);
        }
    }

    public VoipCallFooter(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A0E) {
            this.A0E = true;
            C18800tq A0W = C36391kE.A0W(generatedComponent());
            this.A09 = C36341k9.A0V(A0W);
            this.A06 = C36351kA.A0M(A0W);
            this.A0B = C36341k9.A0Z(A0W);
            this.A0A = C36351kA.A0q(A0W);
            this.A07 = (AnonymousClass1KK) A0W.A19.get();
            this.A08 = C36371kC.A0U(A0W);
            this.A0C = (VoipCameraManager) A0W.A8x.get();
        }
        this.A0G = false;
        LayoutInflater.from(context).inflate(R.layout.f9nameremoved, this, true);
        this.A0K = (ImageButton) findViewById(R.id.speaker_btn);
        this.A0M = findViewById(R.id.speaker_btn_layout);
        this.A0I = (ImageButton) findViewById(R.id.bluetooth_btn);
        this.A0L = findViewById(R.id.bluetooth_btn_layout);
        this.A0P = (ImageButton) findViewById(R.id.toggle_video_btn);
        this.A0N = findViewById(R.id.toggle_video_btn_layout);
        this.A0J = (ImageButton) findViewById(R.id.mute_btn);
        this.A0O = C90514aH.A0T(this, R.id.footer_end_call_btn);
        this.A0H = C012005e.A02(this, R.id.end_call_btn_layout);
        this.A0Q = C36341k9.A0X(this, R.id.screen_share_btn_stub);
        this.A02 = findViewById(R.id.dialpad_btn_stub);
        this.A03 = (ImageButton) findViewById(R.id.dialpad_btn);
        this.A0F = findViewById(R.id.view_people_btn_layout);
        this.A05 = (ImageButton) findViewById(R.id.view_people_btn);
        this.A0G = C34681hT.A0R(this.A09, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0088  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A00(boolean r6) {
        /*
            r5 = this;
            android.content.Context r4 = r5.getContext()
            android.widget.ImageButton r2 = r5.A0K
            if (r6 != 0) goto L_0x0098
            boolean r1 = r2.isSelected()
            r0 = 2131895989(0x7f1226b5, float:1.9426827E38)
            if (r1 == 0) goto L_0x0014
            r0 = 2131895988(0x7f1226b4, float:1.9426825E38)
        L_0x0014:
            java.lang.String r1 = r4.getString(r0)
            r0 = 0
            if (r6 == 0) goto L_0x0022
            r0 = 2131895983(0x7f1226af, float:1.9426814E38)
            java.lang.String r0 = r4.getString(r0)
        L_0x0022:
            X.AnonymousClass3UE.A06(r2, r1, r0)
            android.widget.ImageButton r2 = r5.A0I
            boolean r1 = r2.isSelected()
            r0 = 2131895934(0x7f12267e, float:1.9426715E38)
            if (r1 == 0) goto L_0x0033
            r0 = 2131895933(0x7f12267d, float:1.9426713E38)
        L_0x0033:
            java.lang.String r1 = r4.getString(r0)
            r0 = 2131895949(0x7f12268d, float:1.9426745E38)
            java.lang.String r0 = r4.getString(r0)
            X.AnonymousClass3UE.A06(r2, r1, r0)
            if (r6 == 0) goto L_0x0096
            boolean r1 = r5.A0G
            android.widget.ImageButton r0 = r5.A0P
            boolean r0 = r0.isSelected()
            if (r1 == 0) goto L_0x0093
            if (r0 == 0) goto L_0x0096
        L_0x004f:
            r3 = 1
        L_0x0050:
            android.widget.ImageButton r2 = r5.A0P
            r0 = 2131895987(0x7f1226b3, float:1.9426823E38)
            if (r3 == 0) goto L_0x005a
            r0 = 2131895985(0x7f1226b1, float:1.9426818E38)
        L_0x005a:
            java.lang.String r1 = r4.getString(r0)
            r0 = 2131895986(0x7f1226b2, float:1.942682E38)
            if (r3 == 0) goto L_0x0066
            r0 = 2131895984(0x7f1226b0, float:1.9426816E38)
        L_0x0066:
            java.lang.String r0 = r4.getString(r0)
            X.AnonymousClass3UE.A06(r2, r1, r0)
            android.widget.ImageButton r3 = r5.A0J
            boolean r1 = r3.isSelected()
            r0 = 2131895973(0x7f1226a5, float:1.9426794E38)
            if (r1 == 0) goto L_0x007b
            r0 = 2131895992(0x7f1226b8, float:1.9426833E38)
        L_0x007b:
            java.lang.String r2 = r4.getString(r0)
            boolean r1 = r3.isSelected()
            r0 = 2131895972(0x7f1226a4, float:1.9426792E38)
            if (r1 == 0) goto L_0x008b
            r0 = 2131895991(0x7f1226b7, float:1.942683E38)
        L_0x008b:
            java.lang.String r0 = r4.getString(r0)
            X.AnonymousClass3UE.A06(r3, r2, r0)
            return
        L_0x0093:
            if (r0 != 0) goto L_0x0096
            goto L_0x004f
        L_0x0096:
            r3 = 0
            goto L_0x0050
        L_0x0098:
            r0 = 2131895983(0x7f1226af, float:1.9426814E38)
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.views.VoipCallFooter.A00(boolean):void");
    }

    public void setDialpadBtnClickListener(View.OnClickListener onClickListener) {
        this.A00 = onClickListener;
    }

    public void setScreenShareBtnClickListener(View.OnClickListener onClickListener) {
        this.A01 = onClickListener;
    }

    public VoipCallFooter(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VoipCallFooter(Context context) {
        this(context, (AttributeSet) null);
    }
}
