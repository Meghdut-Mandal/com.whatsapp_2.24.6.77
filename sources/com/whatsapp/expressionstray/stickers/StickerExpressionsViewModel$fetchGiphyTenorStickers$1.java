package com.whatsapp.expressionstray.stickers;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C005502l;
import X.C009003v;
import X.C023509x;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel$fetchGiphyTenorStickers$1", f = "StickerExpressionsViewModel.kt", i = {}, l = {601}, m = "invokeSuspend", n = {}, s = {})
public final class StickerExpressionsViewModel$fetchGiphyTenorStickers$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ Set $filteredEmojis;
    public final /* synthetic */ List $localResults;
    public final /* synthetic */ String $searchText;
    public int label;
    public final /* synthetic */ StickerExpressionsViewModel this$0;

    @DebugMetadata(c = "com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel$fetchGiphyTenorStickers$1$1", f = "StickerExpressionsViewModel.kt", i = {0, 1, 2, 2, 3, 3, 3}, l = {604, 613, 616, 629, 639}, m = "invokeSuspend", n = {"startTime", "startTime", "stickersFromGiphyTenor", "startTime", "stickersFromGiphyTenor", "startTime", "queryCount"}, s = {"J$0", "J$0", "L$0", "J$0", "L$0", "J$0", "I$0"})
    /* renamed from: com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel$fetchGiphyTenorStickers$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public int I$0;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public int label;

        public final C023509x create(Object obj, C023509x r8) {
            return new AnonymousClass1(str, list, set, r8);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x00e9 A[Catch:{ CancellationException -> 0x011e, Exception -> 0x0105 }] */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                r20 = this;
                X.0AO r7 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
                r6 = r20
                int r0 = r6.label
                r5 = 5
                r4 = 4
                r3 = 3
                r2 = 2
                r15 = 0
                r8 = 1
                if (r0 == 0) goto L_0x003c
                if (r0 == r8) goto L_0x0039
                if (r0 == r2) goto L_0x0033
                if (r0 == r3) goto L_0x002b
                if (r0 == r4) goto L_0x001e
                if (r0 != r5) goto L_0x0147
                X.AnonymousClass0AN.A00(r21)
            L_0x001b:
                X.0AJ r0 = X.AnonymousClass0AJ.A00
                return r0
            L_0x001e:
                int r9 = r6.I$0
                long r12 = r6.J$0
                java.lang.Object r8 = r6.L$0
                java.util.List r8 = (java.util.List) r8
                X.AnonymousClass0AN.A00(r21)     // Catch:{ CancellationException -> 0x011c, Exception -> 0x0101 }
                goto L_0x00fe
            L_0x002b:
                long r12 = r6.J$0
                java.lang.Object r8 = r6.L$0
                java.util.List r8 = (java.util.List) r8
                goto L_0x00d0
            L_0x0033:
                long r12 = r6.J$0
                X.AnonymousClass0AN.A00(r21)     // Catch:{ CancellationException -> 0x011c, Exception -> 0x0101 }
                goto L_0x001b
            L_0x0039:
                long r12 = r6.J$0
                goto L_0x005b
            L_0x003c:
                X.AnonymousClass0AN.A00(r21)
                com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel r0 = com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel.this
                long r12 = java.lang.System.currentTimeMillis()
                X.5lo r0 = r0.A0E     // Catch:{ CancellationException -> 0x011c, Exception -> 0x0103 }
                X.0yC r1 = r0.A00     // Catch:{ CancellationException -> 0x011c, Exception -> 0x0103 }
                r0 = 5423(0x152f, float:7.599E-42)
                long r0 = X.C36441kJ.A0B(r1, r0)     // Catch:{ CancellationException -> 0x011c, Exception -> 0x0103 }
                r6.J$0 = r12     // Catch:{ CancellationException -> 0x011c, Exception -> 0x0103 }
                r6.label = r8     // Catch:{ CancellationException -> 0x011c, Exception -> 0x0103 }
                java.lang.Object r0 = X.C07330Xf.A00(r6, r0)     // Catch:{ CancellationException -> 0x011c, Exception -> 0x0103 }
                if (r0 != r7) goto L_0x005e
                goto L_0x014c
            L_0x005b:
                X.AnonymousClass0AN.A00(r21)     // Catch:{ CancellationException -> 0x011c, Exception -> 0x0103 }
            L_0x005e:
                com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel r0 = com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel.this     // Catch:{ CancellationException -> 0x011c, Exception -> 0x0103 }
                X.6SS r10 = r0.A0L     // Catch:{ CancellationException -> 0x011c, Exception -> 0x0103 }
                java.lang.String r8 = r5     // Catch:{ CancellationException -> 0x011c, Exception -> 0x0103 }
                java.util.Set r1 = r7     // Catch:{ CancellationException -> 0x011c, Exception -> 0x0103 }
                r0 = 0
                boolean r9 = X.C36341k9.A1a(r8, r1)     // Catch:{ CancellationException -> 0x011c, Exception -> 0x0103 }
                r10.A00 = r15     // Catch:{ CancellationException -> 0x011c, Exception -> 0x0103 }
                r10.A01 = r0     // Catch:{ CancellationException -> 0x011c, Exception -> 0x0103 }
                java.lang.String r0 = X.AnonymousClass6SS.A01(r10, r8, r15)     // Catch:{ CancellationException -> 0x011c, Exception -> 0x0103 }
                X.00I r1 = X.AnonymousClass6SS.A00(r10, r0, r1)     // Catch:{ CancellationException -> 0x011c, Exception -> 0x0103 }
                r8 = 0
                if (r1 != 0) goto L_0x0081
                r10.A01 = r9     // Catch:{ CancellationException -> 0x011c, Exception -> 0x0103 }
                r10.A00 = r15     // Catch:{ CancellationException -> 0x011c, Exception -> 0x0103 }
            L_0x007e:
                com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel r9 = com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel.this     // Catch:{ CancellationException -> 0x011c, Exception -> 0x0103 }
                goto L_0x008c
            L_0x0081:
                java.lang.Object r0 = r1.A00     // Catch:{ CancellationException -> 0x011c, Exception -> 0x0103 }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ CancellationException -> 0x011c, Exception -> 0x0103 }
                r10.A00 = r0     // Catch:{ CancellationException -> 0x011c, Exception -> 0x0103 }
                java.lang.Object r8 = r1.A01     // Catch:{ CancellationException -> 0x011c, Exception -> 0x0103 }
                java.util.List r8 = (java.util.List) r8     // Catch:{ CancellationException -> 0x011c, Exception -> 0x0103 }
                goto L_0x007e
            L_0x008c:
                boolean r14 = X.AnonymousClass000.A1V(r8)
                if (r8 == 0) goto L_0x0093
                goto L_0x0095
            L_0x0093:
                r10 = r15
                goto L_0x009f
            L_0x0095:
                int r0 = r8.size()     // Catch:{ CancellationException -> 0x011c, Exception -> 0x0103 }
                long r0 = (long) r0     // Catch:{ CancellationException -> 0x011c, Exception -> 0x0103 }
                java.lang.Long r10 = new java.lang.Long     // Catch:{ CancellationException -> 0x011c, Exception -> 0x0103 }
                r10.<init>(r0)     // Catch:{ CancellationException -> 0x011c, Exception -> 0x0103 }
            L_0x009f:
                r11 = 0
                com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel.A0A(r9, r10, r11, r12, r14)     // Catch:{ CancellationException -> 0x011c, Exception -> 0x0103 }
                if (r8 == 0) goto L_0x00ac
                boolean r1 = r8.isEmpty()     // Catch:{ CancellationException -> 0x011c, Exception -> 0x0103 }
                r0 = 0
                if (r1 == 0) goto L_0x00ad
            L_0x00ac:
                r0 = 1
            L_0x00ad:
                if (r0 == 0) goto L_0x00bf
                com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel r3 = com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel.this     // Catch:{ CancellationException -> 0x011c, Exception -> 0x0103 }
                java.util.List r1 = r6     // Catch:{ CancellationException -> 0x011c, Exception -> 0x0103 }
                X.09w r0 = X.C023409w.A00     // Catch:{ CancellationException -> 0x011c, Exception -> 0x0103 }
                r6.J$0 = r12     // Catch:{ CancellationException -> 0x011c, Exception -> 0x0103 }
                r6.label = r2     // Catch:{ CancellationException -> 0x011c, Exception -> 0x0103 }
                java.lang.Object r0 = com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel.A06(r3, r1, r15, r0, r6)     // Catch:{ CancellationException -> 0x011c, Exception -> 0x0103 }
                goto L_0x0144
            L_0x00bf:
                com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel r1 = com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel.this     // Catch:{ CancellationException -> 0x011c, Exception -> 0x0103 }
                java.util.List r0 = r6     // Catch:{ CancellationException -> 0x011c, Exception -> 0x0103 }
                r6.L$0 = r8     // Catch:{ CancellationException -> 0x011c, Exception -> 0x0103 }
                r6.J$0 = r12     // Catch:{ CancellationException -> 0x011c, Exception -> 0x0103 }
                r6.label = r3     // Catch:{ CancellationException -> 0x011c, Exception -> 0x0103 }
                java.lang.Object r0 = com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel.A06(r1, r0, r15, r8, r6)     // Catch:{ CancellationException -> 0x011c, Exception -> 0x0103 }
                if (r0 != r7) goto L_0x00d3
                goto L_0x014d
            L_0x00d0:
                X.AnonymousClass0AN.A00(r21)     // Catch:{ CancellationException -> 0x011c, Exception -> 0x0101 }
            L_0x00d3:
                com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel r0 = com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel.this     // Catch:{ CancellationException -> 0x011c, Exception -> 0x0101 }
                r0.A02 = r8     // Catch:{ CancellationException -> 0x011c, Exception -> 0x0101 }
                r9 = 0
            L_0x00d8:
                int r1 = r8.size()     // Catch:{ CancellationException -> 0x011e, Exception -> 0x0105 }
                r0 = 40
                if (r1 >= r0) goto L_0x001b
                r0 = 6
                if (r9 >= r0) goto L_0x001b
                com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel r3 = com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel.this     // Catch:{ CancellationException -> 0x011e, Exception -> 0x0105 }
                java.util.List r2 = r3.A02     // Catch:{ CancellationException -> 0x011e, Exception -> 0x0105 }
                if (r2 == 0) goto L_0x00fe
                java.util.List r1 = r6     // Catch:{ CancellationException -> 0x011e, Exception -> 0x0105 }
                java.lang.String r0 = r5     // Catch:{ CancellationException -> 0x011e, Exception -> 0x0105 }
                r6.L$0 = r8     // Catch:{ CancellationException -> 0x011e, Exception -> 0x0105 }
                r6.L$1 = r2     // Catch:{ CancellationException -> 0x011e, Exception -> 0x0105 }
                r6.J$0 = r12     // Catch:{ CancellationException -> 0x011e, Exception -> 0x0105 }
                r6.I$0 = r9     // Catch:{ CancellationException -> 0x011e, Exception -> 0x0105 }
                r6.label = r4     // Catch:{ CancellationException -> 0x011e, Exception -> 0x0105 }
                java.lang.Object r0 = com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel.A04(r3, r0, r1, r2, r6)     // Catch:{ CancellationException -> 0x011e, Exception -> 0x0105 }
                if (r0 != r7) goto L_0x00fe
                goto L_0x014e
            L_0x00fe:
                int r9 = r9 + 1
                goto L_0x00d8
            L_0x0101:
                r2 = move-exception
                goto L_0x0106
            L_0x0103:
                r2 = move-exception
                goto L_0x0106
            L_0x0105:
                r2 = move-exception
            L_0x0106:
                java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
                java.lang.String r0 = "StickerExpressionsViewModel/fetchGiphyTenorStickers/error = "
                X.C36321k7.A1J(r2, r0, r1)
                com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel r14 = com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel.this
                r16 = 0
                r19 = 0
                r17 = r12
                com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel.A0A(r14, r15, r16, r17, r19)
                goto L_0x001b
            L_0x011c:
                r2 = move-exception
                goto L_0x011f
            L_0x011e:
                r2 = move-exception
            L_0x011f:
                java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
                java.lang.String r0 = "StickerExpressionsViewModel/fetchGiphyTenorStickers/cancel = "
                X.C36321k7.A1J(r2, r0, r1)
                com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel r0 = com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel.this
                X.05L r0 = r0.A0h
                java.lang.Object r0 = r0.getValue()
                boolean r0 = r0 instanceof X.AnonymousClass56O
                if (r0 == 0) goto L_0x001b
                com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel r2 = com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel.this
                java.util.List r1 = r6
                X.09w r0 = X.C023409w.A00
                r6.L$0 = r15
                r6.L$1 = r15
                r6.label = r5
                java.lang.Object r0 = com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel.A06(r2, r1, r15, r0, r6)
            L_0x0144:
                if (r0 != r7) goto L_0x001b
                return r7
            L_0x0147:
                java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
                throw r0
            L_0x014c:
                return r7
            L_0x014d:
                return r7
            L_0x014e:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel$fetchGiphyTenorStickers$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerExpressionsViewModel$fetchGiphyTenorStickers$1(StickerExpressionsViewModel stickerExpressionsViewModel, String str, List list, Set set, C023509x r6) {
        super(2, r6);
        this.this$0 = stickerExpressionsViewModel;
        this.$searchText = str;
        this.$filteredEmojis = set;
        this.$localResults = list;
    }

    public final C023509x create(Object obj, C023509x r8) {
        return new StickerExpressionsViewModel$fetchGiphyTenorStickers$1(this.this$0, this.$searchText, this.$localResults, this.$filteredEmojis, r8);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r2 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            final StickerExpressionsViewModel stickerExpressionsViewModel = this.this$0;
            C005502l r0 = stickerExpressionsViewModel.A0c;
            final String str = this.$searchText;
            final Set set = this.$filteredEmojis;
            final List list = this.$localResults;
            AnonymousClass1 r3 = new AnonymousClass1((C023509x) null);
            this.label = 1;
            if (AnonymousClass0A2.A00(this, r0, r3) == r2) {
                return r2;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StickerExpressionsViewModel$fetchGiphyTenorStickers$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
