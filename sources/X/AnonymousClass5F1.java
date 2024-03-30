package X;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.chip.ChipGroup;
import com.whatsapp.R;
import java.util.Iterator;

/* renamed from: X.5F1  reason: invalid class name */
public final class AnonymousClass5F1 extends C46482Xv {
    public final View A00;
    public final TextView A01;
    public final ChipGroup A02;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass5EH r7 = (AnonymousClass5EH) obj;
        AnonymousClass00C.A0D(r7, 0);
        this.A01.setText(R.string.f12nameremoved);
        ChipGroup chipGroup = this.A02;
        chipGroup.removeAllViews();
        Iterator it = r7.A00.iterator();
        while (it.hasNext()) {
            String A0C = AnonymousClass001.A0C(it);
            View A0E = C36361kB.A0E(LayoutInflater.from(C36371kC.A0B(this.A00)), chipGroup, R.layout.f9nameremoved);
            AnonymousClass00C.A0E(A0E, "null cannot be cast to non-null type com.google.android.material.chip.Chip");
            TextView textView = (TextView) A0E;
            textView.setText(A0C);
            textView.setOnClickListener(new AnonymousClass9v1(5, A0C, r7));
            chipGroup.addView(textView);
        }
    }

    public AnonymousClass5F1(View view) {
        super(view);
        this.A00 = view;
        this.A02 = (ChipGroup) C36361kB.A0G(view, R.id.suggestion_chip_group);
        this.A01 = C36341k9.A0M(view, R.id.title);
    }
}
