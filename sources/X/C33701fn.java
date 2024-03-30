package X;

import android.graphics.Color;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallLinkInfo;
import java.util.Map;

/* renamed from: X.1fn  reason: invalid class name and case insensitive filesystem */
public abstract class C33701fn implements C33681fl {
    public C87374On A00;
    public boolean A01;
    public final FrameLayout A02;
    public final C32991eX A03;
    public final C33581fb A04;
    public final C20810yC A05;
    public final C19770wU A06;
    public final AnonymousClass00T A07 = new AnonymousClass00U(new C33721fp(this));
    public final AnonymousClass00T A08 = new AnonymousClass00U(new C33731fq(this));

    public C33701fn(FrameLayout frameLayout, C32991eX r4, C33581fb r5, C20810yC r6, C19770wU r7) {
        AnonymousClass00C.A0D(r4, 1);
        AnonymousClass00C.A0D(r7, 3);
        AnonymousClass00C.A0D(r5, 4);
        AnonymousClass00C.A0D(r6, 5);
        this.A03 = r4;
        this.A02 = frameLayout;
        this.A06 = r7;
        this.A04 = r5;
        this.A05 = r6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f9, code lost:
        if (X.C20800yB.A01(r1, r4, 4656) == false) goto L_0x00fb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x012c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.AnonymousClass3KG r12) {
        /*
            r11 = this;
            r2 = 0
            X.4On r6 = r11.A01(r12)
            boolean r0 = r11.A05()
            if (r0 == 0) goto L_0x011a
            if (r6 == 0) goto L_0x011a
            X.4On r0 = r11.A00
            if (r0 != 0) goto L_0x0021
            android.widget.FrameLayout r1 = r11.A02
            X.00T r0 = r11.A07
            java.lang.Object r0 = r0.getValue()
            X.AnonymousClass00C.A08(r0)
            android.view.View r0 = (android.view.View) r0
            r1.addView(r0)
        L_0x0021:
            r11.A00 = r6
            X.00T r3 = r11.A07
            java.lang.Object r0 = r3.getValue()
            X.AnonymousClass00C.A08(r0)
            boolean r0 = r0 instanceof com.whatsapp.wds.components.banners.WDSBanner
            if (r0 == 0) goto L_0x0133
            java.lang.Object r5 = r3.getValue()
            X.AnonymousClass00C.A08(r5)
            android.view.View r5 = (android.view.View) r5
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.wds.components.banners.WDSBanner"
            X.AnonymousClass00C.A0E(r5, r0)
            com.whatsapp.wds.components.banners.WDSBanner r5 = (com.whatsapp.wds.components.banners.WDSBanner) r5
            X.AnonymousClass00C.A0D(r5, r2)
            com.whatsapp.WaTextView r1 = r5.A02
            if (r1 == 0) goto L_0x004b
            r0 = 5
            r1.setTextDirection(r0)
        L_0x004b:
            r9 = r6
            X.ATi r9 = (X.C21642ATi) r9
            X.9Nl r7 = r9.A07
            if (r7 == 0) goto L_0x00c3
            android.content.Context r8 = r5.getContext()
            X.AnonymousClass00C.A08(r8)
            X.39c r0 = r7.A01
            if (r0 == 0) goto L_0x012f
            java.lang.String r4 = r0.A02
            boolean r0 = X.AnonymousClass14B.A0F(r4)
            if (r0 != 0) goto L_0x012f
            java.lang.String r1 = r7.A05
            java.lang.String r0 = ""
            if (r1 != 0) goto L_0x006c
            r1 = r0
        L_0x006c:
            if (r4 == 0) goto L_0x006f
            r0 = r4
        L_0x006f:
            android.text.Spanned r8 = X.C63953Mb.A01(r8, r1, r0)
        L_0x0073:
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            X.33c r0 = r9.A06
            r10 = 0
            if (r0 == 0) goto L_0x012c
            java.util.Map r1 = r0.A00
            java.lang.String r0 = "wa_wds_icon"
            java.lang.Object r4 = r1.get(r0)
            java.lang.String r4 = (java.lang.String) r4
        L_0x0084:
            X.9Ko r0 = r7.A04
            if (r0 == 0) goto L_0x008a
            byte[] r10 = r0.A02
        L_0x008a:
            android.content.res.Resources r9 = r5.getResources()
            X.AnonymousClass00C.A08(r9)
            r1 = 1
            if (r4 == 0) goto L_0x011f
            int r0 = r4.length()
            if (r0 == 0) goto L_0x011f
            r11.A01 = r1
            r0 = 2
            byte[] r0 = android.util.Base64.decode(r4, r0)
            X.AnonymousClass00C.A08(r0)
            X.2lW r4 = new X.2lW
            r4.<init>(r9, r0)
        L_0x00a9:
            if (r8 == 0) goto L_0x00c3
            X.3Eo r1 = new X.3Eo
            r1.<init>()
            X.39d r0 = r11.A02(r6, r4)
            r1.A02 = r0
            java.lang.String r0 = r7.A06
            r1.A04 = r0
            r1.A03 = r8
            X.3A8 r0 = r1.A01()
            r5.setState(r0)
        L_0x00c3:
            X.4MR r4 = new X.4MR
            r4.<init>(r12, r11, r6)
            r1 = 7
            X.1iF r0 = new X.1iF
            r0.<init>((java.lang.Object) r4, (int) r1)
            r5.setOnClickListener(r0)
            X.4MQ r4 = new X.4MQ
            r4.<init>(r12, r11, r6)
            r1 = 5
            X.1iF r0 = new X.1iF
            r0.<init>((java.lang.Object) r4, (int) r1)
            r5.setOnDismissListener((android.view.View.OnClickListener) r0)
            boolean r0 = X.C222013h.A05
            if (r0 == 0) goto L_0x00fb
            boolean r0 = r11 instanceof X.C33711fo
            if (r0 == 0) goto L_0x011b
            X.0yC r4 = r11.A05
            X.0yV r1 = X.C21000yV.A01
            r0 = 3289(0xcd9, float:4.609E-42)
            boolean r0 = X.C20800yB.A01(r1, r4, r0)
            if (r0 != 0) goto L_0x011b
            r0 = 4656(0x1230, float:6.524E-42)
            boolean r0 = X.C20800yB.A01(r1, r4, r0)
            if (r0 != 0) goto L_0x011b
        L_0x00fb:
            r5.A07()
        L_0x00fe:
            java.lang.Object r0 = r3.getValue()
            X.AnonymousClass00C.A08(r0)
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r2)
            X.4On r3 = r11.A00
            if (r3 == 0) goto L_0x011a
            X.0wU r2 = r11.A06
            r1 = 39
            X.1iz r0 = new X.1iz
            r0.<init>(r11, r3, r1)
            r2.Boy(r0)
        L_0x011a:
            return
        L_0x011b:
            r5.A06()
            goto L_0x00fe
        L_0x011f:
            if (r10 == 0) goto L_0x0129
            r11.A01 = r1
            X.2lW r4 = new X.2lW
            r4.<init>(r9, r10)
            goto L_0x00a9
        L_0x0129:
            r4 = 0
            goto L_0x00a9
        L_0x012c:
            r4 = r10
            goto L_0x0084
        L_0x012f:
            java.lang.String r8 = r7.A05
            goto L_0x0073
        L_0x0133:
            X.00T r0 = r11.A08
            java.lang.Object r1 = r0.getValue()
            X.39j r1 = (X.C607939j) r1
            X.4On r0 = r11.A00
            r11.A04(r12, r1, r0)
            goto L_0x00fe
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33701fn.A03(X.3KG):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0074  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(X.AnonymousClass3KG r10, X.C607939j r11, X.C87374On r12) {
        /*
            r9 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r11, r0)
            r2 = 0
            if (r12 == 0) goto L_0x00c5
            r0 = r12
            X.ATi r0 = (X.C21642ATi) r0
            X.9Nl r6 = r0.A07
            if (r6 == 0) goto L_0x00c5
            android.widget.FrameLayout r5 = r9.A02
            android.content.res.Resources r4 = r5.getResources()
            android.widget.TextView r3 = r11.A04
            X.39c r0 = r6.A01
            if (r0 == 0) goto L_0x00c2
            java.lang.String r7 = r0.A02
            boolean r0 = X.AnonymousClass14B.A0F(r7)
            if (r0 != 0) goto L_0x00c2
            android.content.Context r8 = r5.getContext()
            android.content.Context r2 = r5.getContext()
            r1 = 2130968626(0x7f040032, float:1.754591E38)
            r0 = 2131099690(0x7f06002a, float:1.781174E38)
            int r0 = X.C224514j.A00(r2, r1, r0)
            int r2 = X.AnonymousClass00F.A00(r8, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r6.A05
            r1.append(r0)
            java.lang.String r0 = " <b><font color=\""
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "\">"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = "</b></font>"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
        L_0x005f:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r3.setText(r0)
            r0 = 5
            r3.setTextDirection(r0)
            android.content.Context r0 = r5.getContext()
            boolean r2 = X.AnonymousClass1RC.A0A(r0)
            X.9Ko r6 = r6.A04
            if (r6 == 0) goto L_0x0097
            if (r2 == 0) goto L_0x00bf
            byte[] r3 = r6.A01
        L_0x0078:
            if (r3 == 0) goto L_0x0097
            X.AnonymousClass00C.A0B(r4)
            int r1 = r3.length
            r0 = 0
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeByteArray(r3, r0, r1)
            if (r1 == 0) goto L_0x0097
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            r0.<init>(r4, r1)
            android.widget.ImageView r1 = r11.A02
            r1.setImageDrawable(r0)
            java.lang.String r0 = r6.A00
            r1.setContentDescription(r0)
            r0 = 1
            r9.A01 = r0
        L_0x0097:
            android.view.View r1 = r11.A00
            int r0 = r9.A00(r12, r2)
            r1.setBackgroundColor(r0)
            X.4MR r2 = new X.4MR
            r2.<init>(r10, r9, r12)
            r1 = 4
            X.1iF r0 = new X.1iF
            r0.<init>((java.lang.Object) r2, (int) r1)
            r5.setOnClickListener(r0)
            android.widget.ImageView r3 = r11.A03
            X.4MQ r2 = new X.4MQ
            r2.<init>(r10, r9, r12)
            r1 = 6
            X.1iF r0 = new X.1iF
            r0.<init>((java.lang.Object) r2, (int) r1)
            r3.setOnClickListener(r0)
            return
        L_0x00bf:
            byte[] r3 = r6.A02
            goto L_0x0078
        L_0x00c2:
            java.lang.String r0 = r6.A05
            goto L_0x005f
        L_0x00c5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "InAppBannerQP/setViewProperties viewHolder:"
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = " primaryCreative:"
            r1.append(r0)
            if (r12 == 0) goto L_0x00dd
            X.ATi r12 = (X.C21642ATi) r12
            X.9Nl r2 = r12.A07
        L_0x00dd:
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33701fn.A04(X.3KG, X.39j, X.4On):void");
    }

    public boolean A05() {
        return C20800yB.A01(C21000yV.A02, ((C33711fo) this).A00, 3712);
    }

    public boolean A06(C20810yC r3) {
        return AnonymousClass1MI.A02(r3, (C21000yV) null, 6778);
    }

    public boolean Bt0() {
        return false;
    }

    public void BwS() {
    }

    public int A00(C87374On r6, boolean z) {
        String str;
        C592233c r4 = ((C21642ATi) r6).A06;
        FrameLayout frameLayout = this.A02;
        int A002 = AnonymousClass00F.A00(frameLayout.getContext(), C224514j.A00(frameLayout.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
        if (r4 != null) {
            Map map = r4.A00;
            if (z) {
                str = "colors_DarkBackground";
            } else {
                str = "colors_LightBackground";
            }
            String str2 = (String) map.get(str);
            if (!AnonymousClass14B.A0F(str2)) {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append('#');
                    sb.append(str2);
                    return Color.parseColor(sb.toString());
                } catch (IllegalArgumentException unused) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("InAppBannerQP/Illegal Argument exception parsing color:");
                    sb2.append(str2);
                    sb2.append(", isDarkMode?");
                    sb2.append(z);
                    Log.e(sb2.toString());
                }
            }
        }
        return A002;
    }

    public C607339d A02(C87374On r3, C55982vW r4) {
        Object obj;
        C592233c r0 = ((C21642ATi) r3).A06;
        if (r0 != null) {
            obj = r0.A00.get("wa_wds_style");
        } else {
            obj = null;
        }
        if (AnonymousClass00C.A0J(obj, CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID) || !AnonymousClass00C.A0J(obj, "warning")) {
            if (r4 != null) {
                return new AnonymousClass2lR(r4);
            }
            return C50702lO.A00;
        } else if (r4 != null) {
            return new AnonymousClass2lT(r4);
        } else {
            return C50722lQ.A00;
        }
    }

    public void BK9() {
        Object value = this.A07.getValue();
        AnonymousClass00C.A08(value);
        ((View) value).setVisibility(8);
    }

    public C87374On A01(AnonymousClass3KG r2) {
        return r2.A00;
    }
}
