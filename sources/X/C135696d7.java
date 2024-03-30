package X;

import android.view.View;
import java.util.List;

/* renamed from: X.6d7  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C135696d7 implements View.OnLongClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C96144mr A01;

    public /* synthetic */ C135696d7(C96144mr r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final boolean onLongClick(View view) {
        C96144mr r3 = this.A01;
        int i = this.A00;
        List A002 = C96144mr.A00(r3);
        if (i < 0 || i >= A002.size() || !((AnonymousClass6CV) A002.get(i)).A01 || r3.A04.A05.isEmpty()) {
            return false;
        }
        return C96144mr.A03(r3, i);
    }
}
