package X;

import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.96s  reason: invalid class name and case insensitive filesystem */
public abstract class C1900596s {
    public static void A00(C21224ADg aDg, byte[] bArr, boolean z) {
        Set set;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        short s = wrap.getShort();
        wrap.get(new byte[32]);
        byte[] bArr2 = new byte[((short) ((short) (wrap.get() & 255)))];
        wrap.get(bArr2);
        short s2 = wrap.getShort();
        byte b = wrap.get();
        C199829g5 r6 = new C199829g5(C203439o1.A0C(wrap));
        C194619Ql A00 = r6.A00(43);
        if (A00 != null) {
            Set set2 = AnonymousClass9BG.A01;
            byte[] bArr3 = A00.A01;
            if (set2.contains(Short.valueOf((short) C203439o1.A02(bArr3)))) {
                byte[] bArr4 = aDg.A01;
                if (bArr4 == null || C203439o1.A06(bArr3, bArr4)) {
                    if (z) {
                        set = AnonymousClass9BG.A02;
                    } else {
                        set = AnonymousClass9BG.A03;
                    }
                    HashSet A0k = C90524aI.A0k(r6.A03.keySet());
                    A0k.removeAll(set);
                    if (A0k.size() != 0) {
                        throw C165567td.A0E("Unexpected extension provided by the server", (byte) 47);
                    }
                    Short sh = AnonymousClass9BG.A00;
                    if (s != 771) {
                        StringBuilder A0u = AnonymousClass000.A0u();
                        C36351kA.A1M("Unexpected protocol version", " != ", A0u, s);
                        A0u.append(sh);
                        throw C165567td.A0D(A0u, (byte) 80);
                    } else if (C203439o1.A06(aDg.A0m, bArr2)) {
                        short s3 = aDg.A00;
                        if (s3 != 0 && s3 != s2) {
                            throw C165567td.A0E("Cipher suite in server hello does not match HelloRetryRequest cipher suite.", (byte) 47);
                        } else if (s2 != 4865) {
                            throw C165567td.A0E("Server selected invalid cipher suite", (byte) 80);
                        } else if (b == 0) {
                            C194619Ql A002 = r6.A00(51);
                            if (A002 != null) {
                                ByteBuffer wrap2 = ByteBuffer.wrap(A002.A01);
                                short s4 = wrap2.getShort();
                                if (s4 == 29) {
                                    if (!z) {
                                        byte[] bArr5 = new byte[2];
                                        wrap2.get(bArr5);
                                        int A02 = C203439o1.A02(bArr5);
                                        if (A02 == 32) {
                                            byte[] bArr6 = new byte[32];
                                            aDg.A0n = bArr6;
                                            wrap2.get(bArr6);
                                        } else {
                                            StringBuilder A0u2 = AnonymousClass000.A0u();
                                            C90464aC.A1K("Key length mismatch ", " != ", A0u2, A02, 32);
                                            throw C165567td.A0D(A0u2, (byte) 80);
                                        }
                                    }
                                    C194619Ql A003 = r6.A00(41);
                                    if (!(aDg.A0E.A01 == null || A003 == null)) {
                                        if (C203439o1.A02(A003.A01) <= 0) {
                                            aDg.A0c = true;
                                            aDg.A0h = true;
                                        } else {
                                            StringBuilder A0u3 = AnonymousClass000.A0u();
                                            A0u3.append("Incorrect PSK index value chosen by server ");
                                            A0u3.append(A003);
                                            throw C165567td.A0D(A0u3, (byte) 80);
                                        }
                                    }
                                    if (z) {
                                        aDg.A01 = bArr3;
                                        aDg.A00 = s2;
                                        aDg.A0X = s4;
                                        C194619Ql A004 = r6.A00(44);
                                        if (A004 != null) {
                                            aDg.A0l = C203439o1.A0C(ByteBuffer.wrap(A004.A01));
                                        }
                                    }
                                    if (wrap.hasRemaining()) {
                                        throw C165567td.A0E("Server Hello has more bytes than expected.", (byte) 80);
                                    }
                                    return;
                                }
                                throw C165567td.A0E("Key share algorithm mismatch.", (byte) 80);
                            }
                            throw C165567td.A0E("Key share extension not found.", (byte) 109);
                        } else {
                            throw C165567td.A0E("Invalid compression method.0", (byte) 80);
                        }
                    } else {
                        throw C165567td.A0E("Bad session id", (byte) 80);
                    }
                } else {
                    throw C165567td.A0E("Supported version in server hello does not match HelloRetryRequest supported version.", (byte) 47);
                }
            } else {
                throw C165567td.A0E("Server sent an unsupported version.", (byte) 110);
            }
        } else {
            throw C165567td.A0E("Supported version extension not found.", (byte) 109);
        }
    }
}
