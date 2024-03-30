package X;

import javax.net.ssl.SSLException;

/* renamed from: X.9P3  reason: invalid class name */
public abstract class AnonymousClass9P3 {
    public static byte[] A02(AnonymousClass9TH r3, byte[] bArr) {
        return r3.A02(bArr, C203439o1.A0A("iv", new byte[0], 12), 12);
    }

    public static byte[] A03(AnonymousClass9TH r3, byte[] bArr) {
        return r3.A02(bArr, C203439o1.A0A("key", new byte[0], 16), 16);
    }

    public static AnonymousClass8f8 A00(C16330oz r6, C191829Eq r7, C193599Mc r8, int i) {
        return new AnonymousClass8f8(r6, r7, r8, "Unexpected event type", new C21240yt(new SSLException("Unexpected event"), (byte) 80), i);
    }

    public static void A01(C21224ADg aDg) {
        aDg.A0E.A00 = System.currentTimeMillis();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void A04(X.C16330oz r18, X.C191829Eq r19, X.C193599Mc r20, int r21) {
        /*
            r17 = this;
            r0 = r18
            r4 = r17
            boolean r3 = r4 instanceof X.C178048en
            r1 = r19
            r16 = r20
            r2 = r21
            if (r3 == 0) goto L_0x002b
            X.ADg r0 = (X.C21224ADg) r0
            A01(r0)
            java.lang.Object r4 = r1.A00
            byte[] r4 = (byte[]) r4
            X.9Xj r3 = r0.A0F     // Catch:{ 0yt -> 0x001d }
            r3.A00(r4)     // Catch:{ 0yt -> 0x001d }
            return
        L_0x001d:
            r8 = move-exception
            java.lang.String r7 = "Failed to update transcripts."
            X.8f8 r3 = new X.8f8
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x002b:
            boolean r3 = r4 instanceof X.C178038em
            if (r3 == 0) goto L_0x0070
            X.ADg r0 = (X.C21224ADg) r0
            boolean r3 = r1 instanceof X.AnonymousClass8f7
            if (r3 == 0) goto L_0x0069
            A01(r0)     // Catch:{ 0yt -> 0x0056, RuntimeException -> 0x0048 }
            r3 = r1
            X.8f7 r3 = (X.AnonymousClass8f7) r3     // Catch:{ 0yt -> 0x0056, RuntimeException -> 0x0048 }
            java.lang.Object r3 = r3.A00     // Catch:{ 0yt -> 0x0056, RuntimeException -> 0x0048 }
            byte[] r3 = (byte[]) r3     // Catch:{ 0yt -> 0x0056, RuntimeException -> 0x0048 }
            byte[] r4 = X.AnonymousClass9ZW.A00(r3)     // Catch:{ 0yt -> 0x0056, RuntimeException -> 0x0048 }
            r3 = 0
            X.C1900596s.A00(r0, r4, r3)     // Catch:{ 0yt -> 0x0056, RuntimeException -> 0x0048 }
            return
        L_0x0048:
            r8 = move-exception
            java.lang.String r7 = "Server Hello parse error."
            X.8f8 r3 = new X.8f8
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x0056:
            r4 = move-exception
            javax.net.ssl.SSLException r3 = r4.ex
            java.lang.String r7 = r3.getMessage()
            X.8f8 r3 = new X.8f8
            r8 = r4
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x0069:
            r3 = r16
            X.8f8 r0 = A00(r0, r1, r3, r2)
            throw r0
        L_0x0070:
            boolean r3 = r4 instanceof X.C178028el
            if (r3 == 0) goto L_0x00c8
            X.ADg r0 = (X.C21224ADg) r0
            boolean r3 = r1 instanceof X.AnonymousClass8f6
            r7 = 80
            if (r3 == 0) goto L_0x00c1
            A01(r0)     // Catch:{ 0yt -> 0x00b3 }
            java.lang.Object r3 = r1.A00     // Catch:{ 0yt -> 0x00b3 }
            byte[] r3 = (byte[]) r3     // Catch:{ 0yt -> 0x00b3 }
            byte[] r6 = X.AnonymousClass9ZW.A00(r3)     // Catch:{ 0yt -> 0x00b3 }
            java.util.Map r4 = r0.A0W     // Catch:{ 0yt -> 0x00b3 }
            java.lang.String r3 = "server_finished"
            byte[] r5 = X.C165617ti.A0j(r3, r4)     // Catch:{ 0yt -> 0x00b3 }
            X.9Xj r3 = r0.A0F     // Catch:{ 0yt -> 0x00b3 }
            byte[] r4 = r3.A02()     // Catch:{ 0yt -> 0x00b3 }
            java.lang.String r3 = r0.A0R     // Catch:{ 0yt -> 0x00b3 }
            byte[] r3 = X.C203439o1.A0B(r3, r5, r4)     // Catch:{ 0yt -> 0x00b3 }
            boolean r3 = X.C203439o1.A06(r3, r6)     // Catch:{ 0yt -> 0x00b3 }
            if (r3 != 0) goto L_0x0741
            java.lang.String r3 = "Failed to verify server fin."
            X.0yt r9 = X.C165567td.A0E(r3, r7)     // Catch:{ 0yt -> 0x00b3 }
            X.8f8 r4 = new X.8f8     // Catch:{ 0yt -> 0x00b3 }
            r8 = r3
            r10 = r2
            r6 = r1
            r7 = r16
            r5 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch:{ 0yt -> 0x00b3 }
            throw r4     // Catch:{ 0yt -> 0x00b3 }
        L_0x00b3:
            r8 = move-exception
            java.lang.String r7 = "Failed to process finished message."
            X.8f8 r3 = new X.8f8
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x00c1:
            r3 = r16
            X.8f8 r0 = A00(r0, r1, r3, r2)
            throw r0
        L_0x00c8:
            boolean r3 = r4 instanceof X.C178018ek
            if (r3 == 0) goto L_0x0256
            X.ADg r0 = (X.C21224ADg) r0
            java.lang.String r10 = " got "
            java.lang.String r9 = "Expected signature scheme "
            A01(r0)
            boolean r3 = r1 instanceof X.AnonymousClass8f5
            r8 = 80
            if (r3 == 0) goto L_0x024f
            java.lang.String r4 = "TLS 1.3, server CertificateVerify"
            java.lang.String r3 = "UTF-8"
            byte[] r7 = r4.getBytes(r3)     // Catch:{ UnsupportedEncodingException -> 0x023d }
            r3 = 64
            byte[] r6 = new byte[r3]
            r3 = 32
            java.util.Arrays.fill(r6, r3)
            java.lang.Object r3 = r1.A00     // Catch:{ 0yt -> 0x022f }
            byte[] r3 = (byte[]) r3     // Catch:{ 0yt -> 0x022f }
            byte[] r3 = X.AnonymousClass9ZW.A00(r3)     // Catch:{ 0yt -> 0x022f }
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r3)     // Catch:{ 0yt -> 0x022f }
            short r5 = r3.getShort()     // Catch:{ 0yt -> 0x022f }
            byte[] r15 = X.C203439o1.A0C(r3)     // Catch:{ 0yt -> 0x022f }
            r4 = 1027(0x403, float:1.439E-42)
            if (r5 != r4) goto L_0x020e
            X.9Xj r3 = r0.A0F     // Catch:{ 0yt -> 0x022f }
            byte[] r5 = r3.A02()     // Catch:{ 0yt -> 0x022f }
            int r3 = r7.length
            int r3 = r3 + 64
            r8 = 1
            int r4 = r3 + 1
            int r3 = r5.length
            int r4 = r4 + r3
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r4)
            r3.put(r6)
            r3.put(r7)
            r10 = 0
            r3.put(r10)
            r3.put(r5)
            byte[] r14 = r3.array()
            java.util.ArrayList r9 = X.AnonymousClass001.A0I()
            java.util.List r3 = r0.A0V
            java.util.Iterator r6 = r3.iterator()
        L_0x0131:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L_0x0165
            java.lang.Object r5 = r6.next()
            X.9Qk r5 = (X.C194609Qk) r5
            java.lang.String r3 = "X.509"
            java.security.cert.CertificateFactory r4 = java.security.cert.CertificateFactory.getInstance(r3)     // Catch:{ CertificateException -> 0x0151 }
            byte[] r3 = r5.A00     // Catch:{ CertificateException -> 0x0151 }
            java.io.ByteArrayInputStream r3 = X.C90524aI.A0P(r3)     // Catch:{ CertificateException -> 0x0151 }
            java.security.cert.Certificate r3 = r4.generateCertificate(r3)     // Catch:{ CertificateException -> 0x0151 }
            r9.add(r3)     // Catch:{ CertificateException -> 0x0151 }
            goto L_0x0131
        L_0x0151:
            r4 = move-exception
            javax.net.ssl.SSLException r3 = new javax.net.ssl.SSLException
            r3.<init>(r4)
            java.lang.String r8 = "Bad certificate"
            X.8f8 r4 = new X.8f8
            r9 = r3
            r10 = r2
            r6 = r1
            r7 = r16
            r5 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            throw r4
        L_0x0165:
            X.9Id r5 = r0.A0L     // Catch:{ 0yt -> 0x0200 }
            java.security.cert.X509Certificate[] r3 = new java.security.cert.X509Certificate[r10]     // Catch:{ 0yt -> 0x0200 }
            java.lang.Object[] r13 = r9.toArray(r3)     // Catch:{ 0yt -> 0x0200 }
            java.security.cert.X509Certificate[] r13 = (java.security.cert.X509Certificate[]) r13     // Catch:{ 0yt -> 0x0200 }
            java.lang.String r12 = r0.A0S     // Catch:{ 0yt -> 0x0200 }
            java.lang.String r11 = ""
            r6 = 42
            r7 = 80
            javax.net.ssl.X509TrustManager r3 = r5.A00     // Catch:{ NoSuchAlgorithmException -> 0x01f2, InvalidKeyException -> 0x01f9, SignatureException -> 0x01eb }
            if (r3 == 0) goto L_0x01dd
            if (r13 == 0) goto L_0x01e4
            int r3 = r13.length     // Catch:{ NoSuchAlgorithmException -> 0x01f2, InvalidKeyException -> 0x01f9, SignatureException -> 0x01eb }
            if (r3 == 0) goto L_0x01e4
            java.lang.String r3 = "SHA256withECDSA"
            java.security.Signature r4 = java.security.Signature.getInstance(r3)     // Catch:{ NoSuchAlgorithmException -> 0x01f2, InvalidKeyException -> 0x01f9, SignatureException -> 0x01eb }
            r3 = r13[r10]     // Catch:{ NoSuchAlgorithmException -> 0x01f2, InvalidKeyException -> 0x01f9, SignatureException -> 0x01eb }
            r4.initVerify(r3)     // Catch:{ NoSuchAlgorithmException -> 0x01f2, InvalidKeyException -> 0x01f9, SignatureException -> 0x01eb }
            r4.update(r14)     // Catch:{ NoSuchAlgorithmException -> 0x01f2, InvalidKeyException -> 0x01f9, SignatureException -> 0x01eb }
            boolean r14 = r4.verify(r15)     // Catch:{ NoSuchAlgorithmException -> 0x01f2, InvalidKeyException -> 0x01f9, SignatureException -> 0x01eb }
            if (r14 == 0) goto L_0x01a4
            javax.net.ssl.X509TrustManager r4 = r5.A00     // Catch:{ CertificateException -> 0x019c }
            java.lang.String r3 = "EC"
            r4.checkServerTrusted(r13, r3)     // Catch:{ CertificateException -> 0x019c }
            goto L_0x01a4
        L_0x019c:
            r4 = move-exception
            java.lang.String r3 = "Certificate could not be verified"
            X.0yt r3 = X.C165577te.A0V(r3, r4, r6)     // Catch:{ NoSuchAlgorithmException -> 0x01f2, InvalidKeyException -> 0x01f9, SignatureException -> 0x01eb }
            goto L_0x01ea
        L_0x01a4:
            r5 = 0
            r3 = -1
            X.AZ5 r4 = new X.AZ5     // Catch:{ NoSuchAlgorithmException -> 0x01f2, InvalidKeyException -> 0x01f9, SignatureException -> 0x01eb }
            r4.<init>(r5, r11, r11, r3)     // Catch:{ NoSuchAlgorithmException -> 0x01f2, InvalidKeyException -> 0x01f9, SignatureException -> 0x01eb }
            r4.A01(r13)     // Catch:{ NoSuchAlgorithmException -> 0x01f2, InvalidKeyException -> 0x01f9, SignatureException -> 0x01eb }
            javax.net.ssl.HostnameVerifier r3 = javax.net.ssl.HttpsURLConnection.getDefaultHostnameVerifier()     // Catch:{ NoSuchAlgorithmException -> 0x01f2, InvalidKeyException -> 0x01f9, SignatureException -> 0x01eb }
            boolean r3 = r3.verify(r12, r4)     // Catch:{ NoSuchAlgorithmException -> 0x01f2, InvalidKeyException -> 0x01f9, SignatureException -> 0x01eb }
            if (r14 == 0) goto L_0x01ca
            if (r3 == 0) goto L_0x01ca
            X.AZ5 r2 = r0.A0E
            java.security.cert.Certificate[] r1 = new java.security.cert.Certificate[r10]
            java.lang.Object[] r1 = r9.toArray(r1)
            java.security.cert.Certificate[] r1 = (java.security.cert.Certificate[]) r1
            r2.A01(r1)
            r0.A0c = r8
            return
        L_0x01ca:
            java.lang.String r3 = "ServerCertificate verify failed."
            X.0yt r8 = X.C165567td.A0E(r3, r6)
            java.lang.String r7 = "Certificates could not be verified."
            X.8f8 r3 = new X.8f8
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x01dd:
            java.lang.String r3 = "Trust Manager cannot be null."
            X.0yt r3 = X.C165567td.A0E(r3, r7)     // Catch:{ NoSuchAlgorithmException -> 0x01f2, InvalidKeyException -> 0x01f9, SignatureException -> 0x01eb }
            goto L_0x01ea
        L_0x01e4:
            java.lang.String r3 = "Null or empty certificates certificates"
            X.0yt r3 = X.C165567td.A0E(r3, r7)     // Catch:{ NoSuchAlgorithmException -> 0x01f2, InvalidKeyException -> 0x01f9, SignatureException -> 0x01eb }
        L_0x01ea:
            throw r3     // Catch:{ NoSuchAlgorithmException -> 0x01f2, InvalidKeyException -> 0x01f9, SignatureException -> 0x01eb }
        L_0x01eb:
            java.lang.String r3 = "Signature is invalid"
            X.0yt r3 = X.C165567td.A0E(r3, r6)     // Catch:{ 0yt -> 0x0200 }
            goto L_0x01ff
        L_0x01f2:
            java.lang.String r3 = "SHA256withECDSA not found."
            X.0yt r3 = X.C165567td.A0E(r3, r7)     // Catch:{ 0yt -> 0x0200 }
            goto L_0x01ff
        L_0x01f9:
            java.lang.String r3 = "Certificate key is invalid."
            X.0yt r3 = X.C165567td.A0E(r3, r6)     // Catch:{ 0yt -> 0x0200 }
        L_0x01ff:
            throw r3     // Catch:{ 0yt -> 0x0200 }
        L_0x0200:
            r8 = move-exception
            java.lang.String r7 = "Certificates verify failed."
            X.8f8 r3 = new X.8f8
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x020e:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ 0yt -> 0x022f }
            X.C90464aC.A1K(r9, r10, r3, r4, r5)     // Catch:{ 0yt -> 0x022f }
            java.lang.String r7 = r3.toString()     // Catch:{ 0yt -> 0x022f }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ 0yt -> 0x022f }
            X.C90464aC.A1K(r9, r10, r3, r4, r5)     // Catch:{ 0yt -> 0x022f }
            X.0yt r8 = X.C165567td.A0D(r3, r8)     // Catch:{ 0yt -> 0x022f }
            X.8f8 r3 = new X.8f8     // Catch:{ 0yt -> 0x022f }
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch:{ 0yt -> 0x022f }
            throw r3     // Catch:{ 0yt -> 0x022f }
        L_0x022f:
            r8 = move-exception
            java.lang.String r7 = ""
            X.8f8 r3 = new X.8f8
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x023d:
            r3 = move-exception
            X.0yt r8 = X.C165577te.A0W(r3)
            java.lang.String r7 = "Could not encode context string in UTF-8"
            X.8f8 r3 = new X.8f8
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x024f:
            r3 = r16
            X.8f8 r0 = A00(r0, r1, r3, r2)
            throw r0
        L_0x0256:
            boolean r3 = r4 instanceof X.C178008ej
            if (r3 == 0) goto L_0x02f9
            X.ADg r0 = (X.C21224ADg) r0
            boolean r3 = r1 instanceof X.AnonymousClass8f4
            r5 = 80
            if (r3 == 0) goto L_0x02f2
            A01(r0)     // Catch:{ 0yt -> 0x02e4, RuntimeException -> 0x02d6 }
            r3 = r1
            X.8f4 r3 = (X.AnonymousClass8f4) r3     // Catch:{ 0yt -> 0x02e4, RuntimeException -> 0x02d6 }
            java.lang.Object r3 = r3.A00     // Catch:{ 0yt -> 0x02e4, RuntimeException -> 0x02d6 }
            byte[] r3 = (byte[]) r3     // Catch:{ 0yt -> 0x02e4, RuntimeException -> 0x02d6 }
            byte[] r3 = X.AnonymousClass9ZW.A00(r3)     // Catch:{ 0yt -> 0x02e4, RuntimeException -> 0x02d6 }
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r3)     // Catch:{ 0yt -> 0x02e4, RuntimeException -> 0x02d6 }
            byte r3 = r4.get()     // Catch:{ 0yt -> 0x02e4, RuntimeException -> 0x02d6 }
            if (r3 != 0) goto L_0x02c3
            r3 = 3
            byte[] r3 = new byte[r3]     // Catch:{ 0yt -> 0x02e4, RuntimeException -> 0x02d6 }
            r4.get(r3)     // Catch:{ 0yt -> 0x02e4, RuntimeException -> 0x02d6 }
            int r11 = X.C203439o1.A01(r3)     // Catch:{ 0yt -> 0x02e4, RuntimeException -> 0x02d6 }
            byte[] r3 = new byte[r11]     // Catch:{ 0yt -> 0x02e4, RuntimeException -> 0x02d6 }
            r4.get(r3)     // Catch:{ 0yt -> 0x02e4, RuntimeException -> 0x02d6 }
            java.util.ArrayList r10 = X.AnonymousClass001.A0I()     // Catch:{ 0yt -> 0x02e4, RuntimeException -> 0x02d6 }
            java.nio.ByteBuffer r9 = java.nio.ByteBuffer.wrap(r3)     // Catch:{ 0yt -> 0x02e4, RuntimeException -> 0x02d6 }
            r8 = 0
        L_0x0292:
            if (r8 >= r11) goto L_0x02c0
            r3 = 3
            byte[] r3 = new byte[r3]     // Catch:{ 0yt -> 0x02e4, RuntimeException -> 0x02d6 }
            r9.get(r3)     // Catch:{ 0yt -> 0x02e4, RuntimeException -> 0x02d6 }
            int r7 = X.C203439o1.A01(r3)     // Catch:{ 0yt -> 0x02e4, RuntimeException -> 0x02d6 }
            byte[] r6 = new byte[r7]     // Catch:{ 0yt -> 0x02e4, RuntimeException -> 0x02d6 }
            r9.get(r6)     // Catch:{ 0yt -> 0x02e4, RuntimeException -> 0x02d6 }
            int r5 = X.C203439o1.A00(r9)     // Catch:{ 0yt -> 0x02e4, RuntimeException -> 0x02d6 }
            byte[] r3 = new byte[r5]     // Catch:{ 0yt -> 0x02e4, RuntimeException -> 0x02d6 }
            r9.get(r3)     // Catch:{ 0yt -> 0x02e4, RuntimeException -> 0x02d6 }
            X.9g5 r4 = new X.9g5     // Catch:{ 0yt -> 0x02e4, RuntimeException -> 0x02d6 }
            r4.<init>(r3)     // Catch:{ 0yt -> 0x02e4, RuntimeException -> 0x02d6 }
            int r3 = r7 + 3
            int r3 = r3 + 2
            int r3 = r3 + r5
            int r8 = r8 + r3
            X.9Qk r3 = new X.9Qk     // Catch:{ 0yt -> 0x02e4, RuntimeException -> 0x02d6 }
            r3.<init>(r4, r6)     // Catch:{ 0yt -> 0x02e4, RuntimeException -> 0x02d6 }
            r10.add(r3)     // Catch:{ 0yt -> 0x02e4, RuntimeException -> 0x02d6 }
            goto L_0x0292
        L_0x02c0:
            r0.A0V = r10     // Catch:{ 0yt -> 0x02e4, RuntimeException -> 0x02d6 }
            return
        L_0x02c3:
            java.lang.String r7 = "Unexpected certificate size"
            java.lang.String r3 = "Unexpected Message"
            X.0yt r8 = X.C165567td.A0E(r3, r5)     // Catch:{ 0yt -> 0x02e4, RuntimeException -> 0x02d6 }
            X.8f8 r3 = new X.8f8     // Catch:{ 0yt -> 0x02e4, RuntimeException -> 0x02d6 }
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch:{ 0yt -> 0x02e4, RuntimeException -> 0x02d6 }
            throw r3     // Catch:{ 0yt -> 0x02e4, RuntimeException -> 0x02d6 }
        L_0x02d6:
            r8 = move-exception
            java.lang.String r7 = "Failed to parse certificate."
            X.8f8 r3 = new X.8f8
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x02e4:
            r8 = move-exception
            java.lang.String r7 = "Failed to process certificate"
            X.8f8 r3 = new X.8f8
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x02f2:
            r3 = r16
            X.8f8 r0 = A00(r0, r1, r3, r2)
            throw r0
        L_0x02f9:
            boolean r3 = r4 instanceof X.C177998ei
            if (r3 == 0) goto L_0x0309
            X.ADg r0 = (X.C21224ADg) r0
            A01(r0)
            r3 = r16
            X.8f8 r0 = A00(r0, r1, r3, r2)
            throw r0
        L_0x0309:
            boolean r3 = r4 instanceof X.C177988eh
            if (r3 == 0) goto L_0x048f
            X.ADg r0 = (X.C21224ADg) r0
            java.lang.String r5 = "Invalid key update type "
            A01(r0)
            boolean r3 = r1 instanceof X.AnonymousClass8f3
            r6 = 80
            if (r3 == 0) goto L_0x0488
            java.lang.Object r3 = r1.A00
            byte[] r3 = (byte[]) r3
            byte[] r3 = X.AnonymousClass9ZW.A00(r3)     // Catch:{ 0yt -> 0x047a }
            java.nio.ByteBuffer r15 = java.nio.ByteBuffer.wrap(r3)     // Catch:{ 0yt -> 0x047a }
            byte r11 = r15.get()     // Catch:{ 0yt -> 0x047a }
            r4 = 10
            r7 = 1
            if (r11 == r7) goto L_0x034d
            if (r11 == 0) goto L_0x034d
            java.lang.StringBuilder r3 = X.C90464aC.A0h(r11, r5)     // Catch:{ 0yt -> 0x047a }
            java.lang.String r8 = r3.toString()     // Catch:{ 0yt -> 0x047a }
            java.lang.StringBuilder r3 = X.C90464aC.A0h(r11, r5)     // Catch:{ 0yt -> 0x047a }
            X.0yt r9 = X.C165567td.A0D(r3, r4)     // Catch:{ 0yt -> 0x047a }
            X.8f8 r4 = new X.8f8     // Catch:{ 0yt -> 0x047a }
            r10 = r2
            r6 = r1
            r7 = r16
            r5 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch:{ 0yt -> 0x047a }
            goto L_0x03ce
        L_0x034d:
            java.util.Map r3 = r0.A0W     // Catch:{ 0yt -> 0x047a }
            java.lang.String r9 = "server_app_traffic_secret"
            byte[] r13 = X.C165617ti.A0j(r9, r3)     // Catch:{ 0yt -> 0x047a }
            X.9TH r12 = r0.A0B     // Catch:{ 0yt -> 0x047a }
            r10 = 0
            byte[] r5 = new byte[r10]     // Catch:{ 0yt -> 0x047a }
            int r3 = r0.A04     // Catch:{ 0yt -> 0x047a }
            java.lang.String r8 = "traffic upd"
            byte[] r5 = X.C203439o1.A0A(r8, r5, r3)     // Catch:{ 0yt -> 0x047a }
            int r3 = r0.A04     // Catch:{ 0yt -> 0x047a }
            byte[] r14 = r12.A02(r13, r5, r3)     // Catch:{ 0yt -> 0x047a }
            java.util.Map r3 = r0.A0W     // Catch:{ 0yt -> 0x047a }
            r3.put(r9, r14)     // Catch:{ 0yt -> 0x047a }
            X.9TH r12 = r0.A0B     // Catch:{ 0yt -> 0x047a }
            byte[] r9 = new byte[r10]     // Catch:{ 0yt -> 0x047a }
            r5 = 16
            java.lang.String r3 = "key"
            byte[] r3 = X.C203439o1.A0A(r3, r9, r5)     // Catch:{ 0yt -> 0x047a }
            byte[] r5 = r12.A02(r14, r3, r5)     // Catch:{ 0yt -> 0x047a }
            java.util.Map r3 = r0.A0W     // Catch:{ 0yt -> 0x047a }
            java.lang.String r13 = "server_app_key"
            r3.put(r13, r5)     // Catch:{ 0yt -> 0x047a }
            X.9TH r12 = r0.A0B     // Catch:{ 0yt -> 0x047a }
            byte[] r9 = new byte[r10]     // Catch:{ 0yt -> 0x047a }
            r5 = 12
            java.lang.String r3 = "iv"
            byte[] r3 = X.C203439o1.A0A(r3, r9, r5)     // Catch:{ 0yt -> 0x047a }
            byte[] r9 = r12.A02(r14, r3, r5)     // Catch:{ 0yt -> 0x047a }
            java.util.Map r3 = r0.A0W     // Catch:{ 0yt -> 0x047a }
            java.lang.String r5 = "server_app_iv"
            r3.put(r5, r9)     // Catch:{ 0yt -> 0x047a }
            int r3 = r0.A05     // Catch:{ 0yt -> 0x047a }
            int r14 = r3 + 1
            r0.A05 = r14     // Catch:{ 0yt -> 0x047a }
            java.lang.Integer r9 = X.C023109s.A01     // Catch:{ 0yt -> 0x047a }
            java.lang.StringBuilder r12 = X.AnonymousClass000.A0u()     // Catch:{ 0yt -> 0x047a }
            java.lang.String r3 = "Updated Server App Traffic Keys : Current Gen = "
            java.lang.String r3 = X.AnonymousClass000.A0r(r3, r12, r14)     // Catch:{ 0yt -> 0x047a }
            X.AnonymousClass6IT.A00(r9, r3)     // Catch:{ 0yt -> 0x047a }
            X.9Xn r3 = r0.A0C     // Catch:{ 0yt -> 0x047a }
            if (r3 == 0) goto L_0x03cf
            X.8xv r3 = r3.A00     // Catch:{ 0yt -> 0x047a }
            int r3 = r3.available()     // Catch:{ 0yt -> 0x047a }
            if (r3 <= 0) goto L_0x03cf
            java.lang.String r8 = "Unexpected Messages: Found pending handshake messages"
            java.lang.String r3 = "Found unprocessed messages in handshake buffer."
            X.0yt r9 = X.C165567td.A0E(r3, r4)     // Catch:{ 0yt -> 0x047a }
            X.8f8 r4 = new X.8f8     // Catch:{ 0yt -> 0x047a }
            r10 = r2
            r6 = r1
            r7 = r16
            r5 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch:{ 0yt -> 0x047a }
        L_0x03ce:
            throw r4     // Catch:{ 0yt -> 0x047a }
        L_0x03cf:
            X.ADf r12 = new X.ADf     // Catch:{ 0yt -> 0x047a }
            r12.<init>()     // Catch:{ 0yt -> 0x047a }
            java.util.Map r3 = r0.A0W     // Catch:{ 0yt -> 0x047a }
            byte[] r4 = X.C165617ti.A0j(r13, r3)     // Catch:{ 0yt -> 0x047a }
            java.util.Map r3 = r0.A0W     // Catch:{ 0yt -> 0x047a }
            byte[] r3 = X.C165617ti.A0j(r5, r3)     // Catch:{ 0yt -> 0x047a }
            r12.A00(r4, r3)     // Catch:{ 0yt -> 0x047a }
            java.io.InputStream r5 = r0.A0O     // Catch:{ 0yt -> 0x047a }
            X.8xv r4 = r0.A0A     // Catch:{ 0yt -> 0x047a }
            X.8fB r3 = new X.8fB     // Catch:{ 0yt -> 0x047a }
            r3.<init>(r12, r4, r5)     // Catch:{ 0yt -> 0x047a }
            r0.A0C = r3     // Catch:{ 0yt -> 0x047a }
            if (r11 != r7) goto L_0x0461
            r4 = 24
            byte[] r3 = new byte[r7]     // Catch:{ 0yt -> 0x047a }
            r3[r10] = r10     // Catch:{ 0yt -> 0x047a }
            byte[] r7 = X.AnonymousClass9ZW.A01(r3, r4)     // Catch:{ 0yt -> 0x047a }
            X.9TI r5 = r0.A0D     // Catch:{ 0yt -> 0x047a }
            r4 = 23
            int r3 = r7.length     // Catch:{ 0yt -> 0x047a }
            r5.A01(r7, r10, r3, r4)     // Catch:{ 0yt -> 0x047a }
            java.util.Map r3 = r0.A0W     // Catch:{ 0yt -> 0x047a }
            java.lang.String r7 = "client_app_traffic_secret"
            byte[] r5 = X.C165617ti.A0j(r7, r3)     // Catch:{ 0yt -> 0x047a }
            X.9TH r4 = r0.A0B     // Catch:{ 0yt -> 0x047a }
            byte[] r3 = new byte[r10]     // Catch:{ 0yt -> 0x047a }
            byte[] r5 = X.AnonymousClass9TH.A00(r4, r0, r8, r3, r5)     // Catch:{ 0yt -> 0x047a }
            java.util.Map r3 = r0.A0W     // Catch:{ 0yt -> 0x047a }
            r3.put(r7, r5)     // Catch:{ 0yt -> 0x047a }
            X.9TH r3 = r0.A0B     // Catch:{ 0yt -> 0x047a }
            byte[] r4 = A03(r3, r5)     // Catch:{ 0yt -> 0x047a }
            java.util.Map r3 = r0.A0W     // Catch:{ 0yt -> 0x047a }
            java.lang.String r8 = "client_app_key"
            r3.put(r8, r4)     // Catch:{ 0yt -> 0x047a }
            X.9TH r3 = r0.A0B     // Catch:{ 0yt -> 0x047a }
            byte[] r4 = A02(r3, r5)     // Catch:{ 0yt -> 0x047a }
            java.util.Map r3 = r0.A0W     // Catch:{ 0yt -> 0x047a }
            java.lang.String r7 = "client_app_iv"
            r3.put(r7, r4)     // Catch:{ 0yt -> 0x047a }
            int r3 = r0.A03     // Catch:{ 0yt -> 0x047a }
            int r5 = r3 + 1
            r0.A03 = r5     // Catch:{ 0yt -> 0x047a }
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()     // Catch:{ 0yt -> 0x047a }
            java.lang.String r3 = "Updated Client App Traffic Keys : Current Gen = "
            java.lang.String r3 = X.AnonymousClass000.A0r(r3, r4, r5)     // Catch:{ 0yt -> 0x047a }
            X.AnonymousClass6IT.A00(r9, r3)     // Catch:{ 0yt -> 0x047a }
            X.ADf r5 = new X.ADf     // Catch:{ 0yt -> 0x047a }
            r5.<init>()     // Catch:{ 0yt -> 0x047a }
            java.util.Map r3 = r0.A0W     // Catch:{ 0yt -> 0x047a }
            byte[] r4 = X.C165617ti.A0j(r8, r3)     // Catch:{ 0yt -> 0x047a }
            java.util.Map r3 = r0.A0W     // Catch:{ 0yt -> 0x047a }
            byte[] r3 = X.C165617ti.A0j(r7, r3)     // Catch:{ 0yt -> 0x047a }
            r5.A00(r4, r3)     // Catch:{ 0yt -> 0x047a }
            java.io.OutputStream r4 = r0.A0P     // Catch:{ 0yt -> 0x047a }
            X.8fD r3 = new X.8fD     // Catch:{ 0yt -> 0x047a }
            r3.<init>(r5, r4)     // Catch:{ 0yt -> 0x047a }
            r0.A0D = r3     // Catch:{ 0yt -> 0x047a }
        L_0x0461:
            boolean r3 = r15.hasRemaining()     // Catch:{ 0yt -> 0x047a }
            if (r3 == 0) goto L_0x0741
            java.lang.String r3 = "Key update message has more than expected bytes."
            X.0yt r9 = X.C165567td.A0E(r3, r6)     // Catch:{ 0yt -> 0x047a }
            X.8f8 r4 = new X.8f8     // Catch:{ 0yt -> 0x047a }
            r8 = r3
            r10 = r2
            r6 = r1
            r7 = r16
            r5 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch:{ 0yt -> 0x047a }
            goto L_0x03ce
        L_0x047a:
            r8 = move-exception
            java.lang.String r7 = "Receive key update failed."
            X.8f8 r3 = new X.8f8
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x0488:
            r3 = r16
            X.8f8 r0 = A00(r0, r1, r3, r2)
            throw r0
        L_0x048f:
            boolean r3 = r4 instanceof X.C177978eg
            if (r3 == 0) goto L_0x05c6
            X.ADg r0 = (X.C21224ADg) r0
            A01(r0)
            boolean r3 = r1 instanceof X.AnonymousClass8f1
            r4 = 80
            if (r3 == 0) goto L_0x05bf
            java.lang.Object r3 = r1.A00
            byte[] r3 = (byte[]) r3
            byte[] r3 = X.AnonymousClass9ZW.A00(r3)     // Catch:{ 0yt -> 0x05b1 }
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r3)     // Catch:{ 0yt -> 0x05b1 }
            r8 = 4
            byte[] r10 = new byte[r8]     // Catch:{ 0yt -> 0x05b1 }
            r5.get(r10)     // Catch:{ 0yt -> 0x05b1 }
            long r6 = X.C203439o1.A03(r10)     // Catch:{ 0yt -> 0x05b1 }
            r13 = 0
            int r3 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r3 == 0) goto L_0x0741
            byte[] r9 = new byte[r8]     // Catch:{ 0yt -> 0x05b1 }
            r5.get(r9)     // Catch:{ 0yt -> 0x05b1 }
            byte r3 = r5.get()     // Catch:{ 0yt -> 0x05b1 }
            r3 = r3 & 255(0xff, float:3.57E-43)
            short r3 = (short) r3     // Catch:{ 0yt -> 0x05b1 }
            short r3 = (short) r3     // Catch:{ 0yt -> 0x05b1 }
            byte[] r8 = new byte[r3]     // Catch:{ 0yt -> 0x05b1 }
            r5.get(r8)     // Catch:{ 0yt -> 0x05b1 }
            byte[] r11 = X.C203439o1.A0C(r5)     // Catch:{ 0yt -> 0x05b1 }
            byte[] r3 = X.C203439o1.A0C(r5)     // Catch:{ 0yt -> 0x05b1 }
            X.9g5 r6 = new X.9g5     // Catch:{ 0yt -> 0x05b1 }
            r6.<init>(r3)     // Catch:{ 0yt -> 0x05b1 }
            r3 = 42
            X.9Ql r3 = r6.A00(r3)     // Catch:{ 0yt -> 0x05b1 }
            if (r3 == 0) goto L_0x04e7
            byte[] r3 = r3.A01     // Catch:{ 0yt -> 0x05b1 }
            long r13 = X.C203439o1.A03(r3)     // Catch:{ 0yt -> 0x05b1 }
        L_0x04e7:
            X.9TH r7 = r0.A0B     // Catch:{ 0yt -> 0x05b1 }
            java.util.Map r6 = r0.A0W     // Catch:{ 0yt -> 0x05b1 }
            java.lang.String r3 = "resumption_master_secret"
            byte[] r6 = X.C165617ti.A0j(r3, r6)     // Catch:{ 0yt -> 0x05b1 }
            java.lang.String r3 = "resumption"
            byte[] r8 = X.AnonymousClass9TH.A00(r7, r0, r3, r8, r6)     // Catch:{ 0yt -> 0x05b1 }
            java.lang.String r7 = r0.A0S     // Catch:{ 0yt -> 0x05b1 }
            X.AZ5 r3 = r0.A0E     // Catch:{ 0yt -> 0x05b1 }
            java.lang.Byte r3 = r3.A00()     // Catch:{ 0yt -> 0x05b1 }
            byte r12 = r3.byteValue()     // Catch:{ 0yt -> 0x05b1 }
            com.whatsapp.net.tls13.WtCachedPsk r6 = new com.whatsapp.net.tls13.WtCachedPsk     // Catch:{ 0yt -> 0x05b1 }
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ 0yt -> 0x05b1 }
            X.AZ5 r3 = r0.A0E     // Catch:{ 0yt -> 0x05b1 }
            java.util.LinkedHashSet r3 = r3.A02     // Catch:{ 0yt -> 0x05b1 }
            r3.add(r6)     // Catch:{ 0yt -> 0x05b1 }
            boolean r3 = r5.hasRemaining()     // Catch:{ 0yt -> 0x05b1 }
            if (r3 != 0) goto L_0x059e
            X.0ys r3 = r0.A0N
            X.AZ5 r7 = r0.A0E
            monitor-enter(r3)
            byte[] r0 = r7.getId()     // Catch:{ all -> 0x059b }
            X.9UI r6 = new X.9UI     // Catch:{ all -> 0x059b }
            r6.<init>(r3, r0)     // Catch:{ all -> 0x059b }
            java.util.Map r4 = r3.A01     // Catch:{ 0yt -> 0x058b }
            monitor-enter(r4)     // Catch:{ 0yt -> 0x058b }
            java.lang.Object r5 = r4.get(r6)     // Catch:{ all -> 0x0588 }
            X.AZ5 r5 = (X.AZ5) r5     // Catch:{ all -> 0x0588 }
            if (r5 != 0) goto L_0x0542
            java.lang.String r2 = r7.getPeerHost()     // Catch:{ all -> 0x0588 }
            int r1 = r7.getPeerPort()     // Catch:{ all -> 0x0588 }
            java.lang.String r0 = r7.getCipherSuite()     // Catch:{ all -> 0x0588 }
            X.AZ5 r5 = new X.AZ5     // Catch:{ all -> 0x0588 }
            r5.<init>(r3, r2, r0, r1)     // Catch:{ all -> 0x0588 }
            r4.put(r6, r5)     // Catch:{ all -> 0x0588 }
        L_0x0542:
            java.util.Map r2 = r5.A03     // Catch:{ all -> 0x0588 }
            java.lang.Byte r1 = r7.A00()     // Catch:{ all -> 0x0588 }
            java.security.cert.Certificate[] r0 = r7.getPeerCertificates()     // Catch:{ all -> 0x0588 }
            r2.put(r1, r0)     // Catch:{ all -> 0x0588 }
            java.util.LinkedHashSet r0 = r7.A02     // Catch:{ all -> 0x0588 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x0588 }
        L_0x0555:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0588 }
            if (r0 == 0) goto L_0x0567
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x0588 }
            com.whatsapp.net.tls13.WtCachedPsk r1 = (com.whatsapp.net.tls13.WtCachedPsk) r1     // Catch:{ all -> 0x0588 }
            java.util.LinkedHashSet r0 = r5.A02     // Catch:{ all -> 0x0588 }
            r0.add(r1)     // Catch:{ all -> 0x0588 }
            goto L_0x0555
        L_0x0567:
            X.0yr r1 = r3.A00     // Catch:{ all -> 0x0588 }
            if (r1 == 0) goto L_0x0585
            byte[] r0 = r6.A01     // Catch:{ all -> 0x0588 }
            java.lang.String r6 = r5.getPeerHost()     // Catch:{ all -> 0x0588 }
            int r10 = r5.getPeerPort()     // Catch:{ all -> 0x0588 }
            java.lang.String r7 = r5.getCipherSuite()     // Catch:{ all -> 0x0588 }
            java.util.LinkedHashSet r8 = r5.A02     // Catch:{ all -> 0x0588 }
            java.util.Map r9 = r5.A03     // Catch:{ all -> 0x0588 }
            com.whatsapp.watls13.WtPersistentSession r5 = new com.whatsapp.watls13.WtPersistentSession     // Catch:{ all -> 0x0588 }
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0588 }
            r1.A02(r5, r0)     // Catch:{ all -> 0x0588 }
        L_0x0585:
            monitor-exit(r4)     // Catch:{ all -> 0x0588 }
            goto L_0x0740
        L_0x0588:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0588 }
            throw r0     // Catch:{ 0yt -> 0x058b }
        L_0x058b:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x059b }
            java.lang.String r0 = "Encountered Exception "
            java.lang.String r0 = X.C90494aF.A0c(r2, r0, r1)     // Catch:{ all -> 0x059b }
            X.C36321k7.A1Z(r1, r0)     // Catch:{ all -> 0x059b }
            goto L_0x0740
        L_0x059b:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x059e:
            java.lang.String r7 = "New session ticket has excess bytes than expected"
            java.lang.String r3 = "New session ticket has more bytes than expected."
            X.0yt r8 = X.C165567td.A0E(r3, r4)     // Catch:{ 0yt -> 0x05b1 }
            X.8f8 r3 = new X.8f8     // Catch:{ 0yt -> 0x05b1 }
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch:{ 0yt -> 0x05b1 }
            throw r3     // Catch:{ 0yt -> 0x05b1 }
        L_0x05b1:
            r8 = move-exception
            java.lang.String r7 = "Failed to process new session ticket"
            X.8f8 r3 = new X.8f8
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x05bf:
            r3 = r16
            X.8f8 r0 = A00(r0, r1, r3, r2)
            throw r0
        L_0x05c6:
            boolean r3 = r4 instanceof X.C177968ef
            if (r3 == 0) goto L_0x062f
            X.ADg r0 = (X.C21224ADg) r0
            boolean r3 = r1 instanceof X.AnonymousClass8f0
            if (r3 == 0) goto L_0x0628
            A01(r0)     // Catch:{ 0yt -> 0x0615, RuntimeException -> 0x0607 }
            r3 = r1
            X.8f0 r3 = (X.AnonymousClass8f0) r3     // Catch:{ 0yt -> 0x0615, RuntimeException -> 0x0607 }
            java.lang.Object r6 = r3.A00     // Catch:{ 0yt -> 0x0615, RuntimeException -> 0x0607 }
            byte[] r6 = (byte[]) r6     // Catch:{ 0yt -> 0x0615, RuntimeException -> 0x0607 }
            byte[] r4 = X.AnonymousClass9ZW.A00(r6)     // Catch:{ 0yt -> 0x0615, RuntimeException -> 0x0607 }
            r3 = 1
            X.C1900596s.A00(r0, r4, r3)     // Catch:{ 0yt -> 0x0615, RuntimeException -> 0x0607 }
            r0.A0d = r3     // Catch:{ 0yt -> 0x0615, RuntimeException -> 0x0607 }
            r3 = 0
            r0.A0g = r3     // Catch:{ 0yt -> 0x0615, RuntimeException -> 0x0607 }
            X.9Xj r3 = r0.A0F     // Catch:{ 0yt -> 0x0615, RuntimeException -> 0x0607 }
            byte[] r5 = r3.A02()     // Catch:{ 0yt -> 0x0615, RuntimeException -> 0x0607 }
            X.9Xj r4 = r0.A0F     // Catch:{ 0yt -> 0x0615, RuntimeException -> 0x0607 }
            java.security.MessageDigest r3 = r4.A00     // Catch:{ 0yt -> 0x0615, RuntimeException -> 0x0607 }
            r3.reset()     // Catch:{ 0yt -> 0x0615, RuntimeException -> 0x0607 }
            r3 = 0
            r4.A01 = r3     // Catch:{ 0yt -> 0x0615, RuntimeException -> 0x0607 }
            X.9Xj r4 = r0.A0F     // Catch:{ 0yt -> 0x0615, RuntimeException -> 0x0607 }
            r3 = -2
            byte[] r3 = X.AnonymousClass9ZW.A01(r5, r3)     // Catch:{ 0yt -> 0x0615, RuntimeException -> 0x0607 }
            r4.A00(r3)     // Catch:{ 0yt -> 0x0615, RuntimeException -> 0x0607 }
            X.9Xj r3 = r0.A0F     // Catch:{ 0yt -> 0x0615, RuntimeException -> 0x0607 }
            r3.A00(r6)     // Catch:{ 0yt -> 0x0615, RuntimeException -> 0x0607 }
            return
        L_0x0607:
            r8 = move-exception
            java.lang.String r7 = "Hello retry parse error."
            X.8f8 r3 = new X.8f8
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x0615:
            r4 = move-exception
            javax.net.ssl.SSLException r3 = r4.ex
            java.lang.String r7 = r3.getMessage()
            X.8f8 r3 = new X.8f8
            r8 = r4
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x0628:
            r3 = r16
            X.8f8 r0 = A00(r0, r1, r3, r2)
            throw r0
        L_0x062f:
            boolean r3 = r4 instanceof X.C177958ee
            if (r3 == 0) goto L_0x0771
            X.ADg r0 = (X.C21224ADg) r0
            A01(r0)
            boolean r3 = r1 instanceof X.C178168ez
            r5 = 80
            if (r3 == 0) goto L_0x076a
            java.lang.Object r3 = r1.A00
            byte[] r3 = (byte[]) r3
            byte[] r3 = X.AnonymousClass9ZW.A00(r3)     // Catch:{ 0yt -> 0x075c, RuntimeException -> 0x0742 }
            java.nio.ByteBuffer r14 = java.nio.ByteBuffer.wrap(r3)     // Catch:{ 0yt -> 0x075c, RuntimeException -> 0x0742 }
            r4 = 2
            byte[] r3 = X.C203439o1.A0C(r14)     // Catch:{ 0yt -> 0x075c, RuntimeException -> 0x0742 }
            X.9g5 r6 = new X.9g5     // Catch:{ 0yt -> 0x075c, RuntimeException -> 0x0742 }
            r6.<init>(r3)     // Catch:{ 0yt -> 0x075c, RuntimeException -> 0x0742 }
            r3 = 16
            X.9Ql r8 = r6.A00(r3)     // Catch:{ 0yt -> 0x075c, RuntimeException -> 0x0742 }
            if (r8 == 0) goto L_0x06a6
            java.lang.String r3 = r0.A0Q     // Catch:{ 0yt -> 0x075c, RuntimeException -> 0x0742 }
            if (r3 == 0) goto L_0x06a6
            boolean r3 = r3.isEmpty()     // Catch:{ 0yt -> 0x075c, RuntimeException -> 0x0742 }
            if (r3 != 0) goto L_0x06a6
            byte[] r3 = r8.A01     // Catch:{ 0yt -> 0x075c, RuntimeException -> 0x0742 }
            java.nio.ByteBuffer r13 = java.nio.ByteBuffer.wrap(r3)     // Catch:{ 0yt -> 0x075c, RuntimeException -> 0x0742 }
            byte[] r3 = new byte[r4]     // Catch:{ 0yt -> 0x075c, RuntimeException -> 0x0742 }
            r13.get(r3)     // Catch:{ 0yt -> 0x075c, RuntimeException -> 0x0742 }
            int r12 = X.C203439o1.A02(r3)     // Catch:{ 0yt -> 0x075c, RuntimeException -> 0x0742 }
            r11 = 0
            java.util.HashSet r10 = X.C36441kJ.A16()     // Catch:{ 0yt -> 0x075c, RuntimeException -> 0x0742 }
        L_0x067a:
            if (r11 >= r12) goto L_0x0712
            byte r9 = r13.get()     // Catch:{ 0yt -> 0x075c, RuntimeException -> 0x0742 }
            byte[] r7 = new byte[r9]     // Catch:{ 0yt -> 0x075c, RuntimeException -> 0x0742 }
            r13.get(r7)     // Catch:{ 0yt -> 0x075c, RuntimeException -> 0x0742 }
            java.lang.String r4 = "UTF-8"
            java.lang.String r3 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0693 }
            r3.<init>(r7, r4)     // Catch:{ UnsupportedEncodingException -> 0x0693 }
            r10.add(r3)     // Catch:{ UnsupportedEncodingException -> 0x0693 }
            int r3 = r9 + 1
            int r11 = r11 + r3
            goto L_0x067a
        L_0x0693:
            r3 = move-exception
            java.lang.String r10 = "Server protocol is not encoded using UTF-8"
            X.0yt r11 = X.C165577te.A0W(r3)     // Catch:{ 0yt -> 0x075c, RuntimeException -> 0x0742 }
            X.8f8 r6 = new X.8f8     // Catch:{ 0yt -> 0x075c, RuntimeException -> 0x0742 }
            r12 = r2
            r8 = r1
            r9 = r16
            r7 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12)     // Catch:{ 0yt -> 0x075c, RuntimeException -> 0x0742 }
            goto L_0x073f
        L_0x06a6:
            r3 = 42
            X.9Ql r3 = r6.A00(r3)     // Catch:{ 0yt -> 0x075c, RuntimeException -> 0x0742 }
            if (r3 == 0) goto L_0x06bb
            boolean r3 = r0.A0a     // Catch:{ 0yt -> 0x075c, RuntimeException -> 0x0742 }
            if (r3 == 0) goto L_0x06fd
            X.AZ5 r3 = r0.A0E     // Catch:{ 0yt -> 0x075c, RuntimeException -> 0x0742 }
            com.whatsapp.net.tls13.WtCachedPsk r3 = r3.A01     // Catch:{ 0yt -> 0x075c, RuntimeException -> 0x0742 }
            if (r3 == 0) goto L_0x06bb
            r3 = 1
            r0.A0g = r3     // Catch:{ 0yt -> 0x075c, RuntimeException -> 0x0742 }
        L_0x06bb:
            java.util.Set r4 = X.AnonymousClass9BG.A04     // Catch:{ 0yt -> 0x075c, RuntimeException -> 0x0742 }
            java.util.Map r3 = r6.A03     // Catch:{ 0yt -> 0x075c, RuntimeException -> 0x0742 }
            java.util.Set r3 = r3.keySet()     // Catch:{ 0yt -> 0x075c, RuntimeException -> 0x0742 }
            java.util.HashSet r3 = X.C90524aI.A0k(r3)     // Catch:{ 0yt -> 0x075c, RuntimeException -> 0x0742 }
            r3.removeAll(r4)     // Catch:{ 0yt -> 0x075c, RuntimeException -> 0x0742 }
            int r3 = r3.size()     // Catch:{ 0yt -> 0x075c, RuntimeException -> 0x0742 }
            if (r3 == 0) goto L_0x06e4
            java.lang.String r4 = "Unexpected extension provided by the server"
            r3 = 47
            X.0yt r11 = X.C165567td.A0E(r4, r3)     // Catch:{ 0yt -> 0x075c, RuntimeException -> 0x0742 }
            X.8f8 r6 = new X.8f8     // Catch:{ 0yt -> 0x075c, RuntimeException -> 0x0742 }
            r10 = r4
            r12 = r2
            r8 = r1
            r9 = r16
            r7 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12)     // Catch:{ 0yt -> 0x075c, RuntimeException -> 0x0742 }
            goto L_0x073f
        L_0x06e4:
            boolean r3 = r14.hasRemaining()     // Catch:{ 0yt -> 0x075c, RuntimeException -> 0x0742 }
            if (r3 == 0) goto L_0x0741
            java.lang.String r10 = "Encrypted extensions has excess bytes than expected"
            java.lang.String r3 = "Encrypted extensions has more bytes than expected."
            X.0yt r11 = X.C165567td.A0E(r3, r5)     // Catch:{ 0yt -> 0x075c, RuntimeException -> 0x0742 }
            X.8f8 r6 = new X.8f8     // Catch:{ 0yt -> 0x075c, RuntimeException -> 0x0742 }
            r12 = r2
            r8 = r1
            r9 = r16
            r7 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12)     // Catch:{ 0yt -> 0x075c, RuntimeException -> 0x0742 }
            goto L_0x073f
        L_0x06fd:
            java.lang.String r10 = "Received server early data indication without sending early data."
            r4 = 10
            java.lang.String r3 = "Should not have received early data indication without sending early data."
            X.0yt r11 = X.C165567td.A0E(r3, r4)     // Catch:{ 0yt -> 0x075c, RuntimeException -> 0x0742 }
            X.8f8 r6 = new X.8f8     // Catch:{ 0yt -> 0x075c, RuntimeException -> 0x0742 }
            r12 = r2
            r8 = r1
            r9 = r16
            r7 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12)     // Catch:{ 0yt -> 0x075c, RuntimeException -> 0x0742 }
            goto L_0x073f
        L_0x0712:
            java.lang.String r3 = r0.A0Q     // Catch:{ 0yt -> 0x075c, RuntimeException -> 0x0742 }
            boolean r3 = r10.contains(r3)     // Catch:{ 0yt -> 0x075c, RuntimeException -> 0x0742 }
            if (r3 != 0) goto L_0x06a6
            java.lang.String r10 = "Server sent unsupported protocol version."
            r6 = 110(0x6e, float:1.54E-43)
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()     // Catch:{ 0yt -> 0x075c, RuntimeException -> 0x0742 }
            java.lang.String r3 = "Server selected wrong supported version "
            X.C165567td.A1M(r8, r3, r4)     // Catch:{ 0yt -> 0x075c, RuntimeException -> 0x0742 }
            java.lang.String r3 = " expected: "
            r4.append(r3)     // Catch:{ 0yt -> 0x075c, RuntimeException -> 0x0742 }
            java.lang.String r3 = r0.A0Q     // Catch:{ 0yt -> 0x075c, RuntimeException -> 0x0742 }
            r4.append(r3)     // Catch:{ 0yt -> 0x075c, RuntimeException -> 0x0742 }
            X.0yt r11 = X.C165567td.A0D(r4, r6)     // Catch:{ 0yt -> 0x075c, RuntimeException -> 0x0742 }
            X.8f8 r6 = new X.8f8     // Catch:{ 0yt -> 0x075c, RuntimeException -> 0x0742 }
            r12 = r2
            r8 = r1
            r9 = r16
            r7 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12)     // Catch:{ 0yt -> 0x075c, RuntimeException -> 0x0742 }
        L_0x073f:
            throw r6     // Catch:{ 0yt -> 0x075c, RuntimeException -> 0x0742 }
        L_0x0740:
            monitor-exit(r3)
        L_0x0741:
            return
        L_0x0742:
            r3 = move-exception
            java.lang.String r4 = r3.getMessage()
            java.lang.Throwable r3 = X.C165587tf.A0m(r3)
            X.0yt r8 = X.C165577te.A0V(r4, r3, r5)
            java.lang.String r7 = "Failed to parse encrypted extensions"
            X.8f8 r3 = new X.8f8
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x075c:
            r8 = move-exception
            java.lang.String r7 = "Failed to process encrypted extensions"
            X.8f8 r3 = new X.8f8
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x076a:
            r3 = r16
            X.8f8 r0 = A00(r0, r1, r3, r2)
            throw r0
        L_0x0771:
            boolean r3 = r4 instanceof X.C177948ed
            if (r3 == 0) goto L_0x07c8
            X.ADg r0 = (X.C21224ADg) r0
            X.AZ5 r5 = r0.A0E
            long r3 = java.lang.System.currentTimeMillis()
            r5.A00 = r3
            boolean r3 = r1 instanceof X.C178148ex
            r10 = 80
            if (r3 == 0) goto L_0x07c1
            java.lang.Object r9 = r1.A00
            X.9RQ r9 = (X.AnonymousClass9RQ) r9
            com.whatsapp.net.tls13.WtCachedPsk r3 = r5.A01
            int r8 = r9.A00     // Catch:{ 0yt -> 0x07b3 }
            long r6 = (long) r8     // Catch:{ 0yt -> 0x07b3 }
            long r4 = r3.maxEarlyDataSize     // Catch:{ 0yt -> 0x07b3 }
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 > 0) goto L_0x07a0
            X.9TI r6 = r0.A0D     // Catch:{ 0yt -> 0x07b3 }
            r5 = 23
            byte[] r4 = r9.A02     // Catch:{ 0yt -> 0x07b3 }
            int r3 = r9.A01     // Catch:{ 0yt -> 0x07b3 }
            r6.A01(r4, r3, r8, r5)     // Catch:{ 0yt -> 0x07b3 }
            return
        L_0x07a0:
            java.lang.String r7 = "Data size exceeds early data"
            java.lang.String r3 = "Data to be written more than early data size"
            X.0yt r8 = X.C165567td.A0E(r3, r10)     // Catch:{ 0yt -> 0x07b3 }
            X.8f8 r3 = new X.8f8     // Catch:{ 0yt -> 0x07b3 }
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch:{ 0yt -> 0x07b3 }
            throw r3     // Catch:{ 0yt -> 0x07b3 }
        L_0x07b3:
            r8 = move-exception
            java.lang.String r7 = "App write for early data failed."
            X.8f8 r3 = new X.8f8
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x07c1:
            r3 = r16
            X.8f8 r0 = A00(r0, r1, r3, r2)
            throw r0
        L_0x07c8:
            boolean r3 = r4 instanceof X.C177938ec
            if (r3 == 0) goto L_0x0875
            X.ADg r0 = (X.C21224ADg) r0
            X.9Xj r3 = r0.A0F     // Catch:{ 0yt -> 0x0867 }
            byte[] r6 = r3.A01()     // Catch:{ 0yt -> 0x0867 }
            java.util.Map r4 = r0.A0W     // Catch:{ 0yt -> 0x0867 }
            java.lang.String r3 = "master_secret"
            byte[] r5 = X.C165617ti.A0j(r3, r4)     // Catch:{ 0yt -> 0x0867 }
            if (r5 == 0) goto L_0x082f
            X.9TH r4 = r0.A0B     // Catch:{ 0yt -> 0x0867 }
            java.lang.String r3 = "res master"
            byte[] r5 = X.AnonymousClass9TH.A00(r4, r0, r3, r6, r5)     // Catch:{ 0yt -> 0x0867 }
            java.util.Map r4 = r0.A0W     // Catch:{ 0yt -> 0x0867 }
            java.lang.String r3 = "resumption_master_secret"
            r4.put(r3, r5)     // Catch:{ 0yt -> 0x0867 }
            X.ADf r6 = new X.ADf     // Catch:{ 0yt -> 0x0867 }
            r6.<init>()     // Catch:{ 0yt -> 0x0867 }
            java.util.Map r4 = r0.A0W     // Catch:{ 0yt -> 0x0867 }
            java.lang.String r3 = "client_app_key"
            byte[] r5 = X.C165617ti.A0j(r3, r4)     // Catch:{ 0yt -> 0x0867 }
            java.util.Map r4 = r0.A0W     // Catch:{ 0yt -> 0x0867 }
            java.lang.String r3 = "client_app_iv"
            byte[] r3 = X.C165617ti.A0j(r3, r4)     // Catch:{ 0yt -> 0x0867 }
            r6.A00(r5, r3)     // Catch:{ 0yt -> 0x0867 }
            java.io.OutputStream r4 = r0.A0P     // Catch:{ 0yt -> 0x0867 }
            X.8fD r3 = new X.8fD     // Catch:{ 0yt -> 0x0867 }
            r3.<init>(r6, r4)     // Catch:{ 0yt -> 0x0867 }
            r0.A0D = r3     // Catch:{ 0yt -> 0x0867 }
            X.9Xn r3 = r0.A0C     // Catch:{ 0yt -> 0x0867 }
            if (r3 == 0) goto L_0x0843
            X.8xv r3 = r3.A00     // Catch:{ 0yt -> 0x0867 }
            int r3 = r3.available()     // Catch:{ 0yt -> 0x0867 }
            if (r3 <= 0) goto L_0x0843
            java.lang.String r7 = "Unexpected Messages: Found pending handshake messages"
            r4 = 10
            java.lang.String r3 = "Found unprocessed messages in handshake buffer."
            X.0yt r8 = X.C165567td.A0E(r3, r4)     // Catch:{ 0yt -> 0x0867 }
            X.8f8 r3 = new X.8f8     // Catch:{ 0yt -> 0x0867 }
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch:{ 0yt -> 0x0867 }
        L_0x082e:
            throw r3     // Catch:{ 0yt -> 0x0867 }
        L_0x082f:
            java.lang.String r4 = "Master Secret is null"
            r3 = 80
            X.0yt r8 = X.C165567td.A0E(r4, r3)     // Catch:{ 0yt -> 0x0867 }
            X.8f8 r3 = new X.8f8     // Catch:{ 0yt -> 0x0867 }
            r7 = r4
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch:{ 0yt -> 0x0867 }
            goto L_0x082e
        L_0x0843:
            X.ADf r6 = new X.ADf     // Catch:{ 0yt -> 0x0867 }
            r6.<init>()     // Catch:{ 0yt -> 0x0867 }
            java.util.Map r4 = r0.A0W     // Catch:{ 0yt -> 0x0867 }
            java.lang.String r3 = "server_app_key"
            byte[] r5 = X.C165617ti.A0j(r3, r4)     // Catch:{ 0yt -> 0x0867 }
            java.util.Map r4 = r0.A0W     // Catch:{ 0yt -> 0x0867 }
            java.lang.String r3 = "server_app_iv"
            byte[] r3 = X.C165617ti.A0j(r3, r4)     // Catch:{ 0yt -> 0x0867 }
            r6.A00(r5, r3)     // Catch:{ 0yt -> 0x0867 }
            java.io.InputStream r5 = r0.A0O     // Catch:{ 0yt -> 0x0867 }
            X.8xv r4 = r0.A0A     // Catch:{ 0yt -> 0x0867 }
            X.8fB r3 = new X.8fB     // Catch:{ 0yt -> 0x0867 }
            r3.<init>(r6, r4, r5)     // Catch:{ 0yt -> 0x0867 }
            r0.A0C = r3     // Catch:{ 0yt -> 0x0867 }
            return
        L_0x0867:
            r8 = move-exception
            java.lang.String r7 = "Failed to derive resumption keys"
            X.8f8 r3 = new X.8f8
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x0875:
            boolean r3 = r4 instanceof X.C177928eb
            if (r3 == 0) goto L_0x09b9
            X.ADg r0 = (X.C21224ADg) r0
            java.lang.String r9 = "finished"
            java.lang.String r7 = "derived_secret"
            java.lang.String r10 = "derived"
            A01(r0)
            X.9Xj r3 = r0.A0F     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            byte[] r6 = r3.A01()     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            X.9Rf r3 = r0.A0I     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            byte[] r5 = r0.A0n     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            byte[] r4 = r0.A0i     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            X.6Oq r3 = r3.A00     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            byte[] r5 = r3.A02(r5, r4)     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            int r11 = r0.A04     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            byte[] r8 = new byte[r11]     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            X.AZ5 r3 = r0.A0E     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            com.whatsapp.net.tls13.WtCachedPsk r4 = r3.A01     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            if (r4 == 0) goto L_0x08a6
            boolean r3 = r0.A0h     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            if (r3 == 0) goto L_0x08a6
            byte[] r8 = r4.pskVal     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
        L_0x08a6:
            X.9TH r4 = r0.A0B     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            byte[] r3 = new byte[r11]     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            byte[] r8 = r4.A01(r3, r8)     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            java.util.Map r4 = r0.A0W     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            java.lang.String r3 = "early_secret"
            r4.put(r3, r8)     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            java.lang.String r3 = r0.A0R     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            java.security.MessageDigest r11 = java.security.MessageDigest.getInstance(r3)     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            X.9TH r4 = r0.A0B     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            byte[] r3 = r11.digest()     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            byte[] r4 = X.AnonymousClass9TH.A00(r4, r0, r10, r3, r8)     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            java.util.Map r3 = r0.A0W     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            r3.put(r7, r4)     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            X.9TH r3 = r0.A0B     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            byte[] r8 = r3.A01(r4, r5)     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            java.util.Map r4 = r0.A0W     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            java.lang.String r3 = "handshake_secret"
            r4.put(r3, r8)     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            X.9TH r4 = r0.A0B     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            java.lang.String r3 = "c hs traffic"
            byte[] r5 = X.AnonymousClass9TH.A00(r4, r0, r3, r6, r8)     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            java.util.Map r4 = r0.A0W     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            java.lang.String r3 = "client_hs_traffic_secret"
            r4.put(r3, r5)     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            X.9TH r4 = r0.A0B     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            java.lang.String r3 = "s hs traffic"
            byte[] r6 = X.AnonymousClass9TH.A00(r4, r0, r3, r6, r8)     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            java.util.Map r4 = r0.A0W     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            java.lang.String r3 = "server_hs_traffic_secret"
            r4.put(r3, r6)     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            X.9TH r4 = r0.A0B     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            byte[] r3 = r11.digest()     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            byte[] r4 = X.AnonymousClass9TH.A00(r4, r0, r10, r3, r8)     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            java.util.Map r3 = r0.A0W     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            r3.put(r7, r4)     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            X.9TH r3 = r0.A0B     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            r10 = 0
            byte[] r7 = A03(r3, r5)     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            java.util.Map r4 = r0.A0W     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            java.lang.String r3 = "client_hs_key"
            r4.put(r3, r7)     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            X.9TH r3 = r0.A0B     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            byte[] r7 = A02(r3, r5)     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            java.util.Map r4 = r0.A0W     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            java.lang.String r3 = "client_hs_iv"
            r4.put(r3, r7)     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            X.9TH r3 = r0.A0B     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            byte[] r8 = A03(r3, r6)     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            java.util.Map r4 = r0.A0W     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            java.lang.String r3 = "server_hs_key"
            r4.put(r3, r8)     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            X.9TH r3 = r0.A0B     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            byte[] r7 = A02(r3, r6)     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            java.util.Map r4 = r0.A0W     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            java.lang.String r3 = "server_hs_iv"
            r4.put(r3, r7)     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            X.9TH r4 = r0.A0B     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            byte[] r3 = new byte[r10]     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            byte[] r5 = X.AnonymousClass9TH.A00(r4, r0, r9, r3, r5)     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            java.util.Map r4 = r0.A0W     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            java.lang.String r3 = "client_finished"
            r4.put(r3, r5)     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            X.9TH r4 = r0.A0B     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            byte[] r3 = new byte[r10]     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            byte[] r5 = X.AnonymousClass9TH.A00(r4, r0, r9, r3, r6)     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            java.util.Map r4 = r0.A0W     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            java.lang.String r3 = "server_finished"
            r4.put(r3, r5)     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            X.ADf r6 = new X.ADf     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            r6.<init>()     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            r6.A00(r8, r7)     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            X.9Xn r3 = r0.A0C     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            if (r3 == 0) goto L_0x0980
            X.8xv r3 = r3.A00     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            int r3 = r3.available()     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            if (r3 <= 0) goto L_0x0980
            java.lang.String r7 = "Unexpected Messages: Found pending handshake messages"
            r4 = 10
            java.lang.String r3 = "Found unprocessed messages in handshake buffer."
            X.0yt r8 = X.C165567td.A0E(r3, r4)     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            X.8f8 r3 = new X.8f8     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            throw r3     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
        L_0x0980:
            java.io.InputStream r5 = r0.A0O     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            X.8xv r4 = r0.A0A     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            X.8fB r3 = new X.8fB     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            r3.<init>(r6, r4, r5)     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            r0.A0C = r3     // Catch:{ 0yt -> 0x09ab, NoSuchAlgorithmException -> 0x098c }
            return
        L_0x098c:
            r5 = move-exception
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()
            java.lang.String r3 = r0.A0R
            r4.append(r3)
            java.lang.String r3 = " algorithm not found"
            java.lang.String r7 = X.AnonymousClass000.A0q(r3, r4)
            X.0yt r8 = X.C165577te.A0W(r5)
            X.8f8 r3 = new X.8f8
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x09ab:
            r8 = move-exception
            java.lang.String r7 = "Failed in action handshake traffic keys"
            X.8f8 r3 = new X.8f8
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x09b9:
            boolean r3 = r4 instanceof X.C177918ea
            if (r3 == 0) goto L_0x0a1d
            X.ADg r0 = (X.C21224ADg) r0
            X.AZ5 r5 = r0.A0E
            long r3 = java.lang.System.currentTimeMillis()
            r5.A00 = r3
            com.whatsapp.net.tls13.WtCachedPsk r3 = r5.A01     // Catch:{ 0yt -> 0x0a0f }
            byte[] r5 = r3.pskVal     // Catch:{ 0yt -> 0x0a0f }
            X.9TH r4 = r0.A0B     // Catch:{ 0yt -> 0x0a0f }
            int r3 = r0.A04     // Catch:{ 0yt -> 0x0a0f }
            byte[] r3 = new byte[r3]     // Catch:{ 0yt -> 0x0a0f }
            byte[] r6 = r4.A01(r3, r5)     // Catch:{ 0yt -> 0x0a0f }
            java.util.Map r4 = r0.A0W     // Catch:{ 0yt -> 0x0a0f }
            java.lang.String r3 = "early_secret"
            r4.put(r3, r6)     // Catch:{ 0yt -> 0x0a0f }
            X.9TH r5 = r0.A0B     // Catch:{ 0yt -> 0x0a0f }
            java.lang.String r4 = "c e traffic"
            X.9Xj r3 = r0.A0F     // Catch:{ 0yt -> 0x0a0f }
            byte[] r3 = r3.A01()     // Catch:{ 0yt -> 0x0a0f }
            byte[] r5 = X.AnonymousClass9TH.A00(r5, r0, r4, r3, r6)     // Catch:{ 0yt -> 0x0a0f }
            java.util.Map r4 = r0.A0W     // Catch:{ 0yt -> 0x0a0f }
            java.lang.String r3 = "client_early_traffic_secret"
            r4.put(r3, r5)     // Catch:{ 0yt -> 0x0a0f }
            X.9TH r3 = r0.A0B     // Catch:{ 0yt -> 0x0a0f }
            byte[] r4 = A03(r3, r5)     // Catch:{ 0yt -> 0x0a0f }
            X.9TH r3 = r0.A0B     // Catch:{ 0yt -> 0x0a0f }
            byte[] r3 = A02(r3, r5)     // Catch:{ 0yt -> 0x0a0f }
            X.ADf r5 = new X.ADf     // Catch:{ 0yt -> 0x0a0f }
            r5.<init>()     // Catch:{ 0yt -> 0x0a0f }
            r5.A00(r4, r3)     // Catch:{ 0yt -> 0x0a0f }
            java.io.OutputStream r4 = r0.A0P     // Catch:{ 0yt -> 0x0a0f }
            X.8fD r3 = new X.8fD     // Catch:{ 0yt -> 0x0a0f }
            r3.<init>(r5, r4)     // Catch:{ 0yt -> 0x0a0f }
            r0.A0D = r3     // Catch:{ 0yt -> 0x0a0f }
            return
        L_0x0a0f:
            r8 = move-exception
            java.lang.String r7 = "Failed in action early data keys"
            X.8f8 r3 = new X.8f8
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x0a1d:
            boolean r3 = r4 instanceof X.C177908eZ
            if (r3 == 0) goto L_0x0acb
            X.ADg r0 = (X.C21224ADg) r0
            A01(r0)
            X.9Xj r3 = r0.A0F     // Catch:{ 0yt -> 0x0abd }
            byte[] r7 = r3.A01()     // Catch:{ 0yt -> 0x0abd }
            java.util.Map r4 = r0.A0W     // Catch:{ 0yt -> 0x0abd }
            java.lang.String r3 = "derived_secret"
            byte[] r5 = X.C165617ti.A0j(r3, r4)     // Catch:{ 0yt -> 0x0abd }
            if (r5 == 0) goto L_0x0aa9
            X.9TH r4 = r0.A0B     // Catch:{ 0yt -> 0x0abd }
            int r3 = r0.A04     // Catch:{ 0yt -> 0x0abd }
            byte[] r3 = new byte[r3]     // Catch:{ 0yt -> 0x0abd }
            byte[] r6 = r4.A01(r5, r3)     // Catch:{ 0yt -> 0x0abd }
            java.util.Map r4 = r0.A0W     // Catch:{ 0yt -> 0x0abd }
            java.lang.String r3 = "master_secret"
            r4.put(r3, r6)     // Catch:{ 0yt -> 0x0abd }
            X.9TH r4 = r0.A0B     // Catch:{ 0yt -> 0x0abd }
            java.lang.String r3 = "c ap traffic"
            byte[] r8 = X.AnonymousClass9TH.A00(r4, r0, r3, r7, r6)     // Catch:{ 0yt -> 0x0abd }
            java.util.Map r4 = r0.A0W     // Catch:{ 0yt -> 0x0abd }
            java.lang.String r3 = "client_app_traffic_secret"
            r4.put(r3, r8)     // Catch:{ 0yt -> 0x0abd }
            X.9TH r3 = r0.A0B     // Catch:{ 0yt -> 0x0abd }
            byte[] r5 = A03(r3, r8)     // Catch:{ 0yt -> 0x0abd }
            java.util.Map r4 = r0.A0W     // Catch:{ 0yt -> 0x0abd }
            java.lang.String r3 = "client_app_key"
            r4.put(r3, r5)     // Catch:{ 0yt -> 0x0abd }
            X.9TH r3 = r0.A0B     // Catch:{ 0yt -> 0x0abd }
            byte[] r5 = A02(r3, r8)     // Catch:{ 0yt -> 0x0abd }
            java.util.Map r4 = r0.A0W     // Catch:{ 0yt -> 0x0abd }
            java.lang.String r3 = "client_app_iv"
            r4.put(r3, r5)     // Catch:{ 0yt -> 0x0abd }
            X.9TH r4 = r0.A0B     // Catch:{ 0yt -> 0x0abd }
            java.lang.String r3 = "s ap traffic"
            byte[] r8 = X.AnonymousClass9TH.A00(r4, r0, r3, r7, r6)     // Catch:{ 0yt -> 0x0abd }
            java.util.Map r4 = r0.A0W     // Catch:{ 0yt -> 0x0abd }
            java.lang.String r3 = "server_app_traffic_secret"
            r4.put(r3, r8)     // Catch:{ 0yt -> 0x0abd }
            X.9TH r3 = r0.A0B     // Catch:{ 0yt -> 0x0abd }
            byte[] r5 = A03(r3, r8)     // Catch:{ 0yt -> 0x0abd }
            java.util.Map r4 = r0.A0W     // Catch:{ 0yt -> 0x0abd }
            java.lang.String r3 = "server_app_key"
            r4.put(r3, r5)     // Catch:{ 0yt -> 0x0abd }
            X.9TH r3 = r0.A0B     // Catch:{ 0yt -> 0x0abd }
            byte[] r5 = A02(r3, r8)     // Catch:{ 0yt -> 0x0abd }
            java.util.Map r4 = r0.A0W     // Catch:{ 0yt -> 0x0abd }
            java.lang.String r3 = "server_app_iv"
            r4.put(r3, r5)     // Catch:{ 0yt -> 0x0abd }
            X.9TH r4 = r0.A0B     // Catch:{ 0yt -> 0x0abd }
            java.lang.String r3 = "exp master"
            byte[] r5 = X.AnonymousClass9TH.A00(r4, r0, r3, r7, r6)     // Catch:{ 0yt -> 0x0abd }
            java.util.Map r4 = r0.A0W     // Catch:{ 0yt -> 0x0abd }
            java.lang.String r3 = "exporter_master_secret"
            r4.put(r3, r5)     // Catch:{ 0yt -> 0x0abd }
            return
        L_0x0aa9:
            java.lang.String r4 = "Derived secret not found."
            r3 = 80
            X.0yt r8 = X.C165567td.A0E(r4, r3)     // Catch:{ 0yt -> 0x0abd }
            X.8f8 r3 = new X.8f8     // Catch:{ 0yt -> 0x0abd }
            r7 = r4
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch:{ 0yt -> 0x0abd }
            throw r3     // Catch:{ 0yt -> 0x0abd }
        L_0x0abd:
            r8 = move-exception
            java.lang.String r7 = "Failed to derive app traffic keys"
            X.8f8 r3 = new X.8f8
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x0acb:
            boolean r3 = r4 instanceof X.C177898eY
            if (r3 == 0) goto L_0x0b22
            X.ADg r0 = (X.C21224ADg) r0
            boolean r3 = r1 instanceof X.C178108et
            if (r3 == 0) goto L_0x0b1b
            java.lang.Object r3 = r1.A00
            byte[] r3 = (byte[]) r3
            byte[] r3 = X.AnonymousClass9ZW.A00(r3)     // Catch:{ 0yt -> 0x0b0d }
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r3)     // Catch:{ 0yt -> 0x0b0d }
            byte r3 = r4.get()     // Catch:{ 0yt -> 0x0b0d }
            r3 = r3 & 255(0xff, float:3.57E-43)
            short r3 = (short) r3     // Catch:{ 0yt -> 0x0b0d }
            short r3 = (short) r3     // Catch:{ 0yt -> 0x0b0d }
            if (r3 != 0) goto L_0x0af8
            byte[] r4 = X.C203439o1.A0C(r4)     // Catch:{ 0yt -> 0x0b0d }
            X.9g5 r3 = new X.9g5     // Catch:{ 0yt -> 0x0b0d }
            r3.<init>(r4)     // Catch:{ 0yt -> 0x0b0d }
            r1 = 1
            r0.A0Y = r1
            return
        L_0x0af8:
            java.lang.String r7 = "Certificate context is not expected"
            r4 = 10
            java.lang.String r3 = "Certificate context is not expected."
            X.0yt r8 = X.C165567td.A0E(r3, r4)     // Catch:{ 0yt -> 0x0b0d }
            X.8f8 r3 = new X.8f8     // Catch:{ 0yt -> 0x0b0d }
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch:{ 0yt -> 0x0b0d }
            throw r3     // Catch:{ 0yt -> 0x0b0d }
        L_0x0b0d:
            r8 = move-exception
            java.lang.String r7 = "Failed to process certificate request "
            X.8f8 r3 = new X.8f8
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x0b1b:
            r3 = r16
            X.8f8 r0 = A00(r0, r1, r3, r2)
            throw r0
        L_0x0b22:
            boolean r3 = r4 instanceof X.C177888eX
            if (r3 == 0) goto L_0x0b56
            X.ADg r0 = (X.C21224ADg) r0
            A01(r0)
            boolean r3 = r1 instanceof X.C178098es
            if (r3 == 0) goto L_0x0b4f
            java.lang.Object r3 = r1.A00
            X.9RQ r3 = (X.AnonymousClass9RQ) r3
            X.9TI r7 = r0.A0D     // Catch:{ 0yt -> 0x0b41 }
            r6 = 23
            byte[] r5 = r3.A02     // Catch:{ 0yt -> 0x0b41 }
            int r4 = r3.A01     // Catch:{ 0yt -> 0x0b41 }
            int r3 = r3.A00     // Catch:{ 0yt -> 0x0b41 }
            r7.A01(r5, r4, r3, r6)     // Catch:{ 0yt -> 0x0b41 }
            return
        L_0x0b41:
            r8 = move-exception
            java.lang.String r7 = "App write failed."
            X.8f8 r3 = new X.8f8
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x0b4f:
            r3 = r16
            X.8f8 r0 = A00(r0, r1, r3, r2)
            throw r0
        L_0x0b56:
            boolean r3 = r4 instanceof X.C177878eW
            X.ADg r0 = (X.C21224ADg) r0
            if (r3 == 0) goto L_0x0b9a
            A01(r0)
            boolean r3 = r1 instanceof X.C178088er
            if (r3 == 0) goto L_0x0b93
            java.lang.Object r6 = r1.A00
            byte[] r6 = (byte[]) r6
            if (r6 == 0) goto L_0x0b7f
            X.Az0 r5 = r0.A09     // Catch:{ IOException -> 0x0b71 }
            r4 = 0
            int r3 = r6.length     // Catch:{ IOException -> 0x0b71 }
            r5.B14(r6, r4, r3)     // Catch:{ IOException -> 0x0b71 }
            return
        L_0x0b71:
            r8 = move-exception
            java.lang.String r7 = "App read failed."
            X.8f8 r3 = new X.8f8
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x0b7f:
            java.lang.String r4 = "App read failed."
            javax.net.ssl.SSLException r3 = new javax.net.ssl.SSLException
            r3.<init>(r4)
            X.8f8 r5 = new X.8f8
            r9 = r4
            r10 = r3
            r11 = r2
            r7 = r1
            r8 = r16
            r6 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            throw r5
        L_0x0b93:
            r3 = r16
            X.8f8 r5 = A00(r0, r1, r3, r2)
            throw r5
        L_0x0b9a:
            A01(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9P3.A04(X.0oz, X.9Eq, X.9Mc, int):void");
    }
}
