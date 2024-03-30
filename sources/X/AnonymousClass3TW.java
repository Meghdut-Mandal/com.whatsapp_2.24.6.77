package X;

import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.whatsapp.InfoCard;
import com.whatsapp.R;
import com.whatsapp.biz.BusinessHoursView;
import com.whatsapp.biz.BusinessProfileFieldView;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3TW  reason: invalid class name */
public class AnonymousClass3TW {
    public boolean A00;
    public boolean A01;
    public final View A02;
    public final C24801Dv A03;
    public final C225314u A04;
    public final InfoCard A05;
    public final BusinessHoursView A06;
    public final BusinessProfileFieldView A07;
    public final BusinessProfileFieldView A08;
    public final AnonymousClass1KL A09;
    public final C201549jr A0A;
    public final C206949uI A0B;
    public final AnonymousClass171 A0C;
    public final C18820ts A0D;
    public final AnonymousClass141 A0E;
    public final AnonymousClass2XH A0F;
    public final AnonymousClass1QW A0G;
    public final Integer A0H;
    public final List A0I;
    public final List A0J;
    public final boolean A0K;
    public final C19730wQ A0L;

    private void A00(View view) {
        int A052;
        int i;
        BusinessProfileFieldView businessProfileFieldView = this.A07;
        View A022 = C012005e.A02(businessProfileFieldView, R.id.field_textview);
        if (TextUtils.isEmpty(C36371kC.A0u(businessProfileFieldView.A01))) {
            A022.setVisibility(8);
        } else {
            A022.setVisibility(0);
        }
        boolean isEmpty = TextUtils.isEmpty(C36371kC.A0u(businessProfileFieldView.A01));
        Resources resources = A022.getResources();
        int i2 = R.dimen.f7nameremoved;
        if (isEmpty) {
            i2 = R.dimen.f7nameremoved;
        }
        int A053 = C36441kJ.A05(resources, i2);
        C18820ts r2 = this.A0D;
        if (C36351kA.A1Y(r2)) {
            A052 = 0;
        } else {
            A052 = C36441kJ.A05(A022.getResources(), R.dimen.f7nameremoved);
        }
        if (C36351kA.A1Y(r2)) {
            i = C36441kJ.A05(A022.getResources(), R.dimen.f7nameremoved);
        } else {
            i = 0;
        }
        view.setPadding(A052, A053, i, C36441kJ.A05(A022.getResources(), R.dimen.f7nameremoved));
        view.setVisibility(0);
    }

    public static void A02(AnonymousClass3TW r9) {
        UserJid A0l;
        C201549jr r2 = r9.A0A;
        AnonymousClass141 r1 = r9.A0E;
        if (r1 == null) {
            A0l = null;
        } else {
            A0l = C36351kA.A0l(r1);
        }
        r2.A06((Integer) null, r9.A0H, AnonymousClass143.A03(A0l), 3, r9.A01, r9.A00);
        if (r1.A0C()) {
            r2.A02(r9.A0B, 8);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x033c  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x033e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0318  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0328  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(X.C207109uZ r28) {
        /*
            r27 = this;
            r5 = r28
            X.3XS r2 = r5.A07
            java.lang.String r6 = r2.A03
            r0 = r27
            X.1KL r1 = r0.A09
            int r1 = r1.A00()
            r1 = r1 & 8
            if (r1 <= 0) goto L_0x004b
            X.14u r12 = r0.A04
            X.3XE r1 = r2.A00
            java.lang.String r13 = r1.A01
            java.lang.String r11 = r2.A02
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            r10 = 1
            r9 = 0
            r8 = 2
            java.lang.String r7 = ""
            if (r1 != 0) goto L_0x0247
            r4 = 2131888980(0x7f120b54, float:1.941261E38)
            java.lang.Object[] r3 = X.C36441kJ.A1Q()
            r3[r9] = r6
            boolean r1 = android.text.TextUtils.isEmpty(r13)
            if (r1 == 0) goto L_0x0035
            r13 = r7
        L_0x0035:
            r3[r10] = r13
            boolean r1 = android.text.TextUtils.isEmpty(r11)
            if (r1 == 0) goto L_0x003e
            r11 = r7
        L_0x003e:
            r3[r8] = r11
        L_0x0040:
            java.lang.String r1 = r12.getString(r4, r3)
            if (r1 == 0) goto L_0x004a
            java.lang.String r7 = r1.trim()
        L_0x004a:
            r6 = r7
        L_0x004b:
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            r7 = 0
            if (r1 == 0) goto L_0x0185
            X.1QW r1 = r0.A0G
            X.0yC r3 = r1.A03
            r1 = 450(0x1c2, float:6.3E-43)
            boolean r1 = r3.A0E(r1)
            if (r1 == 0) goto L_0x0185
            r1 = 1810(0x712, float:2.536E-42)
            boolean r1 = r3.A0E(r1)
            if (r1 == 0) goto L_0x0185
            java.util.List r4 = r5.A0T
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L_0x0185
            com.whatsapp.biz.BusinessProfileFieldView r12 = r0.A07
            X.0ts r1 = r0.A0D
            java.util.Locale r6 = X.C36401kF.A0x(r1)
            android.content.Context r2 = r12.getContext()
            r1 = 2131886794(0x7f1202ca, float:1.9408177E38)
            java.lang.String r3 = r2.getString(r1)
            java.lang.Object[] r2 = X.AnonymousClass001.A0L()
            r11 = 0
            java.lang.Object r1 = r4.get(r11)
            X.6bY r1 = (X.C134756bY) r1
            java.lang.String r1 = r1.A03
            r2[r11] = r1
            java.lang.String r1 = java.lang.String.format(r6, r3, r2)
            r12.setText(r1, r7)
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L_0x011f
            X.2XH r13 = r0.A0F
            android.content.Context r1 = r12.getContext()
            boolean r1 = r13.A05(r1)
            if (r1 == 0) goto L_0x011f
            java.lang.Object r14 = r4.get(r11)
            X.6bY r14 = (X.C134756bY) r14
            android.view.View r3 = r0.A02
            r1 = 2131428355(0x7f0b0403, float:1.8478352E38)
            android.view.ViewGroup r2 = X.C36411kG.A0P(r3, r1)
            X.14u r4 = r0.A04
            r1 = 2131624270(0x7f0e014e, float:1.8875715E38)
            android.view.View.inflate(r4, r1, r2)
            r1 = 2131431388(0x7f0b0fdc, float:1.8484504E38)
            android.view.View r10 = r3.findViewById(r1)
            r1 = 2131431378(0x7f0b0fd2, float:1.8484484E38)
            android.view.View r6 = r3.findViewById(r1)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "geo:0,0?q="
            r2.append(r1)
            java.lang.String r1 = r14.A03
            java.lang.String r1 = X.AnonymousClass000.A0q(r1, r2)
            android.content.Intent r3 = X.C36331k8.A04(r1)
            r2 = 14
            X.6co r1 = new X.6co
            r1.<init>(r0, r3, r2)
            if (r6 == 0) goto L_0x00ed
            r6.setOnClickListener(r1)
        L_0x00ed:
            r12.setOnClickListener(r1)
            r1 = 2131431389(0x7f0b0fdd, float:1.8484506E38)
            android.view.ViewGroup r9 = X.C36421kH.A0E(r4, r1)
            android.content.Context r1 = r9.getContext()
            X.5BG r8 = new X.5BG
            r8.<init>(r1)
            double r6 = r14.A00
            double r3 = r14.A01
            com.google.android.gms.maps.model.LatLng r2 = new com.google.android.gms.maps.model.LatLng
            r2.<init>(r6, r3)
            int r1 = r14.A02
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r8.A04(r2, r13, r1)
            r1 = -1
            r9.addView(r8, r1, r1)
            r8.setVisibility(r11)
            r0.A00(r10)
            r12.setVisibility(r11)
        L_0x011f:
            java.util.List r1 = r0.A0J
            java.util.Iterator r6 = r1.iterator()
            r4 = 0
        L_0x0126:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0260
            java.lang.Object r8 = r6.next()
            com.whatsapp.biz.BusinessProfileFieldView r8 = (com.whatsapp.biz.BusinessProfileFieldView) r8
            int r3 = r4 + 1
            java.util.List r2 = r5.A0U
            int r1 = r2.size()
            if (r4 >= r1) goto L_0x0183
            java.lang.String r2 = X.C36401kF.A0s(r2, r4)
        L_0x0140:
            boolean r1 = r0.A0K
            if (r1 == 0) goto L_0x014a
            boolean r1 = A03(r2)
            if (r1 != 0) goto L_0x0181
        L_0x014a:
            r1 = 0
            r8.setText(r1, r1)
            r8.setSubText(r1)
            r1 = 2131232082(0x7f080552, float:1.8080263E38)
            r8.setIcon((int) r1)
            r1 = 0
            r8.setText(r2, r1)
            X.1Dv r7 = r0.A03
            X.2XH r11 = r0.A0F
            X.9jr r9 = r0.A0A
            r14 = 0
            X.141 r2 = r0.A0E
            if (r2 == 0) goto L_0x016a
            com.whatsapp.jid.UserJid r1 = X.C36351kA.A0l(r2)
        L_0x016a:
            java.lang.String r13 = X.AnonymousClass143.A03(r1)
            boolean r15 = r2.A0C()
            X.9uI r10 = r0.A0B
            java.lang.Integer r12 = r0.A0H
            boolean r2 = r0.A01
            boolean r1 = r0.A00
            r17 = r1
            r16 = r2
            A01(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
        L_0x0181:
            r4 = r3
            goto L_0x0126
        L_0x0183:
            r2 = 0
            goto L_0x0140
        L_0x0185:
            com.whatsapp.biz.BusinessProfileFieldView r12 = r0.A07
            r12.setText(r6, r7)
            X.1Dv r11 = r0.A03
            X.2XH r15 = r0.A0F
            X.9jr r13 = r0.A0A
            r18 = 2
            X.141 r7 = r0.A0E
            if (r7 != 0) goto L_0x0224
            r1 = 0
        L_0x0197:
            java.lang.String r17 = X.AnonymousClass143.A03(r1)
            boolean r19 = r7.A0C()
            X.9uI r14 = r0.A0B
            java.lang.Integer r4 = r0.A0H
            boolean r3 = r0.A01
            boolean r1 = r0.A00
            r20 = r3
            r21 = r1
            r16 = r4
            A01(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            android.view.View r9 = r0.A02
            r1 = 2131428355(0x7f0b0403, float:1.8478352E38)
            android.view.ViewGroup r4 = X.C36411kG.A0P(r9, r1)
            X.3XE r1 = r2.A00
            java.lang.Double r3 = r1.A02
            r6 = 0
            if (r3 == 0) goto L_0x022a
            java.lang.Double r2 = r1.A03
            if (r2 == 0) goto L_0x022a
            X.14u r10 = r0.A04
            r1 = 2131624270(0x7f0e014e, float:1.8875715E38)
            android.view.View.inflate(r10, r1, r4)
            r1 = 2131431388(0x7f0b0fdc, float:1.8484504E38)
            android.view.View r8 = r9.findViewById(r1)
            r1 = 2131431378(0x7f0b0fd2, float:1.8484484E38)
            android.view.View r11 = r9.findViewById(r1)
            double r3 = r3.doubleValue()
            double r1 = r2.doubleValue()
            com.google.android.gms.maps.model.LatLng r9 = new com.google.android.gms.maps.model.LatLng
            r9.<init>(r3, r1)
            com.whatsapp.biz.catalog.view.EllipsizedTextEmojiLabel r1 = r12.A01
            java.lang.String r3 = X.C36371kC.A0u(r1)
            X.171 r1 = r0.A0C
            java.lang.String r2 = r1.A0H(r7)
            X.3YO r1 = new X.3YO
            r1.<init>(r0, r5, r3, r2)
            r11.setOnClickListener(r1)
            r12.setOnClickListener(r1)
            r1 = 2131431389(0x7f0b0fdd, float:1.8484506E38)
            android.view.ViewGroup r3 = X.C36421kH.A0E(r10, r1)
            android.content.Context r1 = r3.getContext()
            com.whatsapp.location.WaMapView r2 = new com.whatsapp.location.WaMapView
            r2.<init>(r1)
            r1 = 0
            r2.A01(r9, r1, r15)
            r2.A00(r9)
            r1 = -1
            r3.addView(r2, r1, r1)
            r2.setVisibility(r6)
            r0.A00(r8)
            r12.setVisibility(r6)
            goto L_0x011f
        L_0x0224:
            com.whatsapp.jid.UserJid r1 = X.C36351kA.A0l(r7)
            goto L_0x0197
        L_0x022a:
            com.whatsapp.biz.catalog.view.EllipsizedTextEmojiLabel r1 = r12.A01
            java.lang.String r1 = X.C36371kC.A0u(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0239
            r12.setVisibility(r6)
        L_0x0239:
            r1 = 2131431388(0x7f0b0fdc, float:1.8484504E38)
            android.view.View r1 = r4.findViewById(r1)
            if (r1 == 0) goto L_0x011f
            r4.removeView(r1)
            goto L_0x011f
        L_0x0247:
            r4 = 2131888981(0x7f120b55, float:1.9412613E38)
            java.lang.Object[] r3 = new java.lang.Object[r8]
            boolean r1 = android.text.TextUtils.isEmpty(r13)
            if (r1 == 0) goto L_0x0253
            r13 = r7
        L_0x0253:
            r3[r9] = r13
            boolean r1 = android.text.TextUtils.isEmpty(r11)
            if (r1 == 0) goto L_0x025c
            r11 = r7
        L_0x025c:
            r3[r10] = r11
            goto L_0x0040
        L_0x0260:
            boolean r1 = r0.A0K
            if (r1 == 0) goto L_0x02cd
            java.util.List r1 = r0.A0I
            java.util.Iterator r6 = r1.iterator()
            r14 = 0
            r3 = 0
        L_0x026c:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x02cd
            java.lang.Object r8 = r6.next()
            com.whatsapp.biz.BusinessProfileFieldView r8 = (com.whatsapp.biz.BusinessProfileFieldView) r8
            int r4 = r3 + 1
            java.util.List r2 = r5.A0U
            int r1 = r2.size()
            if (r3 >= r1) goto L_0x02cb
            java.lang.String r3 = X.C36401kF.A0s(r2, r3)
        L_0x0286:
            boolean r1 = A03(r3)
            if (r1 == 0) goto L_0x02c9
            com.whatsapp.InfoCard r2 = r0.A05
            if (r2 == 0) goto L_0x02c9
            r1 = 0
            r8.setText(r1, r1)
            r8.setSubText(r1)
            r1 = 2131232082(0x7f080552, float:1.8080263E38)
            r8.setIcon((int) r1)
            r2.setVisibility(r14)
            r1 = 0
            r8.setText(r3, r1)
            X.1Dv r7 = r0.A03
            X.2XH r11 = r0.A0F
            X.9jr r9 = r0.A0A
            X.141 r2 = r0.A0E
            if (r2 == 0) goto L_0x02b2
            com.whatsapp.jid.UserJid r1 = X.C36351kA.A0l(r2)
        L_0x02b2:
            java.lang.String r13 = X.AnonymousClass143.A03(r1)
            boolean r15 = r2.A0C()
            X.9uI r10 = r0.A0B
            java.lang.Integer r12 = r0.A0H
            boolean r2 = r0.A01
            boolean r1 = r0.A00
            r17 = r1
            r16 = r2
            A01(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
        L_0x02c9:
            r3 = r4
            goto L_0x026c
        L_0x02cb:
            r3 = 0
            goto L_0x0286
        L_0x02cd:
            java.lang.String r2 = r5.A0H
            com.whatsapp.biz.BusinessProfileFieldView r9 = r0.A08
            r1 = 0
            r9.setText(r2, r1)
            X.1Dv r8 = r0.A03
            X.2XH r7 = r0.A0F
            X.9jr r6 = r0.A0A
            X.141 r2 = r0.A0E
            if (r2 == 0) goto L_0x02e3
            com.whatsapp.jid.UserJid r1 = X.C36351kA.A0l(r2)
        L_0x02e3:
            java.lang.String r14 = X.AnonymousClass143.A03(r1)
            boolean r16 = r2.A0C()
            X.9uI r4 = r0.A0B
            java.lang.Integer r1 = r0.A0H
            r26 = r1
            boolean r3 = r0.A01
            boolean r2 = r0.A00
            r15 = 1
            r10 = r6
            r11 = r4
            r12 = r7
            r13 = r26
            r17 = r3
            r18 = r2
            A01(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            com.whatsapp.biz.BusinessHoursView r12 = r0.A06
            X.3XK r11 = r5.A03
            com.whatsapp.jid.UserJid r1 = r5.A08
            java.lang.String r23 = r1.getRawString()
            boolean r1 = r0.A01
            r24 = r1
            boolean r1 = r0.A00
            r25 = r1
            r14 = 8
            if (r11 != 0) goto L_0x033e
            r12.setVisibility(r14)
        L_0x031b:
            X.9ta r3 = r5.A05
            r2 = 1
            if (r3 == 0) goto L_0x0328
            X.6bZ r1 = r3.A00
            if (r1 != 0) goto L_0x033c
            X.6bZ r1 = r3.A01
            if (r1 != 0) goto L_0x033c
        L_0x0328:
            r1 = 0
        L_0x0329:
            r0.A01 = r1
            X.3XP r1 = r5.A04
            if (r1 == 0) goto L_0x033a
            java.lang.String r1 = r1.A00
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x033a
        L_0x0337:
            r0.A00 = r2
            return
        L_0x033a:
            r2 = 0
            goto L_0x0337
        L_0x033c:
            r1 = 1
            goto L_0x0329
        L_0x033e:
            r1 = 2131428337(0x7f0b03f1, float:1.8478316E38)
            android.view.View r22 = X.C012005e.A02(r12, r1)
            X.0ts r13 = r12.A04
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            r1 = 7
            int r3 = r2.get(r1)
            int[] r21 = X.C56112vl.A00
            r2 = 7
            r10 = 0
        L_0x0354:
            r1 = r21[r10]
            if (r1 == r3) goto L_0x035d
            int r10 = r10 + 1
            if (r10 < r2) goto L_0x0354
            r10 = 6
        L_0x035d:
            r1 = 0
            X.AnonymousClass00C.A0D(r13, r1)
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>(r2)
            java.util.List r1 = r11.A02
            java.util.Iterator r4 = r1.iterator()
        L_0x036c:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0399
            java.lang.Object r3 = r4.next()
            X.3XO r3 = (X.AnonymousClass3XO) r3
            if (r3 == 0) goto L_0x036c
            int r1 = r3.A00
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            boolean r1 = r9.containsKey(r2)
            if (r1 != 0) goto L_0x038d
            java.util.ArrayList r1 = X.AnonymousClass001.A0I()
            r9.put(r2, r1)
        L_0x038d:
            java.lang.Object r1 = r9.get(r2)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x036c
            r1.add(r3)
            goto L_0x036c
        L_0x0399:
            java.util.ArrayList r8 = X.AnonymousClass001.A0I()
            r7 = 7
            r20 = 7
            int r7 = r7 + r10
        L_0x03a1:
            if (r10 >= r7) goto L_0x046e
            int r1 = r10 % r20
            r2 = r21[r1]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.Object r3 = r9.get(r1)
            java.util.List r3 = (java.util.List) r3
            java.lang.String r19 = X.C20040wv.A02(r13, r2)
            X.AnonymousClass00C.A08(r19)
            if (r3 != 0) goto L_0x03cc
            r1 = 2131887239(0x7f120487, float:1.940908E38)
            java.lang.String r2 = r13.A0B(r1)
            X.AnonymousClass00C.A0B(r2)
        L_0x03c4:
            r1 = r19
            X.C36361kB.A1O(r1, r2, r8)
            int r10 = r10 + 1
            goto L_0x03a1
        L_0x03cc:
            int r1 = r3.size()
            if (r1 <= r15) goto L_0x03dd
            X.4NU r4 = X.AnonymousClass4NU.A00
            r2 = 0
            X.4YZ r1 = new X.4YZ
            r1.<init>(r4, r2)
            X.AnonymousClass03X.A08(r3, r1)
        L_0x03dd:
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()
            java.util.Iterator r18 = r3.iterator()
        L_0x03e5:
            boolean r1 = r18.hasNext()
            if (r1 == 0) goto L_0x0466
            java.lang.Object r2 = r18.next()
            X.3XO r2 = (X.AnonymousClass3XO) r2
            if (r2 == 0) goto L_0x03e5
            int r3 = r2.A01
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            if (r1 == 0) goto L_0x03e5
            if (r3 != r15) goto L_0x0410
            r1 = 2131887241(0x7f120489, float:1.9409084E38)
            java.util.Locale r2 = X.C36401kF.A0x(r13)
            java.lang.String r1 = r13.A0B(r1)
            java.lang.String r2 = X.C26621Kw.A06(r2, r1)
        L_0x040c:
            X.AnonymousClass00C.A08(r2)
            goto L_0x03c4
        L_0x0410:
            r1 = 2
            if (r3 != r1) goto L_0x041b
            r1 = 2131887240(0x7f120488, float:1.9409081E38)
            java.lang.String r2 = r13.A0B(r1)
            goto L_0x040c
        L_0x041b:
            if (r3 != 0) goto L_0x03e5
            java.lang.Integer r1 = r2.A03
            int r3 = X.C36411kG.A06(r1)
            java.lang.Integer r1 = r2.A02
            int r17 = X.C36411kG.A06(r1)
            java.util.Locale r16 = X.C36401kF.A0x(r13)
            X.AnonymousClass00C.A08(r16)
            java.util.Calendar r4 = java.util.Calendar.getInstance(r16)
            int r1 = r3 / 60
            r2 = 11
            r4.set(r2, r1)
            int r3 = r3 % 60
            r1 = 12
            r4.set(r1, r3)
            r3 = 13
            r1 = 0
            r4.set(r3, r1)
            java.util.Calendar r3 = java.util.Calendar.getInstance(r16)
            int r1 = r17 / 60
            r3.set(r2, r1)
            int r2 = r17 % 60
            r1 = 12
            r3.set(r1, r2)
            r2 = 13
            r1 = 0
            r3.set(r2, r1)
            java.lang.String r1 = X.AnonymousClass3UM.A04(r13, r4, r3)
            r6.add(r1)
            goto L_0x03e5
        L_0x0466:
            java.lang.String r1 = "\n"
            java.lang.String r2 = X.C36381kD.A0x(r1, r6)
            goto L_0x03c4
        L_0x046e:
            int r1 = r8.size()
            if (r1 == 0) goto L_0x031b
            r1 = r22
            r1.setVisibility(r14)
            android.content.res.Resources r3 = X.C36341k9.A0F(r12)
            r1 = 2131166807(0x7f070657, float:1.794787E38)
            r2 = 2131166807(0x7f070657, float:1.794787E38)
            int r4 = r3.getDimensionPixelSize(r1)
            int r3 = r12.getPaddingTop()
            android.content.res.Resources r1 = X.C36341k9.A0F(r12)
            int r2 = r1.getDimensionPixelSize(r2)
            int r1 = r12.getPaddingBottom()
            r12.setPadding(r4, r3, r2, r1)
            com.whatsapp.biz.BusinessHoursContentView r3 = r12.A01
            X.0wo r1 = r12.A03
            long r1 = X.C19970wo.A00(r1)
            r3.setupWithOpenNow(r8, r1, r11)
            X.3YV r1 = new X.3YV
            r20 = r1
            r21 = r12
            r22 = r26
            r20.<init>(r21, r22, r23, r24, r25)
            r12.setOnClickListener(r1)
            com.whatsapp.biz.BusinessHoursContentView r2 = r12.A01
            boolean r1 = r12.A06
            r2.setFullView(r1)
            android.widget.ImageView r4 = r12.A00
            android.content.Context r3 = r12.getContext()
            boolean r2 = r12.A06
            r1 = 2131232170(0x7f0805aa, float:1.8080442E38)
            if (r2 == 0) goto L_0x04ca
            r1 = 2131232172(0x7f0805ac, float:1.8080446E38)
        L_0x04ca:
            X.C36391kE.A18(r3, r4, r1)
            r1 = 0
            r12.setVisibility(r1)
            goto L_0x031b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3TW.A04(X.9uZ):void");
    }

    public AnonymousClass3TW(View view, C24801Dv r5, C225314u r6, C19730wQ r7, AnonymousClass1KL r8, C201549jr r9, C206949uI r10, AnonymousClass171 r11, C18820ts r12, AnonymousClass141 r13, AnonymousClass2XH r14, AnonymousClass1QW r15, Integer num, boolean z, boolean z2) {
        ArrayList A0I2 = AnonymousClass001.A0I();
        this.A0J = A0I2;
        ArrayList A0I3 = AnonymousClass001.A0I();
        this.A0I = A0I3;
        this.A0L = r7;
        this.A03 = r5;
        this.A0F = r14;
        this.A0C = r11;
        this.A0D = r12;
        this.A09 = r8;
        this.A0G = r15;
        this.A0A = r9;
        this.A02 = view;
        this.A0B = r10;
        this.A0H = num;
        this.A07 = (BusinessProfileFieldView) view.findViewById(R.id.business_location);
        this.A08 = (BusinessProfileFieldView) view.findViewById(R.id.business_email);
        A0I2.add(view.findViewById(R.id.business_link));
        A0I2.add(view.findViewById(R.id.business_link_2));
        InfoCard infoCard = null;
        boolean z3 = z;
        if (z) {
            A0I3.add(view.findViewById(R.id.brand_link));
            A0I3.add(view.findViewById(R.id.brand_link_2));
            infoCard = (InfoCard) view.findViewById(R.id.brand_link_card);
        }
        this.A05 = infoCard;
        this.A06 = (BusinessHoursView) view.findViewById(R.id.business_hours);
        this.A04 = r6;
        this.A0E = r13;
        this.A0K = z3;
        this.A01 = z2;
    }

    public static boolean A03(String str) {
        Uri parse = Uri.parse(C53312r7.A00(str));
        if (parse.getHost().equalsIgnoreCase("www.instagram.com") || parse.getHost().equalsIgnoreCase("instagram.com") || parse.getHost().equalsIgnoreCase("instagr.am") || parse.getHost().equalsIgnoreCase("www.instagr.am")) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r15v3, types: [X.3Yg] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.C24801Dv r15, com.whatsapp.biz.BusinessProfileFieldView r16, X.C201549jr r17, X.C206949uI r18, X.AnonymousClass2XH r19, java.lang.Integer r20, java.lang.String r21, int r22, boolean r23, boolean r24, boolean r25) {
        /*
            r6 = r16
            com.whatsapp.biz.catalog.view.EllipsizedTextEmojiLabel r0 = r6.A01
            if (r0 == 0) goto L_0x004d
            android.content.Context r3 = r6.getContext()
            android.content.Context r2 = r6.getContext()
            r1 = 2130968827(0x7f0400fb, float:1.7546319E38)
            r0 = 2131099951(0x7f06012f, float:1.781227E38)
            int r1 = X.C36351kA.A02(r2, r3, r1, r0)
            com.whatsapp.biz.catalog.view.EllipsizedTextEmojiLabel r0 = r6.A01
            r0.setTextColor(r1)
            r5 = r15
            r7 = r17
            r8 = r18
            r9 = r20
            r10 = r21
            r2 = r22
            r14 = r23
            r12 = r24
            r13 = r25
            if (r22 == 0) goto L_0x0070
            r1 = 1
            com.whatsapp.biz.catalog.view.EllipsizedTextEmojiLabel r0 = r6.A01
            if (r2 == r1) goto L_0x004e
            java.lang.String r22 = X.C36371kC.A0u(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r22)
            if (r0 != 0) goto L_0x004d
            X.3Yg r15 = new X.3Yg
            r23 = r12
            r24 = r13
            r25 = r14
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
        L_0x004a:
            r6.setOnClickListener(r15)
        L_0x004d:
            return
        L_0x004e:
            java.lang.String r2 = X.C36371kC.A0u(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x004d
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "mailto:"
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r2, r1)
            android.net.Uri r4 = android.net.Uri.parse(r0)
            X.3Yf r15 = new X.3Yf
            r3 = r15
            r11 = r12
            r12 = r13
            r13 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x004a
        L_0x0070:
            com.whatsapp.biz.catalog.view.EllipsizedTextEmojiLabel r0 = r6.A01
            java.lang.String r1 = X.C36371kC.A0u(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x004d
            java.lang.String r4 = X.C53312r7.A00(r1)
            com.whatsapp.biz.catalog.view.EllipsizedTextEmojiLabel r0 = r6.A01
            java.lang.String r0 = X.C36371kC.A0u(r0)
            if (r0 == 0) goto L_0x011c
            com.whatsapp.biz.catalog.view.EllipsizedTextEmojiLabel r1 = r6.A01
            if (r1 == 0) goto L_0x011c
            com.whatsapp.biz.catalog.view.EllipsizedTextEmojiLabel r0 = r6.A00
            if (r0 == 0) goto L_0x011c
            java.lang.String r0 = X.C36371kC.A0u(r1)
            boolean r0 = A03(r0)
            boolean r1 = X.AnonymousClass000.A1P(r0)
            com.whatsapp.biz.catalog.view.EllipsizedTextEmojiLabel r0 = r6.A01
            java.lang.String r0 = X.C36371kC.A0u(r0)
            java.lang.String r0 = X.C53312r7.A00(r0)
            android.net.Uri r2 = android.net.Uri.parse(r0)
            if (r1 == 0) goto L_0x011c
            if (r2 == 0) goto L_0x011c
            java.util.List r0 = r2.getPathSegments()
            int r0 = r0.size()
            if (r0 == 0) goto L_0x011c
            r0 = 2131232079(0x7f08054f, float:1.8080257E38)
            r6.setIcon((int) r0)
            r0 = 2131887235(0x7f120483, float:1.9409071E38)
            java.lang.String r1 = X.C36381kD.A0t(r6, r0)
            r0 = 0
            r6.setText(r1, r0)
            java.util.List r0 = r2.getPathSegments()
            java.lang.Object r0 = X.C36391kE.A0t(r0)
            java.lang.String r0 = (java.lang.String) r0
            r6.setSubText(r0)
            android.content.Context r3 = r6.getContext()
            android.content.Context r2 = r6.getContext()
            r1 = 2130968765(0x7f0400bd, float:1.7546193E38)
            r0 = 2131099875(0x7f0600e3, float:1.7812116E38)
            int r2 = X.C36351kA.A02(r2, r3, r1, r0)
            android.content.Context r1 = r6.getContext()
            r0 = 2131101127(0x7f0605c7, float:1.7814655E38)
            int r1 = X.AnonymousClass00F.A00(r1, r0)
            com.whatsapp.biz.catalog.view.EllipsizedTextEmojiLabel r0 = r6.A01
            r0.setTextColor(r2)
            com.whatsapp.biz.catalog.view.EllipsizedTextEmojiLabel r0 = r6.A00
            r0.setTextColor(r1)
            r11 = 1
        L_0x00fe:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "https://l.wl.co/l?u="
            r1.append(r0)
            java.lang.String r0 = android.net.Uri.encode(r4)
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            android.net.Uri r4 = android.net.Uri.parse(r0)
            X.3Yi r3 = new X.3Yi
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r6.setOnClickListener(r3)
            return
        L_0x011c:
            r11 = 0
            goto L_0x00fe
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3TW.A01(X.1Dv, com.whatsapp.biz.BusinessProfileFieldView, X.9jr, X.9uI, X.2XH, java.lang.Integer, java.lang.String, int, boolean, boolean, boolean):void");
    }
}
