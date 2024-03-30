package org.spongycastle.jcajce.provider.digest;

import X.AnonymousClass11v;
import X.C195349Tx;
import X.C21764AZx;
import X.C21863Abn;
import X.C21908Ace;
import X.C21909Acf;
import X.C22710AtE;
import X.C22725Aud;
import java.util.Hashtable;

public class SHA1 {

    public class Mappings extends AnonymousClass11v {
        public static final String A00 = SHA1.class.getName();
    }

    public class Digest extends C21863Abn implements Cloneable {
        public Digest() {
            super(new C22710AtE());
        }

        public Object clone() {
            C21863Abn abn = (C21863Abn) super.clone();
            abn.A01 = new C22710AtE((C22710AtE) this.A01);
            return abn;
        }
    }

    public class HashMac extends C21909Acf {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public HashMac() {
            super(new C21764AZx(new C22710AtE()));
            Hashtable hashtable = C21764AZx.A07;
        }
    }

    public class KeyGenerator extends C21908Ace {
        public KeyGenerator() {
            super("HMACSHA1", new C195349Tx(), 160);
        }
    }

    public class PBEWithMacKeyFactory extends C22725Aud {
        public PBEWithMacKeyFactory() {
            super("PBEwithHmacSHA", 2, 1, 160, 0, false);
        }
    }

    public class SHA1Mac extends C21909Acf {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SHA1Mac() {
            super(new C21764AZx(new C22710AtE()));
            Hashtable hashtable = C21764AZx.A07;
        }
    }
}
