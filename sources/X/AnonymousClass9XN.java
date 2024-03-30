package X;

import java.util.List;
import java.util.Map;
import java.util.Stack;

/* renamed from: X.9XN  reason: invalid class name */
public final class AnonymousClass9XN {
    public C108015Rv A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;
    public final Map A06;
    public final Map A07;
    public final Stack A08;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass9XN) {
                AnonymousClass9XN r5 = (AnonymousClass9XN) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A06, r5.A06) || !AnonymousClass00C.A0J(this.A07, r5.A07) || !AnonymousClass00C.A0J(this.A05, r5.A05) || !AnonymousClass00C.A0J(this.A08, r5.A08) || !AnonymousClass00C.A0J(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ AnonymousClass9XN(String str, String str2, String str3, String str4, List list, Map map, Map map2) {
        Stack stack = new Stack();
        C108015Rv r1 = C108015Rv.BOTTOM_SHEET;
        AnonymousClass00C.A0D(str3, 3);
        this.A01 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A06 = map;
        this.A07 = map2;
        this.A05 = list;
        this.A08 = stack;
        this.A00 = r1;
        this.A04 = str4;
    }

    public int hashCode() {
        int A082 = C36381kD.A08(this.A03, C36421kH.A04(this.A01));
        Map map = this.A07;
        return C90504aG.A0B(this.A04, C36351kA.A05(this.A00, C36351kA.A05(this.A08, (C36351kA.A05(map, (C36381kD.A08(this.A02, A082) + AnonymousClass000.A0H(this.A06)) * 31) + C36411kG.A09(this.A05)) * 31)));
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("StateMachineData(config=");
        A0u.append(this.A01);
        A0u.append(", sessionContextId=");
        A0u.append(this.A03);
        A0u.append(", fdsManagerId=");
        A0u.append(this.A02);
        A0u.append(", overwriteFirstScreenPresentation=");
        A0u.append(this.A06);
        A0u.append(", stateRegistry=");
        A0u.append(this.A07);
        A0u.append(", nextScreens=");
        A0u.append(this.A05);
        A0u.append(", uiStack=");
        A0u.append(this.A08);
        A0u.append(", modalType=");
        A0u.append(this.A00);
        A0u.append(", startAt=");
        return C36321k7.A0E(this.A04, A0u);
    }
}
