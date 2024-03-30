package X;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: X.63o  reason: invalid class name and case insensitive filesystem */
public class C1263463o {
    public C108395Ti A00;
    public String A01;
    public String A02;
    public Throwable A03;
    public Map A04;

    public AnonymousClass5VK A00() {
        String str;
        if (this.A00 != null) {
            if (TextUtils.isEmpty(this.A01)) {
                str = this.A00.mMessage;
            } else {
                str = this.A01;
            }
            Throwable th = this.A03;
            if (th != null) {
                String[] A1S = C36441kJ.A1S();
                A1S[0] = str;
                C90514aH.A1U(th, A1S, 1);
                str = TextUtils.join(";", A1S);
            }
            return new AnonymousClass5VK(this.A00, str, this.A02, this.A03, this.A04);
        }
        throw AnonymousClass001.A08("Must set load exception type");
    }
}
