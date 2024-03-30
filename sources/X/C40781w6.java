package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity;
import java.util.List;

/* renamed from: X.1w6  reason: invalid class name and case insensitive filesystem */
public class C40781w6 extends AnonymousClass0CZ {
    public final List A00;
    public final /* synthetic */ ViewSharedContactArrayActivity A01;

    public C40781w6(ViewSharedContactArrayActivity viewSharedContactArrayActivity, List list) {
        this.A01 = viewSharedContactArrayActivity;
        this.A00 = list;
    }

    public int A0J() {
        return this.A00.size();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0270, code lost:
        if (r3.A01.A0K == false) goto L_0x0272;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BSE(X.AnonymousClass0D3 r22, int r23) {
        /*
            r21 = this;
            r14 = r22
            r3 = r21
            java.util.List r0 = r3.A00
            r1 = r23
            java.lang.Object r2 = r0.get(r1)
            int r6 = r14.A01
            r4 = 2
            r7 = 8
            r1 = 0
            if (r6 == 0) goto L_0x031e
            r5 = 1
            if (r6 == r5) goto L_0x0057
            if (r6 == r4) goto L_0x0261
            r0 = 3
            if (r6 != r0) goto L_0x0047
            X.1yH r14 = (X.C42101yH) r14
            X.38t r2 = (X.AnonymousClass38t) r2
            android.widget.TextView r9 = r14.A01
            r9.setTextDirection(r0)
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity r8 = r3.A01
            X.0wQ r0 = r8.A02
            X.141 r7 = r2.A01
            boolean r0 = X.C36361kB.A1X(r0, r7)
            if (r0 == 0) goto L_0x0048
            r0 = 2131895545(0x7f1224f9, float:1.9425926E38)
            java.lang.String r0 = r8.getString(r0)
        L_0x0038:
            r9.setText(r0)
            android.view.View r9 = r14.A00
            r0 = 38
            X.2iF r1 = new X.2iF
            r1.<init>(r3, r2, r0)
        L_0x0044:
            r9.setOnClickListener(r1)
        L_0x0047:
            return
        L_0x0048:
            r6 = 2131895544(0x7f1224f8, float:1.9425924E38)
            java.lang.Object[] r4 = new java.lang.Object[r5]
            X.171 r0 = r8.A05
            X.C36361kB.A1F(r0, r7, r4, r1)
            java.lang.String r0 = r8.getString(r6, r4)
            goto L_0x0038
        L_0x0057:
            X.1ym r14 = (X.C42411ym) r14
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity r15 = r3.A01
            android.view.View r7 = r14.A05
            r7.setClickable(r5)
            android.widget.ImageView r8 = r14.A06
            r8.setVisibility(r1)
            r8.setClickable(r5)
            android.widget.ImageView r9 = r14.A07
            r9.setVisibility(r1)
            r9.setClickable(r5)
            android.widget.ImageView r6 = r14.A02
            r6.setVisibility(r1)
            r10 = r2
            X.38s r10 = (X.AnonymousClass38s) r10
            java.util.ArrayList r4 = r15.A0N
            int r0 = r10.A00
            java.lang.Object r4 = r4.get(r0)
            android.util.SparseArray r4 = (android.util.SparseArray) r4
            int r0 = r10.A01
            X.35r r4 = com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity.A01(r4, r0)
            android.view.View r13 = r14.A00
            r13.setTag(r4)
            java.lang.Object r0 = r10.A02
            boolean r10 = r0 instanceof X.C607439e
            r12 = 4
            if (r10 == 0) goto L_0x0104
            X.39e r0 = (X.C607439e) r0
            r4.A00 = r0
            r18 = 2131234061(0x7f080d0d, float:1.8084277E38)
            boolean r10 = r15.A0K
            if (r10 == 0) goto L_0x00a2
            r18 = 2131231779(0x7f080423, float:1.8079649E38)
        L_0x00a2:
            java.lang.String r10 = r0.A02
            r11 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r16 = X.AnonymousClass14B.A0C(r10, r11)
            int r10 = r0.A00
            if (r10 != 0) goto L_0x00fd
            java.lang.String r10 = r0.A03
            java.lang.String r17 = X.AnonymousClass14B.A0C(r10, r11)
        L_0x00b4:
            boolean r4 = r4.A01
            r19 = 1
            r20 = r4
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity.A0G(r14, r15, r16, r17, r18, r19, r20)
            boolean r4 = r15.A0K
            if (r4 != 0) goto L_0x025c
            com.whatsapp.jid.UserJid r5 = r0.A01
            if (r5 == 0) goto L_0x0289
            boolean r0 = X.C36431kI.A1V(r15, r5)
            if (r0 != 0) goto L_0x0289
            X.16D r0 = r15.A03
            X.141 r4 = r0.A0D(r5)
            r6.setVisibility(r1)
            r0 = 33
            X.AnonymousClass3YM.A00(r7, r3, r5, r2, r0)
            r2 = 1041865114(0x3e19999a, float:0.15)
            X.3Z8 r0 = new X.3Z8
            r0.<init>(r2, r2, r2, r2)
            r8.setOnTouchListener(r0)
            r0 = 32
            X.AnonymousClass3YM.A00(r8, r3, r5, r4, r0)
            X.3Z8 r0 = new X.3Z8
            r0.<init>(r2, r2, r2, r2)
            r9.setOnTouchListener(r0)
            r9.setVisibility(r1)
            r0 = 47
            X.3YC r1 = new X.3YC
            r1.<init>(r3, r4, r0)
            goto L_0x0044
        L_0x00fd:
            java.lang.Class<android.provider.ContactsContract$CommonDataKinds$Phone> r11 = android.provider.ContactsContract.CommonDataKinds.Phone.class
            java.lang.String r17 = com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity.A07(r15, r11, r10)
            goto L_0x00b4
        L_0x0104:
            boolean r8 = r0 instanceof X.AnonymousClass3A9
            if (r8 == 0) goto L_0x01cf
            X.3A9 r0 = (X.AnonymousClass3A9) r0
            r4.A00 = r0
            java.lang.Class r2 = r0.A01
            java.lang.Class<android.provider.ContactsContract$CommonDataKinds$Email> r7 = android.provider.ContactsContract.CommonDataKinds.Email.class
            if (r2 != r7) goto L_0x013f
            java.lang.String r2 = r0.A02
            r3 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r16 = X.AnonymousClass14B.A0C(r2, r3)
            int r2 = r0.A00
            if (r2 != 0) goto L_0x013a
            java.lang.String r0 = r0.A03
            java.lang.String r17 = X.AnonymousClass14B.A0C(r0, r3)
        L_0x0124:
            r18 = 2131231357(0x7f08027d, float:1.8078793E38)
            r19 = 2
        L_0x0129:
            boolean r0 = r4.A01
            r20 = r0
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity.A0G(r14, r15, r16, r17, r18, r19, r20)
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity.A0F(r14)
            r6.setVisibility(r1)
        L_0x0136:
            r13.setClickable(r5)
            return
        L_0x013a:
            java.lang.String r17 = com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity.A07(r15, r7, r2)
            goto L_0x0124
        L_0x013f:
            java.lang.Class<android.provider.ContactsContract$CommonDataKinds$StructuredPostal> r7 = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.class
            if (r2 != r7) goto L_0x0047
            X.3PZ r10 = r0.A04
            if (r10 == 0) goto L_0x01cc
            java.lang.StringBuilder r9 = X.AnonymousClass000.A0u()
            java.lang.String r3 = r10.A03
            if (r3 == 0) goto L_0x0161
            int r2 = r3.length()
            if (r2 <= 0) goto L_0x0161
            java.lang.String r2 = X.AnonymousClass3PZ.A00(r3)
            r9.append(r2)
            r2 = 10
            r9.append(r2)
        L_0x0161:
            r12 = 0
            java.lang.String r3 = r10.A00
            r11 = 1
            if (r3 == 0) goto L_0x0171
            int r2 = r3.length()
            if (r2 <= 0) goto L_0x0171
            r9.append(r3)
            r12 = 1
        L_0x0171:
            java.lang.String r3 = r10.A02
            java.lang.String r8 = " "
            if (r3 == 0) goto L_0x0186
            int r2 = r3.length()
            if (r2 <= 0) goto L_0x0186
            if (r12 == 0) goto L_0x0182
            r9.append(r8)
        L_0x0182:
            r9.append(r3)
            r12 = 1
        L_0x0186:
            java.lang.String r3 = r10.A04
            if (r3 == 0) goto L_0x01ca
            int r2 = r3.length()
            if (r2 <= 0) goto L_0x01ca
            if (r12 == 0) goto L_0x0195
            r9.append(r8)
        L_0x0195:
            r9.append(r3)
        L_0x0198:
            java.lang.String r3 = r10.A01
            if (r3 == 0) goto L_0x01aa
            int r2 = r3.length()
            if (r2 <= 0) goto L_0x01aa
            if (r11 == 0) goto L_0x01a7
            r9.append(r8)
        L_0x01a7:
            r9.append(r3)
        L_0x01aa:
            java.lang.String r2 = r9.toString()
        L_0x01ae:
            r3 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r16 = X.AnonymousClass14B.A0C(r2, r3)
            int r2 = r0.A00
            if (r2 != 0) goto L_0x01c5
            java.lang.String r0 = r0.A03
            java.lang.String r17 = X.AnonymousClass14B.A0C(r0, r3)
        L_0x01be:
            r18 = 2131231354(0x7f08027a, float:1.8078787E38)
            r19 = 3
            goto L_0x0129
        L_0x01c5:
            java.lang.String r17 = com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity.A07(r15, r7, r2)
            goto L_0x01be
        L_0x01ca:
            r11 = r12
            goto L_0x0198
        L_0x01cc:
            java.lang.String r2 = "null"
            goto L_0x01ae
        L_0x01cf:
            boolean r8 = r0 instanceof X.AnonymousClass3KL
            if (r8 == 0) goto L_0x01e6
            X.3KL r0 = (X.AnonymousClass3KL) r0
            r0.toString()
            java.lang.String r7 = r0.A02
            java.lang.String r3 = r0.A01
            java.lang.String r2 = "BDAY"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x02c6
            goto L_0x0290
        L_0x01e6:
            boolean r8 = r0 instanceof X.AnonymousClass362
            if (r8 == 0) goto L_0x0230
            X.362 r0 = (X.AnonymousClass362) r0
            java.lang.String r3 = r0.A01
            int r1 = r0.A00
            switch(r1) {
                case 1: goto L_0x022c;
                case 2: goto L_0x0228;
                case 3: goto L_0x0224;
                case 4: goto L_0x0220;
                case 5: goto L_0x021c;
                case 6: goto L_0x0218;
                case 7: goto L_0x0214;
                default: goto L_0x01f3;
            }
        L_0x01f3:
            r1 = 2131895755(0x7f1225cb, float:1.9426352E38)
        L_0x01f6:
            java.lang.String r2 = r15.getString(r1)
            r1 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r16 = X.AnonymousClass14B.A0C(r3, r1)
            java.lang.String r17 = X.AnonymousClass14B.A0C(r2, r1)
            boolean r1 = r4.A01
            r18 = 2131232874(0x7f08086a, float:1.808187E38)
            r19 = 3
            r20 = r1
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity.A0G(r14, r15, r16, r17, r18, r19, r20)
            r4.A00 = r0
            goto L_0x02f5
        L_0x0214:
            r1 = 2131896178(0x7f122772, float:1.942721E38)
            goto L_0x01f6
        L_0x0218:
            r1 = 2131896175(0x7f12276f, float:1.9427204E38)
            goto L_0x01f6
        L_0x021c:
            r1 = 2131896180(0x7f122774, float:1.9427214E38)
            goto L_0x01f6
        L_0x0220:
            r1 = 2131896176(0x7f122770, float:1.9427206E38)
            goto L_0x01f6
        L_0x0224:
            r1 = 2131896179(0x7f122773, float:1.9427212E38)
            goto L_0x01f6
        L_0x0228:
            r1 = 2131896174(0x7f12276e, float:1.9427202E38)
            goto L_0x01f6
        L_0x022c:
            r1 = 2131896177(0x7f122771, float:1.9427208E38)
            goto L_0x01f6
        L_0x0230:
            boolean r8 = r0 instanceof X.C599735z
            if (r8 == 0) goto L_0x0047
            X.35z r0 = (X.C599735z) r0
            java.lang.String r9 = r0.A01
            r8 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r16 = X.AnonymousClass14B.A0C(r9, r8)
            boolean r4 = r4.A01
            java.lang.String r17 = ""
            r18 = 2131234061(0x7f080d0d, float:1.8084277E38)
            r19 = 1
            r20 = r4
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity.A0G(r14, r15, r16, r17, r18, r19, r20)
            boolean r4 = r15.A0K
            if (r4 != 0) goto L_0x0259
            r6.setVisibility(r1)
            r1 = 34
            X.AnonymousClass3YM.A00(r7, r3, r0, r2, r1)
            return
        L_0x0259:
            r6.setVisibility(r12)
        L_0x025c:
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity.A0F(r14)
            goto L_0x0136
        L_0x0261:
            X.1yG r14 = (X.C42091yG) r14
            X.33J r2 = (X.AnonymousClass33J) r2
            android.view.View r4 = r14.A00
            boolean r0 = r2.A00
            if (r0 == 0) goto L_0x0272
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity r0 = r3.A01
            boolean r1 = r0.A0K
            r0 = 0
            if (r1 != 0) goto L_0x0274
        L_0x0272:
            r0 = 8
        L_0x0274:
            r4.setVisibility(r0)
            android.view.View r1 = r14.A01
            boolean r0 = r2.A00
            if (r0 == 0) goto L_0x0287
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity r0 = r3.A01
            boolean r0 = r0.A0K
            if (r0 == 0) goto L_0x0287
        L_0x0283:
            r1.setVisibility(r7)
            return
        L_0x0287:
            r7 = 0
            goto L_0x0283
        L_0x0289:
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity.A0F(r14)
            r6.setVisibility(r12)
            return
        L_0x0290:
            java.lang.String r2 = "--"
            boolean r2 = r7.startsWith(r2)     // Catch:{ ParseException -> 0x02c2 }
            if (r2 == 0) goto L_0x02b7
            java.lang.String r8 = "--MM-dd"
        L_0x029a:
            java.util.Locale r3 = java.util.Locale.getDefault()     // Catch:{ ParseException -> 0x02c2 }
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat     // Catch:{ ParseException -> 0x02c2 }
            r2.<init>(r8, r3)     // Catch:{ ParseException -> 0x02c2 }
            java.util.Date r2 = r2.parse(r7)     // Catch:{ ParseException -> 0x02c2 }
            X.C18740tg.A06(r2)     // Catch:{ ParseException -> 0x02c2 }
            long r2 = r2.getTime()     // Catch:{ ParseException -> 0x02c2 }
            if (r5 == 0) goto L_0x02bb
            X.0ts r5 = r15.A0A     // Catch:{ ParseException -> 0x02c2 }
            java.lang.String r7 = X.C20040wv.A03(r5, r2)     // Catch:{ ParseException -> 0x02c2 }
            goto L_0x02c6
        L_0x02b7:
            java.lang.String r8 = "yyyy-MM-dd"
            r5 = 0
            goto L_0x029a
        L_0x02bb:
            X.0ts r5 = r15.A0A     // Catch:{ ParseException -> 0x02c2 }
            java.lang.String r7 = X.C20040wv.A09(r5, r2)     // Catch:{ ParseException -> 0x02c2 }
            goto L_0x02c6
        L_0x02c2:
            r2 = move-exception
            r2.printStackTrace()
        L_0x02c6:
            java.util.HashMap r3 = X.C65643Sx.A0E
            java.lang.String r2 = r0.A01
            boolean r2 = r3.containsKey(r2)
            if (r2 == 0) goto L_0x02f9
            java.util.HashMap r2 = X.C65643Sx.A0D
            java.lang.String r1 = r0.A01
            java.lang.Object r2 = r2.get(r1)
        L_0x02d8:
            java.lang.String r2 = (java.lang.String) r2
        L_0x02da:
            r1 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r16 = X.AnonymousClass14B.A0C(r7, r1)
            java.lang.String r17 = X.AnonymousClass14B.A0C(r2, r1)
            boolean r1 = r4.A01
            r18 = 2131231354(0x7f08027a, float:1.8078787E38)
            r19 = 3
            r20 = r1
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity.A0G(r14, r15, r16, r17, r18, r19, r20)
            r4.A00 = r0
            r6.setVisibility(r12)
        L_0x02f5:
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity.A0F(r14)
            return
        L_0x02f9:
            java.lang.String r3 = r0.A01
            java.lang.String r2 = "URL"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0317
            java.util.Set r2 = r0.A04
            java.lang.Object[] r3 = r2.toArray()
            int r2 = r3.length
            if (r2 <= 0) goto L_0x030f
            r2 = r3[r1]
            goto L_0x02d8
        L_0x030f:
            r1 = 2131895755(0x7f1225cb, float:1.9426352E38)
            java.lang.String r2 = r15.getString(r1)
            goto L_0x02da
        L_0x0317:
            java.util.HashMap r1 = X.C65643Sx.A0D
            java.lang.Object r2 = r1.get(r3)
            goto L_0x02d8
        L_0x031e:
            X.1yX r14 = (X.C42261yX) r14
            X.33K r2 = (X.AnonymousClass33K) r2
            X.3Sx r5 = r2.A00
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity r6 = r3.A01
            boolean r0 = r6.A0K
            if (r0 != 0) goto L_0x0394
            boolean r0 = X.C36421kH.A1V(r6)
            if (r0 != 0) goto L_0x0394
            android.widget.Button r2 = r14.A00
            r2.setVisibility(r1)
            r0 = 48
            X.AnonymousClass3YC.A00(r2, r3, r5, r0)
        L_0x033a:
            com.whatsapp.TextEmojiLabel r10 = r14.A03
            java.lang.String r0 = r5.A03()
            r8 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r9 = X.AnonymousClass14B.A0C(r0, r8)
            android.text.TextPaint r3 = r10.getPaint()
            X.1H2 r2 = r6.A0C
            if (r9 != 0) goto L_0x038a
            r0 = 0
        L_0x034f:
            r10.setText(r0)
            r3 = 0
            java.util.List r0 = r5.A05
            if (r0 == 0) goto L_0x0367
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0367
            java.util.List r0 = r5.A05
            java.lang.Object r0 = r0.get(r1)
            X.360 r0 = (X.AnonymousClass360) r0
            java.lang.String r3 = r0.A00
        L_0x0367:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L_0x037d
            android.widget.TextView r0 = r14.A02
            r0.setVisibility(r7)
        L_0x0372:
            X.1RY r1 = r6.A06
            android.widget.ImageView r0 = r14.A01
            r1.A0C(r0, r5)
            X.C011504z.A06(r0, r4)
            return
        L_0x037d:
            android.widget.TextView r2 = r14.A02
            java.lang.String r0 = X.AnonymousClass14B.A0C(r3, r8)
            r2.setText(r0)
            r2.setVisibility(r1)
            goto L_0x0372
        L_0x038a:
            X.3lH r0 = new X.3lH
            r0.<init>()
            java.lang.CharSequence r0 = X.AnonymousClass3UG.A02(r6, r3, r0, r2, r9)
            goto L_0x034f
        L_0x0394:
            android.widget.Button r0 = r14.A00
            r0.setVisibility(r7)
            goto L_0x033a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40781w6.BSE(X.0D3, int):void");
    }

    public int getItemViewType(int i) {
        Object obj = this.A00.get(i);
        if (obj instanceof AnonymousClass33K) {
            return 0;
        }
        if (obj instanceof AnonymousClass38s) {
            return 1;
        }
        if (obj instanceof AnonymousClass33J) {
            return 2;
        }
        if (obj instanceof AnonymousClass38t) {
            return 3;
        }
        return -1;
    }

    public AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        LayoutInflater A0C = C36351kA.A0C(viewGroup);
        if (i == 0) {
            List list = AnonymousClass0D3.A0I;
            return new C42261yX(A0C.inflate(R.layout.f9nameremoved, (ViewGroup) null, true));
        } else if (i == 1) {
            List list2 = AnonymousClass0D3.A0I;
            return new C42411ym(A0C.inflate(R.layout.f9nameremoved, (ViewGroup) null, true));
        } else if (i == 2) {
            List list3 = AnonymousClass0D3.A0I;
            return new C42091yG(A0C.inflate(R.layout.f9nameremoved, (ViewGroup) null, true));
        } else if (i == 3) {
            List list4 = AnonymousClass0D3.A0I;
            return new C42101yH(A0C.inflate(R.layout.f9nameremoved, (ViewGroup) null, true));
        } else {
            throw new IllegalStateException();
        }
    }
}
