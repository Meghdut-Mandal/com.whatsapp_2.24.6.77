package org.apache.xml.security.encryption;

import X.C165577te;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.transforms.Transforms;

public abstract class XMLCipher {
    public static Class a;
    public static Log b;

    /* renamed from: org.apache.xml.security.encryption.XMLCipher$1  reason: invalid class name */
    public abstract class AnonymousClass1 {
    }

    public abstract class Factory {

        public abstract class AgreementMethodImpl implements AgreementMethod {
        }

        public abstract class CipherDataImpl implements CipherData {
        }

        public abstract class CipherReferenceImpl implements CipherReference {
        }

        public abstract class CipherValueImpl implements CipherValue {
        }

        public abstract class EncryptedDataImpl extends EncryptedTypeImpl implements EncryptedData {
        }

        public abstract class EncryptedKeyImpl extends EncryptedTypeImpl implements EncryptedKey {
        }

        public abstract class EncryptedTypeImpl {
        }

        public abstract class EncryptionMethodImpl implements EncryptionMethod {
        }

        public abstract class EncryptionPropertiesImpl implements EncryptionProperties {
        }

        public abstract class EncryptionPropertyImpl implements EncryptionProperty {
        }

        public abstract class ReferenceListImpl implements ReferenceList {

            public abstract class DataReference extends ReferenceImpl {
            }

            public abstract class KeyReference extends ReferenceImpl {
            }

            public abstract class ReferenceImpl implements Reference {
            }
        }

        public abstract class TransformsImpl extends Transforms implements Transforms {
            public String d() {
                throw null;
            }
        }
    }

    public abstract class Serializer {
    }

    static {
        Class a2 = a("org.apache.xml.security.encryption.XMLCipher");
        a = a2;
        b = LogFactory.getLog(a2.getName());
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw C165577te.A0m(e);
        }
    }
}
