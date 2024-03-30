package X;

/* renamed from: X.59k  reason: invalid class name and case insensitive filesystem */
public final class C1043759k extends AnonymousClass3L7 {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0219, code lost:
        if (r16 == null) goto L_0x021b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0224, code lost:
        if (r17 == null) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0226, code lost:
        r26 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x02bd, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:?, code lost:
        X.C05600Qi.A00(r21, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x02c3, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x02c4, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x02c6, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x02c8, code lost:
        r0 = e;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:139:0x0254, B:156:0x02bc] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x021f A[Catch:{ all -> 0x02b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x00ad A[SYNTHETIC] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:170:0x02d1=Splitter:B:170:0x02d1, B:176:0x02e7=Splitter:B:176:0x02e7, B:173:0x02dc=Splitter:B:173:0x02dc} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass00I A00(X.AnonymousClass58R r27, X.C1043759k r28, java.lang.String r29) {
        /*
            r7 = r28
            X.0wo r15 = r7.A03
            long r2 = X.C19970wo.A00(r15)
            r0 = 10
            r6 = 0
            r8 = r27
            android.net.TrafficStats.setThreadStatsTag(r0)     // Catch:{ SocketTimeoutException -> 0x02e6, IOException -> 0x02db, IllegalStateException -> 0x02d0 }
            r0 = r29
            javax.net.ssl.HttpsURLConnection r11 = r7.A03(r0)     // Catch:{ SocketTimeoutException -> 0x02e6, IOException -> 0x02db, IllegalStateException -> 0x02d0 }
            long r0 = X.C19970wo.A00(r15)     // Catch:{ SocketTimeoutException -> 0x02e6, IOException -> 0x02db, IllegalStateException -> 0x02d0 }
            java.lang.Long r0 = X.C90504aG.A0h(r0, r2)     // Catch:{ SocketTimeoutException -> 0x02e6, IOException -> 0x02db, IllegalStateException -> 0x02d0 }
            r8.A03 = r0     // Catch:{ SocketTimeoutException -> 0x02e6, IOException -> 0x02db, IllegalStateException -> 0x02d0 }
            long r19 = X.C19970wo.A00(r15)     // Catch:{ SocketTimeoutException -> 0x02e6, IOException -> 0x02db, IllegalStateException -> 0x02d0 }
            int r9 = r11.getResponseCode()     // Catch:{ SocketTimeoutException -> 0x02e6, IOException -> 0x02db, IllegalStateException -> 0x02d0 }
            long r4 = X.C19970wo.A00(r15)     // Catch:{ SocketTimeoutException -> 0x02e6, IOException -> 0x02db, IllegalStateException -> 0x02d0 }
            r0 = r19
            java.lang.Long r0 = X.C90504aG.A0h(r4, r0)     // Catch:{ SocketTimeoutException -> 0x02e6, IOException -> 0x02db, IllegalStateException -> 0x02d0 }
            r8.A02 = r0     // Catch:{ SocketTimeoutException -> 0x02e6, IOException -> 0x02db, IllegalStateException -> 0x02d0 }
            java.lang.Long r0 = X.C36441kJ.A0y(r9)     // Catch:{ SocketTimeoutException -> 0x02e6, IOException -> 0x02db, IllegalStateException -> 0x02d0 }
            r8.A04 = r0     // Catch:{ SocketTimeoutException -> 0x02e6, IOException -> 0x02db, IllegalStateException -> 0x02d0 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r9 == r0) goto L_0x004b
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ SocketTimeoutException -> 0x02e6, IOException -> 0x02db, IllegalStateException -> 0x02d0 }
            java.lang.String r0 = "gif/search/giphy/request failed "
            X.C36321k7.A1S(r0, r1, r9)     // Catch:{ SocketTimeoutException -> 0x02e6, IOException -> 0x02db, IllegalStateException -> 0x02d0 }
            X.AnonymousClass58R.A00(r15, r8, r7, r2)
            return r6
        L_0x004b:
            X.C19970wo.A00(r15)     // Catch:{ SocketTimeoutException -> 0x02e6, IOException -> 0x02db, IllegalStateException -> 0x02d0 }
            r10 = 0
            r23 = 0
            r9 = 0
            X.0ww r1 = r7.A02     // Catch:{ SocketTimeoutException -> 0x02e6, IOException -> 0x02db, IllegalStateException -> 0x02d0 }
            r22 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r22)     // Catch:{ SocketTimeoutException -> 0x02ce, IOException -> 0x02cc, IllegalStateException -> 0x02ca }
            X.5RE r0 = X.C132776Vf.A00(r1, r6, r0, r11)     // Catch:{ SocketTimeoutException -> 0x02ce, IOException -> 0x02cc, IllegalStateException -> 0x02ca }
            android.util.JsonReader r21 = X.C90474aD.A0K(r0)     // Catch:{ SocketTimeoutException -> 0x02ce, IOException -> 0x02cc, IllegalStateException -> 0x02ca }
            r21.beginObject()     // Catch:{ all -> 0x02bb }
        L_0x0065:
            boolean r0 = r21.hasNext()     // Catch:{ all -> 0x02bb }
            if (r0 == 0) goto L_0x0251
            java.lang.String r4 = r21.nextName()     // Catch:{ all -> 0x02bb }
            if (r4 == 0) goto L_0x0243
            int r1 = r4.hashCode()     // Catch:{ all -> 0x02bb }
            r0 = 3076010(0x2eefaa, float:4.310408E-39)
            if (r1 == r0) goto L_0x009e
            r0 = 3347973(0x331605, float:4.69151E-39)
            if (r1 == r0) goto L_0x0091
            r0 = 1297692570(0x4d59379a, float:2.27768736E8)
            if (r1 != r0) goto L_0x0243
            java.lang.String r0 = "pagination"
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x02bb }
            if (r0 == 0) goto L_0x0243
            java.lang.String r23 = X.AnonymousClass6W4.A02(r21)     // Catch:{ all -> 0x02bb }
            goto L_0x0065
        L_0x0091:
            java.lang.String r0 = "meta"
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x02bb }
            if (r0 == 0) goto L_0x0243
            X.00I r10 = X.AnonymousClass6W4.A00(r21)     // Catch:{ all -> 0x02bb }
            goto L_0x0065
        L_0x009e:
            java.lang.String r0 = "data"
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x02bb }
            if (r0 == 0) goto L_0x0243
            java.util.ArrayList r9 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x02b9 }
            r21.beginArray()     // Catch:{ all -> 0x02b9 }
        L_0x00ad:
            boolean r0 = r21.hasNext()     // Catch:{ all -> 0x02b9 }
            if (r0 == 0) goto L_0x023e
            r21.beginObject()     // Catch:{ all -> 0x02b9 }
            r12 = 0
            r28 = r6
            r26 = r6
            r18 = r6
            r17 = r6
            r16 = r6
            r11 = r6
        L_0x00c2:
            boolean r0 = r21.hasNext()     // Catch:{ all -> 0x02b9 }
            if (r0 == 0) goto L_0x0205
            java.lang.String r1 = r21.nextName()     // Catch:{ all -> 0x02b9 }
            java.lang.String r0 = "id"
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)     // Catch:{ all -> 0x02b9 }
            if (r0 == 0) goto L_0x00d9
            java.lang.String r28 = r21.nextString()     // Catch:{ all -> 0x02b9 }
            goto L_0x00c2
        L_0x00d9:
            java.lang.String r0 = "images"
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)     // Catch:{ all -> 0x02b9 }
            if (r0 == 0) goto L_0x0200
            r21.beginObject()     // Catch:{ all -> 0x02b9 }
        L_0x00e4:
            boolean r0 = r21.hasNext()     // Catch:{ all -> 0x02b9 }
            if (r0 == 0) goto L_0x01fb
            java.lang.String r1 = r21.nextName()     // Catch:{ all -> 0x02b9 }
            if (r1 == 0) goto L_0x00f7
            int r0 = r1.hashCode()     // Catch:{ all -> 0x02b9 }
            switch(r0) {
                case -1762572285: goto L_0x01ed;
                case -1290895667: goto L_0x0188;
                case -511616133: goto L_0x017a;
                case 1107258473: goto L_0x0115;
                case 1723279212: goto L_0x0108;
                case 1968782756: goto L_0x00fb;
                default: goto L_0x00f7;
            }     // Catch:{ all -> 0x02b9 }
        L_0x00f7:
            r21.skipValue()     // Catch:{ all -> 0x02b9 }
            goto L_0x00e4
        L_0x00fb:
            java.lang.String r0 = "fixed_width_still"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x02b9 }
            if (r0 == 0) goto L_0x00f7
            X.3XN r17 = X.AnonymousClass6W4.A01(r21)     // Catch:{ all -> 0x02b9 }
            goto L_0x00e4
        L_0x0108:
            java.lang.String r0 = "fixed_width_small_still"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x02b9 }
            if (r0 == 0) goto L_0x00f7
            X.3XN r26 = X.AnonymousClass6W4.A01(r21)     // Catch:{ all -> 0x02b9 }
            goto L_0x00e4
        L_0x0115:
            java.lang.String r0 = "downsized_small"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x02b9 }
            if (r0 == 0) goto L_0x00f7
            r21.beginObject()     // Catch:{ all -> 0x02b9 }
            r13 = -1
            r11 = 0
            r5 = r6
            r4 = -1
        L_0x0124:
            boolean r0 = r21.hasNext()     // Catch:{ all -> 0x02b9 }
            if (r0 == 0) goto L_0x016e
            java.lang.String r1 = r21.nextName()     // Catch:{ all -> 0x02b9 }
            if (r1 == 0) goto L_0x016a
            int r0 = r1.hashCode()     // Catch:{ all -> 0x02b9 }
            r14 = -1221029593(0xffffffffb7389127, float:-1.1001051E-5)
            if (r0 == r14) goto L_0x015d
            r14 = 108273(0x1a6f1, float:1.51723E-40)
            if (r0 == r14) goto L_0x0150
            r14 = 113126854(0x6be2dc6, float:7.1537315E-35)
            if (r0 != r14) goto L_0x016a
            java.lang.String r0 = "width"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x02b9 }
            if (r0 == 0) goto L_0x016a
            int r13 = X.C90484aE.A0A(r21)     // Catch:{ all -> 0x02b9 }
            goto L_0x0124
        L_0x0150:
            java.lang.String r0 = "mp4"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x02b9 }
            if (r0 == 0) goto L_0x016a
            java.lang.String r5 = r21.nextString()     // Catch:{ all -> 0x02b9 }
            goto L_0x0124
        L_0x015d:
            java.lang.String r0 = "height"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x02b9 }
            if (r0 == 0) goto L_0x016a
            int r4 = X.C90484aE.A0A(r21)     // Catch:{ all -> 0x02b9 }
            goto L_0x0124
        L_0x016a:
            r21.skipValue()     // Catch:{ all -> 0x02b9 }
            goto L_0x0124
        L_0x016e:
            r21.endObject()     // Catch:{ all -> 0x02b9 }
            if (r5 == 0) goto L_0x00e4
            X.3XN r11 = new X.3XN     // Catch:{ all -> 0x02b9 }
            r11.<init>(r5, r13, r4)     // Catch:{ all -> 0x02b9 }
            goto L_0x00e4
        L_0x017a:
            java.lang.String r0 = "fixed_height_still"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x02b9 }
            if (r0 == 0) goto L_0x00f7
            X.3XN r16 = X.AnonymousClass6W4.A01(r21)     // Catch:{ all -> 0x02b9 }
            goto L_0x00e4
        L_0x0188:
            java.lang.String r0 = "preview_gif"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x02b9 }
            if (r0 == 0) goto L_0x00f7
            r21.beginObject()     // Catch:{ all -> 0x02b9 }
            r13 = -1
            r12 = 0
            r5 = r6
            r4 = -1
        L_0x0197:
            boolean r0 = r21.hasNext()     // Catch:{ all -> 0x02b9 }
            if (r0 == 0) goto L_0x01e1
            java.lang.String r1 = r21.nextName()     // Catch:{ all -> 0x02b9 }
            if (r1 == 0) goto L_0x01dd
            int r0 = r1.hashCode()     // Catch:{ all -> 0x02b9 }
            r14 = -1221029593(0xffffffffb7389127, float:-1.1001051E-5)
            if (r0 == r14) goto L_0x01d0
            r14 = 116079(0x1c56f, float:1.62661E-40)
            if (r0 == r14) goto L_0x01c3
            r14 = 113126854(0x6be2dc6, float:7.1537315E-35)
            if (r0 != r14) goto L_0x01dd
            java.lang.String r0 = "width"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x02b9 }
            if (r0 == 0) goto L_0x01dd
            int r13 = X.C90484aE.A0A(r21)     // Catch:{ all -> 0x02b9 }
            goto L_0x0197
        L_0x01c3:
            java.lang.String r0 = "url"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x02b9 }
            if (r0 == 0) goto L_0x01dd
            java.lang.String r5 = r21.nextString()     // Catch:{ all -> 0x02b9 }
            goto L_0x0197
        L_0x01d0:
            java.lang.String r0 = "height"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x02b9 }
            if (r0 == 0) goto L_0x01dd
            int r4 = X.C90484aE.A0A(r21)     // Catch:{ all -> 0x02b9 }
            goto L_0x0197
        L_0x01dd:
            r21.skipValue()     // Catch:{ all -> 0x02b9 }
            goto L_0x0197
        L_0x01e1:
            r21.endObject()     // Catch:{ all -> 0x02b9 }
            if (r5 == 0) goto L_0x00e4
            X.3XN r12 = new X.3XN     // Catch:{ all -> 0x02b9 }
            r12.<init>(r5, r13, r4)     // Catch:{ all -> 0x02b9 }
            goto L_0x00e4
        L_0x01ed:
            java.lang.String r0 = "fixed_height_small_still"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x02b9 }
            if (r0 == 0) goto L_0x00f7
            X.3XN r18 = X.AnonymousClass6W4.A01(r21)     // Catch:{ all -> 0x02b9 }
            goto L_0x00e4
        L_0x01fb:
            r21.endObject()     // Catch:{ all -> 0x02b9 }
            goto L_0x00c2
        L_0x0200:
            r21.skipValue()     // Catch:{ all -> 0x02b9 }
            goto L_0x00c2
        L_0x0205:
            r21.endObject()     // Catch:{ all -> 0x02b9 }
            if (r28 == 0) goto L_0x00ad
            if (r12 == 0) goto L_0x00ad
            if (r11 == 0) goto L_0x00ad
            int r1 = r11.A01     // Catch:{ all -> 0x02b9 }
            int r0 = r11.A00     // Catch:{ all -> 0x02b9 }
            if (r1 <= r0) goto L_0x0215
            goto L_0x0220
        L_0x0215:
            if (r18 != 0) goto L_0x0229
            if (r26 != 0) goto L_0x021d
            if (r16 != 0) goto L_0x0226
        L_0x021b:
            r26 = r17
        L_0x021d:
            if (r26 == 0) goto L_0x00ad
            goto L_0x022c
        L_0x0220:
            if (r26 != 0) goto L_0x021d
            if (r18 != 0) goto L_0x0229
            if (r17 != 0) goto L_0x021b
        L_0x0226:
            r26 = r16
            goto L_0x021d
        L_0x0229:
            r26 = r18
            goto L_0x021d
        L_0x022c:
            r29 = 1
            X.3XU r0 = new X.3XU     // Catch:{ all -> 0x02b9 }
            r24 = r0
            r25 = r12
            r27 = r11
            r24.<init>(r25, r26, r27, r28, r29)     // Catch:{ all -> 0x02b9 }
            r9.add(r0)     // Catch:{ all -> 0x02b9 }
            goto L_0x00ad
        L_0x023e:
            r21.endArray()     // Catch:{ all -> 0x02b9 }
            goto L_0x0065
        L_0x0243:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x02b9 }
            java.lang.String r0 = "gif/search/giphy/unexpected key - "
            X.C36321k7.A1R(r0, r4, r1)     // Catch:{ all -> 0x02b9 }
            r21.skipValue()     // Catch:{ all -> 0x02b9 }
            goto L_0x0065
        L_0x0251:
            r21.endObject()     // Catch:{ all -> 0x02b9 }
            r21.close()     // Catch:{ SocketTimeoutException -> 0x02c8, IOException -> 0x02c6, IllegalStateException -> 0x02c4 }
            long r4 = X.C19970wo.A00(r15)     // Catch:{ SocketTimeoutException -> 0x02c8, IOException -> 0x02c6, IllegalStateException -> 0x02c4 }
            r0 = r19
            java.lang.Long r0 = X.C90504aG.A0h(r4, r0)     // Catch:{ SocketTimeoutException -> 0x02c8, IOException -> 0x02c6, IllegalStateException -> 0x02c4 }
            r8.A06 = r0     // Catch:{ SocketTimeoutException -> 0x02c8, IOException -> 0x02c6, IllegalStateException -> 0x02c4 }
            r5 = 1
            if (r10 == 0) goto L_0x029b
            java.lang.Object r4 = r10.A00     // Catch:{ SocketTimeoutException -> 0x02c8, IOException -> 0x02c6, IllegalStateException -> 0x02c4 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ SocketTimeoutException -> 0x02c8, IOException -> 0x02c6, IllegalStateException -> 0x02c4 }
            if (r4 == 0) goto L_0x0276
            int r1 = r4.intValue()     // Catch:{ SocketTimeoutException -> 0x02c8, IOException -> 0x02c6, IllegalStateException -> 0x02c4 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r0 != r1) goto L_0x0276
            r22 = 1
        L_0x0276:
            if (r22 != 0) goto L_0x029b
            java.lang.StringBuilder r1 = X.C36381kD.A11(r4)     // Catch:{ SocketTimeoutException -> 0x02c8, IOException -> 0x02c6, IllegalStateException -> 0x02c4 }
            r0 = 40
            r1.append(r0)     // Catch:{ SocketTimeoutException -> 0x02c8, IOException -> 0x02c6, IllegalStateException -> 0x02c4 }
            java.lang.Object r0 = r10.A01     // Catch:{ SocketTimeoutException -> 0x02c8, IOException -> 0x02c6, IllegalStateException -> 0x02c4 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ SocketTimeoutException -> 0x02c8, IOException -> 0x02c6, IllegalStateException -> 0x02c4 }
            java.lang.String r4 = X.C36321k7.A0E(r0, r1)     // Catch:{ SocketTimeoutException -> 0x02c8, IOException -> 0x02c6, IllegalStateException -> 0x02c4 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ SocketTimeoutException -> 0x02c8, IOException -> 0x02c6, IllegalStateException -> 0x02c4 }
            java.lang.String r0 = "gif/search/giphy/got error: "
            X.C36321k7.A1R(r0, r4, r1)     // Catch:{ SocketTimeoutException -> 0x02c8, IOException -> 0x02c6, IllegalStateException -> 0x02c4 }
            java.lang.Integer r0 = X.C36371kC.A0p()     // Catch:{ SocketTimeoutException -> 0x02c8, IOException -> 0x02c6, IllegalStateException -> 0x02c4 }
            r8.A01 = r0     // Catch:{ SocketTimeoutException -> 0x02c8, IOException -> 0x02c6, IllegalStateException -> 0x02c4 }
            r8.A07 = r4     // Catch:{ SocketTimeoutException -> 0x02c8, IOException -> 0x02c6, IllegalStateException -> 0x02c4 }
            goto L_0x02f0
        L_0x029b:
            if (r9 != 0) goto L_0x02a9
            X.00I r1 = new X.00I     // Catch:{ SocketTimeoutException -> 0x02c8, IOException -> 0x02c6, IllegalStateException -> 0x02c4 }
            r1.<init>(r6, r6)     // Catch:{ SocketTimeoutException -> 0x02c8, IOException -> 0x02c6, IllegalStateException -> 0x02c4 }
            java.lang.Integer r0 = X.C36361kB.A0j()     // Catch:{ SocketTimeoutException -> 0x02c8, IOException -> 0x02c6, IllegalStateException -> 0x02c4 }
            r8.A01 = r0     // Catch:{ SocketTimeoutException -> 0x02c8, IOException -> 0x02c6, IllegalStateException -> 0x02c4 }
            goto L_0x02b5
        L_0x02a9:
            r0 = r23
            X.00I r1 = X.C36441kJ.A0W(r0, r9)     // Catch:{ SocketTimeoutException -> 0x02c8, IOException -> 0x02c6, IllegalStateException -> 0x02c4 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch:{ SocketTimeoutException -> 0x02c8, IOException -> 0x02c6, IllegalStateException -> 0x02c4 }
            r8.A01 = r0     // Catch:{ SocketTimeoutException -> 0x02c8, IOException -> 0x02c6, IllegalStateException -> 0x02c4 }
        L_0x02b5:
            X.AnonymousClass58R.A00(r15, r8, r7, r2)
            return r1
        L_0x02b9:
            r4 = move-exception
            goto L_0x02bc
        L_0x02bb:
            r4 = move-exception
        L_0x02bc:
            throw r4     // Catch:{ all -> 0x02bd }
        L_0x02bd:
            r1 = move-exception
            r0 = r21
            X.C05600Qi.A00(r0, r4)     // Catch:{ SocketTimeoutException -> 0x02c8, IOException -> 0x02c6, IllegalStateException -> 0x02c4 }
            throw r1     // Catch:{ SocketTimeoutException -> 0x02c8, IOException -> 0x02c6, IllegalStateException -> 0x02c4 }
        L_0x02c4:
            r0 = move-exception
            goto L_0x02d1
        L_0x02c6:
            r0 = move-exception
            goto L_0x02dc
        L_0x02c8:
            r0 = move-exception
            goto L_0x02e7
        L_0x02ca:
            r0 = move-exception
            goto L_0x02d1
        L_0x02cc:
            r0 = move-exception
            goto L_0x02dc
        L_0x02ce:
            r0 = move-exception
            goto L_0x02e7
        L_0x02d0:
            r0 = move-exception
        L_0x02d1:
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x02f4 }
            java.lang.Integer r0 = X.C36361kB.A0j()     // Catch:{ all -> 0x02f4 }
            r8.A01 = r0     // Catch:{ all -> 0x02f4 }
            goto L_0x02f0
        L_0x02db:
            r0 = move-exception
        L_0x02dc:
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x02f4 }
            java.lang.Integer r0 = X.C36361kB.A0j()     // Catch:{ all -> 0x02f4 }
            r8.A01 = r0     // Catch:{ all -> 0x02f4 }
            goto L_0x02f0
        L_0x02e6:
            r0 = move-exception
        L_0x02e7:
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x02f4 }
            java.lang.Integer r0 = X.C36371kC.A0n()     // Catch:{ all -> 0x02f4 }
            r8.A01 = r0     // Catch:{ all -> 0x02f4 }
        L_0x02f0:
            X.AnonymousClass58R.A00(r15, r8, r7, r2)
            return r6
        L_0x02f4:
            r0 = move-exception
            X.AnonymousClass58R.A00(r15, r8, r7, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1043759k.A00(X.58R, X.59k, java.lang.String):X.00I");
    }

    public AnonymousClass67Z A05() {
        return new C162777p8(this);
    }

    public AnonymousClass67Z A06(CharSequence charSequence, boolean z) {
        return new C162787p9(this, charSequence);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1043759k(C20050ww r2, C19970wo r3, C18820ts r4, C221112x r5, C21010yW r6, AnonymousClass1GZ r7, AnonymousClass6O2 r8, C20020wt r9, C19770wU r10) {
        super(r2, r3, r4, r5, r6, r7, r8, r9, r10);
        C36321k7.A1B(r3, r5, r7, r9, r10);
        C36321k7.A13(r2, r6, r4);
        AnonymousClass00C.A0D(r8, 9);
    }

    public int A04() {
        return 0;
    }

    public String A07() {
        return "Giphy";
    }
}
