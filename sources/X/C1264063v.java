package X;

import android.os.Process;
import android.text.TextUtils;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: X.63v  reason: invalid class name and case insensitive filesystem */
public class C1264063v {
    public final long A00 = System.currentTimeMillis();
    public final String A01;
    public final String A02;
    public final String A03 = Thread.currentThread().getName();
    public final Object[] A04;

    public C1264063v(String str, String str2, Object[] objArr) {
        this.A02 = str;
        this.A01 = str2;
        this.A04 = objArr;
    }

    public String toString() {
        try {
            JSONObject A1B = C36441kJ.A1B();
            StringBuilder A0u = AnonymousClass000.A0u();
            String str = this.A02;
            if (!TextUtils.isEmpty(str)) {
                C90494aF.A1M(A0u, str);
            }
            A0u.append(String.format(Locale.ROOT, this.A01, this.A04));
            C90504aG.A1J(A0u, "content", A1B);
            A1B.put("time", this.A00);
            A1B.put("thread", this.A03);
            A1B.put("process", Process.myPid());
            return A1B.toString();
        } catch (Exception e) {
            Locale locale = Locale.ROOT;
            Object[] A0L = AnonymousClass001.A0L();
            C90514aH.A1U(e, A0L, 0);
            return String.format(locale, "Invalid log: %s", A0L);
        }
    }
}
