package com.google.android.recaptcha.internal;

import X.C165607th;
import X.C165617ti;
import X.C90474aD;

public abstract class zzlw {
    public static /* bridge */ /* synthetic */ void zza(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (C90474aD.A1T(b2, -65) || C165607th.A02(b, b2) != 0 || C90474aD.A1T(b3, -65) || C90474aD.A1T(b4, -65)) {
            throw C165617ti.A0H("Protocol message had invalid UTF-8.");
        }
        byte b5 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
        cArr[i] = (char) ((b5 >>> 10) + 55232);
        cArr[i + 1] = (char) ((b5 & 1023) + 56320);
    }

    public static /* bridge */ /* synthetic */ void zzb(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (!C90474aD.A1T(b2, -65)) {
            if (b == -32) {
                if (b2 >= -96) {
                    b = -32;
                }
            } else if (b == -19) {
                if (b2 < -96) {
                    b = -19;
                }
            }
            if (!C90474aD.A1T(b3, -65)) {
                cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                return;
            }
        }
        throw C165617ti.A0H("Protocol message had invalid UTF-8.");
    }

    public static /* bridge */ /* synthetic */ void zzc(byte b, byte b2, char[] cArr, int i) {
        if (b < -62 || C90474aD.A1T(b2, -65)) {
            throw C165617ti.A0H("Protocol message had invalid UTF-8.");
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    public static boolean zze(byte b) {
        return C90474aD.A1T(b, -65);
    }
}
