package X;

import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: X.8Cg  reason: invalid class name and case insensitive filesystem */
public final class C170178Cg extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C204589qF();
    public ParcelFileDescriptor A00;
    public byte[] A01 = new byte[0];

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C170178Cg) {
            return Arrays.equals(this.A01, ((C170178Cg) obj).A01);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.A01);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006d, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0080, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0081, code lost:
        r5 = null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0080 A[ExcHandler: IllegalStateException (e java.lang.IllegalStateException)] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:35:0x0082=Splitter:B:35:0x0082, B:31:0x006e=Splitter:B:31:0x006e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void writeToParcel(android.os.Parcel r8, int r9) {
        /*
            r7 = this;
            java.lang.String r4 = "ParcelByteArray"
            byte[] r6 = r7.A01
            r3 = 0
            android.os.ParcelFileDescriptor r0 = r7.A00
            if (r0 != 0) goto L_0x00a9
            java.io.File r5 = X.C1892192s.A00     // Catch:{ IllegalStateException -> 0x0080, IOException -> 0x006c, all -> 0x006a }
            if (r5 == 0) goto L_0x0063
            java.lang.String r0 = "teleporter"
            java.lang.StringBuilder r2 = X.C90524aI.A0i(r0)     // Catch:{ IOException -> 0x005a, IllegalStateException -> 0x0080, all -> 0x006a }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x005a, IllegalStateException -> 0x0080, all -> 0x006a }
            java.lang.String r1 = X.C36411kG.A11(r2, r0)     // Catch:{ IOException -> 0x005a, IllegalStateException -> 0x0080, all -> 0x006a }
            java.lang.String r0 = ".tmp"
            java.io.File r2 = java.io.File.createTempFile(r1, r0, r5)     // Catch:{ IOException -> 0x005a, IllegalStateException -> 0x0080, all -> 0x006a }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0051 }
            r1.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0051 }
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            android.os.ParcelFileDescriptor r0 = android.os.ParcelFileDescriptor.open(r2, r0)     // Catch:{ FileNotFoundException -> 0x0051 }
            r2.delete()     // Catch:{ IllegalStateException -> 0x0080, IOException -> 0x006c, all -> 0x006a }
            android.util.Pair r2 = android.util.Pair.create(r1, r0)     // Catch:{ IllegalStateException -> 0x0080, IOException -> 0x006c, all -> 0x006a }
            java.lang.Object r1 = r2.first     // Catch:{ IllegalStateException -> 0x0080, IOException -> 0x006c, all -> 0x006a }
            java.io.OutputStream r1 = (java.io.OutputStream) r1     // Catch:{ IllegalStateException -> 0x0080, IOException -> 0x006c, all -> 0x006a }
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream     // Catch:{ IllegalStateException -> 0x0080, IOException -> 0x006c, all -> 0x006a }
            r0.<init>(r1)     // Catch:{ IllegalStateException -> 0x0080, IOException -> 0x006c, all -> 0x006a }
            java.io.DataOutputStream r5 = new java.io.DataOutputStream     // Catch:{ IllegalStateException -> 0x0080, IOException -> 0x006c, all -> 0x006a }
            r5.<init>(r0)     // Catch:{ IllegalStateException -> 0x0080, IOException -> 0x006c, all -> 0x006a }
            int r0 = r6.length     // Catch:{ IllegalStateException -> 0x004f, IOException -> 0x004d }
            r5.writeInt(r0)     // Catch:{ IllegalStateException -> 0x004f, IOException -> 0x004d }
            r5.write(r6)     // Catch:{ IllegalStateException -> 0x004f, IOException -> 0x004d }
            java.lang.Object r0 = r2.second     // Catch:{ IllegalStateException -> 0x004f, IOException -> 0x004d }
            android.os.ParcelFileDescriptor r0 = (android.os.ParcelFileDescriptor) r0     // Catch:{ IllegalStateException -> 0x004f, IOException -> 0x004d }
            goto L_0x00a4
        L_0x004d:
            r0 = move-exception
            goto L_0x006e
        L_0x004f:
            r0 = move-exception
            goto L_0x0082
        L_0x0051:
            r1 = move-exception
            java.lang.String r0 = "Temporary file is somehow already deleted"
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x0080, IOException -> 0x006c, all -> 0x006a }
            r2.<init>(r0, r1)     // Catch:{ IllegalStateException -> 0x0080, IOException -> 0x006c, all -> 0x006a }
            goto L_0x0062
        L_0x005a:
            r1 = move-exception
            java.lang.String r0 = "Could not create temporary file"
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x0080, IOException -> 0x006c, all -> 0x006a }
            r2.<init>(r0, r1)     // Catch:{ IllegalStateException -> 0x0080, IOException -> 0x006c, all -> 0x006a }
        L_0x0062:
            throw r2     // Catch:{ IllegalStateException -> 0x0080, IOException -> 0x006c, all -> 0x006a }
        L_0x0063:
            java.lang.String r0 = "Must set temp dir before writing this object to a parcel"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)     // Catch:{ IllegalStateException -> 0x0080, IOException -> 0x006c, all -> 0x006a }
            throw r0     // Catch:{ IllegalStateException -> 0x0080, IOException -> 0x006c, all -> 0x006a }
        L_0x006a:
            r0 = move-exception
            throw r0
        L_0x006c:
            r0 = move-exception
            r5 = r3
        L_0x006e:
            java.lang.String r2 = r0.toString()     // Catch:{ all -> 0x009d }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x009d }
            java.lang.String r0 = "Could not write into unlinked file. "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r2, r1)     // Catch:{ all -> 0x009d }
            android.util.Log.e(r4, r0)     // Catch:{ all -> 0x009d }
            goto L_0x0096
        L_0x0080:
            r0 = move-exception
            r5 = r3
        L_0x0082:
            java.lang.String r2 = r0.toString()     // Catch:{ all -> 0x009d }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x009d }
            java.lang.String r0 = "Could not create unlinked file. "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r2, r1)     // Catch:{ all -> 0x009d }
            android.util.Log.e(r4, r0)     // Catch:{ all -> 0x009d }
            if (r5 == 0) goto L_0x009b
            goto L_0x0098
        L_0x0096:
            if (r5 == 0) goto L_0x009b
        L_0x0098:
            A00(r5)
        L_0x009b:
            r0 = r3
            goto L_0x00a7
        L_0x009d:
            r0 = move-exception
            if (r5 == 0) goto L_0x00a3
            A00(r5)
        L_0x00a3:
            throw r0
        L_0x00a4:
            A00(r5)
        L_0x00a7:
            r7.A00 = r0
        L_0x00a9:
            r5 = 1
            r4 = r9 | 1
            int r2 = X.AnonymousClass0Z9.A00(r8)
            android.os.ParcelFileDescriptor r1 = r7.A00
            r0 = 0
            X.AnonymousClass0Z9.A0B(r8, r1, r5, r4, r0)
            X.AnonymousClass0Z9.A07(r8, r2)
            r7.A00 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170178Cg.writeToParcel(android.os.Parcel, int):void");
    }

    public C170178Cg(ParcelFileDescriptor parcelFileDescriptor) {
        this.A00 = parcelFileDescriptor;
    }

    public static void A00(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("ParcelByteArray", "Could not close stream", e);
        }
    }

    public C170178Cg() {
    }
}
