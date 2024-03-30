package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.whatsapp.R;

/* renamed from: X.4eU  reason: invalid class name and case insensitive filesystem */
public class C92714eU extends FrameLayout {
    public AnonymousClass1T7 A00;
    public final C106315Je A01;

    public C92714eU(Context context, AnonymousClass1T7 r6) {
        super(context);
        this.A00 = r6;
        C36351kA.A0C(this).inflate(R.layout.f9nameremoved, this, true);
        View A02 = C012005e.A02(this, R.id.search_directory_container);
        ViewGroup A0O = C36411kG.A0O(this, R.id.chips_container);
        C36391kE.A0O(this, R.id.title).setText(R.string.f12nameremoved);
        C106315Je r0 = new C106315Je(context);
        this.A01 = r0;
        A0O.addView(r0);
        C36341k9.A0q(getContext(), A02, R.color.f6nameremoved);
    }
}
