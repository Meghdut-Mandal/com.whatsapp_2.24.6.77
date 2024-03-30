package org.wawebrtc;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass5SU;
import X.AnonymousClass6SH;
import X.AnonymousClass7dS;
import X.C108865Vf;
import X.C108875Vg;
import X.C122945vg;
import X.C130316Kp;
import X.C130586Lq;
import X.C146526vk;
import X.C1498272x;
import X.C18740tg;
import X.C19950wm;
import X.C36321k7;
import X.C36331k8;
import X.C36391kE;
import X.C36411kG;
import X.C36431kI;
import X.C36441kJ;
import X.C90464aC;
import X.C90484aE;
import X.C90494aF;
import X.C90504aG;
import X.C90514aH;
import X.C90524aI;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.SystemClock;
import android.view.Surface;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.Voip;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class MediaCodecVideoDecoder {
    public static final String DECODER_IMPL_HW_STRING = "HW";
    public static final String DECODER_IMPL_SW_STRING = "SW";
    public static final int DEQUEUE_INPUT_TIMEOUT = 500000;
    public static final String H264_MIME_TYPE = "video/avc";
    public static final String H265_MIME_TYPE = "video/hevc";
    public static final long MAX_DECODE_TIME_MS = 500;
    public static final int MAX_QUEUED_OUTPUTBUFFERS = 3;
    public static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    public static final String TAG = "MediaCodecVideoDecoder";
    public static final String VP8_MIME_TYPE = "video/x-vnd.on2.vp8";
    public static final String VP9_MIME_TYPE = "video/x-vnd.on2.vp9";
    public static final String[] blacklistedDeviceBoard = new String[0];
    public static final String[] blacklistedHwCodecPrefixes = {"OMX.TI.DUCATI1.VIDEO.DECODER"};
    public static final Map cachedCodecCapabilites = AnonymousClass001.A0J();
    public static int codecErrors;
    public static AnonymousClass7dS errorCallback;
    public static Set hwDecoderDisabledTypes = C36441kJ.A16();
    public static long lastReleaseTimestamp;
    public static final String[] restartDecoderOnNewSpsPpsPrefixes = {"omx.mtk.", "OMX.SEC.avc.dec"};
    public static MediaCodecVideoDecoder runningInstance;
    public static final String[] spsBaselineProfileHackPrefixes = new String[0];
    public static final String[] spsBitstreamRestrictionsPrefixes = {"omx.qcom.", "omx.nvidia.", "omx.brcm.", "OMX.Exynos."};
    public static final String[] spsConstrainedHighProfilePrefixes = new String[0];
    public static final String[] supportedH264HwCodecPrefixes = null;
    public static final String[] supportedH265HwCodecPrefixes = null;
    public static final String[] supportedVp8HwCodecPrefixes = {"OMX.qcom.", "OMX.Nvidia.", "OMX.Exynos.", "OMX.Intel."};
    public static final String[] supportedVp9HwCodecPrefixes = {"OMX.qcom.", "OMX.Exynos."};
    public MediaCodec.BufferInfo cachedBufferInfo = new MediaCodec.BufferInfo();
    public BufferInfo cachedInputBuffer = new BufferInfo();
    public BufferInfo cachedOutputBuffer = new BufferInfo();
    public final Queue carryAlongInfos = C90524aI.A0l();
    public String codecName;
    public int colorFormat;
    public int colorId;
    public int cropBottom;
    public int cropLeft;
    public int cropRight;
    public int cropTop;
    public final Queue dequeuedSurfaceOutputBuffers = C90524aI.A0l();
    public int droppedFrames;
    public final List freeInfos = C90524aI.A0l();
    public boolean hasDecodedFirstFrame;
    public int height;
    public ByteBuffer[] inputBuffers;
    public MediaCodec mediaCodec;
    public Thread mediaCodecThread;
    public boolean needsRestartDecoderOnNewSpsPps;
    public boolean needsSpsBaselineProfileHack;
    public boolean needsSpsBitstreamRestrictions;
    public boolean needsSpsConstrainedHighProfile;
    public boolean needsSpsPpsInCsd;
    public ByteBuffer[] outputBuffers;
    public int sliceHeight;
    public int stride;
    public Surface surface = null;
    public C108865Vf textureListener;
    public boolean useSurface;
    public int width;

    public class BufferInfo {
        public int bitInfo;
        public ByteBuffer buffer;
        public long decodeTimeMs;
        public long endDecodeTimeMs;
        public int index;
        public long ntpTimeStampMs;
        public long presentationTimeStampMs;
        public long timeStampMs;

        public void set(int i, ByteBuffer byteBuffer, long j, long j2, long j3, int i2, long j4, long j5) {
            this.index = i;
            this.buffer = byteBuffer;
            this.presentationTimeStampMs = j;
            this.timeStampMs = j2;
            this.ntpTimeStampMs = j3;
            this.bitInfo = i2;
            this.decodeTimeMs = j4;
            this.endDecodeTimeMs = j5;
        }
    }

    private void checkOnMediaCodecThread() {
    }

    private int getDequeueOutputTimeout() {
        return 20;
    }

    private boolean initH264Decoder(int i, int i2, byte[] bArr, byte[] bArr2, boolean z) {
        C122945vg r4 = null;
        try {
            List findDecoder = findDecoder("video/avc", supportedH264HwCodecPrefixes, -1, false);
            if (findDecoder != null && !findDecoder.isEmpty()) {
                r4 = (C122945vg) findDecoder.get(0);
            }
        } catch (Throwable th) {
            Log.e("MediaCodecVideoDecoder Exception in findDecoder", th);
        }
        setDecoderFlags(r4);
        return initDecode(AnonymousClass5SU.VIDEO_CODEC_H264, i, i2, (C108875Vg) null, bArr, bArr2, z);
    }

    private boolean initH265Decoder(int i, int i2, byte[] bArr, byte[] bArr2, boolean z) {
        C122945vg r4 = null;
        try {
            List findDecoder = findDecoder("video/hevc", supportedH265HwCodecPrefixes, -1, true);
            if (findDecoder != null && !findDecoder.isEmpty()) {
                r4 = (C122945vg) C36391kE.A0t(findDecoder);
            }
        } catch (Throwable th) {
            Log.e("MediaCodecVideoDecoder Exception in findDecoder", th);
        }
        setDecoderFlags(r4);
        return initDecode(AnonymousClass5SU.VIDEO_CODEC_H265, i, i2, (C108875Vg) null, bArr, bArr2, z);
    }

    private boolean queueInputBuffer(int i, int i2, long j, long j2, int i3) {
        C130316Kp r4;
        try {
            int i4 = i;
            ByteBuffer inputBuffer = this.mediaCodec.getInputBuffer(i);
            inputBuffer.position(0);
            int i5 = i2;
            inputBuffer.limit(i2);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = j;
            long j4 = j2;
            int i6 = i3;
            if (this.freeInfos.isEmpty()) {
                r4 = new C130316Kp(i6, elapsedRealtime, j3, j4);
            } else {
                r4 = (C130316Kp) this.freeInfos.remove(0);
                r4.A01 = elapsedRealtime;
                r4.A03 = j;
                r4.A02 = j4;
                r4.A00 = i6;
            }
            this.carryAlongInfos.add(r4);
            this.mediaCodec.queueInputBuffer(i4, 0, i5, 1000 * elapsedRealtime, 0);
            return true;
        } catch (IllegalStateException e) {
            Log.e("MediaCodecVideoDecoder decode failed", e);
            return false;
        }
    }

    public class Api29Impl {
        public static boolean mediaCodecInfoIsSoftwareOnly(MediaCodecInfo mediaCodecInfo) {
            return mediaCodecInfo.isSoftwareOnly();
        }
    }

    public class DecodedTextureBuffer {
        public final long decodeTimeMs;
        public final long frameDelayMs;
        public final long ntpTimeStampMs;
        public final long presentationTimeStampMs;
        public final int textureID;
        public final long timeStampMs;
        public final float[] transformMatrix;

        public DecodedTextureBuffer(int i, float[] fArr, long j, long j2, long j3, long j4, long j5) {
            this.textureID = i;
            this.transformMatrix = fArr;
            this.presentationTimeStampMs = j;
            this.timeStampMs = j2;
            this.ntpTimeStampMs = j3;
            this.decodeTimeMs = j4;
            this.frameDelayMs = j5;
        }
    }

    private void MaybeRenderDecodedTextureBuffer() {
        if (!this.dequeuedSurfaceOutputBuffers.isEmpty()) {
            throw AnonymousClass001.A0A("isWaitingForTexture");
        }
    }

    private BufferInfo dequeueInputBuffer() {
        MediaCodec mediaCodec2 = this.mediaCodec;
        if (mediaCodec2 != null) {
            try {
                int dequeueInputBuffer = mediaCodec2.dequeueInputBuffer(500000);
                if (dequeueInputBuffer >= 0) {
                    this.cachedInputBuffer.set(dequeueInputBuffer, this.mediaCodec.getInputBuffer(dequeueInputBuffer), 0, 0, 0, 0, 0, 0);
                    return this.cachedInputBuffer;
                }
            } catch (Throwable th) {
                Log.e(th);
                throw th;
            }
        }
        return null;
    }

    private BufferInfo dequeueOutputBuffer(int i) {
        int dequeueOutputBuffer;
        int i2;
        int i3;
        int i4;
        int i5;
        if (!this.carryAlongInfos.isEmpty()) {
            MediaCodec.BufferInfo bufferInfo = this.cachedBufferInfo;
            while (true) {
                dequeueOutputBuffer = this.mediaCodec.dequeueOutputBuffer(bufferInfo, TimeUnit.MILLISECONDS.toMicros((long) i));
                if (dequeueOutputBuffer != -3) {
                    if (dequeueOutputBuffer != -2) {
                        break;
                    }
                    MediaFormat outputFormat = this.mediaCodec.getOutputFormat();
                    StringBuilder A0u = AnonymousClass000.A0u();
                    C36321k7.A1a(A0u, C90494aF.A0c(outputFormat, "MediaCodecVideoDecoder Decoder format changed: ", A0u));
                    C130586Lq A03 = C146526vk.A03(outputFormat, (AnonymousClass6SH) null, this.codecName);
                    int i6 = A03.A09;
                    this.width = i6;
                    int i7 = A03.A06;
                    this.height = i7;
                    this.stride = Math.max(i6, A03.A08);
                    this.sliceHeight = Math.max(i7, A03.A07);
                    int i8 = A03.A00;
                    this.colorFormat = i8;
                    this.colorId = getFrameConverterColorId(i8, A03.A05);
                    this.cropLeft = 0;
                    int i9 = this.width;
                    this.cropRight = i9 - 1;
                    this.cropTop = 0;
                    this.cropBottom = this.height - 1;
                    int i10 = A03.A02;
                    if (i10 >= 0 && i10 < (i4 = A03.A08) && (i5 = A03.A03) >= 0 && i5 < i4 && i10 < i5) {
                        this.cropLeft = i10;
                        this.cropRight = i5;
                        int i11 = (i5 - i10) + 1;
                        if (i11 < i9) {
                            this.width = i11;
                            C36321k7.A1U("MediaCodecVideoDecoder Decoder format changed, use cropRight and cropLeft to calculate width ", AnonymousClass000.A0u(), i11);
                        }
                    }
                    int i12 = A03.A01;
                    if (i12 >= 0 && i12 < (i2 = A03.A07) && (i3 = A03.A04) >= 0 && i3 < i2 && i3 < i12) {
                        this.cropTop = i3;
                        this.cropBottom = i12;
                        int i13 = (i12 - i3) + 1;
                        if (i13 < this.height) {
                            this.height = i13;
                            C36321k7.A1U("MediaCodecVideoDecoder Decoder format changed, use cropBottom and cropTop to calculate height ", AnonymousClass000.A0u(), i13);
                        }
                    }
                }
            }
            if (dequeueOutputBuffer != -1) {
                this.hasDecodedFirstFrame = true;
                C130316Kp r0 = (C130316Kp) this.carryAlongInfos.remove();
                long elapsedRealtime = SystemClock.elapsedRealtime() - r0.A01;
                ByteBuffer outputBuffer = this.mediaCodec.getOutputBuffer(dequeueOutputBuffer);
                C90464aC.A0s(bufferInfo, outputBuffer);
                this.cachedOutputBuffer.set(dequeueOutputBuffer, outputBuffer.slice(), TimeUnit.MICROSECONDS.toMillis(bufferInfo.presentationTimeUs), r0.A03, r0.A02, r0.A00, elapsedRealtime, SystemClock.elapsedRealtime());
                this.freeInfos.add(r0);
                return this.cachedOutputBuffer;
            }
        }
        return null;
    }

    private DecodedTextureBuffer dequeueTextureBuffer(int i) {
        if (this.useSurface) {
            BufferInfo dequeueOutputBuffer = dequeueOutputBuffer(i);
            if (dequeueOutputBuffer != null) {
                this.dequeuedSurfaceOutputBuffers.add(dequeueOutputBuffer);
            }
            MaybeRenderDecodedTextureBuffer();
            throw AnonymousClass001.A0A("dequeueTextureBuffer");
        }
        throw AnonymousClass001.A09("dequeueTexture() called for byte buffer decoding.");
    }

    public static void disableH264HwCodec() {
        Log.w("MediaCodecVideoDecoder H.264 decoding is disabled by application.");
        hwDecoderDisabledTypes.add("video/avc");
    }

    public static void disableH265HwCodec() {
        Log.w("MediaCodecVideoDecoder H.265 decoding is disabled by application.");
        hwDecoderDisabledTypes.add("video/hevc");
    }

    public static void disableVp8HwCodec() {
        Log.w("MediaCodecVideoDecoder VP8 decoding is disabled by application.");
        hwDecoderDisabledTypes.add("video/x-vnd.on2.vp8");
    }

    public static void disableVp9HwCodec() {
        Log.w("MediaCodecVideoDecoder VP9 decoding is disabled by application.");
        hwDecoderDisabledTypes.add("video/x-vnd.on2.vp9");
    }

    public static int getDecoderImplFromString(String str) {
        if (DECODER_IMPL_SW_STRING.equalsIgnoreCase(str)) {
            return 1;
        }
        if (DECODER_IMPL_HW_STRING.equalsIgnoreCase(str)) {
            return 2;
        }
        return 0;
    }

    private int getFrameConverterColorId(int i, int i2) {
        Integer A04 = Voip.A04("vid_driver.decoder_frame_converter_color_format");
        String A06 = Voip.A06("vid_driver.decoder_name");
        Integer A042 = Voip.A04("vid_driver.decoder_color_format");
        if (A04 == null || A06 == null || A042 == null || !A06.equalsIgnoreCase(this.codecName) || i != A042.intValue()) {
            return i2;
        }
        return A04.intValue();
    }

    private ByteBuffer getInputBuffer(int i) {
        return this.mediaCodec.getInputBuffer(i);
    }

    private ByteBuffer getOutputBuffer(int i) {
        return this.mediaCodec.getOutputBuffer(i);
    }

    private boolean initDecode(AnonymousClass5SU r11, int i, int i2, C108875Vg r14, byte[] bArr, byte[] bArr2, boolean z) {
        String[] strArr;
        String str;
        if (this.mediaCodecThread == null) {
            this.useSurface = AnonymousClass000.A1V(r14);
            if (r11 == AnonymousClass5SU.VIDEO_CODEC_VP8) {
                strArr = supportedVp8HwCodecPrefixes;
                str = "video/x-vnd.on2.vp8";
            } else if (r11 == AnonymousClass5SU.VIDEO_CODEC_VP9) {
                strArr = supportedVp9HwCodecPrefixes;
                str = "video/x-vnd.on2.vp9";
            } else if (r11 == AnonymousClass5SU.VIDEO_CODEC_H264) {
                strArr = supportedH264HwCodecPrefixes;
                str = "video/avc";
            } else if (r11 == AnonymousClass5SU.VIDEO_CODEC_H265) {
                strArr = supportedH265HwCodecPrefixes;
                str = "video/hevc";
            } else {
                throw C90514aH.A0s(AnonymousClass000.A0l(r11, "initDecode: Non-supported codec ", AnonymousClass000.A0u()));
            }
            try {
                List<C122945vg> findDecoder = findDecoder(str, strArr, -1, AnonymousClass000.A1R(((SystemClock.uptimeMillis() - lastReleaseTimestamp) > 3000 ? 1 : ((SystemClock.uptimeMillis() - lastReleaseTimestamp) == 3000 ? 0 : -1))));
                if (findDecoder == null || findDecoder.isEmpty()) {
                    C36321k7.A1P("MediaCodecVideoDecoder Can not find HW decoder for ", str, AnonymousClass000.A0u());
                } else {
                    runningInstance = this;
                    this.mediaCodecThread = Thread.currentThread();
                    this.freeInfos.addAll(this.carryAlongInfos);
                    this.carryAlongInfos.clear();
                    for (C122945vg r4 : findDecoder) {
                        StringBuilder A0u = AnonymousClass000.A0u();
                        A0u.append("MediaCodecVideoDecoder Java initDecode: ");
                        A0u.append(r11);
                        A0u.append(" : ");
                        A0u.append(i);
                        A0u.append(" x ");
                        A0u.append(i2);
                        A0u.append(". Color: 0x");
                        int i3 = r4.A00;
                        C90504aG.A0z(i3, A0u);
                        A0u.append(". Use Surface: ");
                        A0u.append(this.useSurface);
                        A0u.append(". Decoder: ");
                        String str2 = r4.A02;
                        C36321k7.A1a(A0u, str2);
                        try {
                            this.codecName = str2;
                            this.width = i;
                            this.height = i2;
                            this.stride = i;
                            this.sliceHeight = i2;
                            this.cropLeft = 0;
                            this.cropRight = i - 1;
                            this.cropTop = 0;
                            this.cropBottom = i2 - 1;
                            if (this.useSurface) {
                                throw AnonymousClass001.A0A("startListening");
                            }
                            MediaFormat createVideoFormat = MediaFormat.createVideoFormat(str, i, i2);
                            if (bArr != null) {
                                StringBuilder A0u2 = AnonymousClass000.A0u();
                                A0u2.append("MediaCodecVideoDecoder Java initDecode: csd-0 ");
                                C36321k7.A1a(A0u2, Arrays.toString(bArr));
                                createVideoFormat.setByteBuffer("csd-0", ByteBuffer.wrap(bArr));
                            }
                            if (bArr2 != null) {
                                StringBuilder A0u3 = AnonymousClass000.A0u();
                                A0u3.append("MediaCodecVideoDecoder Java initDecode: csd-1 ");
                                C36321k7.A1a(A0u3, Arrays.toString(bArr2));
                                createVideoFormat.setByteBuffer("csd-1", ByteBuffer.wrap(bArr2));
                            }
                            if (!this.useSurface) {
                                createVideoFormat.setInteger("color-format", i3);
                            }
                            C36321k7.A1K(createVideoFormat, "MediaCodecVideoDecoder   Format: ", AnonymousClass000.A0u());
                            MediaCodec createByCodecName = MediaCodecVideoEncoder.createByCodecName(str2);
                            this.mediaCodec = createByCodecName;
                            if (createByCodecName == null) {
                                Log.e("MediaCodecVideoDecoder Can not create media decoder");
                                if (!z) {
                                    break;
                                }
                            } else {
                                createByCodecName.configure(createVideoFormat, this.surface, (MediaCrypto) null, 0);
                                this.mediaCodec.start();
                                C130586Lq A03 = C146526vk.A03(createVideoFormat, (AnonymousClass6SH) null, this.codecName);
                                int i4 = A03.A00;
                                this.colorFormat = i4;
                                this.colorId = getFrameConverterColorId(i4, A03.A05);
                                this.hasDecodedFirstFrame = false;
                                this.dequeuedSurfaceOutputBuffers.clear();
                                this.droppedFrames = 0;
                                setDecoderFlags(r4);
                                return true;
                            }
                        } catch (Throwable th) {
                            Log.e("MediaCodecVideoDecoder initDecode failed with Exception", th);
                        }
                    }
                }
                return false;
            } catch (Throwable th2) {
                Log.e("MediaCodecVideoDecoder Exception in findDecoder", th2);
                return false;
            }
        } else {
            throw C90514aH.A0s("initDecode: Forgot to release()?");
        }
    }

    public static boolean isH264HwSupported() {
        if (hwDecoderDisabledTypes.contains("video/avc") || findDecoder("video/avc", supportedH264HwCodecPrefixes, -1, false) == null) {
            return false;
        }
        return true;
    }

    public static boolean isH265HwSupported() {
        if (hwDecoderDisabledTypes.contains("video/hevc") || findDecoder("video/hevc", supportedH265HwCodecPrefixes, -1, true) == null) {
            return false;
        }
        return true;
    }

    public static boolean isSoftwareCodec(MediaCodecInfo mediaCodecInfo) {
        if (Build.VERSION.SDK_INT >= 29) {
            return Api29Impl.mediaCodecInfoIsSoftwareOnly(mediaCodecInfo);
        }
        String name = mediaCodecInfo.getName();
        if (name.equalsIgnoreCase("OMX.google.h264.decoder") || name.equalsIgnoreCase("c2.android.avc.decoder") || C90514aH.A0y(name).contains(".sw.")) {
            return true;
        }
        return false;
    }

    public static boolean isVp8HwSupported() {
        if (hwDecoderDisabledTypes.contains("video/x-vnd.on2.vp8") || findDecoder("video/x-vnd.on2.vp8", supportedVp8HwCodecPrefixes, -1, false) == null) {
            return false;
        }
        return true;
    }

    public static boolean isVp9HwSupported() {
        if (hwDecoderDisabledTypes.contains("video/x-vnd.on2.vp9") || findDecoder("video/x-vnd.on2.vp9", supportedVp9HwCodecPrefixes, -1, false) == null) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r3 = r0.getStackTrace();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void printStackTrace() {
        /*
            org.wawebrtc.MediaCodecVideoDecoder r0 = runningInstance
            if (r0 == 0) goto L_0x001f
            java.lang.Thread r0 = r0.mediaCodecThread
            if (r0 == 0) goto L_0x001f
            java.lang.StackTraceElement[] r3 = r0.getStackTrace()
            int r2 = r3.length
            if (r2 <= 0) goto L_0x001f
            java.lang.String r0 = "MediaCodecVideoDecoder MediaCodecVideoDecoder stacks trace:"
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
        throw new UnsupportedOperationException("Method not decompiled: org.wawebrtc.MediaCodecVideoDecoder.printStackTrace():void");
    }

    private void reset(int i, int i2) {
        if (this.mediaCodecThread == null || this.mediaCodec == null) {
            throw C90514aH.A0s("Incorrect reset call for non-initialized decoder.");
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MediaCodecVideoDecoder Java reset: ");
        A0u.append(i);
        C36321k7.A1T(" x ", A0u, i2);
        this.mediaCodec.flush();
        this.codecName = null;
        this.width = i;
        this.height = i2;
        this.freeInfos.addAll(this.carryAlongInfos);
        this.carryAlongInfos.clear();
        this.dequeuedSurfaceOutputBuffers.clear();
        this.hasDecodedFirstFrame = false;
        this.droppedFrames = 0;
    }

    private void returnDecodedOutputBuffer(int i) {
        if (!this.useSurface) {
            this.mediaCodec.releaseOutputBuffer(i, false);
            return;
        }
        throw AnonymousClass001.A09("returnDecodedOutputBuffer() called for surface decoding.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setDecoderFlags(X.C122945vg r9) {
        /*
            r8 = this;
            java.lang.String r0 = "vid_driver.decoder_sps_pps_in_csd"
            java.lang.Integer r7 = com.whatsapp.voipcalling.Voip.A04(r0)
            java.lang.String r0 = "vid_driver.decoder_baseline_hack"
            java.lang.Integer r1 = com.whatsapp.voipcalling.Voip.A04(r0)
            java.lang.String r0 = "vid_driver.decoder_constrained_high_hack"
            java.lang.Integer r4 = com.whatsapp.voipcalling.Voip.A04(r0)
            java.lang.String r0 = "vid_driver.decoder_restriction_hack"
            java.lang.Integer r3 = com.whatsapp.voipcalling.Voip.A04(r0)
            java.lang.String r0 = "vid_driver.decoder_restart_on_new_sps_pps"
            java.lang.Integer r6 = com.whatsapp.voipcalling.Voip.A04(r0)
            r2 = 1
            r5 = 0
            if (r7 == 0) goto L_0x0129
            int r0 = r7.intValue()
            boolean r0 = X.AnonymousClass000.A1P(r0)
            r8.needsSpsPpsInCsd = r0
        L_0x002c:
            if (r1 == 0) goto L_0x0119
            int r0 = r1.intValue()
            boolean r0 = X.AnonymousClass000.A1R(r0)
        L_0x0036:
            r8.needsSpsBaselineProfileHack = r0
        L_0x0038:
            if (r4 == 0) goto L_0x0109
            int r0 = r4.intValue()
            boolean r0 = X.AnonymousClass000.A1R(r0)
        L_0x0042:
            r8.needsSpsConstrainedHighProfile = r0
        L_0x0044:
            if (r3 == 0) goto L_0x00a5
            int r0 = r3.intValue()
            boolean r0 = X.AnonymousClass000.A1R(r0)
        L_0x004e:
            r8.needsSpsBitstreamRestrictions = r0
        L_0x0050:
            if (r6 == 0) goto L_0x008c
            int r0 = r6.intValue()
            if (r0 <= 0) goto L_0x00a3
        L_0x0058:
            r8.needsRestartDecoderOnNewSpsPps = r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "MediaCodecVideoDecoder needsSpsPpsInCsd: "
            r1.append(r0)
            boolean r0 = r8.needsSpsPpsInCsd
            r1.append(r0)
            java.lang.String r0 = ". needsSpsBaselineProfileHack: "
            r1.append(r0)
            boolean r0 = r8.needsSpsBaselineProfileHack
            r1.append(r0)
            java.lang.String r0 = ". needsSpsBitstreamRestrictions: "
            r1.append(r0)
            boolean r0 = r8.needsSpsBitstreamRestrictions
            r1.append(r0)
            java.lang.String r0 = ". needsSpsConstrainedHighProfile: "
            r1.append(r0)
            boolean r0 = r8.needsSpsConstrainedHighProfile
            r1.append(r0)
            java.lang.String r0 = ". needsRestartDecoderOnNewSpsPps: "
            X.C36321k7.A1X(r0, r1, r2)
            return
        L_0x008c:
            if (r9 == 0) goto L_0x0058
            java.lang.String r1 = r9.A02
            java.lang.String[] r0 = restartDecoderOnNewSpsPpsPrefixes
            boolean r0 = X.C146526vk.A0F(r1, r0)
            if (r0 != 0) goto L_0x0058
            android.media.MediaCodecInfo$CodecCapabilities r1 = r9.A01
            java.lang.String r0 = "adaptive-playback"
            boolean r0 = r1.isFeatureSupported(r0)
            if (r0 != 0) goto L_0x00a3
            goto L_0x0058
        L_0x00a3:
            r2 = 0
            goto L_0x0058
        L_0x00a5:
            java.lang.String r0 = "smdk4"
            boolean r0 = X.AnonymousClass1K0.A03(r0)     // Catch:{ Exception -> 0x00c1 }
            if (r0 == 0) goto L_0x00b3
            java.lang.String r0 = "Found SMDK4 in /proc/cpuinfo"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x00c1 }
            goto L_0x0105
        L_0x00b3:
            java.lang.String r0 = "exynos 4"
            boolean r0 = X.AnonymousClass1K0.A03(r0)     // Catch:{ Exception -> 0x00c1 }
            if (r0 == 0) goto L_0x00c7
            java.lang.String r0 = "Found Exynos 4 in /proc/cpuinfo"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x00c1 }
            goto L_0x0105
        L_0x00c1:
            r1 = move-exception
            java.lang.String r0 = "DeviceInfo/isExynos4Device searchFileForText"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x00c7:
            java.lang.String r0 = "/sys/devices/system"
            java.io.File r0 = X.C90524aI.A0S(r0)     // Catch:{ Exception -> 0x00f3 }
            java.io.File[] r4 = r0.listFiles()     // Catch:{ Exception -> 0x00f3 }
            if (r4 == 0) goto L_0x00f9
            int r3 = r4.length     // Catch:{ Exception -> 0x00f3 }
        L_0x00d4:
            if (r5 >= r3) goto L_0x00f9
            r0 = r4[r5]     // Catch:{ Exception -> 0x00f3 }
            java.lang.String r1 = r0.getName()     // Catch:{ Exception -> 0x00f3 }
            java.util.Locale r0 = java.util.Locale.ENGLISH     // Catch:{ Exception -> 0x00f3 }
            java.lang.String r1 = r1.toLowerCase(r0)     // Catch:{ Exception -> 0x00f3 }
            java.lang.String r0 = "exynos4"
            boolean r0 = r1.contains(r0)     // Catch:{ Exception -> 0x00f3 }
            if (r0 == 0) goto L_0x00f0
            java.lang.String r0 = "Found exynos4 in /sys/devices/system"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x00f3 }
            goto L_0x0105
        L_0x00f0:
            int r5 = r5 + 1
            goto L_0x00d4
        L_0x00f3:
            r1 = move-exception
            java.lang.String r0 = "DeviceInfo/isExynos4Device search in /sys/devices/system"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x00f9:
            if (r9 == 0) goto L_0x0105
            java.lang.String r1 = r9.A02
            java.lang.String[] r0 = spsBitstreamRestrictionsPrefixes
            boolean r0 = X.C146526vk.A0F(r1, r0)
            goto L_0x004e
        L_0x0105:
            r8.needsSpsBitstreamRestrictions = r2
            goto L_0x0050
        L_0x0109:
            if (r9 == 0) goto L_0x0115
            java.lang.String r1 = r9.A02
            java.lang.String[] r0 = spsConstrainedHighProfilePrefixes
            boolean r0 = X.C146526vk.A0F(r1, r0)
            goto L_0x0042
        L_0x0115:
            r8.needsSpsConstrainedHighProfile = r5
            goto L_0x0044
        L_0x0119:
            if (r9 == 0) goto L_0x0125
            java.lang.String r1 = r9.A02
            java.lang.String[] r0 = spsBaselineProfileHackPrefixes
            boolean r0 = X.C146526vk.A0F(r1, r0)
            goto L_0x0036
        L_0x0125:
            r8.needsSpsBaselineProfileHack = r5
            goto L_0x0038
        L_0x0129:
            r8.needsSpsPpsInCsd = r5
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: org.wawebrtc.MediaCodecVideoDecoder.setDecoderFlags(X.5vg):void");
    }

    public static void setErrorCallback(AnonymousClass7dS r1) {
        Log.i("MediaCodecVideoDecoder Set error callback");
        errorCallback = r1;
    }

    public MediaCodecVideoDecoder() {
        int i = 0;
        do {
            this.freeInfos.add(new C130316Kp());
            i++;
        } while (i < 10);
    }

    public static List findDecoder(String str, String[] strArr, int i, boolean z) {
        String str2;
        int i2;
        StringBuilder A0k;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MediaCodecVideoDecoder Trying to find HW decoder for mime ");
        String str3 = str;
        C36321k7.A1a(A0u, str3);
        ArrayList A0I = AnonymousClass001.A0I();
        String A06 = Voip.A06("vid_driver.decoder_name");
        int i3 = -1;
        for (int i4 = 0; i4 < MediaCodecList.getCodecCount(); i4++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i4);
            if (!codecInfoAt.isEncoder()) {
                boolean isSoftwareCodec = isSoftwareCodec(codecInfoAt);
                String[] supportedTypes = codecInfoAt.getSupportedTypes();
                int length = supportedTypes.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        str2 = null;
                        break;
                    } else if (supportedTypes[i5].equals(str3)) {
                        str2 = codecInfoAt.getName();
                        break;
                    } else {
                        i5++;
                    }
                }
                if (str2 != null) {
                    if (z) {
                        C36321k7.A1Q("MediaCodecVideoDecoder Found candidate decoder ", str2, AnonymousClass000.A0u());
                    }
                    String[] strArr2 = blacklistedHwCodecPrefixes;
                    if (strArr2 == null || !C146526vk.A0F(str2, strArr2) || str2.equalsIgnoreCase(A06)) {
                        String[] strArr3 = blacklistedDeviceBoard;
                        if (strArr3 != null) {
                            String str4 = Build.BOARD;
                            if (C146526vk.A0F(str4, strArr3) && !isSoftwareCodec && !str2.equalsIgnoreCase(A06)) {
                                A0k = AnonymousClass000.A0u();
                                A0k.append("MediaCodecVideoDecoder Device Board ");
                                A0k.append(str4);
                                A0k.append(" is in the blacklist, do not use hardware codec ");
                            }
                        }
                        String[] strArr4 = strArr;
                        if (strArr == null || C146526vk.A0F(str2, strArr4)) {
                            String A0p = AnonymousClass000.A0p("_", str3, AnonymousClass000.A0v(str2));
                            Map map = cachedCodecCapabilites;
                            MediaCodecInfo.CodecCapabilities codecCapabilities = (MediaCodecInfo.CodecCapabilities) map.get(A0p);
                            if (codecCapabilities == null) {
                                try {
                                    codecCapabilities = codecInfoAt.getCapabilitiesForType(str3);
                                    C18740tg.A06(codecCapabilities);
                                    map.put(A0p, codecCapabilities);
                                } catch (Throwable th) {
                                    C90464aC.A1L("MediaCodecVideoDecoder failed to get capabilities for ", str2, AnonymousClass000.A0u(), th);
                                }
                            }
                            int i6 = i;
                            boolean A1P = C36431kI.A1P(i6);
                            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecCapabilities.profileLevels) {
                                if (i >= 0 && codecProfileLevel.profile == i6) {
                                    A1P = true;
                                }
                            }
                            if (!A1P) {
                                A0k = C36331k8.A0k("MediaCodecVideoDecoder  ", str2);
                                A0k.append(" does not support Profile ");
                                A0k.append(i6);
                                C36411kG.A1P(A0k);
                            } else {
                                if (z) {
                                    StringBuilder A0v = AnonymousClass000.A0v("MediaCodecVideoDecoder  ");
                                    A0v.append(codecCapabilities.colorFormats.length);
                                    C36321k7.A1a(A0v, "  colorFormats");
                                    for (int hexString : codecCapabilities.colorFormats) {
                                        StringBuilder A0u2 = AnonymousClass000.A0u();
                                        A0u2.append("MediaCodecVideoDecoder    Color: 0x");
                                        C36321k7.A1a(A0u2, Integer.toHexString(hexString));
                                    }
                                }
                                String A062 = Voip.A06("vid_driver.decoder_name");
                                Integer A04 = Voip.A04("vid_driver.decoder_color_format");
                                if (A06 == null || !str2.equalsIgnoreCase(A062) || A04 == null) {
                                    i2 = 0;
                                } else {
                                    i2 = A04.intValue();
                                }
                                int[] A0H = C146526vk.A0H(str2, i2);
                                boolean isFeatureSupported = codecCapabilities.isFeatureSupported("adaptive-playback");
                                for (int i7 = 0; i7 < 13; i7++) {
                                    int i8 = A0H[i7];
                                    if (i8 != 19 || !Build.DEVICE.equals("ghost")) {
                                        for (int i9 : codecCapabilities.colorFormats) {
                                            if (i9 == i8) {
                                                StringBuilder A0u3 = AnonymousClass000.A0u();
                                                A0u3.append("MediaCodecVideoDecoder Found target decoder ");
                                                A0u3.append(str2);
                                                A0u3.append(". Color: 0x");
                                                C90504aG.A0z(i9, A0u3);
                                                C36321k7.A1X(". Adaptive Playback: ", A0u3, isFeatureSupported);
                                                if (i9 == i2) {
                                                    i3 = A0I.size();
                                                }
                                                A0I.add(new C122945vg(codecCapabilities, str2, i9, isSoftwareCodec));
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            A0k = C36331k8.A0k("MediaCodecVideoDecoder ", str2);
                            A0k.append(" is not supported. supportedCodecPrefixes are ");
                            str2 = Arrays.toString(strArr4);
                        }
                    } else {
                        A0k = C36331k8.A0k("MediaCodecVideoDecoder ", str2);
                        str2 = " is in the blacklist.";
                    }
                    A0k.append(str2);
                    C36411kG.A1P(A0k);
                }
            }
        }
        if (i3 >= 0) {
            Object obj = A0I.get(i3);
            A0I.set(i3, A0I.get(0));
            A0I.set(0, obj);
        }
        int decoderImplFromString = getDecoderImplFromString(Voip.A06("vid_rc.android_decoder_prefer_impl"));
        if (decoderImplFromString != 0) {
            ArrayList A0I2 = AnonymousClass001.A0I();
            ArrayList A0I3 = AnonymousClass001.A0I();
            Iterator it = A0I.iterator();
            while (it.hasNext()) {
                C122945vg r1 = (C122945vg) it.next();
                if (r1.A03) {
                    A0I2.add(r1);
                } else {
                    A0I3.add(r1);
                }
            }
            A0I.clear();
            if (decoderImplFromString == 1) {
                A0I.addAll(A0I2);
                A0I.addAll(A0I3);
            } else {
                A0I.addAll(A0I3);
                A0I.addAll(A0I2);
            }
        }
        if (!A0I.isEmpty()) {
            return A0I;
        }
        C36321k7.A1Q("MediaCodecVideoDecoder No HW decoder found for mime ", str3, AnonymousClass000.A0u());
        return null;
    }

    private void release() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MediaCodecVideoDecoder Java releaseDecoder ");
        A0u.append(this.codecName);
        A0u.append(". Total number of dropped frames: ");
        C36321k7.A1Y(A0u, this.droppedFrames);
        CountDownLatch A0u2 = C90484aE.A0u();
        new C19950wm(new C1498272x(A0u2, this, 16), TAG).start();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = false;
        long j = 5000;
        boolean z2 = false;
        while (true) {
            try {
                z = A0u2.await(j, TimeUnit.MILLISECONDS);
                if (z2) {
                }
            } catch (InterruptedException unused) {
                z2 = true;
                j = 5000 - C90514aH.A0J(elapsedRealtime);
                if (j <= 0) {
                    break;
                }
            }
        }
        C90484aE.A0z();
        if (!z) {
            Log.e("MediaCodecVideoDecoder Media decoder release timeout");
            codecErrors++;
        }
        this.mediaCodec = null;
        this.mediaCodecThread = null;
        runningInstance = null;
        lastReleaseTimestamp = SystemClock.uptimeMillis();
        if (this.useSurface) {
            this.surface.release();
            this.surface = null;
            throw AnonymousClass001.A0A("dispose");
        }
        Log.i("MediaCodecVideoDecoder Java releaseDecoder done");
    }

    private boolean initH264Decoder(int i, int i2, byte[] bArr, byte[] bArr2) {
        return initH264Decoder(i, i2, bArr, bArr2, false);
    }

    private boolean initH265Decoder(int i, int i2, byte[] bArr, byte[] bArr2) {
        return initH265Decoder(i, i2, bArr, bArr2, false);
    }
}
