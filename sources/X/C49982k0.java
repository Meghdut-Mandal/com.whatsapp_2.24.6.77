package X;

import com.whatsapp.gallery.GalleryFragmentBase;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.2k0  reason: invalid class name and case insensitive filesystem */
public class C49982k0 extends C132446Tt {
    public int A00;
    public C02680Bk A01;
    public final AnonymousClass12T A02;
    public final C145646uI A03;
    public final AnonymousClass11F A04;
    public final AnonymousClass1S3 A05;
    public final AnonymousClass1A1 A06;
    public final WeakReference A07;

    public void A0G() {
        A0D(true);
        synchronized (this) {
            C02680Bk r0 = this.A01;
            if (r0 != null) {
                r0.A03();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:91:0x0065 A[EDGE_INSN: B:91:0x0065->B:22:0x0065 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r19) {
        /*
            r18 = this;
            r4 = r18
            java.lang.ref.WeakReference r0 = r4.A07
            java.lang.Object r7 = r0.get()
            com.whatsapp.gallery.GalleryFragmentBase r7 = (com.whatsapp.gallery.GalleryFragmentBase) r7
            X.4c6 r11 = r4.A02
            boolean r0 = r11.isCancelled()
            r2 = 0
            if (r0 != 0) goto L_0x00fd
            if (r7 == 0) goto L_0x00fd
            X.0Bk r1 = new X.0Bk
            r1.<init>()
            monitor-enter(r4)
            r4.A01 = r1     // Catch:{ all -> 0x00fa }
            monitor-exit(r4)     // Catch:{ all -> 0x00fa }
            long r16 = android.os.SystemClock.uptimeMillis()
            java.util.ArrayList r10 = X.AnonymousClass001.A0I()
            r6 = 1
            X.11F r9 = r4.A04     // Catch:{ OperationCanceledException -> 0x00d6, SQLiteDiskIOException -> 0x00cf }
            X.1S3 r0 = r4.A05     // Catch:{ OperationCanceledException -> 0x00d6, SQLiteDiskIOException -> 0x00cf }
            android.database.Cursor r8 = r7.A1Z(r1, r9, r0)     // Catch:{ OperationCanceledException -> 0x00d6, SQLiteDiskIOException -> 0x00cf }
            r5 = 0
            int r0 = r8.getCount()     // Catch:{ all -> 0x00c5 }
            if (r0 <= 0) goto L_0x006e
            r8.moveToFirst()     // Catch:{ all -> 0x00c5 }
            r3 = r2
            goto L_0x007c
        L_0x003b:
            boolean r0 = r10.isEmpty()     // Catch:{ all -> 0x00c5 }
            if (r0 != 0) goto L_0x005f
            r14 = 1000(0x3e8, double:4.94E-321)
            long r14 = r14 + r16
            long r12 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x00c5 }
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x005f
            long r16 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x00c5 }
            java.util.ArrayList r1 = X.C36441kJ.A15(r10)     // Catch:{ all -> 0x00c5 }
            r10.clear()     // Catch:{ all -> 0x00c5 }
            java.util.List[] r0 = new java.util.List[r6]     // Catch:{ all -> 0x00c5 }
            r0[r5] = r1     // Catch:{ all -> 0x00c5 }
            r4.A0F(r0)     // Catch:{ all -> 0x00c5 }
        L_0x005f:
            boolean r0 = r8.moveToNext()     // Catch:{ all -> 0x00c5 }
            if (r0 != 0) goto L_0x007c
        L_0x0065:
            boolean r0 = r11.isCancelled()     // Catch:{ all -> 0x00c5 }
            if (r0 != 0) goto L_0x006e
            r10.add(r3)     // Catch:{ all -> 0x00c5 }
        L_0x006e:
            boolean r0 = r10.isEmpty()     // Catch:{ all -> 0x00c5 }
            if (r0 != 0) goto L_0x00ba
            java.util.List[] r0 = new java.util.List[r6]     // Catch:{ all -> 0x00c5 }
            r0[r5] = r10     // Catch:{ all -> 0x00c5 }
            r4.A0F(r0)     // Catch:{ all -> 0x00c5 }
            goto L_0x00ba
        L_0x007c:
            boolean r0 = r11.isCancelled()     // Catch:{ all -> 0x00c5 }
            if (r0 == 0) goto L_0x0085
            if (r3 == 0) goto L_0x006e
            goto L_0x0065
        L_0x0085:
            boolean r0 = r8 instanceof X.C36691l9     // Catch:{ all -> 0x00c5 }
            if (r0 == 0) goto L_0x00ab
            r0 = r8
            X.1l9 r0 = (X.C36691l9) r0     // Catch:{ all -> 0x00c5 }
            X.2bU r0 = r0.A02()     // Catch:{ all -> 0x00c5 }
        L_0x0090:
            X.C18740tg.A06(r0)     // Catch:{ all -> 0x00c5 }
            X.3T1 r0 = (X.AnonymousClass3T1) r0     // Catch:{ all -> 0x00c5 }
            X.6uI r12 = r4.A03     // Catch:{ all -> 0x00c5 }
            long r0 = r0.A0I     // Catch:{ all -> 0x00c5 }
            X.78x r1 = r12.A00(r0)     // Catch:{ all -> 0x00c5 }
            if (r3 == 0) goto L_0x00a8
            boolean r0 = r3.equals(r1)     // Catch:{ all -> 0x00c5 }
            if (r0 != 0) goto L_0x00b3
            r10.add(r3)     // Catch:{ all -> 0x00c5 }
        L_0x00a8:
            r1.bucketCount = r5     // Catch:{ all -> 0x00c5 }
            goto L_0x00b2
        L_0x00ab:
            X.1A1 r0 = r4.A06     // Catch:{ all -> 0x00c5 }
            X.3T1 r0 = r0.A01(r8, r9)     // Catch:{ all -> 0x00c5 }
            goto L_0x0090
        L_0x00b2:
            r3 = r1
        L_0x00b3:
            int r0 = r3.bucketCount     // Catch:{ all -> 0x00c5 }
            int r0 = r0 + 1
            r3.bucketCount = r0     // Catch:{ all -> 0x00c5 }
            goto L_0x003b
        L_0x00ba:
            r8.close()     // Catch:{ OperationCanceledException -> 0x00d6, SQLiteDiskIOException -> 0x00cf }
            monitor-enter(r4)
            r4.A01 = r2     // Catch:{ all -> 0x00c2 }
            monitor-exit(r4)     // Catch:{ all -> 0x00c2 }
            goto L_0x00df
        L_0x00c2:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00c2 }
            throw r0
        L_0x00c5:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x00ca }
            goto L_0x00ce
        L_0x00ca:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ OperationCanceledException -> 0x00d6, SQLiteDiskIOException -> 0x00cf }
        L_0x00ce:
            throw r1     // Catch:{ OperationCanceledException -> 0x00d6, SQLiteDiskIOException -> 0x00cf }
        L_0x00cf:
            r1 = move-exception
            X.12T r0 = r4.A02     // Catch:{ all -> 0x00f1 }
            r0.A00(r6)     // Catch:{ all -> 0x00f1 }
            throw r1     // Catch:{ all -> 0x00f1 }
        L_0x00d6:
            java.lang.String r0 = "GalleryFragmentBase/doInBackground/OperationCanceledException"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00f1 }
            monitor-enter(r4)
            r4.A01 = r2     // Catch:{ all -> 0x00ee }
            monitor-exit(r4)     // Catch:{ all -> 0x00ee }
        L_0x00df:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = r7.A0K
            r1.append(r0)
            java.lang.String r0 = "/all buckets assigned"
            X.C36321k7.A1a(r1, r0)
            return r2
        L_0x00ee:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00ee }
            throw r0
        L_0x00f1:
            r0 = move-exception
            monitor-enter(r4)
            r4.A01 = r2     // Catch:{ all -> 0x00f7 }
        L_0x00f5:
            monitor-exit(r4)     // Catch:{ all -> 0x00f7 }
            goto L_0x00f9
        L_0x00f7:
            r0 = move-exception
            goto L_0x00f5
        L_0x00f9:
            throw r0
        L_0x00fa:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00fa }
            throw r0
        L_0x00fd:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49982k0.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0E(Object[] objArr) {
        List[] listArr = (List[]) objArr;
        GalleryFragmentBase galleryFragmentBase = (GalleryFragmentBase) this.A07.get();
        if (galleryFragmentBase != null) {
            for (List list : listArr) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append(galleryFragmentBase.A0K);
                A0u.append("/report bucket ");
                A0u.append(this.A00);
                C36421kH.A1N(A0u);
                C36321k7.A1Y(A0u, list.size());
                if (this.A00 == 0) {
                    galleryFragmentBase.A0L.clear();
                    galleryFragmentBase.A0A.A06();
                }
                this.A00 += list.size();
                galleryFragmentBase.A0L.addAll(list);
                galleryFragmentBase.A0A.A06();
            }
        }
    }

    public C49982k0(C18820ts r3, AnonymousClass12T r4, GalleryFragmentBase galleryFragmentBase, AnonymousClass11F r6, AnonymousClass1S3 r7, AnonymousClass1A1 r8) {
        this.A06 = r8;
        this.A02 = r4;
        this.A07 = AnonymousClass001.A0F(galleryFragmentBase);
        this.A04 = r6;
        this.A05 = r7;
        this.A03 = new C145646uI(galleryFragmentBase.A0a(), r3);
    }
}
