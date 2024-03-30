package X;

import com.whatsapp.net.tls13.WtCachedPsk;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionBindingEvent;
import javax.net.ssl.SSLSessionBindingListener;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.CertificateException;
import javax.security.cert.X509Certificate;

public class AZ5 implements SSLSession {
    public long A00;
    public WtCachedPsk A01;
    public LinkedHashSet A02 = C36441kJ.A17();
    public Map A03 = AnonymousClass001.A0J();
    public int A04;
    public long A05;
    public C21230ys A06;
    public String A07;
    public String A08;
    public boolean A09 = true;
    public byte[] A0A;
    public Certificate[] A0B;
    public final Map A0C = AnonymousClass001.A0J();

    public int getApplicationBufferSize() {
        return 16384;
    }

    public int getPacketBufferSize() {
        return 16645;
    }

    public final String getProtocol() {
        return "TLSv1.3";
    }

    public void invalidate() {
        this.A09 = false;
    }

    public Byte A00() {
        Certificate[] certificateArr = this.A0B;
        if (certificateArr == null) {
            return null;
        }
        byte b = 0;
        for (Certificate publicKey : certificateArr) {
            for (byte b2 : publicKey.getPublicKey().getEncoded()) {
                b = (byte) (b ^ b2);
            }
        }
        return Byte.valueOf(b);
    }

    public void A01(Certificate[] certificateArr) {
        Certificate[] certificateArr2;
        if (certificateArr != null) {
            certificateArr2 = (Certificate[]) certificateArr.clone();
        } else {
            certificateArr2 = null;
        }
        this.A0B = certificateArr2;
    }

    public byte[] getId() {
        byte[] bArr = this.A0A;
        if (bArr != null) {
            return (byte[]) bArr.clone();
        }
        return null;
    }

    public X509Certificate[] getPeerCertificateChain() {
        Certificate[] certificateArr = this.A0B;
        if (certificateArr == null || (r7 = certificateArr.length) == 0) {
            throw new SSLPeerUnverifiedException("No peer certificates found");
        }
        ArrayList A0I = AnonymousClass001.A0I();
        for (Certificate encoded : certificateArr) {
            try {
                A0I.add(X509Certificate.getInstance(encoded.getEncoded()));
            } catch (CertificateEncodingException | CertificateException e) {
                AnonymousClass6IT.A00(C023109s.A01, AnonymousClass000.A0l(e, "Could not parse certificates. Exception ", AnonymousClass000.A0u()));
            }
        }
        return (X509Certificate[]) A0I.toArray(new X509Certificate[0]);
    }

    public Certificate[] getPeerCertificates() {
        Certificate[] certificateArr = this.A0B;
        if (certificateArr != null) {
            return (Certificate[]) certificateArr.clone();
        }
        return null;
    }

    public Principal getPeerPrincipal() {
        Certificate[] certificateArr = this.A0B;
        if (certificateArr != null && certificateArr.length != 0) {
            return ((java.security.cert.X509Certificate) certificateArr[0]).getSubjectX500Principal();
        }
        throw new SSLPeerUnverifiedException("No peer certificates found.");
    }

    public Object getValue(String str) {
        if (str != null) {
            return this.A0C.get(str);
        }
        throw AnonymousClass001.A08("key cannot be null.");
    }

    public String[] getValueNames() {
        return (String[]) this.A0C.keySet().toArray(new String[0]);
    }

    public boolean isValid() {
        long currentTimeMillis;
        boolean z = this.A09;
        if (!z) {
            return z;
        }
        HashSet A16 = C36441kJ.A16();
        LinkedHashSet linkedHashSet = this.A02;
        WtCachedPsk[] wtCachedPskArr = null;
        if (linkedHashSet != null) {
            wtCachedPskArr = (WtCachedPsk[]) linkedHashSet.toArray(new WtCachedPsk[0]);
        }
        if (wtCachedPskArr != null) {
            for (WtCachedPsk wtCachedPsk : wtCachedPskArr) {
                if (wtCachedPsk.useTestTime) {
                    currentTimeMillis = 3600000;
                } else {
                    currentTimeMillis = System.currentTimeMillis();
                }
                if (currentTimeMillis - wtCachedPsk.ticketIssuedTime > wtCachedPsk.ticketLifetime || !wtCachedPsk.sni.equals(this.A08)) {
                    this.A02.remove(wtCachedPsk);
                } else {
                    A16.add(Byte.valueOf(wtCachedPsk.certsID));
                }
            }
        }
        Iterator A10 = AnonymousClass000.A10(this.A03);
        while (A10.hasNext()) {
            if (!A16.contains(A10.next())) {
                A10.remove();
            }
        }
        LinkedHashSet linkedHashSet2 = this.A02;
        if (linkedHashSet2 == null || linkedHashSet2.isEmpty()) {
            this.A09 = false;
        }
        return this.A09;
    }

    public void putValue(String str, Object obj) {
        if (str == null || obj == null) {
            throw AnonymousClass001.A08("key and value cannot be null.");
        }
        Object put = this.A0C.put(str, obj);
        if (put instanceof SSLSessionBindingListener) {
            ((SSLSessionBindingListener) put).valueUnbound(new SSLSessionBindingEvent(this, str));
        }
        if (obj instanceof SSLSessionBindingListener) {
            ((SSLSessionBindingListener) obj).valueBound(new SSLSessionBindingEvent(this, str));
        }
    }

    public void removeValue(String str) {
        if (str != null) {
            Object remove = this.A0C.remove(str);
            if (remove instanceof SSLSessionBindingListener) {
                ((SSLSessionBindingListener) remove).valueUnbound(new SSLSessionBindingEvent(this, str));
                return;
            }
            return;
        }
        throw AnonymousClass001.A08("key cannot be null");
    }

    public AZ5(C21230ys r3, String str, String str2, int i) {
        long currentTimeMillis = System.currentTimeMillis();
        this.A00 = currentTimeMillis;
        this.A05 = currentTimeMillis;
        this.A06 = r3;
        this.A08 = str;
        this.A04 = i;
        this.A07 = str2;
        this.A0A = C203439o1.A09(str, str2, i);
    }

    public String getCipherSuite() {
        return this.A07;
    }

    public long getCreationTime() {
        return this.A05;
    }

    public long getLastAccessedTime() {
        return this.A00;
    }

    public Certificate[] getLocalCertificates() {
        return null;
    }

    public Principal getLocalPrincipal() {
        return null;
    }

    public String getPeerHost() {
        return this.A08;
    }

    public int getPeerPort() {
        return this.A04;
    }

    public SSLSessionContext getSessionContext() {
        return this.A06;
    }
}
