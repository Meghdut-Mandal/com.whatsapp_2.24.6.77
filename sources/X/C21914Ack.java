package X;

import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.net.tls13.WtCachedPsk;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.net.ssl.HandshakeCompletedEvent;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* renamed from: X.Ack  reason: case insensitive filesystem */
public class C21914Ack extends SSLSocket implements C22823AwY {
    public C21912Aci A00;
    public int A01;
    public C187448xt A02;
    public C21224ADg A03;
    public AZ5 A04;
    public AZ5 A05;
    public C194379Pl A06;
    public InputStream A07;
    public OutputStream A08;
    public String A09;
    public Set A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public long A0E;
    public C187508xz A0F;

    public static String A01(byte b) {
        if (b == 0) {
            return "close_notify";
        }
        if (b == 10) {
            return "unexpected_message";
        }
        if (b == 20) {
            return "bad_record_mac";
        }
        if (b == 22) {
            return "record_overflow";
        }
        if (b == 40) {
            return "handshake_failure";
        }
        if (b == 80) {
            return "internal_error";
        }
        if (b == 86) {
            return "inappropriate_fallback";
        }
        if (b == 90) {
            return "user_cancelled";
        }
        if (b == 120) {
            return "no_application_protocol";
        }
        if (b == 70) {
            return "protocol_version";
        }
        if (b == 71) {
            return "insufficient_security";
        }
        if (b == 109) {
            return "missing_extension";
        }
        if (b == 110) {
            return "unsupported_version";
        }
        if (b == 112) {
            return "unrecognized_name";
        }
        if (b == 113) {
            return "bad_certificate_status_response";
        }
        if (b == 115) {
            return "unknown_psk_identity";
        }
        if (b == 116) {
            return "certificate_required";
        }
        switch (b) {
            case 42:
                return "bad_certificate";
            case 43:
                return "unsupported_certificate";
            case 44:
                return "certificate_revoked";
            case 45:
                return "certificate_expired";
            case 46:
                return "certificate_unknown";
            case 47:
                return "illegal_parameter";
            case 48:
                return "unknown_ca";
            case 49:
                return "access_denied";
            case 50:
                return "decode_error";
            case 51:
                return "decrypt_error";
            default:
                return "invalid description";
        }
    }

    private synchronized void A02() {
        OutputStream outputStream;
        this.A0D = true;
        C21224ADg aDg = this.A03;
        aDg.A0T = null;
        aDg.A0U = null;
        if (this.A0C) {
            this.A02.close();
            this.A0F.close();
        }
        if (this instanceof C178178fE) {
            C178178fE r1 = (C178178fE) this;
            if (r1.A01) {
                r1.A00.close();
                r1.A07.close();
                outputStream = r1.A08;
            }
        } else {
            super.close();
            this.A07.close();
            outputStream = this.A08;
        }
        outputStream.close();
    }

    public static void A05(C21914Ack ack) {
        ack.A0C = false;
        ack.A0B = false;
        ack.A0D = false;
        ack.A0A = new HashSet();
    }

    public static synchronized void A06(C21914Ack ack, SSLException sSLException, byte b, byte b2, boolean z) {
        IOException iOException;
        String str;
        String str2;
        synchronized (ack) {
            if (z) {
                iOException = (IOException) C165587tf.A0m(sSLException);
            } else {
                if (!ack.A0D) {
                    Integer num = C023109s.A01;
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("Sending Alert : type : ");
                    if (b == 2) {
                        str = "FATAL";
                    } else {
                        str = "WARNING";
                    }
                    A0u.append(str);
                    A0u.append(" description : ");
                    A0u.append(A01(b2));
                    A0u.append("(");
                    A0u.append(b2);
                    A0u.append(") exception : ");
                    if (sSLException == null) {
                        str2 = "";
                    } else {
                        str2 = sSLException.toString();
                    }
                    AnonymousClass6IT.A00.A02(num, Thread.currentThread().getStackTrace()[2].toString(), AnonymousClass000.A0q(str2, A0u), sSLException);
                    try {
                        ack.A03.A0D.A01(new byte[]{b, b2}, 0, 2, (byte) 21);
                    } catch (Exception e) {
                        AnonymousClass6IT.A00(C023109s.A0R, AnonymousClass000.A0l(e, "Encountered exception. Nothing much can be done here. ", AnonymousClass000.A0u()));
                    }
                    ack.A02();
                }
                if (b == 2) {
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    A0u2.append("WATLS Exception\n");
                    String A0q = AnonymousClass000.A0q(ack.A00(), A0u2);
                    Throwable th = sSLException;
                    if (sSLException != null) {
                        th = C165587tf.A0m(sSLException);
                    }
                    iOException = new IOException(A0q, th);
                }
            }
            throw iOException;
        }
    }

    public static void A07(C21914Ack ack, byte[] bArr, byte b) {
        byte[] A012 = AnonymousClass9ZW.A01(bArr, b);
        ack.A03.A0D.A01(A012, 0, A012.length, (byte) 22);
        ack.A03.A0F.A00(A012);
    }

    public synchronized void close() {
        if (!this.A0D) {
            if (this.A0C) {
                A06(this, (SSLException) null, (byte) 1, (byte) 0, false);
            } else {
                A02();
            }
        }
    }

    public boolean getEnableSessionCreation() {
        return true;
    }

    public boolean getUseClientMode() {
        return true;
    }

    public void setEnableSessionCreation(boolean z) {
    }

    public void setUseClientMode(boolean z) {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:10|11|12|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00be, code lost:
        if (r7 == null) goto L_0x00cb;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x00aa */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x010e A[Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x013d A[Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x014e A[Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x019b A[Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x01bb A[Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void startHandshake() {
        /*
            r10 = this;
            r4 = 2
            r5 = 0
            java.lang.Integer r1 = X.C023109s.A0C     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            java.lang.String r0 = "Start handshake."
            X.AnonymousClass6IT.A00(r1, r0)     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            boolean r0 = r10.A0C     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            if (r0 != 0) goto L_0x01dc
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            r10.A0E = r0     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            r6 = 1
            r10.A0C = r6     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            X.Aci r3 = r10.A00     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            X.ADg r1 = r10.A03     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            X.8xv r0 = new X.8xv     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            r0.<init>()     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            r1.A0A = r0     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            X.ADg r2 = r10.A03     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            X.8f9 r3 = (X.AnonymousClass8f9) r3     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            X.0yy r0 = r3.A01     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            r2.A0H = r0     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            java.lang.String r0 = "SHA-256"
            r2.A0R = r0     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            r0 = 32
            r2.A04 = r0     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            r9 = 32
            X.9TH r0 = new X.9TH     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            r0.<init>()     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            r2.A0B = r0     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            X.0z0 r0 = r3.A04     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            X.0yz r1 = r0.A00     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            X.9Rf r0 = new X.9Rf     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            r2.A0I = r0     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            X.ADg r7 = r10.A03     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            X.9Rf r0 = r7.A0I     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            X.0yz r0 = r0.A02     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            r7.A0J = r0     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            X.0yp r0 = r3.A03     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            r7.A0K = r0     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            X.0yq r0 = r3.A02     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            X.0yp r0 = r0.A00     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            X.9Id r1 = new X.9Id     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            r7.A0L = r1     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            javax.net.ssl.X509TrustManager r0 = r3.A07     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            r1.A00 = r0     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            java.lang.String r0 = "http/1.1"
            r7.A0Q = r0     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            X.0yw r0 = r3.A00     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            r7.A0G = r0     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            java.io.InputStream r2 = r10.A07     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            X.8xv r1 = r7.A0A     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            X.8fA r0 = new X.8fA     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            r0.<init>(r1, r2)     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            r7.A0C = r0     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            X.ADg r2 = r10.A03     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            java.io.OutputStream r1 = r10.A08     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            X.8fC r0 = new X.8fC     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            r2.A0D = r0     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            X.9Fv r0 = new X.9Fv     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            r0.<init>()     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            r2.A0M = r0     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            X.ADg r0 = r10.A03     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            r0.A02 = r6     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            X.0z1 r1 = r3.A06     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            if (r1 == 0) goto L_0x00cb
            java.lang.String r0 = r10.A09     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            java.lang.String r7 = r1.A00(r0)     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            if (r7 == 0) goto L_0x009b
            int r0 = r7.length()     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            if (r0 != 0) goto L_0x00c0
        L_0x009b:
            java.lang.String r0 = r10.A09     // Catch:{ UnknownHostException -> 0x00aa }
            java.net.InetAddress r0 = java.net.InetAddress.getByName(r0)     // Catch:{ UnknownHostException -> 0x00aa }
            java.lang.String r0 = r0.getHostAddress()     // Catch:{ UnknownHostException -> 0x00aa }
            java.lang.String r7 = r1.A00(r0)     // Catch:{ UnknownHostException -> 0x00aa }
            goto L_0x00be
        L_0x00aa:
            java.lang.Integer r2 = X.C023109s.A0R     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            java.lang.String r0 = "Failed to normalize the IP address "
            r1.append(r0)     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            java.lang.String r0 = r10.A09     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            X.AnonymousClass6IT.A00(r2, r0)     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
        L_0x00be:
            if (r7 == 0) goto L_0x00cb
        L_0x00c0:
            int r0 = r7.length()     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            if (r0 <= 0) goto L_0x00cb
            X.ADg r2 = r10.A03     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            r2.A0S = r7     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            goto L_0x00d1
        L_0x00cb:
            X.ADg r2 = r10.A03     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            java.lang.String r0 = r10.A09     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            r2.A0S = r0     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
        L_0x00d1:
            java.util.HashMap r0 = X.AnonymousClass001.A0J()     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            r2.A0W = r0     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            java.io.InputStream r0 = r10.A07     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            r2.A0O = r0     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            java.io.OutputStream r0 = r10.A08     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            r2.A0P = r0     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            X.8xt r0 = r10.A02     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            X.8xv r0 = r0.A00     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            r2.A09 = r0     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            X.0ys r0 = r3.A05     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            r2.A0N = r0     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            r2.A0c = r5     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            r2.A0e = r6     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            byte[] r1 = new byte[r9]     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            r2.A0m = r1     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            X.9Fv r0 = r2.A0M     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            java.security.SecureRandom r0 = r0.A00     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            r0.nextBytes(r1)     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            X.ADg r0 = r10.A03     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            X.0ys r2 = r0.A0N     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            java.lang.String r1 = r0.A0S     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            int r0 = r10.A01     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            java.lang.String r8 = "TLS_AES_128_GCM_SHA256"
            byte[] r0 = X.C203439o1.A09(r1, r8, r0)     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            javax.net.ssl.SSLSession r7 = r2.getSession(r0)     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            X.AZ5 r7 = (X.AZ5) r7     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            if (r7 != 0) goto L_0x011b
            X.ADg r0 = r10.A03     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            X.0ys r2 = r0.A0N     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            java.lang.String r1 = r0.A0S     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            int r0 = r10.A01     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            X.AZ5 r7 = new X.AZ5     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            r7.<init>(r2, r1, r8, r0)     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
        L_0x011b:
            r10.A04 = r7     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            X.ADg r0 = r10.A03     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            r0.A0E = r7     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            r10.A05 = r7     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            byte[] r1 = new byte[r9]     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            r0.A0k = r1     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            X.9Fv r0 = r0.A0M     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            java.security.SecureRandom r0 = r0.A00     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            r0.nextBytes(r1)     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            X.ADg r0 = r10.A03     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            X.9Rf r0 = r0.A0I     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            r0.A00()     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            X.ADg r2 = r10.A03     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            X.9Rf r1 = r2.A0I     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            X.35y r0 = r1.A01     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            if (r0 != 0) goto L_0x0140
            r1.A00()     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
        L_0x0140:
            X.35y r0 = r1.A01     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            byte[] r0 = r0.A01     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            r2.A0j = r0     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            X.ADg r2 = r10.A03     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            X.9Rf r1 = r2.A0I     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            X.35y r0 = r1.A01     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            if (r0 != 0) goto L_0x0151
            r1.A00()     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
        L_0x0151:
            X.35y r0 = r1.A01     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            byte[] r0 = r0.A00     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            r2.A0i = r0     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            X.ADg r2 = r10.A03     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            java.lang.String r1 = r2.A0R     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            X.9Xj r0 = new X.9Xj     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            r2.A0F = r0     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            X.ADg r2 = r10.A03     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            r2.A0f = r5     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            r2.A0a = r5     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            boolean r0 = r3.A08     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            r2.A0b = r0     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            r2.A0T = r0     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            r2.A0U = r0     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            r0 = 1073741824(0x40000000, double:5.304989477E-315)
            r2.A08 = r0     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            byte[] r0 = A08(r2)     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            byte[] r3 = X.AnonymousClass9ZW.A01(r0, r6)     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            X.ADg r0 = r10.A03     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            X.9TI r2 = r0.A0D     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            r1 = 22
            int r0 = r3.length     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            r2.A01(r3, r5, r0, r1)     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            X.ADg r1 = r10.A03     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            boolean r0 = r1.A0b     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            if (r0 == 0) goto L_0x01bb
            X.AZ5 r0 = r1.A0E     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            com.whatsapp.net.tls13.WtCachedPsk r0 = r0.A01     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            if (r0 == 0) goto L_0x01bb
            boolean r0 = r1.A0e     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            if (r0 == 0) goto L_0x01ae
            X.9TI r2 = r1.A0D     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            r1 = 20
            byte[] r0 = new byte[r6]     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            r0[r5] = r6     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            r2.A01(r0, r5, r6, r1)     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            X.ADg r1 = r10.A03     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            r1.A0f = r6     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
        L_0x01ae:
            r1.A0Z = r6     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            X.9Pl r1 = r10.A06     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            X.8ew r0 = new X.8ew     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            r0.<init>(r3)     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            r1.A00(r0)     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            return
        L_0x01bb:
            X.9Pl r1 = r10.A06     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            X.8ev r0 = new X.8ev     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            r0.<init>(r3)     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            r1.A00(r0)     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            r10.A09()     // Catch:{ IOException -> 0x01e8, 0yt -> 0x01dd, Exception -> 0x01c9 }
            return
        L_0x01c9:
            r0 = move-exception
            r3 = 80
            java.lang.String r2 = r0.getMessage()
            java.lang.Throwable r1 = X.C165587tf.A0m(r0)
            javax.net.ssl.SSLException r0 = new javax.net.ssl.SSLException
            r0.<init>(r2, r1)
            A06(r10, r0, r4, r3, r5)
        L_0x01dc:
            return
        L_0x01dd:
            r0 = move-exception
            byte r2 = r0.description
            boolean r1 = r0.errorTransient
            javax.net.ssl.SSLException r0 = r0.ex
            A06(r10, r0, r4, r2, r1)
            return
        L_0x01e8:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21914Ack.startHandshake():void");
    }

    public static void A03(C191829Eq r5, C21914Ack ack) {
        byte[] bArr = (byte[]) r5.A00;
        Integer num = C023109s.A01;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Received Alert: Level ");
        A0u.append(bArr[0]);
        A0u.append(" Description ");
        byte b = bArr[1];
        A0u.append(A01(b));
        A0u.append("(");
        A0u.append(b);
        AnonymousClass6IT.A00(num, C90474aD.A0f(A0u));
        ack.A02();
        byte b2 = bArr[1];
        if (b2 == 0 || b2 == 50) {
            throw new IOException(new SSLException(C90464aC.A0h(b2, "Received alert ").toString()));
        }
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("WATLS Exception\n");
        throw new IOException(AnonymousClass000.A0q(ack.A00(), A0u2), new SSLException(C90464aC.A0h(b2, "Received alert ").toString()));
    }

    public static byte[] A08(C21224ADg aDg) {
        ByteBuffer allocate;
        long currentTimeMillis;
        short s;
        byte[] bArr;
        if (aDg != null) {
            byte[] bArr2 = aDg.A0k;
            if (bArr2 == null || bArr2.length != 32) {
                throw C165567td.A0E("Client random is not correctly initialized.", (byte) 80);
            } else if (aDg.A0m != null) {
                C199829g5 r5 = new C199829g5();
                try {
                    String str = aDg.A0Q;
                    if (str != null) {
                        if (!str.isEmpty()) {
                            byte[] bytes = str.getBytes(DefaultCrypto.UTF_8);
                            int length = bytes.length;
                            ByteBuffer allocate2 = ByteBuffer.allocate(length + 3);
                            C203439o1.A05(length + 1, allocate2);
                            allocate2.put((byte) length);
                            allocate2.put(bytes);
                            A04(r5, allocate2, 16);
                        }
                    }
                    ByteBuffer allocate3 = ByteBuffer.allocate(4);
                    allocate3.putShort(2);
                    allocate3.putShort(1027);
                    A04(r5, allocate3, 13);
                    ByteBuffer allocate4 = ByteBuffer.allocate(4);
                    allocate4.putShort(2);
                    allocate4.putShort(29);
                    A04(r5, allocate4, 10);
                    ByteBuffer allocate5 = ByteBuffer.allocate(2);
                    allocate5.put((byte) 1);
                    allocate5.put(aDg.A02);
                    A04(r5, allocate5, 45);
                    ByteBuffer allocate6 = ByteBuffer.allocate(5);
                    allocate6.put((byte) 4);
                    Set set = AnonymousClass9BG.A03;
                    allocate6.putShort(772);
                    allocate6.putShort(-1254);
                    A04(r5, allocate6, 43);
                    ByteBuffer allocate7 = ByteBuffer.allocate(4);
                    allocate7.putShort(2);
                    allocate7.putShort(1027);
                    A04(r5, allocate7, 50);
                    if (aDg.A0b && aDg.A0E.A01 != null && !aDg.A0d) {
                        C194619Ql r3 = new C194619Ql(new byte[0], 42);
                        ArrayList arrayList = r5.A02;
                        int i = r5.A00;
                        arrayList.add(i, r3);
                        r5.A01 += r3.A01.length + 4;
                        r5.A00 = i + 1;
                    }
                    try {
                        byte[] bytes2 = aDg.A0S.getBytes(DefaultCrypto.UTF_8);
                        int length2 = bytes2.length;
                        ByteBuffer allocate8 = ByteBuffer.allocate(length2 + 5);
                        C203439o1.A05(length2 + 3, allocate8);
                        allocate8.put(C203439o1.A07(length2));
                        allocate8.put(bytes2);
                        A04(r5, allocate8, 0);
                        if (aDg.A0d && (bArr = aDg.A0l) != null) {
                            ByteBuffer allocate9 = ByteBuffer.allocate(bArr.length + 2);
                            C203439o1.A05(bArr.length, allocate9);
                            allocate9.put(bArr);
                            A04(r5, allocate9, 44);
                        }
                        if (!aDg.A0d || (s = aDg.A0X) == 29) {
                            ByteBuffer allocate10 = ByteBuffer.allocate(38);
                            C203439o1.A05(36, allocate10);
                            allocate10.putShort(29);
                            C203439o1.A05(32, allocate10);
                            allocate10.put(aDg.A0j);
                            A04(r5, allocate10, 51);
                            ByteBuffer allocate11 = ByteBuffer.allocate(r5.A01);
                            Iterator it = r5.A02.iterator();
                            while (it.hasNext()) {
                                C194619Ql r52 = (C194619Ql) it.next();
                                byte[] bArr3 = r52.A01;
                                int length3 = bArr3.length;
                                ByteBuffer allocate12 = ByteBuffer.allocate(length3 + 4);
                                allocate12.putShort(r52.A00);
                                C203439o1.A05(length3, allocate12);
                                allocate12.put(bArr3);
                                allocate11.put(allocate12.array());
                            }
                            byte[] array = allocate11.array();
                            WtCachedPsk wtCachedPsk = aDg.A0E.A01;
                            if (wtCachedPsk == null) {
                                allocate = ByteBuffer.allocate(0);
                            } else {
                                allocate = ByteBuffer.allocate(wtCachedPsk.ticket.length + 6 + 6 + aDg.A04 + 1 + 2);
                                byte[] bArr4 = aDg.A0E.A01.ticket;
                                allocate.putShort(41);
                                C203439o1.A05(allocate.capacity() - 4, allocate);
                                int length4 = bArr4.length;
                                C203439o1.A05(length4 + 6, allocate);
                                C203439o1.A05(length4, allocate);
                                allocate.put(bArr4);
                                WtCachedPsk wtCachedPsk2 = aDg.A0E.A01;
                                if (wtCachedPsk2.useTestTime) {
                                    currentTimeMillis = 3600000;
                                } else {
                                    currentTimeMillis = System.currentTimeMillis();
                                }
                                long j = currentTimeMillis - wtCachedPsk2.ticketIssuedTime;
                                if (j < 0) {
                                    j = 0;
                                }
                                long j2 = (j + wtCachedPsk2.ticketAgeAdd) % 4294967296L;
                                if (j2 < 0) {
                                    j2 += 4294967296L;
                                }
                                if (j2 < 0 || j2 >= 4294967296L) {
                                    StringBuilder A0u = AnonymousClass000.A0u();
                                    A0u.append("Invalid argument. The supplied long value = ");
                                    A0u.append(j2);
                                    A0u.append(" does not  fit in 4 bytes.");
                                    throw C165567td.A0D(A0u, (byte) 80);
                                }
                                allocate.put(new byte[]{(byte) ((int) ((j2 >> 24) & 255)), (byte) ((int) ((j2 >> 16) & 255)), (byte) ((int) ((j2 >> 8) & 255)), (byte) ((int) (j2 & 255))});
                            }
                            int length5 = array.length + allocate.capacity();
                            ByteBuffer allocate13 = ByteBuffer.allocate(aDg.A0m.length + 35 + 2 + 2 + 1 + 1 + 2 + length5);
                            allocate13.putShort(771);
                            allocate13.put(aDg.A0k);
                            allocate13.put((byte) aDg.A0m.length);
                            allocate13.put(aDg.A0m);
                            allocate13.putShort(2);
                            allocate13.putShort(4865);
                            allocate13.put((byte) 1);
                            allocate13.put((byte) 0);
                            C203439o1.A05(length5, allocate13);
                            allocate13.put(array);
                            if (aDg.A0E.A01 != null) {
                                try {
                                    MessageDigest messageDigest = (MessageDigest) aDg.A0F.A00.clone();
                                    byte[] copyOfRange = Arrays.copyOfRange(allocate13.array(), 0, allocate13.position());
                                    byte[] copyOfRange2 = Arrays.copyOfRange(allocate.array(), 0, allocate.position());
                                    messageDigest.update((byte) 1);
                                    messageDigest.update(C203439o1.A07(allocate13.capacity()));
                                    messageDigest.update(copyOfRange);
                                    messageDigest.update(copyOfRange2);
                                    byte[] digest = messageDigest.digest();
                                    int i2 = aDg.A04 + 1;
                                    ByteBuffer allocate14 = ByteBuffer.allocate(i2 + 2);
                                    C203439o1.A05(i2, allocate14);
                                    try {
                                        byte[] A0B2 = C203439o1.A0B(aDg.A0R, AnonymousClass9TH.A00(aDg.A0B, aDg, "finished", new byte[0], AnonymousClass9TH.A00(aDg.A0B, aDg, "res binder", MessageDigest.getInstance(aDg.A0R).digest(), aDg.A0B.A01(new byte[aDg.A04], aDg.A0E.A01.pskVal))), digest);
                                        allocate14.put((byte) A0B2.length);
                                        allocate14.put(A0B2);
                                        allocate.put(allocate14.array());
                                        allocate13.put(allocate.array());
                                    } catch (NoSuchAlgorithmException e) {
                                        throw C165577te.A0W(e);
                                    }
                                } catch (CloneNotSupportedException e2) {
                                    throw C165577te.A0W(e2);
                                }
                            }
                            return allocate13.array();
                        }
                        StringBuilder A0u2 = AnonymousClass000.A0u();
                        A0u2.append("Must use key group sent by HelloRetryRequest: ");
                        A0u2.append(s);
                        A0u2.append(" client key group: ");
                        A0u2.append(29);
                        throw C165567td.A0D(A0u2, (byte) 80);
                    } catch (UnsupportedEncodingException e3) {
                        throw C165577te.A0W(e3);
                    }
                } catch (UnsupportedEncodingException e4) {
                    throw C165577te.A0W(e4);
                }
            } else {
                throw C165567td.A0E("Legacy session id is not correctly initialized.", (byte) 80);
            }
        } else {
            throw C165567td.A0E("Illegal argument. Context cannot be null.", (byte) 80);
        }
    }

    public void A09() {
        C191829Eq A012;
        while (true) {
            boolean equals = this.A06.A00.A00.equals(AnonymousClass9BJ.A07);
            C21224ADg aDg = this.A03;
            if (!equals) {
                C196069Xn r2 = aDg.A0C;
                synchronized (r2) {
                    A012 = r2.A01();
                }
                if (!(A012 instanceof AnonymousClass8f2)) {
                    if (A012 instanceof C178078eq) {
                        A03(A012, this);
                        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                    }
                    this.A06.A00(A012);
                    if (A012 instanceof AnonymousClass8f0) {
                        A07(this, A08(this.A03), (byte) 1);
                    }
                }
            } else {
                if (!aDg.A0c) {
                    A06(this, new SSLException("Server must either choose a PSK or send certificates."), (byte) 2, (byte) 116, false);
                }
                if (this.A03.A0g) {
                    A07(this, new byte[0], (byte) 5);
                }
                C21224ADg aDg2 = this.A03;
                if (aDg2.A0e && !aDg2.A0f) {
                    aDg2.A0D.A01(new byte[]{1}, 0, 1, (byte) 20);
                }
                C21224ADg aDg3 = this.A03;
                C21223ADf aDf = new C21223ADf();
                aDf.A00(C165617ti.A0j("client_hs_key", aDg3.A0W), C165617ti.A0j("client_hs_iv", this.A03.A0W));
                C21224ADg aDg4 = this.A03;
                aDg4.A0D = new AnonymousClass8fD(aDf, aDg4.A0P);
                if (aDg4.A0Y) {
                    A07(this, new byte[4], (byte) 11);
                }
                C21224ADg aDg5 = this.A03;
                if (aDg5 != null) {
                    byte[] A013 = aDg5.A0F.A01();
                    byte[] A014 = AnonymousClass9ZW.A01(C203439o1.A0B(aDg5.A0R, C165617ti.A0j("client_finished", aDg5.A0W), A013), (byte) 20);
                    this.A03.A0D.A01(A014, 0, A014.length, (byte) 22);
                    this.A06.A00(new C178118eu(A014));
                    long currentTimeMillis = System.currentTimeMillis();
                    this.A0B = true;
                    Integer num = C023109s.A0C;
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("Handshake complete : session_resumed ");
                    C21224ADg aDg6 = this.A03;
                    A0u.append(aDg6.A0h);
                    A0u.append(" early_data_sent ");
                    A0u.append(aDg6.A0a);
                    A0u.append(" early_data_accepted ");
                    A0u.append(aDg6.A0g);
                    A0u.append(" client_cert_requested ");
                    A0u.append(aDg6.A0Y);
                    A0u.append(" time_ms ");
                    AnonymousClass6IT.A00(num, C36411kG.A11(A0u, currentTimeMillis - this.A0E));
                    HandshakeCompletedEvent handshakeCompletedEvent = new HandshakeCompletedEvent(this, this.A05);
                    for (HandshakeCompletedListener handshakeCompleted : this.A0A) {
                        handshakeCompleted.handshakeCompleted(handshakeCompletedEvent);
                    }
                    return;
                }
                throw C165567td.A0E("Illegal argument. Context cannot be null.", (byte) 80);
            }
        }
    }

    public void A0A() {
        AnonymousClass6IT.A00 = new C177858eU((AnonymousClass8f9) this.A00);
        if (this instanceof C178178fE) {
            C178178fE r2 = (C178178fE) this;
            Socket socket = r2.A00;
            r2.A07 = socket.getInputStream();
            r2.A08 = socket.getOutputStream();
        } else {
            this.A07 = super.getInputStream();
            this.A08 = super.getOutputStream();
        }
        this.A02 = new C187448xt(this);
        this.A0F = new C187508xz(this);
        C21224ADg aDg = new C21224ADg();
        this.A03 = aDg;
        try {
            this.A06 = new C194379Pl(aDg);
        } catch (C21240yt e) {
            throw new IOException(e);
        }
    }

    public void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.A0A.add(handshakeCompletedListener);
    }

    public SocketChannel getChannel() {
        throw C90524aI.A0Y("Channels are not supported by WtSocket.");
    }

    public String[] getEnabledProtocols() {
        return new String[]{"TLSv1.3", "TLSv1.2"};
    }

    public InputStream getInputStream() {
        C187448xt r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C90524aI.A0X("Input stream is closed.");
    }

    public boolean getNeedClientAuth() {
        return this.A00.getNeedClientAuth();
    }

    public OutputStream getOutputStream() {
        C187508xz r0 = this.A0F;
        if (r0 != null) {
            return r0;
        }
        throw C90524aI.A0X("Output stream is closed.");
    }

    public String[] getSupportedProtocols() {
        return new String[]{"TLSv1.3", "TLSv1.2"};
    }

    public boolean getWantClientAuth() {
        return this.A00.getWantClientAuth();
    }

    public void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.A0A.remove(handshakeCompletedListener);
    }

    public void setEnabledCipherSuites(String[] strArr) {
        this.A00.setCipherSuites(strArr);
    }

    public void setEnabledProtocols(String[] strArr) {
        this.A00.setProtocols(strArr);
    }

    public void setNeedClientAuth(boolean z) {
        this.A00.setNeedClientAuth(z);
    }

    public void setSSLParameters(SSLParameters sSLParameters) {
        if (sSLParameters instanceof C21912Aci) {
            this.A00 = (C21912Aci) sSLParameters;
        }
    }

    public void setWantClientAuth(boolean z) {
        this.A00.setWantClientAuth(z);
    }

    public C21914Ack(C21912Aci aci, InetAddress inetAddress, int i) {
        super(inetAddress, i);
        A05(this);
        this.A00 = aci;
        this.A09 = null;
        this.A01 = i;
        A0A();
    }

    private String A00() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("host=");
        C21224ADg aDg = this.A03;
        A0u.append(aDg.A0S);
        A0u.append(" hrr=");
        A0u.append(aDg.A0d);
        A0u.append(" r=");
        A0u.append(aDg.A0h);
        A0u.append(" ed=");
        A0u.append(aDg.A0a);
        A0u.append(" eda=");
        A0u.append(aDg.A0g);
        A0u.append(" s=");
        return AnonymousClass000.A0q(this.A06.A00.A00.A03, A0u);
    }

    public static void A04(C199829g5 r4, ByteBuffer byteBuffer, short s) {
        C194619Ql r3 = new C194619Ql(byteBuffer.array(), s);
        ArrayList arrayList = r4.A02;
        int i = r4.A00;
        arrayList.add(i, r3);
        r4.A01 += r3.A01.length + 4;
        r4.A00 = i + 1;
    }

    public String[] getEnabledCipherSuites() {
        String[] A1S = C36441kJ.A1S();
        A1S[0] = "TLS_AES_128_GCM_SHA256";
        A1S[1] = "use default";
        return A1S;
    }

    public SSLSession getHandshakeSession() {
        return this.A04;
    }

    public SSLParameters getSSLParameters() {
        return this.A00;
    }

    public SSLSession getSession() {
        return this.A05;
    }

    public String[] getSupportedCipherSuites() {
        String[] A1S = C36441kJ.A1S();
        A1S[0] = "TLS_AES_128_GCM_SHA256";
        A1S[1] = "use default";
        return A1S;
    }

    public boolean isClosed() {
        return this.A0D;
    }

    public C21914Ack(C21912Aci aci, String str, int i) {
        super(str, i);
        A05(this);
        this.A00 = aci;
        this.A09 = str;
        this.A01 = i;
        A0A();
    }

    public C21914Ack(C21912Aci aci) {
        A05(this);
        this.A00 = aci;
        this.A09 = null;
        this.A01 = -1;
        A0A();
    }

    public C21914Ack(C21912Aci aci, String str, InetAddress inetAddress, int i, int i2) {
        super(str, i, inetAddress, i2);
        A05(this);
        this.A00 = aci;
        this.A09 = str;
        this.A01 = i;
        A0A();
    }

    public C21914Ack(C21912Aci aci, InetAddress inetAddress, InetAddress inetAddress2, int i, int i2) {
        super(inetAddress, i, inetAddress2, i2);
        A05(this);
        this.A00 = aci;
        this.A09 = inetAddress.getHostName();
        this.A01 = i;
        A0A();
    }

    public C21914Ack() {
        A05(this);
    }
}
