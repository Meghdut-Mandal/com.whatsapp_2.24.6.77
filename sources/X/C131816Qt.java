package X;

import android.util.JsonReader;
import java.io.IOException;

/* renamed from: X.6Qt  reason: invalid class name and case insensitive filesystem */
public abstract class C131816Qt {
    public static void A00(C159247j3 r6, AnonymousClass66C r7, String str) {
        String str2;
        JsonReader A0Q;
        if (r7 != null) {
            r7.A00("START_PARSE");
        }
        try {
            A0Q = C90484aE.A0Q(str);
            C142116oM r0 = new C142116oM(A0Q);
            r0.BQE();
            C36341k9.A0H().post(new C1503374w(AnonymousClass5ZI.A00(r0), r6, r7, 49));
            A0Q.close();
            return;
        } catch (IOException e) {
            r6.BWo(e.getMessage());
            if (r7 == null) {
                return;
            }
            r7.A00("END_PARSE_FAIL");
            return;
        } catch (OutOfMemoryError e2) {
            if (e2.getMessage() != null) {
                str2 = e2.getMessage();
            } else {
                str2 = "OutOfMemoryError";
            }
            r6.BWo(str2);
            if (r7 == null) {
                return;
            }
            r7.A00("END_PARSE_FAIL");
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public static void A01(C159257j4 r5, AnonymousClass66C r6, String str) {
        JsonReader A0Q;
        if (r6 != null) {
            r6.A00("START_PARSE");
        }
        try {
            A0Q = C90484aE.A0Q(str);
            C142116oM r0 = new C142116oM(A0Q);
            r0.BQE();
            C36341k9.A0H().post(new C1502474n(AnonymousClass5ZI.A00(r0), r5, r6, 0));
            A0Q.close();
            return;
        } catch (IOException e) {
            r5.BWo(e.getMessage());
            if (r6 != null) {
                r6.A00("END_PARSE_FAIL");
                return;
            }
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }
}
