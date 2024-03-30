package com.whatsapp.gallery.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass4O5;
import X.C005502l;
import X.C009003v;
import X.C023509x;
import X.C87774Qc;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.gallery.viewmodel.MediaGalleryFragmentViewModel$loadSections$1", f = "MediaGalleryFragmentViewModel.kt", i = {}, l = {163}, m = "invokeSuspend", n = {}, s = {})
public final class MediaGalleryFragmentViewModel$loadSections$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ int $approxFirstPageThumbCount;
    public final /* synthetic */ AnonymousClass4O5 $bucketsProvider;
    public final /* synthetic */ C87774Qc $mediaListCreator;
    public final /* synthetic */ List $sectionBuckets;
    public final /* synthetic */ boolean $unmounted;
    public int label;
    public final /* synthetic */ MediaGalleryFragmentViewModel this$0;

    @DebugMetadata(c = "com.whatsapp.gallery.viewmodel.MediaGalleryFragmentViewModel$loadSections$1$1", f = "MediaGalleryFragmentViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.gallery.viewmodel.MediaGalleryFragmentViewModel$loadSections$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public int label;

        public final C023509x create(Object obj, C023509x r10) {
            MediaGalleryFragmentViewModel mediaGalleryFragmentViewModel = mediaGalleryFragmentViewModel;
            boolean z = z;
            return new AnonymousClass1(r4, r5, mediaGalleryFragmentViewModel, list, r10, i2, z);
        }

        /* JADX WARNING: Removed duplicated region for block: B:27:0x00c9 A[Catch:{ CancellationException -> 0x011d }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                r20 = this;
                r3 = r20
                int r0 = r3.label
                if (r0 != 0) goto L_0x0126
                X.AnonymousClass0AN.A00(r21)
                com.whatsapp.gallery.viewmodel.MediaGalleryFragmentViewModel r0 = r6     // Catch:{ CancellationException -> 0x011d }
                X.005 r0 = r0.A07     // Catch:{ CancellationException -> 0x011d }
                java.lang.Object r8 = r0.get()     // Catch:{ CancellationException -> 0x011d }
                X.3NP r8 = (X.AnonymousClass3NP) r8     // Catch:{ CancellationException -> 0x011d }
                boolean r2 = r10     // Catch:{ CancellationException -> 0x011d }
                int r13 = r9     // Catch:{ CancellationException -> 0x011d }
                X.4O5 r12 = r4     // Catch:{ CancellationException -> 0x011d }
                X.4Qc r1 = r5     // Catch:{ CancellationException -> 0x011d }
                java.util.List r7 = r7     // Catch:{ CancellationException -> 0x011d }
                com.whatsapp.gallery.viewmodel.MediaGalleryFragmentViewModel r0 = r6     // Catch:{ CancellationException -> 0x011d }
                X.4K7 r11 = new X.4K7     // Catch:{ CancellationException -> 0x011d }
                r11.<init>(r0)     // Catch:{ CancellationException -> 0x011d }
                X.4Bp r6 = new X.4Bp     // Catch:{ CancellationException -> 0x011d }
                r6.<init>(r0)     // Catch:{ CancellationException -> 0x011d }
                X.4Bq r5 = new X.4Bq     // Catch:{ CancellationException -> 0x011d }
                r5.<init>(r0)     // Catch:{ CancellationException -> 0x011d }
                X.C36321k7.A12(r12, r1, r7)     // Catch:{ CancellationException -> 0x011d }
                r0 = 0
                r8.A00 = r0     // Catch:{ CancellationException -> 0x011d }
                r0 = r2 ^ 1
                X.4Uo r4 = r1.B4h(r0)     // Catch:{ CancellationException -> 0x011d }
                int r10 = r4.getCount()     // Catch:{ CancellationException -> 0x011d }
                long r18 = android.os.SystemClock.uptimeMillis()     // Catch:{ CancellationException -> 0x011d }
                r9 = 0
                java.util.ArrayList r3 = X.AnonymousClass001.A0I()     // Catch:{ CancellationException -> 0x011d }
                r2 = 0
            L_0x0048:
                if (r2 >= r10) goto L_0x00e5
                X.4V2 r15 = r4.BDy(r2)     // Catch:{ CancellationException -> 0x011d }
                if (r15 == 0) goto L_0x00e5
                int r0 = r13 + -1
                if (r2 != r0) goto L_0x007e
                if (r9 == 0) goto L_0x007e
                java.util.ArrayList r1 = X.AnonymousClass001.A0I()     // Catch:{ CancellationException -> 0x011d }
                r1.addAll(r3)     // Catch:{ CancellationException -> 0x011d }
                X.78x r0 = r9.A00()     // Catch:{ CancellationException -> 0x011d }
                r0.bucketCount = r10     // Catch:{ CancellationException -> 0x011d }
                r1.add(r0)     // Catch:{ CancellationException -> 0x011d }
                long r18 = android.os.SystemClock.uptimeMillis()     // Catch:{ CancellationException -> 0x011d }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r10)     // Catch:{ CancellationException -> 0x011d }
                r11.invoke(r0)     // Catch:{ CancellationException -> 0x011d }
                int r0 = r8.A00     // Catch:{ CancellationException -> 0x011d }
                if (r0 != 0) goto L_0x007b
                r1.size()     // Catch:{ CancellationException -> 0x011d }
                r7.addAll(r1)     // Catch:{ CancellationException -> 0x011d }
            L_0x007b:
                r6.invoke()     // Catch:{ CancellationException -> 0x011d }
            L_0x007e:
                r14 = r12
                X.6uI r14 = (X.C145646uI) r14     // Catch:{ CancellationException -> 0x011d }
                long r0 = r15.BAn()     // Catch:{ CancellationException -> 0x011d }
                X.78x r1 = r14.A00(r0)     // Catch:{ CancellationException -> 0x011d }
                if (r9 == 0) goto L_0x0094
                boolean r0 = r9.equals(r1)     // Catch:{ CancellationException -> 0x011d }
                if (r0 != 0) goto L_0x0098
                r3.add(r9)     // Catch:{ CancellationException -> 0x011d }
            L_0x0094:
                r0 = 0
                r1.bucketCount = r0     // Catch:{ CancellationException -> 0x011d }
                r9 = r1
            L_0x0098:
                int r0 = r9.bucketCount     // Catch:{ CancellationException -> 0x011d }
                int r0 = r0 + 1
                r9.bucketCount = r0     // Catch:{ CancellationException -> 0x011d }
                boolean r0 = X.C36411kG.A1a(r3)     // Catch:{ CancellationException -> 0x011d }
                if (r0 == 0) goto L_0x00e1
                r0 = 1000(0x3e8, double:4.94E-321)
                long r16 = r18 + r0
                long r14 = android.os.SystemClock.uptimeMillis()     // Catch:{ CancellationException -> 0x011d }
                int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
                if (r0 >= 0) goto L_0x00e1
                long r18 = android.os.SystemClock.uptimeMillis()     // Catch:{ CancellationException -> 0x011d }
                java.util.ArrayList r14 = X.AnonymousClass001.A0I()     // Catch:{ CancellationException -> 0x011d }
                r14.addAll(r3)     // Catch:{ CancellationException -> 0x011d }
                r3.clear()     // Catch:{ CancellationException -> 0x011d }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r10)     // Catch:{ CancellationException -> 0x011d }
                r11.invoke(r0)     // Catch:{ CancellationException -> 0x011d }
                int r0 = r8.A00     // Catch:{ CancellationException -> 0x011d }
                if (r0 != 0) goto L_0x00cf
                r14.size()     // Catch:{ CancellationException -> 0x011d }
                r7.clear()     // Catch:{ CancellationException -> 0x011d }
            L_0x00cf:
                r14.size()     // Catch:{ CancellationException -> 0x011d }
                int r1 = r8.A00     // Catch:{ CancellationException -> 0x011d }
                int r0 = r14.size()     // Catch:{ CancellationException -> 0x011d }
                int r1 = r1 + r0
                r8.A00 = r1     // Catch:{ CancellationException -> 0x011d }
                r7.addAll(r14)     // Catch:{ CancellationException -> 0x011d }
                r6.invoke()     // Catch:{ CancellationException -> 0x011d }
            L_0x00e1:
                int r2 = r2 + 1
                goto L_0x0048
            L_0x00e5:
                if (r9 == 0) goto L_0x00ea
                r3.add(r9)     // Catch:{ CancellationException -> 0x011d }
            L_0x00ea:
                boolean r0 = X.C36411kG.A1a(r3)     // Catch:{ CancellationException -> 0x011d }
                if (r0 == 0) goto L_0x0113
                java.lang.Integer r0 = java.lang.Integer.valueOf(r10)     // Catch:{ CancellationException -> 0x011d }
                r11.invoke(r0)     // Catch:{ CancellationException -> 0x011d }
                int r0 = r8.A00     // Catch:{ CancellationException -> 0x011d }
                if (r0 != 0) goto L_0x0101
                r3.size()     // Catch:{ CancellationException -> 0x011d }
                r7.clear()     // Catch:{ CancellationException -> 0x011d }
            L_0x0101:
                r3.size()     // Catch:{ CancellationException -> 0x011d }
                int r1 = r8.A00     // Catch:{ CancellationException -> 0x011d }
                int r0 = r3.size()     // Catch:{ CancellationException -> 0x011d }
                int r1 = r1 + r0
                r8.A00 = r1     // Catch:{ CancellationException -> 0x011d }
                r7.addAll(r3)     // Catch:{ CancellationException -> 0x011d }
                r6.invoke()     // Catch:{ CancellationException -> 0x011d }
            L_0x0113:
                r4.getCount()     // Catch:{ CancellationException -> 0x011d }
                r4.close()     // Catch:{ CancellationException -> 0x011d }
                r5.invoke()     // Catch:{ CancellationException -> 0x011d }
                goto L_0x0123
            L_0x011d:
                r1 = move-exception
                java.lang.String r0 = "MediaGalleryFragmentViewModel/CancellationException/loadSections/error"
                com.whatsapp.util.Log.e(r0, r1)
            L_0x0123:
                X.0AJ r0 = X.AnonymousClass0AJ.A00
                return r0
            L_0x0126:
                java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallery.viewmodel.MediaGalleryFragmentViewModel$loadSections$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaGalleryFragmentViewModel$loadSections$1(AnonymousClass4O5 r2, C87774Qc r3, MediaGalleryFragmentViewModel mediaGalleryFragmentViewModel, List list, C023509x r6, int i, boolean z) {
        super(2, r6);
        this.this$0 = mediaGalleryFragmentViewModel;
        this.$unmounted = z;
        this.$approxFirstPageThumbCount = i;
        this.$bucketsProvider = r2;
        this.$mediaListCreator = r3;
        this.$sectionBuckets = list;
    }

    public final C023509x create(Object obj, C023509x r10) {
        MediaGalleryFragmentViewModel mediaGalleryFragmentViewModel = this.this$0;
        boolean z = this.$unmounted;
        return new MediaGalleryFragmentViewModel$loadSections$1(this.$bucketsProvider, this.$mediaListCreator, mediaGalleryFragmentViewModel, this.$sectionBuckets, r10, this.$approxFirstPageThumbCount, z);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r2 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            final MediaGalleryFragmentViewModel mediaGalleryFragmentViewModel = this.this$0;
            C005502l r0 = mediaGalleryFragmentViewModel.A08;
            final boolean z = this.$unmounted;
            final int i2 = this.$approxFirstPageThumbCount;
            final AnonymousClass4O5 r4 = this.$bucketsProvider;
            final C87774Qc r5 = this.$mediaListCreator;
            final List list = this.$sectionBuckets;
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
        return ((MediaGalleryFragmentViewModel$loadSections$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
