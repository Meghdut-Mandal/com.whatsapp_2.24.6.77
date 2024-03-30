package X;

import android.util.JsonReader;

/* renamed from: X.59l  reason: invalid class name and case insensitive filesystem */
public final class C1043859l extends AnonymousClass3L7 {
    public static final AnonymousClass00I A00(JsonReader jsonReader) {
        int[] iArr = new int[2];
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        while (true) {
            int i = 0;
            if (!jsonReader.hasNext()) {
                break;
            }
            String nextName = jsonReader.nextName();
            if (nextName != null) {
                int hashCode = nextName.hashCode();
                if (hashCode != -318184504) {
                    if (hashCode != 116079) {
                        if (hashCode == 3083499 && nextName.equals("dims")) {
                            jsonReader.beginArray();
                            while (jsonReader.hasNext()) {
                                if (i < 2) {
                                    iArr[i] = jsonReader.nextInt();
                                    i++;
                                } else {
                                    jsonReader.skipValue();
                                }
                            }
                            jsonReader.endArray();
                        }
                    } else if (nextName.equals("url")) {
                        str = jsonReader.nextString();
                    }
                } else if (nextName.equals("preview")) {
                    str2 = jsonReader.nextString();
                }
            }
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            return new AnonymousClass00I((Object) null, (Object) null);
        }
        return C36441kJ.A0W(new AnonymousClass3XN(str, iArr[0], iArr[1]), new AnonymousClass3XN(str2, iArr[0], iArr[1]));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01cb, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        X.C05600Qi.A00(r16, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01d1, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass00I A01(X.AnonymousClass58R r23, X.C1043859l r24, java.lang.String r25) {
        /*
            java.lang.String r19 = "gif/search/tenor/unknown_error"
            r8 = r24
            X.0wo r10 = r8.A03
            long r4 = X.C19970wo.A00(r10)
            r0 = 10
            r6 = 0
            r9 = r23
            android.net.TrafficStats.setThreadStatsTag(r0)     // Catch:{ SocketTimeoutException -> 0x01ec, IOException -> 0x01df, IllegalStateException -> 0x01d2 }
            r0 = r25
            javax.net.ssl.HttpsURLConnection r7 = r8.A03(r0)     // Catch:{ SocketTimeoutException -> 0x01ec, IOException -> 0x01df, IllegalStateException -> 0x01d2 }
            long r0 = X.C19970wo.A00(r10)     // Catch:{ SocketTimeoutException -> 0x01ec, IOException -> 0x01df, IllegalStateException -> 0x01d2 }
            java.lang.Long r0 = X.C90504aG.A0h(r0, r4)     // Catch:{ SocketTimeoutException -> 0x01ec, IOException -> 0x01df, IllegalStateException -> 0x01d2 }
            r9.A03 = r0     // Catch:{ SocketTimeoutException -> 0x01ec, IOException -> 0x01df, IllegalStateException -> 0x01d2 }
            long r2 = X.C19970wo.A00(r10)     // Catch:{ SocketTimeoutException -> 0x01ec, IOException -> 0x01df, IllegalStateException -> 0x01d2 }
            int r11 = r7.getResponseCode()     // Catch:{ SocketTimeoutException -> 0x01ec, IOException -> 0x01df, IllegalStateException -> 0x01d2 }
            long r0 = X.C19970wo.A00(r10)     // Catch:{ SocketTimeoutException -> 0x01ec, IOException -> 0x01df, IllegalStateException -> 0x01d2 }
            java.lang.Long r0 = X.C90504aG.A0h(r0, r2)     // Catch:{ SocketTimeoutException -> 0x01ec, IOException -> 0x01df, IllegalStateException -> 0x01d2 }
            r9.A02 = r0     // Catch:{ SocketTimeoutException -> 0x01ec, IOException -> 0x01df, IllegalStateException -> 0x01d2 }
            java.lang.Long r0 = X.C36441kJ.A0y(r11)     // Catch:{ SocketTimeoutException -> 0x01ec, IOException -> 0x01df, IllegalStateException -> 0x01d2 }
            r9.A04 = r0     // Catch:{ SocketTimeoutException -> 0x01ec, IOException -> 0x01df, IllegalStateException -> 0x01d2 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r11 == r0) goto L_0x004b
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ SocketTimeoutException -> 0x01ec, IOException -> 0x01df, IllegalStateException -> 0x01d2 }
            java.lang.String r0 = "gif/search/tenor/request failed "
            X.C36321k7.A1S(r0, r1, r11)     // Catch:{ SocketTimeoutException -> 0x01ec, IOException -> 0x01df, IllegalStateException -> 0x01d2 }
            X.AnonymousClass58R.A00(r10, r9, r8, r4)
            return r6
        L_0x004b:
            X.C19970wo.A00(r10)     // Catch:{ SocketTimeoutException -> 0x01ec, IOException -> 0x01df, IllegalStateException -> 0x01d2 }
            r13 = 0
            r15 = 0
            r2 = -1
            r12 = 0
            r11 = 0
            long r17 = X.C19970wo.A00(r10)     // Catch:{ SocketTimeoutException -> 0x01ec, IOException -> 0x01df, IllegalStateException -> 0x01d2 }
            X.0ww r1 = r8.A02     // Catch:{ SocketTimeoutException -> 0x01ec, IOException -> 0x01df, IllegalStateException -> 0x01d2 }
            java.lang.Integer r0 = X.C36381kD.A0m()     // Catch:{ SocketTimeoutException -> 0x01ec, IOException -> 0x01df, IllegalStateException -> 0x01d2 }
            X.5RE r0 = X.C132776Vf.A00(r1, r6, r0, r7)     // Catch:{ SocketTimeoutException -> 0x01ec, IOException -> 0x01df, IllegalStateException -> 0x01d2 }
            android.util.JsonReader r16 = X.C90474aD.A0K(r0)     // Catch:{ SocketTimeoutException -> 0x01ec, IOException -> 0x01df, IllegalStateException -> 0x01d2 }
            r16.beginObject()     // Catch:{ all -> 0x01c9 }
        L_0x0069:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x01c9 }
            if (r0 == 0) goto L_0x016e
            if (r13 != 0) goto L_0x016e
            java.lang.String r1 = r16.nextName()     // Catch:{ all -> 0x01c9 }
            if (r1 == 0) goto L_0x007e
            int r0 = r1.hashCode()     // Catch:{ all -> 0x01c9 }
            switch(r0) {
                case -791787109: goto L_0x0135;
                case 3059181: goto L_0x013f;
                case 3377907: goto L_0x014d;
                case 96784904: goto L_0x015b;
                case 1097546742: goto L_0x008b;
                default: goto L_0x007e;
            }     // Catch:{ all -> 0x01c9 }
        L_0x007e:
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x01c9 }
            java.lang.String r0 = "gif/search/tenor/unexpected key - "
            X.C36321k7.A1R(r0, r1, r6)     // Catch:{ all -> 0x01c9 }
        L_0x0087:
            r16.skipValue()     // Catch:{ all -> 0x01c9 }
            goto L_0x0069
        L_0x008b:
            java.lang.String r0 = "results"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x01c9 }
            if (r0 == 0) goto L_0x007e
            java.util.ArrayList r11 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x01c9 }
            r16.beginArray()     // Catch:{ all -> 0x01c9 }
        L_0x009a:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x01c9 }
            if (r0 == 0) goto L_0x0169
            r16.beginObject()     // Catch:{ all -> 0x01c9 }
            r24 = 0
            r6 = r15
            r1 = r15
            r7 = r15
        L_0x00a8:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x01c9 }
            if (r0 == 0) goto L_0x0116
            java.lang.String r14 = r16.nextName()     // Catch:{ all -> 0x01c9 }
            java.lang.String r0 = "id"
            boolean r0 = X.AnonymousClass00C.A0J(r14, r0)     // Catch:{ all -> 0x01c9 }
            if (r0 == 0) goto L_0x00bf
            java.lang.String r24 = r16.nextString()     // Catch:{ all -> 0x01c9 }
            goto L_0x00a8
        L_0x00bf:
            java.lang.String r0 = "media"
            boolean r0 = X.AnonymousClass00C.A0J(r14, r0)     // Catch:{ all -> 0x01c9 }
            if (r0 == 0) goto L_0x0112
            r16.beginArray()     // Catch:{ all -> 0x01c9 }
            r16.beginObject()     // Catch:{ all -> 0x01c9 }
        L_0x00cd:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x01c9 }
            if (r0 == 0) goto L_0x0101
            java.lang.String r14 = r16.nextName()     // Catch:{ all -> 0x01c9 }
            java.lang.String r0 = "tinymp4"
            boolean r0 = X.AnonymousClass00C.A0J(r14, r0)     // Catch:{ all -> 0x01c9 }
            if (r0 == 0) goto L_0x00e8
            X.00I r0 = A00(r16)     // Catch:{ all -> 0x01c9 }
            java.lang.Object r7 = r0.A00     // Catch:{ all -> 0x01c9 }
            X.3XN r7 = (X.AnonymousClass3XN) r7     // Catch:{ all -> 0x01c9 }
            goto L_0x00cd
        L_0x00e8:
            java.lang.String r0 = "previewgif"
            boolean r0 = X.AnonymousClass00C.A0J(r14, r0)     // Catch:{ all -> 0x01c9 }
            if (r0 == 0) goto L_0x00fd
            X.00I r0 = A00(r16)     // Catch:{ all -> 0x01c9 }
            java.lang.Object r6 = r0.A00     // Catch:{ all -> 0x01c9 }
            X.3XN r6 = (X.AnonymousClass3XN) r6     // Catch:{ all -> 0x01c9 }
            java.lang.Object r1 = r0.A01     // Catch:{ all -> 0x01c9 }
            X.3XN r1 = (X.AnonymousClass3XN) r1     // Catch:{ all -> 0x01c9 }
            goto L_0x00cd
        L_0x00fd:
            r16.skipValue()     // Catch:{ all -> 0x01c9 }
            goto L_0x00cd
        L_0x0101:
            r16.endObject()     // Catch:{ all -> 0x01c9 }
        L_0x0104:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x01c9 }
            if (r0 == 0) goto L_0x010e
            r16.skipValue()     // Catch:{ all -> 0x01c9 }
            goto L_0x0104
        L_0x010e:
            r16.endArray()     // Catch:{ all -> 0x01c9 }
            goto L_0x00a8
        L_0x0112:
            r16.skipValue()     // Catch:{ all -> 0x01c9 }
            goto L_0x00a8
        L_0x0116:
            r16.endObject()     // Catch:{ all -> 0x01c9 }
            if (r24 == 0) goto L_0x009a
            if (r6 == 0) goto L_0x009a
            if (r1 == 0) goto L_0x009a
            if (r7 == 0) goto L_0x009a
            r25 = 2
            X.3XU r0 = new X.3XU     // Catch:{ all -> 0x01c9 }
            r20 = r0
            r21 = r6
            r22 = r1
            r23 = r7
            r20.<init>(r21, r22, r23, r24, r25)     // Catch:{ all -> 0x01c9 }
            r11.add(r0)     // Catch:{ all -> 0x01c9 }
            goto L_0x009a
        L_0x0135:
            java.lang.String r0 = "weburl"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x01c9 }
            if (r0 != 0) goto L_0x0087
            goto L_0x007e
        L_0x013f:
            java.lang.String r0 = "code"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x01c9 }
            if (r0 == 0) goto L_0x007e
            long r2 = r16.nextLong()     // Catch:{ all -> 0x01c9 }
            goto L_0x0069
        L_0x014d:
            java.lang.String r0 = "next"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x01c9 }
            if (r0 == 0) goto L_0x007e
            java.lang.String r12 = r16.nextString()     // Catch:{ all -> 0x01c9 }
            goto L_0x0069
        L_0x015b:
            java.lang.String r0 = "error"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x01c9 }
            if (r0 == 0) goto L_0x007e
            java.lang.String r13 = r16.nextString()     // Catch:{ all -> 0x01c9 }
            goto L_0x0069
        L_0x0169:
            r16.endArray()     // Catch:{ all -> 0x01c9 }
            goto L_0x0069
        L_0x016e:
            r16.endObject()     // Catch:{ all -> 0x01c9 }
            r16.close()     // Catch:{ SocketTimeoutException -> 0x01ec, IOException -> 0x01df, IllegalStateException -> 0x01d2 }
            long r6 = X.C19970wo.A00(r10)     // Catch:{ SocketTimeoutException -> 0x01ec, IOException -> 0x01df, IllegalStateException -> 0x01d2 }
            r0 = r17
            java.lang.Long r0 = X.C90504aG.A0h(r6, r0)     // Catch:{ SocketTimeoutException -> 0x01ec, IOException -> 0x01df, IllegalStateException -> 0x01d2 }
            r9.A06 = r0     // Catch:{ SocketTimeoutException -> 0x01ec, IOException -> 0x01df, IllegalStateException -> 0x01d2 }
            if (r13 == 0) goto L_0x01a4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ SocketTimeoutException -> 0x01ec, IOException -> 0x01df, IllegalStateException -> 0x01d2 }
            r1.append(r2)     // Catch:{ SocketTimeoutException -> 0x01ec, IOException -> 0x01df, IllegalStateException -> 0x01d2 }
            r0 = 40
            r1.append(r0)     // Catch:{ SocketTimeoutException -> 0x01ec, IOException -> 0x01df, IllegalStateException -> 0x01d2 }
            java.lang.String r2 = X.C36321k7.A0E(r13, r1)     // Catch:{ SocketTimeoutException -> 0x01ec, IOException -> 0x01df, IllegalStateException -> 0x01d2 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ SocketTimeoutException -> 0x01ec, IOException -> 0x01df, IllegalStateException -> 0x01d2 }
            java.lang.String r0 = "gif/search/tenor/got error: "
            X.C36321k7.A1R(r0, r2, r1)     // Catch:{ SocketTimeoutException -> 0x01ec, IOException -> 0x01df, IllegalStateException -> 0x01d2 }
            java.lang.Integer r0 = X.C36371kC.A0p()     // Catch:{ SocketTimeoutException -> 0x01ec, IOException -> 0x01df, IllegalStateException -> 0x01d2 }
            r9.A01 = r0     // Catch:{ SocketTimeoutException -> 0x01ec, IOException -> 0x01df, IllegalStateException -> 0x01d2 }
            r9.A07 = r2     // Catch:{ SocketTimeoutException -> 0x01ec, IOException -> 0x01df, IllegalStateException -> 0x01d2 }
            goto L_0x01f8
        L_0x01a4:
            java.lang.String r0 = "0"
            boolean r0 = r0.equals(r12)     // Catch:{ SocketTimeoutException -> 0x01ec, IOException -> 0x01df, IllegalStateException -> 0x01d2 }
            if (r0 == 0) goto L_0x01ad
            r12 = 0
        L_0x01ad:
            if (r11 != 0) goto L_0x01bb
            X.00I r1 = new X.00I     // Catch:{ SocketTimeoutException -> 0x01ec, IOException -> 0x01df, IllegalStateException -> 0x01d2 }
            r1.<init>(r15, r15)     // Catch:{ SocketTimeoutException -> 0x01ec, IOException -> 0x01df, IllegalStateException -> 0x01d2 }
            java.lang.Integer r0 = X.C36361kB.A0j()     // Catch:{ SocketTimeoutException -> 0x01ec, IOException -> 0x01df, IllegalStateException -> 0x01d2 }
            r9.A01 = r0     // Catch:{ SocketTimeoutException -> 0x01ec, IOException -> 0x01df, IllegalStateException -> 0x01d2 }
            goto L_0x01c5
        L_0x01bb:
            X.00I r1 = X.C36441kJ.A0W(r12, r11)     // Catch:{ SocketTimeoutException -> 0x01ec, IOException -> 0x01df, IllegalStateException -> 0x01d2 }
            java.lang.Integer r0 = X.C36361kB.A0i()     // Catch:{ SocketTimeoutException -> 0x01ec, IOException -> 0x01df, IllegalStateException -> 0x01d2 }
            r9.A01 = r0     // Catch:{ SocketTimeoutException -> 0x01ec, IOException -> 0x01df, IllegalStateException -> 0x01d2 }
        L_0x01c5:
            X.AnonymousClass58R.A00(r10, r9, r8, r4)
            return r1
        L_0x01c9:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x01cb }
        L_0x01cb:
            r1 = move-exception
            r0 = r16
            X.C05600Qi.A00(r0, r2)     // Catch:{ SocketTimeoutException -> 0x01ec, IOException -> 0x01df, IllegalStateException -> 0x01d2 }
            throw r1     // Catch:{ SocketTimeoutException -> 0x01ec, IOException -> 0x01df, IllegalStateException -> 0x01d2 }
        L_0x01d2:
            r1 = move-exception
            r0 = r19
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x01fd }
            java.lang.Integer r0 = X.C36361kB.A0j()     // Catch:{ all -> 0x01fd }
            r9.A01 = r0     // Catch:{ all -> 0x01fd }
            goto L_0x01f8
        L_0x01df:
            r1 = move-exception
            r0 = r19
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x01fd }
            java.lang.Integer r0 = X.C36361kB.A0j()     // Catch:{ all -> 0x01fd }
            r9.A01 = r0     // Catch:{ all -> 0x01fd }
            goto L_0x01f8
        L_0x01ec:
            r1 = move-exception
            java.lang.String r0 = "gif/search/tenor/timeout"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x01fd }
            java.lang.Integer r0 = X.C36371kC.A0n()     // Catch:{ all -> 0x01fd }
            r9.A01 = r0     // Catch:{ all -> 0x01fd }
        L_0x01f8:
            X.AnonymousClass58R.A00(r10, r9, r8, r4)
            r0 = 0
            return r0
        L_0x01fd:
            r0 = move-exception
            X.AnonymousClass58R.A00(r10, r9, r8, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1043859l.A01(X.58R, X.59l, java.lang.String):X.00I");
    }

    public AnonymousClass67Z A05() {
        return new C162777p8(this);
    }

    public AnonymousClass67Z A06(CharSequence charSequence, boolean z) {
        return new C162787p9(this, charSequence);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1043859l(C20050ww r2, C19970wo r3, C18820ts r4, C221112x r5, C21010yW r6, AnonymousClass1GZ r7, AnonymousClass6O2 r8, C20020wt r9, C19770wU r10) {
        super(r2, r3, r4, r5, r6, r7, r8, r9, r10);
        C36321k7.A1B(r3, r5, r7, r9, r10);
        C36321k7.A13(r2, r6, r4);
        AnonymousClass00C.A0D(r8, 9);
    }

    public int A04() {
        return 1;
    }

    public String A07() {
        return "Tenor";
    }
}
