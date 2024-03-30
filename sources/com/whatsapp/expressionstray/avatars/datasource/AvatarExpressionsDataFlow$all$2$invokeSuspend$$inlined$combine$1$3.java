package com.whatsapp.expressionstray.avatars.datasource;

import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C019408g;
import X.C023509x;
import X.C130616Lt;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.avatars.datasource.AvatarExpressionsDataFlow$all$2$invokeSuspend$$inlined$combine$1$3", f = "AvatarExpressionsDataFlow.kt", i = {}, l = {292}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarExpressionsDataFlow$all$2$invokeSuspend$$inlined$combine$1$3 extends AnonymousClass0A1 implements C019408g {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;
    public final /* synthetic */ C130616Lt this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarExpressionsDataFlow$all$2$invokeSuspend$$inlined$combine$1$3(C130616Lt r2, C023509x r3) {
        super(3, r3);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object BKt(Object obj, Object obj2, Object obj3) {
        AvatarExpressionsDataFlow$all$2$invokeSuspend$$inlined$combine$1$3 avatarExpressionsDataFlow$all$2$invokeSuspend$$inlined$combine$1$3 = new AvatarExpressionsDataFlow$all$2$invokeSuspend$$inlined$combine$1$3(this.this$0, (C023509x) obj3);
        avatarExpressionsDataFlow$all$2$invokeSuspend$$inlined$combine$1$3.L$0 = obj;
        avatarExpressionsDataFlow$all$2$invokeSuspend$$inlined$combine$1$3.L$1 = obj2;
        return avatarExpressionsDataFlow$all$2$invokeSuspend$$inlined$combine$1$3.invokeSuspend(AnonymousClass0AJ.A00);
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            X.0AO r6 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r14.label
            r7 = 1
            if (r0 == 0) goto L_0x000f
            if (r0 != r7) goto L_0x0102
            X.AnonymousClass0AN.A00(r15)
        L_0x000c:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x000f:
            X.AnonymousClass0AN.A00(r15)
            java.lang.Object r5 = r14.L$0
            X.05G r5 = (X.AnonymousClass05G) r5
            java.lang.Object r9 = r14.L$1
            java.lang.Object[] r9 = (java.lang.Object[]) r9
            X.61F[] r9 = (X.AnonymousClass61F[]) r9
            int r0 = r9.length
            int r0 = X.C90484aE.A05(r0)
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>(r0)
            r4 = 0
            int r3 = r9.length
        L_0x0028:
            if (r4 >= r3) goto L_0x0054
            r2 = r9[r4]
            boolean r0 = r2 instanceof X.AnonymousClass5IK
            if (r0 == 0) goto L_0x0044
            r0 = r2
            X.5IK r0 = (X.AnonymousClass5IK) r0
            X.5cB r1 = r0.A00
        L_0x0035:
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandSearchType.AvatarStickerCategory"
            X.AnonymousClass00C.A0E(r1, r0)
            X.5IG r1 = (X.AnonymousClass5IG) r1
            X.5zs r0 = r1.A00
            r8.put(r0, r2)
            int r4 = r4 + 1
            goto L_0x0028
        L_0x0044:
            boolean r0 = r2 instanceof X.AnonymousClass5II
            if (r0 == 0) goto L_0x004e
            r0 = r2
            X.5II r0 = (X.AnonymousClass5II) r0
            X.5cB r1 = r0.A00
            goto L_0x0035
        L_0x004e:
            r0 = r2
            X.5IJ r0 = (X.AnonymousClass5IJ) r0
            X.5cB r1 = r0.A00
            goto L_0x0035
        L_0x0054:
            X.6Lt r0 = r14.this$0
            java.util.List r0 = r0.A00
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            java.util.Iterator r13 = r0.iterator()
        L_0x0060:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x00f5
            java.lang.Object r10 = r13.next()
            X.5zs r10 = (X.C125415zs) r10
            java.lang.Object r1 = r8.get(r10)
            X.61F r1 = (X.AnonymousClass61F) r1
            if (r1 == 0) goto L_0x0060
            X.6Lt r0 = r14.this$0
            X.6W5 r9 = r0.A01
            X.AnonymousClass00C.A0D(r10, r7)
            java.lang.String r0 = r10.toString()
            X.565 r3 = new X.565
            r3.<init>(r10, r0)
            boolean r0 = r1 instanceof X.AnonymousClass5IK
            if (r0 == 0) goto L_0x00e1
            X.5IK r1 = (X.AnonymousClass5IK) r1
            java.util.List r0 = r1.A01
            java.util.ArrayList r2 = X.C36321k7.A0J(r0)
            java.util.Iterator r12 = r0.iterator()
        L_0x0094:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00d0
            java.lang.Object r1 = r12.next()
            X.5cC r1 = (X.C111385cC) r1
            boolean r0 = r1 instanceof X.AnonymousClass5IM
            if (r0 == 0) goto L_0x00b5
            java.lang.String r11 = X.AnonymousClass6W5.A01(r10, r1)
            X.5IM r1 = (X.AnonymousClass5IM) r1
            X.6c4 r0 = r1.A00
        L_0x00ac:
            X.55v r1 = new X.55v
            r1.<init>(r3, r0, r11)
        L_0x00b1:
            r2.add(r1)
            goto L_0x0094
        L_0x00b5:
            boolean r0 = r1 instanceof X.AnonymousClass5IL
            if (r0 == 0) goto L_0x00c3
            java.lang.String r0 = X.AnonymousClass6W5.A01(r10, r1)
            X.55t r1 = new X.55t
            r1.<init>(r3, r0)
            goto L_0x00b1
        L_0x00c3:
            boolean r0 = r1 instanceof X.AnonymousClass5IN
            if (r0 == 0) goto L_0x0107
            java.lang.String r11 = X.AnonymousClass6W5.A01(r10, r1)
            X.5IN r1 = (X.AnonymousClass5IN) r1
            X.6c4 r0 = r1.A00
            goto L_0x00ac
        L_0x00d0:
            java.util.ArrayList r1 = X.AnonymousClass001.A0I()
            boolean r0 = X.C36401kF.A1a(r2)
            if (r0 == 0) goto L_0x00f0
            X.C1035555x.A00(r9, r3, r10, r1)
            r1.addAll(r2)
            goto L_0x00f0
        L_0x00e1:
            boolean r0 = r1 instanceof X.AnonymousClass5IJ
            if (r0 != 0) goto L_0x00ee
            boolean r0 = r1 instanceof X.AnonymousClass5II
            if (r0 != 0) goto L_0x00ee
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        L_0x00ee:
            X.09w r1 = X.C023409w.A00
        L_0x00f0:
            r4.add(r1)
            goto L_0x0060
        L_0x00f5:
            java.util.ArrayList r0 = X.AnonymousClass03U.A07(r4)
            r14.label = r7
            java.lang.Object r0 = r5.B6N(r0, r14)
            if (r0 != r6) goto L_0x000c
            return r6
        L_0x0102:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x0107:
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.avatars.datasource.AvatarExpressionsDataFlow$all$2$invokeSuspend$$inlined$combine$1$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
