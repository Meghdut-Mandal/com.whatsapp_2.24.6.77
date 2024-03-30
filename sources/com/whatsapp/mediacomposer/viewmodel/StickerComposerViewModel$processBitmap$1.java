package com.whatsapp.mediacomposer.viewmodel;

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
import android.graphics.Bitmap;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.mediacomposer.viewmodel.StickerComposerViewModel$processBitmap$1", f = "StickerComposerViewModel.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
public final class StickerComposerViewModel$processBitmap$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ Bitmap $bitmap;
    public int label;
    public final /* synthetic */ StickerComposerViewModel this$0;

    @DebugMetadata(c = "com.whatsapp.mediacomposer.viewmodel.StickerComposerViewModel$processBitmap$1$1", f = "StickerComposerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.mediacomposer.viewmodel.StickerComposerViewModel$processBitmap$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public int label;

        public final C023509x create(Object obj, C023509x r5) {
            return new AnonymousClass1(bitmap, stickerComposerViewModel, r5);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0043, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
            X.C05600Qi.A00(r2, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
            throw r0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                int r0 = r5.label
                if (r0 != 0) goto L_0x005f
                X.AnonymousClass0AN.A00(r6)
                r4 = 0
                android.graphics.Bitmap r0 = r2     // Catch:{ FileNotFoundException -> 0x004f, CancellationException -> 0x0048 }
                java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ FileNotFoundException -> 0x004f, CancellationException -> 0x0048 }
                java.lang.String r1 = X.C18750th.A05(r0)     // Catch:{ FileNotFoundException -> 0x004f, CancellationException -> 0x0048 }
                com.whatsapp.mediacomposer.viewmodel.StickerComposerViewModel r0 = r4     // Catch:{ FileNotFoundException -> 0x004f, CancellationException -> 0x0048 }
                X.0y0 r2 = r0.A02     // Catch:{ FileNotFoundException -> 0x004f, CancellationException -> 0x0048 }
                java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r1)     // Catch:{ FileNotFoundException -> 0x004f, CancellationException -> 0x0048 }
                java.lang.String r0 = ".png"
                java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ FileNotFoundException -> 0x004f, CancellationException -> 0x0048 }
                java.io.File r3 = r2.A0X(r0)     // Catch:{ FileNotFoundException -> 0x004f, CancellationException -> 0x0048 }
                java.io.FileOutputStream r2 = X.C90524aI.A0W(r3)     // Catch:{ FileNotFoundException -> 0x004f, CancellationException -> 0x0048 }
                android.graphics.Bitmap r0 = r2     // Catch:{ FileNotFoundException -> 0x004f, CancellationException -> 0x0048 }
                X.C90514aH.A1F(r0, r2)     // Catch:{ all -> 0x0041 }
                r2.close()     // Catch:{ FileNotFoundException -> 0x004f, CancellationException -> 0x0048 }
                android.graphics.Bitmap r0 = r2     // Catch:{ FileNotFoundException -> 0x004f, CancellationException -> 0x0048 }
                r0.recycle()     // Catch:{ FileNotFoundException -> 0x004f, CancellationException -> 0x0048 }
                com.whatsapp.mediacomposer.viewmodel.StickerComposerViewModel r0 = r4     // Catch:{ FileNotFoundException -> 0x004f, CancellationException -> 0x0048 }
                X.00s r1 = r0.A00     // Catch:{ FileNotFoundException -> 0x004f, CancellationException -> 0x0048 }
                android.net.Uri r0 = android.net.Uri.fromFile(r3)     // Catch:{ FileNotFoundException -> 0x004f, CancellationException -> 0x0048 }
                r1.A0C(r0)     // Catch:{ FileNotFoundException -> 0x004f, CancellationException -> 0x0048 }
                goto L_0x005c
            L_0x0041:
                r1 = move-exception
                throw r1     // Catch:{ all -> 0x0043 }
            L_0x0043:
                r0 = move-exception
                X.C05600Qi.A00(r2, r1)     // Catch:{ FileNotFoundException -> 0x004f, CancellationException -> 0x0048 }
                throw r0     // Catch:{ FileNotFoundException -> 0x004f, CancellationException -> 0x0048 }
            L_0x0048:
                r1 = move-exception
                java.lang.String r0 = "StickerComposerViewModel/processBitmap/CancellationException"
                com.whatsapp.util.Log.e(r0, r1)
                goto L_0x005c
            L_0x004f:
                r1 = move-exception
                java.lang.String r0 = "StickerComposerViewModel/processBitmap/FileNotFoundException"
                com.whatsapp.util.Log.e(r0, r1)
                com.whatsapp.mediacomposer.viewmodel.StickerComposerViewModel r0 = r4
                X.00s r0 = r0.A00
                r0.A0C(r4)
            L_0x005c:
                X.0AJ r0 = X.AnonymousClass0AJ.A00
                return r0
            L_0x005f:
                java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.viewmodel.StickerComposerViewModel$processBitmap$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerComposerViewModel$processBitmap$1(Bitmap bitmap, StickerComposerViewModel stickerComposerViewModel, C023509x r4) {
        super(2, r4);
        this.this$0 = stickerComposerViewModel;
        this.$bitmap = bitmap;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new StickerComposerViewModel$processBitmap$1(this.$bitmap, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            final StickerComposerViewModel stickerComposerViewModel = this.this$0;
            C005502l r3 = stickerComposerViewModel.A04;
            final Bitmap bitmap = this.$bitmap;
            AnonymousClass1 r0 = new AnonymousClass1((C023509x) null);
            this.label = 1;
            if (AnonymousClass0A2.A00(this, r3, r0) == r6) {
                return r6;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StickerComposerViewModel$processBitmap$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
