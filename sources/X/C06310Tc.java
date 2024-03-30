package X;

/* renamed from: X.0Tc  reason: invalid class name and case insensitive filesystem */
public final class C06310Tc {
    public final boolean A00(byte[] bArr, int i, int i2) {
        byte b;
        byte b2;
        while (r11 < i2 && bArr[r11] >= 0) {
            i = r11 + 1;
        }
        if (r11 >= i2) {
            return true;
        }
        while (r11 < i2) {
            int i3 = r11 + 1;
            byte b3 = bArr[r11];
            if (b3 < 0) {
                if (b3 < -32) {
                    if (i3 < i2 && b3 >= -62) {
                        r11 = i3 + 1;
                        b2 = bArr[i3];
                    }
                    return false;
                }
                if (b3 < -16) {
                    if (i3 < i2 - 1) {
                        int i4 = i3 + 1;
                        byte b4 = bArr[i3];
                        if (b4 <= -65) {
                            if (b3 == -32) {
                                if (b4 < -96) {
                                }
                            } else if (b3 == -19 && b4 >= -96) {
                            }
                            r11 = i4 + 1;
                            b2 = bArr[i4];
                        }
                        return false;
                    }
                } else if (i3 < i2 - 2) {
                    int i5 = i3 + 1;
                    byte b5 = bArr[i3];
                    if (b5 <= -65 && (((b3 << 28) + (b5 + 112)) >> 30) == 0) {
                        int i6 = i5 + 1;
                        if (bArr[i5] <= -65) {
                            i3 = i6 + 1;
                            if (bArr[i6] > -65) {
                                return false;
                            }
                        }
                    }
                    return false;
                }
                C06310Tc r0 = AnonymousClass0RO.A00;
                byte b6 = bArr[i3 - 1];
                int i7 = i2 - i3;
                if (i7 != 0) {
                    if (i7 == 1) {
                        byte b7 = bArr[i3];
                        if (b6 <= -12 && b7 <= -65) {
                            b = b6 ^ (b7 << 8);
                        }
                    } else if (i7 == 2) {
                        byte b8 = bArr[i3];
                        byte b9 = bArr[i3 + 1];
                        if (b6 <= -12 && b8 <= -65 && b9 <= -65) {
                            b = ((b8 << 8) ^ b6) ^ (b9 << 16);
                        }
                    } else {
                        throw new AssertionError();
                    }
                    if (b == 0) {
                        return true;
                    }
                }
                return false;
                if (b2 > -65) {
                    return false;
                }
            }
            r11 = i3;
        }
        return true;
    }
}
