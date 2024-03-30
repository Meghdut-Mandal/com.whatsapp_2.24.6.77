package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.6Vu  reason: invalid class name and case insensitive filesystem */
public abstract class C132916Vu {
    public static Set A00;

    public static String A02(Signature signature) {
        try {
            return C90504aG.A0o(MessageDigest.getInstance("SHA-1").digest(signature.toByteArray()));
        } catch (NoSuchAlgorithmException e) {
            throw C90524aI.A0Y(e);
        }
    }

    public static boolean A04(PackageInfo packageInfo) {
        Set set = A00;
        if (set == null) {
            HashSet A16 = C36441kJ.A16();
            A16.add("ijxLJi1yGs1JpL-X1SExmchvork");
            A16.add("xW-31ZG6ZwTfBH_Zj1NTcv6gAhE");
            A16.add("Sr9mhPKOEwo6NysnYn803dZ3UiY");
            A16.add("OKD31QX-GP7GT780Psqq8xDb15k");
            A16.add("Dp3faO2KC6cZg6irlvtu9yL9H3E");
            set = Collections.unmodifiableSet(A16);
            A00 = set;
        }
        return set.contains(A01(packageInfo));
    }

    public static Signature A00(PackageManager packageManager, String str) {
        Signature[] signatureArr;
        int length;
        try {
            int i = 64;
            if (C19550w8.A05()) {
                i = 134217728;
            }
            PackageInfo packageInfo = packageManager.getPackageInfo(str, i);
            String str2 = packageInfo.packageName;
            if (str.equals(str2)) {
                if (C19550w8.A05()) {
                    signatureArr = packageInfo.signingInfo.getApkContentsSigners();
                } else {
                    signatureArr = packageInfo.signatures;
                }
                if (signatureArr == null || (length = signatureArr.length) == 0) {
                    throw new SecurityException(AnonymousClass000.A0p("Signatures are missing: ", str, AnonymousClass000.A0u()));
                } else if (length <= 1) {
                    return signatureArr[0];
                } else {
                    throw new SecurityException(AnonymousClass000.A0p("Multiple signatures not supported: ", str, AnonymousClass000.A0u()));
                }
            } else {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("Package name mismatch: expected=");
                A0u.append(str);
                throw new SecurityException(AnonymousClass000.A0p(", was=", str2, A0u));
            }
        } catch (PackageManager.NameNotFoundException unused) {
            throw new SecurityException(AnonymousClass000.A0p("Name not found: ", str, AnonymousClass000.A0u()));
        }
    }

    public static String A01(PackageInfo packageInfo) {
        Signature[] signatureArr;
        SigningInfo signingInfo;
        if (!C19550w8.A05() || (signingInfo = packageInfo.signingInfo) == null) {
            signatureArr = packageInfo.signatures;
        } else {
            signatureArr = signingInfo.getApkContentsSigners();
        }
        if (signatureArr == null || signatureArr.length != 1) {
            return null;
        }
        return A02(signatureArr[0]);
    }

    public static boolean A03(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            int i = 64;
            if (C19550w8.A05()) {
                i = 134217728;
            }
            return A04(packageManager.getPackageInfo(str, i));
        } catch (PackageManager.NameNotFoundException e) {
            C90464aC.A1L("cannot find package; packageName=", str, AnonymousClass000.A0u(), e);
            return false;
        }
    }
}
