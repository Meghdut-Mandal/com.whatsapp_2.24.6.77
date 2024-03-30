package X;

import android.media.MediaCodec;
import com.whatsapp.util.Log;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* renamed from: X.6vj  reason: invalid class name and case insensitive filesystem */
public class C146516vj implements C159527jV {
    public static final int[] A09 = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000};
    public C158387gq A00;
    public int A01;
    public ByteBuffer[] A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final File A06;
    public final File A07;
    public volatile boolean A08;

    public static boolean A01(File file) {
        C37001le r2;
        if (file != null && file.exists()) {
            try {
                r2 = new C37001le();
                r2.setDataSource(file.getAbsolutePath());
                boolean A1V = AnonymousClass000.A1V(r2.extractMetadata(16));
                r2.close();
                return A1V;
            } catch (Exception e) {
                Log.e("audiotranscoder/cantranscode", e);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        return false;
        throw th;
    }

    public boolean BK3() {
        return true;
    }

    public void cancel() {
        this.A08 = true;
    }

    private void A00(MediaCodec.BufferInfo bufferInfo, MediaCodec mediaCodec, WritableByteChannel writableByteChannel, byte[] bArr) {
        String A0l;
        while (true) {
            int dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0);
            if (dequeueOutputBuffer == -1) {
                return;
            }
            if (dequeueOutputBuffer >= 0) {
                ByteBuffer byteBuffer = this.A02[dequeueOutputBuffer];
                C90464aC.A0s(bufferInfo, byteBuffer);
                if ((bufferInfo.flags & 2) == 0) {
                    this.A01++;
                    int i = (bufferInfo.size - bufferInfo.offset) + 7;
                    bArr[3] = (byte) (((i >> 11) & 3) | (bArr[3] & 252));
                    bArr[4] = (byte) ((i >> 3) & 255);
                    bArr[5] = (byte) (((i & 7) << 5) | 31);
                    writableByteChannel.write(ByteBuffer.wrap(bArr));
                    writableByteChannel.write(byteBuffer);
                }
                byteBuffer.clear();
                mediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
            } else {
                if (dequeueOutputBuffer == -3) {
                    this.A02 = mediaCodec.getOutputBuffers();
                    A0l = "audiotranscoder/encoder output buffers have changed";
                } else if (dequeueOutputBuffer == -2) {
                    A0l = AnonymousClass000.A0l(mediaCodec.getOutputFormat(), "audiotranscoder/encoder output format has changed to ", AnonymousClass000.A0u());
                }
                Log.i(A0l);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:129:0x038d, code lost:
        if (r3.A00.Bdi(r6) != false) goto L_0x038f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c2, code lost:
        r34 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x021e, code lost:
        if (r2.getInteger("bit-width") != 24) goto L_0x0220;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02() {
        /*
            r50 = this;
            java.lang.String r40 = "pcm-encoding"
            java.lang.String r39 = "channel-count"
            java.lang.String r38 = "sample-rate"
            java.lang.String r37 = "bit-width"
            java.lang.String r4 = "audiotranscoder/can't create decoder for "
            java.lang.String r7 = "durationUs"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "audiotranscoder/bitrate:"
            r1.append(r0)
            r3 = r50
            int r0 = r3.A03
            r49 = r0
            X.C36321k7.A1Y(r1, r0)
            X.611 r1 = new X.611
            r1.<init>()
            java.io.File r0 = r3.A06
            java.lang.String r0 = r0.getAbsolutePath()
            r6 = 0
            X.AnonymousClass00C.A0D(r0, r6)
            android.media.MediaExtractor r12 = r1.A00
            r12.setDataSource(r0)
            int r5 = r12.getTrackCount()
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "audiotranscoder/Number of tracks:"
            X.C36321k7.A1T(r0, r2, r5)
            r13 = 0
            r8 = 0
        L_0x0041:
            java.lang.String r9 = "mime"
            if (r8 >= r5) goto L_0x0473
            android.media.MediaFormat r11 = r12.getTrackFormat(r8)
            X.AnonymousClass00C.A08(r11)
            java.lang.String r10 = r11.getString(r9)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "audiotranscoder/track:"
            r2.append(r0)
            r2.append(r8)
            java.lang.String r0 = "mime:"
            r2.append(r0)
            r2.append(r10)
            java.lang.String r0 = " format:"
            X.C36321k7.A1K(r11, r0, r2)
            java.lang.String r0 = "audio"
            boolean r0 = r10.startsWith(r0)
            if (r0 == 0) goto L_0x007c
            if (r8 < 0) goto L_0x0473
            java.io.File r0 = r3.A07
            r48 = r0
            java.io.FileOutputStream r36 = X.C90524aI.A0W(r48)
            goto L_0x007f
        L_0x007c:
            int r8 = r8 + 1
            goto L_0x0041
        L_0x007f:
            java.nio.channels.FileChannel r35 = r36.getChannel()     // Catch:{ all -> 0x0469 }
            android.media.MediaCodecList r0 = new android.media.MediaCodecList     // Catch:{ all -> 0x045d }
            r0.<init>(r6)     // Catch:{ all -> 0x045d }
            android.media.MediaCodecInfo[] r14 = r0.getCodecInfos()     // Catch:{ all -> 0x045d }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x045d }
            java.lang.String r0 = "audiotranscoder/number of codecs: "
            r2.append(r0)     // Catch:{ all -> 0x045d }
            int r11 = r14.length     // Catch:{ all -> 0x045d }
            X.C36321k7.A1Y(r2, r11)     // Catch:{ all -> 0x045d }
            r34 = 0
        L_0x009b:
            java.lang.String r33 = "audio/mp4a-latm"
            if (r13 >= r11) goto L_0x00c7
            r16 = r14[r13]     // Catch:{ all -> 0x045d }
            boolean r0 = r16.isEncoder()     // Catch:{ all -> 0x045d }
            if (r0 == 0) goto L_0x00c4
            java.lang.String[] r10 = r16.getSupportedTypes()     // Catch:{ all -> 0x045d }
            r5 = 0
            r15 = 0
        L_0x00ad:
            int r0 = r10.length     // Catch:{ all -> 0x045d }
            if (r5 >= r0) goto L_0x00c0
            if (r15 != 0) goto L_0x00c2
            r2 = r10[r5]     // Catch:{ all -> 0x045d }
            r0 = r33
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x045d }
            if (r0 == 0) goto L_0x00bd
            r15 = 1
        L_0x00bd:
            int r5 = r5 + 1
            goto L_0x00ad
        L_0x00c0:
            if (r15 == 0) goto L_0x00c4
        L_0x00c2:
            r34 = r16
        L_0x00c4:
            int r13 = r13 + 1
            goto L_0x009b
        L_0x00c7:
            if (r34 == 0) goto L_0x0444
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x045d }
            java.lang.String r0 = "audiotranscoder/found "
            r5.append(r0)     // Catch:{ all -> 0x045d }
            java.lang.String r0 = r34.getName()     // Catch:{ all -> 0x045d }
            r5.append(r0)     // Catch:{ all -> 0x045d }
            java.lang.String r2 = " supporting "
            r0 = r33
            X.C36321k7.A1Q(r2, r0, r5)     // Catch:{ all -> 0x045d }
            android.media.MediaFormat r2 = r12.getTrackFormat(r8)     // Catch:{ all -> 0x045d }
            X.AnonymousClass00C.A08(r2)     // Catch:{ all -> 0x045d }
            java.lang.String r5 = r2.getString(r9)     // Catch:{ all -> 0x045d }
            r12.selectTrack(r8)     // Catch:{ all -> 0x045d }
            java.lang.String r0 = "audio/g711-alaw"
            boolean r0 = r0.equals(r5)     // Catch:{ all -> 0x045d }
            if (r0 != 0) goto L_0x00fe
            java.lang.String r0 = "audio/g711-mlaw"
            boolean r0 = r0.equals(r5)     // Catch:{ all -> 0x045d }
            if (r0 == 0) goto L_0x011b
        L_0x00fe:
            boolean r0 = X.C19550w8.A05()     // Catch:{ all -> 0x045d }
            if (r0 == 0) goto L_0x0114
            java.lang.StringBuilder r8 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x045d }
            java.lang.String r0 = "audiotranscoder/first sample size: "
            r8.append(r0)     // Catch:{ all -> 0x045d }
            long r0 = r1.A00()     // Catch:{ all -> 0x045d }
            X.C36351kA.A1S(r8, r0)     // Catch:{ all -> 0x045d }
        L_0x0114:
            java.lang.String r1 = "max-input-size"
            r0 = 16384(0x4000, float:2.2959E-41)
            r2.setInteger(r1, r0)     // Catch:{ all -> 0x045d }
        L_0x011b:
            boolean r0 = r2.containsKey(r7)     // Catch:{ all -> 0x045d }
            if (r0 == 0) goto L_0x0138
            long r16 = r2.getLong(r7)     // Catch:{ all -> 0x045d }
        L_0x0125:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x045d }
            java.lang.String r0 = "audiotranscoder/decoder format:"
            java.lang.String r0 = X.C90494aF.A0c(r2, r0, r1)     // Catch:{ all -> 0x045d }
            X.C36321k7.A1a(r1, r0)     // Catch:{ all -> 0x045d }
            r0 = 0
            r3.A02 = r0     // Catch:{ all -> 0x045d }
            r3.A01 = r6     // Catch:{ all -> 0x045d }
            goto L_0x013b
        L_0x0138:
            r16 = 0
            goto L_0x0125
        L_0x013b:
            android.media.MediaCodec r32 = android.media.MediaCodec.createDecoderByType(r5)     // Catch:{ IllegalArgumentException -> 0x0433 }
            java.lang.String r0 = "audiotranscoder/decoder created"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x045d }
            if (r32 == 0) goto L_0x0423
            java.lang.String r0 = r34.getName()     // Catch:{ all -> 0x045d }
            android.media.MediaCodec r13 = android.media.MediaCodec.createByCodecName(r0)     // Catch:{ all -> 0x045d }
            java.lang.String r0 = "audiotranscoder/encoder created"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x045d }
            r1 = 0
            r0 = r32
            r0.configure(r2, r1, r1, r6)     // Catch:{ all -> 0x045d }
            java.lang.String r0 = "audiotranscoder/decoder configured"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x045d }
            r32.start()     // Catch:{ all -> 0x045d }
            java.lang.String r0 = "audiotranscoder/decoder started"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x045d }
            java.nio.ByteBuffer[] r31 = r32.getInputBuffers()     // Catch:{ all -> 0x045d }
            java.nio.ByteBuffer[] r30 = r32.getOutputBuffers()     // Catch:{ all -> 0x045d }
            android.media.MediaCodec$BufferInfo r1 = new android.media.MediaCodec$BufferInfo     // Catch:{ all -> 0x045d }
            r1.<init>()     // Catch:{ all -> 0x045d }
            android.media.MediaCodec$BufferInfo r29 = new android.media.MediaCodec$BufferInfo     // Catch:{ all -> 0x045d }
            r29.<init>()     // Catch:{ all -> 0x045d }
            long r9 = r3.A04     // Catch:{ all -> 0x045d }
            r18 = 1000(0x3e8, double:4.94E-321)
            r4 = 0
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x019f
            long r4 = r9 * r18
            r12.seekTo(r4, r6)     // Catch:{ all -> 0x045d }
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x045d }
            java.lang.String r6 = "audiotranscoder/seek to:"
            r0.append(r6)     // Catch:{ all -> 0x045d }
            r0.append(r4)     // Catch:{ all -> 0x045d }
            java.lang.String r4 = " actual:"
            r0.append(r4)     // Catch:{ all -> 0x045d }
            long r4 = r12.getSampleTime()     // Catch:{ all -> 0x045d }
            X.C36351kA.A1S(r0, r4)     // Catch:{ all -> 0x045d }
        L_0x019f:
            r0 = 7
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x045d }
            r28 = 0
            r27 = 0
            r26 = 0
            r25 = 0
            r24 = 0
            goto L_0x01af
        L_0x01ad:
            if (r11 != 0) goto L_0x03d0
        L_0x01af:
            r11 = 0
            boolean r4 = r3.A08     // Catch:{ all -> 0x0419 }
            if (r4 != 0) goto L_0x03d0
            r4 = 0
            r6 = r32
            int r42 = r6.dequeueInputBuffer(r4)     // Catch:{ all -> 0x0419 }
            if (r42 < 0) goto L_0x01ed
            r4 = r31[r42]     // Catch:{ all -> 0x0419 }
            X.AnonymousClass00C.A0D(r4, r11)     // Catch:{ all -> 0x0419 }
            int r44 = r12.readSampleData(r4, r11)     // Catch:{ all -> 0x0419 }
            if (r44 >= 0) goto L_0x01dd
            java.lang.String r4 = "audiotranscoder/extractor BUFFER_FLAG_END_OF_STREAM"
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ all -> 0x0419 }
            r45 = 0
            r47 = 4
            r43 = 0
            r44 = 0
            r41 = r6
            r41.queueInputBuffer(r42, r43, r44, r45, r47)     // Catch:{ all -> 0x0419 }
            r11 = 1
            goto L_0x01ed
        L_0x01dd:
            long r45 = r12.getSampleTime()     // Catch:{ all -> 0x0419 }
            r43 = 0
            r47 = 0
            r41 = r6
            r41.queueInputBuffer(r42, r43, r44, r45, r47)     // Catch:{ all -> 0x0419 }
            r12.advance()     // Catch:{ all -> 0x0419 }
        L_0x01ed:
            r4 = 1000000(0xf4240, double:4.940656E-318)
            int r8 = r6.dequeueOutputBuffer(r1, r4)     // Catch:{ all -> 0x0419 }
            if (r8 < 0) goto L_0x03a6
            long r4 = r1.presentationTimeUs     // Catch:{ all -> 0x0419 }
            long r22 = r9 * r18
            int r6 = (r4 > r22 ? 1 : (r4 == r22 ? 0 : -1))
            if (r6 < 0) goto L_0x0395
            if (r27 != 0) goto L_0x02ea
            java.lang.String r5 = r34.getName()     // Catch:{ all -> 0x0419 }
            java.lang.String r4 = "OMX.google"
            boolean r4 = r5.startsWith(r4)     // Catch:{ all -> 0x0419 }
            if (r4 == 0) goto L_0x0220
            r4 = r37
            boolean r4 = r2.containsKey(r4)     // Catch:{ all -> 0x0419 }
            if (r4 == 0) goto L_0x0220
            r4 = r37
            int r5 = r2.getInteger(r4)     // Catch:{ all -> 0x0419 }
            r4 = 24
            r25 = 1
            if (r5 == r4) goto L_0x0222
        L_0x0220:
            r25 = 0
        L_0x0222:
            r4 = r38
            int r14 = r2.getInteger(r4)     // Catch:{ all -> 0x0419 }
            r4 = r39
            int r7 = r2.getInteger(r4)     // Catch:{ all -> 0x0419 }
            r4 = r40
            boolean r4 = r2.containsKey(r4)     // Catch:{ all -> 0x0419 }
            if (r4 == 0) goto L_0x0262
            r4 = r40
            int r6 = r2.getInteger(r4)     // Catch:{ all -> 0x0419 }
        L_0x023c:
            r4 = r33
            android.media.MediaFormat r5 = android.media.MediaFormat.createAudioFormat(r4, r14, r7)     // Catch:{ all -> 0x0419 }
            java.lang.String r4 = "bitrate"
            r15 = r49
            r5.setInteger(r4, r15)     // Catch:{ all -> 0x0419 }
            r4 = r38
            r5.setInteger(r4, r14)     // Catch:{ all -> 0x0419 }
            r4 = r39
            r5.setInteger(r4, r7)     // Catch:{ all -> 0x0419 }
            java.lang.String r7 = "aac-profile"
            r4 = 2
            r5.setInteger(r7, r4)     // Catch:{ all -> 0x0419 }
            java.lang.String r7 = "max-input-size"
            r4 = 64000(0xfa00, float:8.9683E-41)
            r5.setInteger(r7, r4)     // Catch:{ all -> 0x0419 }
            goto L_0x0264
        L_0x0262:
            r6 = 0
            goto L_0x023c
        L_0x0264:
            if (r6 == 0) goto L_0x026b
            r4 = r40
            r5.setInteger(r4, r6)     // Catch:{ all -> 0x0419 }
        L_0x026b:
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0419 }
            java.lang.String r4 = "audiotranscoder/configuring encoder with output format "
            X.C36321k7.A1K(r5, r4, r6)     // Catch:{ all -> 0x0419 }
            r6 = 1
            r4 = 0
            r13.configure(r5, r4, r4, r6)     // Catch:{ all -> 0x0419 }
            java.lang.String r4 = "audiotranscoder/encoder configured"
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ all -> 0x0419 }
            r4 = r38
            int r7 = r2.getInteger(r4)     // Catch:{ all -> 0x0419 }
            r4 = r39
            int r6 = r2.getInteger(r4)     // Catch:{ all -> 0x0419 }
            r4 = -1
            r15 = 0
            r0[r15] = r4     // Catch:{ all -> 0x0419 }
            r5 = 1
            r4 = -15
            r0[r5] = r4     // Catch:{ all -> 0x0419 }
            r5 = 0
        L_0x0294:
            int[] r14 = A09     // Catch:{ all -> 0x0419 }
            r4 = 12
            if (r5 >= r4) goto L_0x02a1
            r4 = r14[r5]     // Catch:{ all -> 0x0419 }
            if (r7 == r4) goto L_0x02b3
            int r5 = r5 + 1
            goto L_0x0294
        L_0x02a1:
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0419 }
            java.lang.String r4 = "audiotranscoder/sampling rate "
            r5.append(r4)     // Catch:{ all -> 0x0419 }
            r5.append(r7)     // Catch:{ all -> 0x0419 }
            java.lang.String r4 = " bps is not supported"
            X.C36321k7.A1Z(r5, r4)     // Catch:{ all -> 0x0419 }
            r5 = 0
        L_0x02b3:
            byte r4 = (byte) r5     // Catch:{ all -> 0x0419 }
            byte r5 = (byte) r6     // Catch:{ all -> 0x0419 }
            r6 = 64
            r7 = 2
            r0[r7] = r6     // Catch:{ all -> 0x0419 }
            int r4 = r4 << r7
            r4 = r4 | 64
            byte r4 = (byte) r4     // Catch:{ all -> 0x0419 }
            r0[r7] = r4     // Catch:{ all -> 0x0419 }
            int r6 = r5 >> 2
            r4 = r4 | r6
            byte r4 = (byte) r4     // Catch:{ all -> 0x0419 }
            r0[r7] = r4     // Catch:{ all -> 0x0419 }
            r6 = 3
            r4 = r5 & 3
            r5 = 6
            int r4 = r4 << r5
            byte r4 = (byte) r4     // Catch:{ all -> 0x0419 }
            r0[r6] = r4     // Catch:{ all -> 0x0419 }
            r4 = 4
            r0[r4] = r15     // Catch:{ all -> 0x0419 }
            r4 = 5
            r0[r4] = r15     // Catch:{ all -> 0x0419 }
            r4 = -4
            r0[r5] = r4     // Catch:{ all -> 0x0419 }
            r13.start()     // Catch:{ all -> 0x0419 }
            java.nio.ByteBuffer[] r24 = r13.getInputBuffers()     // Catch:{ all -> 0x0419 }
            java.nio.ByteBuffer[] r4 = r13.getOutputBuffers()     // Catch:{ all -> 0x0419 }
            r3.A02 = r4     // Catch:{ all -> 0x0419 }
            r4 = 1000000(0xf4240, double:4.940656E-318)
            r27 = 1
            goto L_0x02ed
        L_0x02ea:
            r4 = 1000000(0xf4240, double:4.940656E-318)
        L_0x02ed:
            int r6 = r13.dequeueInputBuffer(r4)     // Catch:{ all -> 0x0419 }
            r14 = -1
        L_0x02f2:
            if (r6 != r14) goto L_0x0300
            r7 = r29
            r6 = r35
            r3.A00(r7, r13, r6, r0)     // Catch:{ all -> 0x0419 }
            int r6 = r13.dequeueInputBuffer(r4)     // Catch:{ all -> 0x0419 }
            goto L_0x02f2
        L_0x0300:
            if (r6 < 0) goto L_0x0398
            r7 = r24[r6]     // Catch:{ all -> 0x0419 }
            r14 = r30[r8]     // Catch:{ all -> 0x0419 }
            X.C90464aC.A0s(r1, r14)     // Catch:{ all -> 0x0419 }
            r7.clear()     // Catch:{ all -> 0x0419 }
            if (r25 == 0) goto L_0x032a
            r15 = 0
        L_0x030f:
            boolean r4 = r14.hasRemaining()     // Catch:{ all -> 0x0419 }
            if (r4 == 0) goto L_0x0323
            byte r5 = r14.get()     // Catch:{ all -> 0x0419 }
            int r4 = r15 % 3
            if (r4 == 0) goto L_0x0320
            r7.put(r5)     // Catch:{ all -> 0x0419 }
        L_0x0320:
            int r15 = r15 + 1
            goto L_0x030f
        L_0x0323:
            int r4 = r1.size     // Catch:{ all -> 0x0419 }
            int r4 = r4 * 2
            int r7 = r4 / 3
            goto L_0x032f
        L_0x032a:
            r7.put(r14)     // Catch:{ all -> 0x0419 }
            int r7 = r1.size     // Catch:{ all -> 0x0419 }
        L_0x032f:
            r43 = 0
            long r4 = r1.presentationTimeUs     // Catch:{ all -> 0x0419 }
            int r15 = r1.flags     // Catch:{ all -> 0x0419 }
            r41 = r13
            r42 = r6
            r44 = r7
            r45 = r4
            r47 = r15
            r41.queueInputBuffer(r42, r43, r44, r45, r47)     // Catch:{ all -> 0x0419 }
            X.C90464aC.A0s(r1, r14)     // Catch:{ all -> 0x0419 }
            long r6 = r3.A05     // Catch:{ all -> 0x0419 }
            r14 = 0
            int r4 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r4 <= 0) goto L_0x0356
            long r4 = r1.presentationTimeUs     // Catch:{ all -> 0x0419 }
            long r20 = r6 * r18
            int r14 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
            if (r14 <= 0) goto L_0x0356
            goto L_0x0359
        L_0x0356:
            r14 = 0
            goto L_0x035c
        L_0x0359:
            r14 = 0
            r11 = 1
        L_0x035c:
            int r4 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r4 == 0) goto L_0x0398
            X.7gq r4 = r3.A00     // Catch:{ all -> 0x0419 }
            if (r4 == 0) goto L_0x0398
            int r4 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r4 > 0) goto L_0x036a
            r22 = 0
        L_0x036a:
            int r4 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r4 > 0) goto L_0x0371
            r6 = r16
            goto L_0x0373
        L_0x0371:
            long r6 = r6 * r18
        L_0x0373:
            r14 = 100
            long r4 = r1.presentationTimeUs     // Catch:{ all -> 0x0419 }
            long r4 = r4 - r22
            long r4 = r4 * r14
            long r6 = r6 - r22
            long r4 = r4 / r6
            int r6 = (int) r4     // Catch:{ all -> 0x0419 }
            r4 = r28
            if (r6 == r4) goto L_0x0398
            boolean r4 = r3.A08     // Catch:{ all -> 0x0419 }
            if (r4 != 0) goto L_0x038f
            X.7gq r4 = r3.A00     // Catch:{ all -> 0x0419 }
            boolean r5 = r4.Bdi(r6)     // Catch:{ all -> 0x0419 }
            r4 = 0
            if (r5 == 0) goto L_0x0390
        L_0x038f:
            r4 = 1
        L_0x0390:
            r3.A08 = r4     // Catch:{ all -> 0x0419 }
            r28 = r6
            goto L_0x0398
        L_0x0395:
            int r26 = r26 + 1
            goto L_0x039f
        L_0x0398:
            r5 = r29
            r4 = r35
            r3.A00(r5, r13, r4, r0)     // Catch:{ all -> 0x0419 }
        L_0x039f:
            r5 = 0
            r4 = r32
            r4.releaseOutputBuffer(r8, r5)     // Catch:{ all -> 0x0419 }
            goto L_0x03c5
        L_0x03a6:
            r4 = -3
            if (r8 != r4) goto L_0x03aa
            goto L_0x03bc
        L_0x03aa:
            r4 = -2
            if (r8 != r4) goto L_0x03c5
            android.media.MediaFormat r2 = r32.getOutputFormat()     // Catch:{ all -> 0x0419 }
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0419 }
            java.lang.String r4 = "audiotranscoder/decoder output format has changed to "
            java.lang.String r4 = X.AnonymousClass000.A0l(r2, r4, r5)     // Catch:{ all -> 0x0419 }
            goto L_0x03c2
        L_0x03bc:
            java.nio.ByteBuffer[] r30 = r32.getOutputBuffers()     // Catch:{ all -> 0x0419 }
            java.lang.String r4 = "audiotranscoder/decoder output buffers have changed."
        L_0x03c2:
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ all -> 0x0419 }
        L_0x03c5:
            int r4 = r1.flags     // Catch:{ all -> 0x0419 }
            r4 = r4 & 4
            if (r4 == 0) goto L_0x01ad
            java.lang.String r0 = "audiotranscoder/decoder OutputBuffer BUFFER_FLAG_END_OF_STREAM"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0419 }
        L_0x03d0:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0419 }
            java.lang.String r0 = "audiotranscoder/processed frames:"
            r2.append(r0)     // Catch:{ all -> 0x0419 }
            int r0 = r3.A01     // Catch:{ all -> 0x0419 }
            r2.append(r0)     // Catch:{ all -> 0x0419 }
            java.lang.String r1 = " skipped:"
            r0 = r26
            X.C36321k7.A1T(r1, r2, r0)     // Catch:{ all -> 0x0419 }
            r32.stop()     // Catch:{ all -> 0x045d }
            r32.release()     // Catch:{ all -> 0x045d }
            if (r27 == 0) goto L_0x03f0
            r13.stop()     // Catch:{ all -> 0x045d }
        L_0x03f0:
            r13.release()     // Catch:{ all -> 0x045d }
            r12.release()     // Catch:{ all -> 0x045d }
            if (r35 == 0) goto L_0x03fb
            r35.close()     // Catch:{ all -> 0x0469 }
        L_0x03fb:
            r36.close()
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "audiotranscoder finished cancelled:"
            r2.append(r0)
            boolean r0 = r3.A08
            r2.append(r0)
            java.lang.String r0 = " output:"
            r2.append(r0)
            long r0 = r48.length()
            X.C36351kA.A1S(r2, r0)
            return
        L_0x0419:
            r0 = move-exception
            r32.stop()     // Catch:{ all -> 0x045d }
            r32.release()     // Catch:{ all -> 0x045d }
            if (r27 == 0) goto L_0x0456
            goto L_0x0453
        L_0x0423:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x045d }
            X.C36321k7.A1P(r4, r5, r0)     // Catch:{ all -> 0x045d }
            r12.release()     // Catch:{ all -> 0x045d }
            X.5LX r0 = new X.5LX     // Catch:{ all -> 0x045d }
            r0.<init>()     // Catch:{ all -> 0x045d }
            goto L_0x045c
        L_0x0433:
            r1 = move-exception
            java.lang.String r0 = X.C36321k7.A0D(r4, r5)     // Catch:{ all -> 0x045d }
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x045d }
            r12.release()     // Catch:{ all -> 0x045d }
            X.5LX r0 = new X.5LX     // Catch:{ all -> 0x045d }
            r0.<init>()     // Catch:{ all -> 0x045d }
            goto L_0x045c
        L_0x0444:
            java.lang.String r0 = "audiotranscoder/ no codec supporting audio/mp4a-latm"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x045d }
            r12.release()     // Catch:{ all -> 0x045d }
            java.lang.String r0 = "No codec supporting audio/mp4a-latm"
            java.io.FileNotFoundException r0 = X.C90524aI.A0V(r0)     // Catch:{ all -> 0x045d }
            goto L_0x045c
        L_0x0453:
            r13.stop()     // Catch:{ all -> 0x045d }
        L_0x0456:
            r13.release()     // Catch:{ all -> 0x045d }
            r12.release()     // Catch:{ all -> 0x045d }
        L_0x045c:
            throw r0     // Catch:{ all -> 0x045d }
        L_0x045d:
            r1 = move-exception
            if (r35 == 0) goto L_0x0468
            r35.close()     // Catch:{ all -> 0x0464 }
            goto L_0x0468
        L_0x0464:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0469 }
        L_0x0468:
            throw r1     // Catch:{ all -> 0x0469 }
        L_0x0469:
            r1 = move-exception
            r36.close()     // Catch:{ all -> 0x046e }
            throw r1
        L_0x046e:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x0473:
            java.lang.String r0 = "audiotranscoder/no audio tracks"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r12.release()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C146516vj.A02():void");
    }

    public C146516vj(C123315wI r3) {
        this.A06 = r3.A03;
        this.A04 = r3.A01;
        this.A05 = r3.A02;
        this.A07 = r3.A04;
        this.A03 = r3.A00;
    }
}
