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
import X.C52482pV;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel$sendSticker$1", f = "StickerInfoViewModel.kt", i = {}, l = {215}, m = "invokeSuspend", n = {}, s = {})
public final class StickerInfoViewModel$sendSticker$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass11F $chatJid;
    public final /* synthetic */ C52482pV $origin;
    public final /* synthetic */ C135066c4 $sticker;
    public int label;
    public final /* synthetic */ StickerInfoViewModel this$0;

    @DebugMetadata(c = "com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel$sendSticker$1$1", f = "StickerInfoViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel$sendSticker$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public int label;

        public final C023509x create(Object obj, C023509x r8) {
            AnonymousClass11F r1 = AnonymousClass11F.this;
            StickerInfoViewModel stickerInfoViewModel = stickerInfoViewModel;
            return new AnonymousClass1(r5, r6, stickerInfoViewModel, r8);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0043, code lost:
            if (r1 == 4) goto L_0x0045;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                int r0 = r8.label
                if (r0 != 0) goto L_0x0052
                X.AnonymousClass0AN.A00(r9)
                X.11F r7 = X.AnonymousClass11F.this
                if (r7 == 0) goto L_0x001f
                com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel r2 = r7
                X.2pV r0 = r6
                int r1 = r0.ordinal()
                r6 = 4
                r5 = 3
                r0 = 1
                if (r1 == r0) goto L_0x002b
                r0 = 2
                if (r1 == r0) goto L_0x002b
                if (r1 == r5) goto L_0x002b
                if (r1 == r6) goto L_0x002b
            L_0x001f:
                com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel r0 = r7
                X.1Rs r1 = r0.A09
                X.2fT r0 = X.C47692fT.A00
            L_0x0025:
                r1.A0C(r0)
                X.0AJ r0 = X.AnonymousClass0AJ.A00
                return r0
            L_0x002b:
                X.1X4 r4 = r2.A02
                X.6c4 r3 = r5
                java.util.List r2 = X.C36371kC.A11(r7)
                X.2pV r0 = r6
                int r1 = r0.ordinal()
                r0 = 1
                if (r1 == r0) goto L_0x0050
                r0 = 2
                if (r1 == r0) goto L_0x0046
                if (r1 == r5) goto L_0x0045
                r0 = 4
                r6 = -1
                if (r1 != r0) goto L_0x0046
            L_0x0045:
                r6 = 1
            L_0x0046:
                r4.A0B(r3, r2, r6)
                com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel r0 = r7
                X.1Rs r1 = r0.A09
                X.2fV r0 = X.C47712fV.A00
                goto L_0x0025
            L_0x0050:
                r6 = 3
                goto L_0x0046
            L_0x0052:
                java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel$sendSticker$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerInfoViewModel$sendSticker$1(AnonymousClass11F r2, C135066c4 r3, C52482pV r4, StickerInfoViewModel stickerInfoViewModel, C023509x r6) {
        super(2, r6);
        this.this$0 = stickerInfoViewModel;
        this.$chatJid = r2;
        this.$origin = r4;
        this.$sticker = r3;
    }

    public final C023509x create(Object obj, C023509x r8) {
        StickerInfoViewModel stickerInfoViewModel = this.this$0;
        return new StickerInfoViewModel$sendSticker$1(this.$chatJid, this.$sticker, this.$origin, stickerInfoViewModel, r8);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r2 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            final StickerInfoViewModel stickerInfoViewModel = this.this$0;
            C005502l r0 = stickerInfoViewModel.A0H;
            final AnonymousClass11F r4 = this.$chatJid;
            final C52482pV r6 = this.$origin;
            final C135066c4 r5 = this.$sticker;
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
        return ((StickerInfoViewModel$sendSticker$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
