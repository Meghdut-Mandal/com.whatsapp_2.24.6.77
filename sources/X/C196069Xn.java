package X;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Set;
import javax.net.ssl.SSLException;

/* renamed from: X.9Xn  reason: invalid class name and case insensitive filesystem */
public abstract class C196069Xn {
    public final C187468xv A00;
    public final C187468xv A01;
    public final InputStream A02;

    public C191829Eq A00() {
        Throwable th;
        try {
            C187468xv r6 = this.A00;
            if (r6.available() <= 0) {
                return null;
            }
            r6.A00();
            byte[] bArr = new byte[4];
            if (r6.read(bArr) < 4) {
                r6.reset();
                return new AnonymousClass8f2();
            }
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            byte b = wrap.get();
            byte[] bArr2 = new byte[3];
            wrap.get(bArr2);
            int A012 = C203439o1.A01(bArr2);
            if (r6.available() < A012) {
                r6.reset();
                return new AnonymousClass8f2();
            }
            r6.reset();
            int i = A012 + 4;
            byte[] bArr3 = new byte[i];
            if (r6.read(bArr3) == i) {
                byte b2 = (byte) b;
                if (b2 == 1) {
                    return new C178128ev(bArr3);
                }
                if (b2 != 2) {
                    if (b2 == 4) {
                        return new AnonymousClass8f1(bArr3);
                    }
                    if (b2 == 8) {
                        return new C178168ez(bArr3);
                    }
                    if (b2 == 11) {
                        return new AnonymousClass8f4(bArr3);
                    }
                    if (b2 == 13) {
                        return new C178108et(bArr3);
                    }
                    if (b2 == 15) {
                        return new AnonymousClass8f5(bArr3);
                    }
                    if (b2 == 20) {
                        return new AnonymousClass8f6(bArr3);
                    }
                    if (b2 == 24) {
                        return new AnonymousClass8f3(bArr3);
                    }
                    th = new SSLException(AnonymousClass000.A0r("Invalid handshake message type ", AnonymousClass000.A0u(), b2));
                } else if (i < 38 || !C203439o1.A06(Arrays.copyOfRange(bArr3, 6, 38), AnonymousClass9BG.A05)) {
                    return new AnonymousClass8f7(bArr3);
                } else {
                    return new AnonymousClass8f0(bArr3);
                }
            } else {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("Could not read handshake message of length ");
                A0u.append(i);
                th = C165567td.A0D(A0u, (byte) 80);
            }
            throw th;
        } catch (IOException e) {
            throw C165577te.A0W(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0203, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0208, code lost:
        throw X.C165577te.A0W(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0209, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0214, code lost:
        throw new X.C21240yt(new javax.net.ssl.SSLException(r0), (byte) 80, true);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0209 A[ExcHandler: SocketException | SocketTimeoutException (r0v1 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:49:0x00da] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C191829Eq A01() {
        /*
            r14 = this;
            boolean r0 = r14 instanceof X.AnonymousClass8fA
            if (r0 == 0) goto L_0x00d4
            r4 = 1
            r3 = 80
            X.9Eq r1 = r14.A00()     // Catch:{ SocketException | SocketTimeoutException -> 0x00c8, IOException -> 0x00c2 }
            if (r1 == 0) goto L_0x0012
            boolean r0 = r1 instanceof X.AnonymousClass8f2     // Catch:{ SocketException | SocketTimeoutException -> 0x00c8, IOException -> 0x00c2 }
            if (r0 != 0) goto L_0x0012
            return r1
        L_0x0012:
            boolean r0 = r14.A02()     // Catch:{ SocketException | SocketTimeoutException -> 0x00c8, IOException -> 0x00c2 }
            r7 = 0
            if (r0 == 0) goto L_0x008c
            r5 = 5
            byte[] r0 = new byte[r5]     // Catch:{ SocketException | SocketTimeoutException -> 0x00c8, IOException -> 0x00c2 }
            X.8xv r10 = r14.A01     // Catch:{ SocketException | SocketTimeoutException -> 0x00c8, IOException -> 0x00c2 }
            int r1 = r10.read(r0)     // Catch:{ SocketException | SocketTimeoutException -> 0x00c8, IOException -> 0x00c2 }
            java.lang.String r9 = " != "
            java.lang.String r2 = "read returned fewer than expected bytes "
            if (r1 != r5) goto L_0x0080
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)     // Catch:{ SocketException | SocketTimeoutException -> 0x00c8, IOException -> 0x00c2 }
            byte r8 = r0.get()     // Catch:{ SocketException | SocketTimeoutException -> 0x00c8, IOException -> 0x00c2 }
            r0.getShort()     // Catch:{ SocketException | SocketTimeoutException -> 0x00c8, IOException -> 0x00c2 }
            int r6 = X.C203439o1.A00(r0)     // Catch:{ SocketException | SocketTimeoutException -> 0x00c8, IOException -> 0x00c2 }
            byte[] r5 = new byte[r6]     // Catch:{ SocketException | SocketTimeoutException -> 0x00c8, IOException -> 0x00c2 }
            int r1 = r10.read(r5)     // Catch:{ SocketException | SocketTimeoutException -> 0x00c8, IOException -> 0x00c2 }
            if (r1 != r6) goto L_0x0074
            r0 = 20
            if (r8 != r0) goto L_0x0049
            X.8f2 r1 = new X.8f2     // Catch:{ SocketException | SocketTimeoutException -> 0x00c8, IOException -> 0x00c2 }
            r1.<init>()     // Catch:{ SocketException | SocketTimeoutException -> 0x00c8, IOException -> 0x00c2 }
            return r1
        L_0x0049:
            r2 = 10
            switch(r8) {
                case 21: goto L_0x006e;
                case 22: goto L_0x0064;
                case 23: goto L_0x004f;
                default: goto L_0x004e;
            }     // Catch:{ SocketException | SocketTimeoutException -> 0x00c8, IOException -> 0x00c2 }
        L_0x004e:
            goto L_0x00b1
        L_0x004f:
            X.8xv r0 = r14.A00     // Catch:{ SocketException | SocketTimeoutException -> 0x00c8, IOException -> 0x00c2 }
            int r0 = r0.available()     // Catch:{ SocketException | SocketTimeoutException -> 0x00c8, IOException -> 0x00c2 }
            if (r0 <= 0) goto L_0x005e
            java.lang.String r0 = "App data and handshake messages cannot interleave"
            X.0yt r1 = X.C165567td.A0E(r0, r2)     // Catch:{ SocketException | SocketTimeoutException -> 0x00c8, IOException -> 0x00c2 }
            goto L_0x00c1
        L_0x005e:
            X.8er r1 = new X.8er     // Catch:{ SocketException | SocketTimeoutException -> 0x00c8, IOException -> 0x00c2 }
            r1.<init>(r5)     // Catch:{ SocketException | SocketTimeoutException -> 0x00c8, IOException -> 0x00c2 }
            return r1
        L_0x0064:
            X.8xv r0 = r14.A00     // Catch:{ SocketException | SocketTimeoutException -> 0x00c8, IOException -> 0x00c2 }
            r0.B14(r5, r7, r6)     // Catch:{ SocketException | SocketTimeoutException -> 0x00c8, IOException -> 0x00c2 }
            X.9Eq r1 = r14.A00()     // Catch:{ SocketException | SocketTimeoutException -> 0x00c8, IOException -> 0x00c2 }
            return r1
        L_0x006e:
            X.8eq r1 = new X.8eq     // Catch:{ SocketException | SocketTimeoutException -> 0x00c8, IOException -> 0x00c2 }
            r1.<init>(r5)     // Catch:{ SocketException | SocketTimeoutException -> 0x00c8, IOException -> 0x00c2 }
            return r1
        L_0x0074:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()     // Catch:{ SocketException | SocketTimeoutException -> 0x00c8, IOException -> 0x00c2 }
            X.C90464aC.A1K(r2, r9, r0, r1, r6)     // Catch:{ SocketException | SocketTimeoutException -> 0x00c8, IOException -> 0x00c2 }
            X.0yt r1 = X.C165567td.A0D(r0, r3)     // Catch:{ SocketException | SocketTimeoutException -> 0x00c8, IOException -> 0x00c2 }
            goto L_0x00c1
        L_0x0080:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()     // Catch:{ SocketException | SocketTimeoutException -> 0x00c8, IOException -> 0x00c2 }
            X.C90464aC.A1K(r2, r9, r0, r1, r5)     // Catch:{ SocketException | SocketTimeoutException -> 0x00c8, IOException -> 0x00c2 }
            X.0yt r1 = X.C165567td.A0D(r0, r3)     // Catch:{ SocketException | SocketTimeoutException -> 0x00c8, IOException -> 0x00c2 }
            goto L_0x00c1
        L_0x008c:
            r0 = 16645(0x4105, float:2.3325E-41)
            byte[] r2 = new byte[r0]     // Catch:{ SocketException | SocketTimeoutException -> 0x00c8, IOException -> 0x00c2 }
            java.io.InputStream r0 = r14.A02     // Catch:{ SocketException | SocketTimeoutException -> 0x00c8, IOException -> 0x00c2 }
            int r1 = r0.read(r2)     // Catch:{ SocketException | SocketTimeoutException -> 0x00c8, IOException -> 0x00c2 }
            r0 = -1
            if (r1 == r0) goto L_0x00a4
            X.8xv r0 = r14.A01     // Catch:{ SocketException | SocketTimeoutException -> 0x00c8, IOException -> 0x00c2 }
            r0.B14(r2, r7, r1)     // Catch:{ SocketException | SocketTimeoutException -> 0x00c8, IOException -> 0x00c2 }
            X.8f2 r1 = new X.8f2     // Catch:{ SocketException | SocketTimeoutException -> 0x00c8, IOException -> 0x00c2 }
            r1.<init>()     // Catch:{ SocketException | SocketTimeoutException -> 0x00c8, IOException -> 0x00c2 }
            return r1
        L_0x00a4:
            java.lang.String r1 = "Transport layer is reached end of file."
            javax.net.ssl.SSLException r0 = new javax.net.ssl.SSLException     // Catch:{ SocketException | SocketTimeoutException -> 0x00c8, IOException -> 0x00c2 }
            r0.<init>(r1)     // Catch:{ SocketException | SocketTimeoutException -> 0x00c8, IOException -> 0x00c2 }
            X.0yt r1 = new X.0yt     // Catch:{ SocketException | SocketTimeoutException -> 0x00c8, IOException -> 0x00c2 }
            r1.<init>(r0, r3, r4)     // Catch:{ SocketException | SocketTimeoutException -> 0x00c8, IOException -> 0x00c2 }
            goto L_0x00c1
        L_0x00b1:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ SocketException | SocketTimeoutException -> 0x00c8, IOException -> 0x00c2 }
            java.lang.String r0 = "Received Message with invalid type "
            r1.append(r0)     // Catch:{ SocketException | SocketTimeoutException -> 0x00c8, IOException -> 0x00c2 }
            r1.append(r8)     // Catch:{ SocketException | SocketTimeoutException -> 0x00c8, IOException -> 0x00c2 }
            X.0yt r1 = X.C165567td.A0D(r1, r2)     // Catch:{ SocketException | SocketTimeoutException -> 0x00c8, IOException -> 0x00c2 }
        L_0x00c1:
            throw r1     // Catch:{ SocketException | SocketTimeoutException -> 0x00c8, IOException -> 0x00c2 }
        L_0x00c2:
            r0 = move-exception
            X.0yt r1 = X.C165577te.A0W(r0)
            throw r1
        L_0x00c8:
            r1 = move-exception
            javax.net.ssl.SSLException r0 = new javax.net.ssl.SSLException
            r0.<init>(r1)
            X.0yt r1 = new X.0yt
            r1.<init>(r0, r3, r4)
            throw r1
        L_0x00d4:
            r6 = r14
            X.8fB r6 = (X.AnonymousClass8fB) r6
            r4 = 1
            r3 = 80
            X.9Eq r1 = r6.A00()     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
            if (r1 == 0) goto L_0x00e5
            boolean r0 = r1 instanceof X.AnonymousClass8f2     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
            if (r0 != 0) goto L_0x00e5
            return r1
        L_0x00e5:
            boolean r0 = r6.A02()     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
            r5 = 0
            if (r0 == 0) goto L_0x01d5
            r8 = 5
            byte[] r11 = new byte[r8]     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
            X.8xv r1 = r6.A01     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
            int r7 = r1.read(r11)     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
            java.lang.String r12 = " != "
            java.lang.String r2 = "read returned fewer than expected bytes "
            if (r7 != r8) goto L_0x01c9
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r11)     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
            byte r13 = r0.get()     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
            r0.getShort()     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
            int r7 = X.C203439o1.A00(r0)     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
            r0 = 23
            java.lang.String r9 = "Invalid content type "
            r10 = 20
            if (r13 == r0) goto L_0x0120
            if (r13 == r10) goto L_0x0120
            r1 = 47
            java.lang.StringBuilder r0 = X.C90464aC.A0h(r13, r9)     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
            X.0yt r1 = X.C165567td.A0D(r0, r1)     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
            goto L_0x0202
        L_0x0120:
            byte[] r8 = new byte[r7]     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
            int r1 = r1.read(r8)     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
            if (r1 != r7) goto L_0x01bd
            if (r13 != r10) goto L_0x0130
            X.8f2 r1 = new X.8f2     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
            r1.<init>()     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
            return r1
        L_0x0130:
            X.AwX r2 = r6.A01     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
            long r0 = r6.A00     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
            X.ADf r2 = (X.C21223ADf) r2     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
            byte[] r12 = r2.A02     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
            byte[] r1 = X.C21222ADe.A00(r12, r0)     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
            r0 = 128(0x80, float:1.794E-43)
            javax.crypto.spec.GCMParameterSpec r13 = new javax.crypto.spec.GCMParameterSpec     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
            r13.<init>(r0, r1)     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
            javax.crypto.Cipher r12 = r2.A00     // Catch:{ BadPaddingException -> 0x01b5, IllegalBlockSizeException -> 0x01ad, InvalidAlgorithmParameterException -> 0x01a5, InvalidKeyException -> 0x019d, SocketException | SocketTimeoutException -> 0x0209 }
            r1 = 2
            javax.crypto.SecretKey r0 = r2.A01     // Catch:{ BadPaddingException -> 0x01b5, IllegalBlockSizeException -> 0x01ad, InvalidAlgorithmParameterException -> 0x01a5, InvalidKeyException -> 0x019d, SocketException | SocketTimeoutException -> 0x0209 }
            r12.init(r1, r0, r13)     // Catch:{ BadPaddingException -> 0x01b5, IllegalBlockSizeException -> 0x01ad, InvalidAlgorithmParameterException -> 0x01a5, InvalidKeyException -> 0x019d, SocketException | SocketTimeoutException -> 0x0209 }
            javax.crypto.Cipher r0 = r2.A00     // Catch:{ BadPaddingException -> 0x01b5, IllegalBlockSizeException -> 0x01ad, InvalidAlgorithmParameterException -> 0x01a5, InvalidKeyException -> 0x019d, SocketException | SocketTimeoutException -> 0x0209 }
            r0.updateAAD(r11)     // Catch:{ BadPaddingException -> 0x01b5, IllegalBlockSizeException -> 0x01ad, InvalidAlgorithmParameterException -> 0x01a5, InvalidKeyException -> 0x019d, SocketException | SocketTimeoutException -> 0x0209 }
            javax.crypto.Cipher r0 = r2.A00     // Catch:{ BadPaddingException -> 0x01b5, IllegalBlockSizeException -> 0x01ad, InvalidAlgorithmParameterException -> 0x01a5, InvalidKeyException -> 0x019d, SocketException | SocketTimeoutException -> 0x0209 }
            byte[] r2 = r0.doFinal(r8, r5, r7)     // Catch:{ BadPaddingException -> 0x01b5, IllegalBlockSizeException -> 0x01ad, InvalidAlgorithmParameterException -> 0x01a5, InvalidKeyException -> 0x019d, SocketException | SocketTimeoutException -> 0x0209 }
            long r0 = r6.A00     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
            r7 = 1
            long r0 = r0 + r7
            r6.A00 = r0     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
            int r1 = r2.length     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
        L_0x015e:
            int r1 = r1 + -1
            byte r0 = r2[r1]     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
            if (r0 == 0) goto L_0x015e
            byte[] r2 = java.util.Arrays.copyOfRange(r2, r5, r1)     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
            if (r0 != r10) goto L_0x0170
            X.8f2 r1 = new X.8f2     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
            r1.<init>()     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
            return r1
        L_0x0170:
            r1 = 10
            switch(r0) {
                case 21: goto L_0x0197;
                case 22: goto L_0x018c;
                case 23: goto L_0x0177;
                default: goto L_0x0175;
            }     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
        L_0x0175:
            goto L_0x01fa
        L_0x0177:
            X.8xv r0 = r6.A00     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
            int r0 = r0.available()     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
            if (r0 <= 0) goto L_0x0186
            java.lang.String r0 = "App data and handshake messages cannot interleave"
            X.0yt r1 = X.C165567td.A0E(r0, r1)     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
            goto L_0x0202
        L_0x0186:
            X.8er r1 = new X.8er     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
            r1.<init>(r2)     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
            return r1
        L_0x018c:
            X.8xv r1 = r6.A00     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
            int r0 = r2.length     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
            r1.B14(r2, r5, r0)     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
            X.9Eq r1 = r6.A00()     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
            return r1
        L_0x0197:
            X.8eq r1 = new X.8eq     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
            r1.<init>(r2)     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
            return r1
        L_0x019d:
            r1 = move-exception
            java.lang.String r0 = " Invalid Key"
            X.0yt r1 = X.C165577te.A0V(r0, r1, r3)     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
            goto L_0x0202
        L_0x01a5:
            r1 = move-exception
            java.lang.String r0 = "Invalid Algorithm Params"
            X.0yt r1 = X.C165577te.A0V(r0, r1, r3)     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
            goto L_0x0202
        L_0x01ad:
            r1 = move-exception
            java.lang.String r0 = "Illegal block size "
            X.0yt r1 = X.C165577te.A0V(r0, r1, r3)     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
            goto L_0x0202
        L_0x01b5:
            r1 = move-exception
            java.lang.String r0 = "Bad padding"
            X.0yt r1 = X.C165577te.A0V(r0, r1, r3)     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
            goto L_0x0202
        L_0x01bd:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
            X.C90464aC.A1K(r2, r12, r0, r1, r7)     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
            X.0yt r1 = X.C165567td.A0D(r0, r3)     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
            goto L_0x0202
        L_0x01c9:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
            X.C90464aC.A1K(r2, r12, r0, r7, r8)     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
            X.0yt r1 = X.C165567td.A0D(r0, r3)     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
            goto L_0x0202
        L_0x01d5:
            r0 = 16645(0x4105, float:2.3325E-41)
            byte[] r2 = new byte[r0]     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
            java.io.InputStream r0 = r6.A02     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
            int r1 = r0.read(r2)     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
            r0 = -1
            if (r1 == r0) goto L_0x01ed
            X.8xv r0 = r6.A01     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
            r0.B14(r2, r5, r1)     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
            X.8f2 r1 = new X.8f2     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
            r1.<init>()     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
            return r1
        L_0x01ed:
            java.lang.String r1 = "Transport layer is reached end of file."
            javax.net.ssl.SSLException r0 = new javax.net.ssl.SSLException     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
            r0.<init>(r1)     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
            X.0yt r1 = new X.0yt     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
            r1.<init>(r0, r3, r4)     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
            goto L_0x0202
        L_0x01fa:
            java.lang.StringBuilder r0 = X.C90464aC.A0h(r0, r9)     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
            X.0yt r1 = X.C165567td.A0D(r0, r1)     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
        L_0x0202:
            throw r1     // Catch:{ SocketException | SocketTimeoutException -> 0x0209, IOException -> 0x0203 }
        L_0x0203:
            r0 = move-exception
            X.0yt r0 = X.C165577te.A0W(r0)
            throw r0
        L_0x0209:
            r0 = move-exception
            javax.net.ssl.SSLException r1 = new javax.net.ssl.SSLException
            r1.<init>(r0)
            X.0yt r0 = new X.0yt
            r0.<init>(r1, r3, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196069Xn.A01():X.9Eq");
    }

    public boolean A02() {
        C21240yt r1;
        try {
            C187468xv r6 = this.A01;
            if (r6.available() < 5) {
                return false;
            }
            byte[] bArr = new byte[5];
            r6.A00();
            int read = r6.read(bArr);
            if (read == 5) {
                r6.reset();
                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                byte b = wrap.get();
                short s = wrap.getShort();
                int A002 = C203439o1.A00(wrap);
                if (AnonymousClass99m.A00.contains(Byte.valueOf(b))) {
                    Set set = AnonymousClass9BG.A03;
                    if (s == 771) {
                        if (A002 < 0 || A002 > 16640) {
                            r1 = new C21240yt(new SSLException(AnonymousClass000.A0q(C203439o1.A04(bArr), AnonymousClass000.A0v("Invalid record header "))), (byte) 22, true);
                            throw r1;
                        } else if (r6.available() >= A002 + 5) {
                            return true;
                        } else {
                            return false;
                        }
                    }
                }
                r1 = new C21240yt(new SSLException(AnonymousClass000.A0q(C203439o1.A04(bArr), AnonymousClass000.A0v("Invalid record header "))), (byte) 10, true);
                throw r1;
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("read returned fewer than expected bytes ");
            A0u.append(read);
            A0u.append(" != ");
            A0u.append(5);
            throw C165567td.A0D(A0u, (byte) 80);
        } catch (IOException e) {
            throw C165577te.A0W(e);
        }
    }

    public C196069Xn(C187468xv r3, InputStream inputStream) {
        if (inputStream == null || r3 == null) {
            throw C165567td.A0E("transportIn or recordStream is null", (byte) 80);
        }
        this.A02 = inputStream;
        this.A00 = new C187468xv();
        this.A01 = r3;
    }
}
