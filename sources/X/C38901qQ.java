package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.whatsapp.R;

/* renamed from: X.1qQ  reason: invalid class name and case insensitive filesystem */
public final class C38901qQ extends RelativeLayout {
    public C38901qQ(Context context) {
        super(context, (AttributeSet) null, 0);
        View.inflate(context, R.layout.f9nameremoved, this);
        C36341k9.A0q(context, this, C36441kJ.A04(context));
        C36361kB.A10(getResources(), this, R.dimen.f7nameremoved);
    }

    public final void setSearchHint(String str) {
        AnonymousClass00C.A0D(str, 0);
        C36371kC.A1E(this, str, R.id.search_hint);
    }
}
