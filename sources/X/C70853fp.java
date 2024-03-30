package X;

import android.view.View;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.3fp  reason: invalid class name and case insensitive filesystem */
public class C70853fp implements AnonymousClass4UQ {
    public TextEmojiLabel A00;
    public WDSButton A01;
    public WDSButton A02;
    public C65053Qn A03;
    public final View A04;
    public final C21060yb A05;
    public final C20810yC A06;

    public int getType() {
        return 1;
    }

    public void BKD() {
        this.A04.setVisibility(8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BoA(X.AnonymousClass3BC r11) {
        /*
            r10 = this;
            android.view.View r1 = r10.A04
            r0 = 0
            r1.setVisibility(r0)
            android.content.Context r2 = r1.getContext()
            r0 = 2131430714(0x7f0b0d3a, float:1.8483137E38)
            com.whatsapp.TextEmojiLabel r0 = X.C36401kF.A0O(r1, r0)
            r10.A00 = r0
            r0 = 2131427529(0x7f0b00c9, float:1.8476677E38)
            com.whatsapp.wds.components.button.WDSButton r0 = X.C36431kI.A0y(r1, r0)
            r10.A01 = r0
            r0 = 2131427530(0x7f0b00ca, float:1.8476679E38)
            com.whatsapp.wds.components.button.WDSButton r0 = X.C36431kI.A0y(r1, r0)
            r10.A02 = r0
            int r0 = r11.A0B
            r4 = -1
            if (r0 != 0) goto L_0x014d
            r8 = 2131893610(0x7f121d6a, float:1.9422001E38)
            r7 = 2131893612(0x7f121d6c, float:1.9422005E38)
            r6 = 2131232812(0x7f08082c, float:1.8081744E38)
            r5 = 0
        L_0x0034:
            com.whatsapp.wds.components.button.WDSButton r1 = r10.A01
            X.1gn r0 = X.C34301gn.DESTRUCTIVE
            r1.setAction(r0)
        L_0x003b:
            com.whatsapp.wds.components.button.WDSButton r1 = r10.A01
            r3 = 8
            if (r1 == 0) goto L_0x0051
            r0 = 0
            r1.setVisibility(r0)
            r1.setText(r8)
            X.C36331k8.A0q(r2, r1, r7)
            X.C33521fV.A03(r1, r8)
            r1.setIcon((int) r6)
        L_0x0051:
            com.whatsapp.wds.components.button.WDSButton r1 = r10.A01
            r0 = 12
            X.C67143Yr.A00(r1, r10, r5, r0)
        L_0x0058:
            int r0 = r11.A00
            r8 = 5263(0x148f, float:7.375E-42)
            if (r0 != 0) goto L_0x012b
            X.0yC r0 = r10.A06
            boolean r0 = r0.A0E(r8)
            r9 = 2131886384(0x7f120130, float:1.9407345E38)
            r7 = 2131886387(0x7f120133, float:1.9407351E38)
            if (r0 == 0) goto L_0x0072
            r9 = 2131886388(0x7f120134, float:1.9407353E38)
            r7 = 2131886388(0x7f120134, float:1.9407353E38)
        L_0x0072:
            r6 = r9
            r5 = 2131232806(0x7f080826, float:1.8081732E38)
            r3 = 0
        L_0x0077:
            com.whatsapp.wds.components.button.WDSButton r1 = r10.A02
            if (r1 == 0) goto L_0x008d
            r0 = 0
            r1.setVisibility(r0)
            r1.setText(r9)
            if (r7 == 0) goto L_0x0087
            X.C36331k8.A0q(r2, r1, r7)
        L_0x0087:
            X.C33521fV.A03(r1, r6)
            r1.setIcon((int) r5)
        L_0x008d:
            com.whatsapp.wds.components.button.WDSButton r1 = r10.A02
            r0 = 13
            X.C67143Yr.A00(r1, r10, r3, r0)
        L_0x0094:
            X.0yC r7 = r10.A06
            boolean r0 = r7.A0E(r8)
            if (r0 == 0) goto L_0x00b4
            com.whatsapp.wds.components.button.WDSButton r0 = r10.A01
            X.1gk r1 = X.C34271gk.SMALL
            r0.setSize(r1)
            com.whatsapp.wds.components.button.WDSButton r0 = r10.A02
            r0.setSize(r1)
            com.whatsapp.wds.components.button.WDSButton r0 = r10.A01
            X.1Qp r1 = X.C27981Qp.OUTLINE
            r0.setVariant(r1)
            com.whatsapp.wds.components.button.WDSButton r0 = r10.A02
            r0.setVariant(r1)
        L_0x00b4:
            int r3 = r11.A07
            if (r3 == r4) goto L_0x011d
            android.text.SpannableStringBuilder r4 = new android.text.SpannableStringBuilder
            r4.<init>()
            java.lang.String r6 = r2.getString(r3)
            r4.append(r6)
            android.content.res.Resources r5 = r2.getResources()
            r1 = 2130968976(0x7f040190, float:1.754662E38)
            r0 = 2131100091(0x7f0601bb, float:1.7812554E38)
            int r0 = X.C224514j.A00(r2, r1, r0)
            int r1 = r5.getColor(r0)
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r0.<init>(r1)
            int r6 = r6.length()
            r5 = 33
            r1 = 0
            r4.setSpan(r0, r1, r6, r5)
            int r0 = r11.A06
            if (r0 != 0) goto L_0x0112
            X.1mJ r0 = new X.1mJ
            r0.<init>()
            r4.setSpan(r0, r1, r6, r5)
            com.whatsapp.TextEmojiLabel r0 = r10.A00
            X.C36331k8.A1A(r7, r0)
            com.whatsapp.TextEmojiLabel r1 = r10.A00
            X.0yb r0 = r10.A05
            X.C36331k8.A16(r1, r0)
            int r0 = r11.A05
            java.lang.String r1 = r2.getString(r0)
            X.3Qn r0 = r10.A03
            android.text.SpannableStringBuilder r1 = r0.A01(r1)
            java.lang.String r0 = " "
            android.text.SpannableStringBuilder r0 = r4.append(r0)
            r0.append(r1)
        L_0x0112:
            com.whatsapp.TextEmojiLabel r0 = r10.A00
            r0.setText(r4)
            com.whatsapp.TextEmojiLabel r0 = r10.A00
            X.C36331k8.A0q(r2, r0, r3)
        L_0x011c:
            return
        L_0x011d:
            java.lang.String r1 = r11.A0C
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x011c
            com.whatsapp.TextEmojiLabel r0 = r10.A00
            r0.setText(r1)
            return
        L_0x012b:
            int r0 = r11.A0A
            if (r0 != 0) goto L_0x0146
            int r9 = r11.A09
            if (r9 != r4) goto L_0x0142
            r9 = 2131891673(0x7f1215d9, float:1.9418073E38)
            r7 = 2131891675(0x7f1215db, float:1.9418077E38)
            r6 = 2131887154(0x7f120432, float:1.9408907E38)
        L_0x013c:
            r5 = 2131232810(0x7f08082a, float:1.808174E38)
            r3 = 1
            goto L_0x0077
        L_0x0142:
            int r7 = r11.A08
            r6 = r9
            goto L_0x013c
        L_0x0146:
            com.whatsapp.wds.components.button.WDSButton r0 = r10.A02
            r0.setVisibility(r3)
            goto L_0x0094
        L_0x014d:
            int r0 = r11.A02
            if (r0 != 0) goto L_0x0161
            int r8 = r11.A01
            if (r8 != r4) goto L_0x0158
            r8 = 2131886885(0x7f120325, float:1.9408361E38)
        L_0x0158:
            r7 = 2131886895(0x7f12032f, float:1.9408382E38)
            r6 = 2131232808(0x7f080828, float:1.8081736E38)
            r5 = 1
            goto L_0x0034
        L_0x0161:
            int r0 = r11.A04
            if (r0 != 0) goto L_0x0178
            boolean r0 = r11.A0D
            r7 = 2131889456(0x7f120d30, float:1.9413576E38)
            if (r0 == 0) goto L_0x016f
            r7 = 2131889442(0x7f120d22, float:1.9413548E38)
        L_0x016f:
            r8 = 2131889452(0x7f120d2c, float:1.9413568E38)
            r6 = 2131232274(0x7f080612, float:1.8080653E38)
            r5 = 2
            goto L_0x0034
        L_0x0178:
            int r0 = r11.A03
            if (r0 != 0) goto L_0x0188
            r8 = 2131888874(0x7f120aea, float:1.9412396E38)
            r7 = 2131888882(0x7f120af2, float:1.9412412E38)
            r6 = 2131232176(0x7f0805b0, float:1.8080454E38)
            r5 = 3
            goto L_0x003b
        L_0x0188:
            r1 = 8
            com.whatsapp.wds.components.button.WDSButton r0 = r10.A01
            r0.setVisibility(r1)
            r3 = 8
            goto L_0x0058
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70853fp.BoA(X.3BC):void");
    }

    public boolean isVisible() {
        return AnonymousClass000.A1Q(this.A04.getVisibility());
    }

    public C70853fp(View view, C21060yb r2, C20810yC r3) {
        this.A06 = r3;
        this.A05 = r2;
        this.A04 = view;
    }
}
