package X;

import android.text.TextUtils;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.InflaterInputStream;

/* renamed from: X.1Va  reason: invalid class name and case insensitive filesystem */
public class C29021Va {
    public byte[] A00;
    public final C19700wN A01;
    public final C20810yC A02;
    public final AnonymousClass19D A03;
    public final C192729Ii A04;

    private int A00(InputStream inputStream, int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 248) {
            return inputStream.read();
        }
        if (i == 249) {
            return (inputStream.read() << 8) + inputStream.read();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("invalid list size in readListSize: token ");
        sb.append(i);
        throw new C235919b(sb.toString(), A09());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004d, code lost:
        throw new X.C235919b("invalid token index in getToken()", A09());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b3, code lost:
        r1 = new byte[r3];
        A06(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00bf, code lost:
        return new java.lang.String(r1, X.C19430v1.A0B);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0114, code lost:
        throw new X.C235919b("invalid token index in getToken()", A09());
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[ExcHandler: ArrayIndexOutOfBoundsException | NullPointerException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:9:0x000f] */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[ExcHandler: ArrayIndexOutOfBoundsException | NullPointerException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:44:0x00ce] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String A04(java.io.InputStream r5, int r6) {
        /*
            r4 = this;
            r0 = -1
            if (r6 == r0) goto L_0x011f
            r0 = 2
            if (r6 <= r0) goto L_0x004e
            r0 = 236(0xec, float:3.31E-43)
            if (r6 >= r0) goto L_0x0052
            r3 = 0
            java.lang.String[] r0 = X.C190799Ai.A00     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0024 }
            r2 = r0[r6]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0024 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0042, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0042 }
            r1.<init>()     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0042, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0042 }
            java.lang.String r0 = "Token was null for singlebyte idx: "
            r1.append(r0)     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0042, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0042 }
            r1.append(r6)     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0042, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0042 }
            java.lang.String r0 = r1.toString()     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0042, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0042 }
            X.C18740tg.A07(r2, r0)     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0042, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0042 }
            return r2
        L_0x0024:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0042, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0042 }
            r1.<init>()     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0042, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0042 }
            java.lang.String r0 = "Fail while trying to access WapDict, dictNum="
            r1.append(r0)     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0042, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0042 }
            r1.append(r3)     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0042, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0042 }
            java.lang.String r0 = ", dictIdx="
            r1.append(r0)     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0042, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0042 }
            r1.append(r6)     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0042, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0042 }
            java.lang.String r0 = r1.toString()     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0042, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0042 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0042, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0042 }
            throw r2     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0042, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0042 }
        L_0x0042:
            java.lang.String r2 = r4.A09()
            java.lang.String r1 = "invalid token index in getToken()"
            X.19b r0 = new X.19b
            r0.<init>(r1, r2)
            throw r0
        L_0x004e:
            if (r6 != 0) goto L_0x005c
            r2 = 0
            return r2
        L_0x0052:
            r0 = 247(0xf7, float:3.46E-43)
            if (r6 == r0) goto L_0x0115
            switch(r6) {
                case 236: goto L_0x00c2;
                case 237: goto L_0x00c2;
                case 238: goto L_0x00c2;
                case 239: goto L_0x00c2;
                default: goto L_0x0059;
            }
        L_0x0059:
            switch(r6) {
                case 250: goto L_0x0068;
                case 251: goto L_0x0072;
                case 252: goto L_0x007e;
                case 253: goto L_0x0083;
                case 254: goto L_0x0098;
                case 255: goto L_0x0072;
                default: goto L_0x005c;
            }
        L_0x005c:
            java.lang.String r2 = r4.A09()
            java.lang.String r1 = "readString couldn't match token"
            X.19b r0 = new X.19b
            r0.<init>(r1, r2)
            throw r0
        L_0x0068:
            java.lang.String r0 = "Unexpected ReadString for token JID_PAIR"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            java.lang.String r2 = r4.A03(r5)
            return r2
        L_0x0072:
            byte[] r1 = A07(r5, r6)
            java.lang.String r0 = X.C19430v1.A0B     // Catch:{ UnsupportedEncodingException -> 0x00c0 }
            java.lang.String r2 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x00c0 }
            r2.<init>(r1, r0)     // Catch:{ UnsupportedEncodingException -> 0x00c0 }
            return r2
        L_0x007e:
            int r3 = r5.read()
            goto L_0x00b3
        L_0x0083:
            int r0 = r5.read()
            r2 = r0 & 15
            int r0 = r5.read()
            int r1 = r5.read()
            int r3 = r2 << 16
            int r0 = r0 << 8
            int r3 = r3 + r0
            int r3 = r3 + r1
            goto L_0x00b3
        L_0x0098:
            int r0 = r5.read()
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r0 = r5.read()
            int r2 = r5.read()
            int r3 = r5.read()
            int r1 = r1 << 24
            int r0 = r0 << 16
            r1 = r1 | r0
            int r0 = r2 << 8
            r1 = r1 | r0
            r3 = r3 | r1
        L_0x00b3:
            byte[] r1 = new byte[r3]
            A06(r5, r1)
            java.lang.String r0 = X.C19430v1.A0B     // Catch:{ UnsupportedEncodingException -> 0x00c0 }
            java.lang.String r2 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x00c0 }
            r2.<init>(r1, r0)     // Catch:{ UnsupportedEncodingException -> 0x00c0 }
            return r2
        L_0x00c0:
            r2 = 0
            return r2
        L_0x00c2:
            int r3 = r5.read()
            java.lang.String[][] r1 = X.C190799Ai.A01     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00eb }
            int r0 = r6 + -236
            r0 = r1[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00eb }
            r2 = r0[r3]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00eb }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0109, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0109 }
            r1.<init>()     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0109, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0109 }
            java.lang.String r0 = "Token was null for doublebyte dictNum="
            r1.append(r0)     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0109, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0109 }
            r1.append(r6)     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0109, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0109 }
            java.lang.String r0 = ", dictIdx="
            r1.append(r0)     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0109, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0109 }
            r1.append(r3)     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0109, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0109 }
            java.lang.String r0 = r1.toString()     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0109, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0109 }
            X.C18740tg.A07(r2, r0)     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0109, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0109 }
            return r2
        L_0x00eb:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0109, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0109 }
            r1.<init>()     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0109, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0109 }
            java.lang.String r0 = "Fail while trying to access WapDict, dictNum="
            r1.append(r0)     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0109, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0109 }
            r1.append(r6)     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0109, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0109 }
            java.lang.String r0 = ", dictIdx="
            r1.append(r0)     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0109, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0109 }
            r1.append(r3)     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0109, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0109 }
            java.lang.String r0 = r1.toString()     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0109, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0109 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0109, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0109 }
            throw r2     // Catch:{ ArrayIndexOutOfBoundsException | NullPointerException -> 0x0109, ArrayIndexOutOfBoundsException | NullPointerException -> 0x0109 }
        L_0x0109:
            java.lang.String r2 = r4.A09()
            java.lang.String r1 = "invalid token index in getToken()"
            X.19b r0 = new X.19b
            r0.<init>(r1, r2)
            throw r0
        L_0x0115:
            java.lang.String r0 = "Unexpected ReadString for token JID_4"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            java.lang.String r2 = r4.A02(r5)
            return r2
        L_0x011f:
            java.lang.String r2 = r4.A09()
            java.lang.String r1 = "-1 token in readString"
            X.19b r0 = new X.19b
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29021Va.A04(java.io.InputStream, int):java.lang.String");
    }

    public static void A06(InputStream inputStream, byte[] bArr) {
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            int read = inputStream.read(bArr, i, length - i);
            if (read != -1) {
                i += read;
            } else {
                throw new IOException("ran out of bytes while reading into buffer");
            }
        }
    }

    private void A05(Jid jid, String str) {
        C19700wN r3 = this.A01;
        if (r3 != null && !jid.isProtocolCompliant()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Jid: '");
            sb.append(jid);
            sb.append("' key: '");
            if (str == null) {
                str = "";
            }
            sb.append(str);
            sb.append("'");
            r3.A0E("invalid jid!", sb.toString(), true);
        }
    }

    public C203399nx A08() {
        byte[] A022;
        int length;
        ByteArrayOutputStream byteArrayOutputStream;
        C192729Ii r7 = this.A04;
        C18740tg.A07(r7, "frameInputStream is null");
        do {
            try {
                C200819iI r1 = r7.A00;
                byte[] bArr = new byte[3];
                C200819iI.A00(r1, bArr);
                byte[] bArr2 = new byte[C203239na.A00(bArr)];
                C200819iI.A00(r1, bArr2);
                C193749Ms r0 = r7.A01;
                A022 = r0.A03.A02(new byte[0], bArr2, r0.A00.getAndIncrement());
                length = A022.length;
            } catch (C29031Vb e) {
                throw new C187338xg(e);
            }
        } while (length == 0);
        if (length != 1) {
            byte b = A022[0];
            if ((b & 2) != 0) {
                byte[] bArr3 = {b};
                InflaterInputStream inflaterInputStream = new InflaterInputStream(new ByteArrayInputStream(A022, 1, length - 1));
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream(DefaultCrypto.BUFFER_SIZE);
                    byteArrayOutputStream.write(bArr3);
                    byte[] bArr4 = new byte[DefaultCrypto.BUFFER_SIZE];
                    for (int read = inflaterInputStream.read(bArr4); read >= 0; read = inflaterInputStream.read(bArr4)) {
                        byteArrayOutputStream.write(bArr4, 0, read);
                    }
                    inflaterInputStream.close();
                    byteArrayOutputStream.close();
                    A022 = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    inflaterInputStream.close();
                } catch (Throwable th) {
                    try {
                        inflaterInputStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            this.A00 = A022;
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(A022);
            if ((((byte) byteArrayInputStream.read()) & 1) == 0) {
                return A01(this, byteArrayInputStream);
            }
            throw new C235919b("server to client stanza fragmentation not supported");
        }
        throw new C235919b("header only frame received");
        throw th;
    }

    public String A09() {
        byte[] bArr = this.A00;
        if (bArr == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("size = ");
        int length = bArr.length;
        sb.append(length);
        sb.append('<');
        for (int i = 0; i < length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(bArr[i] & 255);
            if (((long) sb.length()) >= 262144) {
                break;
            }
        }
        if (((long) sb.length()) < 262144) {
            sb.append('>');
        } else {
            sb.append("...");
        }
        return sb.toString();
    }

    public C29021Va(C19700wN r1, C20810yC r2, AnonymousClass19D r3, C192729Ii r4) {
        this.A02 = r2;
        this.A01 = r1;
        this.A04 = r4;
        this.A03 = r3;
    }

    public static C203399nx A01(C29021Va r12, InputStream inputStream) {
        AnonymousClass1AL[] r4;
        String str;
        AnonymousClass1AL r2;
        String obj;
        byte[] A07;
        int read;
        int A002 = r12.A00(inputStream, inputStream.read());
        int read2 = inputStream.read();
        if (read2 == 2) {
            return null;
        }
        String A042 = r12.A04(inputStream, read2);
        if (A002 == 0 || A042 == null) {
            throw new C235919b("nextTree sees 0 list or null tag", r12.A09());
        }
        int i = A002 - 2;
        int i2 = A002 % 2;
        int i3 = (i + i2) / 2;
        if (i3 == 0) {
            r4 = null;
        } else {
            r4 = new AnonymousClass1AL[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                String A043 = r12.A04(inputStream, inputStream.read());
                int read3 = inputStream.read();
                if (read3 == 244) {
                    String A044 = r12.A04(inputStream, inputStream.read());
                    int read4 = (inputStream.read() << 8) + inputStream.read();
                    int read5 = (inputStream.read() << 8) + inputStream.read();
                    if (inputStream.read() == 0) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(read5);
                        sb.append("-");
                        C18740tg.A05(A044);
                        sb.append(A044);
                        if (read4 == 0) {
                            obj = "";
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(":");
                            sb2.append(read4);
                            obj = sb2.toString();
                        }
                        sb.append(obj);
                        sb.append('@');
                        sb.append("interop");
                        str = sb.toString();
                        C222613p r0 = Jid.JID_FACTORY;
                        Jid A003 = C222513o.A00(str);
                        r12.A05(A003, A043);
                        r2 = new AnonymousClass1AL(A003, A043);
                    } else {
                        throw new C235919b("Nonzero domain received for JID_INTEROP tuple");
                    }
                } else if (read3 == 247) {
                    str = r12.A02(inputStream);
                    C222613p r02 = Jid.JID_FACTORY;
                    Jid A004 = C222513o.A00(str);
                    r12.A05(A004, A043);
                    r2 = new AnonymousClass1AL(A004, A043);
                } else if (read3 != 250) {
                    r2 = new AnonymousClass1AL(A043, r12.A04(inputStream, read3));
                } else {
                    str = r12.A03(inputStream);
                    try {
                        C222613p r03 = Jid.JID_FACTORY;
                        Jid A005 = C222513o.A00(str);
                        r12.A05(A005, A043);
                        r2 = new AnonymousClass1AL(A005, A043);
                    } catch (C19740wR unused) {
                        r2 = new AnonymousClass1AL(A043, str);
                    }
                }
                r4[i4] = r2;
            }
        }
        if (i2 == 1) {
            return new C203399nx(A042, r4);
        }
        int read6 = inputStream.read();
        if (read6 == 0 || read6 == 248 || read6 == 249) {
            int A006 = r12.A00(inputStream, read6);
            C203399nx[] r22 = new C203399nx[A006];
            for (int i5 = 0; i5 < A006; i5++) {
                r22[i5] = A01(r12, inputStream);
            }
            return new C203399nx(A042, r4, r22);
        }
        if (read6 == 252) {
            read = inputStream.read();
        } else if (read6 == 253) {
            read = ((inputStream.read() & 15) << 16) + (inputStream.read() << 8) + inputStream.read();
        } else if (read6 == 254) {
            read = inputStream.read() | ((inputStream.read() & 127) << 24) | (inputStream.read() << 16) | (inputStream.read() << 8);
        } else if (read6 != 255 && read6 != 251) {
            return new C203399nx(A042, r12.A04(inputStream, read6), r4);
        } else {
            A07 = A07(inputStream, read6);
            return new C203399nx(A042, A07, r4);
        }
        A07 = new byte[read];
        A06(inputStream, A07);
        return new C203399nx(A042, A07, r4);
    }

    private String A02(InputStream inputStream) {
        String str;
        String obj;
        StringBuilder sb;
        int read = inputStream.read() & 255;
        int read2 = inputStream.read() & 255;
        String A042 = A04(inputStream, inputStream.read());
        boolean z = false;
        boolean z2 = false;
        if ((read & 1) == 0) {
            z2 = true;
        }
        if ((read & 128) != 0) {
            z = true;
        }
        boolean z3 = false;
        if (read2 == 99) {
            z3 = true;
        }
        if (z3 != z) {
            C20810yC r2 = this.A02;
            if (r2 == null || !C20800yB.A01(C21000yV.A02, r2, 6671)) {
                C19700wN r22 = this.A01;
                if (r22 != null) {
                    sb.append("jid read; isHosted: ");
                    sb.append(z);
                    sb.append("; proceeding since no validation");
                    r22.A0E("invalid-hosted-flag", sb.toString(), false);
                } else {
                    sb = new StringBuilder();
                    sb.append("Hosted flag mismatch on jid; user=");
                    sb.append(A042);
                    sb.append("; device=");
                    sb.append(read2);
                    sb.append("; flag=");
                    sb.append(z);
                    sb.append("; not reporting and proceeding");
                    Log.e(sb.toString());
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Hosted flag mismatch on jid; user=");
                sb2.append(A042);
                sb2.append("; device=");
                sb2.append(read2);
                sb2.append("; flag=");
                sb2.append(z);
                throw new C235919b(sb2.toString());
            }
        }
        if (z) {
            if (z2) {
                str = "hosted";
            } else {
                str = "hosted.lid";
            }
        } else if (z2) {
            str = "s.whatsapp.net";
        } else {
            str = "lid";
        }
        C222613p r0 = Jid.JID_FACTORY;
        if (TextUtils.isEmpty(A042)) {
            return str;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(A042);
        if (read2 == 0) {
            obj = "";
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(":");
            sb4.append(read2);
            obj = sb4.toString();
        }
        sb3.append(obj);
        sb3.append('@');
        sb3.append(str);
        return sb3.toString();
    }

    private String A03(InputStream inputStream) {
        String A042 = A04(inputStream, inputStream.read());
        String A043 = A04(inputStream, inputStream.read());
        if (TextUtils.isEmpty(A042)) {
            return A043;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(A042);
        sb.append("");
        sb.append('@');
        sb.append(A043);
        return sb.toString();
    }

    public static byte[] A07(InputStream inputStream, int i) {
        int i2;
        int read = inputStream.read();
        int i3 = 0;
        if ((read & 128) != 0) {
            i3 = 1;
        }
        int i4 = read & 127;
        byte[] bArr = new byte[i4];
        A06(inputStream, bArr);
        int i5 = (i4 * 2) - i3;
        byte[] bArr2 = new byte[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            int i7 = (1 - (i6 % 2)) * 4;
            int i8 = (bArr[i6 / 2] & (15 << i7)) >> i7;
            if (i == 251) {
                switch (i8) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        break;
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        i2 = (i8 - 10) + 65;
                        continue;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("bad hex ");
                        sb.append(i8);
                        throw new C235919b(sb.toString());
                }
            } else if (i == 255) {
                switch (i8) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        break;
                    case 10:
                    case 11:
                        i2 = (i8 - 10) + 45;
                        continue;
                    case 12:
                        i2 = 58;
                        continue;
                    default:
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("bad nibble ");
                        sb2.append(i8);
                        throw new C235919b(sb2.toString());
                }
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("bad packed type ");
                sb3.append(i);
                throw new C235919b(sb3.toString());
            }
            i2 = i8 + 48;
            bArr2[i6] = (byte) i2;
        }
        return bArr2;
    }
}
