package com.whatsapp.suggestions;

import X.AnonymousClass00C;
import X.AnonymousClass11F;
import X.AnonymousClass141;
import X.AnonymousClass143;
import X.AnonymousClass16D;
import X.AnonymousClass1NG;
import X.AnonymousClass1NI;
import X.C004702c;
import X.C007103b;
import X.C20810yC;
import X.C27591Ow;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.Set;

public final class SuggestionsEngine {
    public int A00;
    public Set A01;
    public Set A02;
    public final AnonymousClass1NG A03;
    public final AnonymousClass1NI A04;
    public final C20810yC A05;
    public final AnonymousClass16D A06;
    public final C27591Ow A07;

    public SuggestionsEngine(AnonymousClass1NG r2, AnonymousClass1NI r3, AnonymousClass16D r4, C20810yC r5, C27591Ow r6) {
        AnonymousClass00C.A0D(r5, 1);
        AnonymousClass00C.A0D(r6, 2);
        AnonymousClass00C.A0D(r4, 4);
        AnonymousClass00C.A0D(r2, 5);
        this.A05 = r5;
        this.A07 = r6;
        this.A04 = r3;
        this.A06 = r4;
        this.A03 = r2;
        C004702c r0 = C004702c.A00;
        this.A01 = r0;
        this.A02 = r0;
    }

    private final boolean A00(AnonymousClass141 r4, Set set) {
        String str;
        Jid A062;
        Set set2 = this.A02;
        AnonymousClass11F r0 = r4.A0H;
        if (r0 != null) {
            str = r0.getRawString();
        } else {
            str = null;
        }
        if (C007103b.A0j(set2, str) || (A062 = r4.A06(UserJid.class)) == null || AnonymousClass143.A0I(r4.A0H) || AnonymousClass143.A0H(A062) || this.A01.contains(A062) || set.contains(r4)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x02a2  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x026f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.C159717jo r18, java.lang.String r19, java.util.Set r20, X.C023509x r21, int r22) {
        /*
            r17 = this;
            r5 = r21
            r4 = r20
            r12 = r18
            r2 = r22
            boolean r0 = r5 instanceof X.C82813zJ
            r6 = r17
            if (r0 == 0) goto L_0x0041
            r9 = r5
            X.3zJ r9 = (X.C82813zJ) r9
            int r3 = r9.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x0041
            int r3 = r3 - r1
            r9.label = r3
        L_0x001c:
            java.lang.Object r3 = r9.result
            X.0AO r8 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r9.label
            r11 = 1
            if (r0 == 0) goto L_0x004f
            if (r0 != r11) goto L_0x0047
            int r2 = r9.I$0
            java.lang.Object r10 = r9.L$5
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r5 = r9.L$4
            java.lang.Object r7 = r9.L$3
            java.util.AbstractCollection r7 = (java.util.AbstractCollection) r7
            java.lang.Object r12 = r9.L$2
            X.7jo r12 = (X.C159717jo) r12
            java.lang.Object r4 = r9.L$1
            java.util.Set r4 = (java.util.Set) r4
            java.lang.Object r6 = r9.L$0
            com.whatsapp.suggestions.SuggestionsEngine r6 = (com.whatsapp.suggestions.SuggestionsEngine) r6
            goto L_0x010c
        L_0x0041:
            X.3zJ r9 = new X.3zJ
            r9.<init>(r6, r5)
            goto L_0x001c
        L_0x0047:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x004f:
            X.AnonymousClass0AN.A00(r3)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            X.16D r10 = r6.A06
            r10.A0i(r7)
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x0072
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            X.011 r0 = new X.011
            r0.<init>(r2, r1)
            return r0
        L_0x0072:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.Iterator r13 = r7.iterator()
        L_0x007b:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0098
            java.lang.Object r5 = r13.next()
            X.141 r5 = (X.AnonymousClass141) r5
            X.3IL r0 = r5.A0F
            if (r0 != 0) goto L_0x0095
            r0 = 0
        L_0x008d:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.put(r0, r5)
            goto L_0x007b
        L_0x0095:
            long r0 = r0.A00
            goto L_0x008d
        L_0x0098:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            X.16p r0 = r10.A05
            r0.A0W(r1)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x00ab:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00c3
            java.lang.Object r0 = r1.next()
            java.lang.Object r0 = r3.get(r0)
            X.141 r0 = (X.AnonymousClass141) r0
            if (r0 == 0) goto L_0x00ab
            r5.add(r0)
            r0.A0l = r11
            goto L_0x00ab
        L_0x00c3:
            X.09w r10 = X.C023409w.A00
            com.whatsapp.infra.graphql.generated.suggestedcontacts.calls.XWA2GrowthSuggestedContactsInput r13 = new com.whatsapp.infra.graphql.generated.suggestedcontacts.calls.XWA2GrowthSuggestedContactsInput
            r13.<init>()
            java.lang.String r0 = "context"
            r1 = r19
            r13.A07(r0, r1)
            boolean r0 = r4.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00ec
            com.whatsapp.infra.graphql.generated.suggestedcontacts.calls.XWA2SuggestedContactsInputMetadata r3 = new com.whatsapp.infra.graphql.generated.suggestedcontacts.calls.XWA2SuggestedContactsInputMetadata
            r3.<init>()
            java.util.List r1 = X.C007103b.A0Y(r4)
            java.lang.String r0 = "exclude_jids"
            r3.A08(r0, r1)
            java.lang.String r0 = "metadata"
            r13.A05(r3, r0)
        L_0x00ec:
            X.1Ow r3 = r6.A07     // Catch:{ 1Ov -> 0x0112 }
            X.0yC r1 = r6.A05     // Catch:{ 1Ov -> 0x0112 }
            com.whatsapp.suggestions.networking.SuggestedContactsFetcher r0 = new com.whatsapp.suggestions.networking.SuggestedContactsFetcher     // Catch:{ 1Ov -> 0x0112 }
            r0.<init>(r1, r3)     // Catch:{ 1Ov -> 0x0112 }
            r9.L$0 = r6     // Catch:{ 1Ov -> 0x0112 }
            r9.L$1 = r4     // Catch:{ 1Ov -> 0x0112 }
            r9.L$2 = r12     // Catch:{ 1Ov -> 0x0112 }
            r9.L$3 = r7     // Catch:{ 1Ov -> 0x0112 }
            r9.L$4 = r5     // Catch:{ 1Ov -> 0x0112 }
            r9.L$5 = r10     // Catch:{ 1Ov -> 0x0112 }
            r9.I$0 = r2     // Catch:{ 1Ov -> 0x0112 }
            r9.label = r11     // Catch:{ 1Ov -> 0x0112 }
            java.lang.Object r3 = r0.A00(r13, r9)     // Catch:{ 1Ov -> 0x0112 }
            if (r3 != r8) goto L_0x010f
            return r8
        L_0x010c:
            X.AnonymousClass0AN.A00(r3)     // Catch:{ 1Ov -> 0x0112 }
        L_0x010f:
            java.util.List r3 = (java.util.List) r3     // Catch:{ 1Ov -> 0x0112 }
            goto L_0x0113
        L_0x0112:
            r3 = r10
        L_0x0113:
            X.5Rh r1 = X.C107895Rh.A02
            X.011 r0 = new X.011
            r0.<init>(r1, r5)
            java.util.List r8 = java.util.Collections.singletonList(r0)
            X.AnonymousClass00C.A08(r8)
            X.AnonymousClass00C.A0D(r3, r11)
            r0 = 2
            X.AnonymousClass00C.A0D(r12, r0)
            r0 = 3
            X.AnonymousClass00C.A0D(r7, r0)
            r0 = 5
            X.AnonymousClass00C.A0D(r4, r0)
            X.1NG r1 = r6.A03
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.A0M
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x0170
            java.util.Set r0 = r1.A09()
        L_0x013e:
            r6.A01 = r0
            r6.A02 = r4
            r6.A00 = r2
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>()
            java.util.Iterator r2 = r7.iterator()
        L_0x0152:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0177
            java.lang.Object r1 = r2.next()
            X.141 r1 = (X.AnonymousClass141) r1
            if (r1 == 0) goto L_0x0152
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r0 = r1.A06(r0)
            if (r0 == 0) goto L_0x0152
            java.lang.String r0 = r0.getRawString()
            r10.put(r0, r1)
            goto L_0x0152
        L_0x0170:
            X.1NI r0 = r6.A04
            java.util.HashSet r0 = r0.A00()
            goto L_0x013e
        L_0x0177:
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x0180:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x01c9
            java.lang.Object r1 = r8.next()
            X.011 r1 = (X.AnonymousClass011) r1
            java.lang.Object r0 = r1.first
            X.5Rh r0 = (X.C107895Rh) r0
            java.lang.Object r1 = r1.second
            java.util.List r1 = (java.util.List) r1
            float r4 = r12.B9j(r0)
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0180
            java.util.Iterator r2 = r1.iterator()
        L_0x01a1:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0180
            java.lang.Object r1 = r2.next()
            java.lang.Object r0 = r9.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x01c4
            float r0 = r0.floatValue()
            float r0 = r0 + r4
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
        L_0x01bc:
            r9.put(r1, r0)
            r0 = 981668463(0x3a83126f, float:0.001)
            float r4 = r4 - r0
            goto L_0x01a1
        L_0x01c4:
            java.lang.Float r0 = java.lang.Float.valueOf(r4)
            goto L_0x01bc
        L_0x01c9:
            java.util.Iterator r16 = r3.iterator()
        L_0x01cd:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0248
            java.lang.Object r1 = r16.next()
            X.6Af r1 = (X.C127936Af) r1
            com.whatsapp.infra.graphql.generated.suggestedcontacts.enums.GraphQLXWA2SuggestedContactsSignalType r8 = r1.A00
            float r15 = r12.BHN(r8)
            r0 = 0
            int r0 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x01cd
            java.util.List r4 = r1.A01
            r3 = 0
            int r2 = r4.size()
        L_0x01eb:
            if (r3 >= r2) goto L_0x01cd
            java.lang.Object r13 = r4.get(r3)
            X.6Ae r13 = (X.C127926Ae) r13
            java.lang.String r0 = r13.A01
            java.lang.Object r1 = r10.get(r0)
            X.141 r1 = (X.AnonymousClass141) r1
            if (r1 == 0) goto L_0x0240
            java.lang.Object r0 = r9.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0243
            float r0 = r0.floatValue()
            float r0 = r0 + r15
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
        L_0x020e:
            r9.put(r1, r0)
            int r0 = r4.size()
            int r0 = r0 - r11
            if (r3 >= r0) goto L_0x0230
            java.lang.Object r0 = r4.get(r3)
            X.6Ae r0 = (X.C127926Ae) r0
            int r14 = r0.A00
            int r0 = r3 + 1
            java.lang.Object r0 = r4.get(r0)
            X.6Ae r0 = (X.C127926Ae) r0
            int r0 = r0.A00
            if (r14 == r0) goto L_0x0230
            r0 = 981668463(0x3a83126f, float:0.001)
            float r15 = r15 - r0
        L_0x0230:
            com.whatsapp.infra.graphql.generated.suggestedcontacts.enums.GraphQLXWA2SuggestedContactsSignalType r0 = com.whatsapp.infra.graphql.generated.suggestedcontacts.enums.GraphQLXWA2SuggestedContactsSignalType.PRESENCE
            if (r8 != r0) goto L_0x023a
            int r0 = r13.A00
            if (r0 != 0) goto L_0x023a
            r1.A0o = r11
        L_0x023a:
            com.whatsapp.infra.graphql.generated.suggestedcontacts.enums.GraphQLXWA2SuggestedContactsSignalType r0 = com.whatsapp.infra.graphql.generated.suggestedcontacts.enums.GraphQLXWA2SuggestedContactsSignalType.PROFILE_PICTURE
            if (r8 != r0) goto L_0x0240
            r1.A0g = r11
        L_0x0240:
            int r3 = r3 + 1
            goto L_0x01eb
        L_0x0243:
            java.lang.Float r0 = java.lang.Float.valueOf(r15)
            goto L_0x020e
        L_0x0248:
            java.util.Set r1 = r9.entrySet()
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r1)
            X.4NW r2 = X.AnonymousClass4NW.A00
            r1 = 2
            X.4YY r0 = new X.4YY
            r0.<init>(r2, r1)
            X.AnonymousClass03X.A08(r3, r0)
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0269:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0298
            java.lang.Object r2 = r3.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            int r1 = r5.size()
            int r0 = r6.A00
            if (r1 >= r0) goto L_0x0298
            java.lang.Object r0 = r2.getKey()
            X.141 r0 = (X.AnonymousClass141) r0
            boolean r0 = r6.A00(r0, r4)
            if (r0 == 0) goto L_0x0269
            java.lang.Object r0 = r2.getKey()
            r5.add(r0)
            java.lang.Object r0 = r2.getKey()
            r4.add(r0)
            goto L_0x0269
        L_0x0298:
            java.util.Iterator r3 = r7.iterator()
        L_0x029c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x02bc
            java.lang.Object r2 = r3.next()
            X.141 r2 = (X.AnonymousClass141) r2
            if (r2 == 0) goto L_0x029c
            int r1 = r5.size()
            int r0 = r6.A00
            if (r1 >= r0) goto L_0x02bc
            boolean r0 = r6.A00(r2, r4)
            if (r0 == 0) goto L_0x029c
            r5.add(r2)
            goto L_0x029c
        L_0x02bc:
            X.011 r0 = new X.011
            r0.<init>(r5, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.suggestions.SuggestionsEngine.A01(X.7jo, java.lang.String, java.util.Set, X.09x, int):java.lang.Object");
    }
}
