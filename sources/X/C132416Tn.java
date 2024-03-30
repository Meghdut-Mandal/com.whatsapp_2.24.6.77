package X;

import android.graphics.Bitmap;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.6Tn  reason: invalid class name and case insensitive filesystem */
public class C132416Tn {
    public static final Bitmap A07 = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
    public boolean A00 = false;
    public C1496071z A01;
    public final C002000v A02;
    public final AnonymousClass67H A03;
    public final long A04;
    public final File A05;
    public final Object A06 = C36441kJ.A11();

    private void A00() {
        synchronized (this.A06) {
            C1496071z r0 = this.A01;
            if (r0 == null || r0.A02 == null) {
                File file = this.A05;
                if (!file.exists() && !file.mkdirs() && !file.exists()) {
                    C36321k7.A1J(file, "bitmapcache/initDiskCache: unable to create cache dir ", AnonymousClass000.A0u());
                }
                long usableSpace = file.getUsableSpace();
                long j = this.A04;
                if (usableSpace > j) {
                    try {
                        this.A01 = C1496071z.A01((C117715mi) null, file, j);
                    } catch (IOException e) {
                        Log.e("bitmapcache/initDiskCache ", e);
                    }
                }
            }
        }
    }

    public Bitmap A01(String str) {
        Bitmap bitmap = (Bitmap) this.A02.A04(str);
        if (bitmap != null && this.A00) {
            this.A03.A01(bitmap.getWidth(), bitmap.getHeight(), str);
        }
        return bitmap;
    }

    public void A03(Bitmap bitmap, String str) {
        C002000v r1 = this.A02;
        synchronized (r1) {
            r1.A08(str, bitmap);
            r1.A02();
            r1.A01();
        }
    }

    public void A05(boolean z) {
        C002000v r1 = this.A02;
        synchronized (r1) {
            r1.A07(-1);
        }
        synchronized (this.A06) {
            C1496071z r0 = this.A01;
            if (r0 != null) {
                if (z) {
                    try {
                        r0.close();
                        C1496071z.A07(r0.A06);
                    } catch (IOException e) {
                        Log.e("bitmapcache/close ", e);
                    }
                }
                C1496071z r12 = this.A01;
                if (r12.A02 != null) {
                    r12.close();
                }
                this.A01 = null;
            }
        }
    }

    public C132416Tn(File file, long j) {
        this.A05 = file;
        this.A04 = j;
        C93294gK r1 = new C93294gK(this, (int) (C19430v1.A00 / 8192));
        this.A02 = r1;
        this.A03 = new AnonymousClass67H(r1);
    }

    public Bitmap A02(String str, int i, int i2, boolean z) {
        Bitmap bitmap;
        C1494971l r0;
        Bitmap bitmap2;
        A00();
        synchronized (this.A06) {
            C1496071z r02 = this.A01;
            bitmap = null;
            if (r02 != null) {
                try {
                    r0 = r02.A0B(str);
                } catch (IOException unused) {
                    Log.e("bitmapcache/journal corrupted");
                    r0 = null;
                }
                if (r0 != null) {
                    try {
                        InputStream inputStream = r0.A00[0];
                        if (inputStream != null) {
                            if (z) {
                                try {
                                    bitmap2 = AnonymousClass6Y8.A07(this.A03, new C130396Kx(i, i2), inputStream, true).A02;
                                } catch (Throwable th) {
                                    th = th;
                                    try {
                                        inputStream.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            } else {
                                bitmap2 = AnonymousClass6Y8.A0A(new C130396Kx(i, i2), inputStream).A02;
                            }
                            if (bitmap2 == null) {
                                try {
                                    Log.e("bitmapcache/decode failed");
                                    try {
                                        inputStream.close();
                                    } catch (IOException e) {
                                        e = e;
                                        bitmap = bitmap2;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    bitmap = bitmap2;
                                    inputStream.close();
                                    throw th;
                                }
                            } else {
                                bitmap = bitmap2;
                            }
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                    } catch (IOException e2) {
                        e = e2;
                        C36321k7.A1J(e, "bitmapcache/ IO exception on diskcache: ", AnonymousClass000.A0u());
                        return bitmap;
                    }
                }
            }
        }
        return bitmap;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void A04(java.io.InputStream r4, java.lang.String r5) {
        /*
            r3 = this;
            r3.A00()
            java.lang.Object r2 = r3.A06
            monitor-enter(r2)
            X.71z r0 = r3.A01     // Catch:{ all -> 0x004f }
            if (r0 == 0) goto L_0x004d
            X.71l r0 = r0.A0B(r5)     // Catch:{ Exception -> 0x003c }
            r1 = 0
            if (r0 != 0) goto L_0x0031
            X.71z r0 = r3.A01     // Catch:{ Exception -> 0x003c }
            X.66k r1 = X.C1496071z.A00(r0, r5)     // Catch:{ Exception -> 0x003c }
            if (r1 == 0) goto L_0x0038
            X.5Qz r0 = r1.A00()     // Catch:{ Exception -> 0x003c }
            X.AnonymousClass6YY.A0J(r4, r0)     // Catch:{ all -> 0x0027 }
            r1.A01()     // Catch:{ all -> 0x0027 }
            r0.close()     // Catch:{ Exception -> 0x003c }
            goto L_0x0038
        L_0x0027:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x002c }
            goto L_0x0030
        L_0x002c:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x003c }
        L_0x0030:
            throw r1     // Catch:{ Exception -> 0x003c }
        L_0x0031:
            java.io.InputStream[] r0 = r0.A00     // Catch:{ Exception -> 0x003c }
            r0 = r0[r1]     // Catch:{ Exception -> 0x003c }
            r0.close()     // Catch:{ Exception -> 0x003c }
        L_0x0038:
            X.71z r0 = r3.A01     // Catch:{ all -> 0x004f }
            monitor-enter(r0)     // Catch:{ all -> 0x004f }
            goto L_0x004c
        L_0x003c:
            r1 = move-exception
            java.lang.String r0 = "bitmapcache/download "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0043 }
            goto L_0x0049
        L_0x0043:
            r1 = move-exception
            X.71z r0 = r3.A01     // Catch:{ all -> 0x004f }
            monitor-enter(r0)     // Catch:{ all -> 0x004f }
            monitor-exit(r0)     // Catch:{ all -> 0x004f }
            throw r1     // Catch:{ all -> 0x004f }
        L_0x0049:
            X.71z r0 = r3.A01     // Catch:{ all -> 0x004f }
            monitor-enter(r0)     // Catch:{ all -> 0x004f }
        L_0x004c:
            monitor-exit(r0)     // Catch:{ all -> 0x004f }
        L_0x004d:
            monitor-exit(r2)     // Catch:{ all -> 0x004f }
            return
        L_0x004f:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x004f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132416Tn.A04(java.io.InputStream, java.lang.String):void");
    }
}
