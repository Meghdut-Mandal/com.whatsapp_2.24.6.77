package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1pG  reason: invalid class name and case insensitive filesystem */
public final class C38541pG extends LinearLayout implements C22927Ayd {
    public final Context A00;
    public final AnonymousClass1T1 A01;
    public final AnonymousClass2bI A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38541pG(Context context, AnonymousClass1T1 r6, AnonymousClass2bI r7) {
        super(context, (AttributeSet) null);
        AnonymousClass00C.A0D(r6, 1);
        this.A01 = r6;
        this.A00 = context;
        this.A02 = r7;
        setGravity(17);
        setOrientation(1);
        List bulletMessages = getBulletMessages();
        if (bulletMessages != null) {
            Iterator it = bulletMessages.iterator();
            while (it.hasNext()) {
                String A0C = AnonymousClass001.A0C(it);
                View A0E = C36361kB.A0E(LayoutInflater.from(this.A00), this, R.layout.f9nameremoved);
                C36351kA.A0O(A0E, R.id.message).A0I(A0C);
                addView(A0E);
            }
        }
    }

    private final List getBulletMessages() {
        String A0O = this.A01.A0O(this.A02, true);
        if (A0O != null) {
            return AnonymousClass099.A0L(A0O, new String[]{"\n"}, 0);
        }
        return null;
    }

    public View getBodyView() {
        return this;
    }

    public LinearLayout.LayoutParams getBodyViewLayoutParams() {
        LinearLayout.LayoutParams A0N = C36381kD.A0N();
        A0N.gravity = 3;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        A0N.setMargins(dimensionPixelSize, getResources().getDimensionPixelSize(R.dimen.f7nameremoved), dimensionPixelSize, A0N.bottomMargin);
        return A0N;
    }
}
