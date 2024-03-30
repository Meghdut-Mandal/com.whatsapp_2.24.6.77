package X;

import android.util.SparseArray;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.5U6  reason: invalid class name */
public enum AnonymousClass5U6 {
    UNENCRYPTED(0),
    CRYPT12(12),
    CRYPT13(13),
    CRYPT14(14),
    CRYPT15(15);
    
    public static SparseArray A00;
    public static AnonymousClass5U6 A01;
    public static AnonymousClass5U6 A02;
    public final int version;

    public static synchronized AnonymousClass5U6 A00() {
        AnonymousClass5U6 r6;
        synchronized (AnonymousClass5U6.class) {
            r6 = A01;
            if (r6 == null) {
                r6 = CRYPT15;
                for (AnonymousClass5U6 r2 : values()) {
                    if (r2.version > r6.version) {
                        r6 = r2;
                    }
                }
                A01 = r6;
            }
        }
        return r6;
    }

    public static synchronized AnonymousClass5U6 A01() {
        AnonymousClass5U6 r6;
        synchronized (AnonymousClass5U6.class) {
            r6 = A02;
            if (r6 == null) {
                r6 = CRYPT12;
                for (AnonymousClass5U6 r2 : values()) {
                    if (r2.version < r6.version) {
                        r6 = r2;
                    }
                }
                A02 = r6;
            }
        }
        return r6;
    }

    public static synchronized AnonymousClass5U6 A02(int i) {
        AnonymousClass5U6 r0;
        synchronized (AnonymousClass5U6.class) {
            if (A00 == null) {
                A04();
            }
            r0 = (AnonymousClass5U6) A00.get(i);
        }
        return r0;
    }

    public static synchronized void A04() {
        synchronized (AnonymousClass5U6.class) {
            A00 = new SparseArray(values().length);
            for (AnonymousClass5U6 r2 : values()) {
                A00.append(r2.version, r2);
            }
        }
    }

    public static synchronized AnonymousClass5U6[] A05(AnonymousClass5U6 r6, AnonymousClass5U6 r7) {
        AnonymousClass5U6[] r0;
        synchronized (AnonymousClass5U6.class) {
            if (A00 == null) {
                A04();
            }
            ArrayList A0I = AnonymousClass001.A0I();
            int i = 0;
            while (true) {
                SparseArray sparseArray = A00;
                if (i < sparseArray.size()) {
                    int keyAt = sparseArray.keyAt(i);
                    if (keyAt >= r6.version && keyAt <= r7.version) {
                        A0I.add((AnonymousClass5U6) A00.get(keyAt));
                    }
                    i++;
                } else {
                    Collections.sort(A0I, AnonymousClass76H.A00);
                    r0 = (AnonymousClass5U6[]) A0I.toArray(new AnonymousClass5U6[0]);
                }
            }
        }
        return r0;
    }

    /* access modifiers changed from: public */
    AnonymousClass5U6(int i) {
        this.version = i;
    }

    public static File A03(AnonymousClass1CP r3, AnonymousClass5U6 r4, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(r4.version);
        return new File(r3.A0E(r4), sb.toString());
    }
}
