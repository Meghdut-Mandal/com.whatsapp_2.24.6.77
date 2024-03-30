package com.whatsapp.stickers.info.bottomsheet;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass11F;
import X.C005502l;
import X.C009003v;
import X.C023509x;
import X.C135066c4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel$processSticker$1", f = "StickerInfoViewModel.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, s = {})
public final class StickerInfoViewModel$processSticker$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass11F $chatJid;
    public final /* synthetic */ C135066c4 $sticker;
    public int label;
    public final /* synthetic */ StickerInfoViewModel this$0;

    @DebugMetadata(c = "com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel$processSticker$1$1", f = "StickerInfoViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel$processSticker$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public int label;

        public final C023509x create(Object obj, C023509x r6) {
            return new AnonymousClass1(r2, stickerInfoViewModel, r6);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x009e, code lost:
            if (r7.A0S != false) goto L_0x00a0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) {
            /*
                r23 = this;
                r5 = r23
                int r0 = r5.label
                if (r0 != 0) goto L_0x0104
                X.AnonymousClass0AN.A00(r24)
                X.11F r2 = X.AnonymousClass11F.this
                if (r2 == 0) goto L_0x001d
                com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel r1 = r5
                X.005 r0 = r1.A0C
                java.lang.Object r0 = r0.get()
                X.16D r0 = (X.AnonymousClass16D) r0
                X.141 r0 = r0.A08(r2)
                r1.A00 = r0
            L_0x001d:
                com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel r4 = r5
                X.3H7 r3 = r4.A04
                X.11F r2 = X.AnonymousClass11F.this
                if (r2 != 0) goto L_0x00eb
                r0 = 1
            L_0x0026:
                r4.A01 = r0
                X.6c4 r3 = r2
                java.lang.String r4 = r3.A0A
                if (r4 == 0) goto L_0x00e4
                com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel r2 = r5
                r10 = 0
                r14 = 0
                r1 = 0
                X.3QU r9 = new X.3QU
                r12 = r10
                r13 = r10
                r15 = 0
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 0
                r21 = 0
                r22 = 0
                r11 = r10
                r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
                X.1Ap r5 = r2.A06
                X.5Ry r0 = r3.A01()
                X.3S2 r4 = r5.A01(r0, r4)
                java.lang.String r6 = ""
                r5 = 1
                if (r4 == 0) goto L_0x00b1
                java.lang.String r0 = r4.A06
                r9.A02 = r0
                java.lang.String r0 = r4.A04
                r9.A01 = r0
                java.lang.String r7 = r4.A03
                r9.A00 = r7
                java.lang.String r8 = r4.A05
                r9.A03 = r8
                boolean r0 = r4.A0C
                r9.A09 = r0
                boolean r0 = r4.A0A
                r9.A07 = r0
                boolean r0 = r4.A07
                r9.A05 = r0
                boolean r0 = r4.A09
                r9.A06 = r0
                if (r8 == 0) goto L_0x0089
                int r0 = r8.length()
                if (r0 == 0) goto L_0x0089
                java.lang.String r0 = "play.google.com"
                boolean r0 = X.AnonymousClass6HK.A01(r8, r0)
                if (r0 != 0) goto L_0x008b
            L_0x0089:
                r9.A03 = r10
            L_0x008b:
                if (r7 == 0) goto L_0x00b1
                boolean r4 = r4.A0B
                X.1AP r0 = r2.A07
                X.68B r7 = r0.A03(r10, r7, r4)
                if (r7 == 0) goto L_0x00b1
                java.lang.String r0 = r7.A03
                if (r0 != 0) goto L_0x00a0
                boolean r0 = r7.A0S
                r4 = 0
                if (r0 == 0) goto L_0x00a1
            L_0x00a0:
                r4 = 1
            L_0x00a1:
                r9.A0A = r4
                java.lang.String r0 = r7.A0H
                r9.A01 = r0
                java.lang.String r0 = r7.A0J
                r9.A02 = r0
                boolean r0 = r7.A0S
                r0 = r0 ^ 1
                r9.A04 = r0
            L_0x00b1:
                X.1AP r0 = r2.A07
                boolean r0 = r0.A0G(r3)
                r9.A08 = r0
                X.1BF r0 = r2.A05
                boolean r0 = r0.A01()
                r9.A0C = r0
                X.005 r0 = r2.A0F
                java.lang.Object r4 = r0.get()
                X.5Ar r4 = (X.C104665Ar) r4
                java.lang.String r0 = r3.A0E
                if (r0 == 0) goto L_0x00ce
                r6 = r0
            L_0x00ce:
                boolean r0 = r4.A0L(r6)
                if (r0 != r5) goto L_0x00d5
                r1 = 1
            L_0x00d5:
                r9.A0B = r1
                X.1Rs r1 = r2.A0B
                X.2fW r0 = new X.2fW
                r0.<init>(r9)
            L_0x00de:
                r1.A0C(r0)
                X.0AJ r0 = X.AnonymousClass0AJ.A00
                return r0
            L_0x00e4:
                com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel r0 = r5
                X.1Rs r1 = r0.A0B
                X.2fX r0 = X.C47732fX.A00
                goto L_0x00de
            L_0x00eb:
                X.0wQ r0 = r3.A01
                r0.A0G()
                X.142 r0 = r0.A0E
                if (r0 == 0) goto L_0x0102
                X.11F r1 = r0.A0H
            L_0x00f6:
                X.1A5 r0 = r3.A03
                X.141 r0 = r0.A01(r2)
                boolean r0 = r3.A01(r0, r1)
                goto L_0x0026
            L_0x0102:
                r1 = 0
                goto L_0x00f6
            L_0x0104:
                java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel$processSticker$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerInfoViewModel$processSticker$1(AnonymousClass11F r2, C135066c4 r3, StickerInfoViewModel stickerInfoViewModel, C023509x r5) {
        super(2, r5);
        this.this$0 = stickerInfoViewModel;
        this.$chatJid = r2;
        this.$sticker = r3;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new StickerInfoViewModel$processSticker$1(this.$chatJid, this.$sticker, this.this$0, r6);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r7 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            final StickerInfoViewModel stickerInfoViewModel = this.this$0;
            C005502l r4 = stickerInfoViewModel.A0H;
            final AnonymousClass11F r3 = this.$chatJid;
            final C135066c4 r2 = this.$sticker;
            AnonymousClass1 r0 = new AnonymousClass1((C023509x) null);
            this.label = 1;
            if (AnonymousClass0A2.A00(this, r4, r0) == r7) {
                return r7;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StickerInfoViewModel$processSticker$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
