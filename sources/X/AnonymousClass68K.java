package X;

/* renamed from: X.68K  reason: invalid class name */
public final class AnonymousClass68K {
    public final AnonymousClass0GA A00 = new AnonymousClass0GA(6);

    public final void A00(Object obj) {
        int i;
        int i2;
        AnonymousClass0GA r10 = this.A00;
        long[] jArr = r10.A02;
        long[] jArr2 = jArr;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr2[i3];
                char c = 7;
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int A06 = C90484aE.A06(i3, length);
                    int i4 = 0;
                    while (true) {
                        i = A06;
                        if (i4 >= i) {
                            break;
                        }
                        if ((j & 255) < 128) {
                            int i5 = (i3 << 3) + i4;
                            Object obj2 = r10.A04[i5];
                            if (obj2 instanceof AnonymousClass0GB) {
                                AnonymousClass00C.A0E(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1>");
                                AnonymousClass0GB r6 = (AnonymousClass0GB) obj2;
                                Object[] objArr = r6.A03;
                                long[] jArr3 = r6.A02;
                                long[] jArr4 = jArr3;
                                int length2 = jArr3.length - 2;
                                if (length2 >= 0) {
                                    int i6 = 0;
                                    while (true) {
                                        long j2 = jArr4[i6];
                                        if ((((~j2) << c) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                                            int A062 = C90484aE.A06(i6, length2);
                                            int i7 = 0;
                                            while (true) {
                                                i2 = A062;
                                                if (i7 >= i2) {
                                                    break;
                                                }
                                                if ((j2 & 255) < 128) {
                                                    int i8 = (i6 << 3) + i7;
                                                    if (objArr[i8] == obj) {
                                                        r6.A05(i8);
                                                    }
                                                }
                                                j2 >>= 8;
                                                i7++;
                                            }
                                            if (i2 != 8) {
                                                break;
                                            }
                                        }
                                        if (i6 == length2) {
                                            break;
                                        }
                                        i6++;
                                        c = 7;
                                    }
                                }
                                if (r6.A01 != 0) {
                                }
                            } else {
                                AnonymousClass00C.A0E(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1");
                                if (obj2 != obj) {
                                }
                            }
                            r10.A06(i5);
                        }
                        j >>= 8;
                        i4++;
                        c = 7;
                    }
                    if (i != 8) {
                        return;
                    }
                }
                if (i3 != length) {
                    i3++;
                } else {
                    return;
                }
            }
        }
    }

    public final void A01(Object obj, Object obj2) {
        AnonymousClass0GA r4 = this.A00;
        int A04 = r4.A04(obj);
        if (A04 < 0) {
            A04 = ~A04;
            r4.A03[A04] = obj;
        } else {
            Object obj3 = r4.A04[A04];
            if (obj3 != null) {
                if (obj3 instanceof AnonymousClass0GB) {
                    ((AnonymousClass0GB) obj3).A06(obj2);
                } else if (obj3 != obj2) {
                    AnonymousClass0GB r0 = new AnonymousClass0GB(6);
                    r0.A06(obj3);
                    r0.A06(obj2);
                    obj2 = r0;
                }
                obj2 = obj3;
            }
        }
        r4.A04[A04] = obj2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02(java.lang.Object r20, java.lang.Object r21) {
        /*
            r19 = this;
            r0 = r19
            X.0GA r8 = r0.A00
            r9 = r20
            java.lang.Object r10 = r8.A02(r9)
            r2 = 0
            if (r10 == 0) goto L_0x005e
            boolean r0 = r10 instanceof X.AnonymousClass0GB
            r11 = r21
            if (r0 == 0) goto L_0x0073
            X.0GB r10 = (X.AnonymousClass0GB) r10
            if (r21 == 0) goto L_0x001b
            int r2 = r11.hashCode()
        L_0x001b:
            int r0 = X.AnonymousClass000.A04(r2)
            r7 = r0 & 127(0x7f, float:1.78E-43)
            int r6 = r10.A00
            int r5 = r0 >>> 7
            r5 = r5 & r6
            r18 = 0
        L_0x0028:
            long[] r0 = r10.A02
            long r3 = X.AnonymousClass000.A0S(r0, r5)
            long r16 = X.AnonymousClass000.A0N(r7, r3)
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r16 = r16 & r14
        L_0x0039:
            r12 = 0
            int r0 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x0064
            int r0 = java.lang.Long.numberOfTrailingZeros(r16)
            int r1 = r0 >> 3
            int r1 = r1 + r5
            r1 = r1 & r6
            java.lang.Object[] r0 = r10.A03
            r0 = r0[r1]
            boolean r0 = X.AnonymousClass00C.A0J(r0, r11)
            if (r0 == 0) goto L_0x005f
            if (r1 < 0) goto L_0x007e
            r2 = 1
            r10.A05(r1)
            int r0 = r10.A01
            if (r0 != 0) goto L_0x005e
            r8.A07(r9)
        L_0x005e:
            return r2
        L_0x005f:
            long r16 = X.AnonymousClass000.A0P(r16)
            goto L_0x0039
        L_0x0064:
            long r1 = ~r3
            r0 = 6
            long r1 = r1 << r0
            long r3 = r3 & r1
            long r3 = r3 & r14
            int r0 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x007e
            int r18 = r18 + 8
            int r5 = r5 + r18
            r5 = r5 & r6
            goto L_0x0028
        L_0x0073:
            boolean r0 = r10.equals(r11)
            if (r0 == 0) goto L_0x005e
            r8.A07(r9)
            r2 = 1
            return r2
        L_0x007e:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass68K.A02(java.lang.Object, java.lang.Object):boolean");
    }

    public AnonymousClass68K() {
        AnonymousClass0GA r0 = C05860Ri.A01;
    }
}
