package X;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6Xb  reason: invalid class name */
public class AnonymousClass6Xb {
    public static final Set A01;
    public static final List A02;
    public static final Map A03;
    public static final Set A04;
    public static final Set A05;
    public static final Set A06;
    public AnonymousClass6IG A00 = AnonymousClass6IG.A00;

    public static C128986Em A01(MediaCodec mediaCodec, MediaFormat mediaFormat, Surface surface) {
        MediaCodec mediaCodec2 = mediaCodec;
        if (mediaCodec.getName().equals("OMX.Exynos.avc.dec") && Build.VERSION.SDK_INT >= 31) {
            mediaFormat.removeKey("color-range");
        }
        Class<AnonymousClass6Xb> cls = AnonymousClass6Xb.class;
        try {
            String name = mediaCodec.getName();
            if (AnonymousClass6YR.A01.BMH(3)) {
                AnonymousClass6YR.A00(cls, StringFormatUtil.formatStrLocaleSafe("config video decoder (%s) with format: %s", name, mediaFormat));
            }
            String str = null;
            boolean z = false;
            mediaCodec2.configure(mediaFormat, surface, (MediaCrypto) null, 0);
            try {
                Locale locale = Locale.US;
                Object[] A0M = AnonymousClass001.A0M();
                A0M[0] = A04(mediaCodec2, mediaFormat);
                A0M[1] = mediaFormat;
                str = String.format(locale, "media codec:%s, format:%s", A0M);
            } catch (Throwable unused) {
            }
            if (surface != null) {
                z = true;
            }
            return new C128986Em(mediaCodec2, (Surface) null, C023109s.A00, str, z);
        } catch (IllegalStateException e) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("codec name:");
            throw new IllegalStateException(AnonymousClass000.A0q(mediaCodec2.getName(), A0u), e);
        }
    }

    public static C128986Em A02(MediaFormat mediaFormat, C107835Rb r13, String str, String str2) {
        String str3;
        String str4;
        if (str.equals(C108365Tf.CODEC_VIDEO_H264.value) || str.equals(C108365Tf.CODEC_VIDEO_HEVC.value) || str.equals(C108365Tf.CODEC_VIDEO_AV1.value) || str.equals(C108365Tf.CODEC_AUDIO_AAC.value) || str.equals(C108365Tf.CODEC_ANDROID_AUDIO_AAC.value)) {
            MediaCodec mediaCodec = null;
            try {
                mediaCodec = MediaCodec.createEncoderByType(str);
                C107835Rb r4 = C107835Rb.SURFACE;
                Surface surface = null;
                mediaCodec.getName();
                Class<AnonymousClass6Xb> cls = AnonymousClass6Xb.class;
                String name = mediaCodec.getName();
                if (AnonymousClass6YR.A01.BMH(3)) {
                    AnonymousClass6YR.A00(cls, StringFormatUtil.formatStrLocaleSafe("config video encoder (%s) with format: %s", name, mediaFormat));
                }
                mediaCodec.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
                try {
                    Locale locale = Locale.US;
                    Object[] objArr = new Object[3];
                    objArr[0] = A04(mediaCodec, mediaFormat);
                    C36411kG.A1Q(mediaFormat, r13, objArr, 1);
                    str4 = String.format(locale, "media codec:%s, format:%s, input type:%s", objArr);
                } catch (Throwable unused) {
                    str4 = null;
                }
                if (r13 == r4) {
                    surface = mediaCodec.createInputSurface();
                }
                return new C128986Em(mediaCodec, surface, C023109s.A01, str4, false);
            } catch (Exception e) {
                Locale locale2 = Locale.US;
                Object[] objArr2 = new Object[6];
                String str5 = "null";
                if (mediaCodec != null) {
                    str3 = A04(mediaCodec, mediaFormat);
                } else {
                    str3 = str5;
                }
                objArr2[0] = str3;
                C90464aC.A1D(mediaFormat, r13, str, objArr2);
                if (e instanceof MediaCodec.CodecException) {
                    str5 = C131736Qi.A00((MediaCodec.CodecException) e);
                }
                objArr2[4] = str5;
                objArr2[5] = str2;
                throw new C98594rg(String.format(locale2, "media codec:%s, format:%s, input type:%s, mimeType:%s, mediaCodecException:%s, debugInfo:", objArr2), e);
            }
        } else {
            throw new C98584rf(AnonymousClass000.A0p("Unsupported codec for ", str, AnonymousClass000.A0u()));
        }
    }

    public static boolean A05(String str) {
        if (str.equals(C108365Tf.CODEC_VIDEO_H264.value) || str.equals(C108365Tf.CODEC_VIDEO_HEVC.value) || str.equals(C108365Tf.CODEC_VIDEO_AV1.value) || str.equals(C108365Tf.CODEC_VIDEO_H263.value) || str.equals(C108365Tf.CODEC_VIDEO_MPEG4.value) || str.equals(C108365Tf.CODEC_VIDEO_VP8.value) || str.equals(C108365Tf.CODEC_FFMPEG_VIDEO_MPEG4.value)) {
            return true;
        }
        return false;
    }

    static {
        HashSet A16 = C36441kJ.A16();
        A05 = A16;
        A16.add("OMX.ittiam.video.encoder.avc");
        A16.add("OMX.Exynos.avc.enc");
        HashMap A0J = AnonymousClass001.A0J();
        A03 = A0J;
        A0J.put("OMX.qcom.video.encoder.avc", 21);
        HashSet A162 = C36441kJ.A16();
        A01 = A162;
        A162.add("OMX.qcom.video.decoder.avc");
        HashSet A163 = C36441kJ.A16();
        A04 = A163;
        A163.add("OMX.ittiam.video.decoder.avc");
        A163.add("OMX.Exynos.AVC.Decoder");
        HashSet A164 = C36441kJ.A16();
        A06 = A164;
        A164.add("GT-S6812i");
        A164.add("GT-I8552");
        A164.add("GT-I8552B");
        A164.add("GT-I8262B");
        ArrayList A0I = AnonymousClass001.A0I();
        A02 = A0I;
        A0I.add("OMX.SEC.AVC.Encoder");
        A0I.add("OMX.SEC.avc.enc");
    }

    public static final int A00(MediaFormat mediaFormat, String str) {
        if (mediaFormat.containsKey(str)) {
            return mediaFormat.getInteger(str);
        }
        return -1;
    }

    public static C114955i6 A03(String str, List list) {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (!codecInfoAt.isEncoder() && Arrays.asList(codecInfoAt.getSupportedTypes()).contains(str)) {
                String name = codecInfoAt.getName();
                if (!A04.contains(name) && (list == null || list.isEmpty() || !list.contains(name))) {
                    return new C114955i6(name);
                }
            }
        }
        return null;
    }

    public static String A04(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        boolean z;
        int[] iArr;
        boolean z2;
        MediaCodecInfo codecInfo = mediaCodec.getCodecInfo();
        StringBuilder A0u = AnonymousClass000.A0u();
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("name=");
        A0u2.append(codecInfo.getName());
        StringBuilder A0j = C90464aC.A0j(A0u2, A0u);
        A0j.append(" is encoder=");
        A0j.append(codecInfo.isEncoder());
        StringBuilder A0j2 = C90464aC.A0j(A0j, A0u);
        A0j2.append(" supported types=");
        C90514aH.A1T(A0j2, codecInfo.getSupportedTypes());
        C36351kA.A1K(A0j2, A0u);
        if (Build.VERSION.SDK_INT >= 29) {
            StringBuilder A0u3 = AnonymousClass000.A0u();
            A0u3.append(" is vendor=");
            A0u3.append(codecInfo.isVendor());
            StringBuilder A0j3 = C90464aC.A0j(A0u3, A0u);
            A0j3.append(" is alias=");
            A0j3.append(codecInfo.isAlias());
            StringBuilder A0j4 = C90464aC.A0j(A0j3, A0u);
            A0j4.append(" is software only=");
            A0j4.append(codecInfo.isSoftwareOnly());
            C36351kA.A1K(A0j4, A0u);
        }
        MediaCodecInfo.CodecCapabilities capabilitiesForType = codecInfo.getCapabilitiesForType(mediaFormat.getString("mime"));
        int A002 = A00(mediaFormat, "color-format");
        if (A002 > 0 && (iArr = capabilitiesForType.colorFormats) != null) {
            int length = iArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z2 = false;
                    break;
                } else if (iArr[i] == A002) {
                    z2 = true;
                    break;
                } else {
                    i++;
                }
            }
            A0u.append(C36371kC.A0z(" color format supported=", AnonymousClass000.A0u(), z2));
        }
        int i2 = -1;
        int A003 = A00(mediaFormat, "profile");
        if (Build.VERSION.SDK_INT >= 23) {
            i2 = A00(mediaFormat, "level");
        }
        StringBuilder A0u4 = AnonymousClass000.A0u();
        A0u4.append(" Checking for profile=");
        A0u4.append(A003);
        A0u.append(AnonymousClass000.A0r(" level=", A0u4, i2));
        if (A003 > 0 && i2 > 0 && (codecProfileLevelArr = capabilitiesForType.profileLevels) != null) {
            int length2 = codecProfileLevelArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    z = false;
                    break;
                }
                MediaCodecInfo.CodecProfileLevel codecProfileLevel = codecProfileLevelArr[i3];
                StringBuilder A0u5 = AnonymousClass000.A0u();
                A0u5.append(" codecProfileLevel.profile=");
                int i4 = codecProfileLevel.profile;
                A0u5.append(i4);
                A0u5.append(" codecProfileLevel.level=");
                A0u5.append(codecProfileLevel.level);
                C36351kA.A1K(A0u5, A0u);
                if (i4 == A003 && codecProfileLevel.level == i2) {
                    z = true;
                    break;
                }
                i3++;
            }
            A0u.append(C36371kC.A0z(" profile level supported=", AnonymousClass000.A0u(), z));
        }
        MediaCodecInfo.EncoderCapabilities encoderCapabilities = capabilitiesForType.getEncoderCapabilities();
        MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
        int A004 = A00(mediaFormat, "width");
        int A005 = A00(mediaFormat, "height");
        boolean isSizeSupported = videoCapabilities.isSizeSupported(A004, A005);
        A0u.append(C36371kC.A0z(" size supported=", AnonymousClass000.A0u(), isSizeSupported));
        if (isSizeSupported) {
            double A006 = (double) A00(mediaFormat, "frame-rate");
            if (A006 > 0.0d) {
                StringBuilder A0u6 = AnonymousClass000.A0u();
                A0u6.append(" frame rate supported=");
                A0u6.append(videoCapabilities.getSupportedFrameRatesFor(A004, A005).contains(Double.valueOf(A006)));
                C36351kA.A1K(A0u6, A0u);
            }
        }
        StringBuilder A0u7 = AnonymousClass000.A0u();
        A0u7.append(" width alignment=");
        A0u7.append(videoCapabilities.getWidthAlignment());
        StringBuilder A0j5 = C90464aC.A0j(A0u7, A0u);
        A0j5.append(" height alignment=");
        A0j5.append(videoCapabilities.getHeightAlignment());
        C36351kA.A1K(A0j5, A0u);
        int A007 = A00(mediaFormat, "bitrate");
        if (A007 > 0) {
            StringBuilder A0u8 = AnonymousClass000.A0u();
            A0u8.append(" bitrate supported=");
            A0u8.append(videoCapabilities.getBitrateRange().contains(Integer.valueOf(A007)));
            C36351kA.A1K(A0u8, A0u);
        }
        int A008 = A00(mediaFormat, "bitrate-mode");
        if (A008 > 0) {
            StringBuilder A0u9 = AnonymousClass000.A0u();
            A0u9.append(" bitrate mode supported=");
            A0u9.append(encoderCapabilities.isBitrateModeSupported(A008));
            C36351kA.A1K(A0u9, A0u);
        }
        return AnonymousClass000.A0q(String.format(Locale.US, " supported widths=[%d, %d] supported heights=[%d, %d] supported bitrate=[%d, %d]", new Object[]{videoCapabilities.getSupportedWidths().getLower(), videoCapabilities.getSupportedWidths().getUpper(), videoCapabilities.getSupportedHeights().getLower(), videoCapabilities.getSupportedHeights().getUpper(), videoCapabilities.getBitrateRange().getLower(), videoCapabilities.getBitrateRange().getUpper()}), A0u);
    }
}
