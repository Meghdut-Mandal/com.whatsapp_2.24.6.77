package X;

import android.content.Context;

/* renamed from: X.4Wa  reason: invalid class name and case insensitive filesystem */
public class C89304Wa implements AnonymousClass4TY {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C89304Wa(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj2;
        this.A02 = obj;
        this.A01 = obj3;
    }

    public void B5q(C21820zr r5) {
        String str;
        String str2;
        if (this.A03 != 0) {
            AnonymousClass37Q BJC = ((C62093Et) this.A00).A06.BJC((AnonymousClass11F) this.A01, AnonymousClass1RC.A0A((Context) this.A02));
            if (BJC != null) {
                str = BJC.A01;
                str2 = "wallpaper";
            } else {
                return;
            }
        } else {
            int A002 = ((C62093Et) this.A00).A03.A00((AnonymousClass11F) this.A01, ((AnonymousClass3T1) this.A02).A1O);
            if (A002 < 100) {
                int i = A002 / 25;
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append(i * 25);
                A0u.append("-");
                str = C36381kD.A10(A0u, ((i + 1) * 25) - 1);
            } else if (A002 < 1000) {
                str = "100-999";
            } else if (A002 < 10000) {
                str = "1000-9999";
            } else {
                str = "10000+";
            }
            str2 = "offset_from_end_of_chat";
        }
        r5.A00(str.length(), str2, str);
    }

    public String BDe() {
        if (this.A03 != 0) {
            return "wallpaper";
        }
        return "offset_from_end_of_chat";
    }
}
