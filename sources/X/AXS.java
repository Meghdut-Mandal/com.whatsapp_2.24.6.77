package X;

import java.util.Comparator;

public final /* synthetic */ class AXS implements Comparator {
    public final /* synthetic */ String A00;

    public /* synthetic */ AXS(String str) {
        this.A00 = str;
    }

    public final int compare(Object obj, Object obj2) {
        int i;
        String str = this.A00;
        Integer A01 = AnonymousClass9ZS.A01(str, (String) obj);
        Integer A012 = AnonymousClass9ZS.A01(str, (String) obj2);
        int i2 = 1;
        if (A01 != null) {
            i = A01.intValue();
        } else {
            i = 1;
        }
        Integer valueOf = Integer.valueOf(i);
        if (A012 != null) {
            i2 = A012.intValue();
        }
        Integer valueOf2 = Integer.valueOf(i2);
        if (valueOf.intValue() <= valueOf2.intValue()) {
            valueOf = valueOf2;
        }
        return valueOf.intValue();
    }
}
