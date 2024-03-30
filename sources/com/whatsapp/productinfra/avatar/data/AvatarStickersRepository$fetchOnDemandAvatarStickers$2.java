package com.whatsapp.productinfra.avatar.data;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import X.C24241Br;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.AvatarStickersRepository$fetchOnDemandAvatarStickers$2", f = "AvatarStickersRepository.kt", i = {1, 2, 3}, l = {248, 266, 276, 292}, m = "invokeSuspend", n = {"error", "error", "revisionOutdated"}, s = {"L$0", "L$0", "L$0"})
public final class AvatarStickersRepository$fetchOnDemandAvatarStickers$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ boolean $defaultPack;
    public final /* synthetic */ Set $stableIds;
    public Object L$0;
    public int label;
    public final /* synthetic */ C24241Br this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickersRepository$fetchOnDemandAvatarStickers$2(C24241Br r2, Set set, C023509x r4, boolean z) {
        super(2, r4);
        this.this$0 = r2;
        this.$stableIds = set;
        this.$defaultPack = z;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new AvatarStickersRepository$fetchOnDemandAvatarStickers$2(this.this$0, this.$stableIds, r6, this.$defaultPack);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: X.5c8} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x017a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            X.0AO r4 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r2 = r14.label
            r5 = 4
            r6 = 3
            r1 = 2
            r0 = 1
            r3 = 0
            if (r2 == 0) goto L_0x0018
            if (r2 == r0) goto L_0x0057
            if (r2 == r1) goto L_0x00f4
            if (r2 == r6) goto L_0x0118
            if (r2 == r5) goto L_0x00ec
            java.lang.IllegalStateException r6 = X.AnonymousClass000.A0e()
        L_0x0017:
            throw r6
        L_0x0018:
            X.AnonymousClass0AN.A00(r15)
            X.1Br r2 = r14.this$0
            X.004 r2 = r2.A07
            java.lang.Object r8 = r2.get()
            X.5qz r8 = (X.C120115qz) r8
            X.AnonymousClass00C.A0B(r8)
            java.util.Set r12 = r14.$stableIds
            boolean r13 = r14.$defaultPack
            X.1Br r2 = r14.this$0
            X.005 r2 = r2.A06
            java.lang.Object r2 = r2.get()
            X.1Bt r2 = (X.C24261Bt) r2
            java.lang.String r10 = r2.A01()
            X.5TK r9 = X.AnonymousClass5TK.INITIAL_DOWNLOAD
            X.09w r11 = X.C023409w.A00
            X.C36351kA.A1J(r12, r11, r5)
            X.7hM r2 = r8.A01
            X.6xO r7 = new X.6xO
            r7.<init>(r8, r9, r10, r11, r12, r13)
            X.6uu r2 = r2.B3y(r7)
            r14.label = r0
            X.02m r0 = X.AnonymousClass19R.A01
            java.lang.Object r15 = com.whatsapp.graphql.GraphqlRequest$postAwait$2.A01(r2, r14, r0)
            if (r15 != r4) goto L_0x005a
            return r4
        L_0x0057:
            X.AnonymousClass0AN.A00(r15)
        L_0x005a:
            X.5x8 r15 = (X.C123815x8) r15
            X.5c9 r2 = X.C111365cA.A00(r15)
            boolean r0 = r2 instanceof X.C105855Hf
            if (r0 == 0) goto L_0x017a
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "AvatarStickersRepository/fetchOnDemandAvatarStickers/"
            r7.append(r0)
            X.5Hf r2 = (X.C105855Hf) r2
            java.lang.Object r2 = r2.A00
            X.C36331k8.A1P(r2, r7)
            boolean r0 = r2 instanceof X.C111345c8
            if (r0 == 0) goto L_0x00b2
            r7 = r2
            X.5c8 r7 = (X.C111345c8) r7
        L_0x007b:
            X.1Br r9 = r14.this$0
            if (r7 == 0) goto L_0x00af
            java.lang.String r8 = X.C24241Br.A00(r7)
            if (r8 == 0) goto L_0x00af
        L_0x0085:
            java.lang.String r0 = "fetch_on_demand_avatar_stickers_failed"
            X.C24241Br.A01(r9, r0, r8)
            boolean r0 = r7 instanceof X.AnonymousClass5HV
            if (r0 != 0) goto L_0x0175
            boolean r0 = r7 instanceof X.AnonymousClass5HW
            if (r0 == 0) goto L_0x00b4
            r0 = r7
            X.5HW r0 = (X.AnonymousClass5HW) r0
            java.lang.Object r0 = r0.A00
            boolean r0 = r0 instanceof X.C105985Hx
            if (r0 == 0) goto L_0x00fb
            X.1Br r5 = r14.this$0
            X.02l r2 = r5.A0A
            com.whatsapp.productinfra.avatar.data.AvatarStickersRepository$fetchOnDemandAvatarStickers$2$unwrapped$1 r0 = new com.whatsapp.productinfra.avatar.data.AvatarStickersRepository$fetchOnDemandAvatarStickers$2$unwrapped$1
            r0.<init>(r5, r7, r3)
            r14.L$0 = r7
            r14.label = r1
            java.lang.Object r0 = X.AnonymousClass0A2.A00(r14, r2, r0)
            if (r0 != r4) goto L_0x00fb
            return r4
        L_0x00af:
            java.lang.String r8 = "unknown error"
            goto L_0x0085
        L_0x00b2:
            r7 = r3
            goto L_0x007b
        L_0x00b4:
            boolean r0 = r7 instanceof X.AnonymousClass5HX
            if (r0 == 0) goto L_0x012d
            X.5HX r7 = (X.AnonymousClass5HX) r7
            java.util.List r2 = r7.A00
            java.util.Iterator r1 = r2.iterator()
        L_0x00c0:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00ea
            java.lang.Object r6 = r1.next()
            boolean r0 = r6 instanceof X.C105985Hx
            if (r0 == 0) goto L_0x00c0
        L_0x00ce:
            boolean r0 = r6 instanceof X.C105985Hx
            if (r0 == 0) goto L_0x0126
            X.5Hx r6 = (X.C105985Hx) r6
            if (r6 == 0) goto L_0x0126
            X.1Br r2 = r14.this$0
            X.02l r1 = r2.A0A
            com.whatsapp.productinfra.avatar.data.AvatarStickersRepository$fetchOnDemandAvatarStickers$2$unwrapped$3 r0 = new com.whatsapp.productinfra.avatar.data.AvatarStickersRepository$fetchOnDemandAvatarStickers$2$unwrapped$3
            r0.<init>(r2, r6, r3)
            r14.L$0 = r6
            r14.label = r5
            java.lang.Object r0 = X.AnonymousClass0A2.A00(r14, r1, r0)
            if (r0 != r4) goto L_0x0017
            return r4
        L_0x00ea:
            r6 = r3
            goto L_0x00ce
        L_0x00ec:
            java.lang.Object r6 = r14.L$0
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            X.AnonymousClass0AN.A00(r15)
            throw r6
        L_0x00f4:
            java.lang.Object r7 = r14.L$0
            X.5c8 r7 = (X.C111345c8) r7
            X.AnonymousClass0AN.A00(r15)
        L_0x00fb:
            r0 = r7
            X.5HW r0 = (X.AnonymousClass5HW) r0
            java.lang.Object r0 = r0.A00
            boolean r0 = r0 instanceof X.C106005Hz
            if (r0 == 0) goto L_0x011f
            X.1Br r2 = r14.this$0
            X.02l r1 = r2.A0A
            com.whatsapp.productinfra.avatar.data.AvatarStickersRepository$fetchOnDemandAvatarStickers$2$unwrapped$2 r0 = new com.whatsapp.productinfra.avatar.data.AvatarStickersRepository$fetchOnDemandAvatarStickers$2$unwrapped$2
            r0.<init>(r2, r3)
            r14.L$0 = r7
            r14.label = r6
            java.lang.Object r0 = X.AnonymousClass0A2.A00(r14, r1, r0)
            if (r0 != r4) goto L_0x011f
            return r4
        L_0x0118:
            java.lang.Object r7 = r14.L$0
            X.5c8 r7 = (X.C111345c8) r7
            X.AnonymousClass0AN.A00(r15)
        L_0x011f:
            X.5HW r7 = (X.AnonymousClass5HW) r7
            java.lang.Object r6 = r7.A00
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            throw r6
        L_0x0126:
            java.lang.Object r6 = X.C007103b.A0L(r2)
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            throw r6
        L_0x012d:
            boolean r0 = r7 instanceof X.AnonymousClass5HY
            if (r0 != 0) goto L_0x015f
            boolean r0 = r7 instanceof X.AnonymousClass5HU
            if (r0 != 0) goto L_0x014c
            if (r7 != 0) goto L_0x0147
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unknown error received: "
            java.lang.String r0 = X.AnonymousClass000.A0l(r2, r0, r1)
            java.lang.UnknownError r6 = new java.lang.UnknownError
            r6.<init>(r0)
            throw r6
        L_0x0147:
            X.0jS r6 = X.C36441kJ.A18()
            throw r6
        L_0x014c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unknown error code: "
            r1.append(r0)
            r0 = 0
            java.lang.String r0 = X.C36381kD.A10(r1, r0)
            java.lang.IllegalStateException r6 = X.AnonymousClass001.A09(r0)
            throw r6
        L_0x015f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unknown error: "
            r1.append(r0)
            X.5HY r7 = (X.AnonymousClass5HY) r7
            java.lang.Throwable r0 = r7.A00
            java.lang.String r0 = X.AnonymousClass000.A0o(r0, r1)
            java.lang.IllegalStateException r6 = X.AnonymousClass001.A09(r0)
            throw r6
        L_0x0175:
            X.5HV r7 = (X.AnonymousClass5HV) r7
            java.lang.Throwable r6 = r7.A00
            throw r6
        L_0x017a:
            boolean r0 = r2 instanceof X.C105865Hg
            if (r0 == 0) goto L_0x01e8
            X.5Hg r2 = (X.C105865Hg) r2
            java.lang.Object r1 = r2.A00
            X.6bh r1 = (X.C134846bh) r1
            if (r1 == 0) goto L_0x01e7
            X.1Br r2 = r14.this$0
            X.004 r0 = r2.A08
            java.lang.Object r3 = r0.get()
            X.6Sa r3 = (X.C132076Sa) r3
            java.lang.String r5 = r1.A04
            java.lang.String r6 = r1.A05
            java.lang.String r7 = r1.A02
            java.lang.String r8 = r1.A06
            java.lang.String r9 = r1.A08
            java.lang.String r10 = r1.A07
            java.lang.String r11 = r1.A03
            X.6bg r4 = r1.A00
            java.util.List r12 = r1.A09
            X.68B r7 = r3.A02(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            java.util.List r0 = r7.A05
            java.util.Iterator r9 = X.C90514aH.A14(r0)
        L_0x01ac:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x01e4
            X.6c4 r8 = X.C90504aG.A0U(r9)
            java.lang.String r0 = r8.A06
            if (r0 == 0) goto L_0x01ac
            X.1Bp r3 = r2.A04     // Catch:{ all -> 0x01dd }
            X.690 r1 = new X.690     // Catch:{ all -> 0x01dd }
            r1.<init>(r0)     // Catch:{ all -> 0x01dd }
            r0 = 0
            java.io.File r1 = r3.A00(r1, r0)     // Catch:{ all -> 0x01dd }
            boolean r0 = r1.exists()     // Catch:{ all -> 0x01dd }
            if (r0 == 0) goto L_0x01ac
            long r5 = r1.length()     // Catch:{ all -> 0x01dd }
            r3 = 0
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x01ac
            java.lang.String r0 = r1.getAbsolutePath()     // Catch:{ all -> 0x01dd }
            r8.A0A = r0     // Catch:{ all -> 0x01dd }
            goto L_0x01ac
        L_0x01dd:
            r1 = move-exception
            X.03N r0 = new X.03N
            r0.<init>(r1)
            goto L_0x01ac
        L_0x01e4:
            java.util.List r4 = r7.A05
            return r4
        L_0x01e7:
            return r3
        L_0x01e8:
            X.0jS r6 = X.C36441kJ.A18()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.productinfra.avatar.data.AvatarStickersRepository$fetchOnDemandAvatarStickers$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarStickersRepository$fetchOnDemandAvatarStickers$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
