package X;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Range;
import android.util.Size;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* renamed from: X.9og  reason: invalid class name and case insensitive filesystem */
public abstract class C203739og {
    public static final int[] A00 = new int[0];
    public static final Range A01;
    public static final boolean A02;

    static {
        boolean z = false;
        Float valueOf = Float.valueOf(0.0f);
        A01 = Range.create(valueOf, valueOf);
        if (Build.VERSION.SDK_INT >= 30) {
            z = true;
        }
        A02 = z;
    }

    public static int A00(int i) {
        switch (i) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            case 10:
                return 10;
            case 11:
                return 11;
            case 12:
                return 12;
            case 13:
                return 13;
            case 14:
                return 14;
            case 15:
                return 15;
            case 16:
                return 16;
            case 17:
                return 18;
            case 18:
                return 17;
            default:
                return -1;
        }
    }

    public static ArrayList A02(float f) {
        if (f <= 0.0f) {
            return null;
        }
        double d = (double) f;
        int log = (int) ((Math.log(1.0E-11d + d) * 20.0d) / Math.log(2.0d));
        double d2 = 1.0d;
        double pow = Math.pow(d, 1.0d / ((double) log));
        ArrayList A0I = AnonymousClass001.A0I();
        C165587tf.A1Q(A0I, 100.0f);
        for (int i = 0; i < log - 1; i++) {
            d2 *= pow;
            C165587tf.A1Q(A0I, (float) (100.0d * d2));
        }
        C165587tf.A1Q(A0I, f * 100.0f);
        return A0I;
    }

    public static Range A01(CameraCharacteristics cameraCharacteristics) {
        Float valueOf;
        Float valueOf2;
        float f;
        List A0q;
        if (!A02) {
            Number number = (Number) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
            if (number != null) {
                f = number.floatValue();
            } else {
                f = 0.0f;
            }
            ArrayList A022 = A02(f);
            if (A022 == null) {
                A0q = Collections.emptyList();
            } else {
                A0q = C165577te.A0q(A022);
            }
            valueOf = (Float) C36391kE.A0t(A0q);
            valueOf2 = (Float) C36401kF.A0n(A0q);
        } else {
            Range range = (Range) cameraCharacteristics.get(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
            if (range != null) {
                Number number2 = (Number) range.getLower();
                Number number3 = (Number) range.getUpper();
                if (!(number2 == null || number3 == null)) {
                    valueOf = Float.valueOf(number2.floatValue() * 100.0f);
                    valueOf2 = Float.valueOf(number3.floatValue() * 100.0f);
                }
            }
            return A01;
        }
        return new Range(valueOf, valueOf2);
    }

    public static List A04(CameraCharacteristics cameraCharacteristics) {
        long[] jArr;
        if (Build.VERSION.SDK_INT < 33 || (jArr = (long[]) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) == null) {
            return Collections.emptyList();
        }
        ArrayList A0I = AnonymousClass001.A0I();
        for (long A1W : jArr) {
            C36391kE.A1W(A0I, A1W);
        }
        return C165577te.A0q(A0I);
    }

    public static List A06(StreamConfigurationMap streamConfigurationMap, int i) {
        Size[] sizeArr;
        int length;
        if (streamConfigurationMap == null) {
            sizeArr = null;
        } else if (Build.VERSION.SDK_INT >= 23) {
            Size[] highResolutionOutputSizes = streamConfigurationMap.getHighResolutionOutputSizes(i);
            sizeArr = streamConfigurationMap.getOutputSizes(i);
            if (!(highResolutionOutputSizes == null || (length = highResolutionOutputSizes.length) == 0)) {
                Objects.requireNonNull(sizeArr);
                int length2 = sizeArr.length;
                Size[] sizeArr2 = new Size[(length + length2)];
                System.arraycopy(highResolutionOutputSizes, 0, sizeArr2, 0, length);
                System.arraycopy(sizeArr, 0, sizeArr2, length, length2);
                sizeArr = sizeArr2;
            }
        } else {
            sizeArr = streamConfigurationMap.getOutputSizes(i);
        }
        return C196329Yx.A00(sizeArr);
    }

    public static boolean A08(CameraCharacteristics cameraCharacteristics) {
        DynamicRangeProfiles dynamicRangeProfiles;
        if (Build.VERSION.SDK_INT < 34 || !A07(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES, cameraCharacteristics, 18) || (dynamicRangeProfiles = (DynamicRangeProfiles) cameraCharacteristics.get(CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES)) == null) {
            return false;
        }
        boolean contains = dynamicRangeProfiles.getSupportedProfiles().contains(2L);
        String str = Build.MANUFACTURER;
        if ("samsung".equals(str)) {
            if (!contains || !C21760zl.A06) {
                return false;
            }
            Method method = C21760zl.A01;
            Object[] A1b = C36411kG.A1b("ro.build.version.oneui");
            AnonymousClass000.A1L(A1b, 0, 1);
            Number number = (Number) C21760zl.A01(method, A1b);
            if (number == null || number.intValue() < 60100) {
                return false;
            }
        } else if (!"Google".equals(str)) {
            return contains;
        } else {
            if (!contains) {
                return false;
            }
            try {
                String[] split = Build.FINGERPRINT.split("\\.");
                if (split.length <= 1) {
                    return false;
                }
                String str2 = split[1];
                if (str2.length() != 6) {
                    return false;
                }
                int parseInt = Integer.parseInt(str2.substring(0, 2));
                int parseInt2 = Integer.parseInt(split[1].substring(2, 4));
                int parseInt3 = Integer.parseInt(split[1].substring(4, 6));
                if (parseInt <= 24) {
                    if (parseInt != 24) {
                        return false;
                    }
                    if (parseInt2 <= 3) {
                        if (parseInt2 != 3 || parseInt3 < 5) {
                            return false;
                        }
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        return true;
    }

    public static boolean A09(CameraCharacteristics cameraCharacteristics) {
        Number number;
        if (!A02 || cameraCharacteristics.get(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE) == null || !A0B(cameraCharacteristics, 0) || (number = (Number) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)) == null || number.floatValue() <= 0.0f) {
            return false;
        }
        return true;
    }

    public static boolean A0A(CameraCharacteristics cameraCharacteristics) {
        if (Build.VERSION.SDK_INT >= 33) {
            return A07(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES, cameraCharacteristics, 2);
        }
        return false;
    }

    public static boolean A0B(CameraCharacteristics cameraCharacteristics, int i) {
        Object obj = cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        Objects.requireNonNull(obj);
        int A0I = AnonymousClass000.A0I(obj);
        if (A0I == 2 || A0I < i) {
            return false;
        }
        return true;
    }

    public static boolean A0C(CameraCharacteristics cameraCharacteristics, List list) {
        if (Build.VERSION.SDK_INT < 34 || !A07(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES, cameraCharacteristics, 18) || list == null || !C165607th.A1X(list, 4101)) {
            return false;
        }
        return true;
    }

    public static ArrayList A03(CameraCharacteristics.Key key, CameraCharacteristics cameraCharacteristics) {
        ArrayList A0I = AnonymousClass001.A0I();
        int[] iArr = (int[]) cameraCharacteristics.get(key);
        if (iArr != null) {
            for (int A1F : iArr) {
                AnonymousClass000.A1F(A0I, A1F);
            }
        }
        return A0I;
    }

    public static List A05(CameraExtensionCharacteristics cameraExtensionCharacteristics) {
        List emptyList = Collections.emptyList();
        if (cameraExtensionCharacteristics == null || Build.VERSION.SDK_INT < 33) {
            return emptyList;
        }
        return cameraExtensionCharacteristics.getSupportedExtensions();
    }

    public static boolean A07(CameraCharacteristics.Key key, CameraCharacteristics cameraCharacteristics, int i) {
        for (int i2 : C165597tg.A1W(key, cameraCharacteristics)) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }
}
