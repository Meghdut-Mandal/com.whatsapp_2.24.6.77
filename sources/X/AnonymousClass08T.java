package X;

import java.util.Map;

/* renamed from: X.08T  reason: invalid class name */
public final class AnonymousClass08T extends C001700s {
    public AnonymousClass08M A00;
    public String A01;

    public void A0D(Object obj) {
        AnonymousClass08M r2 = this.A00;
        if (r2 != null) {
            Map map = r2.A03;
            String str = this.A01;
            map.put(str, obj);
            AnonymousClass05L r0 = (AnonymousClass05L) r2.A01.get(str);
            if (r0 != null) {
                r0.setValue(obj);
            }
        }
        super.A0D(obj);
    }

    public AnonymousClass08T(AnonymousClass08M r1, String str) {
        this.A01 = str;
        this.A00 = r1;
    }

    public AnonymousClass08T(AnonymousClass08M r1, Object obj, String str) {
        super(obj);
        this.A01 = str;
        this.A00 = r1;
    }
}
