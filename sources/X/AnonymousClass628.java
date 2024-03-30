package X;

import java.util.Map;

/* renamed from: X.628  reason: invalid class name */
public final class AnonymousClass628 {
    public final AnonymousClass6D3 A00;
    public final C130996Nh A01;

    public AnonymousClass628(C130996Nh r2, AnonymousClass6D3 r3) {
        AnonymousClass00C.A0D(r2, 1);
        this.A01 = r2;
        this.A00 = r3;
    }

    public void A00(String str, String str2, Map map, int i) {
        String A0n;
        String str3 = str;
        String str4 = str2;
        C36341k9.A1E(str, 0, str2);
        String str5 = "";
        if (map == null) {
            A0n = str5;
        } else {
            A0n = C90504aG.A0n(map);
            AnonymousClass00C.A0B(A0n);
        }
        AnonymousClass6D3 r1 = this.A00;
        String A002 = C130996Nh.A00(Integer.valueOf(i));
        if (A002 != null) {
            str5 = A002;
        }
        r1.A00((AnonymousClass64K) null, C36371kC.A0m(), str3, str5, str4, A0n);
    }
}
