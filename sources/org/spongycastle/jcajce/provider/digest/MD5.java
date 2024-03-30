package org.spongycastle.jcajce.provider.digest;

import X.AnonymousClass11v;
import X.C195349Tx;
import X.C21764AZx;
import X.C21863Abn;
import X.C21908Ace;
import X.C21909Acf;
import X.C22711AtF;
import java.util.Hashtable;

public class MD5 {

    public class Mappings extends AnonymousClass11v {
        public static final String A00 = MD5.class.getName();
    }

    public class Digest extends C21863Abn implements Cloneable {
        public Digest() {
            super(new C22711AtF());
        }

        public Object clone() {
            C21863Abn abn = (C21863Abn) super.clone();
            abn.A01 = new C22711AtF((C22711AtF) this.A01);
            return abn;
        }
    }

    public class HashMac extends C21909Acf {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public HashMac() {
            super(new C21764AZx(new C22711AtF()));
            Hashtable hashtable = C21764AZx.A07;
        }
    }

    public class KeyGenerator extends C21908Ace {
        public KeyGenerator() {
            super("HMACMD5", new C195349Tx(), 128);
        }
    }
}
