package com.whatsapp.gallerypicker.viewmodels;

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
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$loadFolders$1", f = "GalleryPickerViewModel.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
public final class GalleryPickerViewModel$loadFolders$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ int $approxFirstPageThumbCount;
    public final /* synthetic */ int $includeMediaTypes;
    public int label;
    public final /* synthetic */ GalleryPickerViewModel this$0;

    @DebugMetadata(c = "com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$loadFolders$1$1", f = "GalleryPickerViewModel.kt", i = {0, 1, 2, 3}, l = {115, 120, 122, 125}, m = "invokeSuspend", n = {"bucketsCollector", "bucketsCollector", "bucketsCollector", "bucketsCollector"}, s = {"L$0", "L$0", "L$0", "L$0"})
    /* renamed from: com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$loadFolders$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public Object L$0;
        public int label;

        public final C023509x create(Object obj, C023509x r6) {
            return new AnonymousClass1(r6, i2, i3);
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0065 A[Catch:{ CancellationException -> 0x008a }, RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0077 A[Catch:{ CancellationException -> 0x008a }, RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                X.0AO r4 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
                int r0 = r8.label
                r5 = 4
                r7 = 3
                r6 = 2
                r2 = 1
                if (r0 == 0) goto L_0x002b
                if (r0 == r2) goto L_0x0026
                if (r0 == r6) goto L_0x0021
                if (r0 == r7) goto L_0x001c
                if (r0 != r5) goto L_0x0017
                java.lang.Object r3 = r8.L$0
                com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$BucketsCollector r3 = (com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.BucketsCollector) r3
                goto L_0x0078
            L_0x0017:
                java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
                throw r0
            L_0x001c:
                java.lang.Object r3 = r8.L$0
                com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$BucketsCollector r3 = (com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.BucketsCollector) r3
                goto L_0x0066
            L_0x0021:
                java.lang.Object r3 = r8.L$0
                com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$BucketsCollector r3 = (com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.BucketsCollector) r3
                goto L_0x0054
            L_0x0026:
                java.lang.Object r3 = r8.L$0
                com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$BucketsCollector r3 = (com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.BucketsCollector) r3
                goto L_0x0044
            L_0x002b:
                X.AnonymousClass0AN.A00(r9)
                com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel r1 = com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.this     // Catch:{ CancellationException -> 0x008a }
                int r0 = r3     // Catch:{ CancellationException -> 0x008a }
                com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$BucketsCollector r3 = new com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$BucketsCollector     // Catch:{ CancellationException -> 0x008a }
                r3.<init>(r0)     // Catch:{ CancellationException -> 0x008a }
                int r0 = r2     // Catch:{ CancellationException -> 0x008a }
                r8.L$0 = r3     // Catch:{ CancellationException -> 0x008a }
                r8.label = r2     // Catch:{ CancellationException -> 0x008a }
                java.lang.Object r0 = com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.A03(r3, r1, r8, r0)     // Catch:{ CancellationException -> 0x008a }
                if (r0 != r4) goto L_0x0047
                return r4
            L_0x0044:
                X.AnonymousClass0AN.A00(r9)     // Catch:{ CancellationException -> 0x008a }
            L_0x0047:
                com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel r0 = com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.this     // Catch:{ CancellationException -> 0x008a }
                r8.L$0 = r3     // Catch:{ CancellationException -> 0x008a }
                r8.label = r6     // Catch:{ CancellationException -> 0x008a }
                java.lang.Object r0 = com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.A02(r3, r0, r8)     // Catch:{ CancellationException -> 0x008a }
                if (r0 != r4) goto L_0x0057
                return r4
            L_0x0054:
                X.AnonymousClass0AN.A00(r9)     // Catch:{ CancellationException -> 0x008a }
            L_0x0057:
                com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel r1 = com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.this     // Catch:{ CancellationException -> 0x008a }
                int r0 = r2     // Catch:{ CancellationException -> 0x008a }
                r8.L$0 = r3     // Catch:{ CancellationException -> 0x008a }
                r8.label = r7     // Catch:{ CancellationException -> 0x008a }
                java.lang.Object r0 = com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.A04(r3, r1, r8, r0)     // Catch:{ CancellationException -> 0x008a }
                if (r0 != r4) goto L_0x0069
                return r4
            L_0x0066:
                X.AnonymousClass0AN.A00(r9)     // Catch:{ CancellationException -> 0x008a }
            L_0x0069:
                com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel r1 = com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.this     // Catch:{ CancellationException -> 0x008a }
                int r0 = r2     // Catch:{ CancellationException -> 0x008a }
                r8.L$0 = r3     // Catch:{ CancellationException -> 0x008a }
                r8.label = r5     // Catch:{ CancellationException -> 0x008a }
                java.lang.Object r0 = com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.A05(r3, r1, r8, r0)     // Catch:{ CancellationException -> 0x008a }
                if (r0 != r4) goto L_0x007b
                return r4
            L_0x0078:
                X.AnonymousClass0AN.A00(r9)     // Catch:{ CancellationException -> 0x008a }
            L_0x007b:
                com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel r0 = com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.this     // Catch:{ CancellationException -> 0x008a }
                X.00s r2 = r0.A01     // Catch:{ CancellationException -> 0x008a }
                java.util.List r1 = r3.A02     // Catch:{ CancellationException -> 0x008a }
                X.59G r0 = new X.59G     // Catch:{ CancellationException -> 0x008a }
                r0.<init>(r1)     // Catch:{ CancellationException -> 0x008a }
                r2.A0C(r0)     // Catch:{ CancellationException -> 0x008a }
                goto L_0x0090
            L_0x008a:
                r1 = move-exception
                java.lang.String r0 = "GalleryPickerViewModel/loadFolders/error"
                com.whatsapp.util.Log.e(r0, r1)
            L_0x0090:
                X.0AJ r0 = X.AnonymousClass0AJ.A00
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$loadFolders$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GalleryPickerViewModel$loadFolders$1(GalleryPickerViewModel galleryPickerViewModel, C023509x r3, int i, int i2) {
        super(2, r3);
        this.this$0 = galleryPickerViewModel;
        this.$approxFirstPageThumbCount = i;
        this.$includeMediaTypes = i2;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new GalleryPickerViewModel$loadFolders$1(this.this$0, r6, this.$approxFirstPageThumbCount, this.$includeMediaTypes);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r7 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            final GalleryPickerViewModel galleryPickerViewModel = this.this$0;
            C005502l r4 = galleryPickerViewModel.A04;
            final int i2 = this.$approxFirstPageThumbCount;
            final int i3 = this.$includeMediaTypes;
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
        return ((GalleryPickerViewModel$loadFolders$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
