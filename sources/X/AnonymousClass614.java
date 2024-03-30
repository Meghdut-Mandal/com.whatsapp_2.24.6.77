package X;

/* renamed from: X.614  reason: invalid class name */
public class AnonymousClass614 {
    public final AnonymousClass6T9 A00;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C130916My A00(java.io.InputStream r11) {
        /*
            r10 = this;
            java.util.zip.ZipInputStream r2 = new java.util.zip.ZipInputStream
            r2.<init>(r11)
        L_0x0005:
            java.util.zip.ZipEntry r0 = r2.getNextEntry()     // Catch:{ all -> 0x010a }
            if (r0 == 0) goto L_0x0103
            java.lang.String r1 = r0.getName()     // Catch:{ all -> 0x010a }
            java.lang.String r0 = "metadata.json"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x010a }
            if (r0 == 0) goto L_0x0005
            android.util.JsonReader r9 = X.C90474aD.A0K(r2)     // Catch:{ all -> 0x010a }
            r9.beginObject()     // Catch:{ all -> 0x00f9 }
            r6 = 0
            r5 = r6
            r1 = r6
            r4 = r6
        L_0x0022:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x00f9 }
            if (r0 == 0) goto L_0x00c8
            java.lang.String r3 = r9.nextName()     // Catch:{ all -> 0x00f9 }
            java.lang.String r0 = "scheme"
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x00f9 }
            if (r0 == 0) goto L_0x0039
            java.lang.String r6 = r9.nextString()     // Catch:{ all -> 0x00f9 }
            goto L_0x0022
        L_0x0039:
            java.lang.String r0 = "data_id"
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x00f9 }
            if (r0 == 0) goto L_0x0046
            java.lang.String r5 = r9.nextString()     // Catch:{ all -> 0x00f9 }
            goto L_0x0022
        L_0x0046:
            java.lang.String r0 = "source_id"
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x00f9 }
            if (r0 == 0) goto L_0x0053
            java.lang.String r4 = r9.nextString()     // Catch:{ all -> 0x00f9 }
            goto L_0x0022
        L_0x0053:
            java.lang.String r0 = "key_id"
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x00f9 }
            if (r0 == 0) goto L_0x00b5
            r9.beginObject()     // Catch:{ all -> 0x00f9 }
            r8 = 0
            r7 = r8
            r3 = r8
        L_0x0061:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x00f9 }
            if (r0 == 0) goto L_0x00a1
            java.lang.String r1 = r9.nextName()     // Catch:{ all -> 0x00f9 }
            int r0 = r1.hashCode()     // Catch:{ all -> 0x00f9 }
            switch(r0) {
                case -758621230: goto L_0x0094;
                case 351608024: goto L_0x0083;
                case 1091060704: goto L_0x0076;
                default: goto L_0x0072;
            }     // Catch:{ all -> 0x00f9 }
        L_0x0072:
            r9.skipValue()     // Catch:{ all -> 0x00f9 }
            goto L_0x0061
        L_0x0076:
            java.lang.String r0 = "account_hash"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00f9 }
            if (r0 == 0) goto L_0x0072
            java.lang.String r7 = r9.nextString()     // Catch:{ all -> 0x00f9 }
            goto L_0x0061
        L_0x0083:
            java.lang.String r0 = "version"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00f9 }
            if (r0 == 0) goto L_0x0072
            int r0 = r9.nextInt()     // Catch:{ all -> 0x00f9 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00f9 }
            goto L_0x0061
        L_0x0094:
            java.lang.String r0 = "server_salt"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00f9 }
            if (r0 == 0) goto L_0x0072
            java.lang.String r3 = r9.nextString()     // Catch:{ all -> 0x00f9 }
            goto L_0x0061
        L_0x00a1:
            r9.endObject()     // Catch:{ all -> 0x00f9 }
            if (r8 == 0) goto L_0x00c1
            if (r7 == 0) goto L_0x00ba
            if (r3 == 0) goto L_0x00f2
            java.lang.String r0 = r8.toString()     // Catch:{ all -> 0x00f9 }
            X.62z r1 = new X.62z     // Catch:{ all -> 0x00f9 }
            r1.<init>(r0, r7, r3)     // Catch:{ all -> 0x00f9 }
            goto L_0x0022
        L_0x00b5:
            r9.skipValue()     // Catch:{ all -> 0x00f9 }
            goto L_0x0022
        L_0x00ba:
            java.lang.String r0 = "Invalid key info: account hash is missing."
            java.io.IOException r0 = X.C90524aI.A0X(r0)     // Catch:{ all -> 0x00f9 }
            goto L_0x00f8
        L_0x00c1:
            java.lang.String r0 = "Invalid key info: version is missing."
            java.io.IOException r0 = X.C90524aI.A0X(r0)     // Catch:{ all -> 0x00f9 }
            goto L_0x00f8
        L_0x00c8:
            r9.endObject()     // Catch:{ all -> 0x00f9 }
            if (r6 == 0) goto L_0x00eb
            if (r5 == 0) goto L_0x00e4
            if (r1 == 0) goto L_0x00dd
            X.6My r0 = new X.6My     // Catch:{ all -> 0x00f9 }
            r0.<init>(r1, r6, r5, r4)     // Catch:{ all -> 0x00f9 }
            r9.close()     // Catch:{ all -> 0x010a }
            r2.close()
            return r0
        L_0x00dd:
            java.lang.String r0 = "Invalid metadata file: key info is missing."
            java.io.IOException r0 = X.C90524aI.A0X(r0)     // Catch:{ all -> 0x00f9 }
            goto L_0x00f8
        L_0x00e4:
            java.lang.String r0 = "Invalid metadata file: data id is missing."
            java.io.IOException r0 = X.C90524aI.A0X(r0)     // Catch:{ all -> 0x00f9 }
            goto L_0x00f8
        L_0x00eb:
            java.lang.String r0 = "Invalid metadata file: scheme is missing."
            java.io.IOException r0 = X.C90524aI.A0X(r0)     // Catch:{ all -> 0x00f9 }
            goto L_0x00f8
        L_0x00f2:
            java.lang.String r0 = "Invalid key info: server salt is missing."
            java.io.IOException r0 = X.C90524aI.A0X(r0)     // Catch:{ all -> 0x00f9 }
        L_0x00f8:
            throw r0     // Catch:{ all -> 0x00f9 }
        L_0x00f9:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x00fe }
            goto L_0x0102
        L_0x00fe:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x010a }
        L_0x0102:
            throw r1     // Catch:{ all -> 0x010a }
        L_0x0103:
            java.lang.String r0 = "metadata.json was not found in zip file."
            java.io.FileNotFoundException r0 = X.C90524aI.A0V(r0)     // Catch:{ all -> 0x010a }
            throw r0     // Catch:{ all -> 0x010a }
        L_0x010a:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x010f }
            throw r1
        L_0x010f:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass614.A00(java.io.InputStream):X.6My");
    }

    public AnonymousClass614(AnonymousClass6T9 r1) {
        this.A00 = r1;
    }
}
