package X;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: X.3Px  reason: invalid class name and case insensitive filesystem */
public class C64913Px {
    public static List A02;
    public final List A00 = AnonymousClass001.A0I();
    public final List A01 = AnonymousClass001.A0I();

    static {
        Integer[] numArr = new Integer[5];
        AnonymousClass000.A1J(numArr, 128105);
        AnonymousClass000.A1K(numArr, 128104);
        C36331k8.A1V(numArr, 129489);
        C36341k9.A1T(numArr, 129777);
        C36341k9.A1U(numArr, 129778);
        A02 = Arrays.asList(numArr);
    }

    public C64913Px A00(int i, int i2) {
        int i3 = i - 1;
        List list = this.A01;
        if (i3 >= list.size()) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("MultiSkinToneEmoji/createSkinTonedEmoji/error/person index ");
            A0u.append(i3);
            A0u.append(" is bigger than the total length of sequence ");
            C36351kA.A1R(A0u, list.size());
            return this;
        }
        C64913Px r2 = new C64913Px(A01());
        List list2 = r2.A01;
        if (list2.size() > i3) {
            list2.set(i3, C36341k9.A0I(C36421kH.A0Y(list2, i3), i2));
        }
        return r2;
    }

    public C64913Px(int[] iArr) {
        ArrayList arrayList = null;
        char c = 0;
        int i = 0;
        for (int i2 : iArr) {
            if (A02.contains(Integer.valueOf(i2))) {
                if (arrayList != null) {
                    this.A00.add(arrayList);
                }
                i++;
                this.A01.add(C36341k9.A0I(Integer.valueOf(i2), -1));
                arrayList = AnonymousClass001.A0I();
                c = 1;
            } else {
                int[] iArr2 = AnonymousClass3UO.A05;
                int i3 = 0;
                while (true) {
                    if (iArr2[i3] != i2) {
                        i3++;
                        if (i3 >= 5) {
                            break;
                        }
                    } else if (c == 1) {
                        List list = this.A01;
                        int i4 = i - 1;
                        list.set(i4, C36341k9.A0I(C36421kH.A0Y(list, i4), i2));
                        c = 2;
                    }
                }
                if (i2 == 8205) {
                    C18740tg.A06(arrayList);
                    AnonymousClass000.A1F(arrayList, i2);
                    c = 3;
                } else if (c == 3) {
                    C18740tg.A06(arrayList);
                    AnonymousClass000.A1F(arrayList, i2);
                }
            }
        }
    }

    public int[] A01() {
        ArrayList A0I = AnonymousClass001.A0I();
        int i = 0;
        while (true) {
            List list = this.A01;
            if (i >= list.size()) {
                return C129276Gg.A01(A0I);
            }
            A0I.add(C36421kH.A0Y(list, i));
            if (!(list.size() <= i || list.get(i) == null || C36381kD.A03((Pair) list.get(i)) == -1)) {
                A0I.add(((Pair) list.get(i)).second);
            }
            List list2 = this.A00;
            if (list2.size() > i && list2.get(i) != null) {
                A0I.addAll((Collection) list2.get(i));
            }
            i++;
        }
    }
}
