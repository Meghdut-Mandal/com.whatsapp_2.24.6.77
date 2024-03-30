package com.whatsapp.status.playback.avatar;

import X.AnonymousClass00C;
import X.AnonymousClass6SF;
import X.C005502l;
import X.C23871Ae;
import X.C36321k7;
import X.C36341k9;
import X.C39581sm;
import X.C47482eq;
import java.io.File;
import java.util.Arrays;
import java.util.List;

public final class AvatarReactionRepository {
    public static final List A07;
    public static final List A08;
    public static final List A09;
    public File A00;
    public List A01 = A09;
    public final C39581sm A02;
    public final AnonymousClass6SF A03;
    public final C005502l A04;
    public final C005502l A05;
    public final C23871Ae A06;

    static {
        C47482eq[] r2 = new C47482eq[6];
        C47482eq r1 = C47482eq.A00;
        r2[0] = r1;
        r2[1] = r1;
        r2[2] = r1;
        r2[3] = r1;
        r2[4] = r1;
        A09 = C36341k9.A0m(r1, r2, 5);
        List asList = Arrays.asList(new String[]{"770347478", "8952361871444313", "5336107443145802", "4706129709419993", "1747509846", "5694722353875618"});
        AnonymousClass00C.A08(asList);
        A08 = asList;
        List asList2 = Arrays.asList(new String[]{"8724517617588544", "5867824533312508", "5749495891784144", "8426096200765561", "5831572750195307", "9138357339511510"});
        AnonymousClass00C.A08(asList2);
        A07 = asList2;
    }

    public AvatarReactionRepository(C23871Ae r2, C39581sm r3, AnonymousClass6SF r4, C005502l r5, C005502l r6) {
        AnonymousClass00C.A0D(r2, 1);
        C36321k7.A17(r4, r5, r6, 3);
        this.A06 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A05 = r5;
        this.A04 = r6;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ab A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.lang.ref.WeakReference r18, X.C023509x r19, X.AnonymousClass040 r20, boolean r21) {
        /*
            r17 = this;
            r3 = r19
            r14 = r18
            r9 = r21
            boolean r0 = r3 instanceof X.C82793zH
            r12 = r17
            if (r0 == 0) goto L_0x00ef
            r5 = r3
            X.3zH r5 = (X.C82793zH) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00ef
            int r2 = r2 - r1
            r5.label = r2
        L_0x001a:
            java.lang.Object r8 = r5.result
            X.0AO r4 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r5.label
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0030
            if (r0 == r2) goto L_0x007e
            if (r0 != r3) goto L_0x00f6
            X.AnonymousClass0AN.A00(r8)
        L_0x002b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L_0x0030:
            X.AnonymousClass0AN.A00(r8)
            if (r21 == 0) goto L_0x006c
            java.util.List r0 = A07
        L_0x0037:
            java.util.ArrayList r7 = X.C36321k7.A0J(r0)
            java.util.Iterator r8 = r0.iterator()
            r16 = 0
        L_0x0041:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x006f
            java.lang.Object r13 = r8.next()
            int r6 = r16 + 1
            if (r16 >= 0) goto L_0x0054
            java.lang.RuntimeException r0 = X.C36351kA.A0v()
            throw r0
        L_0x0054:
            java.lang.String r13 = (java.lang.String) r13
            r15 = 0
            com.whatsapp.status.playback.avatar.AvatarReactionRepository$fetchAvatarReactionStickersInParallel$deferredAvatarList$1$1 r11 = new com.whatsapp.status.playback.avatar.AvatarReactionRepository$fetchAvatarReactionStickersInParallel$deferredAvatarList$1$1
            r11.<init>(r12, r13, r14, r15, r16)
            X.03u r1 = X.C008903u.A00
            java.lang.Integer r0 = X.C023109s.A00
            r10 = r20
            X.0ml r0 = X.AnonymousClass0A2.A01(r0, r1, r11, r10)
            r7.add(r0)
            r16 = r6
            goto L_0x0041
        L_0x006c:
            java.util.List r0 = A08
            goto L_0x0037
        L_0x006f:
            r5.L$0 = r12
            r5.L$1 = r14
            r5.Z$0 = r9
            r5.label = r2
            java.lang.Object r8 = X.C06800Vd.A00(r7, r5)
            if (r8 != r4) goto L_0x008b
            return r4
        L_0x007e:
            boolean r9 = r5.Z$0
            java.lang.Object r14 = r5.L$1
            java.lang.ref.WeakReference r14 = (java.lang.ref.WeakReference) r14
            java.lang.Object r12 = r5.L$0
            com.whatsapp.status.playback.avatar.AvatarReactionRepository r12 = (com.whatsapp.status.playback.avatar.AvatarReactionRepository) r12
            X.AnonymousClass0AN.A00(r8)
        L_0x008b:
            java.util.List r8 = (java.util.List) r8
            boolean r0 = r8 instanceof java.util.Collection
            if (r0 == 0) goto L_0x00ac
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x00ac
        L_0x0097:
            X.02l r6 = r12.A05
            r1 = 0
            com.whatsapp.status.playback.avatar.AvatarReactionRepository$fetchAvatarReactionStickersInParallel$2 r0 = new com.whatsapp.status.playback.avatar.AvatarReactionRepository$fetchAvatarReactionStickersInParallel$2
            r0.<init>(r12, r14, r8, r1)
            r5.L$0 = r1
            r5.L$1 = r1
            r5.label = r3
            java.lang.Object r0 = X.AnonymousClass0A2.A00(r5, r6, r0)
            if (r0 != r4) goto L_0x002b
            return r4
        L_0x00ac:
            java.util.Iterator r1 = r8.iterator()
            r7 = 0
        L_0x00b1:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00c8
            java.lang.Object r0 = r1.next()
            boolean r0 = r0 instanceof X.C47462eo
            if (r0 == 0) goto L_0x00b1
            int r7 = r7 + 1
            if (r7 >= 0) goto L_0x00b1
            java.lang.RuntimeException r0 = X.C36371kC.A0s()
            throw r0
        L_0x00c8:
            if (r7 <= 0) goto L_0x0097
            X.1Ae r10 = r12.A06
            r6 = 4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "isAnimated="
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = ",errorCount="
            java.lang.String r1 = X.AnonymousClass000.A0r(r0, r1, r7)
            java.lang.String r0 = "error_avatar_reaction_returned"
            r10.A02(r6, r0, r1)
            int r0 = r8.size()
            if (r7 != r0) goto L_0x0097
            java.lang.Boolean r0 = X.C36381kD.A0j()
            return r0
        L_0x00ef:
            X.3zH r5 = new X.3zH
            r5.<init>(r12, r3)
            goto L_0x001a
        L_0x00f6:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.avatar.AvatarReactionRepository.A00(java.lang.ref.WeakReference, X.09x, X.040, boolean):java.lang.Object");
    }
}
