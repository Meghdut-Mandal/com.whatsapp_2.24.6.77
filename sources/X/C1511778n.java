package X;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: X.78n  reason: invalid class name and case insensitive filesystem */
public class C1511778n extends WeakReference {
    public final long A00;
    public final String A01;
    public final WeakReference A02 = AnonymousClass001.A0F(C36441kJ.A11());

    public C1511778n(Object obj, String str, ReferenceQueue referenceQueue, long j) {
        super(obj, referenceQueue);
        this.A01 = str;
        this.A00 = j;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("KeyedWeakReference{key='");
        A0u.append(this.A01);
        A0u.append('\'');
        A0u.append(", timestamp=");
        A0u.append(this.A00);
        A0u.append(", canary=");
        A0u.append(this.A02);
        A0u.append(", confirmMarker=");
        return C90464aC.A0X((Object) null, A0u);
    }
}
