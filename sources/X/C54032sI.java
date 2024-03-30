package X;

import java.util.List;

/* renamed from: X.2sI  reason: invalid class name and case insensitive filesystem */
public abstract class C54032sI {
    public static void A00(List list, List list2, int i) {
        Object obj;
        float size;
        list2.clear();
        if (i == list.size()) {
            list2.addAll(list);
        } else if (i == 0) {
        } else {
            if (list.isEmpty()) {
                for (int i2 = 0; i2 < i; i2++) {
                    list2.add(Float.valueOf(0.0f));
                }
                return;
            }
            int size2 = list.size();
            boolean isEmpty = list2.isEmpty();
            if (i > size2) {
                C18740tg.A0B(isEmpty);
                if (list.size() == 1) {
                    size = 0.0f;
                } else {
                    size = 1.0f / (((((float) (i - list.size())) * 1.0f) / ((float) C36421kH.A06(list, 1))) + 1.0f);
                }
                for (int i3 = 0; i3 < i - 1; i3++) {
                    float f = ((float) i3) * size;
                    double d = (double) f;
                    int floor = (int) Math.floor(d);
                    int ceil = (int) Math.ceil(d);
                    float A03 = C36441kJ.A03(list.get(floor));
                    list2.add(Float.valueOf(A03 + ((C36441kJ.A03(list.get(ceil)) - A03) * (f - ((float) floor)))));
                }
                if (i >= 2) {
                    obj = list.get(C36421kH.A06(list, 1));
                } else {
                    return;
                }
            } else {
                C18740tg.A0B(isEmpty);
                float size3 = (((float) i) * 1.0f) / ((float) list.size());
                int i4 = 0;
                float f2 = 0.0f;
                float f3 = 0.0f;
                for (Object A032 : list) {
                    f2 += C36441kJ.A03(A032);
                    i4++;
                    f3 += size3;
                    if (f3 >= 1.0f) {
                        list2.add(Float.valueOf(f2 / ((float) i4)));
                        f3 -= 1.0f;
                        i4 = 0;
                        f2 = 0.0f;
                    }
                }
                if (i4 > 0) {
                    obj = Float.valueOf(f2 / ((float) i4));
                } else {
                    return;
                }
            }
            list2.add(obj);
        }
    }
}
