package com.whatsapp.community.membersuggestedgroups;

import X.AnonymousClass00C;
import X.AnonymousClass040;
import X.AnonymousClass05E;
import X.AnonymousClass05K;
import X.AnonymousClass05L;
import X.AnonymousClass05N;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AO;
import X.AnonymousClass147;
import X.AnonymousClass16D;
import X.AnonymousClass17Y;
import X.AnonymousClass19A;
import X.AnonymousClass1PJ;
import X.AnonymousClass1PL;
import X.AnonymousClass1PM;
import X.AnonymousClass1PQ;
import X.AnonymousClass3KN;
import X.C000400e;
import X.C007103b;
import X.C008903u;
import X.C023109s;
import X.C023509x;
import X.C18800tq;
import X.C19760wT;
import X.C220112n;
import X.C26801Lo;
import X.C35651j2;
import com.whatsapp.community.iq.GetSuggestedGroupsProtocolHelper;
import com.whatsapp.community.iq.SubgroupSuggestionActionProtocolHelper;
import com.whatsapp.community.mex.GetSuggestedGroupsGraphQlHandler;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public final class MemberSuggestedGroupsManager {
    public final AnonymousClass17Y A00;
    public final AnonymousClass1PM A01;
    public final GetSuggestedGroupsProtocolHelper A02;
    public final SubgroupSuggestionActionProtocolHelper A03;
    public final AnonymousClass1PQ A04 = new AnonymousClass1PQ();
    public final AnonymousClass1PL A05;
    public final GetSuggestedGroupsGraphQlHandler A06;
    public final AnonymousClass16D A07;
    public final C26801Lo A08;
    public final AnonymousClass040 A09;
    public final AnonymousClass05L A0A;
    public final AnonymousClass05K A0B;

    public MemberSuggestedGroupsManager(AnonymousClass1PJ r6, AnonymousClass17Y r7, AnonymousClass1PL r8, GetSuggestedGroupsGraphQlHandler getSuggestedGroupsGraphQlHandler, AnonymousClass16D r10, C26801Lo r11, AnonymousClass19A r12, AnonymousClass040 r13) {
        AnonymousClass00C.A0D(r12, 1);
        AnonymousClass00C.A0D(r6, 2);
        AnonymousClass00C.A0D(r7, 4);
        AnonymousClass00C.A0D(r8, 5);
        AnonymousClass00C.A0D(r11, 6);
        AnonymousClass00C.A0D(r10, 7);
        AnonymousClass00C.A0D(r13, 8);
        C18800tq r2 = r6.A00.A00;
        AnonymousClass1PM r22 = new AnonymousClass1PM((C19760wT) r2.A70.get(), (C220112n) r2.A93.get(), "MemberSuggestedGroupsManager", 50);
        GetSuggestedGroupsProtocolHelper getSuggestedGroupsProtocolHelper = new GetSuggestedGroupsProtocolHelper(r12);
        SubgroupSuggestionActionProtocolHelper subgroupSuggestionActionProtocolHelper = new SubgroupSuggestionActionProtocolHelper(r12);
        this.A01 = r22;
        this.A02 = getSuggestedGroupsProtocolHelper;
        this.A06 = getSuggestedGroupsGraphQlHandler;
        this.A03 = subgroupSuggestionActionProtocolHelper;
        this.A00 = r7;
        this.A05 = r8;
        this.A08 = r11;
        this.A07 = r10;
        this.A09 = r13;
        AnonymousClass05N A002 = AnonymousClass05E.A00(C000400e.A0D());
        this.A0A = A002;
        this.A0B = A002;
    }

    public final void A04(AnonymousClass3KN r4, AnonymousClass147 r5) {
        AnonymousClass00C.A0D(r5, 0);
        this.A07.A0d(r5, false);
        List singletonList = Collections.singletonList(r4);
        AnonymousClass00C.A08(singletonList);
        this.A05.A02(singletonList);
        if (A03(r5).add(r4)) {
            this.A00.A0H(new C35651j2(this, r5, 24));
        }
    }

    public final void A05(AnonymousClass147 r10, AnonymousClass147 r11, boolean z) {
        AnonymousClass00C.A0D(r10, 0);
        AnonymousClass00C.A0D(r11, 1);
        AnonymousClass040 r2 = this.A09;
        MemberSuggestedGroupsManager$fetchSuggestedGroups$1 memberSuggestedGroupsManager$fetchSuggestedGroups$1 = new MemberSuggestedGroupsManager$fetchSuggestedGroups$1(this, r10, r11, (C023509x) null, z);
        AnonymousClass0A2.A02(C023109s.A00, C008903u.A00, memberSuggestedGroupsManager$fetchSuggestedGroups$1, r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0081, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        X.C05600Qi.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0085, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0088, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        X.C05600Qi.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(X.AnonymousClass147 r10, java.lang.Iterable r11) {
        /*
            r9 = this;
            r4 = 0
            X.AnonymousClass00C.A0D(r10, r4)
            r0 = 1
            X.AnonymousClass00C.A0D(r11, r0)
            java.util.SortedSet r0 = r9.A03(r10)
            java.util.Set r3 = X.C007103b.A0f(r0)
            java.util.Set r2 = X.C007103b.A0f(r11)
            java.util.Set r1 = X.C13640kC.A05(r2, r3)
            java.util.Set r0 = X.C13640kC.A05(r3, r2)
            java.util.LinkedHashSet r0 = X.C13640kC.A04(r0, r1)
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x002d
            X.16D r0 = r9.A07
            r0.A0d(r10, r4)
        L_0x002d:
            X.1PL r8 = r9.A05
            X.16r r0 = r8.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x008d }
            X.1M0 r6 = r0.A04()     // Catch:{ SQLiteDatabaseCorruptException -> 0x008d }
            X.71s r7 = r6.B1k()     // Catch:{ all -> 0x0086 }
            java.util.List r1 = r8.A00(r10)     // Catch:{ all -> 0x007f }
            java.util.Set r0 = X.C007103b.A0f(r11)     // Catch:{ all -> 0x007f }
            java.util.Set r1 = X.C007103b.A0h(r1, r0)     // Catch:{ all -> 0x007f }
            r0 = 10
            int r0 = X.AnonymousClass03U.A06(r1, r0)     // Catch:{ all -> 0x007f }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x007f }
            r5.<init>(r0)     // Catch:{ all -> 0x007f }
            java.util.Iterator r4 = r1.iterator()     // Catch:{ all -> 0x007f }
        L_0x0054:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x007f }
            if (r0 == 0) goto L_0x006f
            java.lang.Object r0 = r4.next()     // Catch:{ all -> 0x007f }
            X.3KN r0 = (X.AnonymousClass3KN) r0     // Catch:{ all -> 0x007f }
            X.147 r3 = r0.A03     // Catch:{ all -> 0x007f }
            X.147 r2 = r0.A02     // Catch:{ all -> 0x007f }
            com.whatsapp.jid.UserJid r1 = r0.A04     // Catch:{ all -> 0x007f }
            X.3Iv r0 = new X.3Iv     // Catch:{ all -> 0x007f }
            r0.<init>(r3, r2, r1)     // Catch:{ all -> 0x007f }
            r5.add(r0)     // Catch:{ all -> 0x007f }
            goto L_0x0054
        L_0x006f:
            r8.A01(r10, r5)     // Catch:{ all -> 0x007f }
            r8.A02(r11)     // Catch:{ all -> 0x007f }
            r7.A00()     // Catch:{ all -> 0x007f }
            r7.close()     // Catch:{ all -> 0x0086 }
            r6.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x008d }
            goto L_0x0091
        L_0x007f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0081 }
        L_0x0081:
            r0 = move-exception
            X.C05600Qi.A00(r7, r1)     // Catch:{ all -> 0x0086 }
            throw r0     // Catch:{ all -> 0x0086 }
        L_0x0086:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0088 }
        L_0x0088:
            r0 = move-exception
            X.C05600Qi.A00(r6, r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x008d }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x008d }
        L_0x008d:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x0091:
            X.1PM r2 = r9.A01
            X.1PQ r1 = r9.A04
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>(r1)
            X.C007103b.A0i(r11, r0)
            r2.A0D(r10, r0)
            X.17Y r2 = r9.A00
            r1 = 25
            X.1j2 r0 = new X.1j2
            r0.<init>(r9, r10, r1)
            r2.A0H(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager.A06(X.147, java.lang.Iterable):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0075, code lost:
        if (r6 == 404) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0094, code lost:
        if (r6 >= 600) goto L_0x0096;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager r8, X.AnonymousClass147 r9, X.AnonymousClass147 r10, X.C023509x r11) {
        /*
            boolean r0 = r11 instanceof X.C82693z7
            if (r0 == 0) goto L_0x00b5
            r4 = r11
            X.3z7 r4 = (X.C82693z7) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00b5
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r6 = r4.result
            X.0AO r5 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r4.label
            r3 = 3
            r1 = 2
            r2 = 0
            r7 = 1
            if (r0 == 0) goto L_0x003f
            if (r0 == r7) goto L_0x0036
            if (r0 == r1) goto L_0x002a
            if (r0 != r3) goto L_0x00bc
            X.AnonymousClass0AN.A00(r6)
        L_0x0027:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x002a:
            java.lang.Object r9 = r4.L$1
            X.147 r9 = (X.AnonymousClass147) r9
            java.lang.Object r8 = r4.L$0
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager r8 = (com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager) r8
            X.AnonymousClass0AN.A00(r6)     // Catch:{ 1PI -> 0x0064 }
            goto L_0x0027
        L_0x0036:
            java.lang.Object r9 = r4.L$1
            X.147 r9 = (X.AnonymousClass147) r9
            java.lang.Object r8 = r4.L$0
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager r8 = (com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager) r8
            goto L_0x0051
        L_0x003f:
            X.AnonymousClass0AN.A00(r6)
            com.whatsapp.community.mex.GetSuggestedGroupsGraphQlHandler r0 = r8.A06     // Catch:{ 1PI -> 0x0064 }
            r4.L$0 = r8     // Catch:{ 1PI -> 0x0064 }
            r4.L$1 = r9     // Catch:{ 1PI -> 0x0064 }
            r4.label = r7     // Catch:{ 1PI -> 0x0064 }
            java.lang.Object r6 = r0.A00(r9, r10, r4)     // Catch:{ 1PI -> 0x0064 }
            if (r6 != r5) goto L_0x0054
            goto L_0x00c4
        L_0x0051:
            X.AnonymousClass0AN.A00(r6)     // Catch:{ 1PI -> 0x0064 }
        L_0x0054:
            java.lang.Iterable r6 = (java.lang.Iterable) r6     // Catch:{ 1PI -> 0x0064 }
            r8.A06(r9, r6)     // Catch:{ 1PI -> 0x0064 }
            r4.L$0 = r8     // Catch:{ 1PI -> 0x0064 }
            r4.L$1 = r9     // Catch:{ 1PI -> 0x0064 }
            r4.label = r1     // Catch:{ 1PI -> 0x0064 }
            java.lang.Object r0 = A01(r8, r9, r4, r2)     // Catch:{ 1PI -> 0x0064 }
            goto L_0x008a
        L_0x0064:
            r0 = move-exception
            int r6 = r0.errorCode
            r0 = -1
            if (r6 == r0) goto L_0x0077
            r0 = 400(0x190, float:5.6E-43)
            if (r6 == r0) goto L_0x0077
            r0 = 403(0x193, float:5.65E-43)
            if (r6 == r0) goto L_0x0077
            r1 = 404(0x194, float:5.66E-43)
            r0 = 0
            if (r6 != r1) goto L_0x0078
        L_0x0077:
            r0 = 1
        L_0x0078:
            if (r0 == 0) goto L_0x008d
            X.09w r0 = X.C023409w.A00
            r8.A06(r9, r0)
        L_0x007f:
            r0 = 0
            r4.L$0 = r0
            r4.L$1 = r0
            r4.label = r3
            java.lang.Object r0 = A01(r8, r9, r4, r2)
        L_0x008a:
            if (r0 != r5) goto L_0x0027
            return r5
        L_0x008d:
            r0 = 500(0x1f4, float:7.0E-43)
            if (r0 > r6) goto L_0x0096
            r1 = 600(0x258, float:8.41E-43)
            r0 = 1
            if (r6 < r1) goto L_0x0097
        L_0x0096:
            r0 = 0
        L_0x0097:
            if (r0 != 0) goto L_0x009e
            r0 = 429(0x1ad, float:6.01E-43)
            if (r6 == r0) goto L_0x009e
            r7 = 0
        L_0x009e:
            if (r7 != 0) goto L_0x007f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MemberSuggestedGroupsManager/fetchSuggestedGroups/unknown error: "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x007f
        L_0x00b5:
            X.3z7 r4 = new X.3z7
            r4.<init>(r8, r11)
            goto L_0x0012
        L_0x00bc:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00c4:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager.A00(com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager, X.147, X.147, X.09x):java.lang.Object");
    }

    public static final Object A01(MemberSuggestedGroupsManager memberSuggestedGroupsManager, AnonymousClass147 r3, C023509x r4, boolean z) {
        AnonymousClass05L r2 = memberSuggestedGroupsManager.A0A;
        LinkedHashMap A062 = C000400e.A06((Map) r2.getValue());
        A062.put(r3, Boolean.valueOf(z));
        Object B6N = r2.B6N(C000400e.A0B(A062), r4);
        if (B6N != AnonymousClass0AO.COROUTINE_SUSPENDED) {
            return AnonymousClass0AJ.A00;
        }
        return B6N;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008a, code lost:
        if (r0 != r3) goto L_0x00a2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.AnonymousClass147 r8, X.AnonymousClass147 r9, X.C023509x r10, boolean r11) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof X.C82803zI
            if (r0 == 0) goto L_0x002b
            r4 = r10
            X.3zI r4 = (X.C82803zI) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002b
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r1 = r4.result
            X.0AO r3 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r4.label
            r6 = 3
            r5 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0031
            if (r0 == r2) goto L_0x006a
            if (r0 == r5) goto L_0x009f
            if (r0 == r6) goto L_0x009f
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x002b:
            X.3zI r4 = new X.3zI
            r4.<init>(r7, r10)
            goto L_0x0012
        L_0x0031:
            X.AnonymousClass0AN.A00(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MemberSuggestedGroupsManager/fetch/parent: "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = ", hint: "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = ", mex: "
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r4.L$0 = r7
            r4.L$1 = r8
            r4.L$2 = r9
            r4.Z$0 = r11
            r4.label = r2
            java.lang.Object r0 = A01(r7, r8, r4, r2)
            if (r0 == r3) goto L_0x008c
            r2 = r7
            goto L_0x007b
        L_0x006a:
            boolean r11 = r4.Z$0
            java.lang.Object r9 = r4.L$2
            X.147 r9 = (X.AnonymousClass147) r9
            java.lang.Object r8 = r4.L$1
            X.147 r8 = (X.AnonymousClass147) r8
            java.lang.Object r2 = r4.L$0
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager r2 = (com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager) r2
            X.AnonymousClass0AN.A00(r1)
        L_0x007b:
            r0 = 0
            r4.L$0 = r0
            r4.L$1 = r0
            r4.L$2 = r0
            if (r11 == 0) goto L_0x008d
            r4.label = r5
            java.lang.Object r0 = A00(r2, r8, r9, r4)
        L_0x008a:
            if (r0 != r3) goto L_0x00a2
        L_0x008c:
            return r3
        L_0x008d:
            r4.label = r6
            com.whatsapp.community.iq.GetSuggestedGroupsProtocolHelper r1 = r2.A02
            X.9Qb r0 = new X.9Qb
            r0.<init>(r2, r8)
            java.lang.Object r0 = r1.A00(r0, r8, r9, r4)
            if (r0 == r3) goto L_0x008c
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            goto L_0x008a
        L_0x009f:
            X.AnonymousClass0AN.A00(r1)
        L_0x00a2:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager.A02(X.147, X.147, X.09x, boolean):java.lang.Object");
    }

    public final SortedSet A03(AnonymousClass147 r5) {
        AnonymousClass1PM r3 = this.A01;
        SortedSet sortedSet = (SortedSet) r3.A09(r5);
        if (sortedSet != null) {
            return sortedSet;
        }
        List A002 = this.A05.A00(r5);
        TreeSet treeSet = new TreeSet(this.A04);
        C007103b.A0i(A002, treeSet);
        r3.A0D(r5, treeSet);
        return treeSet;
    }
}
