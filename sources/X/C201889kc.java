package X;

import android.util.Pair;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.util.List;

/* renamed from: X.9kc  reason: invalid class name and case insensitive filesystem */
public abstract class C201889kc {
    public static final InetSocketAddress A00;
    public static final InetSocketAddress A01;

    static {
        try {
            A00 = new InetSocketAddress(InetAddress.getByAddress(new byte[]{8, 8, 8, 8}), 53);
            A01 = new InetSocketAddress(InetAddress.getByAddress(new byte[]{8, 8, 4, 4}), 53);
        } catch (UnknownHostException e) {
            throw new Error(e);
        }
    }

    public static void A02(C203109nK r14, C203109nK r15, String str, List list, byte[] bArr, int i) {
        short length;
        C203109nK r8 = r15;
        AnonymousClass9OQ r2 = r15.A01;
        String str2 = str;
        if (r2.A01 != r14.A01.A01) {
            throw new UnknownHostException(AnonymousClass000.A0p("received response with unexpected id while trying to resolve ", str2, AnonymousClass000.A0u()));
        } else if (!r2.A0A) {
            throw new UnknownHostException(AnonymousClass000.A0p("did not receive response from server while trying to resolve ", str2, AnonymousClass000.A0u()));
        } else if (r2.A0B) {
            throw new UnknownHostException(AnonymousClass000.A0p("received truncated response while trying to resolve ", str2, AnonymousClass000.A0u()));
        } else if (r2.A06 == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            AnonymousClass9NA r7 = null;
            int i2 = 0;
            while (true) {
                AnonymousClass9NA[] r1 = r8.A02;
                List list2 = list;
                if (i2 < r1.length) {
                    AnonymousClass9NA r22 = r1[i2];
                    if (r22.A03 == 1) {
                        if (r22.A04 == 5) {
                            r7 = r22;
                        } else if (r22.A04 != 1 && r22.A04 != 28) {
                            throw new UnknownHostException(AnonymousClass000.A0p("unexpected type returned while trying to resolve ", str2, AnonymousClass000.A0u()));
                        } else if (r22.A04 == 1 && ((short) r22.A05.length) != 4) {
                            throw new UnknownHostException(C36321k7.A0D("unexpected record length returned while trying to resolve ", str2));
                        } else if (r22.A04 != 28 || (length = (short) r22.A05.length) == 16) {
                            C201099is r142 = r22.A02;
                            StringBuilder A0u = AnonymousClass000.A0u();
                            String[] strArr = r142.A02;
                            int length2 = strArr.length;
                            for (int i3 = 0; i3 < length2; i3++) {
                                C165617ti.A0g(A0u, strArr, i3);
                                A0u.append('.');
                            }
                            short s = r142.A01;
                            if (s != 0) {
                                String[] strArr2 = C201099is.A00(r8.A00, s).A02;
                                int length3 = strArr2.length;
                                for (int i4 = 0; i4 < length3; i4++) {
                                    C165617ti.A0g(A0u, strArr2, i4);
                                    A0u.append('.');
                                }
                            }
                            if (A0u.length() > 0) {
                                A0u.setLength(A0u.length() - 1);
                            }
                            list2.add(new C194569Qg(InetAddress.getByAddress(A0u.toString(), r22.A05), C36371kC.A07(r22.A01) + currentTimeMillis));
                            list2.get(C36421kH.A06(list2, 1));
                        } else {
                            throw new UnknownHostException(AnonymousClass000.A0r(" ", C36331k8.A0k("unexpected record length returned while trying to resolve ", str2), length));
                        }
                        i2++;
                    } else {
                        throw new UnknownHostException(AnonymousClass000.A0p("unexpected class returned while trying to resolve ", str2, AnonymousClass000.A0u()));
                    }
                } else if (list2.isEmpty() && r7 != null) {
                    Pair A002 = A00(r7.A05, 0);
                    StringBuilder sb = (StringBuilder) A002.first;
                    int A03 = C36381kD.A03(A002);
                    if (A03 != -1) {
                        sb.append((CharSequence) A00(bArr, A03).first);
                    }
                    String obj = sb.toString();
                    if (!obj.equals(str2)) {
                        list2.addAll(A01(obj, i + 1));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
        } else {
            throw new UnknownHostException(AnonymousClass000.A0p("error code was set in response while trying to resolve ", str2, AnonymousClass000.A0u()));
        }
    }

    public static Pair A00(byte[] bArr, int i) {
        int length;
        if (i < 0 || i >= (length = bArr.length)) {
            throw new UnknownHostException("offset is outside of the data array");
        }
        int i2 = -1;
        CharsetDecoder newDecoder = Charset.forName("UTF8").newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        newDecoder.onMalformedInput(codingErrorAction);
        newDecoder.onUnmappableCharacter(codingErrorAction);
        StringBuilder A0u = AnonymousClass000.A0u();
        while (true) {
            byte b = bArr[i];
            int i3 = i + 1;
            if (((b >> 6) & 3) != 3) {
                if (b == 0) {
                    break;
                }
                i = i3 + b;
                if (i < length) {
                    try {
                        C36351kA.A1K(newDecoder.decode(ByteBuffer.wrap(bArr, i3, b)), A0u);
                        A0u.append(".");
                    } catch (CharacterCodingException unused) {
                        throw new UnknownHostException("failed to parse canonical name");
                    }
                } else {
                    throw new UnknownHostException("failed to parse canonical name");
                }
            } else {
                int i4 = (b & 63) << 8;
                if (i3 < length) {
                    i2 = i4 + bArr[i3];
                } else {
                    throw new UnknownHostException("offset is outside of the data array, when getting a pointer");
                }
            }
        }
        return C36341k9.A0I(A0u, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x014b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList A01(java.lang.String r19, int r20) {
        /*
            java.lang.String r14 = " ms timeout"
            java.lang.String r15 = " with "
            java.lang.String r17 = "timed out while querying "
            java.lang.String r16 = "querying "
            java.lang.String r5 = " for "
            r1 = 2
            r18 = r20
            r0 = r18
            if (r0 >= r1) goto L_0x01bf
            java.security.SecureRandom r0 = X.C203109nK.A04
            java.lang.String r7 = "\\."
            r3 = r19
            java.lang.String[] r0 = r3.split(r7)
            r6 = 1
            X.9Lm[] r8 = new X.C193449Lm[r6]
            r4 = 0
            X.9is r2 = X.C201099is.A01(r0)
            int r0 = r2.A00
            int r1 = r0 + 4
            X.9Lm r0 = new X.9Lm
            r0.<init>(r2, r1, r6, r6)
            r8[r4] = r0
            X.9nK r10 = X.C203109nK.A01(r8)
            byte[] r12 = r10.A05()
            r4 = 512(0x200, float:7.175E-43)
            byte[] r9 = new byte[r4]
            java.net.DatagramPacket r11 = new java.net.DatagramPacket
            r11.<init>(r9, r4)
            java.lang.String[] r0 = r3.split(r7)
            r8 = 1
            X.9Lm[] r7 = new X.C193449Lm[r6]
            r13 = 0
            X.9is r6 = X.C201099is.A01(r0)
            r2 = 28
            int r0 = r6.A00
            int r1 = r0 + 4
            X.9Lm r0 = new X.9Lm
            r0.<init>(r6, r1, r2, r8)
            r7[r13] = r0
            X.9nK r8 = X.C203109nK.A01(r7)
            byte[] r6 = r8.A05()
            byte[] r7 = new byte[r4]
            java.net.DatagramPacket r2 = new java.net.DatagramPacket
            r2.<init>(r7, r4)
            java.net.DatagramSocket r4 = new java.net.DatagramSocket     // Catch:{ IOException -> 0x019a }
            r4.<init>()     // Catch:{ IOException -> 0x019a }
            java.lang.StringBuilder r13 = X.AnonymousClass000.A0v(r16)     // Catch:{ InterruptedIOException -> 0x00a4 }
            java.net.InetSocketAddress r1 = A00     // Catch:{ InterruptedIOException -> 0x00a4 }
            r13.append(r1)     // Catch:{ InterruptedIOException -> 0x00a4 }
            X.AnonymousClass000.A1D(r5, r3, r15, r13)     // Catch:{ InterruptedIOException -> 0x00a4 }
            r0 = 20000(0x4e20, float:2.8026E-41)
            r13.append(r0)     // Catch:{ InterruptedIOException -> 0x00a4 }
            X.C36321k7.A1a(r13, r14)     // Catch:{ InterruptedIOException -> 0x00a4 }
            r4.connect(r1)     // Catch:{ InterruptedIOException -> 0x00a4 }
            r0 = 10000(0x2710, float:1.4013E-41)
            r4.setSoTimeout(r0)     // Catch:{ InterruptedIOException -> 0x00a4 }
            int r1 = r12.length     // Catch:{ InterruptedIOException -> 0x00a4 }
            java.net.DatagramPacket r0 = new java.net.DatagramPacket     // Catch:{ InterruptedIOException -> 0x00a4 }
            r0.<init>(r12, r1)     // Catch:{ InterruptedIOException -> 0x00a4 }
            r4.send(r0)     // Catch:{ InterruptedIOException -> 0x00a4 }
            X.C18740tg.A06(r6)     // Catch:{ InterruptedIOException -> 0x00a4 }
            int r1 = r6.length     // Catch:{ InterruptedIOException -> 0x00a4 }
            java.net.DatagramPacket r0 = new java.net.DatagramPacket     // Catch:{ InterruptedIOException -> 0x00a4 }
            r0.<init>(r6, r1)     // Catch:{ InterruptedIOException -> 0x00a4 }
            r4.send(r0)     // Catch:{ InterruptedIOException -> 0x00a4 }
            r4.receive(r2)     // Catch:{ InterruptedIOException -> 0x00a4 }
            r4.receive(r11)     // Catch:{ InterruptedIOException -> 0x00a4 }
            goto L_0x00f2
        L_0x00a4:
            r1 = move-exception
            java.lang.StringBuilder r13 = X.AnonymousClass000.A0v(r17)     // Catch:{ all -> 0x0190 }
            java.net.InetSocketAddress r0 = A00     // Catch:{ all -> 0x0190 }
            r13.append(r0)     // Catch:{ all -> 0x0190 }
            java.lang.String r0 = X.AnonymousClass000.A0p(r5, r3, r13)     // Catch:{ all -> 0x0190 }
            com.whatsapp.util.Log.i(r0, r1)     // Catch:{ all -> 0x0190 }
            r4.disconnect()     // Catch:{ AssertionError -> 0x018e }
            java.lang.StringBuilder r13 = X.AnonymousClass000.A0v(r16)     // Catch:{ InterruptedIOException -> 0x016d }
            java.net.InetSocketAddress r1 = A01     // Catch:{ InterruptedIOException -> 0x016d }
            r13.append(r1)     // Catch:{ InterruptedIOException -> 0x016d }
            X.AnonymousClass000.A1D(r5, r3, r15, r13)     // Catch:{ InterruptedIOException -> 0x016d }
            r0 = 20000(0x4e20, float:2.8026E-41)
            r13.append(r0)     // Catch:{ InterruptedIOException -> 0x016d }
            X.C36321k7.A1a(r13, r14)     // Catch:{ InterruptedIOException -> 0x016d }
            r4.connect(r1)     // Catch:{ InterruptedIOException -> 0x016d }
            r0 = 10000(0x2710, float:1.4013E-41)
            r4.setSoTimeout(r0)     // Catch:{ InterruptedIOException -> 0x016d }
            X.C18740tg.A06(r12)     // Catch:{ InterruptedIOException -> 0x016d }
            int r1 = r12.length     // Catch:{ InterruptedIOException -> 0x016d }
            java.net.DatagramPacket r0 = new java.net.DatagramPacket     // Catch:{ InterruptedIOException -> 0x016d }
            r0.<init>(r12, r1)     // Catch:{ InterruptedIOException -> 0x016d }
            r4.send(r0)     // Catch:{ InterruptedIOException -> 0x016d }
            X.C18740tg.A06(r6)     // Catch:{ InterruptedIOException -> 0x016d }
            int r1 = r6.length     // Catch:{ InterruptedIOException -> 0x016d }
            java.net.DatagramPacket r0 = new java.net.DatagramPacket     // Catch:{ InterruptedIOException -> 0x016d }
            r0.<init>(r6, r1)     // Catch:{ InterruptedIOException -> 0x016d }
            r4.send(r0)     // Catch:{ InterruptedIOException -> 0x016d }
            r4.receive(r2)     // Catch:{ InterruptedIOException -> 0x016d }
            r4.receive(r11)     // Catch:{ InterruptedIOException -> 0x016d }
        L_0x00f2:
            r4.close()     // Catch:{ IOException -> 0x019a }
            X.9nK r6 = X.C203109nK.A00(r9)     // Catch:{ 12y -> 0x016b, RuntimeException -> 0x0157 }
            X.9nK r5 = X.C203109nK.A00(r7)     // Catch:{ 12y -> 0x016b, RuntimeException -> 0x0157 }
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            X.9OQ r0 = r10.A01
            short r1 = r0.A01
            X.9OQ r0 = r6.A01
            short r2 = r0.A01
            if (r2 != r1) goto L_0x0142
            r14 = r9
            r11 = r6
        L_0x010d:
            r12 = r3
            r13 = r4
            r15 = r18
            A02(r10, r11, r12, r13, r14, r15)
        L_0x0114:
            X.C18740tg.A06(r8)
            X.9OQ r0 = r8.A01
            short r1 = r0.A01
            if (r2 == r1) goto L_0x0125
            X.9OQ r0 = r5.A01
            short r0 = r0.A01
            if (r0 != r1) goto L_0x012d
            r9 = r7
            r6 = r5
        L_0x0125:
            r1 = r8
            r2 = r6
            r5 = r9
            r6 = r18
            A02(r1, r2, r3, r4, r5, r6)
        L_0x012d:
            boolean r0 = r4.isEmpty()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            if (r0 != 0) goto L_0x014b
            java.lang.String r0 = "resolved "
            X.C36341k9.A1N(r0, r1, r4)
            java.lang.String r0 = " addresses using backup DNS for "
            X.C36321k7.A1Q(r0, r3, r1)
            return r4
        L_0x0142:
            X.9OQ r0 = r5.A01
            short r0 = r0.A01
            if (r0 != r1) goto L_0x0114
            r14 = r7
            r11 = r5
            goto L_0x010d
        L_0x014b:
            java.lang.String r0 = "no addresses found for "
            java.lang.String r1 = X.AnonymousClass000.A0p(r0, r3, r1)
            java.net.UnknownHostException r0 = new java.net.UnknownHostException
            r0.<init>(r1)
            throw r0
        L_0x0157:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "unexpected runtime exception: "
            java.lang.String r0 = X.C36331k8.A0i(r0, r1, r2)
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.12y r0 = new X.12y
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x016b:
            r0 = move-exception
            throw r0
        L_0x016d:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r17)     // Catch:{ all -> 0x0190 }
            java.net.InetSocketAddress r0 = A01     // Catch:{ all -> 0x0190 }
            r1.append(r0)     // Catch:{ all -> 0x0190 }
            java.lang.String r0 = X.AnonymousClass000.A0p(r5, r3, r1)     // Catch:{ all -> 0x0190 }
            com.whatsapp.util.Log.i(r0, r2)     // Catch:{ all -> 0x0190 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0190 }
            java.lang.String r0 = "timeout while trying to resolve "
            java.lang.String r1 = X.AnonymousClass000.A0p(r0, r3, r1)     // Catch:{ all -> 0x0190 }
            java.net.UnknownHostException r0 = new java.net.UnknownHostException     // Catch:{ all -> 0x0190 }
            r0.<init>(r1)     // Catch:{ all -> 0x0190 }
            throw r0     // Catch:{ all -> 0x0190 }
        L_0x018e:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0190 }
        L_0x0190:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0195 }
            goto L_0x0199
        L_0x0195:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x019a }
        L_0x0199:
            throw r1     // Catch:{ IOException -> 0x019a }
        L_0x019a:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "unexpected IOException "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " while trying to resolve "
            r1.append(r0)
            X.C36351kA.A1P(r3, r1, r2)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ioexception while trying to resolve "
            java.lang.String r1 = X.AnonymousClass000.A0p(r0, r3, r1)
            java.net.UnknownHostException r0 = new java.net.UnknownHostException
            r0.<init>(r1)
            throw r0
        L_0x01bf:
            java.lang.String r1 = "failed to resolve cnames"
            java.net.UnknownHostException r0 = new java.net.UnknownHostException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C201889kc.A01(java.lang.String, int):java.util.ArrayList");
    }
}
