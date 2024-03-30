package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

/* renamed from: X.1nl  reason: invalid class name and case insensitive filesystem */
public class C38131nl extends FrameLayout {
    public final ViewGroup.MarginLayoutParams A00;
    public final WaTextView A01;

    public C38131nl(Context context) {
        super(context);
        View.inflate(getContext(), R.layout.f9nameremoved, this);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        this.A00 = marginLayoutParams;
        setLayoutParams(marginLayoutParams);
        WaTextView A0Q = C36401kF.A0Q(this, R.id.title);
        this.A01 = A0Q;
        C33511fU.A03(A0Q);
        C012005e.A0a(this, true);
        C012005e.A0V(this, new C89064Vc(this, 4));
    }
}
