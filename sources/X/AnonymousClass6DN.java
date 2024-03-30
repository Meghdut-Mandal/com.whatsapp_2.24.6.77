package X;

import java.util.Map;

/* renamed from: X.6DN  reason: invalid class name */
public final class AnonymousClass6DN {
    public final int A00 = 10;
    public final C23931Ak A01;
    public final C23931Ak A02;
    public final C128736Dk A03;
    public final String A04;
    public final Map A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6DN) {
                AnonymousClass6DN r5 = (AnonymousClass6DN) obj;
                if (!AnonymousClass00C.A0J(this.A04, r5.A04) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A05, r5.A05) || !AnonymousClass00C.A0J(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public AnonymousClass6DN(C23931Ak r2, C23931Ak r3, C128736Dk r4, String str, Map map) {
        this.A04 = str;
        this.A02 = r2;
        this.A01 = r3;
        this.A05 = map;
        this.A03 = r4;
    }

    public int hashCode() {
        return C36351kA.A05(this.A03, C36351kA.A05(this.A05, C36351kA.A05(this.A01, C36351kA.A05(this.A02, C36421kH.A04(this.A04))))) + 10;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CrosspostSessionData(sessionId=");
        A0u.append(this.A04);
        A0u.append(", messageToCrosspost=");
        A0u.append(this.A02);
        A0u.append(", destinationList=");
        A0u.append(this.A01);
        A0u.append(", multiDestinationCrosspostingInfoMap=");
        A0u.append(this.A05);
        A0u.append(", purposeEncryptionParams=");
        A0u.append(this.A03);
        A0u.append(", crosspostingEntryPoint=");
        return C36321k7.A0G(A0u, 10);
    }
}
