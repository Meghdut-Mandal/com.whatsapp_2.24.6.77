package com.whatsapp.calling.avatar.data;

import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass5AJ;
import X.C005502l;
import X.C119325pd;
import X.C119335pe;
import X.C36341k9;

public final class PersonalizedAvatarRepository {
    public final AnonymousClass5AJ A00;
    public final C119335pe A01;
    public final AnonymousClass005 A02;
    public final C005502l A03;
    public final C005502l A04;
    public final C119325pd A05;

    public PersonalizedAvatarRepository(AnonymousClass5AJ r2, C119325pd r3, C119335pe r4, AnonymousClass005 r5, C005502l r6, C005502l r7) {
        AnonymousClass00C.A0D(r5, 1);
        C36341k9.A1F(r6, r7);
        this.A02 = r5;
        this.A00 = r2;
        this.A01 = r4;
        this.A05 = r3;
        this.A03 = r6;
        this.A04 = r7;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.whatsapp.calling.avatar.data.PersonalizedAvatarRepository r5, X.C159497jS r6, java.lang.String r7, X.C023509x r8) {
        /*
            boolean r0 = r8 instanceof X.AnonymousClass7A4
            if (r0 == 0) goto L_0x0022
            r4 = r8
            X.7A4 r4 = (X.AnonymousClass7A4) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0022
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r3 = r4.result
            X.0AO r2 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L_0x0031
            if (r0 != r1) goto L_0x002c
            java.lang.Object r7 = r4.L$0
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x0028
        L_0x0022:
            X.7A4 r4 = new X.7A4
            r4.<init>(r5, r8)
            goto L_0x0012
        L_0x0028:
            X.AnonymousClass0AN.A00(r3)     // Catch:{ CancellationException -> 0x0054, Exception -> 0x0044 }
            return r3
        L_0x002c:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x0031:
            X.AnonymousClass0AN.A00(r3)
            X.02h r0 = r4.getContext()     // Catch:{ CancellationException -> 0x0054, Exception -> 0x0044 }
            r4.L$0 = r7     // Catch:{ CancellationException -> 0x0054, Exception -> 0x0044 }
            r4.label = r1     // Catch:{ CancellationException -> 0x0054, Exception -> 0x0044 }
            java.lang.Object r3 = com.whatsapp.graphql.GraphqlRequest$postAwait$2.A01(r6, r4, r0)     // Catch:{ CancellationException -> 0x0054, Exception -> 0x0044 }
            if (r3 != r2) goto L_0x0043
            return r2
        L_0x0043:
            return r3
        L_0x0044:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r7)
            java.lang.String r0 = " Exception in postRequest: "
            X.C36321k7.A1J(r2, r0, r1)
            X.52D r0 = new X.52D
            r0.<init>(r2)
            throw r0
        L_0x0054:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r7)
            java.lang.String r0 = " Request canceled"
            X.C36321k7.A1a(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.avatar.data.PersonalizedAvatarRepository.A00(com.whatsapp.calling.avatar.data.PersonalizedAvatarRepository, X.7jS, java.lang.String, X.09x):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: X.5c8} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(X.C123815x8 r3, java.lang.String r4) {
        /*
            X.60z r2 = r3.A03
            X.AnonymousClass00C.A08(r2)
            X.66O r1 = r3.A04
            X.AnonymousClass00C.A08(r1)
            int r0 = r3.A00
            if (r0 == 0) goto L_0x0066
            r2 = 0
            java.lang.Object r1 = r1.A00(r2)
            boolean r0 = r1 instanceof X.C111345c8
            if (r0 == 0) goto L_0x001a
            r2 = r1
            X.5c8 r2 = (X.C111345c8) r2
        L_0x001a:
            boolean r0 = r2 instanceof X.AnonymousClass5HW
            if (r0 == 0) goto L_0x002e
            X.5HW r2 = (X.AnonymousClass5HW) r2
            java.lang.Object r2 = r2.A00
        L_0x0022:
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r4)
            java.lang.String r0 = " Error response: "
            X.C36321k7.A1J(r2, r0, r1)
            throw r2
        L_0x002e:
            boolean r0 = r2 instanceof X.AnonymousClass5HX
            if (r0 == 0) goto L_0x003c
            X.5HX r2 = (X.AnonymousClass5HX) r2
            java.util.List r0 = r2.A00
            X.52E r2 = new X.52E
            r2.<init>(r0)
            goto L_0x0022
        L_0x003c:
            boolean r0 = r2 instanceof X.AnonymousClass5HU
            if (r0 == 0) goto L_0x0047
            r0 = 0
            X.52F r2 = new X.52F
            r2.<init>(r0)
            goto L_0x0022
        L_0x0047:
            boolean r0 = r2 instanceof X.AnonymousClass5HV
            if (r0 == 0) goto L_0x0055
            X.5HV r2 = (X.AnonymousClass5HV) r2
            java.lang.Throwable r0 = r2.A00
            X.52D r2 = new X.52D
            r2.<init>(r0)
            goto L_0x0022
        L_0x0055:
            boolean r0 = r2 instanceof X.AnonymousClass5HY
            if (r0 == 0) goto L_0x0063
            X.5HY r2 = (X.AnonymousClass5HY) r2
            java.lang.Throwable r0 = r2.A00
            X.52D r2 = new X.52D
            r2.<init>(r0)
            goto L_0x0022
        L_0x0063:
            X.52H r2 = X.AnonymousClass52H.A00
            goto L_0x0022
        L_0x0066:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r4)
            java.lang.String r0 = " Success"
            X.C36321k7.A1a(r1, r0)
            java.lang.Object r0 = r2.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.avatar.data.PersonalizedAvatarRepository.A01(X.5x8, java.lang.String):java.lang.Object");
    }
}
