package X;

import android.util.Log;
import android.view.View;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0D3  reason: invalid class name */
public abstract class AnonymousClass0D3 {
    public static final List A0I = Collections.emptyList();
    public int A00;
    public int A01 = -1;
    public int A02 = -1;
    public int A03 = -1;
    public int A04 = -1;
    public int A05 = -1;
    public int A06 = 0;
    public long A07 = -1;
    public C02760Bu A08 = null;
    public AnonymousClass0D3 A09 = null;
    public AnonymousClass0D3 A0A = null;
    public RecyclerView A0B;
    public WeakReference A0C;
    public List A0D = null;
    public List A0E = null;
    public boolean A0F = false;
    public int A0G = 0;
    public final View A0H;

    public void A06() {
        this.A00 = 0;
        this.A04 = -1;
        this.A02 = -1;
        this.A07 = -1;
        this.A05 = -1;
        this.A0G = 0;
        this.A09 = null;
        this.A0A = null;
        List list = this.A0D;
        if (list != null) {
            list.clear();
        }
        this.A00 &= -1025;
        this.A06 = 0;
        this.A03 = -1;
        RecyclerView.A0F(this);
    }

    public final void A08(boolean z) {
        int i;
        int i2;
        int i3 = this.A0G;
        if (z) {
            i = i3 - 1;
        } else {
            i = i3 + 1;
        }
        this.A0G = i;
        if (i < 0) {
            this.A0G = 0;
            StringBuilder sb = new StringBuilder();
            sb.append("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
            sb.append(this);
            Log.e("View", sb.toString());
            return;
        }
        if (!z) {
            if (i == 1) {
                i2 = this.A00 | 16;
            } else {
                return;
            }
        } else if (i == 0) {
            i2 = this.A00 & -17;
        } else {
            return;
        }
        this.A00 = i2;
    }

    public final int A04() {
        RecyclerView recyclerView = this.A0B;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.A0M(this);
    }

    public List A05() {
        List list;
        if ((this.A00 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0 || (list = this.A0D) == null || list.size() == 0) {
            return A0I;
        }
        return this.A0E;
    }

    public void A07(int i, boolean z) {
        if (this.A02 == -1) {
            this.A02 = this.A04;
        }
        int i2 = this.A05;
        if (i2 == -1) {
            i2 = this.A04;
            this.A05 = i2;
        }
        if (z) {
            this.A05 = i2 + i;
        }
        this.A04 += i;
        View view = this.A0H;
        if (view.getLayoutParams() != null) {
            ((AnonymousClass0D2) view.getLayoutParams()).A01 = true;
        }
    }

    public boolean A09() {
        if ((this.A00 & 128) != 0) {
            return true;
        }
        return false;
    }

    public boolean A0A() {
        if ((this.A00 & 1) == 0) {
            return false;
        }
        return true;
    }

    public AnonymousClass0D3(View view) {
        if (view != null) {
            this.A0H = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public String toString() {
        String simpleName;
        String str;
        Class<?> cls = getClass();
        if (cls.isAnonymousClass()) {
            simpleName = "ViewHolder";
        } else {
            simpleName = cls.getSimpleName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(simpleName);
        sb.append("{");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(" position=");
        sb.append(this.A04);
        sb.append(" id=");
        sb.append(this.A07);
        sb.append(", oldPos=");
        sb.append(this.A02);
        sb.append(", pLpos:");
        sb.append(this.A05);
        StringBuilder sb2 = new StringBuilder(sb.toString());
        if (this.A08 != null) {
            sb2.append(" scrap ");
            if (this.A0F) {
                str = "[changeScrap]";
            } else {
                str = "[attachedScrap]";
            }
            sb2.append(str);
        }
        int i = this.A00;
        if ((i & 4) != 0) {
            sb2.append(" invalid");
        }
        if (!A0A()) {
            sb2.append(" unbound");
        }
        if ((i & 2) != 0) {
            sb2.append(" update");
        }
        if ((this.A00 & 8) != 0) {
            sb2.append(" removed");
        }
        if (A09()) {
            sb2.append(" ignored");
        }
        if ((i & 256) != 0) {
            sb2.append(" tmpDetached");
        }
        if ((i & 16) != 0 || C011504z.A0A(this.A0H)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(" not recyclable(");
            sb3.append(this.A0G);
            sb3.append(")");
            sb2.append(sb3.toString());
        }
        int i2 = this.A00;
        if (!((i2 & 512) == 0 && (i2 & 4) == 0)) {
            sb2.append(" undefined adapter position");
        }
        if (this.A0H.getParent() == null) {
            sb2.append(" no parent");
        }
        sb2.append("}");
        return sb2.toString();
    }
}
