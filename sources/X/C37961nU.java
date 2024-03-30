package X;

import android.widget.BaseAdapter;
import com.whatsapp.calling.callhistory.CallLogActivity;
import java.util.List;

/* renamed from: X.1nU  reason: invalid class name and case insensitive filesystem */
public class C37961nU extends BaseAdapter {
    public AnonymousClass3KV A00;
    public List A01 = AnonymousClass001.A0I();
    public final /* synthetic */ CallLogActivity A02;

    public long getItemId(int i) {
        return (long) i;
    }

    public int getViewTypeCount() {
        return 1;
    }

    public C37961nU(CallLogActivity callLogActivity) {
        this.A02 = callLogActivity;
    }

    public int getCount() {
        return C36371kC.A06(this.A01);
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A01.get(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0203, code lost:
        if (r5.A0P() != false) goto L_0x0205;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x023d, code lost:
        if (r1 == false) goto L_0x0068;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r13, android.view.View r14, android.view.ViewGroup r15) {
        /*
            r12 = this;
            if (r14 != 0) goto L_0x028c
            com.whatsapp.calling.callhistory.CallLogActivity r2 = r12.A02
            android.view.LayoutInflater r1 = r2.getLayoutInflater()
            r0 = 2131624321(0x7f0e0181, float:1.8875818E38)
            android.view.View r14 = X.C36361kB.A0E(r1, r15, r0)
            X.3FG r0 = new X.3FG
            r0.<init>(r14, r2)
            r14.setTag(r0)
            r1 = 2
            X.C011504z.A06(r14, r1)
            r1 = 2131433495(0x7f0b1817, float:1.8488777E38)
            android.view.View r2 = r14.findViewById(r1)
            r1 = 1
            X.C011504z.A06(r2, r1)
        L_0x0026:
            java.util.List r1 = r12.A01
            java.lang.Object r5 = r1.get(r13)
            X.5Nh r5 = (X.C107265Nh) r5
            X.3KV r4 = r12.A00
            com.whatsapp.calling.callhistory.CallLogActivity r3 = r0.A0B
            X.0yC r1 = r3.A0D
            if (r4 == 0) goto L_0x0241
            r7 = 2131234024(0x7f080ce8, float:1.8084202E38)
        L_0x0039:
            int r1 = X.AnonymousClass3UE.A02(r5)
            android.widget.ImageView r2 = r0.A03
            r2.setImageResource(r7)
            int r1 = X.C36381kD.A05(r2, r1)
            X.AnonymousClass3UF.A0E(r2, r1)
            android.widget.TextView r8 = r0.A08
            X.0yC r2 = r3.A0D
            boolean r1 = X.C34681hT.A0I(r2)
            r6 = 0
            if (r1 == 0) goto L_0x020a
            boolean r1 = r5.A0O()
            if (r1 != 0) goto L_0x0205
            boolean r1 = r5.A0Q()
            if (r1 == 0) goto L_0x01ff
            r1 = 6307(0x18a3, float:8.838E-42)
            boolean r1 = r2.A0E(r1)
            if (r1 == 0) goto L_0x01ff
        L_0x0068:
            r7 = 2131891101(0x7f12139d, float:1.9416913E38)
        L_0x006b:
            java.lang.Object[] r1 = new java.lang.Object[r6]
            X.2ft r2 = new X.2ft
            r2.<init>(r1, r7)
        L_0x0072:
            android.content.Context r1 = r8.getContext()
            java.lang.CharSequence r1 = r2.A00(r1)
            r8.setText(r1)
            X.0yC r1 = r3.A0D
            boolean r1 = X.C34681hT.A0I(r1)
            r7 = 8
            if (r1 == 0) goto L_0x01eb
            int r2 = r5.A07
            r1 = 5
            if (r2 == r1) goto L_0x0096
            X.6by r1 = r5.A04
            boolean r1 = r1.A03
            if (r1 == 0) goto L_0x01e6
            X.3Ir r1 = r5.A0C
            if (r1 != 0) goto L_0x01e6
        L_0x0096:
            r2 = 2131101134(0x7f0605ce, float:1.781467E38)
        L_0x0099:
            android.content.Context r1 = r8.getContext()
            X.C36331k8.A0r(r1, r8, r2)
            android.widget.ImageView r1 = r0.A02
            r1.setVisibility(r7)
        L_0x00a5:
            android.widget.TextView r9 = r0.A06
            android.content.Context r10 = r9.getContext()
            X.0wo r8 = r3.A07
            long r1 = r5.A01
            long r1 = r8.A08(r1)
            r8 = 1
            java.lang.String r1 = android.text.format.DateUtils.formatDateTime(r10, r1, r8)
            r9.setText(r1)
            int r9 = r5.A07
            r1 = 5
            if (r9 != r1) goto L_0x01b2
            android.widget.TextView r10 = r0.A07
            X.0ts r9 = r3.A00
            int r1 = r5.A09
            long r1 = (long) r1
            java.lang.String r1 = X.AnonymousClass3UY.A07(r9, r1)
            r10.setText(r1)
            r10.setVisibility(r6)
            long r1 = r5.A0B
            r10 = 0
            int r9 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r9 <= 0) goto L_0x01d1
            android.widget.TextView r9 = r0.A05
            X.0ts r7 = r3.A00
            X.AnonymousClass3TF.A05(r9, r7, r1)
            r9.setVisibility(r6)
        L_0x00e3:
            if (r4 == 0) goto L_0x018f
            com.whatsapp.jid.UserJid r4 = r4.A05
            X.171 r2 = r3.A0G
            X.1A5 r1 = r3.A0M
            X.141 r1 = r1.A01(r4)
            java.lang.String r2 = X.C36381kD.A0v(r2, r1)
            boolean r1 = X.C36431kI.A1V(r3, r4)
            if (r1 == 0) goto L_0x018b
            r1 = 2131893815(0x7f121e37, float:1.9422417E38)
            java.lang.String r6 = r3.getString(r1)
        L_0x0100:
            if (r6 == 0) goto L_0x0112
            android.widget.TextView r4 = r0.A09
            X.0ts r2 = r3.A00
            java.lang.String r1 = ""
            java.lang.String r1 = X.AnonymousClass14B.A04(r2, r1, r6)
            r4.setText(r1)
            r4.setContentDescription(r6)
        L_0x0112:
            X.0yC r1 = r3.A0D
            boolean r1 = X.C34681hT.A0I(r1)
            if (r1 == 0) goto L_0x013e
            boolean r1 = r5.A0O()
            if (r1 == 0) goto L_0x015d
            r6 = 2131887479(0x7f120577, float:1.9409566E38)
        L_0x0123:
            r1 = 2131234211(0x7f080da3, float:1.8084581E38)
        L_0x0126:
            android.widget.ImageView r4 = r0.A04
            r4.setImageResource(r1)
            android.content.Context r1 = r4.getContext()
            X.C36331k8.A0q(r1, r4, r6)
            android.widget.TextView r2 = r0.A0A
            r2.setText(r6)
            r1 = 0
            r4.setVisibility(r1)
            r2.setVisibility(r1)
        L_0x013e:
            X.0yC r2 = r3.A0D
            r1 = 4004(0xfa4, float:5.611E-42)
            boolean r1 = r2.A0E(r1)
            if (r1 == 0) goto L_0x015c
            android.view.View r4 = r0.A01
            r1 = 43
            X.C36411kG.A1C(r4, r0, r5, r1)
            r2 = 0
            X.AnonymousClass4Y7.A00(r4, r0, r5, r2)
            java.util.HashSet r1 = r3.A0k
            boolean r1 = r1.contains(r5)
            r0.A00(r1, r2, r2)
        L_0x015c:
            return r14
        L_0x015d:
            boolean r1 = r5.A0Q()
            if (r1 == 0) goto L_0x0171
            X.0yC r2 = r3.A0D
            r1 = 6307(0x18a3, float:8.838E-42)
            boolean r1 = r2.A0E(r1)
            if (r1 == 0) goto L_0x0171
            r6 = 2131887475(0x7f120573, float:1.9409558E38)
            goto L_0x0123
        L_0x0171:
            boolean r1 = r5.A0P()
            if (r1 == 0) goto L_0x017e
            r6 = 2131887477(0x7f120575, float:1.9409562E38)
            r1 = 2131234104(0x7f080d38, float:1.8084364E38)
            goto L_0x0126
        L_0x017e:
            android.widget.ImageView r1 = r0.A04
            r2 = 8
            r1.setVisibility(r2)
            android.widget.TextView r1 = r0.A0A
            r1.setVisibility(r2)
            goto L_0x013e
        L_0x018b:
            r1 = 2131893814(0x7f121e36, float:1.9422415E38)
            goto L_0x01ac
        L_0x018f:
            boolean r1 = r5.A0M()
            if (r1 == 0) goto L_0x0112
            X.6by r6 = r5.A04
            boolean r1 = r6.A03
            if (r1 != 0) goto L_0x0112
            X.171 r4 = r3.A0G
            X.1A5 r2 = r3.A0M
            com.whatsapp.jid.UserJid r1 = r6.A01
            X.141 r1 = r2.A01(r1)
            java.lang.String r2 = X.C36381kD.A0v(r4, r1)
            r1 = 2131890762(0x7f12124a, float:1.9416225E38)
        L_0x01ac:
            java.lang.String r6 = X.C36351kA.A0w(r3, r2, r8, r1)
            goto L_0x0100
        L_0x01b2:
            X.6by r1 = r5.A04
            boolean r1 = r1.A03
            if (r1 == 0) goto L_0x01e0
            if (r4 != 0) goto L_0x01e0
            r1 = 2
            if (r9 == r1) goto L_0x01dc
            r1 = 3
            if (r9 == r1) goto L_0x01d8
            r1 = 4
            r2 = 2131895893(0x7f122655, float:1.9426632E38)
            if (r9 == r1) goto L_0x01c9
            r2 = 2131887314(0x7f1204d2, float:1.9409232E38)
        L_0x01c9:
            android.widget.TextView r1 = r0.A07
            r1.setText(r2)
            r1.setVisibility(r6)
        L_0x01d1:
            android.widget.TextView r1 = r0.A05
            r1.setVisibility(r7)
            goto L_0x00e3
        L_0x01d8:
            r2 = 2131896050(0x7f1226f2, float:1.942695E38)
            goto L_0x01c9
        L_0x01dc:
            r2 = 2131896015(0x7f1226cf, float:1.942688E38)
            goto L_0x01c9
        L_0x01e0:
            android.widget.TextView r1 = r0.A07
            r1.setVisibility(r7)
            goto L_0x01d1
        L_0x01e6:
            r2 = 2131102509(0x7f060b2d, float:1.7817458E38)
            goto L_0x0099
        L_0x01eb:
            android.widget.ImageView r8 = r0.A02
            r8.setVisibility(r6)
            boolean r2 = r5.A0K
            r1 = 2131231779(0x7f080423, float:1.8079649E38)
            if (r2 == 0) goto L_0x01fa
            r1 = 2131231867(0x7f08047b, float:1.8079827E38)
        L_0x01fa:
            r8.setImageResource(r1)
            goto L_0x00a5
        L_0x01ff:
            boolean r1 = r5.A0P()
            if (r1 == 0) goto L_0x020a
        L_0x0205:
            r7 = 2131894381(0x7f12206d, float:1.9423565E38)
            goto L_0x006b
        L_0x020a:
            if (r4 == 0) goto L_0x0217
            java.lang.String r1 = r4.A00()
            X.2fr r2 = new X.2fr
            r2.<init>(r1)
            goto L_0x0072
        L_0x0217:
            X.6by r1 = r5.A04
            boolean r1 = r1.A03
            if (r1 == 0) goto L_0x0222
            r7 = 2131892004(0x7f121724, float:1.9418744E38)
            goto L_0x006b
        L_0x0222:
            int r2 = r5.A07
            r1 = 5
            if (r2 != r1) goto L_0x022c
            r7 = 2131890444(0x7f12110c, float:1.941558E38)
            goto L_0x006b
        L_0x022c:
            int r2 = r5.A07
            r1 = 6
            if (r2 != r1) goto L_0x0236
            r7 = 2131886148(0x7f120044, float:1.9406867E38)
            goto L_0x006b
        L_0x0236:
            boolean r1 = r5.A0O()
            r7 = 2131887478(0x7f120576, float:1.9409564E38)
            if (r1 != 0) goto L_0x006b
            goto L_0x0068
        L_0x0241:
            boolean r1 = X.C34681hT.A0I(r1)
            if (r1 == 0) goto L_0x027e
            X.00T r1 = X.AnonymousClass6X4.A0E
            r1 = 0
            X.AnonymousClass00C.A0D(r5, r1)
            boolean r6 = X.C222013h.A07
            X.6by r1 = r5.A04
            boolean r2 = r1.A03
            boolean r1 = r5.A0K
            if (r2 == 0) goto L_0x0268
            if (r1 == 0) goto L_0x0263
            r7 = 2131231250(0x7f080212, float:1.8078576E38)
            if (r6 == 0) goto L_0x0039
            r7 = 2131231251(0x7f080213, float:1.8078578E38)
            goto L_0x0039
        L_0x0263:
            r7 = 2131231256(0x7f080218, float:1.8078588E38)
            goto L_0x0039
        L_0x0268:
            if (r1 == 0) goto L_0x0274
            r7 = 2131231247(0x7f08020f, float:1.807857E38)
            if (r6 == 0) goto L_0x0039
            r7 = 2131231248(0x7f080210, float:1.8078572E38)
            goto L_0x0039
        L_0x0274:
            r7 = 2131231253(0x7f080215, float:1.8078582E38)
            if (r6 == 0) goto L_0x0039
            r7 = 2131231254(0x7f080216, float:1.8078584E38)
            goto L_0x0039
        L_0x027e:
            X.6by r1 = r5.A04
            boolean r1 = r1.A03
            r7 = 2131234028(0x7f080cec, float:1.808421E38)
            if (r1 == 0) goto L_0x0039
            r7 = 2131234032(0x7f080cf0, float:1.8084218E38)
            goto L_0x0039
        L_0x028c:
            java.lang.Object r0 = r14.getTag()
            X.3FG r0 = (X.AnonymousClass3FG) r0
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37961nU.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
