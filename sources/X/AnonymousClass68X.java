package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.68X  reason: invalid class name */
public class AnonymousClass68X {
    public final List A00 = C36441kJ.A14(4);

    public C125245zZ A00() {
        List list = this.A00;
        int size = list.size();
        if (size == 0) {
            return C112855eZ.A00;
        }
        if (size != 1) {
            return new C98364rJ((C125245zZ[]) list.toArray(new C125245zZ[size]));
        }
        return (C125245zZ) C36391kE.A0t(list);
    }

    public void A01(String... strArr) {
        this.A00.add(new C98384rL(strArr));
    }

    public void A02(String... strArr) {
        List asList = Arrays.asList(strArr);
        if (!asList.isEmpty()) {
            this.A00.add(new C98374rK(asList));
            return;
        }
        throw AnonymousClass001.A08("Cannot set 0 schemes");
    }
}
