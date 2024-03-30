package com.whatsapp;

import X.C21060yb;

public class NativeMediaHandler {
    public final C21060yb A00;

    public static native void initFileHandlingCallbacks(NativeMediaHandler nativeMediaHandler);

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0059 A[SYNTHETIC, Splitter:B:16:0x0059] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007a A[Catch:{ all -> 0x0082, all -> 0x0089, Exception -> 0x008e }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0035  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int openFile(java.lang.String r8, java.lang.String r9) {
        /*
            r7 = this;
            java.lang.String r5 = "; path="
            java.lang.String r4 = "; mode="
            r6 = 0
            if (r8 == 0) goto L_0x00b0
            if (r9 == 0) goto L_0x00b0
            r1 = r8
            java.lang.String r0 = "/mnt/content/"
            boolean r0 = r8.startsWith(r0)
            if (r0 == 0) goto L_0x0038
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "content://"
            r1.append(r0)
            r0 = 13
            java.lang.String r0 = r8.substring(r0)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
        L_0x0029:
            android.net.Uri r3 = android.net.Uri.parse(r1)
        L_0x002d:
            java.lang.String r0 = "r+"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x004a
            java.lang.String r9 = "rw"
            goto L_0x004a
        L_0x0038:
            java.lang.String r0 = "/"
            boolean r0 = r8.startsWith(r0)
            if (r0 == 0) goto L_0x0029
            java.io.File r0 = new java.io.File
            r0.<init>(r8)
            android.net.Uri r3 = android.net.Uri.fromFile(r0)
            goto L_0x002d
        L_0x004a:
            X.0yb r0 = r7.A00     // Catch:{ Exception -> 0x008e }
            X.0ya r0 = r0.A0O()     // Catch:{ Exception -> 0x008e }
            X.C18740tg.A06(r0)     // Catch:{ Exception -> 0x008e }
            android.os.ParcelFileDescriptor r2 = r0.A05(r3, r9)     // Catch:{ Exception -> 0x008e }
            if (r2 != 0) goto L_0x007a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0082 }
            r1.<init>()     // Catch:{ all -> 0x0082 }
            java.lang.String r0 = "nativemediahandler/openFile failed, not opened; uri="
            r1.append(r0)     // Catch:{ all -> 0x0082 }
            r1.append(r3)     // Catch:{ all -> 0x0082 }
            r1.append(r4)     // Catch:{ all -> 0x0082 }
            r1.append(r9)     // Catch:{ all -> 0x0082 }
            r1.append(r5)     // Catch:{ all -> 0x0082 }
            r1.append(r8)     // Catch:{ all -> 0x0082 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0082 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0082 }
            return r6
        L_0x007a:
            int r0 = r2.detachFd()     // Catch:{ all -> 0x0082 }
            r2.close()     // Catch:{ Exception -> 0x008e }
            return r0
        L_0x0082:
            r1 = move-exception
            if (r2 == 0) goto L_0x008d
            r2.close()     // Catch:{ all -> 0x0089 }
            goto L_0x008d
        L_0x0089:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x008e }
        L_0x008d:
            throw r1     // Catch:{ Exception -> 0x008e }
        L_0x008e:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "nativemediahandler/openFile failed; uri="
            r1.append(r0)
            r1.append(r3)
            r1.append(r4)
            r1.append(r9)
            r1.append(r5)
            r1.append(r8)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e(r0, r2)
            return r6
        L_0x00b0:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "nativemediahandler/openFile wrong arguments; path="
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = " mode="
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.NativeMediaHandler.openFile(java.lang.String, java.lang.String):int");
    }

    public NativeMediaHandler(C21060yb r1) {
        this.A00 = r1;
    }
}
