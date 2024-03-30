package X;

import android.database.Cursor;
import com.whatsapp.gallery.GalleryFragmentBase;
import java.lang.ref.WeakReference;

/* renamed from: X.2jm  reason: invalid class name and case insensitive filesystem */
public class C49842jm extends C132446Tt {
    public C02680Bk A00;
    public final AnonymousClass11F A01;
    public final AnonymousClass1S3 A02;
    public final WeakReference A03;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Cursor A1Z;
        GalleryFragmentBase galleryFragmentBase = (GalleryFragmentBase) this.A03.get();
        C91494c6 r6 = this.A02;
        if (r6.isCancelled() || galleryFragmentBase == null) {
            return null;
        }
        C02680Bk r2 = new C02680Bk();
        synchronized (this) {
            this.A00 = r2;
        }
        try {
            StringBuilder A0u = AnonymousClass000.A0u();
            String str = galleryFragmentBase.A0K;
            A0u.append(str);
            C224214g r3 = new C224214g(AnonymousClass000.A0q("/getCursor", A0u));
            A1Z = galleryFragmentBase.A1Z(r2, this.A01, this.A02);
            r3.A01();
            StringBuilder A0v = AnonymousClass000.A0v(str);
            A0v.append("/loadInBackground ");
            C36321k7.A1Y(A0v, A1Z.getCount());
            synchronized (this) {
                this.A00 = null;
            }
            if (!r6.isCancelled()) {
                return A1Z;
            }
            A1Z.close();
            return null;
        } catch (RuntimeException e) {
            A1Z.close();
            throw e;
        } catch (Throwable th) {
            th = th;
            synchronized (this) {
                try {
                    this.A00 = null;
                } catch (Throwable th2) {
                    th = th2;
                }
                throw th;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0087 A[EDGE_INSN: B:30:0x0087->B:24:0x0087 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0C(java.lang.Object r13) {
        /*
            r12 = this;
            android.database.Cursor r13 = (android.database.Cursor) r13
            if (r13 == 0) goto L_0x00a9
            java.lang.ref.WeakReference r0 = r12.A03
            java.lang.Object r8 = r0.get()
            com.whatsapp.gallery.GalleryFragmentBase r8 = (com.whatsapp.gallery.GalleryFragmentBase) r8
            if (r8 == 0) goto L_0x00a9
            X.1S3 r10 = r12.A02
            int r2 = r13.getCount()
            r7 = 0
            android.view.View r0 = r8.A01
            X.C36341k9.A0y(r0)
            int r6 = com.whatsapp.gallery.GalleryFragmentBase.A03(r8)
            r0 = -1
            if (r6 == r0) goto L_0x00a9
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = r8.A0K
            r1.append(r0)
            java.lang.String r0 = "/onLoadFinished "
            X.C36321k7.A1T(r0, r1, r2)
            r8.A00 = r2
            com.whatsapp.gallery.GalleryFragmentBase.A06(r8)
            X.2k0 r0 = r8.A0B
            if (r0 == 0) goto L_0x003b
            r0.A0G()
        L_0x003b:
            java.util.ArrayList r5 = r8.A0L
            r5.clear()
            r4 = 0
            android.content.Context r1 = r8.A0a()
            X.0ts r0 = r8.A05
            X.6uI r3 = new X.6uI
            r3.<init>(r1, r0)
            boolean r0 = r13.moveToFirst()
            if (r0 == 0) goto L_0x008a
            r2 = 0
        L_0x0053:
            boolean r0 = r13 instanceof X.C36691l9
            if (r0 == 0) goto L_0x00aa
            r0 = r13
            X.1l9 r0 = (X.C36691l9) r0
            X.2bU r0 = r0.A02()
        L_0x005e:
            X.C18740tg.A06(r0)
            X.3T1 r0 = (X.AnonymousClass3T1) r0
            long r0 = r0.A0I
            X.78x r1 = r3.A00(r0)
            if (r4 == 0) goto L_0x0074
            boolean r0 = r4.equals(r1)
            if (r0 != 0) goto L_0x0077
            r5.add(r4)
        L_0x0074:
            r1.bucketCount = r7
            r4 = r1
        L_0x0077:
            int r0 = r4.bucketCount
            int r0 = r0 + 1
            r4.bucketCount = r0
            int r2 = r2 + 1
            boolean r0 = r13.moveToNext()
            if (r0 == 0) goto L_0x0087
            if (r2 < r6) goto L_0x0053
        L_0x0087:
            r5.add(r4)
        L_0x008a:
            X.1wQ r0 = r8.A0A
            android.database.Cursor r0 = r0.A0L(r13)
            if (r0 == 0) goto L_0x0095
            r0.close()
        L_0x0095:
            X.0ts r6 = r8.A05
            X.1A1 r11 = r8.A0F
            X.12T r7 = r8.A08
            X.11F r9 = r8.A0D
            X.2k0 r5 = new X.2k0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r8.A0B = r5
            X.0wU r0 = r8.A0G
            X.C36391kE.A1Q(r5, r0)
        L_0x00a9:
            return
        L_0x00aa:
            X.1A1 r1 = r8.A0F
            X.11F r0 = r8.A0D
            X.3T1 r0 = r1.A01(r13, r0)
            goto L_0x005e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49842jm.A0C(java.lang.Object):void");
    }

    public C49842jm(GalleryFragmentBase galleryFragmentBase, AnonymousClass11F r3, AnonymousClass1S3 r4) {
        this.A03 = AnonymousClass001.A0F(galleryFragmentBase);
        this.A01 = r3;
        this.A02 = r4;
    }
}
