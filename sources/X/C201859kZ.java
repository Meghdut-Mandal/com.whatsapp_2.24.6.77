package X;

import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.URI;
import java.net.URLConnection;
import java.security.cert.CRL;
import java.security.cert.CRLException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509CRL;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import javax.naming.NamingException;
import javax.naming.directory.InitialDirContext;

/* renamed from: X.9kZ  reason: invalid class name and case insensitive filesystem */
public class C201859kZ {
    public static Map A00 = Collections.synchronizedMap(new WeakHashMap());

    public static Collection A00(URI uri, CertificateFactory certificateFactory) {
        Hashtable hashtable = new Hashtable();
        hashtable.put("java.naming.factory.initial", "com.sun.jndi.ldap.LdapCtxFactory");
        hashtable.put("java.naming.provider.url", uri.toString());
        try {
            byte[] bArr = (byte[]) new InitialDirContext(hashtable).getAttributes("").get("certificateRevocationList;binary").get();
            if (bArr != null && bArr.length != 0) {
                return certificateFactory.generateCRLs(C90524aI.A0P(bArr));
            }
            throw new CRLException(AnonymousClass000.A0l(uri, "no CRL returned from: ", AnonymousClass000.A0u()));
        } catch (NamingException e) {
            StringBuilder A0u = AnonymousClass000.A0u();
            C165567td.A1M(uri, "issue connecting to: ", A0u);
            throw new CRLException(A0u.toString(), e);
        }
    }

    public static synchronized C21675AUz A01(URI uri, CertificateFactory certificateFactory, Date date) {
        Collection<? extends CRL> generateCRLs;
        C21675AUz aUz;
        synchronized (C201859kZ.class) {
            Map map = A00;
            WeakReference weakReference = (WeakReference) map.get(uri);
            if (!(weakReference == null || (aUz = (C21675AUz) weakReference.get()) == null)) {
                Iterator A0r = C90474aD.A0r(aUz.A00);
                while (A0r.hasNext()) {
                    Date nextUpdate = ((X509CRL) A0r.next()).getNextUpdate();
                    if (nextUpdate == null || !nextUpdate.before(date)) {
                    }
                }
                return aUz;
            }
            if (uri.getScheme().equals("ldap")) {
                generateCRLs = A00(uri, certificateFactory);
            } else {
                URLConnection openConnection = uri.toURL().openConnection();
                openConnection.setConnectTimeout(15000);
                openConnection.setReadTimeout(15000);
                InputStream inputStream = openConnection.getInputStream();
                generateCRLs = certificateFactory.generateCRLs(inputStream);
                inputStream.close();
            }
            C21675AUz aUz2 = new C21675AUz(new AV0(generateCRLs));
            map.put(uri, AnonymousClass001.A0F(aUz2));
            return aUz2;
        }
    }
}
