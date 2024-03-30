package X;

/* renamed from: X.6YE  reason: invalid class name */
public final class AnonymousClass6YE {
    public static final AnonymousClass6YE A04 = new AnonymousClass6YE((AnonymousClass5WG) null, new Object[0], 0, 0);
    public int A00;
    public int A01;
    public Object[] A02;
    public final AnonymousClass5WG A03;

    private final AnonymousClass6YE A06(AnonymousClass5WG r10, Object obj, Object obj2, Object obj3, Object obj4, int i, int i2, int i3) {
        if (i3 > 30) {
            return new AnonymousClass6YE(r10, new Object[]{obj, obj2, obj3, obj4}, 0, 0);
        }
        int i4 = (i >> i3) & 31;
        int i5 = (i2 >> i3) & 31;
        if (i4 != i5) {
            Object[] objArr = new Object[4];
            if (i4 < i5) {
                objArr[0] = obj;
                objArr[1] = obj2;
                objArr[2] = obj3;
                objArr[3] = obj4;
            } else {
                objArr[0] = obj3;
                objArr[1] = obj4;
                objArr[2] = obj;
                objArr[3] = obj2;
            }
            return new AnonymousClass6YE(r10, objArr, (1 << i4) | (1 << i5), 0);
        }
        return new AnonymousClass6YE(r10, new Object[]{A06(r10, obj, obj2, obj3, obj4, i, i2, i3 + 5)}, 0, 1 << i4);
    }

    private final boolean A07(AnonymousClass6YE r8) {
        if (this != r8) {
            if (this.A01 == r8.A01 && this.A00 == r8.A00) {
                Object[] objArr = this.A02;
                int length = objArr.length;
                int i = 0;
                while (i < length) {
                    if (objArr[i] == r8.A02[i]) {
                        i++;
                    }
                }
            }
            return false;
        }
        return true;
    }

    private final Object[] A0A(AnonymousClass5WG r12, Object obj, Object obj2, int i, int i2, int i3, int i4) {
        Object obj3 = this.A02[i];
        AnonymousClass6YE A06 = A06(r12, obj3, this.A02[i + 1], obj, obj2, AnonymousClass000.A0J(obj3), i3, i4 + 5);
        int A0E = A0E(i2) + 1;
        Object[] objArr = this.A02;
        int i5 = A0E - 2;
        int length = objArr.length;
        Object[] objArr2 = new Object[((length - 2) + 1)];
        AnonymousClass02Q.A05(objArr, 0, objArr2, 0, i);
        AnonymousClass02Q.A05(objArr, i, objArr2, i + 2, A0E);
        objArr2[i5] = A06;
        AnonymousClass02Q.A05(objArr, i5 + 1, objArr2, A0E, length);
        return objArr2;
    }

    public static final Object[] A0B(Object obj, Object obj2, Object[] objArr, int i) {
        int length = objArr.length;
        Object[] objArr2 = new Object[(length + 2)];
        AnonymousClass02Q.A05(objArr, 0, objArr2, 0, i);
        AnonymousClass02Q.A05(objArr, i + 2, objArr2, i, length);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final Object[] A0C(Object[] objArr, int i) {
        int length = objArr.length;
        Object[] objArr2 = new Object[(length - 2)];
        AnonymousClass02Q.A05(objArr, 0, objArr2, 0, i);
        AnonymousClass02Q.A05(objArr, i, objArr2, i + 2, length);
        return objArr2;
    }

    private final int A00() {
        if (this.A01 == 0) {
            return this.A02.length / 2;
        }
        int bitCount = Integer.bitCount(this.A00);
        int length = this.A02.length;
        for (int i = bitCount * 2; i < length; i++) {
            bitCount += A0G(i).A00();
        }
        return bitCount;
    }

    private final AnonymousClass6YE A03(AnonymousClass6YE r8, int i, int i2) {
        Object[] objArr = r8.A02;
        if (objArr.length == 2 && r8.A01 == 0) {
            Object[] objArr2 = this.A02;
            int length = objArr2.length;
            if (length == 1) {
                r8.A00 = this.A01;
                return r8;
            }
            int A0D = A0D(i2);
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            Object[] A0K = AnonymousClass00C.A0K(objArr2, length + 1);
            int i3 = i + 1;
            System.arraycopy(A0K, i3, A0K, i + 2, length - i3);
            System.arraycopy(A0K, A0D, A0K, A0D + 2, i - A0D);
            A0K[A0D] = obj;
            A0K[A0D + 1] = obj2;
            return new AnonymousClass6YE((AnonymousClass5WG) null, A0K, this.A00 ^ i2, i2 ^ this.A01);
        }
        Object[] objArr3 = this.A02;
        Object[] A0K2 = AnonymousClass00C.A0K(objArr3, objArr3.length);
        A0K2[i] = r8;
        return new AnonymousClass6YE((AnonymousClass5WG) null, A0K2, this.A00, this.A01);
    }

    private final AnonymousClass6YE A04(AnonymousClass6YE r6, AnonymousClass6YE r7, AnonymousClass5WG r8, int i, int i2) {
        if (r7 == null) {
            Object[] objArr = this.A02;
            int length = objArr.length;
            if (length == 1) {
                return null;
            }
            AnonymousClass5WG r1 = this.A03;
            Object[] objArr2 = new Object[(length - 1)];
            AnonymousClass02Q.A05(objArr, 0, objArr2, 0, i);
            AnonymousClass02Q.A05(objArr, i, objArr2, i + 1, length);
            if (r1 != r8) {
                return new AnonymousClass6YE(r8, objArr2, this.A00, i2 ^ this.A01);
            }
            this.A02 = objArr2;
            this.A01 ^= i2;
        } else if (this.A03 == r8 || r6 != r7) {
            return A05(r7, r8, i);
        }
        return this;
    }

    private final AnonymousClass6YE A05(AnonymousClass6YE r5, AnonymousClass5WG r6, int i) {
        Object[] objArr = this.A02;
        int length = objArr.length;
        if (length == 1 && r5.A02.length == 2 && r5.A01 == 0) {
            r5.A00 = this.A01;
            return r5;
        } else if (this.A03 == r6) {
            objArr[i] = r5;
            return this;
        } else {
            Object[] A0K = AnonymousClass00C.A0K(objArr, length);
            A0K[i] = r5;
            return new AnonymousClass6YE(r6, A0K, this.A00, this.A01);
        }
    }

    public static boolean A08(AnonymousClass6YE r0, Object obj, int i) {
        return AnonymousClass00C.A0J(obj, r0.A02[i]);
    }

    private final boolean A09(Object obj) {
        C11020fb A1A = C90514aH.A1A(0, this.A02.length);
        int i = A1A.A00;
        int i2 = A1A.A01;
        int i3 = A1A.A02;
        if (i3 <= 0 ? !(i3 >= 0 || i2 > i) : i <= i2) {
            while (!A08(this, obj, i)) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    public final int A0D(int i) {
        return Integer.bitCount((i - 1) & this.A00) * 2;
    }

    public final int A0E(int i) {
        return (this.A02.length - 1) - Integer.bitCount((i - 1) & this.A01);
    }

    public final C118295ne A0F(Object obj, Object obj2, int i, int i2) {
        AnonymousClass6YE r3;
        int i3;
        C118295ne A0F;
        int i4 = i;
        int i5 = i2;
        int i6 = 1 << ((i >> i2) & 31);
        Object obj3 = obj;
        Object obj4 = obj2;
        if (AnonymousClass000.A1P(this.A00 & i6)) {
            int A0D = A0D(i6);
            if (A08(this, obj3, A0D)) {
                Object[] objArr = this.A02;
                int i7 = A0D + 1;
                if (objArr[i7] != obj4) {
                    Object[] A0K = AnonymousClass00C.A0K(objArr, objArr.length);
                    A0K[i7] = obj2;
                    r3 = new AnonymousClass6YE((AnonymousClass5WG) null, A0K, this.A00, this.A01);
                    i3 = 0;
                }
                return null;
            }
            r3 = new AnonymousClass6YE((AnonymousClass5WG) null, A0A((AnonymousClass5WG) null, obj3, obj4, A0D, i6, i4, i5), this.A00 ^ i6, i6 | this.A01);
            i3 = 1;
        } else if ((this.A01 & i6) != 0) {
            int A0E = A0E(i6);
            AnonymousClass6YE A0G = A0G(A0E);
            if (i5 == 30) {
                C11020fb A1A = C90514aH.A1A(0, A0G.A02.length);
                int i8 = A1A.A00;
                int i9 = A1A.A01;
                int i10 = A1A.A02;
                if (i10 <= 0 ? !(i10 >= 0 || i9 > i8) : i8 <= i9) {
                    while (true) {
                        if (!A08(A0G, obj3, i8)) {
                            if (i8 == i9) {
                                break;
                            }
                            i8 += i10;
                        } else {
                            Object[] objArr2 = A0G.A02;
                            int i11 = i8 + 1;
                            if (obj4 != objArr2[i11]) {
                                Object[] A0K2 = AnonymousClass00C.A0K(objArr2, objArr2.length);
                                A0K2[i11] = obj2;
                                A0F = new C118295ne(new AnonymousClass6YE((AnonymousClass5WG) null, A0K2, 0, 0), 0);
                            }
                        }
                    }
                    return null;
                }
                A0F = new C118295ne(new AnonymousClass6YE((AnonymousClass5WG) null, A0B(obj3, obj4, A0G.A02, 0), 0, 0), 1);
            } else {
                A0F = A0G.A0F(obj3, obj4, i4, i2 + 5);
                if (A0F == null) {
                    return null;
                }
            }
            A0F.A00 = A03(A0F.A00, A0E, i6);
            return A0F;
        } else {
            r3 = new AnonymousClass6YE((AnonymousClass5WG) null, A0B(obj3, obj4, this.A02, A0D(i6)), i6 | this.A00, this.A01);
            i3 = 1;
        }
        return new C118295ne(r3, i3);
    }

    public final AnonymousClass6YE A0G(int i) {
        Object obj = this.A02[i];
        AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (AnonymousClass6YE) obj;
    }

    public final AnonymousClass6YE A0H(C1513479e r29, AnonymousClass6YE r30, C131216Oe r31, int i) {
        AnonymousClass6YE r6;
        AnonymousClass6YE r10;
        AnonymousClass6YE r4 = r30;
        C131216Oe r5 = r31;
        if (this == r4) {
            r5.A00 += A00();
            return this;
        }
        C1513479e r9 = r29;
        if (i > 30) {
            AnonymousClass5WG r11 = r9.A02;
            Object[] objArr = this.A02;
            Object[] A0K = AnonymousClass00C.A0K(objArr, objArr.length + r4.A02.length);
            int length = this.A02.length;
            C11020fb A1A = C90514aH.A1A(0, r4.A02.length);
            int i2 = A1A.A00;
            int i3 = A1A.A01;
            int i4 = A1A.A02;
            if (i4 <= 0 ? !(i4 >= 0 || i3 > i2) : i2 <= i3) {
                while (true) {
                    if (!A09(r4.A02[i2])) {
                        Object[] objArr2 = r4.A02;
                        A0K[length] = objArr2[i2];
                        A0K[length + 1] = objArr2[i2 + 1];
                        length += 2;
                    } else {
                        r5.A00++;
                    }
                    if (i2 == i3) {
                        break;
                    }
                    i2 += i4;
                }
            }
            if (length == this.A02.length) {
                return this;
            }
            if (length == r4.A02.length) {
                return r4;
            }
            if (length == A0K.length) {
                return new AnonymousClass6YE(r11, A0K, 0, 0);
            }
            return new AnonymousClass6YE(r11, AnonymousClass00C.A0K(A0K, length), 0, 0);
        }
        int i5 = this.A01 | r4.A01;
        int i6 = this.A00;
        int i7 = r4.A00;
        int i8 = (i6 ^ i7) & (~i5);
        int i9 = i6 & i7;
        while (i9 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i9);
            if (A08(r4, this.A02[A0D(lowestOneBit)], r4.A0D(lowestOneBit))) {
                i8 |= lowestOneBit;
            } else {
                i5 |= lowestOneBit;
            }
            i9 ^= lowestOneBit;
        }
        int i10 = 0;
        if ((i5 & i8) == 0) {
            if (AnonymousClass00C.A0J(this.A03, r9.A02) && this.A00 == i8 && this.A01 == i5) {
                r6 = this;
            } else {
                r6 = new AnonymousClass6YE((AnonymousClass5WG) null, new Object[((Integer.bitCount(i8) * 2) + Integer.bitCount(i5))], i8, i5);
            }
            int i11 = 0;
            while (i5 != 0) {
                int lowestOneBit2 = Integer.lowestOneBit(i5);
                Object[] objArr3 = r6.A02;
                int length2 = (objArr3.length - 1) - i11;
                int i12 = 0;
                if (AnonymousClass000.A1P(this.A01 & lowestOneBit2)) {
                    r10 = A0G(A0E(lowestOneBit2));
                    if ((r4.A01 & lowestOneBit2) != 0) {
                        r10 = r10.A0H(r9, r4.A0G(r4.A0E(lowestOneBit2)), r5, i + 5);
                    } else if ((r4.A00 & lowestOneBit2) != 0) {
                        int A0D = r4.A0D(lowestOneBit2);
                        Object[] objArr4 = r4.A02;
                        Object obj = objArr4[A0D];
                        Object obj2 = objArr4[A0D + 1];
                        int size = r9.size();
                        if (obj != null) {
                            i12 = obj.hashCode();
                        }
                        r10 = r10.A0J(r9, obj, obj2, i12, i + 5);
                        if (r9.size() != size) {
                        }
                        r5.A00++;
                    }
                } else if ((r4.A01 & lowestOneBit2) != 0) {
                    r10 = r4.A0G(r4.A0E(lowestOneBit2));
                    if ((this.A00 & lowestOneBit2) != 0) {
                        int A0D2 = A0D(lowestOneBit2);
                        Object obj3 = this.A02[A0D2];
                        int i13 = i + 5;
                        if (!r10.A0N(obj3, AnonymousClass000.A0J(obj3), i13)) {
                            Object obj4 = this.A02[A0D2 + 1];
                            if (obj3 != null) {
                                i12 = obj3.hashCode();
                            }
                            r10 = r10.A0J(r9, obj3, obj4, i12, i13);
                        }
                        r5.A00++;
                    }
                } else {
                    int A0D3 = A0D(lowestOneBit2);
                    Object[] objArr5 = this.A02;
                    Object obj5 = objArr5[A0D3];
                    Object obj6 = objArr5[A0D3 + 1];
                    int A0D4 = r4.A0D(lowestOneBit2);
                    Object[] objArr6 = r4.A02;
                    Object obj7 = objArr6[A0D4];
                    Object obj8 = objArr6[A0D4 + 1];
                    int A0J = AnonymousClass000.A0J(obj5);
                    if (obj7 != null) {
                        i12 = obj7.hashCode();
                    }
                    r10 = A06(r9.A02, obj5, obj6, obj7, obj8, A0J, i12, i + 5);
                }
                objArr3[length2] = r10;
                i11++;
                i5 ^= lowestOneBit2;
            }
            while (i8 != 0) {
                int lowestOneBit3 = Integer.lowestOneBit(i8);
                int i14 = i10 * 2;
                if ((r4.A00 & lowestOneBit3) != 0) {
                    int A0D5 = r4.A0D(lowestOneBit3);
                    Object[] objArr7 = r6.A02;
                    Object[] objArr8 = r4.A02;
                    objArr7[i14] = objArr8[A0D5];
                    objArr7[i14 + 1] = objArr8[A0D5 + 1];
                    if ((this.A00 & lowestOneBit3) != 0) {
                        r5.A00++;
                    }
                } else {
                    int A0D6 = A0D(lowestOneBit3);
                    Object[] objArr9 = r6.A02;
                    Object[] objArr10 = this.A02;
                    objArr9[i14] = objArr10[A0D6];
                    objArr9[i14 + 1] = objArr10[A0D6 + 1];
                }
                i10++;
                i8 ^= lowestOneBit3;
            }
            if (A07(r6)) {
                return this;
            }
            if (r4.A07(r6)) {
                return r4;
            }
            return r6;
        }
        throw AnonymousClass001.A09("Check failed.");
    }

    public final AnonymousClass6YE A0I(C1513479e r11, Object obj, int i, int i2) {
        AnonymousClass6YE A0I;
        int i3 = 1 << ((i >> i2) & 31);
        if ((this.A00 & i3) != 0) {
            int A0D = A0D(i3);
            if (A08(this, obj, A0D)) {
                return A02(r11, A0D, i3);
            }
        } else if ((this.A01 & i3) != 0) {
            int A0E = A0E(i3);
            AnonymousClass6YE A0G = A0G(A0E);
            if (i2 == 30) {
                C11020fb A1A = C90514aH.A1A(0, A0G.A02.length);
                int i4 = A1A.A00;
                int i5 = A1A.A01;
                int i6 = A1A.A02;
                if (i6 <= 0 ? !(i6 >= 0 || i5 > i4) : i4 <= i5) {
                    while (true) {
                        if (!A08(A0G, obj, i4)) {
                            if (i4 == i5) {
                                break;
                            }
                            i4 += i6;
                        } else {
                            A0I = A0G.A01(r11, i4);
                            break;
                        }
                    }
                }
                A0I = A0G;
            } else {
                A0I = A0G.A0I(r11, obj, i, i2 + 5);
            }
            return A04(A0G, A0I, r11.A02, A0E, i3);
        }
        return this;
    }

    public final AnonymousClass6YE A0J(C1513479e r22, Object obj, Object obj2, int i, int i2) {
        AnonymousClass6YE A0J;
        Object[] A0K;
        int i3 = i;
        int i4 = i2;
        int i5 = 1 << ((i >> i2) & 31);
        C1513479e r4 = r22;
        Object obj3 = obj;
        Object obj4 = obj2;
        if (AnonymousClass000.A1P(this.A00 & i5)) {
            int A0D = A0D(i5);
            if (A08(this, obj3, A0D)) {
                Object[] objArr = this.A02;
                int i6 = A0D + 1;
                Object obj5 = objArr[i6];
                r4.A03 = obj5;
                if (obj5 != obj4) {
                    if (this.A03 == r4.A02) {
                        objArr[i6] = obj2;
                        return this;
                    }
                    r4.A00++;
                    Object[] A0K2 = AnonymousClass00C.A0K(objArr, objArr.length);
                    A0K2[i6] = obj2;
                    return new AnonymousClass6YE(r4.A02, A0K2, this.A00, this.A01);
                }
            } else {
                r4.A05(r4.size() + 1);
                AnonymousClass5WG r10 = r4.A02;
                AnonymousClass5WG r0 = this.A03;
                Object[] A0A = A0A(r10, obj3, obj4, A0D, i5, i3, i4);
                if (r0 != r10) {
                    return new AnonymousClass6YE(r10, A0A, this.A00 ^ i5, i5 | this.A01);
                }
                this.A02 = A0A;
                this.A00 ^= i5;
                this.A01 |= i5;
                return this;
            }
        } else if ((this.A01 & i5) != 0) {
            int A0E = A0E(i5);
            AnonymousClass6YE A0G = A0G(A0E);
            if (i4 == 30) {
                C11020fb A1A = C90514aH.A1A(0, A0G.A02.length);
                int i7 = A1A.A00;
                int i8 = A1A.A01;
                int i9 = A1A.A02;
                if (i9 <= 0 ? !(i9 >= 0 || i8 > i7) : i7 <= i8) {
                    while (true) {
                        if (!A08(A0G, obj3, i7)) {
                            if (i7 == i8) {
                                break;
                            }
                            i7 += i9;
                        } else {
                            Object[] objArr2 = A0G.A02;
                            int i10 = i7 + 1;
                            r4.A03 = objArr2[i10];
                            if (A0G.A03 == r4.A02) {
                                objArr2[i10] = obj2;
                                A0J = A0G;
                            } else {
                                r4.A00++;
                                A0K = AnonymousClass00C.A0K(objArr2, objArr2.length);
                                A0K[i10] = obj2;
                            }
                        }
                    }
                }
                r4.A05(r4.size() + 1);
                A0K = A0B(obj3, obj4, A0G.A02, 0);
                A0J = new AnonymousClass6YE(r4.A02, A0K, 0, 0);
            } else {
                int i11 = i3;
                A0J = A0G.A0J(r4, obj3, obj4, i11, i2 + 5);
            }
            if (A0G != A0J) {
                return A05(A0J, r4.A02, A0E);
            }
        } else {
            r4.A05(r4.size() + 1);
            AnonymousClass5WG r3 = r4.A02;
            int A0D2 = A0D(i5);
            AnonymousClass5WG r1 = this.A03;
            Object[] objArr3 = this.A02;
            if (r1 != r3) {
                return new AnonymousClass6YE(r3, A0B(obj3, obj4, objArr3, A0D2), i5 | this.A00, this.A01);
            }
            this.A02 = A0B(obj3, obj4, objArr3, A0D2);
            this.A00 = i5 | this.A00;
            return this;
        }
        return this;
    }

    public final AnonymousClass6YE A0K(C1513479e r18, Object obj, Object obj2, int i, int i2) {
        AnonymousClass6YE A0K;
        int i3 = i2;
        int i4 = i;
        int i5 = 1 << ((i >> i2) & 31);
        C1513479e r12 = r18;
        Object obj3 = obj;
        Object obj4 = obj2;
        if (AnonymousClass000.A1P(this.A00 & i5)) {
            int A0D = A0D(i5);
            if (A08(this, obj3, A0D) && AnonymousClass00C.A0J(obj4, this.A02[A0D + 1])) {
                return A02(r12, A0D, i5);
            }
        } else if ((this.A01 & i5) != 0) {
            int A0E = A0E(i5);
            AnonymousClass6YE A0G = A0G(A0E);
            if (i3 == 30) {
                C11020fb A1A = C90514aH.A1A(0, A0G.A02.length);
                int i6 = A1A.A00;
                int i7 = A1A.A01;
                int i8 = A1A.A02;
                if (i8 <= 0 ? !(i8 >= 0 || i7 > i6) : i6 <= i7) {
                    while (true) {
                        if (!A08(A0G, obj3, i6) || !AnonymousClass00C.A0J(obj4, A0G.A02[i6 + 1])) {
                            if (i6 == i7) {
                                break;
                            }
                            i6 += i8;
                        } else {
                            A0K = A0G.A01(r12, i6);
                            break;
                        }
                    }
                }
                A0K = A0G;
            } else {
                A0K = A0G.A0K(r12, obj3, obj4, i4, i2 + 5);
            }
            return A04(A0G, A0K, r12.A02, A0E, i5);
        }
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007d, code lost:
        if (r6 == null) goto L_0x007f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass6YE A0L(java.lang.Object r8, int r9, int r10) {
        /*
            r7 = this;
            int r0 = r9 >> r10
            r0 = r0 & 31
            r3 = 1
            int r3 = r3 << r0
            int r0 = r7.A00
            r0 = r0 & r3
            if (r0 == 0) goto L_0x002b
            int r4 = r7.A0D(r3)
            boolean r0 = A08(r7, r8, r4)
            if (r0 == 0) goto L_0x00a1
            java.lang.Object[] r2 = r7.A02
            int r1 = r2.length
            r0 = 2
            if (r1 == r0) goto L_0x009f
            java.lang.Object[] r2 = A0C(r2, r4)
            int r0 = r7.A00
            r3 = r3 ^ r0
            int r1 = r7.A01
            r0 = 0
            X.6YE r4 = new X.6YE
            r4.<init>(r0, r2, r3, r1)
            return r4
        L_0x002b:
            int r0 = r7.A01
            r0 = r0 & r3
            if (r0 == 0) goto L_0x00a1
            int r4 = r7.A0E(r3)
            X.6YE r5 = r7.A0G(r4)
            r0 = 30
            if (r10 != r0) goto L_0x0077
            java.lang.Object[] r0 = r5.A02
            int r1 = r0.length
            r0 = 0
            X.0fb r0 = X.C90514aH.A1A(r0, r1)
            int r6 = r0.A00
            int r2 = r0.A01
            int r1 = r0.A02
            if (r1 <= 0) goto L_0x0056
            if (r6 <= r2) goto L_0x005a
        L_0x004e:
            r6 = r5
        L_0x004f:
            if (r5 == r6) goto L_0x009e
            X.6YE r4 = r7.A03(r6, r4, r3)
            return r4
        L_0x0056:
            if (r1 >= 0) goto L_0x004e
            if (r2 > r6) goto L_0x004e
        L_0x005a:
            boolean r0 = A08(r5, r8, r6)
            if (r0 == 0) goto L_0x0072
            java.lang.Object[] r2 = r5.A02
            int r1 = r2.length
            r0 = 2
            if (r1 == r0) goto L_0x007f
            java.lang.Object[] r2 = A0C(r2, r6)
            r1 = 0
            r0 = 0
            X.6YE r6 = new X.6YE
            r6.<init>(r0, r2, r1, r1)
            goto L_0x004f
        L_0x0072:
            r0 = r6
            int r6 = r6 + r1
            if (r0 != r2) goto L_0x005a
            goto L_0x004e
        L_0x0077:
            int r0 = r10 + 5
            X.6YE r6 = r5.A0L(r8, r9, r0)
            if (r6 != 0) goto L_0x004f
        L_0x007f:
            java.lang.Object[] r5 = r7.A02
            int r1 = r5.length
            r0 = 1
            if (r1 == r0) goto L_0x009f
            int r0 = r1 + -1
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r0 = 0
            X.AnonymousClass02Q.A05(r5, r0, r2, r0, r4)
            int r0 = r4 + 1
            X.AnonymousClass02Q.A05(r5, r4, r2, r0, r1)
            int r1 = r7.A00
            int r0 = r7.A01
            r3 = r3 ^ r0
            r0 = 0
            X.6YE r4 = new X.6YE
            r4.<init>(r0, r2, r1, r3)
            return r4
        L_0x009e:
            return r7
        L_0x009f:
            r4 = 0
            return r4
        L_0x00a1:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6YE.A0L(java.lang.Object, int, int):X.6YE");
    }

    public final Object A0M(Object obj, int i, int i2) {
        Object[] objArr;
        int i3;
        int i4 = 1 << ((i >> i2) & 31);
        if (AnonymousClass000.A1P(this.A00 & i4)) {
            int A0D = A0D(i4);
            if (A08(this, obj, A0D)) {
                objArr = this.A02;
                i3 = A0D + 1;
            }
            return null;
        }
        if ((this.A01 & i4) != 0) {
            AnonymousClass6YE A0G = A0G(A0E(i4));
            if (i2 != 30) {
                return A0G.A0M(obj, i, i2 + 5);
            }
            C11020fb A1A = C90514aH.A1A(0, A0G.A02.length);
            int i5 = A1A.A00;
            int i6 = A1A.A01;
            int i7 = A1A.A02;
            if (i7 > 0) {
                if (i5 > i6) {
                    return null;
                }
            } else if (i7 >= 0 || i6 > i5) {
                return null;
            }
            while (!A08(A0G, obj, i5)) {
                if (i5 == i6) {
                    return null;
                }
                i5 += i7;
            }
            objArr = A0G.A02;
            i3 = i5 + 1;
        }
        return null;
        return objArr[i3];
    }

    public final boolean A0N(Object obj, int i, int i2) {
        int i3 = 1 << ((i >> i2) & 31);
        if ((this.A00 & i3) != 0) {
            return A08(this, obj, A0D(i3));
        }
        if ((this.A01 & i3) == 0) {
            return false;
        }
        AnonymousClass6YE A0G = A0G(A0E(i3));
        if (i2 == 30) {
            return A0G.A09(obj);
        }
        return A0G.A0N(obj, i, i2 + 5);
    }

    public AnonymousClass6YE(AnonymousClass5WG r1, Object[] objArr, int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        this.A03 = r1;
        this.A02 = objArr;
    }

    private final AnonymousClass6YE A01(C1513479e r5, int i) {
        r5.A05(r5.size() - 1);
        Object[] objArr = this.A02;
        r5.A03 = objArr[i + 1];
        if (objArr.length == 2) {
            return null;
        }
        if (this.A03 == r5.A02) {
            this.A02 = A0C(objArr, i);
            return this;
        }
        return new AnonymousClass6YE(r5.A02, A0C(objArr, i), 0, 0);
    }

    private final AnonymousClass6YE A02(C1513479e r5, int i, int i2) {
        r5.A05(r5.size() - 1);
        Object[] objArr = this.A02;
        r5.A03 = objArr[i + 1];
        if (objArr.length == 2) {
            return null;
        }
        if (this.A03 == r5.A02) {
            this.A02 = A0C(objArr, i);
            this.A00 ^= i2;
            return this;
        }
        return new AnonymousClass6YE(r5.A02, A0C(objArr, i), i2 ^ this.A00, this.A01);
    }
}
