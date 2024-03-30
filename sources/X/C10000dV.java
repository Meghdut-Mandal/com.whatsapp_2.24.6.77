package X;

import android.view.View;
import androidx.transition.FragmentTransitionSupport;
import java.util.ArrayList;

/* renamed from: X.0dV  reason: invalid class name and case insensitive filesystem */
public class C10000dV implements C17290r2 {
    public final /* synthetic */ View A00;
    public final /* synthetic */ FragmentTransitionSupport A01;
    public final /* synthetic */ ArrayList A02;

    public void Bjc(AnonymousClass054 r1) {
    }

    public void Bje(AnonymousClass054 r1) {
    }

    public void Bjf(AnonymousClass054 r1) {
    }

    public C10000dV(View view, FragmentTransitionSupport fragmentTransitionSupport, ArrayList arrayList) {
        this.A01 = fragmentTransitionSupport;
        this.A00 = view;
        this.A02 = arrayList;
    }

    public void Bjd(AnonymousClass054 r6) {
        r6.A0B(this);
        this.A00.setVisibility(8);
        ArrayList arrayList = this.A02;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AnonymousClass000.A0Z(arrayList, i).setVisibility(0);
        }
    }

    public void Bjg(AnonymousClass054 r1) {
        r1.A0B(this);
        r1.A0A(this);
    }
}
