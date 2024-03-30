package org.wawebrtc;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass5SV;
import X.AnonymousClass6KO;
import X.AnonymousClass7dT;
import X.C108855Ve;
import X.C112085dK;
import X.C120585rk;
import X.C131016Nj;
import X.C132026Rv;
import X.C146526vk;
import X.C156747ab;
import X.C27631Pa;
import X.C36441kJ;
import X.C90464aC;
import X.C90484aE;
import X.C90514aH;
import X.C90524aI;
import android.media.MediaCodec;
import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Surface;
import com.whatsapp.util.Log;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class MediaCodecVideoEncoder {
    public static final int DEQUEUE_TIMEOUT = 0;
    public static final String[] H264_HW_EXCEPTION_MODELS = {"SAMSUNG-SGH-I337", "Nexus 7"};
    public static final String H264_MIME_TYPE = "video/avc";
    public static final String[] H265_HW_EXCEPTION_MODELS = new String[0];
    public static final String H265_MIME_TYPE = "video/hevc";
    public static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    public static final int MIN_ENCODER_HEIGHT = 144;
    public static final int MIN_ENCODER_WIDTH = 176;
    public static final String TAG = "MediaCodecVideoEncoder";
    public static final String VP8_MIME_TYPE = "video/x-vnd.on2.vp8";
    public static final String VP9_MIME_TYPE = "video/x-vnd.on2.vp9";
    public static final String[] blacklistedHwCodecPrefixes = new String[0];
    public static final Map cachedCodecCapabilites = AnonymousClass001.A0J();
    public static int codecErrors;
    public static AnonymousClass7dT errorCallback;
    public static final String[] h264BlacklistedBuildHardware = {"sc8830", "sc8830a", "samsungexynos7580"};
    public static final String[] h265BlacklistedBuildHardware = new String[0];
    public static Set hwEncoderDisabledTypes = C36441kJ.A16();
    public static long lastReleaseTimestamp;
    public static MediaCodecVideoEncoder runningInstance;
    public static final String[] supportedH264HwCodecPrefixes = null;
    public static final String[] supportedH265HwCodecPrefixes = null;
    public static final int[] supportedSurfaceColorList = {2130708361};
    public static final String[] supportedVp8HwCodecPrefixes = {"OMX.qcom.", "OMX.Intel."};
    public static final String[] supportedVp9HwCodecPrefixes = {"OMX.qcom."};
    public static final String[] trustedCodecPrefixes = {"OMX.qcom.", "OMX.Exynos.", "OMX.google", "OMX.IMG."};
    public MediaCodec.BufferInfo cachedBufferInfo = new MediaCodec.BufferInfo();
    public BufferInfo cachedInputBuffer = new BufferInfo();
    public BufferInfo cachedOutputBuffer = new BufferInfo();
    public final Queue carryAlongInfos = C90524aI.A0l();
    public String codecName;
    public int colorFormat;
    public int colorId;
    public C132026Rv drawer;
    public C156747ab eglBase;
    public final List freeInfos = C90524aI.A0l();
    public int height;
    public ByteBuffer[] inputBuffers;
    public Surface inputSurface;
    public Bundle keyFrameRequestBundle = AnonymousClass001.A07();
    public MediaCodec mediaCodec;
    public Thread mediaCodecThread;
    public ByteBuffer[] outputBuffers;
    public AnonymousClass5SV type;
    public final C27631Pa voipSharedPreferences;
    public int width;

    public class BufferInfo {
        public int bitInfo;
        public ByteBuffer buffer;
        public long encodeTimeMs;
        public int index;
        public boolean isConfigData;
        public boolean isKeyFrame;
        public long timestamp;

        public void set(int i, ByteBuffer byteBuffer, boolean z, long j, long j2, int i2, boolean z2) {
            this.index = i;
            this.buffer = byteBuffer;
            this.isKeyFrame = z;
            this.timestamp = j;
            this.encodeTimeMs = j2;
            this.bitInfo = i2;
            this.isConfigData = z2;
        }
    }

    private void checkOnMediaCodecThread() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0044 A[Catch:{ IllegalStateException -> 0x0054 }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0022 A[Catch:{ IllegalStateException -> 0x0054 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean encodeBuffer(boolean r16, int r17, int r18, long r19, long r21, int r23) {
        /*
            r15 = this;
            r1 = 1
            r4 = 0
            if (r16 == 0) goto L_0x0011
            boolean r0 = r15.supportForceKeyFrame()     // Catch:{ IllegalStateException -> 0x0054 }
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = "MediaCodecVideoEncoder force Keyframe"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x0054 }
            r8 = 1
            goto L_0x0012
        L_0x0011:
            r8 = 0
        L_0x0012:
            long r11 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x0054 }
            java.util.List r0 = r15.freeInfos     // Catch:{ IllegalStateException -> 0x0054 }
            boolean r0 = r0.isEmpty()     // Catch:{ IllegalStateException -> 0x0054 }
            r13 = r19
            r10 = r23
            if (r0 == 0) goto L_0x0044
            X.6KO r9 = new X.6KO     // Catch:{ IllegalStateException -> 0x0054 }
            r9.<init>(r10, r11, r13)     // Catch:{ IllegalStateException -> 0x0054 }
        L_0x0027:
            java.util.Queue r0 = r15.carryAlongInfos     // Catch:{ IllegalStateException -> 0x0054 }
            r0.add(r9)     // Catch:{ IllegalStateException -> 0x0054 }
            android.media.MediaCodec r0 = r15.mediaCodec     // Catch:{ IllegalStateException -> 0x0054 }
            r3 = r17
            java.nio.ByteBuffer r0 = r0.getInputBuffer(r3)     // Catch:{ IllegalStateException -> 0x0054 }
            r0.position(r4)     // Catch:{ IllegalStateException -> 0x0054 }
            r5 = r18
            r0.limit(r5)     // Catch:{ IllegalStateException -> 0x0054 }
            android.media.MediaCodec r2 = r15.mediaCodec     // Catch:{ IllegalStateException -> 0x0054 }
            r6 = r21
            r2.queueInputBuffer(r3, r4, r5, r6, r8)     // Catch:{ IllegalStateException -> 0x0054 }
            goto L_0x0053
        L_0x0044:
            java.util.List r0 = r15.freeInfos     // Catch:{ IllegalStateException -> 0x0054 }
            java.lang.Object r9 = r0.remove(r4)     // Catch:{ IllegalStateException -> 0x0054 }
            X.6KO r9 = (X.AnonymousClass6KO) r9     // Catch:{ IllegalStateException -> 0x0054 }
            r9.A01 = r11     // Catch:{ IllegalStateException -> 0x0054 }
            r9.A02 = r13     // Catch:{ IllegalStateException -> 0x0054 }
            r9.A00 = r10     // Catch:{ IllegalStateException -> 0x0054 }
            goto L_0x0027
        L_0x0053:
            return r1
        L_0x0054:
            r1 = move-exception
            java.lang.String r0 = "MediaCodecVideoEncoder encodeBuffer failed"
            com.whatsapp.util.Log.e(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.wawebrtc.MediaCodecVideoEncoder.encodeBuffer(boolean, int, int, long, long, int):boolean");
    }

    public boolean releaseOutputBuffer(int i) {
        try {
            this.mediaCodec.releaseOutputBuffer(i, false);
            return true;
        } catch (IllegalStateException e) {
            Log.e("MediaCodecVideoEncoder releaseOutputBuffer failed", e);
            return false;
        }
    }

    public static void disableH264HwCodec() {
        Log.w("MediaCodecVideoEncoder H.264 encoding is disabled by application.");
        hwEncoderDisabledTypes.add("video/avc");
    }

    public static void disableH265HwCodec() {
        Log.w("MediaCodecVideoEncoder H.265 encoding is disabled by application.");
        hwEncoderDisabledTypes.add("video/hevc");
    }

    public static void disableVp8HwCodec() {
        Log.w("MediaCodecVideoEncoder VP8 encoding is disabled by application.");
        hwEncoderDisabledTypes.add("video/x-vnd.on2.vp8");
    }

    public static void disableVp9HwCodec() {
        Log.w("MediaCodecVideoEncoder VP9 encoding is disabled by application.");
        hwEncoderDisabledTypes.add("video/x-vnd.on2.vp9");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x010b, code lost:
        if (r7.startsWith("OMX.google") != false) goto L_0x010d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02b9  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x02ce  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x02d9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0078  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List findHwEncoder(java.lang.String r22, java.lang.String[] r23, int[] r24, int r25, boolean r26) {
        /*
            r12 = r24
            java.lang.String r0 = "vid_driver.encoder_name"
            java.lang.String r11 = com.whatsapp.voipcalling.Voip.A06(r0)
            java.lang.String r0 = "video/avc"
            r13 = r22
            boolean r20 = r13.equals(r0)
            java.lang.String r3 = " is not supported."
            java.lang.String r19 = "video/hevc"
            java.lang.String r18 = "MediaCodecVideoEncoder Model: "
            r2 = 0
            if (r20 == 0) goto L_0x0046
            boolean r0 = X.AnonymousClass6YG.A03()
            if (r0 == 0) goto L_0x0029
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r18)
            java.lang.String r0 = android.os.Build.MODEL
            X.C36321k7.A1P(r0, r3, r1)
            return r2
        L_0x0029:
            java.lang.String[] r4 = H264_HW_EXCEPTION_MODELS
            int r3 = r4.length
            r2 = 0
        L_0x002d:
            if (r2 >= r3) goto L_0x0043
            r1 = r4[r2]
            java.lang.String r0 = android.os.Build.MODEL
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0040
            r17 = 1
        L_0x003b:
            java.lang.String r1 = android.os.Build.HARDWARE
            java.lang.String[] r0 = h264BlacklistedBuildHardware
            goto L_0x0064
        L_0x0040:
            int r2 = r2 + 1
            goto L_0x002d
        L_0x0043:
            r17 = 0
            goto L_0x003b
        L_0x0046:
            r0 = r19
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x02b3
            java.lang.String[] r4 = H265_HW_EXCEPTION_MODELS
            int r3 = r4.length
            r2 = 0
        L_0x0052:
            if (r2 >= r3) goto L_0x02af
            r1 = r4[r2]
            java.lang.String r0 = android.os.Build.MODEL
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x02ab
            r17 = 1
        L_0x0060:
            java.lang.String r1 = android.os.Build.HARDWARE
            java.lang.String[] r0 = h265BlacklistedBuildHardware
        L_0x0064:
            boolean r0 = X.C146526vk.A0F(r1, r0)
            if (r0 == 0) goto L_0x006c
            r17 = 1
        L_0x006c:
            java.util.LinkedList r10 = X.C90524aI.A0l()
            r9 = -1
            r8 = 0
        L_0x0072:
            int r0 = android.media.MediaCodecList.getCodecCount()
            if (r8 >= r0) goto L_0x02b7
            android.media.MediaCodecInfo r3 = android.media.MediaCodecList.getCodecInfoAt(r8)
            boolean r0 = r3.isEncoder()
            if (r0 == 0) goto L_0x00bd
            java.lang.String[] r4 = r3.getSupportedTypes()
            int r2 = r4.length
            r1 = 0
        L_0x0088:
            if (r1 >= r2) goto L_0x02a8
            r0 = r4[r1]
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x02a4
            java.lang.String r7 = r3.getName()
        L_0x0096:
            if (r7 == 0) goto L_0x00bd
            if (r17 == 0) goto L_0x00c0
            java.lang.String r0 = "OMX.google"
            boolean r0 = r7.startsWith(r0)
            if (r0 != 0) goto L_0x00c0
            boolean r0 = r7.equalsIgnoreCase(r11)
            if (r0 != 0) goto L_0x00c0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r18)
            java.lang.String r0 = android.os.Build.MODEL
            r1.append(r0)
            java.lang.String r0 = " has black listed H.264 hw encoder "
            r1.append(r0)
        L_0x00b6:
            java.lang.String r0 = X.AnonymousClass000.A0q(r7, r1)
        L_0x00ba:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x00bd:
            int r8 = r8 + 1
            goto L_0x0072
        L_0x00c0:
            if (r26 == 0) goto L_0x00cb
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "MediaCodecVideoEncoder Found candidate encoder "
            X.C36321k7.A1Q(r0, r7, r1)
        L_0x00cb:
            java.lang.String[] r0 = blacklistedHwCodecPrefixes
            java.lang.String r2 = "MediaCodecVideoEncoder "
            if (r0 == 0) goto L_0x00de
            boolean r0 = X.C146526vk.A0F(r7, r0)
            if (r0 == 0) goto L_0x00de
            java.lang.StringBuilder r1 = X.C36331k8.A0k(r2, r7)
            java.lang.String r7 = " is in the blacklist."
            goto L_0x00b6
        L_0x00de:
            r0 = r23
            if (r23 == 0) goto L_0x00f4
            boolean r1 = X.C146526vk.A0F(r7, r0)
        L_0x00e6:
            if (r1 != 0) goto L_0x010f
            java.lang.StringBuilder r1 = X.C36331k8.A0k(r2, r7)
            java.lang.String r0 = " is not supported on "
            r1.append(r0)
            java.lang.String r7 = android.os.Build.MODEL
            goto L_0x00b6
        L_0x00f4:
            r0 = 0
            if (r20 == 0) goto L_0x00fc
            boolean r1 = X.AnonymousClass6YG.A0E(r7, r0)
            goto L_0x00e6
        L_0x00fc:
            r0 = r19
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x010d
            java.lang.String r0 = "OMX.google"
            boolean r0 = r7.startsWith(r0)
            r1 = 1
            if (r0 == 0) goto L_0x00e6
        L_0x010d:
            r1 = 0
            goto L_0x00e6
        L_0x010f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r7)
            java.lang.String r0 = "_"
            java.lang.String r2 = X.AnonymousClass000.A0p(r0, r13, r1)
            java.util.Map r1 = cachedCodecCapabilites
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L_0x013f
            java.lang.Object r6 = r1.get(r2)
            android.media.MediaCodecInfo$CodecCapabilities r6 = (android.media.MediaCodecInfo.CodecCapabilities) r6
        L_0x0127:
            r2 = r25
            boolean r5 = X.C36431kI.A1P(r2)
            android.media.MediaCodecInfo$CodecProfileLevel[] r4 = r6.profileLevels
            int r3 = r4.length
            r1 = 0
        L_0x0131:
            if (r1 >= r3) goto L_0x0147
            r0 = r4[r1]
            if (r25 < 0) goto L_0x013c
            int r0 = r0.profile
            if (r0 != r2) goto L_0x013c
            r5 = 1
        L_0x013c:
            int r1 = r1 + 1
            goto L_0x0131
        L_0x013f:
            android.media.MediaCodecInfo$CodecCapabilities r6 = r3.getCapabilitiesForType(r13)     // Catch:{ all -> 0x0298 }
            r1.put(r2, r6)
            goto L_0x0127
        L_0x0147:
            if (r5 != 0) goto L_0x0163
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "MediaCodecVideoEncoder  "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " does not support Profile "
            r1.append(r0)
            r1.append(r2)
        L_0x015d:
            java.lang.String r0 = r1.toString()
            goto L_0x00ba
        L_0x0163:
            if (r26 == 0) goto L_0x01b1
            int[] r5 = r6.colorFormats
            int r4 = r5.length
            r3 = 0
        L_0x0169:
            if (r3 >= r4) goto L_0x0180
            r2 = r5[r3]
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "MediaCodecVideoEncoder    Supported Color: 0x"
            r1.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r2)
            X.C36321k7.A1a(r1, r0)
            int r3 = r3 + 1
            goto L_0x0169
        L_0x0180:
            android.media.MediaCodecInfo$EncoderCapabilities r2 = r6.getEncoderCapabilities()
            if (r2 == 0) goto L_0x01b1
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "MediaCodecVideoEncoder    CBR: "
            r1.append(r0)
            r0 = 2
            boolean r0 = r2.isBitrateModeSupported(r0)
            r1.append(r0)
            java.lang.String r0 = ", VBR: "
            r1.append(r0)
            r0 = 1
            boolean r0 = r2.isBitrateModeSupported(r0)
            r1.append(r0)
            java.lang.String r0 = ",  CQ: "
            r1.append(r0)
            r0 = 0
            boolean r0 = r2.isBitrateModeSupported(r0)
            X.C36331k8.A1S(r1, r0)
        L_0x01b1:
            if (r12 != 0) goto L_0x0244
            java.lang.String r0 = "vid_driver.encoder_color_format"
            java.lang.Integer r1 = com.whatsapp.voipcalling.Voip.A04(r0)
            if (r11 == 0) goto L_0x0242
            boolean r0 = r7.equalsIgnoreCase(r11)
            if (r0 == 0) goto L_0x0242
            if (r1 == 0) goto L_0x0242
            int r5 = r1.intValue()
        L_0x01c7:
            int[] r12 = X.C146526vk.A0H(r7, r5)
        L_0x01cb:
            int r0 = r12.length
            r22 = r0
            r4 = 0
            r3 = 0
        L_0x01d0:
            r0 = r22
            if (r4 >= r0) goto L_0x0246
            r16 = r12[r4]
            int[] r15 = r6.colorFormats
            int r0 = r15.length
            r21 = r0
            r2 = 0
        L_0x01dc:
            r0 = r21
            if (r2 >= r0) goto L_0x023f
            r1 = r15[r2]
            r14 = 19
            r0 = r16
            if (r0 != r14) goto L_0x01fb
            java.lang.String r0 = "OMX.SEC.avc.enc"
            boolean r0 = r0.equalsIgnoreCase(r7)
            if (r0 != 0) goto L_0x01f8
            java.lang.String r0 = "OMX.IMG.TOPAZ.VIDEO.Encoder"
            boolean r0 = r0.equalsIgnoreCase(r7)
            if (r0 == 0) goto L_0x01fb
        L_0x01f8:
            int r2 = r2 + 1
            goto L_0x01dc
        L_0x01fb:
            r0 = r16
            if (r1 != r0) goto L_0x01f8
            java.lang.StringBuilder r14 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "MediaCodecVideoEncoder Found target encoder for mime "
            r14.append(r0)
            r14.append(r13)
            java.lang.String r0 = " : "
            r14.append(r0)
            r14.append(r7)
            java.lang.String r0 = ". Color: 0x"
            r14.append(r0)
            X.C90504aG.A0z(r1, r14)
            java.lang.String r0 = "("
            r14.append(r0)
            r14.append(r1)
            java.lang.String r0 = ")"
            X.C36321k7.A1a(r14, r0)
            if (r3 != 0) goto L_0x022e
            android.media.MediaCodecInfo$VideoCapabilities r3 = r6.getVideoCapabilities()
        L_0x022e:
            if (r1 != r5) goto L_0x0234
            int r9 = r10.size()
        L_0x0234:
            android.media.MediaCodecInfo$CodecProfileLevel[] r14 = r6.profileLevels
            X.5vh r0 = new X.5vh
            r0.<init>(r3, r7, r14, r1)
            r10.add(r0)
            goto L_0x01f8
        L_0x023f:
            int r4 = r4 + 1
            goto L_0x01d0
        L_0x0242:
            r5 = 0
            goto L_0x01c7
        L_0x0244:
            r5 = 0
            goto L_0x01cb
        L_0x0246:
            if (r3 == 0) goto L_0x00bd
            if (r26 == 0) goto L_0x00bd
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "MediaCodecVideoEncoder birtate range: "
            r1.append(r0)
            android.util.Range r0 = r3.getBitrateRange()
            r1.append(r0)
            java.lang.String r0 = ", frame rate: "
            r1.append(r0)
            android.util.Range r0 = r3.getSupportedFrameRates()
            r1.append(r0)
            java.lang.String r0 = ", height alignment: "
            r1.append(r0)
            int r0 = r3.getHeightAlignment()
            r1.append(r0)
            java.lang.String r0 = ", width alignment: "
            r1.append(r0)
            int r0 = r3.getWidthAlignment()
            r1.append(r0)
            java.lang.String r0 = ", height range: "
            r1.append(r0)
            android.util.Range r0 = r3.getSupportedHeights()
            r1.append(r0)
            java.lang.String r0 = ", width range: "
            r1.append(r0)
            android.util.Range r0 = r3.getSupportedWidths()
            r1.append(r0)
            goto L_0x015d
        L_0x0298:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "MediaCodecVideoEncoder failed to get capabilities for "
            X.C90464aC.A1L(r0, r7, r1, r2)
            goto L_0x00bd
        L_0x02a4:
            int r1 = r1 + 1
            goto L_0x0088
        L_0x02a8:
            r7 = 0
            goto L_0x0096
        L_0x02ab:
            int r2 = r2 + 1
            goto L_0x0052
        L_0x02af:
            r17 = 0
            goto L_0x0060
        L_0x02b3:
            r17 = 0
            goto L_0x006c
        L_0x02b7:
            if (r9 < 0) goto L_0x02c8
            java.lang.Object r2 = r10.get(r9)
            r1 = 0
            java.lang.Object r0 = r10.get(r1)
            r10.set(r9, r0)
            r10.set(r1, r2)
        L_0x02c8:
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x02d9
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "MediaCodecVideoEncoder No HW encoder found for mime "
            X.C36321k7.A1Q(r0, r13, r1)
            r0 = 0
            return r0
        L_0x02d9:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: org.wawebrtc.MediaCodecVideoEncoder.findHwEncoder(java.lang.String, java.lang.String[], int[], int, boolean):java.util.List");
    }

    private int getCodecKeyFrameInterval() {
        return C90484aE.A04(C146526vk.A0F(this.codecName, trustedCodecPrefixes) ? 1 : 0);
    }

    private int getDequeueOutputTimeout() {
        String str = this.codecName;
        boolean A0F = C146526vk.A0F(str, trustedCodecPrefixes);
        if ("OMX.google.h264.encoder".equalsIgnoreCase(str)) {
            return 100;
        }
        if (A0F) {
            return 30;
        }
        return 1000;
    }

    private ByteBuffer getInputBuffer(int i) {
        return this.mediaCodec.getInputBuffer(i);
    }

    private ByteBuffer getOutputBuffer(int i) {
        return this.mediaCodec.getOutputBuffer(i);
    }

    public static boolean isH264HwSupported() {
        if (!hwEncoderDisabledTypes.contains("video/avc")) {
            return C90484aE.A1X("video/avc", (int[]) null, supportedH264HwCodecPrefixes);
        }
        return false;
    }

    public static boolean isH264HwSupportedUsingTextures() {
        if (hwEncoderDisabledTypes.contains("video/avc")) {
            return false;
        }
        return C90484aE.A1X("video/avc", supportedSurfaceColorList, supportedH264HwCodecPrefixes);
    }

    public static boolean isH265HwSupported() {
        if (hwEncoderDisabledTypes.contains("video/hevc") || findHwEncoder("video/hevc", supportedH265HwCodecPrefixes, (int[]) null, -1, true) == null) {
            return false;
        }
        return true;
    }

    public static boolean isH265HwSupportedUsingTextures() {
        if (hwEncoderDisabledTypes.contains("video/hevc")) {
            return false;
        }
        return C90484aE.A1X("video/hevc", supportedSurfaceColorList, supportedH265HwCodecPrefixes);
    }

    public static boolean isVp8HwSupported() {
        if (!hwEncoderDisabledTypes.contains("video/x-vnd.on2.vp8")) {
            return C90484aE.A1X("video/x-vnd.on2.vp8", (int[]) null, supportedVp8HwCodecPrefixes);
        }
        return false;
    }

    public static boolean isVp8HwSupportedUsingTextures() {
        if (hwEncoderDisabledTypes.contains("video/x-vnd.on2.vp8")) {
            return false;
        }
        return C90484aE.A1X("video/x-vnd.on2.vp8", supportedSurfaceColorList, supportedVp8HwCodecPrefixes);
    }

    public static boolean isVp9HwSupported() {
        if (!hwEncoderDisabledTypes.contains("video/x-vnd.on2.vp9")) {
            return C90484aE.A1X("video/x-vnd.on2.vp9", (int[]) null, supportedVp9HwCodecPrefixes);
        }
        return false;
    }

    public static boolean isVp9HwSupportedUsingTextures() {
        if (hwEncoderDisabledTypes.contains("video/x-vnd.on2.vp9")) {
            return false;
        }
        return C90484aE.A1X("video/x-vnd.on2.vp9", supportedSurfaceColorList, supportedVp9HwCodecPrefixes);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r3 = r0.getStackTrace();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void printStackTrace() {
        /*
            org.wawebrtc.MediaCodecVideoEncoder r0 = runningInstance
            if (r0 == 0) goto L_0x001f
            java.lang.Thread r0 = r0.mediaCodecThread
            if (r0 == 0) goto L_0x001f
            java.lang.StackTraceElement[] r3 = r0.getStackTrace()
            int r2 = r3.length
            if (r2 <= 0) goto L_0x001f
            java.lang.String r0 = "MediaCodecVideoEncoder  stacks trace:"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1 = 0
        L_0x0015:
            r0 = r3[r1]
            X.C36411kG.A1P(r0)
            int r1 = r1 + 1
            if (r1 >= r2) goto L_0x001f
            goto L_0x0015
        L_0x001f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.wawebrtc.MediaCodecVideoEncoder.printStackTrace():void");
    }

    public static void setErrorCallback(AnonymousClass7dT r1) {
        Log.i("MediaCodecVideoEncoder Set error callback");
        errorCallback = r1;
    }

    public BufferInfo dequeueInputBuffer() {
        try {
            int dequeueInputBuffer = this.mediaCodec.dequeueInputBuffer(0);
            if (dequeueInputBuffer < 0) {
                return null;
            }
            this.cachedInputBuffer.set(dequeueInputBuffer, this.mediaCodec.getInputBuffer(dequeueInputBuffer), false, 0, 0, 0, false);
            return this.cachedInputBuffer;
        } catch (Throwable th) {
            Log.e(th);
            throw th;
        }
    }

    public BufferInfo dequeueOutputBuffer(int i) {
        try {
            MediaCodec.BufferInfo bufferInfo = this.cachedBufferInfo;
            int dequeueOutputBuffer = this.mediaCodec.dequeueOutputBuffer(bufferInfo, (long) i);
            if (dequeueOutputBuffer >= 0) {
                ByteBuffer outputBuffer = this.mediaCodec.getOutputBuffer(dequeueOutputBuffer);
                C90464aC.A0s(bufferInfo, outputBuffer);
                int i2 = bufferInfo.flags;
                if ((i2 & 2) != 0) {
                    this.cachedOutputBuffer.set(dequeueOutputBuffer, outputBuffer.slice(), false, 0, 0, 0, true);
                    return this.cachedOutputBuffer;
                }
                boolean A1P = AnonymousClass000.A1P(i2 & 1);
                AnonymousClass6KO r2 = (AnonymousClass6KO) this.carryAlongInfos.remove();
                int i3 = r2.A00;
                this.cachedOutputBuffer.set(dequeueOutputBuffer, outputBuffer.slice(), A1P, r2.A02, SystemClock.elapsedRealtime() - r2.A01, i3, false);
                this.freeInfos.add(r2);
                return this.cachedOutputBuffer;
            } else if (dequeueOutputBuffer == -3) {
                return dequeueOutputBuffer(i);
            } else {
                if (dequeueOutputBuffer == -2) {
                    return dequeueOutputBuffer(i);
                }
                if (dequeueOutputBuffer == -1) {
                    return null;
                }
                throw C90514aH.A0s(AnonymousClass000.A0r("dequeueOutputBuffer: ", AnonymousClass000.A0u(), dequeueOutputBuffer));
            }
        } catch (IllegalStateException e) {
            Log.e("MediaCodecVideoEncoder dequeueOutputBuffer failed", e);
            BufferInfo bufferInfo2 = this.cachedOutputBuffer;
            bufferInfo2.set(-1, (ByteBuffer) null, false, -1, -1, 0, false);
            return bufferInfo2;
        }
    }

    public boolean encodeTexture(boolean z, int i, float[] fArr, long j) {
        RuntimeException runtimeException;
        C120585rk r3;
        if (z) {
            try {
                Log.i("MediaCodecVideoEncoder Sync frame request");
                this.mediaCodec.setParameters(this.keyFrameRequestBundle);
            } catch (RuntimeException e) {
                Log.e("MediaCodecVideoEncoder encodeTexture failed", e);
                return false;
            }
        }
        this.eglBase.A04();
        GLES20.glClear(16384);
        C132026Rv r0 = this.drawer;
        int i2 = this.width;
        int i3 = this.height;
        Map map = r0.A00;
        if (map.containsKey("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 interp_tc;\n\nuniform samplerExternalOES oes_tex;\n\nvoid main() {\n  gl_FragColor = texture2D(oes_tex, interp_tc);\n}\n")) {
            r3 = (C120585rk) map.get("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 interp_tc;\n\nuniform samplerExternalOES oes_tex;\n\nvoid main() {\n  gl_FragColor = texture2D(oes_tex, interp_tc);\n}\n");
        } else {
            r3 = new C120585rk();
            map.put("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 interp_tc;\n\nuniform samplerExternalOES oes_tex;\n\nvoid main() {\n  gl_FragColor = texture2D(oes_tex, interp_tc);\n}\n", r3);
            C131016Nj r2 = r3.A01;
            int i4 = r2.A00;
            if (i4 != -1) {
                GLES20.glUseProgram(i4);
                C112085dK.A00("glUseProgram");
                GLES20.glUniform1i(r2.A01("oes_tex"), 0);
                C112085dK.A00("Initialize fragment shader uniform values.");
                r2.A02("in_pos", C132026Rv.A01);
                r2.A02("in_tc", C132026Rv.A02);
            } else {
                runtimeException = C90514aH.A0s("The program has been released");
                throw runtimeException;
            }
        }
        int i5 = r3.A01.A00;
        if (i5 != -1) {
            GLES20.glUseProgram(i5);
            C112085dK.A00("glUseProgram");
            GLES20.glUniformMatrix4fv(r3.A00, 1, false, fArr, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i);
            GLES20.glViewport(0, 0, i2, i3);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glBindTexture(36197, 0);
            C156747ab r5 = this.eglBase;
            long nanos = TimeUnit.MICROSECONDS.toNanos(j);
            C156747ab.A02(r5);
            EGLSurface eGLSurface = r5.A03;
            if (eGLSurface != EGL14.EGL_NO_SURFACE) {
                EGLExt.eglPresentationTimeANDROID(r5.A02, eGLSurface, nanos);
                EGL14.eglSwapBuffers(r5.A02, r5.A03);
                return true;
            }
            runtimeException = C90514aH.A0s("No EGLSurface - can't swap buffers");
        } else {
            runtimeException = C90514aH.A0s("The program has been released");
        }
        throw runtimeException;
    }

    /* JADX WARNING: Removed duplicated region for block: B:130:0x02ff  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f1 A[Catch:{ all -> 0x030a }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00fa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean initEncode(X.AnonymousClass5SV r31, int r32, int r33, int r34, int r35, int r36, X.C108855Ve r37) {
        /*
            r30 = this;
            r27 = r37
            boolean r11 = X.AnonymousClass000.A1V(r27)
            r10 = r30
            r0 = r32
            r10.width = r0
            r0 = r33
            r10.height = r0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "MediaCodecVideoEncoder Java initEncode: "
            r1.append(r0)
            r12 = r31
            r1.append(r12)
            java.lang.String r0 = " : "
            r1.append(r0)
            int r0 = r10.width
            r1.append(r0)
            java.lang.String r0 = " x "
            r1.append(r0)
            int r0 = r10.height
            r1.append(r0)
            java.lang.String r0 = ". @ "
            r1.append(r0)
            r29 = r34
            r0 = r29
            r1.append(r0)
            java.lang.String r0 = " kbps. Fps: "
            r1.append(r0)
            r28 = r35
            r0 = r28
            r1.append(r0)
            java.lang.String r0 = ". Key frame interval: "
            r1.append(r0)
            r3 = r36
            r1.append(r3)
            java.lang.String r0 = " seconds. Encode from texture : "
            X.C36321k7.A1X(r0, r1, r11)
            java.lang.Thread r0 = r10.mediaCodecThread
            if (r0 != 0) goto L_0x0312
            java.lang.String r18 = "vid_driver.encoder_name"
            java.lang.String r8 = com.whatsapp.voipcalling.Voip.A06(r18)
            long r4 = android.os.SystemClock.uptimeMillis()
            long r0 = lastReleaseTimestamp
            long r4 = r4 - r0
            r1 = 3000(0xbb8, double:1.482E-320)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            boolean r4 = X.AnonymousClass000.A1R(r0)
            X.5SV r0 = X.AnonymousClass5SV.VIDEO_CODEC_VP8     // Catch:{ all -> 0x030a }
            java.lang.String r9 = "video/hevc"
            java.lang.String r7 = "video/avc"
            java.lang.String r6 = "video/x-vnd.on2.vp9"
            java.lang.String r5 = "video/x-vnd.on2.vp8"
            if (r12 != r0) goto L_0x0097
            if (r8 == 0) goto L_0x0087
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x030a }
            r0 = 0
            r2[r0] = r8     // Catch:{ all -> 0x030a }
            goto L_0x0089
        L_0x0087:
            java.lang.String[] r2 = supportedVp8HwCodecPrefixes     // Catch:{ all -> 0x030a }
        L_0x0089:
            if (r11 == 0) goto L_0x008c
            goto L_0x008e
        L_0x008c:
            r1 = 0
            goto L_0x0090
        L_0x008e:
            int[] r1 = supportedSurfaceColorList     // Catch:{ all -> 0x030a }
        L_0x0090:
            r0 = -1
            java.util.List r2 = findHwEncoder(r5, r2, r1, r0, r4)     // Catch:{ all -> 0x030a }
            r9 = r5
            goto L_0x00b1
        L_0x0097:
            X.5SV r0 = X.AnonymousClass5SV.VIDEO_CODEC_VP9     // Catch:{ all -> 0x030a }
            if (r12 != r0) goto L_0x00b4
            if (r8 == 0) goto L_0x00a2
            java.lang.String[] r2 = X.C90474aD.A1b(r8)     // Catch:{ all -> 0x030a }
            goto L_0x00a4
        L_0x00a2:
            java.lang.String[] r2 = supportedVp9HwCodecPrefixes     // Catch:{ all -> 0x030a }
        L_0x00a4:
            if (r11 == 0) goto L_0x00a7
            goto L_0x00a9
        L_0x00a7:
            r1 = 0
            goto L_0x00ab
        L_0x00a9:
            int[] r1 = supportedSurfaceColorList     // Catch:{ all -> 0x030a }
        L_0x00ab:
            r0 = -1
            java.util.List r2 = findHwEncoder(r6, r2, r1, r0, r4)     // Catch:{ all -> 0x030a }
            r9 = r6
        L_0x00b1:
            r8 = 100
            goto L_0x00ef
        L_0x00b4:
            X.5SV r0 = X.AnonymousClass5SV.VIDEO_CODEC_H264     // Catch:{ all -> 0x030a }
            if (r12 != r0) goto L_0x00cf
            if (r8 == 0) goto L_0x00bf
            java.lang.String[] r2 = X.C90474aD.A1b(r8)     // Catch:{ all -> 0x030a }
            goto L_0x00c1
        L_0x00bf:
            java.lang.String[] r2 = supportedH264HwCodecPrefixes     // Catch:{ all -> 0x030a }
        L_0x00c1:
            if (r11 == 0) goto L_0x00c4
            goto L_0x00c6
        L_0x00c4:
            r1 = 0
            goto L_0x00c8
        L_0x00c6:
            int[] r1 = supportedSurfaceColorList     // Catch:{ all -> 0x030a }
        L_0x00c8:
            r0 = -1
            java.util.List r2 = findHwEncoder(r7, r2, r1, r0, r4)     // Catch:{ all -> 0x030a }
            r9 = r7
            goto L_0x00ed
        L_0x00cf:
            X.5SV r0 = X.AnonymousClass5SV.VIDEO_CODEC_H265     // Catch:{ all -> 0x030a }
            if (r12 != r0) goto L_0x00e9
            if (r8 == 0) goto L_0x00da
            java.lang.String[] r2 = X.C90474aD.A1b(r8)     // Catch:{ all -> 0x030a }
            goto L_0x00dc
        L_0x00da:
            java.lang.String[] r2 = supportedH265HwCodecPrefixes     // Catch:{ all -> 0x030a }
        L_0x00dc:
            if (r11 == 0) goto L_0x00df
            goto L_0x00e1
        L_0x00df:
            r1 = 0
            goto L_0x00e3
        L_0x00e1:
            int[] r1 = supportedSurfaceColorList     // Catch:{ all -> 0x030a }
        L_0x00e3:
            r0 = -1
            java.util.List r2 = findHwEncoder(r9, r2, r1, r0, r4)     // Catch:{ all -> 0x030a }
            goto L_0x00ed
        L_0x00e9:
            r2 = 0
            r8 = 0
            r9 = 0
            goto L_0x00ef
        L_0x00ed:
            r8 = 20
        L_0x00ef:
            if (r36 < 0) goto L_0x00f2
            r8 = r3
        L_0x00f2:
            if (r2 == 0) goto L_0x02ff
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x02ff
            runningInstance = r30
            java.util.List r1 = r10.freeInfos
            java.util.Queue r0 = r10.carryAlongInfos
            r1.addAll(r0)
            java.util.Queue r0 = r10.carryAlongInfos
            r0.clear()
            java.util.Iterator r17 = r2.iterator()
        L_0x010c:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x02fd
            java.lang.Object r7 = r17.next()
            X.5vh r7 = (X.C122955vh) r7
            java.lang.String r6 = r7.A02
            r10.codecName = r6
            int r5 = r7.A00
            r10.colorFormat = r5
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "MediaCodecVideoEncoder Java initEncode: format: 0x"
            r1.append(r0)
            X.C90504aG.A0z(r5, r1)
            java.lang.String r0 = " for Encoder: "
            X.C36321k7.A1Q(r0, r6, r1)
            java.lang.String r1 = r10.codecName
            java.lang.String r0 = "OMX.google.h264.encoder"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0143
            r0 = 320(0x140, float:4.48E-43)
            r10.width = r0
            r0 = 192(0xc0, float:2.69E-43)
            r10.height = r0
        L_0x0143:
            r25 = 176(0xb0, float:2.47E-43)
            r26 = 144(0x90, float:2.02E-43)
            android.media.MediaCodecInfo$VideoCapabilities r1 = r7.A01
            java.lang.String r2 = "samsung"
            if (r1 == 0) goto L_0x02eb
            android.util.Range r0 = r1.getSupportedWidths()
            java.lang.Comparable r0 = r0.getLower()
            int r25 = X.AnonymousClass000.A0I(r0)
            android.util.Range r0 = r1.getSupportedHeights()
            java.lang.Comparable r0 = r0.getLower()
            int r26 = X.AnonymousClass000.A0I(r0)
        L_0x0165:
            java.lang.String r1 = r10.codecName
            java.lang.String r0 = "OMX.qcom.video.encoder.avc"
            boolean r1 = r1.equals(r0)
            int r24 = X.C90494aF.A07(r1)
            java.lang.String r0 = android.os.Build.MANUFACTURER
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x017d
            if (r1 == 0) goto L_0x017d
            r24 = 16
        L_0x017d:
            java.lang.String r0 = "vid_driver.encoder_min_width"
            java.lang.Integer r13 = com.whatsapp.voipcalling.Voip.A04(r0)
            java.lang.String r0 = "vid_driver.encoder_min_height"
            java.lang.Integer r4 = com.whatsapp.voipcalling.Voip.A04(r0)
            java.lang.String r0 = "vid_driver.encoder_alignment"
            java.lang.Integer r3 = com.whatsapp.voipcalling.Voip.A04(r0)
            java.lang.String r0 = "vid_driver.encoder_h264_profile"
            java.lang.Integer r2 = com.whatsapp.voipcalling.Voip.A04(r0)
            java.lang.String r0 = "vid_driver.encoder_h264_level"
            java.lang.Integer r1 = com.whatsapp.voipcalling.Voip.A04(r0)
            java.lang.String r0 = "vid_driver.encoder_hw_h264_maxqp"
            java.lang.Integer r0 = com.whatsapp.voipcalling.Voip.A04(r0)
            if (r13 == 0) goto L_0x01a7
            int r25 = r13.intValue()
        L_0x01a7:
            if (r4 == 0) goto L_0x01ad
            int r26 = r4.intValue()
        L_0x01ad:
            if (r3 == 0) goto L_0x01b3
            int r24 = r3.intValue()
        L_0x01b3:
            if (r2 == 0) goto L_0x02e8
            int r4 = r2.intValue()
        L_0x01b9:
            if (r1 == 0) goto L_0x02e5
            int r3 = r1.intValue()
        L_0x01bf:
            if (r0 == 0) goto L_0x02e2
            int r2 = r0.intValue()
        L_0x01c5:
            java.lang.String r15 = r10.codecName
            int r14 = r10.colorFormat
            int r13 = r10.width
            int r1 = r10.height
            r0 = 0
            r19 = r0
            r20 = r15
            r21 = r14
            r22 = r13
            r23 = r1
            X.6Lq r14 = X.C146526vk.A04(r19, r20, r21, r22, r23, r24, r25, r26)
            int r1 = r14.A09
            r10.width = r1
            int r1 = r14.A06
            r10.height = r1
            int r1 = r14.A00
            r10.colorFormat = r1
            int r1 = r14.A05
            r10.colorId = r1
            java.lang.String r1 = "vid_driver.encoder_frame_converter_color_format"
            java.lang.Integer r16 = com.whatsapp.voipcalling.Voip.A04(r1)
            java.lang.String r13 = com.whatsapp.voipcalling.Voip.A06(r18)
            java.lang.String r1 = "vid_driver.encoder_color_format"
            java.lang.Integer r15 = com.whatsapp.voipcalling.Voip.A04(r1)
            if (r16 == 0) goto L_0x0218
            if (r13 == 0) goto L_0x0218
            if (r15 == 0) goto L_0x0218
            java.lang.String r1 = r10.codecName
            boolean r1 = r1.equalsIgnoreCase(r13)
            if (r1 == 0) goto L_0x0218
            int r13 = r10.colorFormat
            int r1 = r15.intValue()
            if (r13 != r1) goto L_0x0218
            int r1 = r16.intValue()
            r10.colorId = r1
        L_0x0218:
            X.1Pa r1 = r10.voipSharedPreferences
            int r15 = r10.colorId
            android.content.SharedPreferences$Editor r13 = X.C90474aD.A0F(r1)
            java.lang.String r1 = "video_encoder_frame_convertor_color_id"
            X.C36341k9.A0v(r13, r1, r15)
            int r1 = r14.A08
            r16 = r1
            int r14 = r14.A07
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r10.mediaCodecThread = r1
            int r13 = r10.width     // Catch:{ all -> 0x02da }
            int r1 = r10.height     // Catch:{ all -> 0x02da }
            android.media.MediaFormat r13 = android.media.MediaFormat.createVideoFormat(r9, r13, r1)     // Catch:{ all -> 0x02da }
            java.lang.String r15 = "bitrate"
            r1 = r29
            int r1 = r1 * 1000
            r13.setInteger(r15, r1)     // Catch:{ all -> 0x02da }
            java.lang.String r1 = "color-format"
            r13.setInteger(r1, r5)     // Catch:{ all -> 0x02da }
            java.lang.String r5 = "frame-rate"
            r1 = r28
            r13.setInteger(r5, r1)     // Catch:{ all -> 0x02da }
            java.lang.String r1 = "i-frame-interval"
            r13.setInteger(r1, r8)     // Catch:{ all -> 0x02da }
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x02da }
            r1 = 31
            if (r5 < r1) goto L_0x0260
            if (r2 <= 0) goto L_0x0260
            java.lang.String r1 = "video-qp-max"
            r13.setInteger(r1, r2)     // Catch:{ all -> 0x02da }
        L_0x0260:
            java.lang.String r2 = "stride"
            r1 = r16
            r13.setInteger(r2, r1)     // Catch:{ all -> 0x02da }
            java.lang.String r1 = "slice-height"
            r13.setInteger(r1, r14)     // Catch:{ all -> 0x02da }
            if (r4 < 0) goto L_0x0296
            android.media.MediaCodecInfo$CodecProfileLevel[] r14 = r7.A03     // Catch:{ all -> 0x02da }
            if (r14 == 0) goto L_0x0296
            int r7 = r14.length     // Catch:{ all -> 0x02da }
            r5 = 0
        L_0x0274:
            if (r5 >= r7) goto L_0x0296
            r2 = r14[r5]     // Catch:{ all -> 0x02da }
            int r1 = r2.profile     // Catch:{ all -> 0x02da }
            if (r1 != r4) goto L_0x028c
            int r1 = r2.level     // Catch:{ all -> 0x02da }
            if (r1 == r3) goto L_0x0286
            int r2 = r2.level     // Catch:{ all -> 0x02da }
            r1 = 65536(0x10000, float:9.18355E-41)
            if (r2 != r1) goto L_0x028c
        L_0x0286:
            java.lang.String r1 = "profile"
            r13.setInteger(r1, r4)     // Catch:{ all -> 0x02da }
            goto L_0x028f
        L_0x028c:
            int r5 = r5 + 1
            goto L_0x0274
        L_0x028f:
            if (r3 < 0) goto L_0x0296
            java.lang.String r1 = "level"
            r13.setInteger(r1, r3)     // Catch:{ all -> 0x02da }
        L_0x0296:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x02da }
            java.lang.String r1 = "MediaCodecVideoEncoder   Format: "
            X.C36321k7.A1K(r13, r1, r2)     // Catch:{ all -> 0x02da }
            android.media.MediaCodec r2 = createByCodecName(r6)     // Catch:{ all -> 0x02da }
            r10.mediaCodec = r2     // Catch:{ all -> 0x02da }
            r10.type = r12     // Catch:{ all -> 0x02da }
            if (r2 != 0) goto L_0x02af
            java.lang.String r0 = "MediaCodecVideoEncoder Can not create media encoder"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x02da }
            goto L_0x02f9
        L_0x02af:
            r1 = 1
            r2.configure(r13, r0, r0, r1)     // Catch:{ all -> 0x02da }
            if (r11 == 0) goto L_0x02d4
            int[] r2 = X.C131466Pd.A01     // Catch:{ all -> 0x02da }
            X.7ab r1 = new X.7ab     // Catch:{ all -> 0x02da }
            r0 = r27
            r1.<init>(r0, r2)     // Catch:{ all -> 0x02da }
            r10.eglBase = r1     // Catch:{ all -> 0x02da }
            android.media.MediaCodec r0 = r10.mediaCodec     // Catch:{ all -> 0x02da }
            android.view.Surface r1 = r0.createInputSurface()     // Catch:{ all -> 0x02da }
            r10.inputSurface = r1     // Catch:{ all -> 0x02da }
            X.7ab r0 = r10.eglBase     // Catch:{ all -> 0x02da }
            X.C156747ab.A00(r1, r0)     // Catch:{ all -> 0x02da }
            X.6Rv r0 = new X.6Rv     // Catch:{ all -> 0x02da }
            r0.<init>()     // Catch:{ all -> 0x02da }
            r10.drawer = r0     // Catch:{ all -> 0x02da }
        L_0x02d4:
            android.media.MediaCodec r0 = r10.mediaCodec     // Catch:{ all -> 0x02da }
            r0.start()     // Catch:{ all -> 0x02da }
            goto L_0x02fb
        L_0x02da:
            r1 = move-exception
            java.lang.String r0 = "MediaCodecVideoEncoder initEncode failed"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x010c
        L_0x02e2:
            r2 = -1
            goto L_0x01c5
        L_0x02e5:
            r3 = -1
            goto L_0x01bf
        L_0x02e8:
            r4 = -1
            goto L_0x01b9
        L_0x02eb:
            java.lang.String r0 = android.os.Build.MANUFACTURER
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0165
            r25 = 160(0xa0, float:2.24E-43)
            r26 = 128(0x80, float:1.794E-43)
            goto L_0x0165
        L_0x02f9:
            r0 = 0
            return r0
        L_0x02fb:
            r0 = 1
            return r0
        L_0x02fd:
            r2 = 0
            return r2
        L_0x02ff:
            r2 = 0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "MediaCodecVideoEncoder Can not find HW encoder for "
            X.C36321k7.A1P(r0, r9, r1)
            return r2
        L_0x030a:
            r2 = move-exception
            r1 = 0
            java.lang.String r0 = "MediaCodecVideoEncoder Exception in findHwEncoder"
            com.whatsapp.util.Log.e(r0, r2)
            return r1
        L_0x0312:
            java.lang.String r0 = "Forgot to release()?"
            java.lang.RuntimeException r0 = X.C90514aH.A0s(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.wawebrtc.MediaCodecVideoEncoder.initEncode(X.5SV, int, int, int, int, int, X.5Ve):boolean");
    }

    public boolean initH264Encoder(int i, int i2, int i3, int i4, int i5) {
        return initEncode(AnonymousClass5SV.VIDEO_CODEC_H264, i, i2, i3, i4, i5, (C108855Ve) null);
    }

    public boolean initH265Encoder(int i, int i2, int i3, int i4, int i5) {
        return initEncode(AnonymousClass5SV.VIDEO_CODEC_H265, i, i2, i3, i4, i5, (C108855Ve) null);
    }

    public boolean resetEncoderOnFPSChanges() {
        return "OMX.Exynos.AVC.Encoder".equalsIgnoreCase(this.codecName);
    }

    public boolean supportForceKeyFrame() {
        return !"OMX.google.h264.encoder".equalsIgnoreCase(this.codecName);
    }

    public boolean supportUpdateBitrate() {
        return !"OMX.google.h264.encoder".equalsIgnoreCase(this.codecName);
    }

    public MediaCodecVideoEncoder(C27631Pa r5) {
        this.voipSharedPreferences = r5;
        int i = 0;
        do {
            this.freeInfos.add(new AnonymousClass6KO());
            i++;
        } while (i < 10);
        this.keyFrameRequestBundle.putInt("request-sync", 0);
    }

    public static MediaCodec createByCodecName(String str) {
        try {
            return MediaCodec.createByCodecName(str);
        } catch (Exception e) {
            Log.e((Throwable) e);
            return null;
        }
    }

    private boolean setRates(int i, int i2) {
        if (!supportUpdateBitrate()) {
            return false;
        }
        try {
            Bundle A07 = AnonymousClass001.A07();
            A07.putInt("video-bitrate", i * 1000);
            this.mediaCodec.setParameters(A07);
            return true;
        } catch (IllegalStateException e) {
            Log.e("MediaCodecVideoEncoder setRates failed", e);
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0043, code lost:
        X.C90484aE.A0z();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void release() {
        /*
            r12 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "MediaCodecVideoEncoder Java releaseEncoder "
            r1.append(r0)
            java.lang.String r0 = r12.codecName
            X.C36321k7.A1a(r1, r0)
            java.util.concurrent.CountDownLatch r11 = X.C90484aE.A0u()
            r0 = 17
            X.72x r2 = new X.72x
            r2.<init>(r11, r12, r0)
            java.lang.String r1 = "MediaCodecVideoEncoder"
            X.0wm r0 = new X.0wm
            r0.<init>(r2, r1)
            r0.start()
            r9 = 5000(0x1388, double:2.4703E-320)
            long r7 = android.os.SystemClock.elapsedRealtime()
            r6 = 0
            r3 = 5000(0x1388, double:2.4703E-320)
            r5 = 0
        L_0x002d:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x0036 }
            boolean r6 = r11.await(r3, r0)     // Catch:{ InterruptedException -> 0x0036 }
            if (r5 == 0) goto L_0x0046
            goto L_0x0043
        L_0x0036:
            r5 = 1
            long r0 = X.C90514aH.A0J(r7)
            long r3 = r9 - r0
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x002d
        L_0x0043:
            X.C90484aE.A0z()
        L_0x0046:
            if (r6 != 0) goto L_0x0053
            java.lang.String r0 = "MediaCodecVideoEncoder Media encoder release timeout"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            int r0 = codecErrors
            int r0 = r0 + 1
            codecErrors = r0
        L_0x0053:
            r5 = 0
            r12.codecName = r5
            r12.mediaCodec = r5
            r12.mediaCodecThread = r5
            X.6Rv r0 = r12.drawer
            if (r0 == 0) goto L_0x0087
            java.util.Map r4 = r0.A00
            java.util.Iterator r3 = X.AnonymousClass000.A0z(r4)
        L_0x0064:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0082
            java.lang.Object r0 = r3.next()
            X.5rk r0 = (X.C120585rk) r0
            X.6Nj r2 = r0.A01
            java.lang.String r0 = "GlShader Deleting shader."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r1 = r2.A00
            r0 = -1
            if (r1 == r0) goto L_0x0064
            android.opengl.GLES20.glDeleteProgram(r1)
            r2.A00 = r0
            goto L_0x0064
        L_0x0082:
            r4.clear()
            r12.drawer = r5
        L_0x0087:
            X.7ab r0 = r12.eglBase
            if (r0 == 0) goto L_0x0090
            r0.A05()
            r12.eglBase = r5
        L_0x0090:
            android.view.Surface r0 = r12.inputSurface
            if (r0 == 0) goto L_0x0099
            r0.release()
            r12.inputSurface = r5
        L_0x0099:
            runningInstance = r5
            long r0 = android.os.SystemClock.uptimeMillis()
            lastReleaseTimestamp = r0
            java.lang.String r0 = "MediaCodecVideoEncoder Java releaseEncoder done"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.wawebrtc.MediaCodecVideoEncoder.release():void");
    }
}
