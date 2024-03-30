package X;

import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0z9  reason: invalid class name and case insensitive filesystem */
public final class C21380z9 implements AnonymousClass0z8 {
    public HashSet A00 = new HashSet();
    public HashSet A01 = new HashSet();

    public static final String A00(C21380z9 r3, Set set) {
        String A0Q;
        synchronized (r3) {
            A0Q = C007103b.A0Q(" ", "", "", set, (C006302t) null);
        }
        return A0Q;
    }

    public void BRC() {
        synchronized (this) {
            HashSet hashSet = this.A01;
            hashSet.clear();
            hashSet.addAll(this.A00);
        }
    }

    public void onAppBackgrounded() {
        synchronized (this) {
            HashSet hashSet = this.A01;
            hashSet.clear();
            hashSet.addAll(this.A00);
        }
    }

    public final void A01(String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("LongRunningTaskTracker/setLongRunningTaskState/");
        sb.append(str);
        sb.append(':');
        sb.append(z);
        Log.i(sb.toString());
        synchronized (this) {
            if (z) {
                this.A00.add(str);
                this.A01.add(str);
            } else {
                this.A00.remove(str);
            }
        }
    }
}
