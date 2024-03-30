package com.whatsapp.stickers.info.bottomsheet;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass3QU;
import X.C005502l;
import X.C009003v;
import X.C023509x;
import X.C135066c4;
import X.C52482pV;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel$removeSticker$1", f = "StickerInfoViewModel.kt", i = {}, l = {168}, m = "invokeSuspend", n = {}, s = {})
public final class StickerInfoViewModel$removeSticker$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C52482pV $origin;
    public final /* synthetic */ C135066c4 $sticker;
    public final /* synthetic */ AnonymousClass3QU $stickerInfo;
    public int label;
    public final /* synthetic */ StickerInfoViewModel this$0;

    @DebugMetadata(c = "com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel$removeSticker$1$1", f = "StickerInfoViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel$removeSticker$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public int label;

        public final C023509x create(Object obj, C023509x r8) {
            C52482pV r3 = r6;
            return new AnonymousClass1(r4, r5, r3, stickerInfoViewModel, r8);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
            r5 = r4;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                int r0 = r6.label
                if (r0 != 0) goto L_0x006b
                X.AnonymousClass0AN.A00(r7)
                X.2pV r1 = r6
                X.2pV r0 = X.C52482pV.TRAY_FAVORITES
                if (r1 != r0) goto L_0x0020
                X.3QU r0 = r5
                boolean r0 = r0.A08
                if (r0 == 0) goto L_0x0020
                com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel r0 = r7
                X.1AP r1 = r0.A07
                X.6c4 r0 = r4
                java.util.List r0 = X.C36371kC.A11(r0)
                r1.A0E(r0)
            L_0x0020:
                X.3QU r0 = r5
                boolean r0 = r0.A0B
                if (r0 == 0) goto L_0x005c
                X.6c4 r5 = r4
                java.lang.String r4 = r5.A0E
                if (r4 == 0) goto L_0x005c
                com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel r3 = r7
                X.005 r0 = r3.A0F
                java.lang.Object r0 = r0.get()
                X.5Ar r0 = (X.C104665Ar) r0
                android.util.Pair r0 = r0.A0C(r4)
                if (r0 == 0) goto L_0x0068
                java.lang.Object r0 = r0.second
                X.AnonymousClass00C.A07(r0)
                long r1 = X.C36431kI.A09(r0)
            L_0x0045:
                X.196 r0 = r3.A03
                java.util.Set r2 = r0.A0B(r4, r1)
                r0 = 1
                X.4YK r1 = new X.4YK
                r1.<init>(r2, r3, r0)
                X.005 r0 = r3.A0F
                java.lang.Object r0 = r0.get()
                X.5Ar r0 = (X.C104665Ar) r0
                r0.A0J(r1, r5)
            L_0x005c:
                com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel r0 = r7
                X.1Rs r1 = r0.A09
                X.2fU r0 = X.C47702fU.A00
                r1.A0C(r0)
                X.0AJ r0 = X.AnonymousClass0AJ.A00
                return r0
            L_0x0068:
                r1 = 0
                goto L_0x0045
            L_0x006b:
                java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel$removeSticker$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerInfoViewModel$removeSticker$1(C135066c4 r2, AnonymousClass3QU r3, C52482pV r4, StickerInfoViewModel stickerInfoViewModel, C023509x r6) {
        super(2, r6);
        this.this$0 = stickerInfoViewModel;
        this.$origin = r4;
        this.$stickerInfo = r3;
        this.$sticker = r2;
    }

    public final C023509x create(Object obj, C023509x r8) {
        StickerInfoViewModel stickerInfoViewModel = this.this$0;
        C52482pV r3 = this.$origin;
        return new StickerInfoViewModel$removeSticker$1(this.$sticker, this.$stickerInfo, r3, stickerInfoViewModel, r8);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r2 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            final StickerInfoViewModel stickerInfoViewModel = this.this$0;
            C005502l r0 = stickerInfoViewModel.A0H;
            final C52482pV r6 = this.$origin;
            final AnonymousClass3QU r5 = this.$stickerInfo;
            final C135066c4 r4 = this.$sticker;
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
        return ((StickerInfoViewModel$removeSticker$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
