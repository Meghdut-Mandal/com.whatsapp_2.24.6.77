package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.location.WaMapView;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.2IG  reason: invalid class name */
public class AnonymousClass2IG extends AnonymousClass8YX {
    public static final Set A0I;
    public C19460v5 A00;
    public AnonymousClass3TU A01;
    public C62163Fa A02;
    public AnonymousClass1EM A03;
    public boolean A04;
    public final ImageView A05 = C36391kE.A0N(this, R.id.thumb);
    public final LinearLayout A06;
    public final TextView A07;
    public final TextView A08;
    public final TextEmojiLabel A09;
    public final C88974Ut A0A;
    public final View A0B = findViewById(R.id.control_frame);
    public final View A0C;
    public final View A0D = findViewById(R.id.progress_bar);
    public final View A0E = findViewById(R.id.thumb_button);
    public final FrameLayout A0F;
    public final TextView A0G = C36391kE.A0P(this, R.id.control_btn);
    public final WaMapView A0H = ((WaMapView) findViewById(R.id.map_holder));

    public int getUserNameInGroupLayoutOption() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00fe, code lost:
        if (r3.A04 == false) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0146, code lost:
        if (r3 == 2) goto L_0x0148;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0B() {
        /*
            r22 = this;
            r14 = r22
            X.3T1 r1 = r14.A0K
            X.2bs r1 = (X.C46912bs) r1
            double r2 = r1.A01
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0014
            double r2 = r1.A00
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x001e
        L_0x0014:
            android.view.View r2 = r14.A0E
            r0 = 45
            X.C48812i6.A00(r2, r1, r14, r0)
            X.AnonymousClass2IR.A0W(r2, r14)
        L_0x001e:
            com.whatsapp.location.WaMapView r10 = r14.A0H
            X.2XH r0 = r14.A0I
            X.C18740tg.A06(r0)
            r10.A03(r0, r1)
            android.view.View r9 = r14.A0B
            r8 = 8
            if (r9 == 0) goto L_0x0031
            r9.setVisibility(r8)
        L_0x0031:
            android.view.View r7 = r14.A0C
            r6 = 0
            if (r7 == 0) goto L_0x0065
            com.whatsapp.TextEmojiLabel r5 = r14.A09
            if (r5 == 0) goto L_0x0065
            android.widget.TextView r4 = r14.A08
            if (r4 == 0) goto L_0x0065
            java.lang.String r3 = r1.A01
            java.lang.String r2 = r1.A00
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L_0x0175
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L_0x0175
            r5.setVisibility(r8)
            r4.setVisibility(r8)
            android.widget.LinearLayout r0 = r14.A06
            if (r0 == 0) goto L_0x005b
            r0.setBackgroundResource(r6)
        L_0x005b:
            android.widget.TextView r0 = r14.A07
            if (r0 == 0) goto L_0x0062
            r0.setVisibility(r8)
        L_0x0062:
            r7.setVisibility(r6)
        L_0x0065:
            android.widget.TextView r4 = r14.A0G
            if (r4 == 0) goto L_0x006c
            r4.setVisibility(r8)
        L_0x006c:
            int r3 = r1.A02
            r0 = 1
            r2 = 0
            if (r3 != r0) goto L_0x0138
            android.view.View r0 = r14.A0D
            if (r0 == 0) goto L_0x0079
            r0.setVisibility(r6)
        L_0x0079:
            X.3Qa r0 = r1.A1J
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0089
            if (r9 == 0) goto L_0x0084
            r9.setVisibility(r6)
        L_0x0084:
            android.view.View r0 = r14.A0E
            r0.setOnClickListener(r2)
        L_0x0089:
            r0 = 6
            X.2rk r4 = new X.2rk
            r4.<init>(r14, r0)
            int r3 = r10.getVisibility()
            X.1SV r2 = r14.A1y
            X.C18740tg.A06(r2)
            android.widget.ImageView r0 = r14.A05
            if (r3 != 0) goto L_0x0133
            r2.A0C(r0, r1, r4)
        L_0x009f:
            X.3BG r2 = r1.A0V
            r0 = 2131435344(0x7f0b1f50, float:1.8492528E38)
            if (r2 == 0) goto L_0x011d
            android.view.ViewGroup r7 = X.C36411kG.A0P(r14, r0)
            if (r7 == 0) goto L_0x0119
            X.0yC r2 = r14.A0G
            X.1DU r0 = r14.A1U
            X.3Rh r3 = X.C65243Rh.A00(r2, r0, r1)
            r7.setVisibility(r6)
            X.3TU r0 = r14.A01
            if (r0 != 0) goto L_0x00f5
            android.content.Context r11 = r14.getContext()
            X.4Ux r15 = r14.A0d
            X.1e2 r12 = r14.A0S
            X.1EM r6 = r14.A03
            X.1e6 r5 = r14.A1H
            X.1SV r4 = r14.A1y
            X.39u r13 = r14.A1S()
            X.0v5 r2 = r14.A00
            boolean r0 = r2.A05()
            if (r0 == 0) goto L_0x00d8
            r2.A02()
        L_0x00d8:
            X.0yC r0 = r14.A0G
            X.3TU r10 = new X.3TU
            r18 = r6
            r19 = r4
            r16 = r5
            r17 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r14.A01 = r10
            com.whatsapp.webpagepreview.WebPagePreviewView r0 = r10.A0A
            X.C36401kF.A18(r0, r7)
            X.3TU r0 = r14.A01
            com.whatsapp.webpagepreview.WebPagePreviewView r0 = r0.A0A
            X.AnonymousClass2IR.A0W(r0, r14)
        L_0x00f5:
            X.4Ut r4 = r14.A0A
            boolean r0 = r4 instanceof X.C1491570b
            if (r0 == 0) goto L_0x0100
            boolean r0 = r3.A04
            r2 = 1
            if (r0 != 0) goto L_0x0101
        L_0x0100:
            r2 = 0
        L_0x0101:
            r14.A04 = r2
            X.3TU r5 = r14.A01
            X.3Fa r0 = r14.A02
            boolean r10 = r0.A00(r1)
            X.3Fa r0 = r14.A02
            boolean r11 = r0.A01(r1)
            r12 = 0
            r6 = r1
            r7 = r4
            r8 = r3
            r9 = r2
            r5.A04(r6, r7, r8, r9, r10, r11, r12)
        L_0x0119:
            r14.A1z(r1)
            return
        L_0x011d:
            android.view.ViewGroup r2 = X.C36411kG.A0P(r14, r0)
            if (r2 == 0) goto L_0x0119
            X.3TU r0 = r14.A01
            if (r0 == 0) goto L_0x012f
            com.whatsapp.webpagepreview.WebPagePreviewView r0 = r0.A0A
            r2.removeView(r0)
            r0 = 0
            r14.A01 = r0
        L_0x012f:
            r2.setVisibility(r8)
            goto L_0x0119
        L_0x0133:
            r2.A0D(r0, r1, r4)
            goto L_0x009f
        L_0x0138:
            X.3T1 r2 = r14.A0K
            X.2bL r2 = (X.AnonymousClass2bL) r2
            X.3Qa r0 = r2.A1J
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0148
            int r3 = r2.A02
            r0 = 2
            r2 = 1
            if (r3 != r0) goto L_0x0149
        L_0x0148:
            r2 = 0
        L_0x0149:
            android.view.View r0 = r14.A0D
            if (r2 != 0) goto L_0x0154
            if (r0 == 0) goto L_0x0089
            r0.setVisibility(r8)
            goto L_0x0089
        L_0x0154:
            if (r0 == 0) goto L_0x0159
            r0.setVisibility(r8)
        L_0x0159:
            if (r4 == 0) goto L_0x0168
            r4.setVisibility(r6)
            r0 = 2131893722(0x7f121dda, float:1.9422229E38)
            r4.setText(r0)
            r0 = 4
            X.C48742hy.A01(r4, r14, r0)
        L_0x0168:
            if (r9 == 0) goto L_0x016d
            r9.setVisibility(r6)
        L_0x016d:
            android.view.View r2 = r14.A0E
            r0 = 4
            X.C48742hy.A01(r2, r14, r0)
            goto L_0x0089
        L_0x0175:
            java.lang.String r0 = r1.A1Z()
            boolean r11 = android.text.TextUtils.isEmpty(r3)
            if (r11 != 0) goto L_0x022e
            r5.setVisibility(r6)
            r12 = 150(0x96, float:2.1E-43)
            int r11 = r3.length()
            if (r11 <= r12) goto L_0x018e
            java.lang.String r3 = r3.substring(r6, r12)
        L_0x018e:
            android.content.Context r16 = r14.getContext()
            X.17Y r13 = r14.A0R
            X.0yb r12 = r14.A0D
            X.1e2 r11 = r14.A0S
            X.21s r15 = new X.21s
            r18 = r13
            r19 = r12
            r20 = r0
            r17 = r11
            r15.<init>(r16, r17, r18, r19, r20)
            android.widget.LinearLayout r11 = r14.A06
            if (r11 == 0) goto L_0x01cc
            android.content.Context r16 = r14.getContext()
            android.content.Context r13 = r14.getContext()
            r12 = 2130969112(0x7f040218, float:1.7546897E38)
            r11 = 2131100234(0x7f06024a, float:1.7812844E38)
            int r21 = X.C224514j.A00(r13, r12, r11)
            X.17Y r13 = r14.A0R
            X.0yb r12 = r14.A0D
            X.1e2 r11 = r14.A0S
            X.21s r15 = new X.21s
            r18 = r13
            r19 = r12
            r17 = r11
            r15.<init>((android.content.Context) r16, (X.C24791Du) r17, (X.AnonymousClass17Y) r18, (X.C21060yb) r19, (java.lang.String) r20, (int) r21)
        L_0x01cc:
            android.text.SpannableStringBuilder r12 = X.C36441kJ.A0P(r3)
            X.C18740tg.A06(r3)
            int r11 = r3.length()
            r3 = 18
            r12.setSpan(r15, r6, r11, r3)
            java.lang.CharSequence r3 = r14.A1V(r12)
            X.C36431kI.A1M(r5, r3)
        L_0x01e3:
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x022a
            r5 = 300(0x12c, float:4.2E-43)
            int r3 = r2.length()
            if (r3 <= r5) goto L_0x01f5
            java.lang.String r2 = r2.substring(r6, r5)
        L_0x01f5:
            java.lang.CharSequence r2 = r14.A1V(r2)
            r4.setText(r2)
            r4.setVisibility(r6)
        L_0x01ff:
            r3 = 4
            X.2iH r2 = new X.2iH
            r2.<init>(r3, r0, r14)
            r4.setOnClickListener(r2)
            android.widget.TextView r3 = r14.A07
            if (r3 == 0) goto L_0x0062
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.String r2 = r0.getHost()
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0232
            java.util.Set r0 = A0I
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x0232
            r3.setText(r2)
            r3.setVisibility(r6)
            goto L_0x0062
        L_0x022a:
            r4.setVisibility(r8)
            goto L_0x01ff
        L_0x022e:
            r5.setVisibility(r8)
            goto L_0x01e3
        L_0x0232:
            r3.setVisibility(r8)
            goto L_0x0062
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2IG.A0B():void");
    }

    public boolean A1K() {
        AnonymousClass2bL r1 = (AnonymousClass2bL) this.A0K;
        if ((!r1.A1J.A02 || r1.A02 == 2) && this.A0d.BtQ()) {
            return true;
        }
        return false;
    }

    public void A22(AnonymousClass3T1 r2, boolean z) {
        boolean A1W = C36371kC.A1W(r2, this.A0K);
        super.A22(r2, z);
        if (z || A1W) {
            A0B();
        }
    }

    public C46912bs getFMessage() {
        return (C46912bs) this.A0K;
    }

    public void setFMessage(AnonymousClass3T1 r2) {
        C18740tg.A0C(r2 instanceof AnonymousClass2bL);
        this.A0K = r2;
    }

    static {
        HashSet A16 = C36441kJ.A16();
        A16.add("www.facebook.com");
        A16.add("maps.google.com");
        A16.add("foursquare.com");
        A0I = Collections.unmodifiableSet(A16);
    }

    public AnonymousClass2IG(Context context, C89004Uw r4, C46912bs r5) {
        super(context, r4, r5);
        TextEmojiLabel A0P = C36401kF.A0P(this, R.id.place_name);
        this.A09 = A0P;
        this.A08 = C36391kE.A0P(this, R.id.place_address);
        this.A07 = C36391kE.A0P(this, R.id.host_view);
        this.A0C = findViewById(R.id.message_info_holder);
        this.A06 = C36441kJ.A0U(this, R.id.location_template_message_link_frame);
        if (A0P != null) {
            C36321k7.A0r(this.A0G, A0P);
        }
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.location_bubble_frame);
        this.A0F = frameLayout;
        if (frameLayout != null) {
            frameLayout.setForeground(getInnerFrameForegroundDrawable());
        }
        this.A0A = C65853Ts.A01(context);
        A0B();
    }

    public boolean A1E() {
        return C37541mm.A08(this);
    }

    public void A1Y() {
        A0B();
        AnonymousClass2IR.A0d(this, false);
    }

    public int getCenteredLayoutId() {
        return getIncomingLayoutId();
    }

    public int getIncomingLayoutId() {
        return R.layout.f9nameremoved;
    }

    public Set getInnerFrameLayouts() {
        Set innerFrameLayouts = super.getInnerFrameLayouts();
        FrameLayout frameLayout = this.A0F;
        if (frameLayout != null) {
            innerFrameLayouts.add(frameLayout);
        }
        return innerFrameLayouts;
    }

    public int getMainChildMaxWidth() {
        if (C37541mm.A07(this)) {
            return 0;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        if (this.A04) {
            return Math.min(dimensionPixelSize, AnonymousClass3R4.A02(this));
        }
        return dimensionPixelSize;
    }

    public int getOutgoingLayoutId() {
        return R.layout.f9nameremoved;
    }
}
