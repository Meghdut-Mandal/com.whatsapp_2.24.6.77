package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.facebook.animated.gif.GifImage;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.whatsapp.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.ATx  reason: case insensitive filesystem */
public class C21656ATx implements Closeable {
    public static final AnonymousClass9WW A04;
    public static final AnonymousClass9WW A05;
    public static final ExecutorService A06 = Executors.newSingleThreadExecutor();
    public static final AtomicBoolean A07 = C36431kI.A1H();
    public final GifImage A00;
    public final ParcelFileDescriptor A01;
    public final C202019ku A02;
    public final AnonymousClass87m A03;

    public static Bitmap A00(File file) {
        C21656ATx A012 = A01(ParcelFileDescriptor.open(file, 268435456), true);
        try {
            Bitmap A052 = A012.A05(0);
            A012.close();
            return A052;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public static C121665tW A03(ParcelFileDescriptor parcelFileDescriptor) {
        C21656ATx A012 = A01(parcelFileDescriptor, true);
        try {
            GifImage gifImage = A012.A00;
            C121665tW r0 = new C121665tW(gifImage.getWidth(), gifImage.getHeight(), gifImage.isAnimated());
            A012.close();
            return r0;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public Bitmap A05(int i) {
        boolean z = true;
        C18740tg.A0B(C36401kF.A1U(i));
        GifImage gifImage = this.A00;
        if (i >= gifImage.getFrameCount()) {
            z = false;
        }
        C18740tg.A0B(z);
        Bitmap createBitmap = Bitmap.createBitmap(gifImage.getWidth(), gifImage.getHeight(), Bitmap.Config.ARGB_8888);
        this.A02.A03(i, createBitmap);
        return createBitmap;
    }

    static {
        AnonymousClass9LJ r1 = new AnonymousClass9LJ();
        r1.A00 = ZipDecompressor.UNZIP_BUFFER_SIZE;
        r1.A03 = true;
        A05 = new AnonymousClass9WW(r1);
        AnonymousClass9LJ r12 = new AnonymousClass9LJ();
        r12.A00 = ZipDecompressor.UNZIP_BUFFER_SIZE;
        A04 = new AnonymousClass9WW(r12);
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0083 A[SYNTHETIC, Splitter:B:46:0x0083] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C21656ATx A01(android.os.ParcelFileDescriptor r5, boolean r6) {
        /*
            java.util.concurrent.atomic.AtomicBoolean r3 = A07
            boolean r0 = r3.get()
            if (r0 != 0) goto L_0x002f
            java.util.concurrent.ExecutorService r2 = A06
            boolean r0 = r2.isShutdown()
            if (r0 != 0) goto L_0x002f
            X.AYo r0 = X.C21736AYo.A00     // Catch:{ RejectedExecutionException -> 0x002f, InterruptedException | ExecutionException -> 0x0026 }
            java.util.concurrent.Future r0 = r2.submit(r0)     // Catch:{ RejectedExecutionException -> 0x002f, InterruptedException | ExecutionException -> 0x0026 }
            r1 = 0
            java.lang.Object r0 = r0.get()     // Catch:{ RejectedExecutionException -> 0x002f, InterruptedException | ExecutionException -> 0x0026 }
            boolean r0 = X.AnonymousClass000.A1X(r0)     // Catch:{ RejectedExecutionException -> 0x002f, InterruptedException | ExecutionException -> 0x0026 }
            r3.compareAndSet(r1, r0)     // Catch:{ RejectedExecutionException -> 0x002f, InterruptedException | ExecutionException -> 0x0026 }
            r2.shutdown()     // Catch:{ RejectedExecutionException -> 0x002f, InterruptedException | ExecutionException -> 0x0026 }
            goto L_0x002f
        L_0x0026:
            r2 = move-exception
            java.lang.String r1 = "Failed to initialize Fresco"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1, r2)
            throw r0
        L_0x002f:
            boolean r0 = r3.get()
            if (r0 == 0) goto L_0x0091
            r4 = 0
            int r3 = r5.getFd()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0075 }
            if (r6 == 0) goto L_0x0042
            X.9WW r2 = A05     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0075 }
        L_0x003e:
            java.lang.Class<com.facebook.animated.gif.GifImage> r1 = com.facebook.animated.gif.GifImage.class
            monitor-enter(r1)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0075 }
            goto L_0x0045
        L_0x0042:
            X.9WW r2 = A04     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0075 }
            goto L_0x003e
        L_0x0045:
            boolean r0 = com.facebook.animated.gif.GifImage.sInitialized     // Catch:{ all -> 0x0072 }
            if (r0 != 0) goto L_0x0056
            r0 = 1
            com.facebook.animated.gif.GifImage.sInitialized = r0     // Catch:{ all -> 0x0072 }
            java.lang.String r0 = "c++_shared"
            X.AnonymousClass10O.A00(r0)     // Catch:{ all -> 0x0072 }
            java.lang.String r0 = "gifimage"
            X.AnonymousClass10O.A00(r0)     // Catch:{ all -> 0x0072 }
        L_0x0056:
            monitor-exit(r1)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0075 }
            int r1 = r2.A00     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0075 }
            boolean r0 = r2.A03     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0075 }
            com.facebook.animated.gif.GifImage r3 = com.facebook.animated.gif.GifImage.nativeCreateFromFileDescriptor(r3, r1, r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0075 }
            X.9CG r0 = new X.9CG     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006f }
            r0.<init>(r3)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006f }
            X.87m r2 = new X.87m     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006f }
            r2.<init>(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x006f }
            X.ATx r0 = new X.ATx     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0078 }
            r0.<init>(r5, r3, r2)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0078 }
            return r0
        L_0x006f:
            r1 = move-exception
            r2 = r4
            goto L_0x0079
        L_0x0072:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0075 }
            throw r0     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0075 }
        L_0x0075:
            r1 = move-exception
            r2 = r4
            goto L_0x007e
        L_0x0078:
            r1 = move-exception
        L_0x0079:
            if (r3 == 0) goto L_0x007e
            r3.dispose()
        L_0x007e:
            X.AnonymousClass14X.A02(r2)
            if (r5 == 0) goto L_0x008b
            r5.close()     // Catch:{ all -> 0x0087 }
            goto L_0x008b
        L_0x0087:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x008b:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x0091:
            java.lang.String r0 = "Fresco failed to initialize"
            java.io.IOException r0 = X.C90524aI.A0X(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21656ATx.A01(android.os.ParcelFileDescriptor, boolean):X.ATx");
    }

    public static C121665tW A02(Uri uri, C24051Aw r4, C21050ya r5) {
        ParcelFileDescriptor A052;
        if (r5 != null) {
            r4.A02(uri);
            try {
                A052 = r5.A05(uri, "r");
                if (A052 != null) {
                    r4.A03(A052);
                    C121665tW A032 = A03(A052);
                    A052.close();
                    return A032;
                }
                throw C90524aI.A0X(AnonymousClass000.A0l(uri, "gifdecoder/getmetadata/cannot open uri, pfd=null, uri=", AnonymousClass000.A0u()));
            } catch (SecurityException e) {
                Log.e(AnonymousClass000.A0l(uri, "gifdecoder/getmetadata/failed to read uri ", AnonymousClass000.A0u()), e);
                throw new IOException(e);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            throw C90524aI.A0X("gifdecoder/getmetadata/cannot open uri, cr=null");
        }
        throw th;
    }

    public static C121665tW A04(File file) {
        ParcelFileDescriptor open = ParcelFileDescriptor.open(file, 268435456);
        try {
            C121665tW A032 = A03(open);
            if (open != null) {
                open.close();
            }
            return A032;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: X.A1K} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: X.A1J} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: X.A1K} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: X.A1K} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v6, resolved type: X.A1K} */
    /* JADX WARNING: type inference failed for: r11v5, types: [X.6kJ] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C91334bq A06(android.content.Context r23) {
        /*
            r22 = this;
            java.lang.Class<X.9Nz> r4 = X.C194069Nz.class
            monitor-enter(r4)
            X.9Nz r0 = X.C194069Nz.A08     // Catch:{ all -> 0x037c }
            boolean r0 = X.AnonymousClass000.A1V(r0)
            monitor-exit(r4)
            if (r0 != 0) goto L_0x0043
            android.content.Context r2 = r23.getApplicationContext()
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)
            X.9LK r1 = new X.9LK
            r1.<init>(r2)
            java.lang.Integer r0 = X.C36361kB.A0i()
            r1.A01 = r0
            X.9Oi r3 = new X.9Oi
            r3.<init>(r1)
            monitor-enter(r4)
            X.9Nz r0 = X.C194069Nz.A08     // Catch:{ all -> 0x037c }
            if (r0 == 0) goto L_0x003b
            java.lang.String r2 = "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior."
            X.7m1 r1 = X.C132886Vq.A00     // Catch:{ all -> 0x037c }
            r0 = 5
            boolean r0 = r1.BMH(r0)     // Catch:{ all -> 0x037c }
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r4.getSimpleName()     // Catch:{ all -> 0x037c }
            r1.BxN(r0, r2)     // Catch:{ all -> 0x037c }
        L_0x003b:
            X.9Nz r0 = new X.9Nz     // Catch:{ all -> 0x037c }
            r0.<init>(r3)     // Catch:{ all -> 0x037c }
            X.C194069Nz.A08 = r0     // Catch:{ all -> 0x037c }
            monitor-exit(r4)
        L_0x0043:
            X.9Nz r8 = X.C194069Nz.A08
            java.lang.String r0 = "ImagePipelineFactory was not initialized!"
            X.AnonymousClass6GV.A00(r8, r0)
            com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl r4 = r8.A00
            if (r4 != 0) goto L_0x0179
            X.6NZ r14 = r8.A01
            if (r14 != 0) goto L_0x00bc
            X.9Oi r1 = r8.A06
            X.9Gg r5 = r1.A08
            X.9Gh r0 = r8.A04
            if (r0 != 0) goto L_0x009c
            X.9JH r0 = r1.A06
            X.9Yu r7 = r0.A00
            r0 = 0
            X.AnonymousClass00C.A0D(r5, r0)
            int r9 = android.os.Build.VERSION.SDK_INT
            r6 = 26
            X.0rZ r4 = r5.A00
            if (r4 != 0) goto L_0x0079
            X.9Np r0 = r5.A01
            X.Avs r2 = r0.A00
            X.9cW r1 = r0.A01
            X.B41 r0 = r0.A03
            X.87q r4 = new X.87q
            r4.<init>(r2, r1, r0)
            r5.A00 = r4
        L_0x0079:
            X.9Np r0 = r5.A01
            X.9cW r0 = r0.A02
            int r3 = r0.A00
            X.07j r2 = new X.07j
            r2.<init>(r3)
            r1 = 0
        L_0x0085:
            if (r1 >= r3) goto L_0x0093
            r0 = 16384(0x4000, float:2.2959E-41)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r2.BnO(r0)
            int r1 = r1 + 1
            goto L_0x0085
        L_0x0093:
            if (r9 < r6) goto L_0x0108
            X.87u r0 = new X.87u
            r0.<init>(r2, r4, r7)
        L_0x009a:
            r8.A04 = r0
        L_0x009c:
            X.9CJ r4 = r8.A05
            r0 = 0
            X.C36321k7.A0v(r5, r0, r4)
            X.0rZ r3 = r5.A00
            if (r3 != 0) goto L_0x00b5
            X.9Np r0 = r5.A01
            X.Avs r2 = r0.A00
            X.9cW r1 = r0.A01
            X.B41 r0 = r0.A03
            X.87q r3 = new X.87q
            r3.<init>(r2, r1, r0)
            r5.A00 = r3
        L_0x00b5:
            X.87l r14 = new X.87l
            r14.<init>(r4, r3)
            r8.A01 = r14
        L_0x00bc:
            X.9Oi r0 = r8.A06
            X.Avv r13 = r0.A05
            X.B5Z r12 = r8.A03
            if (r12 != 0) goto L_0x00d6
            X.94H r3 = r0.A03
            X.AxL r2 = r0.A01
            X.Avu r1 = r0.A04
            X.A1W r0 = new X.A1W
            r0.<init>(r3)
            X.A1T r12 = new X.A1T
            r12.<init>(r2, r1, r0)
            r8.A03 = r12
        L_0x00d6:
            r0 = 40
            X.9M7 r11 = r8.A02
            if (r11 != 0) goto L_0x00f7
            long r1 = X.C165597tg.A0A()
            r3 = 100
            long r1 = r1 / r3
            long r3 = (long) r0
            long r1 = r1 * r3
            r3 = 1048576(0x100000, double:5.180654E-318)
            long r1 = r1 / r3
            int r0 = (int) r1
            X.9M7 r11 = X.AnonymousClass9M7.A04
            if (r11 != 0) goto L_0x00f5
            X.9M7 r11 = new X.9M7
            r11.<init>(r0)
            X.AnonymousClass9M7.A04 = r11
        L_0x00f5:
            r8.A02 = r11
        L_0x00f7:
            r20 = 0
            r19 = 0
            r10 = 10000(0x2710, float:1.4013E-41)
            r9 = 30
            r18 = 3
            boolean r0 = X.C1892892z.A01
            if (r0 != 0) goto L_0x016c
            r17 = 1
            goto L_0x010e
        L_0x0108:
            X.87t r0 = new X.87t
            r0.<init>(r2, r4)
            goto L_0x009a
        L_0x010e:
            java.lang.String r0 = "com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl"
            java.lang.Class r2 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x0166 }
            r7 = 9
            java.lang.Class[] r1 = new java.lang.Class[r7]     // Catch:{ all -> 0x0166 }
            java.lang.Class<X.6NZ> r0 = X.AnonymousClass6NZ.class
            r1[r19] = r0     // Catch:{ all -> 0x0166 }
            java.lang.Class<X.Avv> r0 = X.C22784Avv.class
            r1[r17] = r0     // Catch:{ all -> 0x0166 }
            java.lang.Class<X.B5Z> r0 = X.B5Z.class
            r16 = 2
            r1[r16] = r0     // Catch:{ all -> 0x0166 }
            java.lang.Class<X.9M7> r0 = X.AnonymousClass9M7.class
            r1[r18] = r0     // Catch:{ all -> 0x0166 }
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0166 }
            r15 = 4
            r1[r15] = r0     // Catch:{ all -> 0x0166 }
            r6 = 5
            r1[r6] = r0     // Catch:{ all -> 0x0166 }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0166 }
            r5 = 6
            r1[r5] = r0     // Catch:{ all -> 0x0166 }
            r4 = 7
            r1[r4] = r0     // Catch:{ all -> 0x0166 }
            java.lang.Class<X.0sC> r0 = X.C17870sC.class
            r3 = 8
            r1[r3] = r0     // Catch:{ all -> 0x0166 }
            java.lang.reflect.Constructor r2 = r2.getConstructor(r1)     // Catch:{ all -> 0x0166 }
            java.lang.Object[] r1 = X.C36431kI.A1a(r14, r13, r7)     // Catch:{ all -> 0x0166 }
            r1[r16] = r12     // Catch:{ all -> 0x0166 }
            r1[r18] = r11     // Catch:{ all -> 0x0166 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r19)     // Catch:{ all -> 0x0166 }
            r1[r15] = r0     // Catch:{ all -> 0x0166 }
            r1[r6] = r0     // Catch:{ all -> 0x0166 }
            X.C36331k8.A1X(r1, r10, r5, r9, r4)     // Catch:{ all -> 0x0166 }
            r1[r3] = r20     // Catch:{ all -> 0x0166 }
            java.lang.Object r1 = r2.newInstance(r1)     // Catch:{ all -> 0x0166 }
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.imagepipeline.animated.factory.AnimatedFactory"
            X.AnonymousClass00C.A0E(r1, r0)     // Catch:{ all -> 0x0166 }
            com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl r1 = (com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl) r1     // Catch:{ all -> 0x0166 }
            X.C1892892z.A00 = r1     // Catch:{ all -> 0x0166 }
        L_0x0166:
            com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl r0 = X.C1892892z.A00
            if (r0 == 0) goto L_0x016c
            X.C1892892z.A01 = r17
        L_0x016c:
            com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl r4 = X.C1892892z.A00
            r8.A00 = r4
            if (r4 != 0) goto L_0x0179
            java.lang.String r0 = "Failed to create gif drawable, no drawable factory"
            java.io.IOException r0 = X.C90524aI.A0X(r0)
            throw r0
        L_0x0179:
            X.9OZ r7 = r4.A03
            if (r7 != 0) goto L_0x01f0
            X.A0u r9 = X.C20961A0u.A00
            X.0sC r3 = r4.A01
            if (r3 != 0) goto L_0x018e
            X.Avv r0 = r4.A09
            X.A1Z r0 = (X.A1Z) r0
            java.util.concurrent.Executor r0 = r0.A00
            X.4qT r3 = new X.4qT
            r3.<init>(r0)
        L_0x018e:
            X.A0v r10 = X.C20962A0v.A00
            X.AxL r11 = X.AnonymousClass9AH.A00
            r0 = 2
            X.9ot r8 = new X.9ot
            r8.<init>(r4, r0)
            X.9CF r2 = r4.A02
            if (r2 != 0) goto L_0x01a3
            X.9CF r2 = new X.9CF
            r2.<init>(r4)
            r4.A02 = r2
        L_0x01a3:
            X.79H r21 = X.AnonymousClass79H.A01
            if (r21 != 0) goto L_0x01ae
            X.79H r21 = new X.79H
            r21.<init>()
            X.AnonymousClass79H.A01 = r21
        L_0x01ae:
            com.facebook.common.time.RealtimeSinceBootClock r16 = com.facebook.common.time.RealtimeSinceBootClock.A00
            X.6NZ r6 = r4.A06
            X.B5Z r1 = r4.A08
            boolean r0 = r4.A0B
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5 = 1
            X.9ot r12 = new X.9ot
            r12.<init>(r0, r5)
            boolean r0 = r4.A0A
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.9ot r13 = new X.9ot
            r13.<init>(r0, r5)
            int r0 = r4.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.9ot r14 = new X.9ot
            r14.<init>(r0, r5)
            int r0 = r4.A05
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.9ot r15 = new X.9ot
            r15.<init>(r0, r5)
            X.9OZ r7 = new X.9OZ
            r17 = r2
            r18 = r6
            r19 = r1
            r20 = r3
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r4.A03 = r7
        L_0x01f0:
            r0 = r22
            X.87m r1 = r0.A03
            monitor-enter(r1)
            monitor-exit(r1)
            monitor-enter(r1)
            X.9CG r2 = r1.A00     // Catch:{ all -> 0x0379 }
            monitor-exit(r1)
            java.util.Objects.requireNonNull(r2)
            r11 = 0
            r12 = 0
            X.B3Z r0 = r2.A00
            int r4 = r0.getWidth()
            int r1 = r0.getHeight()
            r0 = 0
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>(r0, r0, r4, r1)
            X.9CF r0 = r7.A0A
            com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl r0 = r0.A00
            X.94G r1 = r0.A04
            if (r1 != 0) goto L_0x021e
            X.94G r1 = new X.94G
            r1.<init>()
            r0.A04 = r1
        L_0x021e:
            boolean r0 = r0.A0A
            X.9kz r4 = new X.9kz
            r4.<init>(r3, r2, r1, r0)
            X.A1E r9 = new X.A1E
            r9.<init>(r4)
            X.AxL r3 = r7.A07
            java.lang.Object r0 = r3.get()
            boolean r0 = X.AnonymousClass000.A1X(r0)
            if (r0 == 0) goto L_0x030c
            X.AxL r0 = r7.A01
            java.lang.Object r0 = r0.get()
            int r0 = X.AnonymousClass000.A0I(r0)
            X.60E r1 = new X.60E
            r1.<init>(r0)
            X.AxL r0 = r7.A00
            java.lang.Object r0 = r0.get()
            X.9M7 r0 = (X.AnonymousClass9M7) r0
            X.A1I r10 = new X.A1I
            r10.<init>(r1, r2, r0)
        L_0x0252:
            java.lang.Object r0 = r3.get()
            boolean r0 = X.AnonymousClass000.A1X(r0)
            X.63p r13 = new X.63p
            r13.<init>(r10, r4, r0)
            X.AxL r0 = r7.A05
            java.lang.Object r0 = r0.get()
            int r0 = X.AnonymousClass000.A0I(r0)
            if (r0 <= 0) goto L_0x027b
            X.6kJ r11 = new X.6kJ
            r11.<init>(r0)
            X.6NZ r2 = r7.A0B
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
            java.util.concurrent.ExecutorService r0 = r7.A0D
            X.5vo r12 = new X.5vo
            r12.<init>(r1, r13, r2, r0)
        L_0x027b:
            java.lang.Object r0 = r3.get()
            boolean r0 = X.AnonymousClass000.A1X(r0)
            if (r0 == 0) goto L_0x02b5
            X.AxL r1 = r7.A02
            java.lang.Object r0 = r1.get()
            int r0 = X.AnonymousClass000.A0I(r0)
            if (r0 == 0) goto L_0x02eb
            java.lang.Object r0 = r1.get()
            int r18 = X.AnonymousClass000.A0I(r0)
            X.6NZ r0 = r7.A0B
            X.9Gd r1 = new X.9Gd
            r1.<init>(r13, r0)
            X.AxL r0 = r7.A04
            java.lang.Object r0 = r0.get()
            boolean r19 = X.AnonymousClass000.A1X(r0)
            X.A1K r11 = new X.A1K
            r14 = r11
            r15 = r9
            r16 = r10
            r17 = r1
            r14.<init>(r15, r16, r17, r18, r19)
        L_0x02b5:
            X.6NZ r14 = r7.A0B
            java.lang.Object r0 = r3.get()
            boolean r15 = X.AnonymousClass000.A1X(r0)
            X.6kI r8 = new X.6kI
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            X.7ie r2 = r7.A09
            java.util.concurrent.ScheduledExecutorService r0 = r7.A0E
            X.6kH r1 = new X.6kH
            r1.<init>(r2, r8, r8, r0)
            X.AxL r0 = r7.A08
            java.lang.Object r0 = r0.get()
            boolean r0 = X.AnonymousClass000.A1X(r0)
            if (r0 == 0) goto L_0x02e5
            X.4bn r2 = new X.4bn
            r2.<init>(r1)
        L_0x02de:
            boolean r0 = r2 instanceof X.C91334bq
            if (r0 == 0) goto L_0x036a
            X.4bq r2 = (X.C91334bq) r2
            return r2
        L_0x02e5:
            X.4bq r2 = new X.4bq
            r2.<init>(r1)
            goto L_0x02de
        L_0x02eb:
            X.6NZ r2 = r7.A0B
            X.AxL r0 = r7.A01
            java.lang.Object r0 = r0.get()
            int r0 = X.AnonymousClass000.A0I(r0)
            X.9c8 r1 = new X.9c8
            r1.<init>(r2, r0)
            X.AxL r0 = r7.A04
            java.lang.Object r0 = r0.get()
            boolean r0 = X.AnonymousClass000.A1X(r0)
            X.A1J r11 = new X.A1J
            r11.<init>(r9, r1, r13, r0)
            goto L_0x02b5
        L_0x030c:
            X.AxL r0 = r7.A03
            java.lang.Object r0 = r0.get()
            int r1 = X.AnonymousClass000.A0I(r0)
            r5 = 1
            if (r1 == r5) goto L_0x032d
            r0 = 2
            if (r1 == r0) goto L_0x0348
            r0 = 3
            if (r1 == r0) goto L_0x0326
            X.A1F r10 = new X.A1F
            r10.<init>()
            goto L_0x0252
        L_0x0326:
            X.A1G r10 = new X.A1G
            r10.<init>()
            goto L_0x0252
        L_0x032d:
            int r2 = r2.hashCode()
            X.AxL r0 = r7.A06
            java.lang.Object r0 = r0.get()
            boolean r0 = X.AnonymousClass000.A1X(r0)
            X.A0e r1 = new X.A0e
            r1.<init>(r2, r0)
            X.B5Z r0 = r7.A0C
            X.9LI r2 = new X.9LI
            r2.<init>(r1, r0)
            goto L_0x0363
        L_0x0348:
            int r2 = r2.hashCode()
            X.AxL r0 = r7.A06
            java.lang.Object r0 = r0.get()
            boolean r0 = X.AnonymousClass000.A1X(r0)
            X.A0e r1 = new X.A0e
            r1.<init>(r2, r0)
            X.B5Z r0 = r7.A0C
            X.9LI r2 = new X.9LI
            r2.<init>(r1, r0)
            r5 = 0
        L_0x0363:
            X.A1H r10 = new X.A1H
            r10.<init>(r2, r5)
            goto L_0x0252
        L_0x036a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Failed to create gif drawable, incorrect type or null: "
            java.lang.String r0 = X.AnonymousClass000.A0l(r2, r0, r1)
            java.io.IOException r0 = X.C90524aI.A0X(r0)
            throw r0
        L_0x0379:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x037c:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21656ATx.A06(android.content.Context):X.4bq");
    }

    public void close() {
        this.A00.dispose();
        AnonymousClass14X.A02(this.A03);
        ParcelFileDescriptor parcelFileDescriptor = this.A01;
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (Throwable th) {
                Log.e(th);
            }
        }
    }

    public C21656ATx(ParcelFileDescriptor parcelFileDescriptor, GifImage gifImage, AnonymousClass87m r9) {
        this.A01 = parcelFileDescriptor;
        this.A03 = r9;
        this.A00 = gifImage;
        AnonymousClass94G r5 = new AnonymousClass94G();
        this.A02 = new C202019ku(new C202069kz(new Rect(0, 0, gifImage.getWidth(), gifImage.getHeight()), new AnonymousClass9CG(gifImage), r5, false), new A1S(this), false);
    }

    public C21656ATx() {
    }
}
