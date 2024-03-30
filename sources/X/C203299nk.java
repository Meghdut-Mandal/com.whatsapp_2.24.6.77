package X;

import android.text.TextUtils;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.jid.Jid;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

/* renamed from: X.9nk  reason: invalid class name and case insensitive filesystem */
public class C203299nk {
    public final AnonymousClass9R9 A00;
    public final C19700wN A01;
    public final C20810yC A02;
    public final AnonymousClass19D A03;

    public static void A02(OutputStream outputStream, int i) {
        int i2 = 0;
        if (i != 0) {
            if (i < 256) {
                outputStream.write(248);
                A03(outputStream, i);
                return;
            } else if (i < 65536) {
                outputStream.write(249);
                outputStream.write((65280 & i) >> 8);
                i2 = i & 255;
            } else {
                throw C90524aI.A0X(AnonymousClass000.A0r("list too long; count=", AnonymousClass000.A0u(), i));
            }
        }
        outputStream.write(i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a3, code lost:
        if ((r5 % 2) != r8) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a5, code lost:
        r4 = r4 - r8;
        r3[r4] = (byte) (r3[r4] | 15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ad, code lost:
        r10.write(r6);
        r10.write(((r5 & 1) << 7) | r3.length);
        r11 = r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A05(java.io.OutputStream r10, byte[] r11, boolean r12) {
        /*
            int r5 = r11.length
            r0 = 1048576(0x100000, float:1.469368E-39)
            if (r5 < r0) goto L_0x002c
            r0 = 254(0xfe, float:3.56E-43)
            r10.write(r0)
            r0 = 2130706432(0x7f000000, float:1.7014118E38)
            r0 = r0 & r5
            int r0 = r0 >> 24
            r10.write(r0)
            r0 = 16711680(0xff0000, float:2.3418052E-38)
        L_0x0014:
            r0 = r0 & r5
            int r0 = r0 >> 16
            r10.write(r0)
            r0 = 65280(0xff00, float:9.1477E-41)
            r0 = r0 & r5
            int r0 = r0 >> 8
            r10.write(r0)
            r0 = r5 & 255(0xff, float:3.57E-43)
            r10.write(r0)
        L_0x0028:
            r10.write(r11)
            return
        L_0x002c:
            r0 = 256(0x100, float:3.59E-43)
            if (r5 < r0) goto L_0x0038
            r0 = 253(0xfd, float:3.55E-43)
            r10.write(r0)
            r0 = 983040(0xf0000, float:1.377532E-39)
            goto L_0x0014
        L_0x0038:
            if (r12 == 0) goto L_0x005f
            r6 = 255(0xff, float:3.57E-43)
            r0 = 128(0x80, float:1.794E-43)
            if (r5 >= r0) goto L_0x005f
            int r0 = r5 + 1
            int r4 = r0 / 2
            byte[] r3 = new byte[r4]
            r9 = 0
        L_0x0047:
            r8 = 1
            if (r9 >= r5) goto L_0x00a1
            byte r0 = r11[r9]
            switch(r0) {
                case 45: goto L_0x0086;
                case 46: goto L_0x0086;
                case 47: goto L_0x004f;
                case 48: goto L_0x0083;
                case 49: goto L_0x0083;
                case 50: goto L_0x0083;
                case 51: goto L_0x0083;
                case 52: goto L_0x0083;
                case 53: goto L_0x0083;
                case 54: goto L_0x0083;
                case 55: goto L_0x0083;
                case 56: goto L_0x0083;
                case 57: goto L_0x0083;
                case 58: goto L_0x008e;
                default: goto L_0x004f;
            }
        L_0x004f:
            r6 = 251(0xfb, float:3.52E-43)
            byte[] r3 = new byte[r4]
            r9 = 0
        L_0x0054:
            r8 = 1
            if (r9 >= r5) goto L_0x00a1
            byte r0 = r11[r9]
            switch(r0) {
                case 48: goto L_0x0068;
                case 49: goto L_0x0068;
                case 50: goto L_0x0068;
                case 51: goto L_0x0068;
                case 52: goto L_0x0068;
                case 53: goto L_0x0068;
                case 54: goto L_0x0068;
                case 55: goto L_0x0068;
                case 56: goto L_0x0068;
                case 57: goto L_0x0068;
                default: goto L_0x005c;
            }
        L_0x005c:
            switch(r0) {
                case 65: goto L_0x006b;
                case 66: goto L_0x006b;
                case 67: goto L_0x006b;
                case 68: goto L_0x006b;
                case 69: goto L_0x006b;
                case 70: goto L_0x006b;
                default: goto L_0x005f;
            }
        L_0x005f:
            r0 = 252(0xfc, float:3.53E-43)
            r10.write(r0)
            A03(r10, r5)
            goto L_0x0028
        L_0x0068:
            int r7 = r0 + -48
            goto L_0x006f
        L_0x006b:
            int r0 = r0 + -65
            int r7 = r0 + 10
        L_0x006f:
            r0 = -1
            if (r7 == r0) goto L_0x005f
            int r2 = r9 / 2
            byte r1 = r3[r2]
            int r0 = r9 % 2
            int r8 = r8 - r0
            int r0 = r8 * 4
            int r7 = r7 << r0
            byte r0 = (byte) r7
            X.C165587tf.A1T(r3, r0, r1, r2)
            int r9 = r9 + 1
            goto L_0x0054
        L_0x0083:
            int r7 = r0 + -48
            goto L_0x008a
        L_0x0086:
            int r0 = r0 + -45
            int r7 = r0 + 10
        L_0x008a:
            r0 = -1
            if (r7 != r0) goto L_0x0090
            goto L_0x004f
        L_0x008e:
            r7 = 12
        L_0x0090:
            int r2 = r9 / 2
            byte r1 = r3[r2]
            int r0 = r9 % 2
            int r8 = r8 - r0
            int r0 = r8 * 4
            int r7 = r7 << r0
            byte r0 = (byte) r7
            X.C165587tf.A1T(r3, r0, r1, r2)
            int r9 = r9 + 1
            goto L_0x0047
        L_0x00a1:
            int r0 = r5 % 2
            if (r0 != r8) goto L_0x00ad
            int r4 = r4 - r8
            byte r0 = r3[r4]
            r0 = r0 | 15
            byte r0 = (byte) r0
            r3[r4] = r0
        L_0x00ad:
            r10.write(r6)
            r0 = r5 & 1
            int r1 = r0 << 7
            int r0 = r3.length
            r1 = r1 | r0
            r10.write(r1)
            r11 = r3
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203299nk.A05(java.io.OutputStream, byte[], boolean):void");
    }

    public void A06(C203399nx r4) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(DefaultCrypto.BUFFER_SIZE);
        byteArrayOutputStream.write(0);
        A01(r4, byteArrayOutputStream);
        C193749Ms.A00(this, byteArrayOutputStream.toByteArray());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r7.length <= 0) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.C203399nx r10, java.io.OutputStream r11) {
        /*
            X.9nx[] r7 = r10.A02
            r6 = 0
            r9 = 1
            if (r7 == 0) goto L_0x000a
            int r0 = r7.length
            r2 = 1
            if (r0 > 0) goto L_0x000b
        L_0x000a:
            r2 = 0
        L_0x000b:
            byte[] r8 = r10.A01
            if (r8 == 0) goto L_0x0022
            int r2 = r2 + 1
            if (r2 <= r9) goto L_0x0022
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "more than one source of inner data for node; countValues="
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r2)
            java.io.IOException r0 = X.C90524aI.A0X(r0)
            throw r0
        L_0x0022:
            X.1AL[] r5 = r10.A0k()
            if (r5 != 0) goto L_0x005b
            r0 = 0
        L_0x0029:
            int r0 = r0 + 1
            int r0 = r0 + r2
            A02(r11, r0)
            java.lang.String r0 = r10.A00
            A04(r11, r0, r6, r9)
            if (r5 == 0) goto L_0x005f
            int r4 = r5.length
            r3 = 0
        L_0x0038:
            if (r3 >= r4) goto L_0x005f
            r2 = r5[r3]
            java.lang.String r0 = r2.A02
            A04(r11, r0, r6, r6)
            com.whatsapp.jid.Jid r1 = r2.A01
            byte r0 = r2.A00
            if (r9 != r0) goto L_0x0055
            if (r1 == 0) goto L_0x0055
            boolean r0 = r1.isProtocolCompliant()
            if (r0 == 0) goto L_0x0055
            A00(r1, r11)
        L_0x0052:
            int r3 = r3 + 1
            goto L_0x0038
        L_0x0055:
            java.lang.String r0 = r2.A03
            A04(r11, r0, r9, r9)
            goto L_0x0052
        L_0x005b:
            int r0 = r5.length
            int r0 = r0 * 2
            goto L_0x0029
        L_0x005f:
            if (r8 == 0) goto L_0x0065
            A05(r11, r8, r6)
        L_0x0064:
            return
        L_0x0065:
            if (r7 == 0) goto L_0x0064
            int r1 = r7.length
            if (r1 <= 0) goto L_0x0064
            A02(r11, r1)
        L_0x006d:
            r0 = r7[r6]
            A01(r0, r11)
            int r6 = r6 + 1
            if (r6 >= r1) goto L_0x0064
            goto L_0x006d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203299nk.A01(X.9nx, java.io.OutputStream):void");
    }

    public static void A03(OutputStream outputStream, int i) {
        if (i < 0 || i >= 256) {
            throw C90524aI.A0X(AnonymousClass000.A0r("value out of range; value=", AnonymousClass000.A0u(), i));
        }
        outputStream.write(i & 255);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0084, code lost:
        if (r10 != null) goto L_0x0086;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(java.io.OutputStream r9, java.lang.String r10, boolean r11, boolean r12) {
        /*
            java.util.Map r0 = X.C1906399s.A00
            if (r0 != 0) goto L_0x0056
            java.lang.Class<X.99s> r8 = X.C1906399s.class
            monitor-enter(r8)
            java.util.Map r0 = X.C1906399s.A00     // Catch:{ all -> 0x0052 }
            if (r0 != 0) goto L_0x0055
            java.util.HashMap r7 = X.AnonymousClass001.A0J()     // Catch:{ all -> 0x0052 }
            r3 = 0
            r2 = 0
        L_0x0011:
            java.lang.String[] r1 = X.C190799Ai.A00     // Catch:{ all -> 0x0052 }
            r0 = 236(0xec, float:3.31E-43)
            if (r2 >= r0) goto L_0x002a
            r1 = r1[r2]     // Catch:{ all -> 0x0052 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0052 }
            if (r0 != 0) goto L_0x0027
            X.9Kl r0 = new X.9Kl     // Catch:{ all -> 0x0052 }
            r0.<init>(r3, r2, r3)     // Catch:{ all -> 0x0052 }
            r7.put(r1, r0)     // Catch:{ all -> 0x0052 }
        L_0x0027:
            int r2 = r2 + 1
            goto L_0x0011
        L_0x002a:
            r6 = 0
        L_0x002b:
            java.lang.String[][] r1 = X.C190799Ai.A01     // Catch:{ all -> 0x0052 }
            r0 = 4
            if (r6 >= r0) goto L_0x004f
            r5 = r1[r6]     // Catch:{ all -> 0x0052 }
            r4 = 0
        L_0x0033:
            int r0 = r5.length     // Catch:{ all -> 0x0052 }
            if (r4 >= r0) goto L_0x004c
            r3 = r5[r4]     // Catch:{ all -> 0x0052 }
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0052 }
            if (r0 != 0) goto L_0x0049
            int r2 = r6 + 236
            r1 = 1
            X.9Kl r0 = new X.9Kl     // Catch:{ all -> 0x0052 }
            r0.<init>(r2, r4, r1)     // Catch:{ all -> 0x0052 }
            r7.put(r3, r0)     // Catch:{ all -> 0x0052 }
        L_0x0049:
            int r4 = r4 + 1
            goto L_0x0033
        L_0x004c:
            int r6 = r6 + 1
            goto L_0x002b
        L_0x004f:
            X.C1906399s.A00 = r7     // Catch:{ all -> 0x0052 }
            goto L_0x0055
        L_0x0052:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x0055:
            monitor-exit(r8)
        L_0x0056:
            java.util.Map r0 = X.C1906399s.A00
            java.lang.Object r2 = r0.get(r10)
            X.9Kl r2 = (X.C193209Kl) r2
            if (r2 != 0) goto L_0x0092
            if (r12 == 0) goto L_0x0084
            if (r10 == 0) goto L_0x008d
            r0 = 64
            int r1 = r10.indexOf(r0)
            r0 = 1
            if (r1 >= r0) goto L_0x007f
            X.13o r0 = com.whatsapp.jid.Jid.Companion
            com.whatsapp.jid.Jid r1 = X.C222613p.A00(r10)
        L_0x0073:
            if (r1 == 0) goto L_0x0086
            boolean r0 = r1.isProtocolCompliant()
            if (r0 == 0) goto L_0x0086
            A00(r1, r9)
            return
        L_0x007f:
            com.whatsapp.jid.Jid r1 = X.C36411kG.A0i(r10)
            goto L_0x0073
        L_0x0084:
            if (r10 == 0) goto L_0x008d
        L_0x0086:
            java.lang.String r0 = X.C19430v1.A0B     // Catch:{ UnsupportedEncodingException -> 0x008d }
            byte[] r0 = r10.getBytes(r0)     // Catch:{ UnsupportedEncodingException -> 0x008d }
            goto L_0x008e
        L_0x008d:
            r0 = 0
        L_0x008e:
            A05(r9, r0, r11)
            return
        L_0x0092:
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x00a2
            short r1 = r2.A01
            if (r1 < 0) goto L_0x00b6
            r0 = 255(0xff, float:3.57E-43)
            if (r1 > r0) goto L_0x00b6
            byte r0 = (byte) r1
            r9.write(r0)
        L_0x00a2:
            short r1 = r2.A00
            if (r1 < 0) goto L_0x00af
            r0 = 255(0xff, float:3.57E-43)
            if (r1 > r0) goto L_0x00af
            byte r0 = (byte) r1
            r9.write(r0)
            return
        L_0x00af:
            java.lang.String r0 = "invalid token"
            java.io.IOException r0 = X.C90524aI.A0X(r0)
            throw r0
        L_0x00b6:
            java.lang.String r0 = "invalid token"
            java.io.IOException r0 = X.C90524aI.A0X(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203299nk.A04(java.io.OutputStream, java.lang.String, boolean, boolean):void");
    }

    public C203299nk(C19700wN r1, C20810yC r2, AnonymousClass19D r3, AnonymousClass9R9 r4) {
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = r4;
        this.A03 = r3;
    }

    public static void A00(Jid jid, OutputStream outputStream) {
        if (jid.getAgent() > 0 || jid.getDevice() > 0) {
            outputStream.write(247);
            int i = 0;
            if (AnonymousClass9ZV.A00(jid)) {
                i = 128;
            }
            if (jid instanceof C177508du) {
                i |= 1;
            }
            A03(outputStream, i);
            A03(outputStream, jid.getDevice());
            A04(outputStream, jid.user, true, false);
        } else if (jid.isProtocolCompliant()) {
            outputStream.write(250);
            if (TextUtils.isEmpty(jid.user)) {
                outputStream.write((byte) 0);
            } else {
                A04(outputStream, jid.user, true, false);
            }
            A04(outputStream, jid.getServer(), false, false);
        } else {
            C36321k7.A1J(jid, "frame-tree-node-writer/writeJid/failed to write jid: ", AnonymousClass000.A0u());
            throw C90524aI.A0X("failed to write jid");
        }
    }
}
