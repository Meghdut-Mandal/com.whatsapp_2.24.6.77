package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.6DU  reason: invalid class name */
public final class AnonymousClass6DU {
    public final AnonymousClass6C9 A00;
    public final String A01;
    public final List A02;
    public final Map A03;
    public final int A04;
    public final String A05;
    public final List A06;

    public AnonymousClass6DU(AnonymousClass6C9 r2, String str, String str2, List list, List list2, Map map, int i) {
        C36331k8.A1G(str, 1, list);
        AnonymousClass00C.A0D(str2, 6);
        this.A05 = str;
        this.A04 = i;
        this.A00 = r2;
        this.A06 = list;
        this.A02 = list2;
        this.A01 = str2;
        this.A03 = map;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6DU) {
                AnonymousClass6DU r5 = (AnonymousClass6DU) obj;
                if (!AnonymousClass00C.A0J(this.A05, r5.A05) || this.A04 != r5.A04 || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A06, r5.A06) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A03, C36381kD.A08(this.A01, C36351kA.A05(this.A02, C36351kA.A05(this.A06, C36351kA.A05(this.A00, (C36421kH.A04(this.A05) + this.A04) * 31)))));
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AIBotEmbodimentBehaviorGraph(personaProfile=");
        A0u.append(this.A05);
        A0u.append(", version=");
        A0u.append(this.A04);
        A0u.append(", initialStatus=");
        A0u.append(this.A00);
        A0u.append(", introVideos=");
        A0u.append(this.A06);
        A0u.append(", prefetchVideos=");
        A0u.append(this.A02);
        A0u.append(", personaGlobalDefaultSentiment=");
        A0u.append(this.A01);
        A0u.append(", states=");
        return AnonymousClass000.A0m(this.A03, A0u);
    }
}
