package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.1wB  reason: invalid class name and case insensitive filesystem */
public final class C40831wB extends AnonymousClass0CZ {
    public C586030i A00;
    public List A01 = C023409w.A00;
    public final AnonymousClass1RY A02;
    public final C27731Pn A03;

    public C40831wB(Context context, C27731Pn r3) {
        AnonymousClass00C.A0D(r3, 2);
        this.A03 = r3;
        this.A02 = r3.A05(context, "group-call-psa-bottom-sheet");
    }

    public void A0I(RecyclerView recyclerView) {
        AnonymousClass00C.A0D(recyclerView, 0);
        this.A02.A02();
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        return new C42221yT(C36371kC.A0I(C36341k9.A0J(viewGroup, 0), viewGroup, R.layout.f9nameremoved), this.A00, this.A02);
    }

    public int A0J() {
        return this.A01.size();
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r8, int i) {
        C42221yT r82 = (C42221yT) r8;
        AnonymousClass00C.A0D(r82, 0);
        C62793Ho r5 = (C62793Ho) this.A01.get(i);
        AnonymousClass00C.A0D(r5, 0);
        ((TextView) r82.A03.getValue()).setText(r5.A01);
        ImageView imageView = (ImageView) r82.A02.getValue();
        AnonymousClass1RY r3 = r82.A01;
        AnonymousClass141 r2 = r5.A00;
        AnonymousClass00C.A0D(r3, 0);
        r3.A04(imageView, new C53982sD(imageView, 0), r2, imageView.getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
        C586030i r22 = r82.A00;
        if (r22 != null) {
            AnonymousClass3YE.A00(r82.A0H, r5, r22, 11);
        }
    }
}
