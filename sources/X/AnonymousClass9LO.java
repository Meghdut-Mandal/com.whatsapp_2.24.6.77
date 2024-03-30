package X;

import java.util.HashSet;

/* renamed from: X.9LO  reason: invalid class name */
public class AnonymousClass9LO {
    public int A00;
    public C22883Axe A01;
    public HashSet A02;
    public String[] A03;

    public AnonymousClass9LO(String[] strArr, int i) {
        C22883Axe a2s;
        int length = strArr.length;
        if (length < 3) {
            throw AnonymousClass001.A08("Annotation conditions should have at least 3 elements");
        } else if (i >= 0) {
            String str = strArr[1];
            if (str.equals("any")) {
                a2s = new A2T();
            } else if (str.equals("all")) {
                a2s = new A2S();
            } else {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("'");
                A0u.append(str);
                throw AnonymousClass000.A0c("' is not a valid operation", A0u);
            }
            this.A01 = a2s;
            int i2 = length - 2;
            String[] strArr2 = new String[i2];
            this.A03 = strArr2;
            for (int i3 = 0; i3 < i2; i3++) {
                strArr2[i3] = strArr[i3 + 2];
            }
            this.A02 = C36441kJ.A16();
            this.A00 = i;
        } else {
            throw AnonymousClass000.A0d("Fallback sampling rate < 0: ", AnonymousClass000.A0u(), i);
        }
    }
}
