package org.spongycastle.jcajce.provider.digest;

import X.AnonymousClass11v;
import X.C195349Tx;
import X.C21763AZw;
import X.C21764AZx;
import X.C21863Abn;
import X.C21908Ace;
import X.C21909Acf;
import X.C22715AtJ;
import java.util.Hashtable;

public class SHA384 {

    public class Mappings extends AnonymousClass11v {
        public static final String A00 = SHA384.class.getName();
    }

    public class Digest extends C21863Abn implements Cloneable {
        public Digest() {
            super(new C22715AtJ());
        }

        public Object clone() {
            C21863Abn abn = (C21863Abn) super.clone();
            abn.A01 = new C22715AtJ((C22715AtJ) this.A01);
            return abn;
        }
    }

    public class HashMac extends C21909Acf {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public HashMac() {
            super(new C21764AZx(new C22715AtJ()));
            Hashtable hashtable = C21764AZx.A07;
        }
    }

    public class KeyGenerator extends C21908Ace {
        public KeyGenerator() {
            super("HMACSHA384", new C195349Tx(), 384);
        }
    }

    public class OldSHA384 extends C21909Acf {
        public OldSHA384() {
            super(new C21763AZw(new C22715AtJ()));
        }
    }
}
