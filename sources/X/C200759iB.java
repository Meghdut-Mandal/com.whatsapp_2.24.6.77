package X;

import java.util.EnumSet;

/* renamed from: X.9iB  reason: invalid class name and case insensitive filesystem */
public class C200759iB {
    public final C195299Tr A00;

    public static C21076A7n A00(Object obj) {
        C197409bf r0 = C197409bf.A01;
        C194869Ro r2 = new C194869Ro();
        r2.A00 = new A8O();
        r2.A03.addAll(EnumSet.noneOf(C188068yz.class));
        C194879Rp A002 = r2.A00();
        C201749kK.A03(obj, "json object can not be null");
        return new C21076A7n(A002, obj);
    }

    public static C21076A7n A01(String str) {
        C197409bf r0 = C197409bf.A01;
        C194869Ro r2 = new C194869Ro();
        r2.A00 = new A8O();
        r2.A03.addAll(EnumSet.noneOf(C188068yz.class));
        C194879Rp A002 = r2.A00();
        if (str == null || str.length() == 0) {
            throw AnonymousClass001.A08("json string can not be null or empty");
        }
        try {
            return new C21076A7n(A002, new C22563Aos(-1).A0D(str, ((A8O) A002.A00).A00));
        } catch (AnonymousClass928 e) {
            throw new C173728Su(e);
        }
    }

    public C200759iB(String str, C22902AyE[] ayEArr) {
        this.A00 = C202479lz.A01(str, ayEArr);
    }
}
