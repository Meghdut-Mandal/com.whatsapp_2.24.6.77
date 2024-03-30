package org.apache.xml.security.keys.storage.implementations;

import X.AnonymousClass001;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.apache.xml.security.keys.storage.StorageResolverSpi;

public abstract class SingleCertificateResolver extends StorageResolverSpi {
    public X509Certificate a;

    public class InternalIterator implements Iterator {
        public boolean a = false;
        public X509Certificate b;

        public InternalIterator(X509Certificate x509Certificate) {
            this.b = x509Certificate;
        }

        public boolean hasNext() {
            return !this.a;
        }

        public Object next() {
            if (!this.a) {
                this.a = true;
                return this.b;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw AnonymousClass001.A0E("Can't remove keys from KeyStore");
        }
    }

    public Iterator a() {
        throw null;
    }
}
