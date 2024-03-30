package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2sG  reason: invalid class name and case insensitive filesystem */
public abstract class C54012sG {
    public static final boolean A00(C19420v0 r9, C20810yC r10) {
        if (C63743Lf.A01(r10)) {
            int A07 = r10.A07(5419);
            int A072 = r10.A07(5483);
            if (A07 > 0 && A072 > 0) {
                AnonymousClass005 r3 = r9.A00;
                if (C36391kE.A0H(r3).getInt("push_to_video_sending_enabled", -1) == -1) {
                    String A0t = C36371kC.A0t(C36391kE.A0H(r3), "push_to_video_sending_enabled_default_info");
                    if (A0t != null) {
                        try {
                            List A0L = AnonymousClass099.A0L(A0t, new String[]{","}, 0);
                            ArrayList A0J = C36321k7.A0J(A0L);
                            Iterator it = A0L.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    int parseInt = Integer.parseInt(AnonymousClass001.A0C(it));
                                    if (parseInt < 0) {
                                        break;
                                    }
                                    AnonymousClass000.A1F(A0J, parseInt);
                                } else if (A0J.size() >= 3) {
                                    boolean z = false;
                                    int A06 = C36351kA.A06(A0J, 0);
                                    int A062 = C36351kA.A06(A0J, 1);
                                    if (C36351kA.A06(A0J, 2) != 0) {
                                        z = true;
                                    }
                                    AnonymousClass3J3 r1 = new AnonymousClass3J3(A06, A062, z);
                                    return (A07 == r1.A01 && A072 == r1.A00) ? false : true;
                                }
                            }
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
            }
        }
        return false;
    }
}
