package X;

import android.view.ViewGroup;
import java.util.List;

/* renamed from: X.7za  reason: invalid class name and case insensitive filesystem */
public class C168027za extends AnonymousClass0CZ {
    public List A00 = AnonymousClass001.A0I();
    public final /* synthetic */ C178878i2 A01;

    public C168027za(C178878i2 r2) {
        this.A01 = r2;
    }

    public int A0J() {
        return this.A00.size();
    }

    public void BSE(AnonymousClass0D3 r3, int i) {
        if (!(r3 instanceof C96954oA)) {
            if (r3 instanceof AnonymousClass80F) {
                ((AnonymousClass80F) r3).A0B((AnonymousClass9FU) this.A00.get(i), i);
                return;
            } else if (!(r3 instanceof AnonymousClass5Gu)) {
                throw C90514aH.A0s(C24611Dc.A01("PaymentComponentListActivity", "unsupported holder"));
            }
        }
        ((C96954oA) r3).A0B((AnonymousClass9FU) this.A00.get(i), i);
    }

    public AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        return this.A01.A3i(viewGroup, i);
    }

    public int getItemViewType(int i) {
        return ((AnonymousClass9FU) this.A00.get(i)).A00;
    }
}
