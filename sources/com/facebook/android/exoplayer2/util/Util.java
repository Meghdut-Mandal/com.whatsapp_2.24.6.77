package com.facebook.android.exoplayer2.util;

import X.AnonymousClass000;
import X.C165617ti;
import X.C36391kE;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.os.Build;
import android.view.Display;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.Arrays;
import java.util.regex.Pattern;

public abstract class Util {
    public static final int A00;
    public static final String A01;
    public static final String A02;
    public static final String A03;
    public static final String A04;
    public static final Pattern A05 = Pattern.compile("%([A-Fa-f0-9]{2})");
    public static final Pattern A06 = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
    public static final Pattern A07 = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
    public static final byte[] A08 = new byte[0];
    public static final Pattern A09 = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);

    public static int A01(int i) {
        if (i == 2 || i == 4) {
            return 6005;
        }
        if (i == 10) {
            return 6004;
        }
        if (i == 7) {
            return 6005;
        }
        if (i == 8) {
            return 6003;
        }
        switch (i) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    public static int A02(int i, int i2) {
        if (i != 2) {
            if (i == 3) {
                return i2;
            }
            if (i != 4) {
                if (i != 268435456) {
                    if (i == 536870912) {
                        return i2 * 3;
                    }
                    if (i != 805306368) {
                        throw C165617ti.A0U();
                    }
                }
            }
            return i2 * 4;
        }
        return i2 * 2;
    }

    public static long A04(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j * 1000;
    }

    public static boolean A0C(char c) {
        return c == '\"' || c == '%' || c == '*' || c == '/' || c == ':' || c == '<' || c == '\\' || c == '|' || c == '>' || c == '?';
    }

    public static boolean A0D(int i) {
        return i == 3 || i == 2 || i == 268435456 || i == 536870912 || i == 805306368 || i == 4;
    }

    static {
        int i = Build.VERSION.SDK_INT;
        A00 = i;
        String str = Build.DEVICE;
        A01 = str;
        String str2 = Build.MANUFACTURER;
        A03 = str2;
        String str3 = Build.MODEL;
        A04 = str3;
        StringBuilder A0v = AnonymousClass000.A0v(str);
        A0v.append(", ");
        AnonymousClass000.A1D(str3, ", ", str2, A0v);
        A02 = AnonymousClass000.A0r(", ", A0v, i);
    }

    public static int A00(int i) {
        if (i != 12) {
            switch (i) {
                case 1:
                    return 4;
                case 2:
                    return 12;
                case 3:
                    return 28;
                case 4:
                    return 204;
                case 5:
                    return 220;
                case 6:
                    return 252;
                case 7:
                    return 1276;
                case 8:
                    return 6396;
            }
        } else if (A00 >= 32) {
            return 743676;
        }
        return 0;
    }

    public static long A07(long j, long j2, long j3) {
        if (j3 >= j2) {
            if (j3 % j2 == 0) {
                return j / (j3 / j2);
            }
        } else if (j2 % j3 == 0) {
            return j * (j2 / j3);
        }
        return (long) (((double) j) * (((double) j2) / ((double) j3)));
    }

    public static String A08(int i) {
        if (i == 0) {
            return "NO";
        }
        if (i == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i == 4) {
            return "YES";
        }
        throw C165617ti.A0V();
    }

    public static boolean A0E(Object obj, Object obj2) {
        if (obj == null) {
            return AnonymousClass000.A1W(obj2);
        }
        return obj.equals(obj2);
    }

    public static int A03(long[] jArr, long j, boolean z) {
        int i;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            i = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0 || jArr[binarySearch] != j) {
                    i = binarySearch + 1;
                }
                binarySearch--;
                break;
            } while (jArr[binarySearch] != j);
            i = binarySearch + 1;
        }
        if (z) {
            return Math.max(0, i);
        }
        return i;
    }

    public static long A06(long j, long j2) {
        return A07(j, SearchActionVerificationClientService.MS_TO_NS, j2);
    }

    public static String A09(Context context, String str) {
        String str2;
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "?";
        }
        StringBuilder A0v = AnonymousClass000.A0v(str);
        A0v.append("/");
        A0v.append(str2);
        A0v.append(" (Linux;Android ");
        A0v.append(Build.VERSION.RELEASE);
        A0v.append(") ");
        return AnonymousClass000.A0q("ExoPlayerLib/2.8.1", A0v);
    }

    public static void A0A(Point point, Display display) {
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    public static void A0B(long[] jArr, long j) {
        int i = 0;
        if (j >= SearchActionVerificationClientService.MS_TO_NS) {
            if (j % SearchActionVerificationClientService.MS_TO_NS == 0) {
                long j2 = j / SearchActionVerificationClientService.MS_TO_NS;
                while (i < jArr.length) {
                    jArr[i] = jArr[i] / j2;
                    i++;
                }
                return;
            }
        } else if (SearchActionVerificationClientService.MS_TO_NS % j == 0) {
            long j3 = SearchActionVerificationClientService.MS_TO_NS / j;
            while (i < jArr.length) {
                jArr[i] = jArr[i] * j3;
                i++;
            }
            return;
        }
        double d = ((double) SearchActionVerificationClientService.MS_TO_NS) / ((double) j);
        while (i < jArr.length) {
            jArr[i] = (long) (((double) jArr[i]) * d);
            i++;
        }
    }

    public static long A05(long j) {
        if (j == -9223372036854775807L || j == Long.MIN_VALUE) {
            return j;
        }
        return C36391kE.A0B(j);
    }
}
