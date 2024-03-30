package X;

import android.os.Handler;
import android.util.Pair;
import java.util.HashMap;

/* renamed from: X.88X  reason: invalid class name */
public class AnonymousClass88X extends A24 implements C23111B5q {
    public static volatile AnonymousClass9TQ A01;
    public final Handler A00;

    public static AnonymousClass9TQ A00() {
        AnonymousClass9TQ r0;
        if (A01 != null) {
            return A01;
        }
        synchronized (AnonymousClass9TQ.class) {
            if (A01 == null) {
                A01 = new AnonymousClass9TQ();
            }
            r0 = A01;
        }
        return r0;
    }

    public AnonymousClass88X(B3B b3b) {
        super(b3b);
        this.A00 = C36341k9.A0H();
    }

    public Handler BCG(String str) {
        Pair pair;
        HashMap hashMap = A00().A00;
        synchronized (hashMap) {
            pair = (Pair) hashMap.get(str);
        }
        if (pair != null) {
            return (Handler) pair.second;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Handler not found: ");
        throw AnonymousClass000.A0c(str, A0u);
    }

    public AnonymousClass94T BDK() {
        return C23111B5q.A00;
    }

    public AnonymousClass88X() {
        this(new C20971A1h());
    }
}
