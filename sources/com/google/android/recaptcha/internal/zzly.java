package com.google.android.recaptcha.internal;

import X.C165607th;

public final class zzly extends zzlx {
    public final int zza(int i, byte[] bArr, int i2, int i3) {
        byte b;
        while (r12 < i3 && bArr[r12] >= 0) {
            i2 = r12 + 1;
        }
        if (r12 < i3) {
            while (r12 < i3) {
                int i4 = r12 + 1;
                byte b2 = bArr[r12];
                if (b2 < 0) {
                    if (b2 >= -32) {
                        if (b2 < -16) {
                            if (i4 < i3 - 1) {
                                int i5 = i4 + 1;
                                byte b3 = bArr[i4];
                                if (b3 > -65) {
                                    return -1;
                                }
                                if (b2 == -32) {
                                    if (b3 < -96) {
                                        return -1;
                                    }
                                } else if (b2 == -19 && b3 >= -96) {
                                    return -1;
                                }
                                r12 = i5 + 1;
                                b = bArr[i5];
                            }
                        } else if (i4 < i3 - 2) {
                            int i6 = i4 + 1;
                            byte b4 = bArr[i4];
                            if (b4 > -65 || C165607th.A02(b2, b4) != 0) {
                                return -1;
                            }
                            int i7 = i6 + 1;
                            if (bArr[i6] > -65) {
                                return -1;
                            }
                            i4 = i7 + 1;
                            if (bArr[i7] > -65) {
                                return -1;
                            }
                        }
                        return zzma.zza(bArr, i4, i3);
                    } else if (i4 >= i3) {
                        return b2;
                    } else {
                        if (b2 < -62) {
                            return -1;
                        }
                        r12 = i4 + 1;
                        b = bArr[i4];
                    }
                    if (b > -65) {
                        return -1;
                    }
                }
                r12 = i4;
            }
        }
        return 0;
    }
}
