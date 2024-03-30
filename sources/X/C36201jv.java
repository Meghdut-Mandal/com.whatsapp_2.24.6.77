package X;

/* renamed from: X.1jv  reason: invalid class name and case insensitive filesystem */
public class C36201jv implements AnonymousClass04S {
    public Object A00;
    public final int A01;

    public C36201jv(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02a6, code lost:
        com.whatsapp.search.SearchViewModel.A08(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02a9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x03bb, code lost:
        r0.A0D(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03be, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x03da, code lost:
        r0 = r2.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x03e9, code lost:
        r0.A0C(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x03ec, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x042a, code lost:
        r4.A03(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x042d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0440, code lost:
        if (r1 == 0) goto L_0x0457;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0455, code lost:
        if (r1.A02 == 0) goto L_0x0457;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0457, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0458, code lost:
        r2.A03(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x045b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x045c, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x014a, code lost:
        if (X.C20800yB.A00(X.C21000yV.A02, r1.A0f, 4708) == 2) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0164, code lost:
        if (r1.A0C.isEmpty() != false) goto L_0x0177;
     */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x019f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BTH(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.A01
            switch(r0) {
                case 0: goto L_0x02fa;
                case 1: goto L_0x0011;
                case 2: goto L_0x002d;
                case 3: goto L_0x0304;
                case 4: goto L_0x007d;
                case 5: goto L_0x030e;
                case 6: goto L_0x032a;
                case 7: goto L_0x034a;
                case 8: goto L_0x0357;
                case 9: goto L_0x0364;
                case 10: goto L_0x0375;
                case 11: goto L_0x0383;
                case 12: goto L_0x0390;
                case 13: goto L_0x039d;
                case 14: goto L_0x03ae;
                case 15: goto L_0x03bf;
                case 16: goto L_0x03cc;
                case 17: goto L_0x03dd;
                case 18: goto L_0x01b1;
                case 19: goto L_0x03ed;
                case 20: goto L_0x040f;
                case 21: goto L_0x042e;
                case 22: goto L_0x0443;
                case 23: goto L_0x045e;
                case 24: goto L_0x01e2;
                case 25: goto L_0x01e2;
                case 26: goto L_0x022a;
                case 27: goto L_0x0264;
                case 28: goto L_0x02aa;
                case 29: goto L_0x0466;
                case 30: goto L_0x046e;
                case 31: goto L_0x04e5;
                case 32: goto L_0x0515;
                case 33: goto L_0x02e4;
                case 34: goto L_0x01e2;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r11.A00
            X.02t r1 = (X.C006302t) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            r1.invoke(r12)
        L_0x0010:
            return
        L_0x0011:
            java.lang.Object r2 = r11.A00
            com.whatsapp.HomeActivity r2 = (com.whatsapp.HomeActivity) r2
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            if (r12 == 0) goto L_0x0010
            com.whatsapp.search.SearchViewModel r1 = r2.A13
            r0 = 1
            r1.A0g(r0)
            boolean r0 = r2.isFinishing()
            if (r0 != 0) goto L_0x0010
            boolean r0 = r12.booleanValue()
            com.whatsapp.HomeActivity.A15(r2, r0)
            return
        L_0x002d:
            java.lang.Object r4 = r11.A00
            com.whatsapp.HomeActivity r4 = (com.whatsapp.HomeActivity) r4
            java.lang.Number r12 = (java.lang.Number) r12
            if (r12 == 0) goto L_0x0010
            boolean r0 = r4.isFinishing()
            if (r0 != 0) goto L_0x0010
            int r1 = r12.intValue()
            if (r1 == 0) goto L_0x004a
            r0 = 1
            if (r1 != r0) goto L_0x0010
            androidx.appcompat.widget.Toolbar r0 = r4.A0M
            r4.setSupportActionBar(r0)
            return
        L_0x004a:
            androidx.appcompat.widget.Toolbar r0 = r4.A0M
            r4.setSupportActionBar(r0)
            X.02E r3 = com.whatsapp.HomeActivity.A0L(r4)
            if (r3 == 0) goto L_0x0010
            X.0yC r2 = r4.A0D
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)
            X.0yV r1 = X.C21000yV.A01
            r0 = 8013(0x1f4d, float:1.1229E-41)
            boolean r0 = X.C20800yB.A01(r1, r2, r0)
            if (r0 == 0) goto L_0x0010
            X.02E r0 = com.whatsapp.HomeActivity.A0L(r4)
            boolean r0 = r0 instanceof com.whatsapp.conversationslist.ConversationsFragment
            if (r0 == 0) goto L_0x0010
            android.view.View r1 = r3.A0F
            r0 = 2131433577(0x7f0b1869, float:1.8488944E38)
            android.view.View r1 = r1.findViewById(r0)
            if (r1 == 0) goto L_0x0010
            r0 = 0
            r1.setVisibility(r0)
            return
        L_0x007d:
            java.lang.Object r3 = r11.A00
            com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2 r3 = (com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2) r3
            java.lang.Number r12 = (java.lang.Number) r12
            int r6 = r12.intValue()
            android.view.View r0 = r3.A0F
            if (r0 != 0) goto L_0x0091
            java.lang.String r0 = "callsHistory/refreshView failed to get fragment view"
        L_0x008d:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x0091:
            r5 = 0
            r7 = 1
            if (r6 == 0) goto L_0x00e4
            if (r6 == r7) goto L_0x00d8
            r0 = 2
            if (r6 == r0) goto L_0x00d5
            r0 = 3
            if (r6 == r0) goto L_0x00d2
            r0 = 4
            if (r6 == r0) goto L_0x00e7
            r0 = 5
            if (r6 == r0) goto L_0x00a6
            java.lang.String r0 = "callsHistory/refreshView failed to determine screen to be shown"
            goto L_0x008d
        L_0x00a6:
            X.0yC r2 = r3.A0W
            X.0yV r1 = X.C21000yV.A01
            r0 = 3637(0xe35, float:5.097E-42)
            boolean r0 = X.C20800yB.A01(r1, r2, r0)
            if (r0 == 0) goto L_0x00b5
            X.1RJ r0 = r3.A0h
            goto L_0x00e9
        L_0x00b5:
            X.1RJ r0 = r3.A0i
            android.view.View r4 = r0.A01()
            android.widget.TextView r4 = (android.widget.TextView) r4
            X.01I r8 = r3.A0i()
            r2 = 2131893866(0x7f121e6a, float:1.942252E38)
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.CharSequence r0 = r3.A0n
            r1[r5] = r0
            java.lang.String r0 = r8.getString(r2, r1)
            r4.setText(r0)
            goto L_0x00ed
        L_0x00d2:
            X.1RJ r0 = r3.A0e
            goto L_0x00e9
        L_0x00d5:
            X.1RJ r0 = r3.A0j
            goto L_0x00e9
        L_0x00d8:
            androidx.recyclerview.widget.RecyclerView r4 = r3.A04
            r1 = -1
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r1, r1)
            r4.setLayoutParams(r0)
            goto L_0x00ed
        L_0x00e4:
            X.1RJ r0 = r3.A0g
            goto L_0x00e9
        L_0x00e7:
            X.1RJ r0 = r3.A0f
        L_0x00e9:
            android.view.View r4 = r0.A01()
        L_0x00ed:
            android.view.View r0 = r3.A02
            boolean r0 = X.C1901797e.A00(r0, r4)
            if (r0 != 0) goto L_0x012f
            X.1RJ[] r10 = r3.A0s
            int r9 = r10.length
            r8 = 0
        L_0x00f9:
            r2 = 8
            if (r8 >= r9) goto L_0x0115
            r1 = r10[r8]
            int r0 = r1.A00()
            if (r0 != 0) goto L_0x0112
            android.view.View r0 = r1.A01()
            boolean r0 = X.C1901797e.A00(r4, r0)
            if (r0 != 0) goto L_0x0112
            r1.A03(r2)
        L_0x0112:
            int r8 = r8 + 1
            goto L_0x00f9
        L_0x0115:
            androidx.recyclerview.widget.RecyclerView r0 = r3.A04
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x012a
            androidx.recyclerview.widget.RecyclerView r0 = r3.A04
            boolean r0 = X.C1901797e.A00(r4, r0)
            if (r0 != 0) goto L_0x012a
            androidx.recyclerview.widget.RecyclerView r0 = r3.A04
            r0.setVisibility(r2)
        L_0x012a:
            r4.setVisibility(r5)
            r3.A02 = r4
        L_0x012f:
            if (r6 == r7) goto L_0x0177
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel r1 = r3.A0F
            X.1hk r0 = r1.A01
            if (r0 == 0) goto L_0x014c
            java.util.ArrayList r0 = r1.A0C
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x014c
            X.0yC r2 = r1.A0f
            r1 = 4708(0x1264, float:6.597E-42)
            X.0yV r0 = X.C21000yV.A02
            int r1 = X.C20800yB.A00(r0, r2, r1)
            r0 = 2
            if (r1 != r0) goto L_0x0166
        L_0x014c:
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel r0 = r3.A0F
            boolean r0 = r0.A0a()
            if (r0 != 0) goto L_0x0166
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel r1 = r3.A0F
            X.3dv r0 = r1.A03
            if (r0 != 0) goto L_0x0166
            X.3du r0 = r1.A02
            if (r0 == 0) goto L_0x0177
            java.util.ArrayList r0 = r1.A0C
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0177
        L_0x0166:
            androidx.recyclerview.widget.RecyclerView r4 = r3.A04
            r2 = -1
            r1 = -2
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r2, r1)
            r4.setLayoutParams(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r3.A04
            r0.setVisibility(r5)
        L_0x0177:
            com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2.A08(r3, r6)
            r1 = 5
            r4 = -1
            r2 = 8
            android.view.View r0 = r3.A01
            int r0 = r0.getVisibility()
            if (r6 != r1) goto L_0x019f
            if (r0 != r2) goto L_0x0010
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel r0 = r3.A0F
            X.3dv r0 = r0.A03
            if (r0 == 0) goto L_0x0010
            android.view.View r2 = r3.A00
            r1 = -2
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r4, r1)
            r2.setLayoutParams(r0)
            android.view.View r0 = r3.A01
            r0.setVisibility(r5)
            return
        L_0x019f:
            if (r0 == r2) goto L_0x0010
            android.view.View r1 = r3.A00
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r4, r4)
            r1.setLayoutParams(r0)
            android.view.View r0 = r3.A01
            r0.setVisibility(r2)
            return
        L_0x01b1:
            java.lang.Object r4 = r11.A00
            X.1S6 r4 = (X.AnonymousClass1S6) r4
            android.util.Pair r12 = (android.util.Pair) r12
            java.lang.Object r3 = r12.second
            if (r3 == 0) goto L_0x0010
            java.lang.Object r1 = r12.first
            if (r1 == 0) goto L_0x01c5
            X.1S3 r0 = r4.A0G
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r0.A08 = r1
        L_0x01c5:
            X.1S3 r2 = r4.A0G
            java.lang.Number r3 = (java.lang.Number) r3
            int r0 = r3.intValue()
            r2.A00 = r0
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.A0J
            r0 = 1
            r1.set(r0)
            X.00s r1 = r4.A0A
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A0D(r0)
            X.08S r0 = r4.A03
            r0.A0C(r2)
            return
        L_0x01e2:
            java.lang.Object r4 = r11.A00
            com.whatsapp.search.SearchViewModel r4 = (com.whatsapp.search.SearchViewModel) r4
            X.08S r0 = r4.A02
            java.lang.Object r0 = r0.A04()
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            r3 = 0
            if (r0 != 0) goto L_0x0225
            r2 = 0
        L_0x01f2:
            X.00s r1 = r4.A0i
            java.lang.Object r0 = r1.A04()
            if (r0 != 0) goto L_0x021a
            r1 = 0
        L_0x01fb:
            boolean r0 = com.whatsapp.search.SearchViewModel.A0C(r4)
            if (r0 == 0) goto L_0x0206
            int r0 = r2 + -3
            if (r1 <= r0) goto L_0x0206
            r3 = 1
        L_0x0206:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
            X.08S r1 = r4.A0f
            java.lang.Object r0 = r1.A04()
            boolean r0 = X.C1901797e.A00(r2, r0)
            if (r0 != 0) goto L_0x0010
            r1.A0D(r2)
            return
        L_0x021a:
            java.lang.Object r0 = r1.A04()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            goto L_0x01fb
        L_0x0225:
            int r2 = r0.size()
            goto L_0x01f2
        L_0x022a:
            java.lang.Object r5 = r11.A00
            com.whatsapp.search.SearchViewModel r5 = (com.whatsapp.search.SearchViewModel) r5
            java.util.List r12 = (java.util.List) r12
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            java.util.Iterator r3 = r12.iterator()
        L_0x0238:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0257
            java.lang.Object r2 = r3.next()
            X.5Jp r2 = (X.C106415Jp) r2
            X.141 r1 = r2.A01
            java.lang.Class<X.11F> r0 = X.AnonymousClass11F.class
            com.whatsapp.jid.Jid r0 = r1.A06(r0)
            if (r0 == 0) goto L_0x0238
            X.5Ju r0 = new X.5Ju
            r0.<init>(r2)
            r4.add(r0)
            goto L_0x0238
        L_0x0257:
            r5.A0N = r4
            com.whatsapp.search.SearchViewModel.A07(r5)
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x0010
            r0 = 2
            goto L_0x02a6
        L_0x0264:
            java.lang.Object r5 = r11.A00
            com.whatsapp.search.SearchViewModel r5 = (com.whatsapp.search.SearchViewModel) r5
            java.util.List r12 = (java.util.List) r12
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r12)
            java.util.Iterator r3 = r0.iterator()
        L_0x0277:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x029a
            java.lang.Object r1 = r3.next()
            X.141 r1 = (X.AnonymousClass141) r1
            if (r1 == 0) goto L_0x0277
            java.lang.Class<X.11F> r0 = X.AnonymousClass11F.class
            com.whatsapp.jid.Jid r2 = r1.A06(r0)
            X.C18740tg.A06(r2)
            X.11F r2 = (X.AnonymousClass11F) r2
            r1 = 2
            X.5Jv r0 = new X.5Jv
            r0.<init>(r2, r1)
            r4.add(r0)
            goto L_0x0277
        L_0x029a:
            r5.A0K = r4
            com.whatsapp.search.SearchViewModel.A07(r5)
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x0010
            r0 = 1
        L_0x02a6:
            com.whatsapp.search.SearchViewModel.A08(r5, r0)
            return
        L_0x02aa:
            java.lang.Object r4 = r11.A00
            com.whatsapp.search.SearchViewModel r4 = (com.whatsapp.search.SearchViewModel) r4
            java.util.List r12 = (java.util.List) r12
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r12)
            java.util.Iterator r2 = r0.iterator()
        L_0x02bd:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x02d4
            java.lang.Object r1 = r2.next()
            X.141 r1 = (X.AnonymousClass141) r1
            if (r1 == 0) goto L_0x02bd
            X.5Jt r0 = new X.5Jt
            r0.<init>(r1)
            r3.add(r0)
            goto L_0x02bd
        L_0x02d4:
            r4.A0M = r3
            com.whatsapp.search.SearchViewModel.A07(r4)
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x0010
            r0 = 0
            com.whatsapp.search.SearchViewModel.A08(r4, r0)
            return
        L_0x02e4:
            java.lang.Object r1 = r11.A00
            com.whatsapp.search.SearchViewModel r1 = (com.whatsapp.search.SearchViewModel) r1
            X.1Rt r12 = (X.C28211Rt) r12
            com.whatsapp.search.SearchViewModel.A04(r12, r1)
            java.util.List r0 = r12.A02
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0010
            r0 = 4
            com.whatsapp.search.SearchViewModel.A08(r1, r0)
            return
        L_0x02fa:
            java.lang.Object r0 = r11.A00
            X.14u r0 = (X.C225314u) r0
            java.lang.Integer r12 = (java.lang.Integer) r12
            r0.A3B(r12)
            return
        L_0x0304:
            java.lang.Object r0 = r11.A00
            X.155 r0 = (X.AnonymousClass155) r0
            java.lang.Integer r12 = (java.lang.Integer) r12
            r0.A3b(r12)
            return
        L_0x030e:
            java.lang.Object r2 = r11.A00
            com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2 r2 = (com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2) r2
            java.util.AbstractCollection r12 = (java.util.AbstractCollection) r12
            X.1hI r1 = r2.A0E
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r12)
            r1.A0M(r0)
            boolean r1 = r12.isEmpty()
            r0 = 1
            if (r1 == 0) goto L_0x0326
            r0 = 2
        L_0x0326:
            com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2.A08(r2, r0)
            return
        L_0x032a:
            java.lang.Object r3 = r11.A00
            com.whatsapp.community.CommunityFragment r3 = (com.whatsapp.community.CommunityFragment) r3
            X.17Y r2 = r3.A04
            if (r2 == 0) goto L_0x033d
            r1 = 21
            X.1j2 r0 = new X.1j2
            r0.<init>(r3, r12, r1)
            r2.A0H(r0)
            return
        L_0x033d:
            java.lang.String r0 = "globalUI"
            X.AnonymousClass00C.A0G(r0)
            java.lang.String r0 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x034a:
            java.lang.Object r0 = r11.A00
            X.1S2 r0 = (X.AnonymousClass1S2) r0
            X.11F r12 = (X.AnonymousClass11F) r12
            X.1S3 r2 = r0.A0A
            r2.A04 = r12
            X.08S r0 = r0.A02
            goto L_0x03bb
        L_0x0357:
            java.lang.Object r0 = r11.A00
            X.1S2 r0 = (X.AnonymousClass1S2) r0
            X.6bb r12 = (X.C134786bb) r12
            X.1S3 r2 = r0.A0A
            r2.A06 = r12
            X.08S r0 = r0.A02
            goto L_0x03bb
        L_0x0364:
            java.lang.Object r1 = r11.A00
            X.1S2 r1 = (X.AnonymousClass1S2) r1
            java.lang.Number r12 = (java.lang.Number) r12
            X.1S3 r2 = r1.A0A
            int r0 = r12.intValue()
            r2.A02 = r0
            X.08S r0 = r1.A02
            goto L_0x03bb
        L_0x0375:
            java.lang.Object r0 = r11.A00
            X.1S2 r0 = (X.AnonymousClass1S2) r0
            java.lang.String r12 = (java.lang.String) r12
            X.1S3 r2 = r0.A0A
            r2.A04(r12)
            X.08S r0 = r0.A02
            goto L_0x03bb
        L_0x0383:
            java.lang.Object r0 = r11.A00
            X.1S5 r0 = (X.AnonymousClass1S5) r0
            X.11F r12 = (X.AnonymousClass11F) r12
            X.1S3 r2 = r0.A09
            r2.A04 = r12
            X.08S r0 = r0.A01
            goto L_0x03bb
        L_0x0390:
            java.lang.Object r0 = r11.A00
            X.1S5 r0 = (X.AnonymousClass1S5) r0
            X.6bb r12 = (X.C134786bb) r12
            X.1S3 r2 = r0.A09
            r2.A06 = r12
            X.08S r0 = r0.A01
            goto L_0x03bb
        L_0x039d:
            java.lang.Object r1 = r11.A00
            X.1S5 r1 = (X.AnonymousClass1S5) r1
            java.lang.Number r12 = (java.lang.Number) r12
            X.1S3 r2 = r1.A09
            int r0 = r12.intValue()
            r2.A02 = r0
            X.08S r0 = r1.A01
            goto L_0x03bb
        L_0x03ae:
            java.lang.Object r0 = r11.A00
            X.1S5 r0 = (X.AnonymousClass1S5) r0
            java.lang.String r12 = (java.lang.String) r12
            X.1S3 r2 = r0.A09
            r2.A04(r12)
            X.08S r0 = r0.A01
        L_0x03bb:
            r0.A0D(r2)
            return
        L_0x03bf:
            java.lang.Object r2 = r11.A00
            X.1S8 r2 = (X.AnonymousClass1S8) r2
            X.37M r12 = (X.AnonymousClass37M) r12
            X.1S9 r1 = r2.A07
            java.util.Set r0 = r12.A01
            r1.A02 = r0
            goto L_0x03da
        L_0x03cc:
            java.lang.Object r2 = r11.A00
            X.1S8 r2 = (X.AnonymousClass1S8) r2
            java.lang.Number r12 = (java.lang.Number) r12
            X.1S9 r1 = r2.A07
            int r0 = r12.intValue()
            r1.A00 = r0
        L_0x03da:
            X.08S r0 = r2.A02
            goto L_0x03e9
        L_0x03dd:
            java.lang.Object r0 = r11.A00
            X.1S8 r0 = (X.AnonymousClass1S8) r0
            java.util.List r12 = (java.util.List) r12
            X.1S9 r1 = r0.A07
            r1.A01 = r12
            X.08S r0 = r0.A02
        L_0x03e9:
            r0.A0C(r1)
            return
        L_0x03ed:
            java.lang.Object r4 = r11.A00
            X.1S6 r4 = (X.AnonymousClass1S6) r4
            X.11F r12 = (X.AnonymousClass11F) r12
            X.1S3 r2 = r4.A0G
            r2.A04 = r12
            r3 = 0
            r2.A0F = r3
            X.1S3 r0 = r4.A0H
            r0.A04 = r12
            r0.A0F = r3
            X.00s r1 = r4.A0B
            java.lang.String r0 = X.AnonymousClass1S6.A00(r4)
            r1.A0D(r0)
            int r0 = r2.A02
            if (r0 != 0) goto L_0x042a
            r3 = 1
            goto L_0x042a
        L_0x040f:
            java.lang.Object r4 = r11.A00
            X.1S6 r4 = (X.AnonymousClass1S6) r4
            X.6bb r12 = (X.C134786bb) r12
            X.1S3 r2 = r4.A0G
            r2.A06 = r12
            r3 = 1
            r2.A0F = r3
            X.00s r1 = r4.A0B
            java.lang.String r0 = X.AnonymousClass1S6.A00(r4)
            r1.A0D(r0)
            int r0 = r2.A02
            if (r0 == 0) goto L_0x042a
            r3 = 0
        L_0x042a:
            r4.A03(r3)
            return
        L_0x042e:
            java.lang.Object r2 = r11.A00
            X.1S6 r2 = (X.AnonymousClass1S6) r2
            java.lang.Number r12 = (java.lang.Number) r12
            X.1S3 r0 = r2.A0G
            int r1 = r12.intValue()
            r0.A02 = r1
            X.1S3 r0 = r2.A0H
            r0.A02 = r1
            if (r1 != 0) goto L_0x045c
            goto L_0x0457
        L_0x0443:
            java.lang.Object r2 = r11.A00
            X.1S6 r2 = (X.AnonymousClass1S6) r2
            java.lang.String r12 = (java.lang.String) r12
            X.1S3 r1 = r2.A0G
            r1.A04(r12)
            X.1S3 r0 = r2.A0H
            r0.A04(r12)
            int r0 = r1.A02
            if (r0 != 0) goto L_0x045c
        L_0x0457:
            r0 = 1
        L_0x0458:
            r2.A03(r0)
            return
        L_0x045c:
            r0 = 0
            goto L_0x0458
        L_0x045e:
            java.lang.Object r0 = r11.A00
            com.whatsapp.search.SearchViewModel r0 = (com.whatsapp.search.SearchViewModel) r0
            com.whatsapp.search.SearchViewModel.A07(r0)
            return
        L_0x0466:
            java.lang.Object r0 = r11.A00
            X.00r r0 = (X.C001600r) r0
            r0.A0D(r12)
            return
        L_0x046e:
            java.lang.Object r5 = r11.A00
            com.whatsapp.search.SearchViewModel r5 = (com.whatsapp.search.SearchViewModel) r5
            java.util.Collection r12 = (java.util.Collection) r12
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r12)
            java.util.Iterator r3 = r0.iterator()
        L_0x0482:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x04b1
            java.lang.Object r2 = r3.next()
            X.141 r2 = (X.AnonymousClass141) r2
            if (r2 == 0) goto L_0x0482
            java.lang.String r1 = r2.A0J()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0482
            boolean r0 = r6.containsKey(r1)
            if (r0 != 0) goto L_0x04a7
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()
            r6.put(r1, r0)
        L_0x04a7:
            java.lang.Object r0 = r6.get(r1)
            java.util.List r0 = (java.util.List) r0
            r0.add(r2)
            goto L_0x0482
        L_0x04b1:
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            java.util.Set r0 = r6.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L_0x04bd:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x04df
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r2 = r0.getValue()
            java.util.List r2 = (java.util.List) r2
            r0 = 0
            java.lang.Object r1 = r2.get(r0)
            X.141 r1 = (X.AnonymousClass141) r1
            X.2dP r0 = new X.2dP
            r0.<init>(r1, r2)
            r4.add(r0)
            goto L_0x04bd
        L_0x04df:
            r5.A0O = r4
            com.whatsapp.search.SearchViewModel.A07(r5)
            return
        L_0x04e5:
            java.lang.Object r2 = r11.A00
            com.whatsapp.search.SearchViewModel r2 = (com.whatsapp.search.SearchViewModel) r2
            android.util.SparseIntArray r12 = (android.util.SparseIntArray) r12
            if (r12 != 0) goto L_0x04f8
            android.util.SparseIntArray r12 = new android.util.SparseIntArray
            r12.<init>()
            r1 = 105(0x69, float:1.47E-43)
            r0 = 1
            r12.put(r1, r0)
        L_0x04f8:
            monitor-enter(r2)
            X.00r r0 = r2.A0Z     // Catch:{ all -> 0x0512 }
            java.lang.Object r0 = r0.A04()     // Catch:{ all -> 0x0512 }
            if (r0 == 0) goto L_0x050a
            android.util.SparseIntArray r12 = new android.util.SparseIntArray     // Catch:{ all -> 0x0512 }
            r12.<init>()     // Catch:{ all -> 0x0512 }
        L_0x0506:
            r2.A01 = r12     // Catch:{ all -> 0x0512 }
            monitor-exit(r2)     // Catch:{ all -> 0x0512 }
            goto L_0x050e
        L_0x050a:
            com.whatsapp.search.SearchViewModel.A03(r12, r2)     // Catch:{ all -> 0x0512 }
            goto L_0x0506
        L_0x050e:
            com.whatsapp.search.SearchViewModel.A07(r2)
            return
        L_0x0512:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0512 }
            throw r1
        L_0x0515:
            java.lang.Object r1 = r11.A00
            com.whatsapp.search.SearchViewModel r1 = (com.whatsapp.search.SearchViewModel) r1
            X.37M r12 = (X.AnonymousClass37M) r12
            X.00r r0 = r1.A0Z
            java.lang.Object r0 = r0.A04()
            if (r0 == 0) goto L_0x052d
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()
        L_0x0527:
            r1.A0L = r0
            com.whatsapp.search.SearchViewModel.A07(r1)
            return
        L_0x052d:
            java.util.List r0 = r12.A00
            goto L_0x0527
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36201jv.BTH(java.lang.Object):void");
    }
}
