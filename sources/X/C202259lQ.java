package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.HandlerThread;
import android.view.Surface;
import java.nio.ByteBuffer;

/* renamed from: X.9lQ  reason: invalid class name and case insensitive filesystem */
public final class C202259lQ {
    public MediaCodec A00;
    public Surface A01;
    public C202589mG A02;
    public AnonymousClass883 A03 = new AnonymousClass883(new C22077AgO(this));
    public C006302t A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public ByteBuffer A08;
    public final MediaFormat A09;
    public final AnonymousClass88A A0A;
    public final boolean A0B;

    public C202259lQ(AnonymousClass88A r5, boolean z) {
        this.A0A = r5;
        this.A0B = z;
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(AnonymousClass95D.A00(r5.A04), r5.A03, r5.A02);
        AnonymousClass00C.A08(createVideoFormat);
        createVideoFormat.setInteger("frame-rate", r5.A01);
        createVideoFormat.setInteger("i-frame-interval", 3);
        createVideoFormat.setInteger("bitrate", r5.A00);
        createVideoFormat.setInteger("color-format", 2135033992);
        this.A09 = createVideoFormat;
        this.A06 = true;
    }

    public final void A03() {
        A09(false);
        MediaCodec mediaCodec = this.A00;
        if (mediaCodec != null) {
            mediaCodec.release();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x017e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02() {
        /*
            r19 = this;
            r4 = r19
            android.media.MediaCodec r0 = r4.A00
            if (r0 != 0) goto L_0x017d
            boolean r12 = r4.A0B
            android.media.MediaFormat r11 = r4.A09
            X.88A r10 = r4.A0A
            r2 = 1
            X.AnonymousClass00C.A0D(r11, r2)
            X.9gk r6 = X.AnonymousClass9AO.A01
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Creating codec [preferSoftwareCodec = "
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = " , videoFormat = "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = " , mediaFormat = "
            r1.append(r0)
            r1.append(r11)
            r0 = 93
            java.lang.String r0 = X.AnonymousClass000.A0t(r1, r0)
            java.lang.String r5 = "sup:CodecFactory"
            r6.A01(r5, r0)
            android.media.MediaCodecList r8 = new android.media.MediaCodecList
            r8.<init>(r2)
            android.media.MediaCodecInfo[] r7 = r8.getCodecInfos()
            X.AnonymousClass00C.A08(r7)
            java.util.ArrayList r17 = X.AnonymousClass9AM.A01
            java.util.Set r3 = X.C007103b.A0f(r17)
            int r2 = r7.length
            int r0 = X.C000300d.A02(r2)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>(r0)
            r1 = 0
        L_0x0056:
            if (r1 >= r2) goto L_0x0060
            r0 = r7[r1]
            r9.add(r0)
            int r1 = r1 + 1
            goto L_0x0056
        L_0x0060:
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 != 0) goto L_0x0068
            java.util.List r3 = X.C007103b.A0Y(r3)
        L_0x0068:
            java.util.Collection r3 = (java.util.Collection) r3
            r9.retainAll(r3)
            android.media.MediaCodecInfo[] r8 = r8.getCodecInfos()
            X.AnonymousClass00C.A08(r8)
            int r0 = r8.length
            r18 = r0
            r13 = 0
        L_0x0078:
            java.lang.String r7 = "mime"
            r0 = r18
            if (r13 >= r0) goto L_0x013b
            r16 = r8[r13]
            boolean r1 = r16.isEncoder()
            r0 = 0
            if (r1 != r0) goto L_0x00a1
            java.util.ArrayList r1 = X.AnonymousClass9AM.A00
            java.lang.String r0 = r16.getName()
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x00a1
            if (r12 == 0) goto L_0x00b7
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x00a4
            boolean r0 = r16.isSoftwareOnly()
        L_0x009f:
            if (r0 != 0) goto L_0x00b7
        L_0x00a1:
            int r13 = r13 + 1
            goto L_0x0078
        L_0x00a4:
            boolean r0 = r9.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00b7
            java.lang.String r1 = r16.getName()
            r0 = r17
            boolean r0 = r0.contains(r1)
            goto L_0x009f
        L_0x00b7:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Found codec: "
            r1.append(r0)
            java.lang.String r0 = r16.getName()
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            r6.A01(r5, r0)
            java.lang.String[] r15 = r16.getSupportedTypes()
            X.AnonymousClass00C.A08(r15)
            int r14 = r15.length
            r3 = 0
        L_0x00d4:
            if (r3 >= r14) goto L_0x00a1
            r1 = r15[r3]
            java.lang.String r0 = r11.getString(r7)
            if (r1 != 0) goto L_0x00e1
            if (r0 != 0) goto L_0x0138
            goto L_0x00e7
        L_0x00e1:
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0138
        L_0x00e7:
            java.lang.String r0 = r16.getName()     // Catch:{ IllegalArgumentException -> 0x0108, IOException -> 0x00f1, Exception -> 0x0123 }
            android.media.MediaCodec r2 = android.media.MediaCodec.createByCodecName(r0)     // Catch:{ IllegalArgumentException -> 0x0108, IOException -> 0x00f1, Exception -> 0x0123 }
            goto L_0x0176
        L_0x00f1:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unable to create codec based on codec name "
            r1.append(r0)
            java.lang.String r0 = r16.getName()
            r1.append(r0)
            r0 = 46
            r1.append(r0)
            goto L_0x011e
        L_0x0108:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Codec name "
            r1.append(r0)
            java.lang.String r0 = r16.getName()
            r1.append(r0)
            java.lang.String r0 = " is invalid."
            r1.append(r0)
        L_0x011e:
            java.lang.String r0 = r1.toString()
            goto L_0x0135
        L_0x0123:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Failed to initialize codec "
            r1.append(r0)
            java.lang.String r0 = r16.getName()
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
        L_0x0135:
            r6.A07(r5, r0, r2)
        L_0x0138:
            int r3 = r3 + 1
            goto L_0x00d4
        L_0x013b:
            java.lang.String r3 = "decoder"
            java.lang.String r0 = r11.getString(r7)     // Catch:{ IllegalArgumentException -> 0x014e, IOException -> 0x015c }
            if (r0 != 0) goto L_0x0149
            java.lang.Integer r0 = r10.A04     // Catch:{ IllegalArgumentException -> 0x014e, IOException -> 0x015c }
            java.lang.String r0 = X.AnonymousClass95D.A00(r0)     // Catch:{ IllegalArgumentException -> 0x014e, IOException -> 0x015c }
        L_0x0149:
            android.media.MediaCodec r2 = android.media.MediaCodec.createDecoderByType(r0)     // Catch:{ IllegalArgumentException -> 0x014e, IOException -> 0x015c }
            goto L_0x0176
        L_0x014e:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Mime type invalid! unable to create "
            r1.append(r0)
            r1.append(r3)
            goto L_0x016e
        L_0x015c:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Error creating "
            r1.append(r0)
            r1.append(r3)
            r0 = 33
            r1.append(r0)
        L_0x016e:
            java.lang.String r0 = r1.toString()
            r6.A07(r5, r0, r2)
            r2 = 0
        L_0x0176:
            r4.A00 = r2
            if (r2 != 0) goto L_0x017e
            r1 = 0
        L_0x017b:
            r4.A02 = r1
        L_0x017d:
            return
        L_0x017e:
            X.883 r0 = r4.A03
            X.9mG r1 = new X.9mG
            r1.<init>(r2, r0)
            goto L_0x017b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202259lQ.A02():void");
    }

    public final void A04() {
        this.A03.A03 = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01e4, code lost:
        if (r13[r4 - 3] == 0) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01ea, code lost:
        if (r13[r4 - 2] == 0) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01ec, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01ef, code lost:
        if (r13[r2] == 1) goto L_0x01f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01ff, code lost:
        if (r13[r2] != 0) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0216, code lost:
        if (r5[2] != false) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x021b, code lost:
        if (r5[1] != false) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0065, code lost:
        if (r1 == r0) goto L_0x0067;
     */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x013f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x016c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(java.nio.ByteBuffer r26, long r27) {
        /*
            r25 = this;
            r12 = r26
            int r1 = r12.position()
            r0 = 3
            boolean[] r5 = new boolean[r0]
            int r0 = r12.capacity()
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r12.rewind()
            r0.put(r12)
            r0.flip()
            r12.rewind()
            byte[] r13 = r0.array()
        L_0x0021:
            int r4 = r12.limit()
            int r7 = r4 - r1
            if (r7 == 0) goto L_0x0038
            r9 = 0
            boolean r0 = r5[r9]
            if (r0 == 0) goto L_0x0184
            r5[r9] = r9
            r0 = 1
            r5[r0] = r9
            r0 = 2
            r5[r0] = r9
            int r4 = r1 + -3
        L_0x0038:
            int r0 = r12.limit()
            if (r4 >= r0) goto L_0x021e
            r3 = r25
            X.88A r0 = r3.A0A
            java.lang.Integer r2 = r0.A04
            java.lang.Integer r1 = X.C023109s.A01
            r6 = 1
            int r0 = r4 + 3
            byte r0 = r13[r0]
            if (r2 != r1) goto L_0x0158
            r0 = r0 & 126(0x7e, float:1.77E-43)
            int r1 = r0 >> 1
            r0 = 19
            if (r1 == r0) goto L_0x0166
            r0 = 20
            if (r1 == r0) goto L_0x0166
            r21 = 0
            r0 = 33
            if (r1 == r0) goto L_0x0067
            r0 = 34
            if (r1 == r0) goto L_0x0067
            r0 = 32
        L_0x0065:
            if (r1 != r0) goto L_0x0168
        L_0x0067:
            r22 = 1
            java.nio.ByteBuffer r0 = A00(r12)
            r3.A08 = r0
        L_0x006f:
            java.nio.ByteBuffer r16 = A00(r12)
            r15 = 0
            int r18 = r16.remaining()
            r7 = 0
            X.9Nq r14 = new X.9Nq
            r19 = r27
            r17 = r4
            r14.<init>(r15, r16, r17, r18, r19, r21, r22)
            boolean r0 = r3.A05
            if (r0 == 0) goto L_0x013f
            boolean r0 = r14.A06
            if (r0 != 0) goto L_0x00b8
            boolean r0 = r3.A07
            if (r0 == 0) goto L_0x013f
            X.02t r11 = r3.A04
            if (r11 == 0) goto L_0x00b8
            java.nio.ByteBuffer r0 = r14.A05
            java.nio.ByteBuffer r18 = A00(r0)
            int r10 = r14.A01
            int r9 = r14.A02
            boolean r8 = r14.A07
            long r1 = r14.A03
            android.media.MediaCodec$BufferInfo r6 = r14.A04
            X.9Nq r0 = new X.9Nq
            r24 = 0
            r16 = r0
            r17 = r6
            r19 = r10
            r20 = r9
            r21 = r1
            r23 = r8
            r16.<init>(r17, r18, r19, r20, r21, r23, r24)
            r11.invoke(r0)
        L_0x00b8:
            boolean r0 = r3.A06
            if (r0 == 0) goto L_0x0123
            r3.A06 = r7
            java.lang.String r2 = "sup:MediaCodecDecoder"
            r3.A02()     // Catch:{ CodecException -> 0x00ff, all -> 0x00f6 }
            android.media.MediaCodec r8 = r3.A00     // Catch:{ CodecException -> 0x00ff, all -> 0x00f6 }
            if (r8 == 0) goto L_0x0123
            r8.reset()     // Catch:{ CodecException -> 0x00ff, all -> 0x00f6 }
            android.media.MediaFormat r1 = r3.A09     // Catch:{ CodecException -> 0x00ff, all -> 0x00f6 }
            android.view.Surface r0 = r3.A01     // Catch:{ CodecException -> 0x00ff, all -> 0x00f6 }
            r8.configure(r1, r0, r15, r7)     // Catch:{ CodecException -> 0x00ff, all -> 0x00f6 }
            X.9mG r0 = r3.A02     // Catch:{ CodecException -> 0x00ff, all -> 0x00f6 }
            if (r0 == 0) goto L_0x00d8
            r0.A05()     // Catch:{ CodecException -> 0x00ff, all -> 0x00f6 }
        L_0x00d8:
            X.9gk r6 = X.AnonymousClass9AO.A01     // Catch:{ CodecException -> 0x00ff, all -> 0x00f6 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ CodecException -> 0x00ff, all -> 0x00f6 }
            java.lang.String r0 = "Using codec: "
            r1.append(r0)     // Catch:{ CodecException -> 0x00ff, all -> 0x00f6 }
            android.media.MediaCodecInfo r0 = r8.getCodecInfo()     // Catch:{ CodecException -> 0x00ff, all -> 0x00f6 }
            java.lang.String r0 = r0.getName()     // Catch:{ CodecException -> 0x00ff, all -> 0x00f6 }
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ CodecException -> 0x00ff, all -> 0x00f6 }
            r6.A01(r2, r0)     // Catch:{ CodecException -> 0x00ff, all -> 0x00f6 }
            r8.start()     // Catch:{ CodecException -> 0x00ff, all -> 0x00f6 }
            goto L_0x0123
        L_0x00f6:
            r6 = move-exception
            X.9gk r1 = X.AnonymousClass9AO.A01
            java.lang.String r0 = "Video Decoder activation exception!"
            r1.A05(r2, r0, r6)
            goto L_0x0123
        L_0x00ff:
            r7 = move-exception
            int r8 = r7.getErrorCode()
            r0 = -19
            X.9gk r6 = X.AnonymousClass9AO.A01
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            if (r8 != r0) goto L_0x0147
            java.lang.String r0 = "Resource was not available. Likely caused by invalid surface. Diagnostics: "
            r1.append(r0)
            java.lang.String r0 = r7.getDiagnosticInfo()
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            r6.A07(r2, r0, r7)
        L_0x011e:
            java.lang.String r0 = " Attempt to invoke on invalid surface callback."
            r6.A01(r2, r0)
        L_0x0123:
            X.9mG r3 = r3.A02
            if (r3 == 0) goto L_0x013f
            java.util.concurrent.LinkedBlockingQueue r1 = r3.A04
            int r0 = r1.remainingCapacity()
            if (r0 != 0) goto L_0x0143
            X.9gk r2 = X.AnonymousClass9AO.A01
            java.lang.String r1 = "sup:AsyncFrameHandler"
            java.lang.String r0 = "data queue is at capacity.  This usually means we are not receiving input buffers from the decoder.  Attempting restart"
            r2.A06(r1, r0, r15)
            X.883 r0 = r3.A03
            X.00S r0 = r0.A01
            r0.invoke()
        L_0x013f:
            int r1 = r4 + 1
            goto L_0x0021
        L_0x0143:
            r1.offer(r14)
            goto L_0x013f
        L_0x0147:
            java.lang.String r0 = "Video decoder activation MediaCodec Exception! Diagnostics: "
            r1.append(r0)
            java.lang.String r0 = r7.getDiagnosticInfo()
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            r6.A05(r2, r0, r7)
            goto L_0x011e
        L_0x0158:
            r1 = r0 & 31
            r0 = 5
            if (r1 == r0) goto L_0x0166
            r21 = 0
            r0 = 7
            if (r1 == r0) goto L_0x0067
            r0 = 8
            goto L_0x0065
        L_0x0166:
            r21 = 1
        L_0x0168:
            r22 = 0
            if (r21 == 0) goto L_0x006f
            boolean r0 = r3.A05
            if (r0 != 0) goto L_0x017c
            r3.A09(r6)
            java.nio.ByteBuffer r2 = r3.A08
            if (r2 == 0) goto L_0x017c
            r0 = 0
            r3.A06(r2, r0)
        L_0x017c:
            boolean r0 = r3.A07
            if (r0 != 0) goto L_0x006f
            r3.A07 = r6
            goto L_0x006f
        L_0x0184:
            r3 = 2
            r6 = 1
            if (r7 <= r6) goto L_0x01b4
            boolean r0 = r5[r6]
            if (r0 == 0) goto L_0x019a
            byte r0 = r13[r1]
            if (r0 != r6) goto L_0x019a
            r5[r9] = r9
            r5[r6] = r9
            r5[r3] = r9
            int r4 = r1 - r3
            goto L_0x0038
        L_0x019a:
            if (r7 <= r3) goto L_0x01b4
            boolean r0 = r5[r3]
            if (r0 == 0) goto L_0x01b4
            byte r0 = r13[r1]
            if (r0 != 0) goto L_0x01b4
            int r0 = r1 + 1
            byte r0 = r13[r0]
            if (r0 != r6) goto L_0x01b4
            r5[r9] = r9
            r5[r6] = r9
            r5[r3] = r9
            int r4 = r1 - r6
            goto L_0x0038
        L_0x01b4:
            int r2 = r4 + -1
            int r8 = r1 + 2
        L_0x01b8:
            if (r8 >= r2) goto L_0x01de
            byte r0 = r13[r8]
            r0 = r0 & 254(0xfe, float:3.56E-43)
            if (r0 != 0) goto L_0x01db
            int r1 = r8 + -2
            byte r0 = r13[r1]
            if (r0 != 0) goto L_0x01d9
            int r0 = r8 + -1
            byte r0 = r13[r0]
            if (r0 != 0) goto L_0x01d9
            byte r0 = r13[r8]
            if (r0 != r6) goto L_0x01d9
            r5[r9] = r9
            r5[r6] = r9
            r5[r3] = r9
            r4 = r1
            goto L_0x0038
        L_0x01d9:
            int r8 = r8 + -2
        L_0x01db:
            int r8 = r8 + 3
            goto L_0x01b8
        L_0x01de:
            if (r7 <= r3) goto L_0x0212
            int r0 = r4 + -3
            byte r0 = r13[r0]
            if (r0 != 0) goto L_0x01f1
        L_0x01e6:
            int r0 = r4 + -2
            byte r0 = r13[r0]
            if (r0 != 0) goto L_0x01f1
        L_0x01ec:
            byte r1 = r13[r2]
            r0 = 1
            if (r1 == r6) goto L_0x01f2
        L_0x01f1:
            r0 = 0
        L_0x01f2:
            r5[r9] = r0
            if (r7 <= r6) goto L_0x020d
            int r0 = r4 + -2
            byte r0 = r13[r0]
            if (r0 != 0) goto L_0x0201
        L_0x01fc:
            byte r1 = r13[r2]
            r0 = 1
            if (r1 == 0) goto L_0x0202
        L_0x0201:
            r0 = 0
        L_0x0202:
            r5[r6] = r0
            byte r0 = r13[r2]
            if (r0 != 0) goto L_0x0209
            r9 = 1
        L_0x0209:
            r5[r3] = r9
            goto L_0x0038
        L_0x020d:
            boolean r0 = r5[r3]
            if (r0 == 0) goto L_0x0201
            goto L_0x01fc
        L_0x0212:
            if (r7 != r3) goto L_0x0219
            boolean r0 = r5[r3]
            if (r0 == 0) goto L_0x01f1
            goto L_0x01e6
        L_0x0219:
            boolean r0 = r5[r6]
            if (r0 == 0) goto L_0x01f1
            goto L_0x01ec
        L_0x021e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202259lQ.A06(java.nio.ByteBuffer, long):void");
    }

    public final void A07(AnonymousClass00S r2) {
        this.A03.A00 = r2;
    }

    public final void A09(boolean z) {
        if (this.A05 != z) {
            this.A05 = z;
            this.A03.A02 = z;
            C200159gk r4 = AnonymousClass9AO.A01;
            if (z) {
                r4.A01("sup:MediaCodecDecoder", "decoder starting up.");
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("Activating Video decoder with max jitter queue size: ");
                r4.A01("sup:MediaCodecDecoder", C36381kD.A10(A0u, 10));
                this.A06 = true;
                this.A07 = false;
                C202589mG r2 = this.A02;
                if (r2 != null) {
                    try {
                        HandlerThread handlerThread = r2.A01;
                        if (handlerThread != null) {
                            if (handlerThread.isAlive()) {
                                HandlerThread handlerThread2 = r2.A01;
                                if (handlerThread2 == null) {
                                    throw C36331k8.A0d("decoderThread");
                                }
                                handlerThread2.quit();
                            }
                        }
                        HandlerThread handlerThread3 = new HandlerThread("AsyncFrameHandlerThread", 0);
                        r2.A01 = handlerThread3;
                        handlerThread3.start();
                        return;
                    } catch (Throwable th) {
                        r4.A05("sup:AsyncFrameHandler", "Video decoder activation exception! Deactivate decoder", th);
                    }
                }
                A09(false);
                return;
            }
            r4.A01("sup:MediaCodecDecoder", "decoder shutting down.");
            r4.A01("sup:MediaCodecDecoder", "Deactivating Video decoder");
            this.A06 = true;
            this.A07 = false;
            C202589mG r22 = this.A02;
            if (r22 != null) {
                HandlerThread handlerThread4 = r22.A01;
                if (handlerThread4 != null && handlerThread4.isAlive()) {
                    HandlerThread handlerThread5 = r22.A01;
                    if (handlerThread5 == null) {
                        throw C36331k8.A0d("decoderThread");
                    }
                    handlerThread5.quit();
                }
                r22.A04.clear();
            }
        }
    }

    public static final ByteBuffer A00(ByteBuffer byteBuffer) {
        ByteBuffer allocate;
        boolean isDirect = byteBuffer.isDirect();
        int capacity = byteBuffer.capacity();
        if (isDirect) {
            allocate = ByteBuffer.allocateDirect(capacity);
        } else {
            allocate = ByteBuffer.allocate(capacity);
        }
        AnonymousClass00C.A08(allocate);
        byteBuffer.rewind();
        allocate.put(byteBuffer);
        byteBuffer.rewind();
        allocate.flip();
        return allocate;
    }

    public final boolean A0A() {
        return this.A05;
    }

    public final void A05(Surface surface) {
        this.A01 = surface;
    }

    public final void A08(C006302t r1) {
        this.A04 = r1;
    }
}
