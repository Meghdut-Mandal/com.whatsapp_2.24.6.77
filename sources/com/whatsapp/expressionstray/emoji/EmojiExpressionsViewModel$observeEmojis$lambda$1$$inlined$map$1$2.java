package com.whatsapp.expressionstray.emoji;

import X.AnonymousClass05G;

public final class EmojiExpressionsViewModel$observeEmojis$lambda$1$$inlined$map$1$2 implements AnonymousClass05G {
    public final /* synthetic */ int A00;
    public final /* synthetic */ EmojiExpressionsViewModel A01;
    public final /* synthetic */ AnonymousClass05G A02;

    public EmojiExpressionsViewModel$observeEmojis$lambda$1$$inlined$map$1$2(EmojiExpressionsViewModel emojiExpressionsViewModel, AnonymousClass05G r2, int i) {
        this.A02 = r2;
        this.A01 = emojiExpressionsViewModel;
        this.A00 = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object B6N(java.lang.Object r16, X.C023509x r17) {
        /*
            r15 = this;
            r3 = r17
            r9 = r16
            boolean r0 = r3 instanceof X.AnonymousClass7AD
            if (r0 == 0) goto L_0x00ca
            r4 = r3
            X.7AD r4 = (X.AnonymousClass7AD) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00ca
            int r2 = r2 - r1
            r4.label = r2
        L_0x0016:
            java.lang.Object r1 = r4.result
            X.0AO r3 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L_0x0027
            if (r0 != r2) goto L_0x00d1
            X.AnonymousClass0AN.A00(r1)
        L_0x0024:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0027:
            X.AnonymousClass0AN.A00(r1)
            X.05G r5 = r15.A02
            X.5b3 r9 = (X.C110675b3) r9
            boolean r0 = r9 instanceof X.C1033755c
            if (r0 == 0) goto L_0x00b8
            com.whatsapp.expressionstray.emoji.EmojiExpressionsViewModel r10 = r15.A01
            X.55c r9 = (X.C1033755c) r9
            int r8 = r15.A00
            java.lang.Integer r12 = r9.A00
            if (r8 != 0) goto L_0x008e
            java.util.List r1 = r9.A02
            java.util.List r7 = r9.A01
            if (r12 == 0) goto L_0x00bc
            r8 = 1
            java.util.ArrayList r0 = X.C36321k7.A0J(r7)
            java.util.Iterator r7 = r7.iterator()
        L_0x004b:
            boolean r6 = r7.hasNext()
            if (r6 == 0) goto L_0x00bb
            java.lang.Object r9 = r7.next()
            X.60v r9 = (X.C1256760v) r9
            if (r8 == 0) goto L_0x006d
            boolean r6 = r9 instanceof X.C1034355i
            if (r6 == 0) goto L_0x0071
            X.55i r9 = (X.C1034355i) r9
            int[] r13 = r9.A03
            int[] r14 = r9.A04
            X.1H2 r10 = r9.A00
            X.6CK r11 = r9.A01
            X.55i r9 = new X.55i
            r9.<init>(r10, r11, r12, r13, r14)
        L_0x006c:
            r8 = 0
        L_0x006d:
            r0.add(r9)
            goto L_0x004b
        L_0x0071:
            boolean r6 = r9 instanceof X.C1034455j
            if (r6 == 0) goto L_0x0085
            X.55j r9 = (X.C1034455j) r9
            int[][] r13 = r9.A03
            int[][] r14 = r9.A04
            X.1H2 r10 = r9.A00
            X.6CK r11 = r9.A01
            X.55j r9 = new X.55j
            r9.<init>(r10, r11, r12, r13, r14)
            goto L_0x006c
        L_0x0085:
            boolean r6 = r9 instanceof X.C1034255h
            if (r6 != 0) goto L_0x006d
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        L_0x008e:
            if (r12 == 0) goto L_0x009c
            X.66o r7 = r10.A07
            int r6 = r12.intValue()
            r1 = 0
            java.lang.String r0 = "emoji_data_batching_start"
            r7.A00(r6, r0, r1)
        L_0x009c:
            java.util.List r0 = r9.A01
            java.util.ArrayList r8 = com.whatsapp.expressionstray.emoji.EmojiExpressionsViewModel.A01(r10, r12, r0, r8)
            if (r12 == 0) goto L_0x00b0
            X.66o r7 = r10.A07
            int r6 = r12.intValue()
            r1 = 0
            java.lang.String r0 = "emoji_data_batching_end"
            r7.A00(r6, r0, r1)
        L_0x00b0:
            java.util.List r0 = r9.A02
            X.55X r6 = new X.55X
            r6.<init>(r12, r0, r8)
            goto L_0x00c1
        L_0x00b8:
            X.55Z r6 = X.AnonymousClass55Z.A00
            goto L_0x00c1
        L_0x00bb:
            r7 = r0
        L_0x00bc:
            X.55X r6 = new X.55X
            r6.<init>(r12, r1, r7)
        L_0x00c1:
            r4.label = r2
            java.lang.Object r0 = r5.B6N(r6, r4)
            if (r0 != r3) goto L_0x0024
            return r3
        L_0x00ca:
            X.7AD r4 = new X.7AD
            r4.<init>(r15, r3)
            goto L_0x0016
        L_0x00d1:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.emoji.EmojiExpressionsViewModel$observeEmojis$lambda$1$$inlined$map$1$2.B6N(java.lang.Object, X.09x):java.lang.Object");
    }
}
