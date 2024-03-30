package X;

import android.content.Intent;
import android.text.Editable;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.contact.picker.ContactPickerFragment;
import java.util.Map;

/* renamed from: X.2iG  reason: invalid class name and case insensitive filesystem */
public class C48912iG extends C33541fX {
    public Object A00;
    public final int A01;

    public C48912iG(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnClickListener(new C48912iG(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02fc, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x02fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x041d, code lost:
        if ((r8 instanceof com.whatsapp.community.LinkExistingGroups) != false) goto L_0x041f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x042e, code lost:
        r2[0] = java.lang.Integer.valueOf(r0);
        r7.A0E(r6.A0L(r2, r5, r3), 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x043c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x082a, code lost:
        r3.startActivity(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x082d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x0861, code lost:
        r1.putExtra("vcard_message", r3);
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        r2.Boy(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x08b5, code lost:
        r0 = r4.getContext();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x08fa, code lost:
        r0.startActivity(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x08fd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:469:0x0a24, code lost:
        X.C53742ro.A00(r1, r2, r3, r4, r5, 12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:0x0a29, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:505:0x0ac3, code lost:
        r2 = X.AnonymousClass001.A07();
        r2.putInt("dialogAction", r0.ordinal());
        r2.putParcelable("parentGroupJid", r3.A00);
        r3.A01.A0C(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:506:0x0adc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:556:0x0c70, code lost:
        r3.create().show();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:557:0x0c77, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:613:0x0e2b, code lost:
        r5.A0V.A01(r2.getContext(), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:614:0x0e34, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:638:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0422  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0441  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(android.view.View r19) {
        /*
            r18 = this;
            r4 = r18
            int r0 = r4.A01
            r2 = r19
            switch(r0) {
                case 0: goto L_0x0b01;
                case 1: goto L_0x0009;
                case 2: goto L_0x0009;
                case 3: goto L_0x0b01;
                case 4: goto L_0x0009;
                case 5: goto L_0x0800;
                case 6: goto L_0x07b6;
                case 7: goto L_0x0ae2;
                case 8: goto L_0x0aaf;
                case 9: goto L_0x0a95;
                case 10: goto L_0x0a73;
                case 11: goto L_0x0a67;
                case 12: goto L_0x0a47;
                case 13: goto L_0x0a2a;
                case 14: goto L_0x0a15;
                case 15: goto L_0x0e15;
                case 16: goto L_0x0779;
                case 17: goto L_0x0a03;
                case 18: goto L_0x06f4;
                case 19: goto L_0x03e1;
                case 20: goto L_0x0999;
                case 21: goto L_0x09f2;
                case 22: goto L_0x001c;
                case 23: goto L_0x0999;
                case 24: goto L_0x09b8;
                case 25: goto L_0x03c2;
                case 26: goto L_0x09a1;
                case 27: goto L_0x0999;
                case 28: goto L_0x098b;
                case 29: goto L_0x0c0e;
                case 30: goto L_0x0924;
                case 31: goto L_0x0910;
                case 32: goto L_0x08fe;
                case 33: goto L_0x08e2;
                case 34: goto L_0x0293;
                case 35: goto L_0x08da;
                case 36: goto L_0x08d2;
                case 37: goto L_0x025e;
                case 38: goto L_0x08ca;
                case 39: goto L_0x024e;
                case 40: goto L_0x0222;
                case 41: goto L_0x0875;
                case 42: goto L_0x01c5;
                case 43: goto L_0x0193;
                case 44: goto L_0x00e5;
                case 45: goto L_0x00ac;
                case 46: goto L_0x004d;
                case 47: goto L_0x0846;
                case 48: goto L_0x082e;
                case 49: goto L_0x0036;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r4.A00
            com.whatsapp.community.JoinGroupBottomSheetFragment r0 = (com.whatsapp.community.JoinGroupBottomSheetFragment) r0
            X.1ue r3 = r0.A0N
            X.0wU r2 = r3.A0f
            r0 = 12
            X.3wS r1 = new X.3wS
            r1.<init>((java.lang.Object) r3, (int) r0)
        L_0x0018:
            r2.Boy(r1)
        L_0x001b:
            return
        L_0x001c:
            java.lang.Object r5 = r4.A00
            com.whatsapp.contact.picker.PhoneContactsSelector r5 = (com.whatsapp.contact.picker.PhoneContactsSelector) r5
            java.util.List r12 = r5.A0i
            int r1 = r12.size()
            r0 = 1
            if (r1 >= r0) goto L_0x09c7
            X.17Y r7 = r5.A05
            X.0ts r6 = r5.A0Q
            r5 = 2131755213(0x7f1000cd, float:1.9141299E38)
            r3 = 1
            java.lang.Object[] r2 = new java.lang.Object[r0]
            goto L_0x042e
        L_0x0036:
            java.lang.Object r3 = r4.A00
            X.2I9 r3 = (X.AnonymousClass2I9) r3
            X.1fX r0 = r3.A09
            r0.A02(r2)
            X.3Pr r1 = r3.A0C
            if (r1 == 0) goto L_0x001b
            X.3T1 r0 = r3.A0K
            X.2bU r0 = (X.AnonymousClass2bU) r0
            X.3Qa r0 = r0.A1J
            r1.A02(r0)
            return
        L_0x004d:
            java.lang.Object r4 = r4.A00
            r3 = r4
            X.8Yz r3 = (X.C174928Yz) r3
            android.content.Context r1 = r3.getContext()
            java.lang.Class<X.155> r0 = X.AnonymousClass155.class
            android.app.Activity r6 = X.C18860tw.A01(r1, r0)
            X.155 r6 = (X.AnonymousClass155) r6
            java.util.ArrayList r2 = r3.A0a
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x001b
            r1 = 0
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto L_0x001b
            if (r6 == 0) goto L_0x001b
            java.lang.Object r9 = r2.get(r1)
            com.whatsapp.jid.UserJid r9 = (com.whatsapp.jid.UserJid) r9
            X.16D r0 = r3.A0l
            X.141 r2 = r0.A0D(r9)
            X.11F r1 = r2.A0H
            boolean r0 = r1 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x0088
            X.2IR r4 = (X.AnonymousClass2IR) r4
            X.0wQ r0 = r4.A0T
            r0.A0M(r1)
        L_0x0088:
            boolean r0 = r2.A0C()
            if (r0 != 0) goto L_0x0b0e
            X.2kK r1 = r3.A09
            if (r1 == 0) goto L_0x0099
            r0 = 1
            r1.A0D(r0)
            r0 = 0
            r3.A09 = r0
        L_0x0099:
            X.0wQ r5 = r3.A0T
            X.0xY r8 = r3.A08
            X.1Kc r7 = r3.A03
            X.2kK r4 = new X.2kK
            r4.<init>(r5, r6, r7, r8, r9)
            r3.A09 = r4
            X.0wU r0 = r3.A21
            X.C36391kE.A1Q(r4, r0)
            return
        L_0x00ac:
            java.lang.Object r4 = r4.A00
            X.8Yz r4 = (X.C174928Yz) r4
            android.content.Context r1 = r4.getContext()
            java.lang.Class<X.155> r0 = X.AnonymousClass155.class
            android.app.Activity r3 = X.C18860tw.A01(r1, r0)
            java.util.ArrayList r2 = r4.A0a
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x001b
            r1 = 0
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto L_0x001b
            if (r3 == 0) goto L_0x001b
            java.lang.Object r1 = r2.get(r1)
            X.11F r1 = (X.AnonymousClass11F) r1
            X.16D r0 = r4.A0l
            X.141 r2 = r0.A0D(r1)
            X.190 r1 = X.C36441kJ.A0j()
            java.lang.Integer r0 = X.C36361kB.A0i()
            android.content.Intent r2 = r1.A1X(r3, r2, r0)
            goto L_0x082a
        L_0x00e5:
            java.lang.Object r2 = r4.A00
            X.8Yz r2 = (X.C174928Yz) r2
            int r1 = r2.A00
            r8 = 0
            r0 = 1
            if (r1 != r0) goto L_0x0116
            java.util.ArrayList r0 = r2.A0a
            java.util.Iterator r1 = r0.iterator()
        L_0x00f5:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x001b
            com.whatsapp.jid.UserJid r6 = X.C36441kJ.A0o(r1)
            if (r6 == 0) goto L_0x00f5
            X.3QX r4 = r2.A06
            android.content.Context r5 = r2.getContext()
            X.3Sx r0 = r2.A0K
            if (r0 == 0) goto L_0x0114
            X.3F9 r0 = r0.A0A
            java.lang.String r7 = r0.A08
        L_0x010f:
            r9 = r8
            r4.A01(r5, r6, r7, r8, r9)
            return
        L_0x0114:
            r7 = r8
            goto L_0x010f
        L_0x0116:
            if (r1 != 0) goto L_0x0137
            boolean r0 = r2.A0L
            if (r0 == 0) goto L_0x0137
            X.13w r0 = r2.A0D
            if (r0 == 0) goto L_0x0137
            X.3QX r5 = r2.A06
            android.content.Context r6 = r2.getContext()
            X.13w r7 = r2.A0D
            X.3Sx r0 = r2.A0K
            if (r0 == 0) goto L_0x0130
            X.3F9 r0 = r0.A0A
            java.lang.String r8 = r0.A08
        L_0x0130:
            java.lang.String r9 = r2.A0J
            r10 = 0
            r5.A01(r6, r7, r8, r9, r10)
            return
        L_0x0137:
            X.3T1 r0 = r2.getFMessage()
            X.C66013Ui.A0F(r0)
            android.content.Context r1 = r2.getContext()
            java.lang.Class<X.01L> r0 = X.AnonymousClass01L.class
            android.app.Activity r5 = X.C18860tw.A01(r1, r0)
            X.01I r5 = (X.AnonymousClass01I) r5
            X.3Sx r0 = r2.A0K
            if (r0 == 0) goto L_0x001b
            if (r5 == 0) goto L_0x001b
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()
            r1 = 0
        L_0x0159:
            X.3Sx r0 = r2.A0K
            java.util.List r0 = r0.A06
            int r0 = r0.size()
            if (r1 >= r0) goto L_0x0b1e
            java.util.ArrayList r0 = r2.A0a
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L_0x018c
            X.3Sx r0 = r2.A0K
            java.util.List r0 = r0.A06
            java.lang.Object r0 = r0.get(r1)
            X.39e r0 = (X.C607439e) r0
            java.lang.String r0 = r0.A02
            r7.add(r0)
            X.3Sx r0 = r2.A0K
            java.util.List r0 = r0.A06
            java.lang.Object r0 = r0.get(r1)
            X.39e r0 = (X.C607439e) r0
            java.lang.String r0 = r0.A03
            r6.add(r0)
        L_0x0189:
            int r1 = r1 + 1
            goto L_0x0159
        L_0x018c:
            r7.add(r8)
            r6.add(r8)
            goto L_0x0189
        L_0x0193:
            java.lang.Object r7 = r4.A00
            X.8Yz r7 = (X.C174928Yz) r7
            X.3Sx r0 = r7.A0K
            boolean r0 = X.C174928Yz.A0E(r7, r0)
            if (r0 == 0) goto L_0x001b
            X.3Sx r0 = r7.A0K
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            java.util.List r0 = r0.A03
            if (r0 == 0) goto L_0x0b4e
            java.util.Iterator r5 = r0.iterator()
        L_0x01ad:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0b4e
            java.lang.Object r2 = r5.next()
            X.3A9 r2 = (X.AnonymousClass3A9) r2
            java.lang.Class r1 = r2.A01
            java.lang.Class<android.provider.ContactsContract$CommonDataKinds$Email> r0 = android.provider.ContactsContract.CommonDataKinds.Email.class
            if (r1 != r0) goto L_0x01ad
            java.lang.String r0 = r2.A02
            r3.add(r0)
            goto L_0x01ad
        L_0x01c5:
            java.lang.Object r4 = r4.A00
            X.8Yz r4 = (X.C174928Yz) r4
            X.3Sx r0 = r4.A0K
            r2 = 0
            if (r0 != 0) goto L_0x01dc
            java.lang.String r0 = "conversationrowcontact/addcontactonclicklistener/contact is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.17Y r1 = r4.A0R
            r0 = 2131889316(0x7f120ca4, float:1.9413292E38)
            r1.A06(r0, r2)
            return
        L_0x01dc:
            r3 = 0
            byte[] r1 = r0.A0B
            if (r1 == 0) goto L_0x01e8
            int r0 = r1.length
            if (r0 <= 0) goto L_0x01e8
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeByteArray(r1, r2, r0)
        L_0x01e8:
            boolean r0 = r4.A0L
            if (r0 == 0) goto L_0x020e
            X.16D r1 = r4.A0l
            X.13w r0 = r4.A0D
            X.141 r3 = r1.A08(r0)
            if (r3 == 0) goto L_0x001b
            android.content.Context r1 = r4.getContext()
            java.lang.Class<X.01L> r0 = X.AnonymousClass01L.class
            android.app.Activity r0 = X.C24801Dv.A01(r1, r0)
            X.01I r0 = (X.AnonymousClass01I) r0
            X.1eE r2 = r4.A0E
            X.01z r1 = r0.getSupportFragmentManager()
            X.11F r0 = r3.A0H
            r2.A06(r1, r3, r0)
            return
        L_0x020e:
            android.app.Activity r2 = X.C36361kB.A05(r4)
            X.14u r2 = (X.C225314u) r2
            X.3Sx r1 = r4.A0K
            if (r1 == 0) goto L_0x001b
            boolean r0 = r2 instanceof X.C87704Pv
            if (r0 == 0) goto L_0x001b
            X.4Pv r2 = (X.C87704Pv) r2
            r2.Btg(r3, r1)
            return
        L_0x0222:
            java.lang.Object r2 = r4.A00
            X.2IS r2 = (X.AnonymousClass2IS) r2
            X.4Uw r1 = r2.A0c
            if (r1 == 0) goto L_0x001b
            java.lang.Class<X.4Q4> r0 = X.AnonymousClass4Q4.class
            java.lang.Object r1 = r1.BAB(r0)
            X.4Q4 r1 = (X.AnonymousClass4Q4) r1
            if (r1 == 0) goto L_0x001b
            X.3T1 r3 = r2.getFMessage()
            X.8Zy r2 = X.C175178Zy.A00
            X.3T4 r1 = (X.AnonymousClass3T4) r1
            int r0 = r1.A01
            int r0 = 2 - r0
            if (r0 == 0) goto L_0x0c7a
            java.lang.Object r1 = r1.A00
            X.14u r1 = (X.C225314u) r1
            com.whatsapp.conversation.conversationrow.messagerating.MessageRatingFragment r0 = com.whatsapp.conversation.conversationrow.messagerating.MessageRatingFragment.A03(r2, r3)
            r1.Btm(r0)
            return
        L_0x024e:
            java.lang.Object r0 = r4.A00
            X.2IS r0 = (X.AnonymousClass2IS) r0
            X.4Uw r1 = r0.A0c
            if (r1 == 0) goto L_0x001b
            X.3T1 r0 = r0.getFMessage()
            r1.B1j(r0)
            return
        L_0x025e:
            java.lang.Object r3 = r4.A00
            X.2IR r3 = (X.AnonymousClass2IR) r3
            X.3T1 r2 = r3.getFMessage()
            android.app.Activity r1 = X.C36361kB.A05(r3)
            X.01I r1 = (X.AnonymousClass01I) r1
            if (r1 == 0) goto L_0x001b
            X.005 r0 = r3.A29
            java.lang.Object r4 = r0.get()
            X.1NU r4 = (X.AnonymousClass1NU) r4
            android.content.Context r5 = r3.getContext()
            X.01z r6 = r1.getSupportFragmentManager()
            com.whatsapp.jid.UserJid r7 = r2.A0L()
            java.lang.String r8 = "quick_action"
            X.C36321k7.A0w(r5, r6)
            if (r7 == 0) goto L_0x001b
            X.1NP r0 = r4.A01
            boolean r9 = r0.A03(r7)
            r4.A00(r5, r6, r7, r8, r9)
            return
        L_0x0293:
            java.lang.Object r3 = r4.A00
            X.2IR r3 = (X.AnonymousClass2IR) r3
            X.3T1 r10 = r3.getFMessage()
            X.1TF r0 = r3.A1g
            boolean r0 = r0.A06(r10)
            if (r0 == 0) goto L_0x02bf
            X.1J1 r9 = r3.A1f
            r0 = 0
            X.AnonymousClass00C.A0D(r10, r0)
            X.0yC r1 = r9.A02
            r0 = 3127(0xc37, float:4.382E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x02bf
            r11 = 0
            r17 = 5
            r13 = r11
            r14 = r11
            r15 = r11
            r16 = 0
            r12 = r11
            X.AnonymousClass1J1.A02(r9, r10, r11, r12, r13, r14, r15, r16, r17)
        L_0x02bf:
            android.app.Activity r5 = X.C36361kB.A05(r3)
            X.14u r5 = (X.C225314u) r5
            if (r5 == 0) goto L_0x001b
            X.184 r0 = r3.A1N
            int r9 = r0.A01(r10)
            X.005 r1 = r3.A25
            X.1OF r0 = r3.A0j
            boolean r0 = X.C66013Ui.A0X(r0, r10, r1)
            if (r0 == 0) goto L_0x02dc
            if (r9 == 0) goto L_0x02e8
            X.AnonymousClass2IR.A0a(r5, r3)
        L_0x02dc:
            boolean r0 = r3.A1E()
            if (r0 == 0) goto L_0x001b
            if (r9 == 0) goto L_0x03a7
            X.AnonymousClass2IR.A0a(r5, r3)
            return
        L_0x02e8:
            r1 = 4096(0x1000, float:5.74E-42)
            int r0 = r10.A0A
            r0 = r0 & r1
            boolean r0 = X.AnonymousClass000.A1S(r0, r1)
            r7 = 0
            if (r0 == 0) goto L_0x0302
            java.lang.String r1 = r3.getMoreInfoString()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x02dc
        L_0x02fe:
            r5.BO7(r7, r1)
            goto L_0x02dc
        L_0x0302:
            r1 = 512(0x200, float:7.175E-43)
            int r0 = r10.A0A
            r0 = r0 & r1
            boolean r0 = X.AnonymousClass000.A1S(r0, r1)
            if (r0 == 0) goto L_0x034e
            int r6 = r10.A05
            if (r6 > 0) goto L_0x0319
            r0 = 2131891668(0x7f1215d4, float:1.9418063E38)
            java.lang.String r1 = r5.getString(r0)
            goto L_0x02fe
        L_0x0319:
            r0 = 86400(0x15180, float:1.21072E-40)
            r2 = 0
            if (r6 <= r0) goto L_0x032c
            int r6 = r6 / r0
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131755100(0x7f10005c, float:1.914107E38)
        L_0x0327:
            java.lang.String r1 = X.C36321k7.A0B(r1, r6, r2, r0)
            goto L_0x02fe
        L_0x032c:
            r0 = 3600(0xe10, float:5.045E-42)
            if (r6 < r0) goto L_0x0339
            int r6 = r6 / r0
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131755101(0x7f10005d, float:1.9141072E38)
            goto L_0x0327
        L_0x0339:
            r0 = 60
            if (r6 < r0) goto L_0x0346
            int r6 = r6 / r0
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131755102(0x7f10005e, float:1.9141074E38)
            goto L_0x0327
        L_0x0346:
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131755103(0x7f10005f, float:1.9141076E38)
            goto L_0x0327
        L_0x034e:
            X.1OF r0 = r3.A0j
            X.0yC r1 = r0.A00
            r0 = 6939(0x1b1b, float:9.724E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x02dc
            r1 = 33554432(0x2000000, float:9.403955E-38)
            int r0 = r10.A0A
            r0 = r0 & r1
            boolean r0 = X.AnonymousClass000.A1S(r0, r1)
            if (r0 == 0) goto L_0x02dc
            X.3Qa r0 = r10.A1J
            X.11F r1 = r0.A00
            boolean r0 = X.AnonymousClass143.A0G(r1)
            if (r0 != 0) goto L_0x02dc
            com.whatsapp.jid.UserJid r8 = X.C36401kF.A0b(r1)
            X.0yC r6 = r3.A0G
            X.185 r2 = r3.A0m
            X.18y r0 = r3.A0o
            X.3U1 r1 = new X.3U1
            r1.<init>((X.AnonymousClass185) r2, (X.C235618y) r0, (com.whatsapp.jid.UserJid) r8)
            r0 = 5968(0x1750, float:8.363E-42)
            boolean r0 = r6.A0E(r0)
            if (r0 == 0) goto L_0x03a5
            boolean r0 = r1.A05()
            if (r0 != 0) goto L_0x0392
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x03a5
        L_0x0392:
            r2 = 1
        L_0x0393:
            android.content.Context r1 = r3.getContext()
            r0 = 2131896659(0x7f122953, float:1.9428185E38)
            if (r2 == 0) goto L_0x039f
            r0 = 2131896660(0x7f122954, float:1.9428188E38)
        L_0x039f:
            java.lang.String r1 = r1.getString(r0)
            goto L_0x02fe
        L_0x03a5:
            r2 = 0
            goto L_0x0393
        L_0x03a7:
            X.3EA r0 = r3.A1e
            java.lang.Integer r0 = r0.A00(r10)
            if (r0 == 0) goto L_0x001b
            int r3 = r0.intValue()
            r2 = 2131891806(0x7f12165e, float:1.9418342E38)
            r1 = 2131890687(0x7f1211ff, float:1.9416073E38)
            X.3cG r0 = new X.3cG
            r0.<init>(r5, r10, r4)
            r5.A36(r0, r3, r2, r1)
            return
        L_0x03c2:
            java.lang.Object r2 = r4.A00
            com.whatsapp.contact.picker.SharedTextPreviewDialogFragment r2 = (com.whatsapp.contact.picker.SharedTextPreviewDialogFragment) r2
            X.6tS r0 = r2.A03
            if (r0 == 0) goto L_0x001b
            X.36r r0 = r0.A05
            if (r0 == 0) goto L_0x001b
            java.lang.String r1 = r0.A01
            java.lang.String r0 = "video/mp4"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0c88
            java.lang.String r0 = "image/gif"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0c88
            return
        L_0x03e1:
            java.lang.Object r8 = r4.A00
            X.27v r8 = (X.AnonymousClass27v) r8
            java.util.List r0 = r8.A0c
            int r2 = r0.size()
            boolean r1 = r8 instanceof com.whatsapp.xfamily.groups.ui.LinkExistingGroupActivity
            if (r1 != 0) goto L_0x043f
            boolean r0 = r8 instanceof com.whatsapp.xfamily.groups.ui.GroupMembersSelectorActivity
            if (r0 != 0) goto L_0x043f
            boolean r0 = r8 instanceof com.whatsapp.registration.NotifyContactsSelector
            if (r0 != 0) goto L_0x041f
            boolean r0 = r8 instanceof com.whatsapp.payments.ui.PaymentInvitePickerActivity
            if (r0 != 0) goto L_0x043f
            boolean r0 = r8 instanceof com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminSelector
            if (r0 != 0) goto L_0x043f
            boolean r0 = r8 instanceof com.whatsapp.group.GroupMembersSelector
            if (r0 != 0) goto L_0x043f
            boolean r0 = r8 instanceof com.whatsapp.group.EditGroupAdminsSelector
            if (r0 != 0) goto L_0x041f
            boolean r0 = r8 instanceof com.whatsapp.conversation.EditBroadcastRecipientsSelector
            if (r0 != 0) goto L_0x043d
            boolean r0 = r8 instanceof com.whatsapp.contact.picker.nativecontacts.NativeContactsMultipleContactPicker
            if (r0 != 0) goto L_0x041f
            boolean r0 = r8 instanceof com.whatsapp.contact.picker.ListMembersSelector
            if (r0 != 0) goto L_0x043d
            boolean r0 = r8 instanceof com.whatsapp.contact.picker.ContactsAttachmentSelector
            if (r0 != 0) goto L_0x043f
            boolean r0 = r8 instanceof com.whatsapp.contact.picker.AddGroupParticipantsSelector
            if (r0 != 0) goto L_0x043f
            boolean r0 = r8 instanceof com.whatsapp.community.LinkExistingGroups
            if (r0 == 0) goto L_0x043f
        L_0x041f:
            r0 = 0
        L_0x0420:
            if (r2 >= r0) goto L_0x0441
            X.17Y r7 = r8.A05
            X.0ts r6 = r8.A0I
            r5 = 2131755213(0x7f1000cd, float:1.9141299E38)
            long r3 = (long) r0
            java.lang.Object[] r2 = X.AnonymousClass001.A0L()
        L_0x042e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 0
            r2[r1] = r0
            java.lang.String r0 = r6.A0L(r2, r5, r3)
            r7.A0E(r0, r1)
            return
        L_0x043d:
            r0 = 2
            goto L_0x0420
        L_0x043f:
            r0 = 1
            goto L_0x0420
        L_0x0441:
            if (r1 == 0) goto L_0x04bf
            com.whatsapp.xfamily.groups.ui.LinkExistingGroupActivity r8 = (com.whatsapp.xfamily.groups.ui.LinkExistingGroupActivity) r8
            X.1UN r1 = r8.A02
            if (r1 != 0) goto L_0x0450
            java.lang.String r0 = "xFamilyUserFlowLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0450:
            java.lang.String r0 = "TAP_GROUP_CONFIRM_NEXT"
            r1.A04(r0)
            java.util.List r0 = r8.A0c
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x045f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x001b
            X.141 r1 = X.C36391kE.A0f(r3)
            X.11F r0 = r1.A0H
            if (r0 == 0) goto L_0x045f
            java.lang.String r0 = r1.A0J()
            if (r0 != 0) goto L_0x0475
            java.lang.String r0 = ""
        L_0x0475:
            r8.A0C = r0
            X.11F r1 = r1.A0H
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.PermanentGroupJid"
            X.AnonymousClass00C.A0E(r1, r0)
            X.147 r1 = (X.AnonymousClass147) r1
            r8.A00 = r1
            if (r1 == 0) goto L_0x0496
            X.005 r0 = r8.A04
            if (r0 == 0) goto L_0x0cae
            java.lang.Object r0 = r0.get()
            X.0xQ r0 = (X.C20350xQ) r0
            java.util.Map r0 = r0.A14
            java.lang.String r0 = X.C36431kI.A1A(r1, r0)
            r8.A0A = r0
        L_0x0496:
            java.lang.String r2 = r8.A0A
            if (r2 == 0) goto L_0x04bd
            int r0 = r2.length()
            if (r0 == 0) goto L_0x04bd
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "https://chat.whatsapp.com/"
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r2, r1)
        L_0x04aa:
            r8.A0B = r0
            r1 = 0
            if (r2 == 0) goto L_0x04b9
            int r0 = r2.length()
            if (r0 == 0) goto L_0x04b9
            com.whatsapp.xfamily.groups.ui.LinkExistingGroupActivity.A0x(r8)
            goto L_0x045f
        L_0x04b9:
            com.whatsapp.xfamily.groups.ui.LinkExistingGroupActivity.A0z(r8, r1)
            goto L_0x045f
        L_0x04bd:
            r0 = 0
            goto L_0x04aa
        L_0x04bf:
            boolean r0 = r8 instanceof com.whatsapp.xfamily.groups.ui.GroupMembersSelectorActivity
            if (r0 == 0) goto L_0x04dc
            com.whatsapp.xfamily.groups.ui.GroupMembersSelectorActivity r8 = (com.whatsapp.xfamily.groups.ui.GroupMembersSelectorActivity) r8
            java.util.ArrayList r0 = r8.A3o()
            r8.A04 = r0
            r6 = 1
            r2 = 0
            boolean r0 = r0.isEmpty()
            if (r0 != r6) goto L_0x0cb5
            X.17Y r1 = r8.A05
            r0 = 2131891630(0x7f1215ae, float:1.9417985E38)
            r1.A06(r0, r2)
            return
        L_0x04dc:
            boolean r0 = r8 instanceof com.whatsapp.registration.NotifyContactsSelector
            if (r0 == 0) goto L_0x04f5
            android.content.Intent r2 = X.C36431kI.A0D()
            java.util.ArrayList r0 = r8.A3o()
            java.util.ArrayList r1 = X.AnonymousClass143.A07(r0)
            java.lang.String r0 = "jids"
            r2.putStringArrayListExtra(r0, r1)
            X.C36331k8.A0o(r8, r2)
            return
        L_0x04f5:
            boolean r0 = r8 instanceof com.whatsapp.payments.ui.PaymentInvitePickerActivity
            if (r0 == 0) goto L_0x053c
            com.whatsapp.payments.ui.PaymentInvitePickerActivity r8 = (com.whatsapp.payments.ui.PaymentInvitePickerActivity) r8
            java.util.ArrayList r0 = r8.A3o()
            java.util.ArrayList r2 = X.C36441kJ.A15(r0)
            android.content.Intent r1 = r8.getIntent()
            if (r1 == 0) goto L_0x053a
            java.lang.String r0 = "referral_screen"
            java.lang.String r1 = r1.getStringExtra(r0)
        L_0x050f:
            X.17Y r10 = r8.A05
            X.1EU r11 = r8.A00
            X.7yC r12 = r8.A01
            r13 = 0
            r0 = 4
            X.72v r14 = new X.72v
            r14.<init>(r8, r2, r0)
            r15 = 0
            X.9fV r7 = new X.9fV
            r9 = r8
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            boolean r0 = r7.A02()
            X.C18740tg.A0B(r0)
            X.1EU r0 = r7.A00
            X.B66 r0 = r0.A05()
            X.9Md r0 = r0.BFa()
            if (r0 == 0) goto L_0x001b
            X.C199549fV.A00(r7, r1, r2, r15)
            return
        L_0x053a:
            r1 = 0
            goto L_0x050f
        L_0x053c:
            boolean r0 = r8 instanceof com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminSelector
            if (r0 == 0) goto L_0x055b
            com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminSelector r8 = (com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminSelector) r8
            X.00T r0 = r8.A09
            X.1Uw r3 = X.C36431kI.A0i(r0)
            if (r3 == 0) goto L_0x001b
            X.01z r2 = r8.getSupportFragmentManager()
            java.util.ArrayList r1 = r8.A3o()
            r0 = 1
            com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminMessageFragment r0 = X.C54822tc.A00(r3, r1, r0)
            X.C65443Sb.A02(r0, r2)
            return
        L_0x055b:
            boolean r0 = r8 instanceof com.whatsapp.group.GroupMembersSelector
            if (r0 == 0) goto L_0x05b0
            com.whatsapp.group.GroupMembersSelector r8 = (com.whatsapp.group.GroupMembersSelector) r8
            java.util.ArrayList r0 = r8.A3o()
            r8.A0B = r0
            boolean r0 = r0.isEmpty()
            r3 = 0
            if (r0 == 0) goto L_0x0577
            X.17Y r1 = r8.A05
            r0 = 2131891648(0x7f1215c0, float:1.9418022E38)
            r1.A06(r0, r3)
            return
        L_0x0577:
            X.147 r2 = r8.A07
            r4 = 1
            if (r2 != 0) goto L_0x0cfe
            boolean r1 = r8.A0C
            X.2iT r0 = r8.A06
            if (r1 == 0) goto L_0x0598
            if (r0 == 0) goto L_0x0587
            r0.A0D(r4)
        L_0x0587:
            X.2iT r2 = new X.2iT
            r2.<init>(r8)
            r8.A06 = r2
            X.0wU r1 = r8.A04
            java.lang.Void[] r0 = new java.lang.Void[r3]
            r1.Bp0(r2, r0)
            r8.A0C = r3
            return
        L_0x0598:
            if (r0 == 0) goto L_0x05a1
            int r1 = r0.A06()
            r0 = 2
            if (r1 != r0) goto L_0x001b
        L_0x05a1:
            X.2iT r2 = new X.2iT
            r2.<init>(r8)
            r8.A06 = r2
            X.0wU r1 = r8.A04
            java.lang.Void[] r0 = new java.lang.Void[r3]
            r1.Bp0(r2, r0)
            return
        L_0x05b0:
            boolean r0 = r8 instanceof com.whatsapp.group.EditGroupAdminsSelector
            if (r0 == 0) goto L_0x05c9
            android.content.Intent r2 = X.C36431kI.A0D()
            java.util.ArrayList r0 = r8.A3o()
            java.util.ArrayList r1 = X.AnonymousClass143.A07(r0)
            java.lang.String r0 = "jids"
            r2.putExtra(r0, r1)
            X.C36331k8.A0o(r8, r2)
            return
        L_0x05c9:
            boolean r0 = r8 instanceof com.whatsapp.conversation.EditBroadcastRecipientsSelector
            if (r0 == 0) goto L_0x05e2
            android.content.Intent r2 = X.C36431kI.A0D()
            java.util.ArrayList r0 = r8.A3o()
            java.util.ArrayList r1 = X.AnonymousClass143.A07(r0)
            java.lang.String r0 = "contacts"
            r2.putExtra(r0, r1)
            X.C36331k8.A0o(r8, r2)
            return
        L_0x05e2:
            boolean r0 = r8 instanceof com.whatsapp.contact.picker.nativecontacts.NativeContactsMultipleContactPicker
            if (r0 == 0) goto L_0x05f7
            X.0wU r2 = r8.A04
            r0 = 8
            X.3v3 r1 = X.C80223v3.A00(r8, r0)
            java.lang.String r0 = "addOSAddressBookContacts"
            r2.Boz(r1, r0)
            r8.finish()
            return
        L_0x05f7:
            boolean r0 = r8 instanceof com.whatsapp.contact.picker.ListMembersSelector
            if (r0 == 0) goto L_0x0611
            com.whatsapp.contact.picker.ListMembersSelector r8 = (com.whatsapp.contact.picker.ListMembersSelector) r8
            X.1A6 r4 = r8.A04
            X.12q r0 = r4.A02
            X.C220412q.A00(r0)
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = X.C36391kE.A0B(r0)
            X.1A7 r4 = r4.A01
            monitor-enter(r4)
            goto L_0x0d40
        L_0x0611:
            boolean r0 = r8 instanceof com.whatsapp.contact.picker.ContactsAttachmentSelector
            if (r0 == 0) goto L_0x0642
            com.whatsapp.contact.picker.ContactsAttachmentSelector r8 = (com.whatsapp.contact.picker.ContactsAttachmentSelector) r8
            X.1sL r5 = r8.A01
            java.util.ArrayList r0 = r8.A3o()
            X.00s r4 = r5.A02
            r4.A0D(r0)
            X.00s r1 = r5.A03
            r0 = 1
            X.C36341k9.A18(r1, r0)
            X.1Rz r2 = r5.A09
            X.08S r3 = r5.A01
            r1 = 0
            X.4ZI r0 = new X.4ZI
            r0.<init>(r5, r1)
            r2.A00(r0, r4, r3)
            X.08S r2 = r5.A00
            r1 = 8
            X.4Td r0 = new X.4Td
            r0.<init>(r5, r1)
            r2.A0F(r3, r0)
            return
        L_0x0642:
            boolean r0 = r8 instanceof com.whatsapp.contact.picker.AddGroupParticipantsSelector
            if (r0 == 0) goto L_0x0691
            com.whatsapp.contact.picker.AddGroupParticipantsSelector r8 = (com.whatsapp.contact.picker.AddGroupParticipantsSelector) r8
            X.00T r0 = r8.A0W
            java.lang.Object r6 = r0.getValue()
            X.1tC r6 = (X.C39661tC) r6
            java.util.ArrayList r5 = r8.A3o()
            X.0yC r1 = r8.A0D
            r0 = 7608(0x1db8, float:1.0661E-41)
            boolean r0 = r1.A0E(r0)
            r4 = 0
            if (r0 == 0) goto L_0x0681
            X.3I5 r0 = r8.A04
            if (r0 == 0) goto L_0x0681
            java.lang.String r1 = "com.whatsapp.community.DirectoryContactsLoader"
            java.util.Map r0 = r0.A00
            java.lang.Object r0 = r0.get(r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            if (r0 != 0) goto L_0x0671
            X.02c r0 = X.C004702c.A00
        L_0x0671:
            java.util.List r1 = X.C007103b.A0Y(r0)
            java.util.List r0 = r8.A0c
            X.AnonymousClass00C.A07(r0)
            boolean r0 = r1.containsAll(r0)
            if (r0 == 0) goto L_0x0681
            r4 = 1
        L_0x0681:
            X.040 r3 = X.C109325Xd.A00(r6)
            X.02l r2 = r6.A06
            r1 = 0
            com.whatsapp.contact.picker.viewmodels.AddGroupParticipantsSelectorViewModel$onSubmitRequested$1 r0 = new com.whatsapp.contact.picker.viewmodels.AddGroupParticipantsSelectorViewModel$onSubmitRequested$1
            r0.<init>(r6, r5, r1, r4)
            X.C36381kD.A1R(r2, r0, r3)
            return
        L_0x0691:
            boolean r0 = r8 instanceof com.whatsapp.community.LinkExistingGroups
            if (r0 == 0) goto L_0x06c8
            com.whatsapp.community.LinkExistingGroups r8 = (com.whatsapp.community.LinkExistingGroups) r8
            java.util.List r0 = r8.A0c
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            X.AnonymousClass00C.A08(r0)
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0d82
            boolean r0 = r8.A0E
            if (r0 == 0) goto L_0x0d82
            X.1qm r3 = X.AnonymousClass3LW.A00(r8)
            r0 = 2131891641(0x7f1215b9, float:1.9418008E38)
            X.C39001qm.A02(r8, r3, r0)
            r2 = 2131896389(0x7f122845, float:1.9427638E38)
            r1 = 22
            X.2rw r0 = new X.2rw
            r0.<init>(r8, r1)
            r3.A0l(r8, r0, r2)
            X.C39001qm.A04(r8, r3)
            r3.A0b()
            return
        L_0x06c8:
            boolean r0 = r8 instanceof com.whatsapp.calling.favorite.FavoritePicker
            if (r0 == 0) goto L_0x001b
            com.whatsapp.calling.favorite.FavoritePicker r8 = (com.whatsapp.calling.favorite.FavoritePicker) r8
            X.00T r0 = r8.A04
            java.lang.Object r6 = r0.getValue()
            com.whatsapp.calling.favorite.FavoritePickerViewModel r6 = (com.whatsapp.calling.favorite.FavoritePickerViewModel) r6
            java.util.List r0 = r8.A0c
            java.util.List r5 = java.util.Collections.unmodifiableList(r0)
            X.AnonymousClass00C.A08(r5)
            X.48q r4 = new X.48q
            r4.<init>(r8)
            X.040 r3 = X.C109325Xd.A00(r6)
            X.02l r2 = r6.A0B
            r1 = 0
            com.whatsapp.calling.favorite.FavoritePickerViewModel$addFavorites$1 r0 = new com.whatsapp.calling.favorite.FavoritePickerViewModel$addFavorites$1
            r0.<init>(r6, r5, r1, r4)
            X.C36381kD.A1R(r2, r0, r3)
            return
        L_0x06f4:
            java.lang.Object r7 = r4.A00
            com.whatsapp.contact.picker.ContactPickerFragment r7 = (com.whatsapp.contact.picker.ContactPickerFragment) r7
            boolean r0 = com.whatsapp.contact.picker.ContactPickerFragment.A0L(r7)
            if (r0 == 0) goto L_0x0727
            X.1Xc r0 = r7.A25
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0727
            boolean r0 = r7.A34
            if (r0 != 0) goto L_0x070e
            boolean r0 = r7.A38
            if (r0 == 0) goto L_0x0727
        L_0x070e:
            boolean r1 = r7.A38
            r0 = 3
            if (r1 == 0) goto L_0x0715
            r0 = 10
        L_0x0715:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            X.1Xt r2 = r7.A26
            r1 = 0
            int r0 = r3.intValue()
            java.lang.Integer r0 = X.C29731Xt.A01(r0)
            r2.A0A(r1, r3, r0)
        L_0x0727:
            boolean r6 = com.whatsapp.contact.picker.ContactPickerFragment.A0L(r7)
            X.11F r0 = r7.A1o
            boolean r0 = r0 instanceof X.C28981Uw
            if (r0 != 0) goto L_0x076e
            android.content.Context r5 = r7.A0a()
            X.0v0 r3 = r7.A1C
            X.3FP r0 = r7.A0y
            boolean r2 = X.C36371kC.A1V(r3)
            if (r0 == 0) goto L_0x076e
            X.1hi r0 = r0.A0E
            boolean r0 = X.C36351kA.A1W(r0)
            if (r0 == 0) goto L_0x076e
            android.content.SharedPreferences r1 = X.C36341k9.A0E(r3)
            java.lang.String r0 = "forward_with_captions_nux_shown"
            boolean r0 = r1.getBoolean(r0, r2)
            if (r0 != 0) goto L_0x076e
            X.1qm r2 = X.AnonymousClass3LW.A00(r5)
            r0 = 2131889708(0x7f120e2c, float:1.9414087E38)
            r2.A0c(r0)
            r1 = 2131891806(0x7f12165e, float:1.9418342E38)
            r0 = 25
            X.C39001qm.A0H(r2, r3, r0, r1)
            r2.A0b()
            java.lang.String r0 = "contactpicker/forward with captions nux shown"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x076e:
            X.0wU r2 = r7.A2L
            r0 = 24
            X.75B r1 = new X.75B
            r1.<init>((int) r0, (java.lang.Object) r4, (boolean) r6)
            goto L_0x0018
        L_0x0779:
            java.lang.Object r5 = r4.A00
            com.whatsapp.contact.picker.ContactPickerFragment r5 = (com.whatsapp.contact.picker.ContactPickerFragment) r5
            X.01I r4 = r5.A0h()
            if (r4 == 0) goto L_0x001b
            boolean r1 = r5.A31
            r0 = 2
            if (r1 == 0) goto L_0x0789
            r0 = 5
        L_0x0789:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            X.1du r0 = r5.A11
            r0.A00(r3)
            boolean r0 = r5.A32
            if (r0 == 0) goto L_0x079c
            X.3Pt r1 = r5.A23
            r0 = 6
            r1.A03(r0)
        L_0x079c:
            X.0wQ r0 = r5.A0R
            boolean r0 = X.C36441kJ.A1J(r0)
            if (r0 == 0) goto L_0x0e2b
            X.1Dv r2 = r5.A0K
            android.content.Context r1 = r5.A0a()
            int r0 = r3.intValue()
            android.content.Intent r0 = X.C36421kH.A08(r1, r0)
            r2.A07(r4, r0)
            return
        L_0x07b6:
            java.lang.Object r5 = r4.A00
            com.whatsapp.community.ManageGroupsInCommunityActivity r5 = (com.whatsapp.community.ManageGroupsInCommunityActivity) r5
            boolean r0 = com.whatsapp.community.ManageGroupsInCommunityActivity.A07(r5)
            if (r0 != 0) goto L_0x001b
            r6 = 0
            X.1LV r0 = r5.A09
            X.0yC r1 = r0.A06
            r0 = 1238(0x4d6, float:1.735E-42)
            int r0 = r1.A07(r0)
            int r4 = r0 + 1
            X.1uf r0 = r5.A0B
            X.1hi r0 = r0.A0o
            int r0 = X.C36341k9.A07(r0)
            int r4 = r4 - r0
            X.147 r3 = r5.A0M
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r0 = "com.whatsapp.community.LinkExistingGroups"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "max_groups_allowed_to_link"
            r2.putExtra(r0, r4)
            if (r3 == 0) goto L_0x07f5
            java.lang.String r1 = r3.getRawString()
            java.lang.String r0 = "parent_group_jid"
            r2.putExtra(r0, r1)
        L_0x07f5:
            java.lang.String r0 = "community_name"
            r2.putExtra(r0, r6)
            r0 = 10
            r5.BuO(r2, r0)
            return
        L_0x0800:
            java.lang.Object r3 = r4.A00
            com.whatsapp.community.ManageGroupsInCommunityActivity r3 = (com.whatsapp.community.ManageGroupsInCommunityActivity) r3
            boolean r0 = com.whatsapp.community.ManageGroupsInCommunityActivity.A07(r3)
            if (r0 != 0) goto L_0x001b
            X.0yC r1 = r3.A0D
            r0 = 3966(0xf7e, float:5.558E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 != 0) goto L_0x0e35
            boolean r0 = r3.A0R
            if (r0 == 0) goto L_0x0e35
            int r2 = r3.A00
            X.147 r1 = r3.A0M
            r0 = 0
            android.content.Intent r2 = X.AnonymousClass190.A1O(r3, r0, r2)
            java.lang.String r1 = r1.getRawString()
            java.lang.String r0 = "parent_group_jid_to_link"
            r2.putExtra(r0, r1)
        L_0x082a:
            r3.startActivity(r2)
            return
        L_0x082e:
            java.lang.Object r4 = r4.A00
            X.2IS r4 = (X.AnonymousClass2IS) r4
            android.content.Context r1 = r4.getContext()
            X.3T1 r0 = r4.getFMessage()
            X.3Qa r0 = r0.A1J
            android.os.Bundle r3 = X.C66013Ui.A03(r0)
            r0 = 0
            android.content.Intent r1 = X.C36421kH.A09(r1, r0)
            goto L_0x0861
        L_0x0846:
            java.lang.Object r4 = r4.A00
            X.8Yz r4 = (X.C174928Yz) r4
            X.3Sx r0 = r4.A0K
            r2 = 0
            if (r0 == 0) goto L_0x0867
            android.content.Context r1 = r4.getContext()
            X.3T1 r0 = r4.getFMessage()
            X.3Qa r0 = r0.A1J
            android.os.Bundle r3 = X.C66013Ui.A03(r0)
            android.content.Intent r1 = X.C36421kH.A09(r1, r2)
        L_0x0861:
            java.lang.String r0 = "vcard_message"
            r1.putExtra(r0, r3)
            goto L_0x08b5
        L_0x0867:
            java.lang.String r0 = "conversationrowcontact/onclicklistener/vcard is empty"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.17Y r1 = r4.A0R
            r0 = 2131889316(0x7f120ca4, float:1.9413292E38)
            r1.A06(r0, r2)
            return
        L_0x0875:
            java.lang.Object r4 = r4.A00
            X.2IR r4 = (X.AnonymousClass2IR) r4
            X.1BF r0 = r4.A1l
            boolean r0 = r0.A01()
            r1 = 7
            if (r0 == 0) goto L_0x088f
            X.1Ae r0 = r4.A1n
            r0.A01(r1)
            X.1YD r2 = r4.A1s
            r1 = 0
            r0 = 3
            r2.A02(r1, r0)
            return
        L_0x088f:
            android.app.Activity r3 = X.C36361kB.A05(r4)
            if (r3 == 0) goto L_0x08c4
            X.1Ae r0 = r4.A1n
            r0.A01(r1)
            X.1Ae r2 = r4.A1n
            r1 = 2
            r0 = 0
            r2.A03(r0, r1)
            X.0yC r1 = r4.A0G
            r0 = 7755(0x1e4b, float:1.0867E-41)
            boolean r0 = r1.A0E(r0)
            java.lang.String r2 = "conversation_quick_action_button"
            if (r0 == 0) goto L_0x08ba
            android.content.Context r0 = r4.getContext()
            android.content.Intent r1 = X.AnonymousClass190.A11(r0, r2)
        L_0x08b5:
            android.content.Context r0 = r4.getContext()
            goto L_0x08fa
        L_0x08ba:
            X.6WF r1 = r4.A1m
            java.lang.ref.WeakReference r0 = X.AnonymousClass001.A0F(r3)
            r1.A04(r2, r0)
            return
        L_0x08c4:
            java.lang.String r0 = "Unable to find host Activity"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x08ca:
            java.lang.Object r0 = r4.A00
            X.2IR r0 = (X.AnonymousClass2IR) r0
            X.AnonymousClass2IR.A0c(r0)
            return
        L_0x08d2:
            java.lang.Object r0 = r4.A00
            X.2IS r0 = (X.AnonymousClass2IS) r0
            r0.A1B()
            return
        L_0x08da:
            java.lang.Object r0 = r4.A00
            X.2IR r0 = (X.AnonymousClass2IR) r0
            X.AnonymousClass2IR.A0X(r2, r0)
            return
        L_0x08e2:
            java.lang.Object r0 = r4.A00
            X.2HG r0 = (X.AnonymousClass2HG) r0
            X.4V7 r4 = r0.A01
            X.155 r3 = r4.BoP()
            X.141 r0 = r0.A00
            X.11F r2 = r0.A0H
            r1 = 0
            r0 = 1
            android.content.Intent r1 = X.AnonymousClass190.A0q(r3, r2, r1, r0, r0)
            X.155 r0 = r4.BoP()
        L_0x08fa:
            r0.startActivity(r1)
            return
        L_0x08fe:
            java.lang.Object r2 = r4.A00
            X.2HG r2 = (X.AnonymousClass2HG) r2
            X.12t r1 = r2.A03
            X.141 r0 = r2.A00
            X.11F r0 = r0.A0H
            r1.A06(r0)
            r0 = 1
            r2.A0A(r0)
            return
        L_0x0910:
            java.lang.Object r3 = r4.A00
            X.2HE r3 = (X.AnonymousClass2HE) r3
            X.0v0 r0 = r3.A02
            r2 = 1
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r0)
            java.lang.String r0 = "cag_replies_promotion_banner_closed"
            X.C36331k8.A0w(r1, r0, r2)
            r3.A0A(r2)
            return
        L_0x0924:
            java.lang.Object r0 = r4.A00
            com.whatsapp.conversation.EditMessageActivity r0 = (com.whatsapp.conversation.EditMessageActivity) r0
            X.1tF r3 = r0.A09
            if (r3 != 0) goto L_0x0933
            java.lang.String r0 = "editMessageViewModel"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0933:
            java.lang.String r9 = r3.A00
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x0986
            X.3T1 r8 = r3.A0B
            if (r8 == 0) goto L_0x0986
            if (r9 == 0) goto L_0x0986
            int r0 = r9.length()
            if (r0 == 0) goto L_0x0986
            X.0wo r0 = r3.A09
            X.0yC r1 = r3.A0A
            long r4 = X.AnonymousClass3T1.A05(r0, r8)
            r0 = 2983(0xba7, float:4.18E-42)
            int r0 = r1.A07(r0)
            long r1 = X.C36371kC.A07(r0)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x096f
            boolean r0 = X.C64933Qa.A04(r8)
            if (r0 != 0) goto L_0x096f
            boolean r0 = r8 instanceof X.AnonymousClass2bT
            if (r0 != 0) goto L_0x096f
            X.00s r1 = r3.A03
            X.2p7 r0 = X.C52242p7.ExitEditExpired
        L_0x0969:
            java.lang.String r0 = r0.value
            r1.A0C(r0)
            return
        L_0x096f:
            X.1X4 r5 = r3.A06
            X.1sS r7 = r3.A08
            X.6tS r6 = r7.A01
            java.util.List r10 = r3.A01
            X.0wU r0 = r5.A1J
            X.1it r4 = new X.1it
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.Boy(r4)
            X.00s r1 = r3.A03
            X.2p7 r0 = X.C52242p7.ExitWithChanges
            goto L_0x0969
        L_0x0986:
            X.00s r1 = r3.A03
            X.2p7 r0 = X.C52242p7.ExitNoChanges
            goto L_0x0969
        L_0x098b:
            java.lang.Object r0 = r4.A00
            com.whatsapp.conversation.ConversationAttachmentContentView r0 = (com.whatsapp.conversation.ConversationAttachmentContentView) r0
            X.28e r2 = r0.A0D
            int r1 = r0.A04
            java.lang.String r0 = "chat"
            r2.A0D(r1, r0)
            return
        L_0x0999:
            java.lang.Object r0 = r4.A00
            android.app.Activity r0 = (android.app.Activity) r0
            X.AnonymousClass3UJ.A06(r0)
            return
        L_0x09a1:
            java.lang.Object r2 = r4.A00
            com.whatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity r2 = (com.whatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity) r2
            X.1dt r1 = r2.A06
            if (r1 == 0) goto L_0x09b1
            java.lang.Integer r0 = com.whatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity.A07(r2)
            r1.A01(r2, r0)
            return
        L_0x09b1:
            java.lang.String r0 = "tellAFriend"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x09b8:
            java.lang.Object r1 = r4.A00
            com.whatsapp.contact.picker.SharedTextPreviewDialogFragment r1 = (com.whatsapp.contact.picker.SharedTextPreviewDialogFragment) r1
            java.lang.String r0 = r1.A0P
            r1.A0O = r0
            r0 = 0
            r1.A03 = r0
            com.whatsapp.contact.picker.SharedTextPreviewDialogFragment.A08(r1)
            return
        L_0x09c7:
            X.16m r0 = r5.A09
            boolean r0 = r0.A00()
            if (r0 != 0) goto L_0x09d5
            java.lang.String r0 = "conversation/actresult/read_contacts permission denied"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x09d5:
            X.0wU r0 = r5.A04
            X.0wG r7 = r5.A0O
            X.16D r4 = r5.A0B
            X.0yb r6 = r5.A08
            X.0ts r8 = r5.A0Q
            X.1N4 r2 = r5.A05
            X.1KK r3 = r5.A08
            X.16v r11 = r5.A0T
            X.11F r10 = r5.A0S
            X.16y r9 = r5.A0R
            X.2k5 r1 = new X.2k5
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            X.C36331k8.A1F(r1, r0)
            return
        L_0x09f2:
            java.lang.Object r1 = r4.A00
            X.27v r1 = (X.AnonymousClass27v) r1
            X.0yC r3 = r1.A0D
            X.17Y r2 = r1.A05
            X.1dz r4 = r1.A0K
            X.190 r0 = new X.190
            r0.<init>()
            r5 = 2
            goto L_0x0a24
        L_0x0a03:
            java.lang.Object r2 = r4.A00
            com.whatsapp.contact.picker.ContactPickerFragment r2 = (com.whatsapp.contact.picker.ContactPickerFragment) r2
            boolean r0 = r2.A32
            if (r0 == 0) goto L_0x0a11
            X.3Pt r1 = r2.A23
            r0 = 7
            r1.A03(r0)
        L_0x0a11:
            com.whatsapp.contact.picker.ContactPickerFragment.A0H(r2)
            return
        L_0x0a15:
            java.lang.Object r0 = r4.A00
            com.whatsapp.contact.picker.ContactPickerFragment r0 = (com.whatsapp.contact.picker.ContactPickerFragment) r0
            X.0yC r3 = r0.A1g
            X.17Y r2 = r0.A0Q
            X.01I r1 = r0.A0i()
            X.1dz r4 = r0.A2B
            r5 = 3
        L_0x0a24:
            r6 = 12
            X.C53742ro.A00(r1, r2, r3, r4, r5, r6)
            return
        L_0x0a2a:
            java.lang.Object r2 = r4.A00
            com.whatsapp.companionmode.registration.RegisterAsCompanionEnterNumberActivity r2 = (com.whatsapp.companionmode.registration.RegisterAsCompanionEnterNumberActivity) r2
            X.0xT r1 = r2.A04
            if (r1 == 0) goto L_0x0a40
            java.lang.String r0 = "1460738748095414"
            android.net.Uri r0 = r1.A02(r0)
            android.content.Intent r0 = X.C36391kE.A0G(r0)
            r2.startActivity(r0)
            return
        L_0x0a40:
            java.lang.String r0 = "faqLinkFactory"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0a47:
            java.lang.Object r3 = r4.A00
            com.whatsapp.companionmode.registration.RegisterAsCompanionEnterNumberActivity r3 = (com.whatsapp.companionmode.registration.RegisterAsCompanionEnterNumberActivity) r3
            X.3AK r0 = r3.A03
            if (r0 != 0) goto L_0x0a56
            java.lang.String r0 = "phoneNumberEntryViewHolder"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0a56:
            android.widget.TextView r0 = r0.A04
            java.lang.String r2 = X.C36431kI.A18(r0)
            X.04e r1 = r3.A07
            r0 = 0
            android.content.Intent r0 = X.AnonymousClass190.A1C(r3, r0, r2)
            r1.A02(r0)
            return
        L_0x0a67:
            java.lang.Object r0 = r4.A00
            X.3Ja r0 = (X.C63173Ja) r0
            X.02t r1 = r0.A03
            X.147 r0 = r0.A00
            r1.invoke(r0)
            return
        L_0x0a73:
            java.lang.Object r2 = r4.A00
            X.1oC r2 = (X.C38301oC) r2
            X.2Sc r1 = r2.A02
            if (r1 != 0) goto L_0x0a82
            java.lang.String r0 = "wamGroupInfo"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0a82:
            java.lang.Boolean r0 = X.C36371kC.A0m()
            r1.A0C = r0
            X.19g r0 = r2.getCompanionDeviceManager$app_product_community_community_non_modified()
            X.3ty r1 = r0.A07()
            r0 = 4
            X.C79593ty.A00(r1, r2, r0)
            return
        L_0x0a95:
            java.lang.Object r0 = r4.A00
            com.whatsapp.community.NewCommunityAdminBottomSheetFragment r0 = (com.whatsapp.community.NewCommunityAdminBottomSheetFragment) r0
            X.1tw r3 = r0.A01
            if (r3 == 0) goto L_0x0aaa
            X.147 r2 = r3.A00
            if (r2 == 0) goto L_0x0aa7
            X.1LV r1 = r3.A02
            r0 = 1
            r1.A0E(r2, r0)
        L_0x0aa7:
            X.2np r0 = X.C51442np.SELF_DEMOTE
            goto L_0x0ac3
        L_0x0aaa:
            java.lang.RuntimeException r0 = X.C36331k8.A0a()
            throw r0
        L_0x0aaf:
            java.lang.Object r0 = r4.A00
            com.whatsapp.community.NewCommunityAdminBottomSheetFragment r0 = (com.whatsapp.community.NewCommunityAdminBottomSheetFragment) r0
            X.1tw r3 = r0.A01
            if (r3 == 0) goto L_0x0add
            X.147 r2 = r3.A00
            if (r2 == 0) goto L_0x0ac1
            X.1LV r1 = r3.A02
            r0 = 1
            r1.A0E(r2, r0)
        L_0x0ac1:
            X.2np r0 = X.C51442np.CONTINUE
        L_0x0ac3:
            android.os.Bundle r2 = X.AnonymousClass001.A07()
            int r1 = r0.ordinal()
            java.lang.String r0 = "dialogAction"
            r2.putInt(r0, r1)
            X.147 r1 = r3.A00
            java.lang.String r0 = "parentGroupJid"
            r2.putParcelable(r0, r1)
            X.00s r0 = r3.A01
            r0.A0C(r2)
            return
        L_0x0add:
            java.lang.RuntimeException r0 = X.C36331k8.A0a()
            throw r0
        L_0x0ae2:
            java.lang.Object r1 = r4.A00
            com.whatsapp.community.NewCommunityActivity r1 = (com.whatsapp.community.NewCommunityActivity) r1
            com.whatsapp.WaEditText r0 = r1.A08
            android.text.Editable r0 = r0.getText()
            boolean r0 = X.AnonymousClass14B.A0F(r0)
            if (r0 == 0) goto L_0x0afd
            r0 = 2131891284(0x7f121454, float:1.9417284E38)
            java.lang.String r0 = r1.getString(r0)
            r1.A3i(r0)
            return
        L_0x0afd:
            com.whatsapp.community.NewCommunityActivity.A07(r1)
            return
        L_0x0b01:
            java.lang.Object r0 = r4.A00
            com.whatsapp.community.JoinGroupBottomSheetFragment r0 = (com.whatsapp.community.JoinGroupBottomSheetFragment) r0
            X.1ue r0 = r0.A0N
            X.1hi r1 = r0.A0e
            r0 = 1
            X.C36341k9.A16(r1, r0)
            return
        L_0x0b0e:
            X.190 r1 = X.C36441kJ.A0j()
            java.lang.Integer r0 = X.C36361kB.A0i()
            android.content.Intent r0 = r1.A1X(r6, r2, r0)
            r6.startActivity(r0)
            return
        L_0x0b1e:
            java.util.ArrayList r1 = r2.A0a
            X.3Sx r0 = r2.A0K
            X.3F9 r0 = r0.A0A
            java.lang.String r4 = r0.A08
            com.whatsapp.conversation.conversationrow.ConversationRowContact$MessageSharedContactDialogFragment r3 = new com.whatsapp.conversation.conversationrow.ConversationRowContact$MessageSharedContactDialogFragment
            r3.<init>()
            android.os.Bundle r2 = X.AnonymousClass001.A07()
            java.util.ArrayList r1 = X.AnonymousClass143.A07(r1)
            java.lang.String r0 = "jids"
            r2.putStringArrayList(r0, r1)
            java.lang.String r0 = "phones"
            r2.putStringArrayList(r0, r7)
            java.lang.String r0 = "labels"
            r2.putStringArrayList(r0, r6)
            java.lang.String r0 = "business_name"
            r2.putString(r0, r4)
            r3.A17(r2)
            X.C36421kH.A1A(r3, r5)
            return
        L_0x0b4e:
            boolean r0 = r3.isEmpty()
            r8 = 1
            r6 = 0
            if (r0 == 0) goto L_0x0b74
            java.util.ArrayList r1 = r7.A0b
            int r0 = r1.size()
            if (r0 != r8) goto L_0x0b74
            java.lang.String r4 = X.C36421kH.A0e(r1, r6)
            X.3Rv r3 = r7.A07
            android.content.Context r2 = r7.getContext()
            r0 = 18
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "sms:"
            r3.A02(r2, r1, r4, r0)
            return
        L_0x0b74:
            java.util.ArrayList r2 = r7.A0b
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0b8a
            int r0 = r3.size()
            if (r0 != r8) goto L_0x0b8a
            java.lang.String r0 = X.C36421kH.A0e(r3, r6)
            r4.A04(r0)
            return
        L_0x0b8a:
            int r1 = r2.size()
            int r0 = r3.size()
            int r1 = r1 + r0
            java.util.ArrayList r5 = X.C36441kJ.A14(r1)
            java.util.Iterator r2 = r2.iterator()
        L_0x0b9b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0baf
            java.lang.String r1 = X.AnonymousClass001.A0C(r2)
            X.0ts r0 = r7.A0E
            java.lang.String r0 = r0.A0H(r1)
            r5.add(r0)
            goto L_0x0b9b
        L_0x0baf:
            java.util.Iterator r2 = r3.iterator()
        L_0x0bb3:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0bc7
            java.lang.String r1 = X.AnonymousClass001.A0C(r2)
            X.0ts r0 = r7.A0E
            java.lang.String r0 = r0.A0G(r1)
            r5.add(r0)
            goto L_0x0bb3
        L_0x0bc7:
            X.3Sx r0 = r7.A0K
            X.3F9 r0 = r0.A0A
            java.lang.String r0 = r0.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            android.content.Context r3 = r7.getContext()
            if (r0 == 0) goto L_0x0bfe
            r0 = 2131890572(0x7f12118c, float:1.941584E38)
            java.lang.String r1 = r3.getString(r0)
        L_0x0bde:
            android.content.Context r0 = r7.getContext()
            X.1qm r3 = X.AnonymousClass3LW.A00(r0)
            r3.A0q(r1)
            java.lang.String[] r0 = new java.lang.String[r6]
            java.lang.Object[] r2 = r5.toArray(r0)
            java.lang.CharSequence[] r2 = (java.lang.CharSequence[]) r2
            r0 = 9
            X.4Xp r1 = new X.4Xp
            r1.<init>(r5, r4, r0)
            androidx.appcompat.app.AlertDialog$Builder r0 = r3.A00
            r0.A0T(r1, r2)
            goto L_0x0c70
        L_0x0bfe:
            r2 = 2131890588(0x7f12119c, float:1.9415872E38)
            java.lang.Object[] r1 = new java.lang.Object[r8]
            X.3Sx r0 = r7.A0K
            X.3F9 r0 = r0.A0A
            java.lang.String r0 = r0.A01
            java.lang.String r1 = X.C36391kE.A0v(r3, r0, r1, r6, r2)
            goto L_0x0bde
        L_0x0c0e:
            java.lang.Object r7 = r4.A00
            com.whatsapp.conversation.ConversationAttachmentContentView r7 = (com.whatsapp.conversation.ConversationAttachmentContentView) r7
            android.content.Context r0 = r7.getContext()
            X.1qm r3 = X.AnonymousClass3LW.A00(r0)
            X.1FR r2 = r7.A0Q
            X.9ig r6 = X.C201039ig.A00
            X.0yC r0 = r2.A06
            boolean r0 = r6.A00(r0)
            r1 = 2131891929(0x7f1216d9, float:1.9418592E38)
            if (r0 == 0) goto L_0x0c2c
            r1 = 2131887721(0x7f120669, float:1.9410057E38)
        L_0x0c2c:
            X.0wG r0 = r2.A04
            android.content.Context r0 = r0.A00
            java.lang.String r0 = r0.getString(r1)
            r3.A0q(r0)
            X.1FR r5 = r7.A0Q
            X.3BB r2 = r7.A0A
            X.11F r0 = r7.A0M
            com.whatsapp.jid.UserJid r1 = X.C36401kF.A0b(r0)
            X.16D r0 = r2.A00
            X.141 r1 = r0.A08(r1)
            if (r1 == 0) goto L_0x0c78
            X.171 r0 = r2.A01
            java.lang.String r2 = r0.A0H(r1)
        L_0x0c4f:
            X.0yC r0 = r5.A06
            boolean r0 = r6.A00(r0)
            r1 = 2131891928(0x7f1216d8, float:1.941859E38)
            if (r0 == 0) goto L_0x0c5d
            r1 = 2131887720(0x7f120668, float:1.9410055E38)
        L_0x0c5d:
            X.0wG r0 = r5.A04
            android.content.Context r0 = r0.A00
            java.lang.String r0 = X.C36321k7.A0A(r0, r2, r1)
            r3.A0p(r0)
            r1 = 2131891806(0x7f12165e, float:1.9418342E38)
            r0 = 30
            X.C39001qm.A0H(r3, r4, r0, r1)
        L_0x0c70:
            X.0FM r0 = r3.create()
            r0.show()
            return
        L_0x0c78:
            r2 = 0
            goto L_0x0c4f
        L_0x0c7a:
            java.lang.Object r0 = r1.A00
            X.3fk r0 = (X.C70803fk) r0
            X.4V6 r1 = r0.A2l
            com.whatsapp.conversation.conversationrow.messagerating.MessageRatingFragment r0 = com.whatsapp.conversation.conversationrow.messagerating.MessageRatingFragment.A03(r2, r3)
            r1.Btm(r0)
            return
        L_0x0c88:
            com.whatsapp.webpagepreview.WebPagePreviewView r1 = r2.A09
            r0 = 1
            r1.setImageProgressBarVisibility(r0)
            com.whatsapp.webpagepreview.WebPagePreviewView r0 = r2.A09
            r7 = 0
            r0.A0O(r7, r7)
            X.0wU r6 = r2.A0M
            X.0y0 r5 = r2.A04
            X.6tS r0 = r2.A03
            X.36r r0 = r0.A05
            java.lang.String r3 = r0.A02
            java.lang.String r2 = r0.A01
            X.4Z7 r1 = new X.4Z7
            r1.<init>(r4, r7)
            X.5MI r0 = new X.5MI
            r0.<init>(r5, r1, r3, r2)
            X.C36441kJ.A1E(r0, r6)
            return
        L_0x0cae:
            java.lang.String r0 = "groupChatManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0cb5:
            int r5 = r8.A00
            java.util.ArrayList r4 = r8.A3o()
            java.lang.String r3 = r8.A03
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r8.getPackageName()
            java.lang.String r0 = "com.whatsapp.group.newgroup.NewGroup"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "entry_point"
            r2.putExtra(r0, r5)
            java.lang.String r0 = "create_group_for_xfamily"
            r2.putExtra(r0, r6)
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0ce3
            java.util.ArrayList r1 = X.AnonymousClass143.A07(r4)
            java.lang.String r0 = "selected"
            r2.putStringArrayListExtra(r0, r1)
        L_0x0ce3:
            java.lang.String r0 = "prefill_group_name"
            r2.putExtra(r0, r3)
            r0 = 11
            r8.BuO(r2, r0)
            X.1UN r1 = r8.A02
            if (r1 != 0) goto L_0x0cf8
            java.lang.String r0 = "xFamilyUserFlowLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0cf8:
            java.lang.String r0 = "TAP_ADD_PARTICIPANTS_NEXT"
            r1.A04(r0)
            return
        L_0x0cfe:
            X.171 r1 = r8.A0B
            X.16D r0 = r8.A09
            java.lang.String r3 = X.C36381kD.A0u(r0, r1, r2)
            boolean r2 = X.AnonymousClass000.A1V(r3)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "GroupMembersSelector/ CommunityName is null for"
            r1.append(r0)
            X.147 r0 = r8.A07
            java.lang.String r0 = X.AnonymousClass000.A0o(r0, r1)
            X.C18740tg.A0D(r2, r0)
            X.1qm r2 = X.AnonymousClass3LW.A00(r8)
            r1 = 2131887154(0x7f120432, float:1.9408907E38)
            r0 = 8
            X.C39001qm.A06(r8, r2, r0, r1)
            r0 = 2131894695(0x7f1221a7, float:1.9424202E38)
            if (r3 == 0) goto L_0x0d3b
            java.lang.String r0 = X.C36351kA.A0w(r8, r3, r4, r0)
        L_0x0d31:
            r2.A0p(r0)
            X.C39001qm.A07(r2)
            r2.A0b()
            return
        L_0x0d3b:
            java.lang.String r0 = r8.getString(r0)
            goto L_0x0d31
        L_0x0d40:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0d7f }
            r0.append(r2)     // Catch:{ all -> 0x0d7f }
            java.lang.String r1 = "@broadcast"
            java.lang.String r0 = X.AnonymousClass000.A0q(r1, r0)     // Catch:{ all -> 0x0d7f }
            X.8dx r0 = X.C177538dx.A00(r0)     // Catch:{ all -> 0x0d7f }
            int r0 = X.AnonymousClass1A7.A00(r4, r0)     // Catch:{ all -> 0x0d7f }
            if (r0 < 0) goto L_0x0d5b
            r0 = 1
            long r2 = r2 + r0
            goto L_0x0d40
        L_0x0d5b:
            monitor-exit(r4)     // Catch:{ all -> 0x0d7f }
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()
            r0.append(r2)
            java.lang.String r0 = X.AnonymousClass000.A0q(r1, r0)
            X.8dx r4 = X.C177538dx.A00(r0)
            X.C18740tg.A06(r4)
            java.util.ArrayList r3 = r8.A3o()
            X.0wU r2 = r8.A04
            r1 = 40
            X.74n r0 = new X.74n
            r0.<init>(r8, r4, r3, r1)
            r2.Boy(r0)
            return
        L_0x0d7f:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0d7f }
            throw r0
        L_0x0d82:
            boolean r0 = r8.A0E
            if (r0 != 0) goto L_0x0d8f
            r0 = -10
            r8.setResult(r0)
            r8.finish()
            return
        L_0x0d8f:
            X.0yC r1 = r8.A0D
            r0 = 7889(0x1ed1, float:1.1055E-41)
            boolean r0 = r1.A0E(r0)
            if (r0 != 0) goto L_0x0dd6
            java.util.List r5 = com.whatsapp.community.LinkExistingGroups.A0w(r8)
            X.00T r0 = r8.A0H
            boolean r0 = X.C36331k8.A1b(r0)
            if (r0 == 0) goto L_0x0dd3
            X.2no r4 = X.C51432no.SUGGEST
        L_0x0da7:
            r0 = 0
            X.AnonymousClass00C.A0D(r5, r0)
            com.whatsapp.community.CommunityConfirmLinkDialogFragment r3 = new com.whatsapp.community.CommunityConfirmLinkDialogFragment
            r3.<init>()
            android.os.Bundle r2 = X.AnonymousClass001.A07()
            java.lang.String r1 = "subgroup_jid_list"
            java.util.ArrayList r0 = X.AnonymousClass143.A07(r5)
            r2.putStringArrayList(r1, r0)
            java.lang.String r1 = "link_mode"
            java.lang.String r0 = r4.toString()
            r2.putString(r1, r0)
            r3.A17(r2)
            X.01z r1 = r8.getSupportFragmentManager()
            java.lang.String r0 = "LinkExistingGroups"
            r3.A1i(r1, r0)
            return
        L_0x0dd3:
            X.2no r4 = X.C51432no.DIRECT_LINK
            goto L_0x0da7
        L_0x0dd6:
            X.190 r0 = r8.A09
            if (r0 == 0) goto L_0x0e10
            X.00T r0 = r8.A0H
            boolean r5 = X.C36331k8.A1b(r0)
            X.147 r4 = r8.A0A
            java.util.List r3 = com.whatsapp.community.LinkExistingGroups.A0w(r8)
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r8.getPackageName()
            java.lang.String r0 = "com.whatsapp.community.ReviewGroupsPermissionsBeforeLinkActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "is_suggest_mode"
            r2.putExtra(r0, r5)
            java.lang.String r1 = X.C36381kD.A0w(r4)
            java.lang.String r0 = "extra_parent_group_jid"
            r2.putExtra(r0, r1)
            java.util.ArrayList r1 = X.AnonymousClass143.A07(r3)
            java.lang.String r0 = "extra_groups_to_be_linked"
            r2.putExtra(r0, r1)
            r0 = 1007(0x3ef, float:1.411E-42)
            r8.BuO(r2, r0)
            return
        L_0x0e10:
            java.lang.RuntimeException r0 = X.C36331k8.A0X()
            throw r0
        L_0x0e15:
            java.lang.Object r5 = r4.A00
            com.whatsapp.contact.picker.ContactPickerFragment r5 = (com.whatsapp.contact.picker.ContactPickerFragment) r5
            boolean r1 = r5.A20()
            r0 = 14
            if (r1 != 0) goto L_0x0e22
            r0 = 2
        L_0x0e22:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            X.1du r0 = r5.A11
            r0.A00(r3)
        L_0x0e2b:
            X.1dt r1 = r5.A0V
            android.content.Context r0 = r2.getContext()
            r1.A01(r0, r3)
            return
        L_0x0e35:
            X.1Sq r2 = r3.A0A
            X.147 r1 = r3.A0M
            int r0 = r3.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A03(r3, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48912iG.A02(android.view.View):void");
    }

    public void A03() {
        Editable text;
        ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A00;
        if (contactPickerFragment.A3A) {
            ContactPickerFragment.A0I(contactPickerFragment, (AnonymousClass141) null);
        } else if (contactPickerFragment.A34 || contactPickerFragment.A38) {
            Intent A0D = C36431kI.A0D();
            Map map = contactPickerFragment.A3o;
            A0D.putStringArrayListExtra("jids", AnonymousClass143.A07(map.keySet()));
            A0D.putExtra("file_path", contactPickerFragment.A1Z().getString("file_path"));
            A0D.putExtra("all_contacts_count", contactPickerFragment.A2l.size());
            if (contactPickerFragment.A34) {
                contactPickerFragment.A2D.A00(false, map.size());
            }
            C64933Qa A03 = AnonymousClass3UJ.A03(contactPickerFragment.A1Z(), "");
            if (A03 != null) {
                AnonymousClass3UJ.A00(A0D, A03);
            }
            AnonymousClass3FP r0 = contactPickerFragment.A0y;
            if (r0 != null) {
                A0D.putExtra("include_captions", C36351kA.A1W(r0.A0E));
                AnonymousClass3FP r4 = contactPickerFragment.A0y;
                String str = null;
                if (r4.A0G && !C36351kA.A1W(r4.A0E) && (text = r4.A07.getText()) != null) {
                    str = AnonymousClass6YV.A0B(text.toString(), false);
                }
                A0D.putExtra("appended_message", str);
            } else if ((contactPickerFragment.A1o instanceof C28981Uw) && contactPickerFragment.A1g.A0E(6442)) {
                A0D.putExtra("include_captions", true);
            }
            contactPickerFragment.A24.A02(A0D, contactPickerFragment.A1W);
            contactPickerFragment.A0w.A03(A0D);
            C68733cN.A01(contactPickerFragment);
        }
    }

    public void A04(String str) {
        C174928Yz r5 = (C174928Yz) this.A00;
        C61913Dz r8 = r5.A02;
        Intent putExtra = C36431kI.A0B().setType("text/plain").putExtra("android.intent.extra.EMAIL", new String[]{str}).putExtra("android.intent.extra.SUBJECT", r5.getContext().getString(R.string.f12nameremoved));
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(C36391kE.A0v(r5.getContext(), "https://www.whatsapp.com/download/", new Object[1], 0, R.string.f12nameremoved));
        r8.A00(r5.getContext(), putExtra.putExtra("android.intent.extra.TEXT", AnonymousClass000.A0q("\n\n", A0u)), (C225014r) null, r5.getContext().getString(R.string.f12nameremoved), true);
    }
}
