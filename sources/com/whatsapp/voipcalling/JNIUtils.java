package com.whatsapp.voipcalling;

import X.AnonymousClass004;
import X.AnonymousClass13J;
import X.AnonymousClass13K;
import X.AnonymousClass143;
import X.AnonymousClass17Z;
import X.AnonymousClass1K2;
import X.C144796sp;
import X.C1501574e;
import X.C19420v0;
import X.C19630wG;
import X.C19730wQ;
import X.C19770wU;
import X.C19890wg;
import X.C20690y0;
import X.C20800yB;
import X.C20810yC;
import X.C20830yE;
import X.C21000yV;
import X.C21060yb;
import X.C21100yf;
import X.C236919l;
import X.C25841Hw;
import X.C27631Pa;
import X.C30531aM;
import X.C34201gc;
import X.C34681hT;
import X.C35751jC;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.os.Build;
import com.whatsapp.calling.audio.VoipSystemAudioManager;
import com.whatsapp.calling.util.VoipFaceDetector;
import com.whatsapp.jid.Jid;
import com.whatsapp.pytorch.WhatsAppDynamicPytorchLoader;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.camera.VoipCameraManager;
import java.io.File;
import java.util.Arrays;
import java.util.Map;
import org.wawebrtc.MediaCodecVideoEncoder;

public class JNIUtils {
    public static final String[] H264_BLACKLISTED_DEVICE_BOARD = {"sc7735s", "PXA19x8", "SC7727S", "sc7730s", "SC7715A", "full_oppo6750_15331", "mt6577", "hawaii", "java", "arima89_we_s_jb2", "arima82_w_s_kk", "capri", "mt6572", "P7-L10", "P7-L12"};
    public static final String[] H264_BLACKLISTED_DEVICE_HARDWARE = {"my70ds", "sc8830", "sc8830a", "samsungexynos7580"};
    public final C20810yC abProps;
    public final C144796sp bweMlModelManager;
    public final C25841Hw deviceUtils;
    public final C20690y0 fMessageIO;
    public final AnonymousClass004 isPartialLandscapeModeSupported;
    public final AnonymousClass004 isVideoRotationSupportedProvider;
    public final C19730wQ meManager;
    public final C236919l multiDeviceConfig;
    public int previousAudioSessionId = -1;
    public final C21100yf serverProps;
    public final C19890wg sharedPreferencesFactory;
    public final AnonymousClass13J systemFeatures;
    public final C21060yb systemServices;
    public final VoipCameraManager voipCameraManager;
    public final C30531aM voipNative;
    public final C27631Pa voipSharedPreferences;
    public final VoipSystemAudioManager voipSystemAudioManager;
    public final C19630wG waContext;
    public final AnonymousClass17Z waDebugBuildSharedPreferences;
    public final C20830yE waPermissionsHelper;
    public final C19420v0 waSharedPreferences;
    public final C19770wU waWorkers;

    public static int getSamplingHash(int i, int[] iArr, int i2, int i3) {
        int length = iArr.length;
        int[] iArr2 = new int[(length + 4)];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        iArr2[length] = i2;
        iArr2[length + 1] = i;
        iArr2[length + 2] = Build.VERSION.SDK_INT;
        iArr2[length + 3] = i3;
        return Arrays.hashCode(iArr2);
    }

    private boolean isH265SwCodecSupported() {
        return false;
    }

    private synchronized H26xSupportResult isH26XCodecSupported() {
        return new H26xSupportResult(isH264HwCodecSupported(), true, MediaCodecVideoEncoder.isH265HwSupported(), false);
    }

    public synchronized String getBweMLModelPath(String str) {
        String str2;
        C144796sp r3 = this.bweMlModelManager;
        Map map = C144796sp.A20;
        if (!map.containsKey(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append("BweMLModelManager/getBweMlModelPath/BWE ML model version not supported: ");
            sb.append(str);
            Log.e(sb.toString());
            str2 = null;
        } else {
            Integer A04 = Voip.A04("vid_rc.cc_ml_pytorch_load_mode");
            WhatsAppDynamicPytorchLoader whatsAppDynamicPytorchLoader = r3.A02;
            if (!whatsAppDynamicPytorchLoader.A01 && A04 != null) {
                int intValue = A04.intValue();
                if (intValue == 2) {
                    whatsAppDynamicPytorchLoader.A00();
                } else if (intValue == 3) {
                    r3.A03.Boy(new C1501574e(r3, 48));
                }
            }
            str2 = r3.A01.A00("wa_bwe_pl_classifier_mobile", ((Integer) map.get(str)).intValue());
        }
        return str2;
    }

    public int getCallAdminVersion() {
        return 1;
    }

    public boolean getCallLinkIsRemovable() {
        return true;
    }

    public int getNativeSamplingRate() {
        int i;
        String property;
        try {
            int i2 = C27631Pa.A00(this.voipSharedPreferences).getInt("audio_native_sampling_rate", -1);
            if (i2 >= 8000 && i2 <= 96000) {
                return i2;
            }
            AudioManager A0D = this.systemServices.A0D();
            if (A0D == null || (property = A0D.getProperty("android.media.property.OUTPUT_SAMPLE_RATE")) == null) {
                i = -1;
            } else {
                i = Integer.valueOf(property).intValue();
            }
            C27631Pa.A00(this.voipSharedPreferences).edit().putInt("audio_native_sampling_rate", i).apply();
            return i;
        } catch (Throwable th) {
            Log.e(th);
            return !is48kHzAudioEnabled() ? 44100 : -1;
        }
    }

    public synchronized H26xSupportResult isH26XCodecSupportedFromCache() {
        H26xSupportResult h26xSupportResult;
        SharedPreferences A00 = C27631Pa.A00(this.voipSharedPreferences);
        if (!A00.contains("video_codec_h264_hw_supported") || !A00.contains("video_codec_h264_sw_supported") || !A00.contains("video_codec_h265_hw_supported") || !A00.contains("video_codec_h265_sw_supported")) {
            h26xSupportResult = null;
        } else {
            h26xSupportResult = new H26xSupportResult(A00.getBoolean("video_codec_h264_hw_supported", false), A00.getBoolean("video_codec_h264_sw_supported", false), A00.getBoolean("video_codec_h265_hw_supported", false), A00.getBoolean("video_codec_h265_sw_supported", false));
        }
        return h26xSupportResult;
    }

    public synchronized void updateH26XCodecSupported(boolean z) {
        if (z) {
            this.waWorkers.Boy(new C35751jC(this, 13));
        } else {
            this.voipSharedPreferences.A05(isH26XCodecSupported());
        }
    }

    public void uploadCrashLog(String str) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:131:0x035c, code lost:
        if (r2 > 0) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0366, code lost:
        if (r12 > 64000) goto L_0x0368;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0247, code lost:
        if (r16 == null) goto L_0x0274;
     */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02cf  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02ef  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0309  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0329  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0338 A[EDGE_INSN: B:142:0x0338->B:125:0x0338 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x036b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x016a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int[] findAvailableAudioSamplingRate(int[] r30, int r31, int r32) {
        /*
            r29 = this;
            java.lang.String r22 = ", audio source "
            java.lang.String r21 = ", buffer size "
            java.lang.String r20 = " works"
            java.lang.String r19 = " doesn't work"
            java.lang.String r15 = "voip/findAvailableAudioSamplingRate/sampling rate "
            r11 = r30
            int r4 = r11.length
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r4)
            r6 = 1
            int[] r3 = new int[r6]
            r0 = 16000(0x3e80, float:2.2421E-41)
            r1 = 0
            r3[r1] = r0
            r8 = r29
            X.0yE r0 = r8.waPermissionsHelper
            boolean r5 = r0.A0C()
            r0 = 64000(0xfa00, float:8.9683E-41)
            r2 = 8000(0x1f40, float:1.121E-41)
            r12 = r32
            if (r5 != 0) goto L_0x0042
            if (r12 < r2) goto L_0x0034
            if (r12 > r0) goto L_0x0034
            int[] r2 = new int[r6]
            r2[r1] = r32
            return r2
        L_0x0034:
            boolean r0 = r8.is48kHzAudioEnabled()
            if (r0 != 0) goto L_0x011a
            int[] r2 = new int[r6]
            r0 = 44100(0xac44, float:6.1797E-41)
            r2[r1] = r0
            return r2
        L_0x0042:
            r0 = 4
            r10 = r31
            int r7 = getSamplingHash(r0, r11, r10, r12)
            X.1Pa r0 = r8.voipSharedPreferences
            android.content.SharedPreferences r5 = X.C27631Pa.A00(r0)
            java.lang.String r6 = "audio_sampling_hash"
            r0 = -1
            int r0 = r5.getInt(r6, r0)
            if (r7 != r0) goto L_0x00a2
            X.1Pa r0 = r8.voipSharedPreferences
            android.content.SharedPreferences r13 = X.C27631Pa.A00(r0)
            java.lang.String r5 = "audio_sampling_rates"
            java.lang.String r0 = ""
            java.lang.String r13 = r13.getString(r5, r0)
            r14 = 0
            int[] r5 = new int[r1]
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 != 0) goto L_0x009e
            int r1 = r13.length()
            r0 = 2
            if (r1 <= r0) goto L_0x009e
            r0 = 1
            int r1 = r1 - r0
            java.lang.String r1 = r13.substring(r0, r1)
            java.lang.String r0 = ","
            java.lang.String[] r13 = r1.split(r0)
            int r1 = r13.length
            int[] r0 = new int[r1]
        L_0x0085:
            if (r14 >= r1) goto L_0x009d
            r16 = r13[r14]     // Catch:{ NumberFormatException -> 0x0096 }
            java.lang.String r16 = r16.trim()     // Catch:{ NumberFormatException -> 0x0096 }
            int r16 = java.lang.Integer.parseInt(r16)     // Catch:{ NumberFormatException -> 0x0096 }
            r0[r14] = r16     // Catch:{ NumberFormatException -> 0x0096 }
            int r14 = r14 + 1
            goto L_0x0085
        L_0x0096:
            r1 = move-exception
            java.lang.String r0 = "voip/VoipSharedPrefs/ "
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x009e
        L_0x009d:
            r5 = r0
        L_0x009e:
            int r0 = r5.length
            if (r0 != r10) goto L_0x00a2
            return r5
        L_0x00a2:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r4)
            r0 = -1
            if (r12 != r0) goto L_0x0360
            int r2 = r8.getNativeSamplingRate()
        L_0x00ae:
            if (r2 <= 0) goto L_0x00d3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "sampling rate server setting("
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = ") : "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r5.add(r0)
        L_0x00d3:
            boolean r0 = r8.is48kHzAudioEnabled()
            if (r0 == 0) goto L_0x011b
            r0 = 48000(0xbb80, float:6.7262E-41)
            if (r2 == r0) goto L_0x011b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "preferred sampling rate is "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x00f2:
            X.1Pa r0 = r8.voipSharedPreferences
            android.content.SharedPreferences r0 = X.C27631Pa.A00(r0)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.putInt(r6, r7)
            r0.apply()
            X.1Pa r0 = r8.voipSharedPreferences
            android.content.SharedPreferences r0 = X.C27631Pa.A00(r0)
            android.content.SharedPreferences$Editor r2 = r0.edit()
            java.lang.String r1 = java.util.Arrays.toString(r3)
            java.lang.String r0 = "audio_sampling_rates"
            android.content.SharedPreferences$Editor r0 = r2.putString(r0, r1)
            r0.apply()
        L_0x011a:
            return r3
        L_0x011b:
            r2 = 0
        L_0x011c:
            if (r2 >= r4) goto L_0x0134
            r1 = r30[r2]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            boolean r0 = r5.contains(r0)
            if (r0 != 0) goto L_0x0131
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r5.add(r0)
        L_0x0131:
            int r2 = r2 + 1
            goto L_0x011c
        L_0x0134:
            r4 = 4
            int[] r3 = new int[r4]
            r3 = {0, 1, 4, 5} // fill-array
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0 = 7
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.add(r0)
            r1 = 0
        L_0x0148:
            if (r1 >= r4) goto L_0x0156
            r0 = r3[r1]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.add(r0)
            int r1 = r1 + 1
            goto L_0x0148
        L_0x0156:
            java.util.Iterator r18 = r2.iterator()
        L_0x015a:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x0338
            java.lang.Object r4 = r18.next()
            java.lang.Number r4 = (java.lang.Number) r4
            java.util.Iterator r17 = r5.iterator()
        L_0x016a:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x0332
            java.lang.Object r3 = r17.next()
            java.lang.Number r3 = (java.lang.Number) r3
            int r2 = r3.intValue()
            r1 = 16
            r0 = 2
            int r1 = android.media.AudioRecord.getMinBufferSize(r2, r1, r0)     // Catch:{ IllegalArgumentException -> 0x02b2, all -> 0x02bd }
            r0 = -2
            if (r1 == r0) goto L_0x0299
            int r24 = r4.intValue()     // Catch:{ IllegalArgumentException -> 0x02b0, all -> 0x02ae }
            r26 = 16
            int r28 = r1 * 2
            android.media.AudioRecord r23 = new android.media.AudioRecord     // Catch:{ IllegalArgumentException -> 0x02b0, all -> 0x02ae }
            r27 = 2
            r25 = r2
            r23.<init>(r24, r25, r26, r27, r28)     // Catch:{ IllegalArgumentException -> 0x02b0, all -> 0x02ae }
            int r11 = r23.getState()     // Catch:{ IllegalArgumentException -> 0x02b0, all -> 0x02ae }
            r0 = 1
            if (r11 != r0) goto L_0x0280
            int r12 = r23.getAudioSessionId()     // Catch:{ all -> 0x0270 }
            r8.previousAudioSessionId = r12     // Catch:{ all -> 0x0270 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0270 }
            r11.<init>()     // Catch:{ all -> 0x0270 }
            java.lang.String r0 = "voip/findAvailableAudioSamplingRate/ recorder session id "
            r11.append(r0)     // Catch:{ all -> 0x0270 }
            r11.append(r12)     // Catch:{ all -> 0x0270 }
            java.lang.String r0 = r11.toString()     // Catch:{ all -> 0x0270 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0270 }
            X.1Pa r0 = r8.voipSharedPreferences     // Catch:{ all -> 0x0270 }
            r24 = r0
            int r13 = r8.previousAudioSessionId     // Catch:{ all -> 0x0270 }
            android.content.SharedPreferences r0 = X.C27631Pa.A00(r24)     // Catch:{ all -> 0x0270 }
            java.lang.String r14 = "aec_os_version"
            r12 = 0
            java.lang.String r11 = r0.getString(r14, r12)     // Catch:{ all -> 0x0270 }
            java.lang.String r0 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x0270 }
            boolean r11 = r0.equals(r11)     // Catch:{ all -> 0x0270 }
            if (r11 != 0) goto L_0x0274
            boolean r11 = com.whatsapp.voipcalling.Voip.A07()     // Catch:{ all -> 0x0270 }
            r16 = 0
            if (r11 == 0) goto L_0x0254
            android.media.audiofx.AcousticEchoCanceler r16 = android.media.audiofx.AcousticEchoCanceler.create(r13)     // Catch:{ all -> 0x0243 }
            if (r16 == 0) goto L_0x0274
            android.media.audiofx.AudioEffect$Descriptor r11 = r16.getDescriptor()     // Catch:{ all -> 0x0243 }
            if (r11 == 0) goto L_0x0249
            java.util.UUID r13 = r11.uuid     // Catch:{ all -> 0x0243 }
            if (r13 == 0) goto L_0x0249
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0243 }
            r12.<init>()     // Catch:{ all -> 0x0243 }
            java.lang.String r0 = "voip/AcousticEchoCanceler implementor:"
            r12.append(r0)     // Catch:{ all -> 0x0243 }
            java.lang.String r0 = r11.implementor     // Catch:{ all -> 0x0243 }
            r12.append(r0)     // Catch:{ all -> 0x0243 }
            java.lang.String r0 = " uuid:"
            r12.append(r0)     // Catch:{ all -> 0x0243 }
            r12.append(r13)     // Catch:{ all -> 0x0243 }
            java.lang.String r0 = " enabled:"
            r12.append(r0)     // Catch:{ all -> 0x0243 }
            boolean r0 = r16.getEnabled()     // Catch:{ all -> 0x0243 }
            r12.append(r0)     // Catch:{ all -> 0x0243 }
            java.lang.String r0 = " hasControl:"
            r12.append(r0)     // Catch:{ all -> 0x0243 }
            boolean r0 = r16.hasControl()     // Catch:{ all -> 0x0243 }
            r12.append(r0)     // Catch:{ all -> 0x0243 }
            java.lang.String r0 = r12.toString()     // Catch:{ all -> 0x0243 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0243 }
            java.lang.String r13 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x0243 }
            java.util.UUID r0 = r11.uuid     // Catch:{ all -> 0x0243 }
            java.lang.String r12 = r0.toString()     // Catch:{ all -> 0x0243 }
            java.lang.String r11 = r11.implementor     // Catch:{ all -> 0x0243 }
            android.content.SharedPreferences r0 = X.C27631Pa.A00(r24)     // Catch:{ all -> 0x0243 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x0243 }
            android.content.SharedPreferences$Editor r13 = r0.putString(r14, r13)     // Catch:{ all -> 0x0243 }
            java.lang.String r0 = "aec_uuid"
            android.content.SharedPreferences$Editor r12 = r13.putString(r0, r12)     // Catch:{ all -> 0x0243 }
            java.lang.String r0 = "aec_implementor"
            android.content.SharedPreferences$Editor r0 = r12.putString(r0, r11)     // Catch:{ all -> 0x0243 }
            r0.apply()     // Catch:{ all -> 0x0243 }
            goto L_0x0249
        L_0x0243:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x024d }
            if (r16 == 0) goto L_0x0274
        L_0x0249:
            r16.release()     // Catch:{ all -> 0x0270 }
            goto L_0x0274
        L_0x024d:
            r0 = move-exception
            if (r16 == 0) goto L_0x0253
            r16.release()     // Catch:{ all -> 0x0270 }
        L_0x0253:
            throw r0     // Catch:{ all -> 0x0270 }
        L_0x0254:
            android.content.SharedPreferences r11 = X.C27631Pa.A00(r24)     // Catch:{ all -> 0x0270 }
            android.content.SharedPreferences$Editor r11 = r11.edit()     // Catch:{ all -> 0x0270 }
            android.content.SharedPreferences$Editor r11 = r11.putString(r14, r0)     // Catch:{ all -> 0x0270 }
            java.lang.String r0 = "aec_uuid"
            android.content.SharedPreferences$Editor r11 = r11.putString(r0, r12)     // Catch:{ all -> 0x0270 }
            java.lang.String r0 = "aec_implementor"
            android.content.SharedPreferences$Editor r0 = r11.putString(r0, r12)     // Catch:{ all -> 0x0270 }
            r0.apply()     // Catch:{ all -> 0x0270 }
            goto L_0x0274
        L_0x0270:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ IllegalArgumentException -> 0x027d, all -> 0x027a }
        L_0x0274:
            r23.release()     // Catch:{ IllegalArgumentException -> 0x027d, all -> 0x027a }
            r13 = 1
            goto L_0x02fa
        L_0x027a:
            r12 = move-exception
            r13 = 1
            goto L_0x02c0
        L_0x027d:
            r11 = move-exception
            r13 = 1
            goto L_0x02b5
        L_0x0280:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x02b0, all -> 0x02ae }
            r11.<init>()     // Catch:{ IllegalArgumentException -> 0x02b0, all -> 0x02ae }
            java.lang.String r0 = "voip/findAvailableAudioSamplingRate/ Recorder state "
            r11.append(r0)     // Catch:{ IllegalArgumentException -> 0x02b0, all -> 0x02ae }
            int r0 = r23.getState()     // Catch:{ IllegalArgumentException -> 0x02b0, all -> 0x02ae }
            r11.append(r0)     // Catch:{ IllegalArgumentException -> 0x02b0, all -> 0x02ae }
            java.lang.String r0 = r11.toString()     // Catch:{ IllegalArgumentException -> 0x02b0, all -> 0x02ae }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ IllegalArgumentException -> 0x02b0, all -> 0x02ae }
            goto L_0x02f9
        L_0x0299:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x02b0, all -> 0x02ae }
            r11.<init>()     // Catch:{ IllegalArgumentException -> 0x02b0, all -> 0x02ae }
            java.lang.String r0 = "voip/findAvailableAudioSamplingRate/ can not find min buffer size for rate "
            r11.append(r0)     // Catch:{ IllegalArgumentException -> 0x02b0, all -> 0x02ae }
            r11.append(r2)     // Catch:{ IllegalArgumentException -> 0x02b0, all -> 0x02ae }
            java.lang.String r0 = r11.toString()     // Catch:{ IllegalArgumentException -> 0x02b0, all -> 0x02ae }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ IllegalArgumentException -> 0x02b0, all -> 0x02ae }
            goto L_0x02f9
        L_0x02ae:
            r12 = move-exception
            goto L_0x02bf
        L_0x02b0:
            r11 = move-exception
            goto L_0x02b4
        L_0x02b2:
            r11 = move-exception
            r1 = 0
        L_0x02b4:
            r13 = 0
        L_0x02b5:
            java.lang.String r0 = "voip/findAvailableAudioSamplingRate/ "
            com.whatsapp.util.Log.e(r0, r11)     // Catch:{ all -> 0x02bb }
            goto L_0x02fa
        L_0x02bb:
            r12 = move-exception
            goto L_0x02c0
        L_0x02bd:
            r12 = move-exception
            r1 = 0
        L_0x02bf:
            r13 = 0
        L_0x02c0:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r15)
            r11.append(r2)
            r0 = r19
            if (r13 == 0) goto L_0x02d1
            r0 = r20
        L_0x02d1:
            r11.append(r0)
            r0 = r21
            r11.append(r0)
            int r0 = r1 * 2
            r11.append(r0)
            r0 = r22
            r11.append(r0)
            r11.append(r4)
            java.lang.String r0 = r11.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r13 == 0) goto L_0x036b
            r9.add(r3)
            int r0 = r9.size()
            if (r0 < r10) goto L_0x036b
            goto L_0x0332
        L_0x02f9:
            r13 = 0
        L_0x02fa:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r15)
            r11.append(r2)
            r0 = r19
            if (r13 == 0) goto L_0x030b
            r0 = r20
        L_0x030b:
            r11.append(r0)
            r0 = r21
            r11.append(r0)
            int r0 = r1 * 2
            r11.append(r0)
            r0 = r22
            r11.append(r0)
            r11.append(r4)
            java.lang.String r0 = r11.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r13 == 0) goto L_0x016a
            r9.add(r3)
            int r0 = r9.size()
            if (r0 < r10) goto L_0x016a
        L_0x0332:
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x015a
        L_0x0338:
            java.util.Collections.sort(r9)
            int r2 = r9.size()
            int[] r3 = new int[r2]
            r1 = 0
        L_0x0342:
            if (r1 >= r2) goto L_0x0353
            java.lang.Object r0 = r9.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r3[r1] = r0
            int r1 = r1 + 1
            goto L_0x0342
        L_0x0353:
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x035c
            r0 = -1
            r8.previousAudioSessionId = r0
        L_0x035c:
            if (r2 <= 0) goto L_0x011a
            goto L_0x00f2
        L_0x0360:
            if (r12 < r2) goto L_0x0368
            r0 = 64000(0xfa00, float:8.9683E-41)
            r2 = r12
            if (r12 <= r0) goto L_0x00ae
        L_0x0368:
            r2 = 0
            goto L_0x00ae
        L_0x036b:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.JNIUtils.findAvailableAudioSamplingRate(int[], int, int):int[]");
    }

    public boolean allowAlternativeNetworkForAudioCall() {
        if (((SharedPreferences) this.waSharedPreferences.A00.get()).getBoolean("voip_low_data_usage", false) || this.waSharedPreferences.A05() == 0) {
            return false;
        }
        return true;
    }

    public boolean allowAlternativeNetworkForVideoCall() {
        if (((SharedPreferences) this.waSharedPreferences.A00.get()).getBoolean("voip_low_data_usage", false) || (this.waSharedPreferences.A05() & 4) == 0) {
            return false;
        }
        return true;
    }

    public VoipFaceDetector createVoipFaceDetector(int i, boolean z) {
        if (C34201gc.A00(this.waContext.A00) == 0) {
            return VoipFaceDetector.create(this.waContext.A00, i, z);
        }
        return null;
    }

    public boolean disallowAllP2P() {
        return C27631Pa.A00(this.voipSharedPreferences).getBoolean("privacy_always_relay", false);
    }

    public boolean enableOrientationScaleTypeChanges() {
        if (C20800yB.A00(C21000yV.A02, this.abProps, 3153) > 0) {
            return true;
        }
        return false;
    }

    public boolean getAlwaysEnabledOrientationScaleTypeChanges() {
        return C20800yB.A01(C21000yV.A02, this.abProps, 3975);
    }

    public int getAudioLevelSpeakingThreshold() {
        return Math.min(C20800yB.A00(C21000yV.A02, this.abProps, 1213), 127);
    }

    public boolean getBoolValueByCode(int i) {
        return this.abProps.A0E(i);
    }

    public int getCallAudioShareVersion() {
        return C20800yB.A00(C21000yV.A02, ((AnonymousClass13K) this.systemFeatures).A02, 6598);
    }

    public int getCallOfferRedialStatsVersion() {
        return C20800yB.A00(C21000yV.A02, this.abProps, 6709);
    }

    public int getCalleeOfferPeekTimeoutMs() {
        return C20800yB.A00(C21000yV.A02, this.abProps, 5090);
    }

    public int getCallingLidVersion() {
        return C20800yB.A00(C21000yV.A02, this.abProps, 3358);
    }

    public int getCapiCallingAlphaVersion() {
        return C20800yB.A00(C21000yV.A02, this.abProps, 4067);
    }

    public String getDebugDirectory() {
        this.fMessageIO.A08();
        return this.waContext.A00.getFilesDir().getAbsolutePath();
    }

    public boolean getDebugVoipRecordDecoderVideo() {
        AnonymousClass17Z r0 = AnonymousClass17Z.$redex_init_class;
        return false;
    }

    public boolean getDebugVoipRecordEncoderVideo() {
        AnonymousClass17Z r0 = AnonymousClass17Z.$redex_init_class;
        return false;
    }

    public boolean getDebugVoipRecordPreprocessedCaptureVideo() {
        AnonymousClass17Z r0 = AnonymousClass17Z.$redex_init_class;
        return false;
    }

    public boolean getDebugVoipRecordRawCaptureVideo() {
        AnonymousClass17Z r0 = AnonymousClass17Z.$redex_init_class;
        return false;
    }

    public boolean getDebugVoipRecordRawRenderVideo() {
        AnonymousClass17Z r0 = AnonymousClass17Z.$redex_init_class;
        return false;
    }

    public int getDisableReconnectingToneConnectedParticipantThreshold() {
        return C20800yB.A00(C21000yV.A02, this.abProps, 4211);
    }

    public boolean getEnableCallSummaryAndDuration() {
        return C20800yB.A01(C21000yV.A02, this.abProps, 5579);
    }

    public boolean getEnableJoinAndAcceptOngoingCall() {
        return C20800yB.A01(C21000yV.A02, this.abProps, 5570);
    }

    public boolean getEnablePeekOfferCallIdCache() {
        return C20800yB.A01(C21000yV.A02, this.abProps, 5323);
    }

    public float getFloatValueByCode(int i) {
        return this.abProps.A05(i);
    }

    public int getGroupCallBufferParticipantThreshold() {
        return C20800yB.A00(C21000yV.A02, this.abProps, 2251);
    }

    public int getGroupCallBufferProcessDelay() {
        return C20800yB.A00(C21000yV.A02, this.abProps, 1092);
    }

    public int getHeartbeatIntervalS() {
        return C20800yB.A00(C21000yV.A02, this.abProps, 1430);
    }

    public int getHeartbeatLonelyStateIntervalS() {
        return C20800yB.A00(C21000yV.A02, this.abProps, 5486);
    }

    public int getIntValueByCode(int i) {
        return this.abProps.A07(i);
    }

    public int getLandscapeModeVariant() {
        return C20800yB.A00(C21000yV.A02, this.abProps, 3976);
    }

    public int getLightWeightCallingVersion() {
        if (this.meManager.A0L()) {
            return 0;
        }
        return C20800yB.A00(C21000yV.A02, this.abProps, 3362);
    }

    public int getLobbyTimeoutMin() {
        return C20800yB.A00(C21000yV.A02, this.abProps, 1565);
    }

    public int getMaxGroupSizeForLongRingtone() {
        return C20800yB.A00(C21000yV.A02, this.abProps, 4710);
    }

    public int getMaxNumParticipantsForScreenSharing() {
        return C20800yB.A00(C21000yV.A02, this.abProps, 3694);
    }

    public int getOibweSlowPolling() {
        return C20800yB.A00(C21000yV.A02, this.abProps, 4382);
    }

    public int getScreenShareOptions() {
        return C20800yB.A00(C21000yV.A02, this.abProps, 4218);
    }

    public int getScreenShareVersion() {
        return C20800yB.A00(C21000yV.A02, this.abProps, 3171);
    }

    public int getSecurityFixesBitmap() {
        return C20800yB.A00(C21000yV.A02, this.abProps, 3094);
    }

    public String getSelfJid() {
        Jid jid;
        boolean A0L = this.meManager.A0L();
        C19730wQ r0 = this.meManager;
        if (A0L) {
            r0.A0G();
            jid = r0.A02;
        } else {
            r0.A0G();
            jid = r0.A03;
        }
        return AnonymousClass143.A03(jid);
    }

    public String getSelfLidJid() {
        Jid A08;
        boolean A0L = this.meManager.A0L();
        C19730wQ r0 = this.meManager;
        if (A0L) {
            A08 = r0.A07();
        } else {
            A08 = r0.A08();
        }
        return AnonymousClass143.A03(A08);
    }

    public int getSignalingLatencySettings() {
        return C20800yB.A00(C21000yV.A02, this.abProps, 5408);
    }

    public String getStringValueByCode(int i) {
        return this.abProps.A09(i);
    }

    public final String getTimeSeriesDirectory() {
        File A05 = C34681hT.A05(this.waContext.A00);
        if (A05 != null) {
            return A05.getAbsolutePath();
        }
        Log.e("getTimeSeriesDirectory base time series directory is null");
        return "";
    }

    public boolean getUnifyEndCallEvents() {
        return C20800yB.A01(C21000yV.A02, this.abProps, 2856);
    }

    public int getUpdateSpeakerStatusIntervalMs() {
        return C20800yB.A00(C21000yV.A02, this.abProps, 1106);
    }

    public int getVidStreamPauseResumeJbResetThreshold() {
        return C20800yB.A00(C21000yV.A02, this.abProps, 2642);
    }

    public int getVoiceChatRingAllMaxGroupSize() {
        return C20800yB.A00(C21000yV.A02, this.abProps, 4716);
    }

    public final String getVoipCacheDirectory() {
        String str;
        File cacheDir = this.waContext.A00.getCacheDir();
        if (cacheDir != null) {
            File file = new File(cacheDir, "voip");
            if (file.exists() || file.mkdirs()) {
                return file.getAbsolutePath();
            }
            str = "getVoipCacheDirectory could not init directory";
        } else {
            str = "getVoipCacheDirectory Cache Directory is null";
        }
        Log.e(str);
        return "";
    }

    public int getYearClass() {
        return AnonymousClass1K2.A02(this.systemServices, this.sharedPreferencesFactory);
    }

    public MediaCodecVideoEncoder initMediaCodecVideoEncoder() {
        return new MediaCodecVideoEncoder(this.voipSharedPreferences);
    }

    public boolean is48kHzAudioEnabled() {
        return C20800yB.A01(C21000yV.A02, this.abProps, 7255);
    }

    public boolean isAddParticipantWhileCallingSenderEnabled() {
        return C20800yB.A01(C21000yV.A02, this.abProps, 5088);
    }

    public boolean isAudioOnlyVideoCallsEnabled() {
        return !this.systemFeatures.BJo();
    }

    public boolean isCallStateMachineEnabled() {
        return C20800yB.A01(C21000yV.A02, this.abProps, 4249);
    }

    public boolean isFixedVideoOrientationEnabled() {
        return ((Boolean) this.isVideoRotationSupportedProvider.get()).booleanValue();
    }

    public boolean isGroupCallBufferEnabled() {
        return C20800yB.A01(C21000yV.A02, this.abProps, 1039);
    }

    public boolean isInitBweForGroupCallEnabled() {
        return C20800yB.A01(C21000yV.A02, this.abProps, 2601);
    }

    public boolean isLowDataUsageEnabled() {
        return ((SharedPreferences) this.waSharedPreferences.A00.get()).getBoolean("voip_low_data_usage", false);
    }

    public boolean isMuteParticipantEnabled() {
        return C20800yB.A01(C21000yV.A02, this.abProps, 1111);
    }

    public boolean isReportCallRepalyerIdAllowed() {
        return C20800yB.A01(C21000yV.A02, this.abProps, 1834);
    }

    public boolean isScheduledCallEnabled() {
        return C34681hT.A0M(this.abProps);
    }

    public boolean isSilentOfferEnabled() {
        return C20800yB.A01(C21000yV.A02, this.abProps, 3235);
    }

    public boolean isVidQualityManagerEnabled() {
        return C27631Pa.A00(this.voipSharedPreferences).getBoolean("enable_vid_quality_manager", false);
    }

    public boolean isVideoConverterMemoryLeakFixEnabled() {
        return C20800yB.A01(C21000yV.A02, this.voipSharedPreferences.A01, MediaCodecVideoEncoder.MIN_ENCODER_WIDTH);
    }

    public boolean isVideoRotationEnabled() {
        if (!((Boolean) this.isVideoRotationSupportedProvider.get()).booleanValue()) {
            if (!((Boolean) this.isPartialLandscapeModeSupported.get()).booleanValue()) {
                return false;
            }
            if (C20800yB.A00(C21000yV.A02, this.abProps, 3976) == 1) {
                return true;
            }
            return false;
        }
        return true;
    }

    public boolean isVoipStanzaSmaxationEnabled() {
        return C20800yB.A01(C21000yV.A02, this.abProps, 1520);
    }

    public boolean isWamCallExtendedEnabled() {
        return C20800yB.A01(C21000yV.A02, this.abProps, 1939);
    }

    /* renamed from: lambda$updateH26XCodecSupported$0$com-whatsapp-voipcalling-JNIUtils  reason: not valid java name */
    public /* synthetic */ void m6lambda$updateH26XCodecSupported$0$comwhatsappvoipcallingJNIUtils() {
        this.voipSharedPreferences.A05(isH26XCodecSupported());
    }

    public boolean shouldRemoveGroupInfoFromGroupCallExtensionOffer() {
        return C20800yB.A01(C21000yV.A02, this.abProps, 4899);
    }

    public JNIUtils(C20810yC r2, C19730wQ r3, C19630wG r4, C19770wU r5, C20690y0 r6, C30531aM r7, C21100yf r8, C25841Hw r9, C21060yb r10, AnonymousClass13J r11, C144796sp r12, C236919l r13, VoipCameraManager voipCameraManager2, VoipSystemAudioManager voipSystemAudioManager2, C20830yE r16, C19420v0 r17, C27631Pa r18, C19890wg r19, AnonymousClass17Z r20, AnonymousClass004 r21, AnonymousClass004 r22) {
        this.abProps = r2;
        this.meManager = r3;
        this.waContext = r4;
        this.waWorkers = r5;
        this.fMessageIO = r6;
        this.voipNative = r7;
        this.serverProps = r8;
        this.deviceUtils = r9;
        this.systemServices = r10;
        this.systemFeatures = r11;
        this.bweMlModelManager = r12;
        this.multiDeviceConfig = r13;
        this.voipCameraManager = voipCameraManager2;
        this.voipSystemAudioManager = voipSystemAudioManager2;
        this.waPermissionsHelper = r16;
        this.waSharedPreferences = r17;
        this.voipSharedPreferences = r18;
        this.sharedPreferencesFactory = r19;
        this.waDebugBuildSharedPreferences = r20;
        this.isPartialLandscapeModeSupported = r21;
        this.isVideoRotationSupportedProvider = r22;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        if (r1.equalsIgnoreCase("jfvelte") == false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean isH264HwCodecSupported() {
        /*
            r6 = this;
            boolean r0 = X.AnonymousClass6YG.A03()
            r5 = 0
            if (r0 != 0) goto L_0x0023
            java.lang.String r1 = android.os.Build.VERSION.RELEASE
            java.lang.String r0 = "5.0.1"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0024
            java.lang.String r1 = android.os.Build.DEVICE
            java.lang.String r0 = "jflte"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0023
            java.lang.String r0 = "jfvelte"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0024
        L_0x0023:
            return r5
        L_0x0024:
            java.lang.String[] r4 = H264_BLACKLISTED_DEVICE_BOARD
            int r3 = r4.length
            r2 = 0
        L_0x0028:
            if (r2 >= r3) goto L_0x0037
            r1 = r4[r2]
            java.lang.String r0 = android.os.Build.BOARD
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x0023
            int r2 = r2 + 1
            goto L_0x0028
        L_0x0037:
            java.lang.String[] r4 = H264_BLACKLISTED_DEVICE_HARDWARE
            int r3 = r4.length
            r2 = 0
        L_0x003b:
            if (r2 >= r3) goto L_0x004a
            r1 = r4[r2]
            java.lang.String r0 = android.os.Build.HARDWARE
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x0023
            int r2 = r2 + 1
            goto L_0x003b
        L_0x004a:
            java.lang.Boolean r0 = X.C18750th.A03
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.JNIUtils.isH264HwCodecSupported():boolean");
    }

    private boolean isH265HwCodecSupported() {
        return MediaCodecVideoEncoder.isH265HwSupported();
    }

    public boolean getOverrideIpConfigPreferIpv6() {
        return false;
    }

    public VoipCameraManager getVoipCameraManager() {
        return this.voipCameraManager;
    }

    public VoipSystemAudioManager getVoipSystemAudioManager() {
        return this.voipSystemAudioManager;
    }

    public synchronized int[] findAvailableAudioSamplingRate(int i) {
        int[] iArr;
        int[] iArr2 = {16000, 48000, 44100, 22050, 8000, 11025, 32000, 24000, 12000};
        if (is48kHzAudioEnabled()) {
            iArr = findAvailableAudioSamplingRate(new int[]{16000, 48000}, 2, -1);
        } else {
            iArr = findAvailableAudioSamplingRate(iArr2, 2, i);
        }
        return iArr;
    }
}
