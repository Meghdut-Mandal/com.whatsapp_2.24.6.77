package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.1wd  reason: invalid class name and case insensitive filesystem */
public class C41111wd extends AnonymousClass0CZ implements C87514Pc {
    public List A00 = AnonymousClass001.A0I();
    public List A01 = AnonymousClass001.A0I();
    public List A02;
    public Map A03 = Collections.emptyMap();
    public boolean A04 = false;
    public final C237119n A05;
    public final C19970wo A06;
    public final C24801Dv A07;
    public final AnonymousClass17Y A08;
    public final C587330v A09;
    public final C21060yb A0A;
    public final C18820ts A0B;
    public final C236419g A0C;
    public final AnonymousClass1OD A0D;
    public final C20810yC A0E;
    public final C236919l A0F;
    public final C20380xT A0G;

    public AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        int i2;
        String str;
        C20380xT r8;
        C20810yC r7;
        C21060yb r6;
        AnonymousClass17Y r5;
        C24801Dv r4;
        View view;
        C66943Xx r2;
        boolean z;
        int i3;
        String str2;
        C20380xT r52;
        C24801Dv r42;
        View view2;
        C66943Xx r22;
        if (i == 1) {
            r7 = this.A0E;
            if (AnonymousClass1MI.A00(r7)) {
                r42 = this.A07;
                r52 = this.A0G;
                r22 = new C66943Xx(this, 15);
                z = C222013h.A05;
                view2 = C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved);
                i3 = R.string.device_linking_wds_adv_warning_message;
                str2 = "seeing-devices-out-of-sync";
            } else {
                r5 = this.A08;
                r4 = this.A07;
                r8 = this.A0G;
                r6 = this.A0A;
                r2 = new C66943Xx(this, 15);
                view = C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved);
                i2 = R.string.device_linking_adv_warning_message;
                str = "seeing-devices-out-of-sync";
                return new C42641z9(r2, view, r4, r5, r6, r7, r8, str, i2);
            }
        } else if (i == 2) {
            r7 = this.A0E;
            if (AnonymousClass1MI.A00(r7)) {
                r42 = this.A07;
                r52 = this.A0G;
                r22 = new C66943Xx(this, 14);
                z = C222013h.A05;
                view2 = C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved);
                i3 = R.string.device_linking_wds_fatal_error_warning_message;
                str2 = "seeing-devices-logged-out-unexpected-issue";
            } else {
                r5 = this.A08;
                r4 = this.A07;
                r8 = this.A0G;
                r6 = this.A0A;
                r2 = new C66943Xx(this, 14);
                view = C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved);
                i2 = R.string.device_linking_fatal_error_warning_message;
                str = "seeing-devices-logged-out-unexpected-issue";
                return new C42641z9(r2, view, r4, r5, r6, r7, r8, str, i2);
            }
        } else if (i == 4) {
            C20810yC r72 = this.A0E;
            AnonymousClass17Y r43 = this.A08;
            C24801Dv r3 = this.A07;
            C21060yb r62 = this.A0A;
            C20380xT r82 = this.A0G;
            return new C41411xA(C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved), r3, r43, this.A09, r62, r72, r82);
        } else if (i == 5) {
            return new C41941y1(C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.device_section_layout), this.A0E);
        } else if (i == 6) {
            C19970wo r44 = this.A06;
            C20810yC r63 = this.A0E;
            C18820ts r53 = this.A0B;
            return new C42421yn(C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved), this.A09, r44, r53, r63);
        } else if (i == 8) {
            C19970wo r45 = this.A06;
            C20810yC r64 = this.A0E;
            C18820ts r54 = this.A0B;
            return new AnonymousClass2FN(C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved), this.A09, r45, r54, r64);
        } else if (i == 9) {
            return new C41951y2(C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved), this.A09);
        } else {
            throw new UnsupportedOperationException(AnonymousClass000.A0r("Invalid viewType: ", AnonymousClass000.A0u(), i));
        }
        return new C42641z9(r22, view2, r42, r52, str2, i3, z);
    }

    public static void A01(Object obj, List list, int i) {
        list.add(new AnonymousClass347(obj, i));
    }

    public int A0J() {
        return this.A02.size();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: X.2Lg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: X.38U} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: X.2Lg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: X.2Lg} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BSE(X.AnonymousClass0D3 r11, int r12) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof X.C41941y1
            if (r0 == 0) goto L_0x001c
            X.1y1 r11 = (X.C41941y1) r11
            X.0yC r1 = r11.A01
            r0 = 4757(0x1295, float:6.666E-42)
            boolean r2 = r1.A0E(r0)
            com.whatsapp.WaTextView r1 = r11.A00
            r0 = 2131890740(0x7f121234, float:1.941618E38)
            if (r2 == 0) goto L_0x0018
            r0 = 2131890754(0x7f121242, float:1.9416209E38)
        L_0x0018:
            r1.setText(r0)
        L_0x001b:
            return
        L_0x001c:
            boolean r0 = r11 instanceof X.AnonymousClass2FN
            if (r0 == 0) goto L_0x006b
            X.1yn r11 = (X.C42421yn) r11
            java.util.List r0 = r10.A02
            java.lang.Object r0 = r0.get(r12)
            X.347 r0 = (X.AnonymousClass347) r0
            java.lang.Object r4 = r0.A01
            X.38U r4 = (X.AnonymousClass38U) r4
            android.widget.ImageView r1 = r11.A01
            int r0 = r4.A00
            r1.setImageResource(r0)
            android.widget.TextView r9 = r11.A04
            X.0ts r3 = r11.A07
            long r1 = r4.A02
            long r7 = X.C36441kJ.A0A(r1)
            r5 = 30000(0x7530, double:1.4822E-319)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x0066
            r0 = 2131890724(0x7f121224, float:1.9416148E38)
            java.lang.String r0 = r3.A0B(r0)
        L_0x004c:
            r9.setText(r0)
            android.widget.TextView r3 = r11.A03
            android.view.View r2 = r11.A0H
            android.content.Context r1 = r2.getContext()
            int r0 = r4.A01
            java.lang.CharSequence r0 = r1.getText(r0)
            r3.setText(r0)
            r0 = 31
        L_0x0062:
            X.AnonymousClass3YE.A00(r2, r11, r4, r0)
            return
        L_0x0066:
            java.lang.String r0 = X.AnonymousClass3UY.A08(r3, r1)
            goto L_0x004c
        L_0x006b:
            boolean r0 = r11 instanceof X.C42421yn
            if (r0 == 0) goto L_0x013e
            java.util.List r0 = r10.A02
            java.lang.Object r0 = r0.get(r12)
            X.347 r0 = (X.AnonymousClass347) r0
            java.lang.Object r4 = r0.A01
            X.2Lg r4 = (X.C44132Lg) r4
            X.1yn r11 = (X.C42421yn) r11
            X.19g r0 = r10.A0C
            com.whatsapp.jid.DeviceJid r1 = r4.A07
            java.util.Set r0 = r0.A0O
            boolean r5 = r0.contains(r1)
            android.widget.ImageView r1 = r11.A01
            int r0 = X.AnonymousClass3LZ.A00(r4)
            r1.setImageResource(r0)
            android.widget.TextView r2 = r11.A03
            android.content.Context r1 = r2.getContext()
            X.0yC r0 = r11.A08
            java.lang.String r0 = X.AnonymousClass3SB.A01(r1, r4, r0)
            r2.setText(r0)
            boolean r8 = r4.A02()
            if (r8 == 0) goto L_0x011b
            android.widget.TextView r1 = r11.A04
            r0 = 2131890736(0x7f121230, float:1.9416172E38)
        L_0x00aa:
            r1.setText(r0)
        L_0x00ad:
            boolean r7 = r4.A00
            android.widget.ImageView r5 = r11.A02
            android.widget.ImageView r9 = r11.A00
            X.0wo r0 = r11.A06
            r6 = 8
            if (r8 == 0) goto L_0x00d5
            long r7 = X.C19970wo.A00(r0)
            long r0 = r4.A01
            long r7 = r7 - r0
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            r0 = 8
            if (r1 <= 0) goto L_0x00ca
            r0 = 0
        L_0x00ca:
            r9.setVisibility(r0)
            r5.setVisibility(r6)
        L_0x00d0:
            android.view.View r2 = r11.A0H
            r0 = 32
            goto L_0x0062
        L_0x00d5:
            r9.setVisibility(r6)
            r1 = 500(0x1f4, double:2.47E-321)
            r3 = 0
            int r0 = r5.getVisibility()
            if (r7 == 0) goto L_0x00ff
            if (r0 != r6) goto L_0x00d0
            r5.clearAnimation()
            r5.setAlpha(r3)
            r0 = 0
            r5.setVisibility(r0)
            android.view.ViewPropertyAnimator r3 = r5.animate()
            r0 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r0 = r3.alpha(r0)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r1)
        L_0x00fb:
            r0.start()
            goto L_0x00d0
        L_0x00ff:
            if (r0 != 0) goto L_0x00d0
            r5.clearAnimation()
            android.view.ViewPropertyAnimator r0 = r5.animate()
            android.view.ViewPropertyAnimator r0 = r0.alpha(r3)
            android.view.ViewPropertyAnimator r2 = r0.setDuration(r1)
            r1 = 1
            X.4VL r0 = new X.4VL
            r0.<init>(r5, r1)
            android.view.ViewPropertyAnimator r0 = r2.setListener(r0)
            goto L_0x00fb
        L_0x011b:
            boolean r0 = r4.A00
            if (r0 == 0) goto L_0x0125
            android.widget.TextView r1 = r11.A04
            r0 = 2131890756(0x7f121244, float:1.9416213E38)
            goto L_0x00aa
        L_0x0125:
            android.widget.TextView r3 = r11.A04
            X.0ts r2 = r11.A07
            long r0 = r4.A00
            if (r5 == 0) goto L_0x0139
            r0 = 2131890724(0x7f121224, float:1.9416148E38)
            java.lang.String r0 = r2.A0B(r0)
        L_0x0134:
            r3.setText(r0)
            goto L_0x00ad
        L_0x0139:
            java.lang.String r0 = X.AnonymousClass3UY.A08(r2, r0)
            goto L_0x0134
        L_0x013e:
            boolean r0 = r11 instanceof X.C41951y2
            if (r0 == 0) goto L_0x001b
            X.1y2 r11 = (X.C41951y2) r11
            X.30v r0 = r11.A01
            com.whatsapp.TextEmojiLabel r3 = r11.A00
            com.whatsapp.companiondevice.LinkedDevicesActivity r2 = r0.A00
            X.1e0 r1 = r2.A0D
            X.0yb r0 = r2.A08
            r1.A03(r2, r3, r0)
            X.1eC r2 = r2.A0I
            r1 = 9
            r0 = 0
            r2.A00(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41111wd.BSE(X.0D3, int):void");
    }

    public void Bwd(Map map) {
        boolean booleanValue;
        this.A03 = map;
        for (C44132Lg r1 : this.A00) {
            if (!r1.A02()) {
                Boolean bool = (Boolean) map.get(r1.A07);
                if (bool == null) {
                    booleanValue = false;
                } else {
                    booleanValue = bool.booleanValue();
                }
                r1.A00 = booleanValue;
            }
        }
        A06();
    }

    public int getItemViewType(int i) {
        return ((AnonymousClass347) this.A02.get(i)).A00;
    }

    public C41111wd(C24801Dv r2, AnonymousClass17Y r3, C587330v r4, C237119n r5, C21060yb r6, C19970wo r7, C18820ts r8, C236419g r9, AnonymousClass1OD r10, C20810yC r11, C236919l r12, C20380xT r13) {
        this.A09 = r4;
        this.A06 = r7;
        this.A0E = r11;
        this.A08 = r3;
        this.A07 = r2;
        this.A0G = r13;
        this.A0A = r6;
        this.A0B = r8;
        this.A0F = r12;
        this.A0D = r10;
        this.A0C = r9;
        this.A05 = r5;
        A00(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x007f A[LOOP:0: B:16:0x0079->B:18:0x007f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d7 A[LOOP:1: B:31:0x00d1->B:33:0x00d7, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C41111wd r13) {
        /*
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()
            r13.A02 = r0
            java.util.List r3 = r13.A00
            boolean r0 = r3.isEmpty()
            r10 = 1
            r4 = 0
            if (r0 != 0) goto L_0x008c
            X.0wo r7 = r13.A06
            long r0 = r7.A02
            r5 = 0
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x0021
            long r5 = r7.A02
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r5 = r5 + r0
        L_0x0021:
            long r1 = r7.A04()
            long r7 = r5 - r1
            long r11 = java.lang.Math.abs(r7)
            r7 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x008c
            java.lang.StringBuilder r9 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "LinkedDevicesAdapter/shouldShowAdvWarningBanner ntpTs="
            r9.append(r0)
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 / r7
            r9.append(r5)
            java.lang.String r0 = "; waServerTs="
            r9.append(r0)
            long r1 = r1 / r7
            java.lang.String r0 = X.C36411kG.A11(r9, r1)
            com.whatsapp.util.Log.w((java.lang.String) r0)
            boolean r0 = r13.A04
            if (r0 != 0) goto L_0x008c
            java.util.List r0 = r13.A02
            A01(r4, r0, r10)
        L_0x0057:
            java.util.List r2 = r13.A02
            java.lang.Object r1 = X.C36441kJ.A11()
            r0 = 4
            A01(r1, r2, r0)
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x006f
            java.util.List r0 = r13.A01
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0075
        L_0x006f:
            java.util.List r1 = r13.A02
            r0 = 5
            A01(r4, r1, r0)
        L_0x0075:
            java.util.Iterator r3 = r3.iterator()
        L_0x0079:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00cb
            java.lang.Object r2 = r3.next()
            X.3SB r2 = (X.AnonymousClass3SB) r2
            java.util.List r1 = r13.A02
            r0 = 6
            A01(r2, r1, r0)
            goto L_0x0079
        L_0x008c:
            X.19l r0 = r13.A0F
            X.0v0 r0 = r0.A01
            boolean r0 = r0.A2H()
            if (r0 == 0) goto L_0x0057
            X.0yC r1 = r13.A0E
            r0 = 1037(0x40d, float:1.453E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0057
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0057
            boolean r0 = r13.A04
            if (r0 != 0) goto L_0x0057
            X.0wo r0 = r13.A06
            long r5 = X.C19970wo.A00(r0)
            X.19n r0 = r13.A05
            android.content.SharedPreferences r1 = X.C237119n.A00(r0)
            java.lang.String r0 = "syncd_last_fatal_error_time"
            long r0 = X.C36341k9.A0B(r1, r0)
            long r5 = r5 - r0
            r1 = 259200000(0xf731400, double:1.280618154E-315)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0057
            java.util.List r1 = r13.A02
            r0 = 2
            A01(r4, r1, r0)
            goto L_0x0057
        L_0x00cb:
            java.util.List r0 = r13.A01
            java.util.Iterator r3 = r0.iterator()
        L_0x00d1:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00e3
            java.lang.Object r2 = r3.next()
            java.util.List r1 = r13.A02
            r0 = 8
            A01(r2, r1, r0)
            goto L_0x00d1
        L_0x00e3:
            java.util.List r1 = r13.A02
            r0 = 9
            A01(r4, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41111wd.A00(X.1wd):void");
    }
}
