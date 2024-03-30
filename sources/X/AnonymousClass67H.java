package X;

import android.graphics.Bitmap;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/* renamed from: X.67H  reason: invalid class name */
public final class AnonymousClass67H {
    public C002000v A00;
    public HashMap A01 = AnonymousClass001.A0J();
    public TreeSet A02 = new TreeSet();
    public final Bitmap.Config A03 = Bitmap.Config.ARGB_8888;

    public final void A01(int i, int i2, String str) {
        AnonymousClass00C.A0D(str, 2);
        synchronized (this.A00) {
            int A012 = AnonymousClass6Y8.A01(this.A03, i, i2);
            HashMap hashMap = this.A01;
            Integer valueOf = Integer.valueOf(A012);
            LinkedHashSet linkedHashSet = (LinkedHashSet) hashMap.get(valueOf);
            if (linkedHashSet != null) {
                linkedHashSet.remove(str);
                if (linkedHashSet.isEmpty()) {
                    this.A02.remove(valueOf);
                }
            }
        }
    }

    public final void A00(int i, int i2, String str) {
        synchronized (this.A00) {
            int A012 = AnonymousClass6Y8.A01(this.A03, i, i2);
            HashMap hashMap = this.A01;
            Integer valueOf = Integer.valueOf(A012);
            if (hashMap.get(valueOf) == null) {
                hashMap.put(valueOf, C36441kJ.A17());
            }
            LinkedHashSet linkedHashSet = (LinkedHashSet) hashMap.get(valueOf);
            if (linkedHashSet != null) {
                linkedHashSet.add(str);
            }
            C90474aD.A1H(valueOf, this.A02);
        }
    }

    public AnonymousClass67H(C002000v r2) {
        this.A00 = r2;
    }
}
