package X;

import android.content.Context;
import android.view.ViewGroup;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4dq  reason: invalid class name and case insensitive filesystem */
public final class C92374dq extends ViewGroup {
    public int A00;
    public final int A01 = 5;
    public final C118265nb A02;
    public final List A03;
    public final List A04;

    public C92374dq(Context context) {
        super(context);
        ArrayList A0I = AnonymousClass001.A0I();
        this.A03 = A0I;
        ArrayList A0I2 = AnonymousClass001.A0I();
        this.A04 = A0I2;
        this.A02 = new C118265nb();
        setClipChildren(false);
        C92314dW r0 = new C92314dW(context);
        addView(r0);
        A0I.add(r0);
        A0I2.add(r0);
        this.A00 = 1;
        setTag(R.id.hide_in_inspector_tag, true);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }
}
