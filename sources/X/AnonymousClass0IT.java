package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

/* renamed from: X.0IT  reason: invalid class name */
public class AnonymousClass0IT extends C09980dT {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ ViewGroup A02;
    public final /* synthetic */ AnonymousClass055 A03;

    public AnonymousClass0IT(View view, View view2, ViewGroup viewGroup, AnonymousClass055 r4) {
        this.A03 = r4;
        this.A02 = viewGroup;
        this.A00 = view;
        this.A01 = view2;
    }

    public void Bjd(AnonymousClass054 r4) {
        this.A01.setTag(R.id.save_overlay_view, (Object) null);
        AnonymousClass0SN r0 = new AnonymousClass0SN(this.A02);
        r0.A00.remove(this.A00);
        r4.A0B(this);
    }

    public void Bje(AnonymousClass054 r3) {
        AnonymousClass0SN r0 = new AnonymousClass0SN(this.A02);
        r0.A00.remove(this.A00);
    }

    public void Bjf(AnonymousClass054 r4) {
        View view = this.A00;
        if (view.getParent() == null) {
            new AnonymousClass0SN(this.A02).A00.add(view);
        } else {
            this.A03.A0H();
        }
    }
}
