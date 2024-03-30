package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.5Ks  reason: invalid class name and case insensitive filesystem */
public class C106655Ks extends C147396x9 {
    public View A00;
    public List A01;
    public final int A02;
    public final AnonymousClass1HA A03;
    public final C88234Rx A04;

    public C106655Ks(Context context, LayoutInflater layoutInflater, C20810yC r9, AnonymousClass1HA r10, C88234Rx r11, int i, int i2, int i3) {
        super(context, layoutInflater, r9, i2, i3);
        this.A04 = r11;
        this.A03 = r10;
        this.A02 = i;
    }

    public void A03(View view) {
        this.A00 = view.findViewById(R.id.empty);
    }

    public void BVR(ViewGroup viewGroup, View view, int i) {
        super.BVR(viewGroup, view, i);
        this.A00 = null;
    }
}
