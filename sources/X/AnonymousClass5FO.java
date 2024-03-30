package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

/* renamed from: X.5FO  reason: invalid class name */
public abstract class AnonymousClass5FO extends C46482Xv {
    public C95774mG A00;
    public final WaTextView A01;
    public final WaTextView A02;

    /* renamed from: A0E */
    public void A0C(C105025Db r4) {
        String str;
        WaTextView waTextView;
        int i;
        if (this instanceof AnonymousClass5FN) {
            str = C36441kJ.A0F(this).getString(R.string.f12nameremoved);
        } else if (this instanceof AnonymousClass5FM) {
            AnonymousClass5FM r1 = (AnonymousClass5FM) this;
            boolean A06 = r1.A00.A06();
            Context A0F = C36441kJ.A0F(r1);
            int i2 = R.string.f12nameremoved;
            if (A06) {
                i2 = R.string.f12nameremoved;
            }
            str = C36361kB.A0m(A0F, i2);
        } else if (this instanceof AnonymousClass5FL) {
            str = C36361kB.A0m(C36441kJ.A0F(this), R.string.f12nameremoved);
        } else {
            AnonymousClass5DZ r12 = (AnonymousClass5DZ) r4;
            AnonymousClass00C.A0D(r12, 0);
            str = r12.A00;
        }
        if (str != null) {
            WaTextView waTextView2 = this.A02;
            waTextView2.setText(str);
            waTextView2.setOnClickListener(new AnonymousClass3Y4(r4, 1));
            waTextView = this.A01;
            i = 0;
        } else {
            waTextView = this.A01;
            i = 8;
        }
        waTextView.setVisibility(i);
        waTextView.setText(R.string.f12nameremoved);
        waTextView.setOnClickListener(new AnonymousClass3Y4(r4, 0));
        waTextView.setVisibility(0);
        C95774mG r13 = this.A00;
        r13.A00 = r4.A00;
        r13.A0M(r4.A01);
    }

    public void A0B() {
        this.A00.A0M(AnonymousClass001.A0I());
    }

    public AnonymousClass5FO(ViewGroup viewGroup, C95774mG r4, int i) {
        super(C36361kB.A0E(C36351kA.A0C(viewGroup), viewGroup, R.layout.f9nameremoved));
        View view = this.A0H;
        this.A02 = C36401kF.A0Q(view, R.id.title_view);
        this.A01 = C36401kF.A0Q(view, R.id.action_label);
        RecyclerView A0J = C90504aG.A0J(view, R.id.recycler_view);
        view.getContext();
        C36351kA.A1F(A0J, i);
        this.A00 = r4;
        A0J.setAdapter(r4);
    }
}
