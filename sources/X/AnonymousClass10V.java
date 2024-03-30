package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.10V  reason: invalid class name */
public abstract class AnonymousClass10V {
    public static long A00(AnonymousClass10T r1, ByteBuffer byteBuffer, long j) {
        A01(r1, byteBuffer, 4, j);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }

    public static void A01(AnonymousClass10T r3, ByteBuffer byteBuffer, int i, long j) {
        int Bmn;
        byteBuffer.position(0);
        byteBuffer.limit(i);
        while (byteBuffer.remaining() > 0 && (Bmn = r3.Bmn(byteBuffer, j)) != -1) {
            j += (long) Bmn;
        }
        if (byteBuffer.remaining() <= 0) {
            byteBuffer.position(0);
            return;
        }
        throw new C82203yK("ELF file truncated");
    }

    public static String[] A02(AnonymousClass10T r31) {
        long j;
        int i;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        AnonymousClass10T r9 = r31;
        long A00 = A00(r9, allocate, 0);
        if (A00 == 1179403647) {
            A01(r9, allocate, 1, 4);
            boolean z = true;
            if (((short) (allocate.get() & 255)) != 1) {
                z = false;
            }
            A01(r9, allocate, 1, 5);
            if (((short) (allocate.get() & 255)) == 2) {
                allocate.order(ByteOrder.BIG_ENDIAN);
            }
            if (z) {
                j = A00(r9, allocate, 28);
                i = 2;
                A01(r9, allocate, 2, 44);
                j2 = (long) (allocate.getShort() & 65535);
                j3 = 42;
            } else {
                A01(r9, allocate, 8, 32);
                j = allocate.getLong();
                i = 2;
                A01(r9, allocate, 2, 56);
                j2 = (long) (allocate.getShort() & 65535);
                j3 = 54;
            }
            A01(r9, allocate, i, j3);
            short s = allocate.getShort() & 65535;
            if (j2 == 65535) {
                if (z) {
                    j14 = A00(r9, allocate, 32) + 28;
                } else {
                    A01(r9, allocate, 8, 40);
                    j14 = allocate.getLong() + 44;
                }
                j2 = A00(r9, allocate, j14);
            }
            long j15 = j;
            long j16 = 0;
            while (true) {
                if (j16 >= j2) {
                    break;
                } else if (A00(r9, allocate, j15 + 0) == 2) {
                    if (z) {
                        j4 = A00(r9, allocate, j15 + 4);
                    } else {
                        A01(r9, allocate, 8, j15 + 8);
                        j4 = allocate.getLong();
                    }
                    if (j4 != 0) {
                        long j17 = j4;
                        long j18 = 0;
                        int i2 = 0;
                        do {
                            long j19 = j17 + 0;
                            if (z) {
                                j5 = A00(r9, allocate, j19);
                            } else {
                                A01(r9, allocate, 8, j19);
                                j5 = allocate.getLong();
                            }
                            if (j5 == 1) {
                                if (i2 != Integer.MAX_VALUE) {
                                    i2++;
                                } else {
                                    throw new C82203yK("malformed DT_NEEDED section");
                                }
                            } else if (j5 == 5) {
                                if (z) {
                                    j18 = A00(r9, allocate, j17 + 4);
                                } else {
                                    A01(r9, allocate, 8, j17 + 8);
                                    j18 = allocate.getLong();
                                }
                            }
                            j6 = 16;
                            if (z) {
                                j7 = 8;
                            } else {
                                j7 = 16;
                            }
                            j17 += j7;
                        } while (j5 != 0);
                        if (j18 != 0) {
                            int i3 = 0;
                            while (true) {
                                if (((long) i3) >= j2) {
                                    break;
                                }
                                if (A00(r9, allocate, j + 0) == 1) {
                                    if (z) {
                                        j8 = A00(r9, allocate, j + 8);
                                        j9 = A00(r9, allocate, j + 20);
                                    } else {
                                        A01(r9, allocate, 8, j + j6);
                                        j8 = allocate.getLong();
                                        A01(r9, allocate, 8, j + 40);
                                        j9 = allocate.getLong();
                                    }
                                    if (j8 <= j18 && j18 < j9 + j8) {
                                        if (z) {
                                            j10 = A00(r9, allocate, j + 4);
                                        } else {
                                            A01(r9, allocate, 8, j + 8);
                                            j10 = allocate.getLong();
                                        }
                                        long j20 = j10 + (j18 - j8);
                                        if (j20 != 0) {
                                            String[] strArr = new String[i2];
                                            int i4 = 0;
                                            do {
                                                long j21 = j4 + 0;
                                                if (z) {
                                                    j11 = A00(r9, allocate, j21);
                                                } else {
                                                    A01(r9, allocate, 8, j21);
                                                    j11 = allocate.getLong();
                                                }
                                                if (j11 == 1) {
                                                    if (z) {
                                                        j13 = A00(r9, allocate, j4 + 4);
                                                    } else {
                                                        A01(r9, allocate, 8, j4 + 8);
                                                        j13 = allocate.getLong();
                                                    }
                                                    long j22 = j13 + j20;
                                                    StringBuilder sb = new StringBuilder();
                                                    while (true) {
                                                        long j23 = 1 + j22;
                                                        A01(r9, allocate, 1, j22);
                                                        short s2 = (short) (allocate.get() & 255);
                                                        if (s2 == 0) {
                                                            break;
                                                        }
                                                        sb.append((char) s2);
                                                        j22 = j23;
                                                    }
                                                    strArr[i4] = sb.toString();
                                                    if (i4 != Integer.MAX_VALUE) {
                                                        i4++;
                                                    } else {
                                                        throw new C82203yK("malformed DT_NEEDED section");
                                                    }
                                                }
                                                if (z) {
                                                    j12 = 8;
                                                } else {
                                                    j12 = 16;
                                                }
                                                j4 += j12;
                                            } while (j11 != 0);
                                            if (i4 == i2) {
                                                return strArr;
                                            }
                                            throw new C82203yK("malformed DT_NEEDED section");
                                        }
                                    }
                                }
                                j += (long) s;
                                i3++;
                                j6 = 16;
                            }
                            throw new C82203yK("did not find file offset of DT_STRTAB table");
                        }
                        throw new C82203yK("Dynamic section string-table not found");
                    }
                } else {
                    j15 += (long) s;
                    j16++;
                }
            }
            throw new C82203yK("ELF file does not contain dynamic linking information");
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("file is not ELF: 0x");
        sb2.append(Long.toHexString(A00));
        throw new C82203yK(sb2.toString());
    }
}
