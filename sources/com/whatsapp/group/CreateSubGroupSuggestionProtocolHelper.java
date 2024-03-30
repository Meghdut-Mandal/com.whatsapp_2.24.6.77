package com.whatsapp.group;

import X.AnonymousClass00C;
import X.AnonymousClass19A;

public final class CreateSubGroupSuggestionProtocolHelper {
    public final AnonymousClass19A A00;

    public CreateSubGroupSuggestionProtocolHelper(AnonymousClass19A r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008b, code lost:
        if (r5.length() == 0) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0130, code lost:
        if (r21 != null) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0135, code lost:
        if (r21 != null) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0139, code lost:
        if (r21 != null) goto L_0x00d3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass3QC r21, X.AnonymousClass147 r22, java.lang.String r23, java.lang.String r24, X.C023509x r25) {
        /*
            r20 = this;
            r7 = r25
            r2 = r22
            r1 = r23
            r5 = r24
            boolean r0 = r7 instanceof X.C21943AdM
            r10 = r20
            if (r0 == 0) goto L_0x0145
            r6 = r7
            X.AdM r6 = (X.C21943AdM) r6
            int r4 = r6.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r3
            if (r0 == 0) goto L_0x0145
            int r4 = r4 - r3
            r6.label = r4
        L_0x001c:
            java.lang.Object r7 = r6.result
            X.0AO r4 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r6.label
            r9 = 1
            if (r0 == 0) goto L_0x0079
            if (r0 != r9) goto L_0x015c
            java.lang.Object r3 = r6.L$4
            X.8vH r3 = (X.C186018vH) r3
            java.lang.Object r5 = r6.L$3
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r1 = r6.L$2
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r6.L$1
            X.147 r2 = (X.AnonymousClass147) r2
            X.AnonymousClass0AN.A00(r7)
        L_0x003a:
            X.96o r7 = (X.C1900196o) r7
            boolean r0 = r7 instanceof X.C177778eM
            if (r0 == 0) goto L_0x014c
            X.8eM r7 = (X.C177778eM) r7
            X.9nx r0 = r7.A00
            X.8vX r6 = new X.8vX
            r6.<init>(r0, r3)
            X.8rj r0 = r6.A02
            r10 = 0
            if (r0 == 0) goto L_0x0077
            java.lang.String r0 = r0.A00
            if (r0 == 0) goto L_0x0077
        L_0x0052:
            X.147 r4 = r6.A00
            X.AnonymousClass00C.A08(r4)
            com.whatsapp.jid.UserJid r3 = r6.A01
            X.AnonymousClass00C.A08(r3)
            java.lang.Long r0 = r6.A03
            X.AnonymousClass00C.A08(r0)
            long r11 = r0.longValue()
            r13 = 0
            r15 = 0
            X.3KN r5 = new X.3KN
            r9 = r1
            r7 = r4
            r8 = r3
            r6 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r13, r15)
            X.2VC r0 = new X.2VC
            r0.<init>(r5)
            return r0
        L_0x0077:
            r10 = r5
            goto L_0x0052
        L_0x0079:
            X.AnonymousClass0AN.A00(r7)
            X.19A r0 = r10.A00
            r19 = r0
            java.lang.String r7 = r19.A09()
            if (r24 == 0) goto L_0x008d
            int r3 = r5.length()
            r0 = 0
            if (r3 != 0) goto L_0x008e
        L_0x008d:
            r0 = 1
        L_0x008e:
            r13 = 0
            if (r0 == 0) goto L_0x013c
            r12 = r13
        L_0x0092:
            r3 = r21
            if (r21 == 0) goto L_0x012f
            java.lang.Boolean r0 = r3.A02
            if (r0 == 0) goto L_0x012f
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x012c
            r0 = 21
            X.8uZ r11 = new X.8uZ
            r11.<init>((int) r0)
        L_0x00a7:
            java.lang.Boolean r0 = r3.A01
            if (r0 == 0) goto L_0x0134
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x012a
            r0 = 23
            X.8uZ r8 = new X.8uZ
            r8.<init>((int) r0)
        L_0x00b8:
            java.lang.Boolean r0 = r3.A03
            if (r0 == 0) goto L_0x0138
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0123
            X.8uk r14 = new X.8uk
            r14.<init>(r9)
        L_0x00c7:
            X.8ug r15 = new X.8ug
            r15.<init>((X.C16430pE) r14)
            r0 = 24
            X.8uZ r14 = new X.8uZ
            r14.<init>((X.C185718ug) r15, (int) r0)
        L_0x00d3:
            java.lang.Boolean r0 = r3.A00
            if (r0 == 0) goto L_0x00e7
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x011c
            X.8uj r3 = new X.8uj
            r3.<init>(r9)
        L_0x00e2:
            X.8ug r13 = new X.8ug
            r13.<init>((X.C16410pC) r3)
        L_0x00e7:
            X.8uh r0 = new X.8uh
            r18 = r1
            r15 = r8
            r16 = r11
            r17 = r14
            r14 = r12
            r12 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18)
            X.8vH r3 = new X.8vH
            r3.<init>((X.AnonymousClass147) r2, (X.C16390pA) r0, (java.lang.String) r7)
            X.9nx r0 = r3.A00
            X.AnonymousClass00C.A08(r0)
            r6.L$0 = r10
            r6.L$1 = r2
            r6.L$2 = r1
            r6.L$3 = r5
            r6.L$4 = r3
            r6.label = r9
            r11 = 391(0x187, float:5.48E-43)
            r12 = 32000(0x7d00, double:1.581E-319)
            r14 = 0
            r8 = r0
            r9 = r7
            r10 = r6
            r7 = r19
            java.lang.Object r7 = r7.A08(r8, r9, r10, r11, r12, r14)
            if (r7 != r4) goto L_0x003a
            return r4
        L_0x011c:
            r0 = 0
            X.8uj r3 = new X.8uj
            r3.<init>(r0)
            goto L_0x00e2
        L_0x0123:
            r0 = 0
            X.8uk r14 = new X.8uk
            r14.<init>(r0)
            goto L_0x00c7
        L_0x012a:
            r8 = r13
            goto L_0x00b8
        L_0x012c:
            r11 = r13
            goto L_0x00a7
        L_0x012f:
            r11 = r13
            if (r21 == 0) goto L_0x0134
            goto L_0x00a7
        L_0x0134:
            r8 = r13
            if (r21 == 0) goto L_0x0138
            goto L_0x00b8
        L_0x0138:
            r14 = r13
            if (r21 == 0) goto L_0x00e7
            goto L_0x00d3
        L_0x013c:
            r0 = 22
            X.8uZ r12 = new X.8uZ
            r12.<init>((java.lang.String) r5, (int) r0)
            goto L_0x0092
        L_0x0145:
            X.AdM r6 = new X.AdM
            r6.<init>(r10, r7)
            goto L_0x001c
        L_0x014c:
            boolean r0 = r7 instanceof X.C177768eL
            if (r0 != 0) goto L_0x0159
            boolean r0 = r7 instanceof X.C177788eN
            if (r0 != 0) goto L_0x0159
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        L_0x0159:
            X.2VD r0 = X.AnonymousClass2VD.A00
            return r0
        L_0x015c:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.group.CreateSubGroupSuggestionProtocolHelper.A00(X.3QC, X.147, java.lang.String, java.lang.String, X.09x):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.AnonymousClass147 r15, java.util.List r16, X.C023509x r17) {
        /*
            r14 = this;
            r3 = r17
            boolean r0 = r3 instanceof X.C21936AdF
            if (r0 == 0) goto L_0x00b4
            r9 = r3
            X.AdF r9 = (X.C21936AdF) r9
            int r2 = r9.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00b4
            int r2 = r2 - r1
            r9.label = r2
        L_0x0014:
            java.lang.Object r2 = r9.result
            X.0AO r3 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r9.label
            r5 = 1
            if (r0 == 0) goto L_0x006d
            if (r0 != r5) goto L_0x00d1
            java.lang.Object r1 = r9.L$1
            X.33b r1 = (X.C592133b) r1
            X.AnonymousClass0AN.A00(r2)
        L_0x0026:
            X.96o r2 = (X.C1900196o) r2
            boolean r0 = r2 instanceof X.C177778eM
            if (r0 == 0) goto L_0x00c1
            X.8eM r2 = (X.C177778eM) r2
            X.9nx r3 = r2.A00
            X.9nx r2 = X.C90514aH.A0e(r3, r1)
            r1 = 44
            X.B9u r0 = new X.B9u
            r0.<init>(r2, r1)
            X.C203539oF.A0C(r3, r0)
            java.lang.String r1 = "sub_group_suggestion"
            java.lang.String r0 = "group"
            java.lang.String[] r5 = new java.lang.String[]{r1, r0}
            X.AM2 r4 = X.AM2.A00
            r6 = 1
            r8 = 1000(0x3e8, double:4.94E-321)
            java.util.ArrayList r0 = X.C203539oF.A09(r3, r4, r5, r6, r8)
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            java.util.Iterator r2 = r0.iterator()
        L_0x0058:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00bb
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.8t3 r0 = (X.C184818t3) r0
            java.lang.Object r0 = r0.A01
            if (r0 == 0) goto L_0x0058
            r3.add(r1)
            goto L_0x0058
        L_0x006d:
            X.AnonymousClass0AN.A00(r2)
            X.19A r6 = r14.A00
            java.lang.String r8 = r6.A09()
            java.util.ArrayList r4 = X.C36321k7.A0J(r16)
            java.util.Iterator r2 = r16.iterator()
        L_0x007e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0093
            java.lang.Object r1 = r2.next()
            X.147 r1 = (X.AnonymousClass147) r1
            X.8uZ r0 = new X.8uZ
            r0.<init>((X.AnonymousClass147) r1)
            r4.add(r0)
            goto L_0x007e
        L_0x0093:
            r13 = 0
            X.8uh r0 = new X.8uh
            r0.<init>(r4)
            X.8vH r1 = new X.8vH
            r1.<init>((X.AnonymousClass147) r15, (X.C16390pA) r0, (java.lang.String) r8)
            X.9nx r7 = r1.A00
            X.AnonymousClass00C.A08(r7)
            r9.L$0 = r14
            r9.L$1 = r1
            r9.label = r5
            r10 = 391(0x187, float:5.48E-43)
            r11 = 32000(0x7d00, double:1.581E-319)
            java.lang.Object r2 = r6.A08(r7, r8, r9, r10, r11, r13)
            if (r2 != r3) goto L_0x0026
            return r3
        L_0x00b4:
            X.AdF r9 = new X.AdF
            r9.<init>(r14, r3)
            goto L_0x0014
        L_0x00bb:
            X.2VA r0 = new X.2VA
            r0.<init>(r3)
            return r0
        L_0x00c1:
            boolean r0 = r2 instanceof X.C177768eL
            if (r0 != 0) goto L_0x00ce
            boolean r0 = r2 instanceof X.C177788eN
            if (r0 != 0) goto L_0x00ce
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        L_0x00ce:
            X.2VB r0 = X.AnonymousClass2VB.A00
            return r0
        L_0x00d1:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.group.CreateSubGroupSuggestionProtocolHelper.A01(X.147, java.util.List, X.09x):java.lang.Object");
    }
}
