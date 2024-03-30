package X;

import android.text.TextUtils;

/* renamed from: X.3qD  reason: invalid class name and case insensitive filesystem */
public class C77263qD implements AnonymousClass4TY {
    public final /* synthetic */ AnonymousClass1JI A00;

    public String BDe() {
        return "encrypted_rid";
    }

    public C77263qD(AnonymousClass1JI r1) {
        this.A00 = r1;
    }

    public void B5q(C21820zr r4) {
        AnonymousClass1JI r1 = this.A00;
        String str = r1.A02;
        if (str == null) {
            str = ((C19420v0) r1.A04.get()).A0b();
            r1.A02 = str;
        }
        if (!TextUtils.isEmpty(str)) {
            r4.A00(str.length(), "encrypted_rid", str);
        }
    }
}
