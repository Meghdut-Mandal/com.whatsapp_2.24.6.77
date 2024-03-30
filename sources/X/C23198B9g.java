package X;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.B9g  reason: case insensitive filesystem */
public class C23198B9g implements AnonymousClass7eC {
    public Object A00;
    public String A01;
    public final int A02;

    public C23198B9g(String str, AtomicBoolean atomicBoolean, int i) {
        this.A02 = i;
        this.A01 = str;
        this.A00 = atomicBoolean;
    }

    public final void onResult(Object obj) {
        String str = this.A01;
        Map map = C203529oE.A00;
        map.remove(str);
        ((AtomicBoolean) this.A00).set(true);
        if (map.size() == 0) {
            ArrayList A15 = C36441kJ.A15(C203529oE.A01);
            if (0 < A15.size()) {
                A15.get(0);
                throw AnonymousClass001.A0A("onIdleChanged");
            }
        }
    }
}
