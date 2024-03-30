package X;

import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.04X  reason: invalid class name */
public final class AnonymousClass04X extends AnonymousClass04R {
    public static final AnonymousClass04G A06 = new AnonymousClass04Y();
    public boolean A00 = false;
    public boolean A01 = false;
    public final HashMap A02 = new HashMap();
    public final HashMap A03 = new HashMap();
    public final HashMap A04 = new HashMap();
    public final boolean A05;

    public void A0R() {
        if (AnonymousClass01z.A0E(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCleared called for ");
            sb.append(this);
            Log.d("FragmentManager", sb.toString());
        }
        this.A00 = true;
    }

    public void A0T(AnonymousClass02E r3) {
        if (AnonymousClass01z.A0E(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Clearing non-config state for ");
            sb.append(r3);
            Log.d("FragmentManager", sb.toString());
        }
        A01(this, r3.A0W);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass04X r5 = (AnonymousClass04X) obj;
            if (!this.A03.equals(r5.A03) || !this.A02.equals(r5.A02) || !this.A04.equals(r5.A04)) {
                return false;
            }
        }
        return true;
    }

    public static void A01(AnonymousClass04X r2, String str) {
        HashMap hashMap = r2.A02;
        AnonymousClass04X r0 = (AnonymousClass04X) hashMap.get(str);
        if (r0 != null) {
            r0.A0R();
            hashMap.remove(str);
        }
        HashMap hashMap2 = r2.A04;
        AnonymousClass04J r02 = (AnonymousClass04J) hashMap2.get(str);
        if (r02 != null) {
            r02.A00();
            hashMap2.remove(str);
        }
    }

    public void A0S(AnonymousClass02E r5) {
        String obj;
        if (this.A01) {
            if (AnonymousClass01z.A0E(2)) {
                obj = "Ignoring removeRetainedFragment as the state is already saved";
            } else {
                return;
            }
        } else if (this.A03.remove(r5.A0W) != null && AnonymousClass01z.A0E(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Updating retained Fragments: Removed ");
            sb.append(r5);
            obj = sb.toString();
        } else {
            return;
        }
        Log.v("FragmentManager", obj);
    }

    public int hashCode() {
        return (((this.A03.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A04.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.A03.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.A02.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.A04.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public AnonymousClass04X(boolean z) {
        this.A05 = z;
    }
}
