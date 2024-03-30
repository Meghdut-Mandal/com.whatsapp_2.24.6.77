package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.search.views.itemviews.AudioPlayerView;
import com.whatsapp.search.views.itemviews.VoiceNoteProfileAvatarView;

/* renamed from: X.8Zq  reason: invalid class name and case insensitive filesystem */
public class C175098Zq extends AnonymousClass8Z3 {
    public C25121Fb A00;
    public AnonymousClass7hR A01;
    public AnonymousClass1RJ A02;
    public AnonymousClass5BI A03;
    public TextView A04;
    public final ImageView A05;
    public final ImageView A06;
    public final AnonymousClass1RY A07;
    public final AnonymousClass1V6 A08;
    public final AnonymousClass631 A09;
    public final AudioPlayerView A0A;
    public final VoiceNoteProfileAvatarView A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final View.OnClickListener A0F = new C66953Xy(this, 47);

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x007f, code lost:
        if (r1 == false) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0046, code lost:
        if (r2.A0E(5884) != false) goto L_0x0048;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C175098Zq(android.content.Context r12, X.AnonymousClass1RY r13, X.C89004Uw r14, X.AnonymousClass3HF r15, X.AnonymousClass1V6 r16, X.C46812bi r17) {
        /*
            r11 = this;
            r5 = r11
            r6 = r12
            r7 = r14
            r8 = r15
            r9 = r16
            r10 = r17
            r5.<init>(r6, r7, r8, r9, r10)
            r1 = 47
            X.3Xy r0 = new X.3Xy
            r0.<init>(r11, r1)
            r11.A0F = r0
            r11.A07 = r13
            r11.A08 = r9
            X.0yC r0 = r11.A0G
            boolean r0 = X.C132476Tw.A01(r0)
            r11.A0E = r0
            r0 = 2131429219(0x7f0b0763, float:1.8480105E38)
            android.view.View r0 = X.C012005e.A02(r11, r0)
            com.whatsapp.search.views.itemviews.AudioPlayerView r0 = (com.whatsapp.search.views.itemviews.AudioPlayerView) r0
            r11.A0A = r0
            boolean r4 = X.C64933Qa.A04(r10)
            X.0yC r2 = r11.A0G
            r3 = 0
            X.AnonymousClass00C.A0D(r2, r3)
            r0 = 2890(0xb4a, float:4.05E-42)
            boolean r1 = r2.A0E(r0)
            if (r4 == 0) goto L_0x0049
            if (r1 == 0) goto L_0x0048
            r0 = 5884(0x16fc, float:8.245E-42)
            boolean r0 = r2.A0E(r0)
            r1 = 1
            if (r0 == 0) goto L_0x0049
        L_0x0048:
            r1 = 0
        L_0x0049:
            r11.A0D = r1
            if (r1 == 0) goto L_0x0056
            r0 = 2131427804(0x7f0b01dc, float:1.8477235E38)
            X.1RJ r0 = X.C36341k9.A0X(r11, r0)
            r11.A02 = r0
        L_0x0056:
            r0 = 2131429249(0x7f0b0781, float:1.8480165E38)
            android.view.View r2 = X.C012005e.A02(r11, r0)
            com.whatsapp.search.views.itemviews.VoiceNoteProfileAvatarView r2 = (com.whatsapp.search.views.itemviews.VoiceNoteProfileAvatarView) r2
            r11.A0B = r2
            android.widget.ImageView r0 = r2.A04
            r11.A06 = r0
            android.widget.ImageView r0 = r2.A02
            r11.A05 = r0
            r0 = 2131429502(0x7f0b087e, float:1.8480679E38)
            android.widget.TextView r0 = X.C36391kE.A0P(r11, r0)
            r11.A04 = r0
            X.0yb r0 = r11.A0D
            android.view.accessibility.AccessibilityManager r0 = r0.A0M()
            if (r0 == 0) goto L_0x0081
            boolean r1 = r0.isTouchExplorationEnabled()
            r0 = 1
            if (r1 != 0) goto L_0x0082
        L_0x0081:
            r0 = 0
        L_0x0082:
            r11.A0C = r0
            X.7hR r0 = r11.A01
            X.631 r0 = r0.B3z(r2)
            r11.A09 = r0
            r11.A2L(r3, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175098Zq.<init>(android.content.Context, X.1RY, X.4Uw, X.3HF, X.1V6, X.2bi):void");
    }

    public void A1Y() {
        super.A1Y();
        A2L(false, false);
    }

    public void A22(AnonymousClass3T1 r3, boolean z) {
        boolean A1W = C36371kC.A1W(r3, (AnonymousClass2bU) this.A0K);
        super.A22(r3, z);
        if (z || A1W) {
            A2L(false, false);
        }
    }

    public void A23(AnonymousClass3T1 r3, boolean z) {
        super.A22(r3, true);
        A2L(false, true);
    }

    public int getUserNameInGroupLayoutOption() {
        return 2;
    }

    public void A1f() {
        AnonymousClass7gN a9x;
        C46812bi A022;
        AnonymousClass1V6 r2 = this.A08;
        AnonymousClass3UR.A04(this.A08.getRootView(), r2, this.A00);
        C46812bi r10 = (C46812bi) ((AnonymousClass2bU) this.A0K);
        C89004Uw r4 = this.A0c;
        if (r4 instanceof B3D) {
            B3D b3d = (B3D) r4;
            boolean BNE = b3d.BNE();
            if (this.A02 == null || RequestPermissionActivity.A0K(getContext(), this.A02)) {
                Context context = getContext();
                C21624ASq aSq = new C21624ASq(this);
                AnonymousClass1X7 r12 = this.A0L;
                C18740tg.A06(r12);
                if (AnonymousClass6XC.A05(context, this.A0R, r10, aSq, r12, this.A1y)) {
                    if (!(!this.A0E || (A022 = r2.A02()) == null || A022.A1N == r10.A1N)) {
                        b3d.Bx8(A022, 0, false);
                    }
                    C148826zU A002 = this.A03.A00(C36361kB.A06(this), r10, true);
                    A002.A0D(r10);
                    A002.A0H = new C200409hM(this, 0);
                    if (BNE) {
                        b3d.setFollowPlayingVoiceMemo(true);
                        a9x = new C21138A9y(this, A002, r10);
                    } else {
                        a9x = new C21137A9x(this, r10);
                    }
                    A002.A0F = a9x;
                    A002.A0F(true);
                    super.A1Y();
                    A2L(true, true);
                    return;
                }
                return;
            }
            return;
        }
        super.A1f();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0182, code lost:
        if (r0 != null) goto L_0x0184;
     */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01b4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2L(boolean r12, boolean r13) {
        /*
            r11 = this;
            X.3T1 r6 = r11.A0K
            X.2bU r6 = (X.AnonymousClass2bU) r6
            X.2bi r6 = (X.C46812bi) r6
            boolean r0 = X.C64933Qa.A04(r6)
            if (r0 != 0) goto L_0x0012
            X.3Jw r0 = r6.A0W()
            if (r0 == 0) goto L_0x0017
        L_0x0012:
            com.whatsapp.search.views.itemviews.VoiceNoteProfileAvatarView r0 = r11.A0B
            r0.setIsNewsletterAudioOrPttUi(r6)
        L_0x0017:
            com.whatsapp.search.views.itemviews.AudioPlayerView r5 = r11.A0A
            com.whatsapp.search.views.itemviews.VoiceNoteProfileAvatarView r4 = r11.A0B
            X.AnonymousClass3R0.A02(r6, r5, r4)
            X.1RY r7 = r11.A07
            X.0wQ r2 = r11.A0T
            X.16D r8 = r11.A0l
            X.0yC r1 = r11.A0G
            r0 = 1040(0x410, float:1.457E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0165
            boolean r0 = r6.A1k()
            if (r0 == 0) goto L_0x0165
            X.3Jw r0 = r6.A0W()
            if (r0 != 0) goto L_0x0165
            r0 = 1
            r4.setIsForwardedByNonAuthorPttUi(r0)
        L_0x003e:
            X.0yC r1 = r11.A0G
            r0 = 637(0x27d, float:8.93E-43)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0058
            r0 = 32768(0x8000, float:4.5918E-41)
            boolean r0 = r6.A1T(r0)
            if (r0 != 0) goto L_0x0152
            r0 = 0
            r5.setTag(r0)
            r5.A01()
        L_0x0058:
            boolean r0 = r11.A0E
            if (r0 == 0) goto L_0x00d6
            android.view.View$OnClickListener r0 = r11.A0F
            r4.setOnFastPlaybackButtonClickListener(r0)
            X.3T1 r7 = r11.A0K
            X.2bU r7 = (X.AnonymousClass2bU) r7
            X.3HF r0 = r11.A03
            X.1V6 r1 = r0.A03
            boolean r0 = r1.A0D(r7)
            if (r0 == 0) goto L_0x014f
            X.6zU r3 = r1.A00()
        L_0x0073:
            X.1V6 r0 = r11.A08
            X.2bi r2 = r0.A02()
            X.6zU r1 = r0.A00()
            X.3Qa r0 = r7.A1J
            boolean r8 = r0.A02
            X.11F r0 = r0.A00
            boolean r9 = X.AnonymousClass143.A0G(r0)
            if (r3 == 0) goto L_0x008f
            boolean r0 = r3.A0I()
            if (r0 != 0) goto L_0x00a3
        L_0x008f:
            if (r12 != 0) goto L_0x00a3
            if (r1 == 0) goto L_0x0099
            boolean r0 = r1.A0I()
            if (r0 != 0) goto L_0x014a
        L_0x0099:
            if (r2 == 0) goto L_0x014a
            long r2 = r2.A1N
            long r0 = r7.A1N
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 != 0) goto L_0x014a
        L_0x00a3:
            int r0 = X.C148826zU.A12
            r4.A04(r0, r13, r8, r9)
            boolean r0 = r11.A0C
            if (r0 == 0) goto L_0x00d6
            if (r8 == 0) goto L_0x00d6
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 22
            if (r1 < r0) goto L_0x00d6
            r0 = 2131429180(0x7f0b073c, float:1.8480025E38)
            android.view.View r2 = r5.findViewById(r0)
            com.whatsapp.WaImageButton r2 = (com.whatsapp.WaImageButton) r2
            r0 = 2131430242(0x7f0b0b62, float:1.848218E38)
            android.view.View r1 = r4.findViewById(r0)
            if (r2 == 0) goto L_0x00d6
            if (r1 == 0) goto L_0x00d6
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x00d6
            X.4k8 r0 = new X.4k8
            r0.<init>(r2, r11)
            X.C012005e.A0V(r1, r0)
        L_0x00d6:
            boolean r2 = r11.A0D
            if (r2 != 0) goto L_0x00e4
            X.1RJ r0 = r11.A02
            if (r0 == 0) goto L_0x0126
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x0126
        L_0x00e4:
            X.1RJ r1 = r11.A02
            if (r1 == 0) goto L_0x0126
            int r0 = X.C36351kA.A00(r2)
            android.view.View r0 = X.C36391kE.A0L(r1, r0)
            com.whatsapp.voicetranscription.AudioTranscriptionView r0 = (com.whatsapp.voicetranscription.AudioTranscriptionView) r0
            X.3T1 r2 = r11.A0K
            X.2bU r2 = (X.AnonymousClass2bU) r2
            X.2bv r2 = (X.C46942bv) r2
            com.whatsapp.WaTextView r5 = r0.A02
            android.content.res.Resources r7 = r0.getResources()
            X.AnonymousClass00C.A08(r7)
            java.lang.String r8 = ""
            if (r2 == 0) goto L_0x0123
            X.3Kh r0 = r2.A00
            java.lang.Object r0 = r0.A00
            X.3QP r0 = (X.AnonymousClass3QP) r0
            if (r0 == 0) goto L_0x0123
            int r1 = r0.A02
            r0 = -2
            r4 = 0
            r3 = 1
            if (r1 == r0) goto L_0x0135
            r0 = -1
            if (r1 == r0) goto L_0x012a
            if (r1 == 0) goto L_0x0123
            r0 = 2131897106(0x7f122b12, float:1.9429092E38)
            java.lang.String r8 = r7.getString(r0)
            X.AnonymousClass00C.A0B(r8)
        L_0x0123:
            r5.setText(r8)
        L_0x0126:
            r11.A2I(r6)
            return
        L_0x012a:
            r0 = 2131897105(0x7f122b11, float:1.942909E38)
            java.lang.String r8 = r7.getString(r0)
            X.AnonymousClass00C.A08(r8)
            goto L_0x0123
        L_0x0135:
            X.3Qj r0 = r2.A01
            if (r0 == 0) goto L_0x0123
            java.lang.String r2 = r0.A0P
            if (r2 == 0) goto L_0x0123
            r1 = 2131897108(0x7f122b14, float:1.9429096E38)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r0 = X.C36411kG.A0w(r7, r2, r0, r4, r1)
            if (r0 == 0) goto L_0x0123
            r8 = r0
            goto L_0x0123
        L_0x014a:
            r0 = 0
            r4.A05(r0, r13, r8, r9)
            goto L_0x00d6
        L_0x014f:
            r3 = 0
            goto L_0x0073
        L_0x0152:
            X.3Qa r0 = r6.A1J
            r5.setTag(r0)
            X.1Fb r2 = r11.A00
            r1 = 9
            X.3v9 r0 = new X.3v9
            r0.<init>(r11, r6, r1)
            r2.A03(r6, r0)
            goto L_0x0058
        L_0x0165:
            r10 = 0
            r4.setIsForwardedByNonAuthorPttUi(r10)
            X.3Qa r1 = r6.A1J
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0189
            android.widget.ImageView r3 = r4.A04
            X.11F r9 = r1.A00
            boolean r0 = r9 instanceof X.C28981Uw
            if (r0 != 0) goto L_0x019e
            X.3Jw r0 = r6.A0W()
            if (r0 != 0) goto L_0x019e
            r2.A0G()
            X.142 r0 = r2.A0E
            if (r0 == 0) goto L_0x003e
        L_0x0184:
            r7.A08(r3, r0)
            goto L_0x003e
        L_0x0189:
            android.widget.ImageView r2 = r4.A02
            android.widget.ImageView r3 = r4.A04
            X.11F r9 = r1.A00
            boolean r1 = X.AnonymousClass143.A0G(r9)
            r0 = 8
            if (r1 == 0) goto L_0x01c3
            r2.setVisibility(r10)
            r3.setVisibility(r0)
            r3 = r2
        L_0x019e:
            X.3Jw r0 = r6.A0W()
            if (r0 == 0) goto L_0x01b4
            X.3Jw r0 = r6.A0W()
            X.1Uw r9 = r0.A01
        L_0x01aa:
            X.C18740tg.A06(r9)
            X.11F r9 = (X.AnonymousClass11F) r9
            X.141 r0 = r8.A0D(r9)
            goto L_0x0184
        L_0x01b4:
            boolean r0 = X.AnonymousClass143.A0G(r9)
            if (r0 != 0) goto L_0x01be
            boolean r0 = r9 instanceof X.C177528dw
            if (r0 == 0) goto L_0x01aa
        L_0x01be:
            X.11F r9 = r6.A0J()
            goto L_0x01aa
        L_0x01c3:
            r2.setVisibility(r0)
            goto L_0x019e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175098Zq.A2L(boolean, boolean):void");
    }

    public int getMainChildMaxWidth() {
        if (this.A0d.BLu((AnonymousClass2bU) this.A0K)) {
            return 0;
        }
        return getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
    }

    public void setDuration(String str) {
        TextView textView = this.A04;
        if (textView == null) {
            textView = C36391kE.A0P(this, R.id.description);
            this.A04 = textView;
        }
        textView.setText(str);
    }

    public int getCenteredLayoutId() {
        return R.layout.f9nameremoved;
    }

    public int getIncomingLayoutId() {
        return R.layout.f9nameremoved;
    }

    public int getOutgoingLayoutId() {
        return R.layout.f9nameremoved;
    }
}
