package X;

import java.math.BigInteger;
import java.util.Hashtable;

/* renamed from: X.Aru  reason: case insensitive filesystem */
public class C22628Aru extends AnonymousClass120 {
    public static final Hashtable A01 = new Hashtable();
    public static final String[] A02 = {"unspecified", "keyCompromise", "cACompromise", "affiliationChanged", "superseded", "cessationOfOperation", "certificateHold", "unknown", "removeFromCRL", "privilegeWithdrawn", "aACompromise"};
    public C22652AsI A00;

    public C22628Aru(int i) {
        this.A00 = new C22652AsI(i);
    }

    public AnonymousClass121 Bve() {
        return this.A00;
    }

    public static C22628Aru A00(Object obj) {
        if (!(obj instanceof C22628Aru)) {
            if (obj == null) {
                return null;
            }
            int A0H = C22652AsI.A01(obj).A0H();
            Integer valueOf = Integer.valueOf(A0H);
            Hashtable hashtable = A01;
            if (!hashtable.containsKey(valueOf)) {
                hashtable.put(valueOf, new C22628Aru(A0H));
            }
            obj = hashtable.get(valueOf);
        }
        return (C22628Aru) obj;
    }

    public String toString() {
        String str;
        int intValue = new BigInteger(this.A00.A00).intValue();
        if (intValue < 0 || intValue > 10) {
            str = "invalid";
        } else {
            str = A02[intValue];
        }
        return AnonymousClass000.A0p("CRLReason: ", str, AnonymousClass000.A0u());
    }
}
