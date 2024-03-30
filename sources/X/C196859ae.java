package X;

import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.Reference;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.security.cert.Extension;
import java.security.cert.X509Certificate;
import java.text.ParseException;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.9ae  reason: invalid class name and case insensitive filesystem */
public abstract class C196859ae {
    public static Map A00 = Collections.synchronizedMap(new WeakHashMap());

    public static C22594ArM A00(URI uri, X509Certificate x509Certificate, List list, C22615Arh arh, AnonymousClass9NL r25, C22844Awt awt) {
        C22594ArM arM;
        Throwable A002;
        C22614Arg arg;
        Map map;
        C22594ArM arM2;
        C22614Arg arg2;
        C22597ArP arP;
        C22655AsL asL;
        Map map2 = A00;
        URI uri2 = uri;
        Reference reference = (Reference) map2.get(uri2);
        C22615Arh arh2 = arh;
        AnonymousClass9NL r3 = r25;
        if (!(reference == null || (map = (Map) reference.get()) == null || (arM2 = (C22594ArM) map.get(arh2)) == null)) {
            byte[] A03 = C22659AsP.A03(arM2.A01.A01);
            if (A03 instanceof C22614Arg) {
                arg2 = (C22614Arg) A03;
            } else if (A03 != null) {
                arg2 = new C22614Arg(C22656AsM.A04(A03));
            } else {
                arg2 = null;
            }
            C22627Art art = arg2.A02;
            C22654AsK asK = C22627Art.A06;
            if (art == null) {
                art = null;
            }
            C22656AsM asM = art.A00;
            for (int i = 0; i != asM.A0H(); i++) {
                C219411z A0J = asM.A0J(i);
                if (A0J instanceof C22597ArP) {
                    arP = (C22597ArP) A0J;
                } else if (A0J != null) {
                    arP = new C22597ArP(C22656AsM.A04(A0J));
                } else {
                    arP = null;
                }
                if (arh2.equals(arP.A01) && (asL = arP.A00) != null) {
                    try {
                        if (new Date(r3.A04.getTime()).after(asL.A0I())) {
                            map.remove(arh2);
                            arM2 = null;
                        }
                    } catch (ParseException unused) {
                        map.remove(arh2);
                    }
                }
            }
            if (arM2 != null) {
                return arM2;
            }
        }
        try {
            URL url = uri2.toURL();
            C202169lB r10 = new C202169lB();
            r10.A06(new C22593ArL(arh2));
            C202169lB r6 = new C202169lB();
            byte[] bArr = null;
            int i2 = 0;
            while (true) {
                List list2 = list;
                if (i2 == list2.size()) {
                    break;
                }
                Extension extension = (Extension) list2.get(i2);
                byte[] value = extension.getValue();
                AnonymousClass122 r0 = B4G.A00;
                if ("1.3.6.1.5.5.7.48.1.2".equals(extension.getId())) {
                    bArr = value;
                }
                AnonymousClass122 r02 = C22634As0.A03;
                r6.A06(new C22634As0(C165617ti.A0f(extension.getId()), value, extension.isCritical()));
                i2++;
            }
            C22654AsK asK2 = C22612Are.A03;
            try {
                byte[] A08 = new C22591ArJ(new C22612Are(new C22675Asf(r10), C22608Ara.A01(new C22675Asf(r6)))).A08();
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setConnectTimeout(15000);
                httpURLConnection.setReadTimeout(15000);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("Content-type", "application/ocsp-request");
                httpURLConnection.setRequestProperty("Content-length", String.valueOf(A08.length));
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(A08);
                outputStream.flush();
                InputStream inputStream = httpURLConnection.getInputStream();
                int contentLength = httpURLConnection.getContentLength();
                if (contentLength < 0) {
                    contentLength = 32768;
                }
                ByteArrayOutputStream A0Q = C90524aI.A0Q();
                long j = (long) contentLength;
                byte[] bArr2 = new byte[ZipDecompressor.UNZIP_BUFFER_SIZE];
                long j2 = 0;
                while (true) {
                    int read = inputStream.read(bArr2, 0, ZipDecompressor.UNZIP_BUFFER_SIZE);
                    if (read >= 0) {
                        long j3 = (long) read;
                        if (j - j2 < j3) {
                            A002 = new C187258xY();
                            break;
                        }
                        j2 += j3;
                        A0Q.write(bArr2, 0, read);
                    } else {
                        byte[] byteArray = A0Q.toByteArray();
                        if (byteArray instanceof C22594ArM) {
                            arM = (C22594ArM) byteArray;
                        } else if (byteArray != null) {
                            arM = new C22594ArM(C22656AsM.A04(byteArray));
                        } else {
                            arM = null;
                        }
                        C22652AsI asI = arM.A00.A00;
                        if (asI.A0H() == 0) {
                            C22607ArZ arZ = arM.A01;
                            if (arZ == null) {
                                arZ = null;
                            }
                            if (arZ.A00.A0G(B4G.A02)) {
                                byte[] bArr3 = arZ.A01.A00;
                                if (bArr3 instanceof C22614Arg) {
                                    arg = (C22614Arg) bArr3;
                                } else if (bArr3 != null) {
                                    arg = new C22614Arg(C22656AsM.A04(bArr3));
                                } else {
                                    arg = null;
                                }
                                if (C21783AaG.A03(x509Certificate, arg, r3, awt, bArr)) {
                                    Reference reference2 = (Reference) map2.get(uri2);
                                    if (reference2 != null) {
                                        ((Map) reference2.get()).put(arh2, arM);
                                        return arM;
                                    }
                                    HashMap A0J2 = AnonymousClass001.A0J();
                                    A0J2.put(arh2, arM);
                                    map2.put(uri2, AnonymousClass001.A0F(A0J2));
                                    return arM;
                                }
                            }
                            A002 = AnonymousClass9NL.A00("OCSP response failed to validate", (Throwable) null, r3);
                        } else {
                            StringBuilder A0u = AnonymousClass000.A0u();
                            A0u.append("OCSP responder failed: ");
                            A002 = AnonymousClass9NL.A00(AnonymousClass000.A0o(new BigInteger(asI.A00), A0u), (Throwable) null, r3);
                        }
                    }
                }
                throw A002;
            } catch (IOException e) {
                throw AnonymousClass9NL.A00(C36331k8.A0i("configuration error: ", AnonymousClass000.A0u(), e), e, r3);
            }
        } catch (MalformedURLException e2) {
            throw AnonymousClass9NL.A00(C36331k8.A0i("configuration error: ", AnonymousClass000.A0u(), e2), e2, r3);
        }
    }
}
