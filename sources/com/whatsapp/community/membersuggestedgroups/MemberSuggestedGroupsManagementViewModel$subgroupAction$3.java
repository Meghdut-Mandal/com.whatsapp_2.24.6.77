package com.whatsapp.community.membersuggestedgroups;

import X.AnonymousClass05G;

public final class MemberSuggestedGroupsManagementViewModel$subgroupAction$3 implements AnonymousClass05G {
    public final /* synthetic */ int A00;
    public final /* synthetic */ MemberSuggestedGroupsManagementViewModel A01;

    public MemberSuggestedGroupsManagementViewModel$subgroupAction$3(MemberSuggestedGroupsManagementViewModel memberSuggestedGroupsManagementViewModel, int i) {
        this.A01 = memberSuggestedGroupsManagementViewModel;
        this.A00 = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* renamed from: A00 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object B6N(java.util.Map r12, X.C023509x r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof X.C82683z6
            if (r0 == 0) goto L_0x00e8
            r7 = r13
            X.3z6 r7 = (X.C82683z6) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00e8
            int r2 = r2 - r1
            r7.label = r2
        L_0x0012:
            java.lang.Object r1 = r7.result
            X.0AO r6 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r7.label
            r8 = 1
            if (r0 == 0) goto L_0x0030
            if (r0 != r8) goto L_0x00ef
            java.lang.Object r5 = r7.L$1
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r0 = r7.L$0
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$subgroupAction$3 r0 = (com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$subgroupAction$3) r0
            X.AnonymousClass0AN.A00(r1)
        L_0x0028:
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r0 = r0.A01
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel.A06(r0, r5)
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0030:
            X.AnonymousClass0AN.A00(r1)
            java.util.LinkedHashMap r0 = X.AnonymousClass3R6.A01(r12)
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            java.util.Iterator r10 = X.AnonymousClass000.A0y(r0)
        L_0x003f:
            boolean r1 = r10.hasNext()
            r0 = 10
            if (r1 == 0) goto L_0x0091
            java.util.Map$Entry r9 = X.AnonymousClass000.A11(r10)
            java.lang.Object r2 = r9.getKey()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            int r0 = X.AnonymousClass03U.A06(r2, r0)
            int r1 = X.C000300d.A02(r0)
            r0 = 16
            if (r1 >= r0) goto L_0x005f
            r1 = 16
        L_0x005f:
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>(r1)
            java.util.Iterator r4 = r2.iterator()
        L_0x0068:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0089
            java.lang.Object r2 = r4.next()
            java.lang.Object r0 = r9.getValue()
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = X.C007103b.A0L(r0)
            int r1 = X.AnonymousClass000.A0I(r0)
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r1)
            r5.put(r2, r0)
            goto L_0x0068
        L_0x0089:
            java.util.Set r0 = r5.entrySet()
            X.AnonymousClass03Y.A0B(r0, r3)
            goto L_0x003f
        L_0x0091:
            int r9 = r11.A00
            int r0 = X.AnonymousClass03U.A06(r3, r0)
            int r1 = X.C000300d.A02(r0)
            r0 = 16
            if (r1 >= r0) goto L_0x00a1
            r1 = 16
        L_0x00a1:
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>(r1)
            java.util.Iterator r4 = r3.iterator()
        L_0x00aa:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00d6
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r4)
            java.lang.Object r3 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            int r2 = X.AnonymousClass000.A0I(r0)
            if (r2 == 0) goto L_0x00d4
            if (r2 == r8) goto L_0x00d2
            r0 = 2
            r1 = r9
            if (r2 == r0) goto L_0x00c9
            r1 = 0
        L_0x00c9:
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r1)
            r5.put(r3, r0)
            goto L_0x00aa
        L_0x00d2:
            r1 = 5
            goto L_0x00c9
        L_0x00d4:
            r1 = 1
            goto L_0x00c9
        L_0x00d6:
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r0 = r11.A01
            r7.L$0 = r11
            r7.L$1 = r5
            r7.label = r8
            java.lang.Object r0 = com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel.A01(r0, r5, r7)
            if (r0 != r6) goto L_0x00e5
            return r6
        L_0x00e5:
            r0 = r11
            goto L_0x0028
        L_0x00e8:
            X.3z6 r7 = new X.3z6
            r7.<init>(r11, r13)
            goto L_0x0012
        L_0x00ef:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$subgroupAction$3.B6N(java.util.Map, X.09x):java.lang.Object");
    }
}
