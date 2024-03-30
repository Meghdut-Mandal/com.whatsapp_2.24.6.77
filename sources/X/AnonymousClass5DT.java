package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.5DT  reason: invalid class name */
public final class AnonymousClass5DT extends C95774mG {
    public final C115515j0 A00;
    public final C20810yC A01;

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        AnonymousClass00C.A0D(viewGroup, 0);
        C115515j0 r3 = this.A00;
        View A0Q = C90514aH.A0Q(C36351kA.A0C(viewGroup), viewGroup, R.layout.f9nameremoved);
        AnonymousClass00C.A0D(A0Q, 1);
        Resources resources = viewGroup.getResources();
        if (resources.getConfiguration().orientation == 1) {
            int A012 = C14960mT.A01(((float) (resources.getDisplayMetrics().widthPixels - (AnonymousClass04F.A03(viewGroup) + AnonymousClass04F.A02(viewGroup)))) / 4.4f);
            if (resources.getDimensionPixelSize(R.dimen.f7nameremoved) > A012) {
                int floor = (int) Math.floor(((double) A012) / 1.5d);
                int dimensionPixelSize = floor - (resources.getDimensionPixelSize(R.dimen.f7nameremoved) * 2);
                View A02 = C012005e.A02(A0Q, R.id.profile_icon_layout);
                A02.getLayoutParams().width = floor;
                C36411kG.A1A(A02, floor);
                View A022 = C012005e.A02(A0Q, R.id.profile_icon);
                A022.getLayoutParams().width = dimensionPixelSize;
                C36411kG.A1A(A022, dimensionPixelSize);
            }
            A0Q.getLayoutParams().width = A012;
        }
        C36401kF.A0G(A0Q, R.id.profile_icon_badge).setImageResource(C55832vG.A00(this.A01));
        List list = AnonymousClass0D3.A0I;
        return new AnonymousClass5F2(A0Q, (C117555mS) r3.A00.A01.A00.A26.get());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5DT(C115515j0 r2, C20810yC r3) {
        super(C162467od.A00(7));
        C36321k7.A0x(r3, r2);
        this.A01 = r3;
        this.A00 = r2;
    }
}
