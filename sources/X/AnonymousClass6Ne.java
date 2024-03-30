package X;

import java.util.List;

/* renamed from: X.6Ne  reason: invalid class name */
public final class AnonymousClass6Ne {
    public final List A00 = AnonymousClass001.A0I();

    public final int A00() {
        int A06;
        List list = this.A00;
        if (list.size() > 0) {
            int A062 = C36351kA.A06(list, 0);
            while (C36401kF.A1a(list) && C36351kA.A06(list, 0) == A062) {
                list.set(0, C007103b.A0N(list));
                list.remove(C36421kH.A06(list, 1));
                int size = list.size();
                int size2 = list.size() >>> 1;
                int i = 0;
                while (i < size2) {
                    int A063 = C36351kA.A06(list, i);
                    int i2 = (i + 1) * 2;
                    int i3 = i2 - 1;
                    int A064 = C36351kA.A06(list, i3);
                    if (i2 < size && (A06 = C36351kA.A06(list, i2)) > A064) {
                        if (A06 <= A063) {
                            break;
                        }
                        list.set(i, Integer.valueOf(A06));
                        list.set(i2, Integer.valueOf(A063));
                        i = i2;
                    } else if (A064 <= A063) {
                        break;
                    } else {
                        list.set(i, Integer.valueOf(A064));
                        list.set(i3, Integer.valueOf(A063));
                        i = i3;
                    }
                }
            }
            return A062;
        }
        throw AnonymousClass6XJ.A01("Set is empty");
    }

    public final void A01(int i) {
        List list = this.A00;
        if (!C36401kF.A1a(list) || !(C36351kA.A06(list, 0) == i || C36351kA.A06(list, C36431kI.A07(list)) == i)) {
            int size = list.size();
            Integer valueOf = Integer.valueOf(i);
            list.add(valueOf);
            while (size > 0) {
                int i2 = ((size + 1) >>> 1) - 1;
                int A06 = C36351kA.A06(list, i2);
                if (i <= A06) {
                    break;
                }
                list.set(size, Integer.valueOf(A06));
                size = i2;
            }
            list.set(size, valueOf);
        }
    }

    public /* synthetic */ AnonymousClass6Ne(List list, int i, C05250Oz r4) {
    }

    public AnonymousClass6Ne() {
    }
}
