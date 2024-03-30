package X;

/* renamed from: X.A3d  reason: case insensitive filesystem */
public final class C21014A3d implements B3S {
    public final AnonymousClass95O A00;
    public final C23118B5x A01;
    public final AnonymousClass95P A02;

    public C21014A3d(AnonymousClass95O r1, C23118B5x b5x, AnonymousClass95P r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = b5x;
    }

    public final void Bye(Object obj, Object obj2) {
        C203819ov.A0P(obj, obj2);
    }

    public static int A00(C192929Je r2, byte[] bArr, int i, int i2, int i3) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                return C203009n7.A03(r2, bArr, i2);
            }
            if (i4 == 1) {
                return i2 + 8;
            }
            if (i4 == 2) {
                return C203009n7.A02(r2, bArr, i2) + r2.A00;
            }
            if (i4 == 3) {
                int i5 = (i & -8) | 4;
                int i6 = 0;
                while (i2 < i3) {
                    i2 = C203009n7.A02(r2, bArr, i2);
                    i6 = r2.A00;
                    if (i6 == i5) {
                        break;
                    }
                    i2 = A00(r2, bArr, i6, i2, i3);
                }
                if (i2 <= i3 && i6 == i5) {
                    return i2;
                }
                throw new C187308xd("Failed to parse the message.");
            } else if (i4 == 5) {
                return i2 + 4;
            }
        }
        throw new C187308xd("Protocol message contained an invalid tag (zero).");
    }

    public final boolean B6j(Object obj, Object obj2) {
        return C90504aG.A1T(((AnonymousClass8DG) obj).zzjp.equals(((AnonymousClass8DG) obj2).zzjp) ? 1 : 0);
    }

    public final int BK8(Object obj) {
        return ((AnonymousClass8DG) obj).zzjp.hashCode();
    }

    public final Object BQ9() {
        return ((C170308Cx) ((AnonymousClass8DG) this.A01).A06(5)).A00();
    }

    public final void ByM(C22890Axl axl, Object obj) {
        throw AnonymousClass001.A0A("zzjv");
    }

    public final void ByN(C192929Je r14, Object obj, byte[] bArr, int i, int i2) {
        int i3;
        int i4 = i;
        C201559js A012 = AnonymousClass8DG.A01(obj);
        while (true) {
            i3 = i2;
            if (i4 >= i3) {
                break;
            }
            C192929Je r7 = r14;
            byte[] bArr2 = bArr;
            i4 = C203009n7.A02(r14, bArr2, i4);
            int i5 = r14.A00;
            if (i5 == 11) {
                int i6 = 0;
                Object obj2 = null;
                while (i4 < i3) {
                    i4 = C203009n7.A02(r14, bArr2, i4);
                    int i7 = r14.A00;
                    int i8 = i7 >>> 3;
                    int i9 = i7 & 7;
                    if (i8 != 2) {
                        if (i8 == 3 && i9 == 2) {
                            i4 = C203009n7.A01(r14, bArr2, i4);
                            obj2 = r14.A02;
                        }
                    } else if (i9 == 0) {
                        i4 = C203009n7.A02(r14, bArr2, i4);
                        i6 = r14.A00;
                    }
                    if (i7 == 12) {
                        break;
                    }
                    i4 = A00(r14, bArr2, i7, i4, i3);
                }
                if (obj2 != null) {
                    A012.A01((i6 << 3) | 2, obj2);
                }
            } else if ((i5 & 7) == 2) {
                i4 = C203009n7.A00(r7, A012, bArr2, i5, i4, i3);
            } else {
                i4 = A00(r14, bArr2, i5, i4, i3);
            }
        }
        if (i4 != i3) {
            throw new C187308xd("Failed to parse the message.");
        }
    }

    public final void Byd(Object obj) {
        ((AnonymousClass8DG) obj).zzjp.A02 = false;
        throw AnonymousClass001.A0A("zzjv");
    }

    public final int Byv(Object obj) {
        C201559js r7 = ((AnonymousClass8DG) obj).zzjp;
        int i = r7.A01;
        if (i == -1) {
            i = 0;
            for (int i2 = 0; i2 < r7.A00; i2++) {
                int i3 = r7.A03[i2] >>> 3;
                boolean z = AnonymousClass8D7.A01;
                i += 2 + 1 + C165567td.A00(i3) + C194279Ox.A03(((AUv) r7.A04[i2]).A02(), C165567td.A00(24));
            }
            r7.A01 = i;
        }
        return i;
    }

    public final boolean Byx(Object obj) {
        throw AnonymousClass001.A0A("zzjv");
    }
}
