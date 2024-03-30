package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.3fd  reason: invalid class name and case insensitive filesystem */
public abstract class C70733fd implements C88784Ua {
    public final C88784Ua A00;
    public final int A01;

    public boolean BBr() {
        return this.A00.BBr();
    }

    public String BIN(C88744Tw r4) {
        AnonymousClass00C.A0D(r4, 0);
        Collection BHB = r4.BHB();
        if (BHB != null) {
            if (!BHB.isEmpty()) {
                Iterator it = BHB.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!(it.next() instanceof AnonymousClass2bU)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (BHB.size() >= 4) {
                return r4.getContext().getString(this.A01);
            }
        }
        return this.A00.BIN(r4);
    }

    public boolean BtJ(Collection collection) {
        AnonymousClass00C.A0D(collection, 0);
        return this.A00.BtJ(collection);
    }

    public int getId() {
        return this.A00.getId();
    }

    public C70733fd(C88784Ua r1, int i) {
        this.A00 = r1;
        this.A01 = i;
    }

    public Drawable BCW(Context context, C18820ts r3) {
        C36321k7.A0w(context, r3);
        return this.A00.BCW(context, r3);
    }
}
