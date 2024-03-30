package com.whatsapp.stickers.info.bottomsheet;

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
import X.C135066c4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel$editSticker$1", f = "StickerInfoViewModel.kt", i = {}, l = {155}, m = "invokeSuspend", n = {}, s = {})
public final class StickerInfoViewModel$editSticker$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ int $origin;
    public final /* synthetic */ C135066c4 $sticker;
    public int label;
    public final /* synthetic */ StickerInfoViewModel this$0;

    @DebugMetadata(c = "com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel$editSticker$1$1", f = "StickerInfoViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel$editSticker$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public int label;

        public final C023509x create(Object obj, C023509x r6) {
            return new AnonymousClass1(r3, stickerInfoViewModel, r6, i2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:27:0x00aa, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ab, code lost:
            X.C05600Qi.A00(r2, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ae, code lost:
            throw r0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                int r0 = r7.label
                if (r0 != 0) goto L_0x00af
                X.AnonymousClass0AN.A00(r8)
                com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel r2 = r5
                X.6c4 r6 = r3
                java.lang.String r0 = r6.A0A
                r3 = 0
                if (r0 == 0) goto L_0x0038
                java.io.File r5 = new java.io.File
                r5.<init>(r0)
                boolean r0 = r5.exists()
                if (r0 == 0) goto L_0x0038
                boolean r0 = r6.A0N
                r4 = 512(0x200, float:7.175E-43)
                if (r0 == 0) goto L_0x0086
                X.005 r0 = r2.A0E
                java.lang.Object r1 = r0.get()
                X.1Ao r1 = (X.C23971Ao) r1
                java.lang.String r0 = r6.A0E
                android.graphics.Bitmap r5 = r1.A01(r5, r0, r4, r4)
            L_0x002f:
                if (r5 != 0) goto L_0x0053
                r4 = r3
            L_0x0032:
                if (r4 == 0) goto L_0x0038
                android.net.Uri r3 = android.net.Uri.fromFile(r4)
            L_0x0038:
                com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel r0 = r5
                if (r3 == 0) goto L_0x004b
                X.1Rs r2 = r0.A09
                int r1 = r2
                X.2fR r0 = new X.2fR
                r0.<init>(r3, r1)
                r2.A0C(r0)
            L_0x0048:
                X.0AJ r0 = X.AnonymousClass0AJ.A00
                return r0
            L_0x004b:
                X.1Rs r1 = r0.A09
                X.2fT r0 = X.C47692fT.A00
                r1.A0C(r0)
                goto L_0x0048
            L_0x0053:
                java.lang.String r0 = r6.A0E
                java.lang.String r0 = java.lang.String.valueOf(r0)
                java.lang.String r1 = X.C18750th.A05(r0)
                X.005 r0 = r2.A0D
                java.lang.Object r2 = r0.get()
                X.0y0 r2 = (X.C20690y0) r2
                java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r1)
                java.lang.String r0 = ".png"
                java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
                java.io.File r4 = r2.A0X(r0)
                java.io.FileOutputStream r2 = new java.io.FileOutputStream
                r2.<init>(r4)
                android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ all -> 0x00a8 }
                r0 = 100
                r5.compress(r1, r0, r2)     // Catch:{ all -> 0x00a8 }
                r2.close()
                r5.recycle()
                goto L_0x0032
            L_0x0086:
                java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
                java.lang.String r0 = r5.getAbsolutePath()
                r1.append(r0)
                java.lang.String r0 = "-webp-sticker"
                java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
                java.lang.String r1 = X.C18750th.A05(r0)
                X.005 r0 = r2.A0G
                java.lang.Object r0 = r0.get()
                X.1HB r0 = (X.AnonymousClass1HB) r0
                android.graphics.Bitmap r5 = r0.A06(r5, r1, r4, r4)
                goto L_0x002f
            L_0x00a8:
                r1 = move-exception
                throw r1     // Catch:{ all -> 0x00aa }
            L_0x00aa:
                r0 = move-exception
                X.C05600Qi.A00(r2, r1)
                throw r0
            L_0x00af:
                java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel$editSticker$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerInfoViewModel$editSticker$1(C135066c4 r2, StickerInfoViewModel stickerInfoViewModel, C023509x r4, int i) {
        super(2, r4);
        this.this$0 = stickerInfoViewModel;
        this.$sticker = r2;
        this.$origin = i;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new StickerInfoViewModel$editSticker$1(this.$sticker, this.this$0, r6, this.$origin);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r7 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            final StickerInfoViewModel stickerInfoViewModel = this.this$0;
            C005502l r4 = stickerInfoViewModel.A0H;
            final C135066c4 r3 = this.$sticker;
            final int i2 = this.$origin;
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
        return ((StickerInfoViewModel$editSticker$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
