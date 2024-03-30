package com.whatsapp.conversation;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass012;
import X.AnonymousClass1EQ;
import X.AnonymousClass1QZ;
import X.AnonymousClass1RJ;
import X.AnonymousClass2L0;
import X.AnonymousClass317;
import X.AnonymousClass318;
import X.AnonymousClass3FA;
import X.AnonymousClass3UW;
import X.AnonymousClass3YE;
import X.C012005e;
import X.C14960mT;
import X.C18700tb;
import X.C18800tq;
import X.C18820ts;
import X.C19970wo;
import X.C20810yC;
import X.C21060yb;
import X.C222013h;
import X.C34831hi;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36381kD;
import X.C36391kE;
import X.C36421kH;
import X.C36441kJ;
import X.C37581ms;
import X.C39821ts;
import X.C51202nR;
import X.C53782rs;
import X.C53802ru;
import X.C63203Jd;
import X.C64973Qe;
import X.C67193Yw;
import X.C80223v3;
import X.C80273v8;
import X.C88824Ue;
import X.C89074Vd;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageButton;
import com.whatsapp.pushtorecordmedia.PushToRecordIconAnimation;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Objects;

public class ConversationEntryActionButton extends RelativeLayout implements C18700tb {
    public int A00;
    public long A01;
    public AnonymousClass3FA A02;
    public C39821ts A03;
    public C21060yb A04;
    public C19970wo A05;
    public C18820ts A06;
    public C20810yC A07;
    public AnonymousClass1EQ A08;
    public PushToRecordIconAnimation A09;
    public AnonymousClass1QZ A0A;
    public Integer A0B;
    public boolean A0C;
    public final WaImageButton A0D;
    public final WaImageButton A0E;
    public final WaImageButton A0F;
    public final AnonymousClass1RJ A0G;

    public ConversationEntryActionButton(Context context) {
        this(context, (AttributeSet) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x006e, code lost:
        if (r2 == r1) goto L_0x013e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void A03(X.C64973Qe r18, X.C64973Qe[] r19) {
        /*
            r17 = this;
            r5 = 0
            r7 = r19[r5]
            r2 = r18
            r19[r5] = r18
            r9 = 0
            if (r7 == 0) goto L_0x00f6
            int r1 = r7.A00()
            int r0 = r7.A00
            if (r1 == 0) goto L_0x00f6
            r1 = 1
            if (r0 == 0) goto L_0x0018
            if (r0 != r1) goto L_0x0159
            r1 = 2
        L_0x0018:
            int r0 = r2.A00()
            int r6 = r2.A00
            r8 = 0
            if (r0 == 0) goto L_0x0027
            r8 = 1
            if (r6 == 0) goto L_0x0027
            if (r6 != r8) goto L_0x0151
            r8 = 2
        L_0x0027:
            r4 = 1
            r3 = r17
            if (r8 == r1) goto L_0x0062
            if (r1 == 0) goto L_0x00f2
            if (r1 == r4) goto L_0x00ee
            com.whatsapp.WaImageButton r0 = r3.A0D
        L_0x0032:
            if (r8 == 0) goto L_0x00ea
            if (r8 == r4) goto L_0x00e6
            com.whatsapp.WaImageButton r1 = r3.A0D
        L_0x0038:
            A01(r0, r5)
            A01(r1, r4)
            r0 = 8
            r1.sendAccessibilityEvent(r0)
            com.whatsapp.pushtorecordmedia.PushToRecordIconAnimation r0 = r3.A09
            if (r0 == 0) goto L_0x0062
            if (r8 == 0) goto L_0x004a
            r9 = 1
        L_0x004a:
            A01(r0, r9)
            if (r8 == 0) goto L_0x0062
            r0 = 1
            if (r8 == r4) goto L_0x0053
            r0 = 2
        L_0x0053:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L_0x0062
            com.whatsapp.pushtorecordmedia.PushToRecordIconAnimation r1 = r3.A09
            int r0 = r0.intValue()
            r1.Ble(r0)
        L_0x0062:
            boolean r2 = r2.A06
            if (r7 == 0) goto L_0x0070
            boolean r1 = r7.A06
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            if (r0 == 0) goto L_0x0070
            if (r2 == r1) goto L_0x013e
        L_0x0070:
            if (r2 == 0) goto L_0x00f9
            X.3FA r10 = r3.getOrCreateRecorderModeMenu()
            X.00T r0 = r10.A09
            java.lang.Object r0 = r0.getValue()
            X.36N r0 = (X.AnonymousClass36N) r0
            android.view.ViewGroup r1 = r0.A01
            X.00T r0 = r0.A02
            android.view.View r0 = X.C36401kF.A0F(r0)
            r1.addView(r0)
            r8 = 0
            X.0ts r2 = r10.A07
            boolean r0 = X.C36401kF.A1X(r2)
            boolean r16 = X.AnonymousClass000.A1P(r0)
            X.0cQ r9 = r10.A00
            if (r9 != 0) goto L_0x012e
            android.content.Context r1 = r10.A04
            java.util.List r0 = r10.A08
            X.1nR r7 = new X.1nR
            r7.<init>(r1, r2, r0)
            android.content.res.Resources r2 = r1.getResources()
            r0 = 2131166015(0x7f07033f, float:1.7946263E38)
            int r2 = r2.getDimensionPixelSize(r0)
            android.content.res.Resources r9 = r1.getResources()
            r0 = 2131166014(0x7f07033e, float:1.7946261E38)
            int r15 = r9.getDimensionPixelSize(r0)
            android.util.DisplayMetrics r0 = X.AnonymousClass000.A0X(r1)
            int r14 = r0.widthPixels
            r13 = 0
            r0 = 2132083156(0x7f1501d4, float:1.9806446E38)
            X.0cQ r9 = new X.0cQ
            r9.<init>(r1, r13, r5, r0)
            android.view.View r0 = r10.A06
            r9.A06 = r0
            r9.Bq4(r7)
            int r12 = r7.getCount()
            r11 = 0
            r1 = 0
        L_0x00d3:
            if (r11 >= r12) goto L_0x0105
            android.view.View r0 = r7.getView(r11, r13, r13)
            r0.measure(r5, r5)
            int r0 = r0.getMeasuredWidth()
            if (r0 <= r1) goto L_0x00e3
            r1 = r0
        L_0x00e3:
            int r11 = r11 + 1
            goto L_0x00d3
        L_0x00e6:
            com.whatsapp.WaImageButton r1 = r3.A0F
            goto L_0x0038
        L_0x00ea:
            com.whatsapp.WaImageButton r1 = r3.A0E
            goto L_0x0038
        L_0x00ee:
            com.whatsapp.WaImageButton r0 = r3.A0F
            goto L_0x0032
        L_0x00f2:
            com.whatsapp.WaImageButton r0 = r3.A0E
            goto L_0x0032
        L_0x00f6:
            r1 = 0
            goto L_0x0018
        L_0x00f9:
            X.3FA r0 = r3.A02
            if (r0 == 0) goto L_0x013e
            X.0cQ r0 = r0.A00
            if (r0 == 0) goto L_0x013e
            r0.dismiss()
            goto L_0x013e
        L_0x0105:
            int r0 = java.lang.Math.max(r15, r1)
            int r0 = java.lang.Math.min(r0, r14)
            r9.A03 = r0
            X.4Ym r0 = new X.4Ym
            r0.<init>(r10, r5)
            android.widget.PopupWindow r1 = r9.A0A
            r1.setOnDismissListener(r0)
            X.4YC r0 = new X.4YC
            r0.<init>(r9, r10, r4)
            r9.A07 = r0
            r9.Bsg(r2)
            r9.A0F = r5
            r1.setFocusable(r5)
            r9.A0E = r4
            r10.A00 = r9
            r10.A03 = r7
        L_0x012e:
            if (r16 != 0) goto L_0x0139
            android.view.View r0 = r10.A06
            int r8 = r0.getWidth()
            int r0 = r9.A03
            int r8 = r8 - r0
        L_0x0139:
            r9.A01 = r8
            r9.Btc()
        L_0x013e:
            X.3FA r2 = r3.A02
            if (r2 == 0) goto L_0x014d
            if (r6 != r4) goto L_0x014e
            r0 = 2
        L_0x0146:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A00(r0)
        L_0x014d:
            return
        L_0x014e:
            r0 = 1
            goto L_0x0146
        L_0x0151:
            java.lang.String r1 = "Invalid recorder mode"
            java.lang.Error r0 = new java.lang.Error
            r0.<init>(r1)
            throw r0
        L_0x0159:
            java.lang.String r1 = "Invalid recorder mode"
            java.lang.Error r0 = new java.lang.Error
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.ConversationEntryActionButton.A03(X.3Qe, X.3Qe[]):void");
    }

    private PushToRecordIconAnimation getIconAnimationView() {
        if (!this.A03.A01.A06) {
            return null;
        }
        AnonymousClass1RJ r2 = this.A0G;
        if (r2.A00 == null) {
            ((PushToRecordIconAnimation) r2.A01()).A00(this.A03.A01.A0C);
        }
        return (PushToRecordIconAnimation) r2.A01();
    }

    private AnonymousClass3FA getOrCreateRecorderModeMenu() {
        AnonymousClass3FA r3 = this.A02;
        if (r3 != null) {
            return r3;
        }
        if (this.A03.A01.A00 != 2) {
            Log.e("conversation/ConversationEntryActionButton/getOrCreateRecorderModeMenu called unexpectedly");
        }
        ArrayList A0I = AnonymousClass001.A0I();
        if (this.A03.A01.A0E) {
            A0I.add(new C63203Jd(C51202nR.TITLE, (Integer) null, R.string.f12nameremoved, 0));
        }
        C51202nR r2 = C51202nR.OPTION;
        A0I.add(new C63203Jd(r2, Integer.valueOf(R.drawable.input_camera_white), R.string.f12nameremoved, 2));
        A0I.add(new C63203Jd(r2, Integer.valueOf(R.drawable.input_mic_white), R.string.f12nameremoved, 1));
        AnonymousClass3FA r32 = new AnonymousClass3FA(getContext(), this, this.A06, A0I);
        this.A02 = r32;
        r32.A01 = new AnonymousClass317(this);
        r32.A02 = new AnonymousClass318(this);
        return r32;
    }

    /* access modifiers changed from: private */
    public long getShortTapTimeoutMs() {
        return (long) Math.min(Math.max(this.A07.A07(5348), 50), 500);
    }

    public void A02(AnonymousClass012 r12, C88824Ue r13, C39821ts r14) {
        Integer valueOf;
        this.A03 = r14;
        PushToRecordIconAnimation iconAnimationView = getIconAnimationView();
        this.A09 = iconAnimationView;
        AnonymousClass2L0 r5 = null;
        if (iconAnimationView != null) {
            iconAnimationView.setTint(C36351kA.A02(this.A09.getContext(), getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
            this.A0D.setImageDrawable((Drawable) null);
            this.A0F.setImageDrawable((Drawable) null);
            PushToRecordIconAnimation pushToRecordIconAnimation = this.A09;
            C34831hi r1 = r14.A04;
            int A002 = ((C64973Qe) r1.A04()).A00();
            int i = ((C64973Qe) r1.A04()).A00;
            int i2 = 0;
            if (A002 != 0) {
                i2 = 1;
                if (i != 0) {
                    if (i == 1) {
                        i2 = 2;
                    } else {
                        throw new Error("Invalid recorder mode");
                    }
                }
            }
            pushToRecordIconAnimation.BNt(i2);
        }
        WaImageButton waImageButton = this.A0F;
        waImageButton.setLongClickable(true);
        C012005e.A0V(waImageButton, new C89074Vd(r14, this, 0));
        WaImageButton waImageButton2 = this.A0D;
        C36421kH.A11(waImageButton2, this, 7);
        AnonymousClass3UW.A00(r12, r14.A04, new C64973Qe[]{null}, this, 9);
        float A003 = C36341k9.A00(getContext());
        C20810yC r2 = this.A07;
        AnonymousClass00C.A0D(r2, 1);
        int A072 = r2.A07(5363);
        if (A072 < 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(C14960mT.A01(((float) A072) * A003));
        }
        this.A0B = valueOf;
        boolean z = false;
        this.A00 = Math.max(0, r2.A07(5384));
        WaImageButton waImageButton3 = this.A0E;
        C36361kB.A13(C36381kD.A0H(getContext(), R.drawable.input_send), waImageButton3, this.A06);
        waImageButton3.setOutlineProvider(new C37581ms(this));
        C80273v8 r3 = new C80273v8(this, r14, 30);
        if (r2.A0E(3582)) {
            waImageButton3.setOnTouchListener(this.A08);
        }
        AnonymousClass3YE.A00(waImageButton3, this, r13, 48);
        if (r2.A07(5363) >= 0) {
            z = true;
        }
        C53782rs r22 = new C53782rs(r13, this, 2);
        Objects.requireNonNull(r13);
        AnonymousClass2L0 r0 = new AnonymousClass2L0((View.OnTouchListener) r22, this, (Runnable) r3, (Runnable) C80223v3.A00(r13, 23));
        waImageButton.setOnTouchListener(r0);
        if (!z) {
            r0 = null;
        }
        waImageButton.setOnLongClickListener(r0);
        waImageButton.setOnKeyListener(new C67193Yw(r13, this));
        C53782rs r23 = new C53782rs(r13, this, 3);
        Objects.requireNonNull(r13);
        AnonymousClass2L0 r02 = new AnonymousClass2L0((View.OnTouchListener) r23, this, (Runnable) r3, (Runnable) C80223v3.A00(r13, 22));
        waImageButton2.setOnTouchListener(r02);
        waImageButton2.setLongClickable(z);
        if (z) {
            r5 = r02;
        }
        waImageButton2.setOnLongClickListener(r5);
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A0A;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A0A = r0;
        }
        return r0.generatedComponent();
    }

    public static void A01(View view, boolean z) {
        int i = 0;
        if (z != AnonymousClass000.A1Q(view.getVisibility())) {
            view.setEnabled(z);
            view.startAnimation(C53802ru.A00(!z));
            if (!z) {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    public ConversationEntryActionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A0C) {
            this.A0C = true;
            C18800tq A0W = C36391kE.A0W(generatedComponent());
            this.A05 = C36351kA.A0V(A0W);
            this.A07 = C36341k9.A0V(A0W);
            this.A06 = C36341k9.A0T(A0W);
            this.A04 = C36351kA.A0U(A0W);
            this.A08 = (AnonymousClass1EQ) A0W.AZG.get();
        }
        this.A0B = null;
        this.A00 = 0;
        this.A01 = 0;
        LayoutInflater.from(context).inflate(R.layout.f9nameremoved, this);
        this.A0E = (WaImageButton) C012005e.A02(this, R.id.send);
        WaImageButton waImageButton = (WaImageButton) C012005e.A02(this, R.id.voice_note_btn);
        this.A0F = waImageButton;
        boolean z = C222013h.A07;
        waImageButton.setImageResource(z ? R.drawable.input_mic_white_filled_wds : R.drawable.input_mic_white);
        WaImageButton waImageButton2 = (WaImageButton) C012005e.A02(this, R.id.push_to_video_button);
        this.A0D = waImageButton2;
        waImageButton2.setImageResource(z ? R.drawable.input_camera_white_filled_wds : R.drawable.input_camera_white);
        this.A0G = C36341k9.A0X(this, R.id.conversation_entry_action_button_push_to_record_icon_animation_stub);
    }

    public ConversationEntryActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
