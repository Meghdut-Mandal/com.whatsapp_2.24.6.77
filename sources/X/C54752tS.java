package X;

/* renamed from: X.2tS  reason: invalid class name and case insensitive filesystem */
public abstract class C54752tS {
    public static boolean A00(C19970wo r10, C19420v0 r11, C20810yC r12, AnonymousClass3T1 r13) {
        if (!r12.A0E(249)) {
            return false;
        }
        if ((!(r13 instanceof C46882bp) && !(r13 instanceof C47002cZ)) || !(r13.A1J.A00 instanceof C177528dw) || r12.A0E(1116)) {
            return false;
        }
        AnonymousClass005 r8 = r11.A00;
        if ((C36391kE.A0H(r8).getLong("status_tab_last_opened_time", 0) == 0 || C19970wo.A00(r10) - C36391kE.A0H(r8).getLong("status_tab_last_opened_time", 0) > 1209600000) && (r11.A0Q() <= 0 || System.currentTimeMillis() - r11.A0Q() > 1209600000)) {
            return false;
        }
        return true;
    }
}
