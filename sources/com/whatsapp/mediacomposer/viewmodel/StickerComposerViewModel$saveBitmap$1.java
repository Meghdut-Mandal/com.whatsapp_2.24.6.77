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
import android.net.Uri;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.mediacomposer.viewmodel.StickerComposerViewModel$saveBitmap$1", f = "StickerComposerViewModel.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
public final class StickerComposerViewModel$saveBitmap$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ Bitmap $bitmap;
    public final /* synthetic */ Uri $url;
    public int label;
    public final /* synthetic */ StickerComposerViewModel this$0;

    @DebugMetadata(c = "com.whatsapp.mediacomposer.viewmodel.StickerComposerViewModel$saveBitmap$1$1", f = "StickerComposerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.mediacomposer.viewmodel.StickerComposerViewModel$saveBitmap$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public int label;

        public final C023509x create(Object obj, C023509x r6) {
            return new AnonymousClass1(bitmap, uri, stickerComposerViewModel, r6);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0047, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
            X.C05600Qi.A00(r2, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x004b, code lost:
            throw r0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                int r0 = r5.label
                if (r0 != 0) goto L_0x0059
                X.AnonymousClass0AN.A00(r6)
                com.whatsapp.mediacomposer.viewmodel.StickerComposerViewModel r0 = r5     // Catch:{ FileNotFoundException -> 0x0050, CancellationException -> 0x004c }
                X.5my r1 = r0.A03     // Catch:{ FileNotFoundException -> 0x0050, CancellationException -> 0x004c }
                android.graphics.Bitmap r4 = r3     // Catch:{ FileNotFoundException -> 0x0050, CancellationException -> 0x004c }
                android.net.Uri r0 = r2     // Catch:{ FileNotFoundException -> 0x0050, CancellationException -> 0x004c }
                X.C36321k7.A0w(r4, r0)     // Catch:{ FileNotFoundException -> 0x0050, CancellationException -> 0x004c }
                X.0y0 r2 = r1.A00     // Catch:{ FileNotFoundException -> 0x0050, CancellationException -> 0x004c }
                java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ FileNotFoundException -> 0x0050, CancellationException -> 0x004c }
                java.lang.String r0 = r0.toString()     // Catch:{ FileNotFoundException -> 0x0050, CancellationException -> 0x004c }
                java.lang.String r0 = X.C18750th.A05(r0)     // Catch:{ FileNotFoundException -> 0x0050, CancellationException -> 0x004c }
                r1.append(r0)     // Catch:{ FileNotFoundException -> 0x0050, CancellationException -> 0x004c }
                java.lang.String r0 = "-sticker.png"
                java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ FileNotFoundException -> 0x0050, CancellationException -> 0x004c }
                java.io.File r3 = r2.A0X(r0)     // Catch:{ FileNotFoundException -> 0x0050, CancellationException -> 0x004c }
                java.io.FileOutputStream r2 = X.C90524aI.A0W(r3)     // Catch:{ FileNotFoundException -> 0x0050, CancellationException -> 0x004c }
                X.C90514aH.A1F(r4, r2)     // Catch:{ all -> 0x0045 }
                r2.close()     // Catch:{ FileNotFoundException -> 0x0050, CancellationException -> 0x004c }
                com.whatsapp.mediacomposer.viewmodel.StickerComposerViewModel r0 = r5     // Catch:{ FileNotFoundException -> 0x0050, CancellationException -> 0x004c }
                X.00s r1 = r0.A01     // Catch:{ FileNotFoundException -> 0x0050, CancellationException -> 0x004c }
                android.net.Uri r0 = r2     // Catch:{ FileNotFoundException -> 0x0050, CancellationException -> 0x004c }
                X.011 r0 = X.C36441kJ.A19(r0, r3)     // Catch:{ FileNotFoundException -> 0x0050, CancellationException -> 0x004c }
                r1.A0C(r0)     // Catch:{ FileNotFoundException -> 0x0050, CancellationException -> 0x004c }
                goto L_0x0056
            L_0x0045:
                r1 = move-exception
                throw r1     // Catch:{ all -> 0x0047 }
            L_0x0047:
                r0 = move-exception
                X.C05600Qi.A00(r2, r1)     // Catch:{ FileNotFoundException -> 0x0050, CancellationException -> 0x004c }
                throw r0     // Catch:{ FileNotFoundException -> 0x0050, CancellationException -> 0x004c }
            L_0x004c:
                r1 = move-exception
                java.lang.String r0 = "StickerComposerViewModel/saveBitmap/CancellationException"
                goto L_0x0053
            L_0x0050:
                r1 = move-exception
                java.lang.String r0 = "StickerComposerViewModel/saveBitmap/FileNotFoundException"
            L_0x0053:
                com.whatsapp.util.Log.e(r0, r1)
            L_0x0056:
                X.0AJ r0 = X.AnonymousClass0AJ.A00
                return r0
            L_0x0059:
                java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.viewmodel.StickerComposerViewModel$saveBitmap$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerComposerViewModel$saveBitmap$1(Bitmap bitmap, Uri uri, StickerComposerViewModel stickerComposerViewModel, C023509x r5) {
        super(2, r5);
        this.this$0 = stickerComposerViewModel;
        this.$bitmap = bitmap;
        this.$url = uri;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new StickerComposerViewModel$saveBitmap$1(this.$bitmap, this.$url, this.this$0, r6);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r7 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            final StickerComposerViewModel stickerComposerViewModel = this.this$0;
            C005502l r4 = stickerComposerViewModel.A04;
            final Bitmap bitmap = this.$bitmap;
            final Uri uri = this.$url;
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
        return ((StickerComposerViewModel$saveBitmap$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
