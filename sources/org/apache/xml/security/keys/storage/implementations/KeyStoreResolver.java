package org.apache.xml.security.keys.storage.implementations;

import X.AnonymousClass001;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.Certificate;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.apache.xml.security.keys.storage.StorageResolverSpi;

public abstract class KeyStoreResolver extends StorageResolverSpi {
    public KeyStore a;

    public class KeyStoreIterator implements Iterator {
        public KeyStore a;
        public Enumeration b = null;
        public Certificate c = null;

        public KeyStoreIterator(KeyStore keyStore) {
            try {
                this.a = keyStore;
                this.b = keyStore.aliases();
            } catch (KeyStoreException unused) {
                this.b = new Enumeration(this) {
                    public final KeyStoreIterator a;

                    {
                        this.a = r1;
                    }

                    public boolean hasMoreElements() {
                        return false;
                    }

                    public Object nextElement() {
                        return null;
                    }
                };
            }
        }

        private Certificate a() {
            while (this.b.hasMoreElements()) {
                try {
                    Certificate certificate = this.a.getCertificate((String) this.b.nextElement());
                    if (certificate != null) {
                        return certificate;
                    }
                } catch (KeyStoreException unused) {
                }
            }
            return null;
        }

        public boolean hasNext() {
            if (this.c == null) {
                Certificate a2 = a();
                this.c = a2;
                return a2 != null;
            }
        }

        public Object next() {
            Certificate certificate = this.c;
            if (certificate == null) {
                certificate = a();
                this.c = certificate;
                if (certificate == null) {
                    throw new NoSuchElementException();
                }
            }
            this.c = null;
            return certificate;
        }

        public void remove() {
            throw AnonymousClass001.A0E("Can't remove keys from KeyStore");
        }
    }

    public Iterator a() {
        throw null;
    }
}
