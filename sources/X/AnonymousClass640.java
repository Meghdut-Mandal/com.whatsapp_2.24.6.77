package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.640  reason: invalid class name */
public class AnonymousClass640 {
    public int A00 = 0;
    public final C20810yC A01;
    public final AnonymousClass1VS A02;
    public final AnonymousClass1BS A03;
    public final List A04;

    public String A00() {
        int size;
        StringBuilder A0u;
        String A0s;
        AnonymousClass3QR A002;
        if (this.A00 != -1) {
            AnonymousClass1VS r1 = this.A02;
            if (!r1.A02() || (A002 = r1.A00()) == null) {
                List list = this.A04;
                if (list == null) {
                    size = 0;
                } else {
                    size = list.size();
                    int i = this.A00;
                    if (i < size) {
                        A0u = AnonymousClass000.A0u();
                        A0u.append(AnonymousClass6JD.A0O);
                        this.A00 = i + 1;
                        A0s = C36401kF.A0s(list, i);
                        A0u.append(A0s);
                    }
                }
                int i2 = this.A00;
                if (i2 == size) {
                    this.A00 = i2 + 1;
                    A0u = AnonymousClass000.A0u();
                    A0u.append(AnonymousClass6JD.A0O);
                    A0s = AnonymousClass6JD.A0S;
                    A0u.append(A0s);
                }
            } else {
                this.A00 = -1;
                A0u = AnonymousClass000.A0u();
                A0u.append(AnonymousClass6JD.A0O);
                A0u.append(A002.A03);
                A0u.append(":");
                A0u.append(A002.A01);
            }
            return AnonymousClass000.A0q(AnonymousClass6JD.A0T, A0u);
        }
        return null;
    }

    public AnonymousClass640(C20810yC r5, AnonymousClass1VS r6, AnonymousClass1BS r7) {
        ArrayList arrayList;
        this.A02 = r6;
        this.A03 = r7;
        this.A01 = r5;
        if (r5.A0E(4020)) {
            AnonymousClass1BS.A06(r7);
            C124815yq A0B = r7.A0B();
            if (A0B != null) {
                List<AnonymousClass65F> list = A0B.A0A;
                if (!list.isEmpty()) {
                    arrayList = AnonymousClass001.A0I();
                    for (AnonymousClass65F r1 : list) {
                        Set set = r1.A0B;
                        if (set == null || !set.isEmpty()) {
                            String str = r1.A05;
                            if (str != null) {
                                arrayList.add(str);
                            }
                            String str2 = r1.A01;
                            if (str2 != null) {
                                arrayList.add(str2);
                            }
                        }
                    }
                    this.A04 = arrayList;
                }
            }
        }
        arrayList = null;
        this.A04 = arrayList;
    }
}
