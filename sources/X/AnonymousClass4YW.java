package X;

/* renamed from: X.4YW  reason: invalid class name */
public class AnonymousClass4YW implements AnonymousClass4Q6 {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass4YW(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public static void A00(C81843xi r1, C33301f4 r2, Object obj, Object obj2, int i) {
        r2.A00(new AnonymousClass4YW(obj, obj2, i), r1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: X.1wI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: X.1wP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: com.whatsapp.status.seeall.adapter.StatusSeeAllAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: com.whatsapp.updates.ui.statusmuting.MutedStatusesAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: X.1wI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: com.whatsapp.status.seeall.adapter.StatusSeeAllAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: X.1wI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: com.whatsapp.status.seeall.adapter.StatusSeeAllAdapter} */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        r9.A02(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x010b, code lost:
        r9.A02(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x010e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BU2(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.A02
            switch(r0) {
                case 0: goto L_0x0017;
                case 1: goto L_0x0049;
                case 2: goto L_0x005d;
                case 3: goto L_0x010f;
                case 4: goto L_0x006c;
                case 5: goto L_0x00f9;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r8.A00
            com.whatsapp.updates.ui.statusmuting.MutedStatusesAdapter r1 = (com.whatsapp.updates.ui.statusmuting.MutedStatusesAdapter) r1
            java.lang.Object r0 = r8.A01
            java.util.List r0 = (java.util.List) r0
            X.0X4 r9 = (X.AnonymousClass0X4) r9
            if (r9 == 0) goto L_0x0016
            r1.A01 = r0
        L_0x0013:
            r9.A02(r1)
        L_0x0016:
            return
        L_0x0017:
            java.lang.Object r5 = r8.A00
            X.1wX r5 = (X.C41051wX) r5
            java.lang.Object r1 = r8.A01
            java.util.Collection r1 = (java.util.Collection) r1
            X.0X4 r9 = (X.AnonymousClass0X4) r9
            r0 = 1
            X.AnonymousClass00C.A0D(r1, r0)
            if (r9 == 0) goto L_0x0016
            java.util.List r4 = r5.A08
            r4.clear()
            r4.addAll(r1)
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            java.util.Iterator r2 = r4.iterator()
        L_0x0037:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x015c
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.C46542Yg
            if (r0 == 0) goto L_0x0037
            r3.add(r1)
            goto L_0x0037
        L_0x0049:
            java.lang.Object r2 = r8.A00
            X.1wP r2 = (X.C40971wP) r2
            java.lang.Object r1 = r8.A01
            java.util.List r1 = (java.util.List) r1
            X.0X4 r9 = (X.AnonymousClass0X4) r9
            r0 = 1
            X.AnonymousClass00C.A0D(r1, r0)
            if (r9 == 0) goto L_0x0016
            r2.A03 = r1
            goto L_0x010b
        L_0x005d:
            java.lang.Object r1 = r8.A00
            com.whatsapp.status.seeall.adapter.StatusSeeAllAdapter r1 = (com.whatsapp.status.seeall.adapter.StatusSeeAllAdapter) r1
            java.lang.Object r0 = r8.A01
            java.util.List r0 = (java.util.List) r0
            X.0X4 r9 = (X.AnonymousClass0X4) r9
            if (r9 == 0) goto L_0x0016
            r1.A01 = r0
            goto L_0x0013
        L_0x006c:
            java.lang.Object r2 = r8.A00
            com.whatsapp.updates.ui.adapter.UpdatesAdapter r2 = (com.whatsapp.updates.ui.adapter.UpdatesAdapter) r2
            java.lang.Object r1 = r8.A01
            java.util.List r1 = (java.util.List) r1
            X.0X4 r9 = (X.AnonymousClass0X4) r9
            r0 = 1
            X.AnonymousClass00C.A0D(r1, r0)
            if (r9 == 0) goto L_0x0016
            r1.size()
            r2.A04 = r1
            r9.A02(r2)
            com.whatsapp.updates.ui.UpdatesFragment r3 = r2.A01
            if (r3 == 0) goto L_0x0016
            com.whatsapp.updates.viewmodels.UpdatesViewModel r0 = r3.A0c
            if (r0 == 0) goto L_0x0016
            X.11F r6 = r0.A01
            if (r6 == 0) goto L_0x0016
            com.whatsapp.updates.ui.adapter.UpdatesAdapter r0 = r3.A0b
            if (r0 == 0) goto L_0x0016
            java.util.List r0 = r0.A04
            java.util.Iterator r7 = r0.iterator()
            r5 = 0
        L_0x009b:
            boolean r0 = r7.hasNext()
            r4 = 0
            if (r0 == 0) goto L_0x0016
            java.lang.Object r2 = r7.next()
            int r1 = r5 + 1
            if (r5 >= 0) goto L_0x00af
            java.lang.RuntimeException r0 = X.C36351kA.A0v()
            throw r0
        L_0x00af:
            X.2uy r2 = (X.C55652uy) r2
            boolean r0 = r2 instanceof X.C48162go
            if (r0 == 0) goto L_0x00de
            r0 = r2
            X.2go r0 = (X.C48162go) r0
            if (r0 == 0) goto L_0x00de
            X.2La r0 = r0.A04
            X.11F r0 = r0.A06()
        L_0x00c0:
            boolean r0 = X.AnonymousClass00C.A0J(r0, r6)
            if (r0 != 0) goto L_0x00e0
            boolean r0 = r2 instanceof X.C48032ga
            if (r0 == 0) goto L_0x00d6
            X.2ga r2 = (X.C48032ga) r2
            if (r2 == 0) goto L_0x00d6
            X.3Sz r0 = r2.A00()
            if (r0 == 0) goto L_0x00d6
            com.whatsapp.jid.UserJid r4 = r0.A09
        L_0x00d6:
            boolean r0 = X.AnonymousClass00C.A0J(r4, r6)
            if (r0 != 0) goto L_0x00e0
            r5 = r1
            goto L_0x009b
        L_0x00de:
            r0 = r4
            goto L_0x00c0
        L_0x00e0:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            if (r0 == 0) goto L_0x0016
            int r2 = r0.intValue()
            com.whatsapp.updates.viewmodels.UpdatesViewModel r1 = r3.A0c
            if (r1 == 0) goto L_0x00f1
            r0 = 0
            r1.A01 = r0
        L_0x00f1:
            com.whatsapp.collections.ObservableRecyclerView r0 = r3.A0E
            if (r0 == 0) goto L_0x0016
            r0.A0h(r2)
            return
        L_0x00f9:
            java.lang.Object r2 = r8.A00
            X.1wI r2 = (X.C40901wI) r2
            java.lang.Object r1 = r8.A01
            java.util.List r1 = (java.util.List) r1
            X.0X4 r9 = (X.AnonymousClass0X4) r9
            r0 = 1
            X.AnonymousClass00C.A0D(r1, r0)
            if (r9 == 0) goto L_0x0016
            r2.A01 = r1
        L_0x010b:
            r9.A02(r2)
            return
        L_0x010f:
            java.lang.Object r7 = r8.A00
            java.util.Set r7 = (java.util.Set) r7
            java.lang.Object r6 = r8.A01
            com.whatsapp.status.viewmodels.StatusesViewModel r6 = (com.whatsapp.status.viewmodels.StatusesViewModel) r6
            java.util.Map r9 = (java.util.Map) r9
            r0 = 0
            X.AnonymousClass00C.A0D(r7, r0)
            if (r9 == 0) goto L_0x0155
            int r0 = r9.size()
            int r0 = X.C000300d.A02(r0)
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>(r0)
            java.util.Iterator r4 = X.AnonymousClass000.A0y(r9)
        L_0x0130:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0156
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r4)
            java.lang.Object r3 = r0.getKey()
            java.lang.Object r2 = r0.getValue()
            X.3Sz r2 = (X.C65663Sz) r2
            java.lang.Object r0 = r0.getKey()
            boolean r1 = r7.contains(r0)
            X.3Ed r0 = new X.3Ed
            r0.<init>(r2, r1)
            r5.put(r3, r0)
            goto L_0x0130
        L_0x0155:
            r5 = 0
        L_0x0156:
            X.00s r0 = r6.A04
            r0.A0C(r5)
            return
        L_0x015c:
            int r1 = r3.size()
            int r0 = r4.size()
            if (r1 != r0) goto L_0x016b
            X.2Yh r0 = X.C46552Yh.A00
            r4.add(r0)
        L_0x016b:
            r9.A02(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4YW.BU2(java.lang.Object):void");
    }
}
