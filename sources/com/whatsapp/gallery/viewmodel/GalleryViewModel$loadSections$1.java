package com.whatsapp.gallery.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C005502l;
import X.C006302t;
import X.C009003v;
import X.C023509x;
import X.C145646uI;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.gallery.viewmodel.GalleryViewModel$loadSections$1", f = "GalleryViewModel.kt", i = {}, l = {144}, m = "invokeSuspend", n = {}, s = {})
public final class GalleryViewModel$loadSections$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C006302t $cursorCallback;
    public final /* synthetic */ String $logName;
    public final /* synthetic */ C145646uI $timeBucketsProvider;
    public int label;
    public final /* synthetic */ GalleryViewModel this$0;

    @DebugMetadata(c = "com.whatsapp.gallery.viewmodel.GalleryViewModel$loadSections$1$1", f = "GalleryViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.gallery.viewmodel.GalleryViewModel$loadSections$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public int label;

        public final C023509x create(Object obj, C023509x r8) {
            GalleryViewModel galleryViewModel = galleryViewModel;
            C006302t r5 = r8;
            return new AnonymousClass1(r4, galleryViewModel, str, r8, r5);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:40:0x009f, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
            X.C05600Qi.A00(r6, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a3, code lost:
            throw r0;
         */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x008b A[EDGE_INSN: B:56:0x008b->B:30:0x008b ?: BREAK  , SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                int r0 = r14.label
                if (r0 != 0) goto L_0x00d0
                X.AnonymousClass0AN.A00(r15)
                com.whatsapp.gallery.viewmodel.GalleryViewModel r0 = r5     // Catch:{ 02S -> 0x00a8, SQLiteDiskIOException -> 0x00ac, CancellationException -> 0x00a4 }
                X.0Bk r1 = new X.0Bk     // Catch:{ 02S -> 0x00a8, SQLiteDiskIOException -> 0x00ac, CancellationException -> 0x00a4 }
                r1.<init>()     // Catch:{ 02S -> 0x00a8, SQLiteDiskIOException -> 0x00ac, CancellationException -> 0x00a4 }
                r0.A00 = r1     // Catch:{ 02S -> 0x00a8, SQLiteDiskIOException -> 0x00ac, CancellationException -> 0x00a4 }
                X.02t r0 = r8     // Catch:{ 02S -> 0x00a8, SQLiteDiskIOException -> 0x00ac, CancellationException -> 0x00a4 }
                java.lang.Object r6 = r0.invoke(r1)     // Catch:{ 02S -> 0x00a8, SQLiteDiskIOException -> 0x00ac, CancellationException -> 0x00a4 }
                java.io.Closeable r6 = (java.io.Closeable) r6     // Catch:{ 02S -> 0x00a8, SQLiteDiskIOException -> 0x00ac, CancellationException -> 0x00a4 }
                com.whatsapp.gallery.viewmodel.GalleryViewModel r8 = r5     // Catch:{ 02S -> 0x00a8, SQLiteDiskIOException -> 0x00ac, CancellationException -> 0x00a4 }
                X.6uI r9 = r4     // Catch:{ 02S -> 0x00a8, SQLiteDiskIOException -> 0x00ac, CancellationException -> 0x00a4 }
                r7 = r6
                android.database.Cursor r7 = (android.database.Cursor) r7     // Catch:{ all -> 0x009d }
                int r0 = r7.getCount()     // Catch:{ all -> 0x009d }
                if (r0 == 0) goto L_0x0097
                long r12 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x009d }
                r5 = 0
                java.util.ArrayList r4 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x009d }
                r7.moveToFirst()     // Catch:{ all -> 0x009d }
                r3 = 0
            L_0x0032:
                boolean r0 = r7 instanceof X.C36691l9     // Catch:{ all -> 0x009d }
                if (r0 == 0) goto L_0x003e
                r0 = r7
                X.1l9 r0 = (X.C36691l9) r0     // Catch:{ all -> 0x009d }
                X.2bU r0 = r0.A02()     // Catch:{ all -> 0x009d }
                goto L_0x0044
            L_0x003e:
                X.1A1 r0 = r8.A05     // Catch:{ all -> 0x009d }
                X.3T1 r0 = r0.A00(r7)     // Catch:{ all -> 0x009d }
            L_0x0044:
                if (r0 != 0) goto L_0x0049
                if (r5 == 0) goto L_0x008e
                goto L_0x008b
            L_0x0049:
                long r0 = r0.A0I     // Catch:{ all -> 0x009d }
                X.78x r1 = r9.A00(r0)     // Catch:{ all -> 0x009d }
                if (r5 == 0) goto L_0x005a
                boolean r0 = r5.equals(r1)     // Catch:{ all -> 0x009d }
                if (r0 != 0) goto L_0x005e
                r4.add(r5)     // Catch:{ all -> 0x009d }
            L_0x005a:
                r0 = 0
                r1.bucketCount = r0     // Catch:{ all -> 0x009d }
                r5 = r1
            L_0x005e:
                int r0 = r5.bucketCount     // Catch:{ all -> 0x009d }
                int r0 = r0 + 1
                r5.bucketCount = r0     // Catch:{ all -> 0x009d }
                boolean r0 = X.C36411kG.A1a(r4)     // Catch:{ all -> 0x009d }
                if (r0 == 0) goto L_0x0085
                r10 = 1000(0x3e8, double:4.94E-321)
                long r10 = r10 + r12
                long r1 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x009d }
                int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
                if (r0 >= 0) goto L_0x0085
                long r12 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x009d }
                java.util.ArrayList r0 = X.C36441kJ.A15(r4)     // Catch:{ all -> 0x009d }
                r4.clear()     // Catch:{ all -> 0x009d }
                int r0 = com.whatsapp.gallery.viewmodel.GalleryViewModel.A01(r8, r0, r3)     // Catch:{ all -> 0x009d }
                int r3 = r3 + r0
            L_0x0085:
                boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x009d }
                if (r0 != 0) goto L_0x0032
            L_0x008b:
                r4.add(r5)     // Catch:{ all -> 0x009d }
            L_0x008e:
                boolean r0 = X.C36411kG.A1a(r4)     // Catch:{ all -> 0x009d }
                if (r0 == 0) goto L_0x0097
                com.whatsapp.gallery.viewmodel.GalleryViewModel.A01(r8, r4, r3)     // Catch:{ all -> 0x009d }
            L_0x0097:
                if (r6 == 0) goto L_0x00ba
                r6.close()     // Catch:{ 02S -> 0x00a8, SQLiteDiskIOException -> 0x00ac, CancellationException -> 0x00a4 }
                goto L_0x00ba
            L_0x009d:
                r1 = move-exception
                throw r1     // Catch:{ all -> 0x009f }
            L_0x009f:
                r0 = move-exception
                X.C05600Qi.A00(r6, r1)     // Catch:{ 02S -> 0x00a8, SQLiteDiskIOException -> 0x00ac, CancellationException -> 0x00a4 }
                throw r0     // Catch:{ 02S -> 0x00a8, SQLiteDiskIOException -> 0x00ac, CancellationException -> 0x00a4 }
            L_0x00a4:
                r2 = move-exception
                java.lang.String r0 = "GalleryViewModel/CancellationException/error"
                goto L_0x00b7
            L_0x00a8:
                r2 = move-exception
                java.lang.String r0 = "GalleryViewModel/OperationCanceledException/error"
                goto L_0x00b7
            L_0x00ac:
                r2 = move-exception
                com.whatsapp.gallery.viewmodel.GalleryViewModel r0 = r5
                X.12T r1 = r0.A04
                r0 = 1
                r1.A00(r0)
                java.lang.String r0 = "GalleryViewModel/SQLiteDiskIOException/error"
            L_0x00b7:
                com.whatsapp.util.Log.e(r0, r2)
            L_0x00ba:
                java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
                java.lang.String r0 = "GalleryViewModel/"
                r1.append(r0)
                java.lang.String r0 = r6
                r1.append(r0)
                java.lang.String r0 = "/all buckets assigned"
                X.C36321k7.A1a(r1, r0)
                X.0AJ r0 = X.AnonymousClass0AJ.A00
                return r0
            L_0x00d0:
                java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallery.viewmodel.GalleryViewModel$loadSections$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GalleryViewModel$loadSections$1(C145646uI r2, GalleryViewModel galleryViewModel, String str, C023509x r5, C006302t r6) {
        super(2, r5);
        this.this$0 = galleryViewModel;
        this.$cursorCallback = r6;
        this.$logName = str;
        this.$timeBucketsProvider = r2;
    }

    public final C023509x create(Object obj, C023509x r8) {
        GalleryViewModel galleryViewModel = this.this$0;
        C006302t r5 = this.$cursorCallback;
        return new GalleryViewModel$loadSections$1(this.$timeBucketsProvider, galleryViewModel, this.$logName, r8, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r2 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            final GalleryViewModel galleryViewModel = this.this$0;
            C005502l r0 = galleryViewModel.A06;
            final C006302t r8 = this.$cursorCallback;
            final String str = this.$logName;
            final C145646uI r4 = this.$timeBucketsProvider;
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
        return ((GalleryViewModel$loadSections$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
