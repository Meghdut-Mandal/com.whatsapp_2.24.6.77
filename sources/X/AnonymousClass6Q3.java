package X;

import android.util.Log;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Stack;

/* renamed from: X.6Q3  reason: invalid class name */
public class AnonymousClass6Q3 {
    public final C1257961h A00 = new C1257961h();
    public final HashMap A01 = AnonymousClass001.A0J();
    public final Stack A02 = new Stack();

    public AnonymousClass6C8 A01(C100674vP r3, C160377ku r4, String str) {
        AnonymousClass6C8 r1 = new AnonymousClass6C8(r3, r4, this.A00);
        this.A01.put(str, r1);
        return r1;
    }

    public String A02(String str) {
        Stack stack = this.A02;
        if (stack.isEmpty()) {
            return null;
        }
        return C90504aG.A0l(str, (AbstractMap) stack.peek());
    }

    public void A04(boolean z) {
        C1257961h r3 = this.A00;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BloksCallbackQueue/setActive(");
        A0u.append(z);
        A0u.append(")/queue size=");
        Queue queue = r3.A01;
        Log.d("Whatsapp", C36381kD.A10(A0u, queue.size()));
        r3.A00 = z;
        if (z) {
            while (!queue.isEmpty()) {
                Runnable runnable = (Runnable) queue.poll();
                Objects.requireNonNull(runnable, "");
                runnable.run();
            }
        }
    }

    public static void A00(HashMap hashMap) {
        Iterator A10 = C36371kC.A10(hashMap);
        while (A10.hasNext()) {
            ((AnonymousClass6C8) C36351kA.A0u(A10)).A00 = false;
        }
        hashMap.clear();
    }

    public void A03(Map map) {
        Iterator A0y = AnonymousClass000.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            Stack stack = this.A02;
            if (stack.peek() != null) {
                C36411kG.A1T((AbstractMap) stack.peek(), A11);
            }
        }
    }
}
