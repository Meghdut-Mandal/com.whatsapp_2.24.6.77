package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.components.SelectionCheckView;

/* renamed from: X.4oK  reason: invalid class name and case insensitive filesystem */
public class C97054oK extends AnonymousClass0D3 implements View.OnClickListener {
    public final View A00;
    public final View A01;
    public final ImageView A02;
    public final TextView A03;
    public final SelectionCheckView A04;
    public final /* synthetic */ C96014me A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97054oK(View view, C96014me r3) {
        super(view);
        this.A05 = r3;
        this.A01 = view;
        this.A00 = view.findViewById(R.id.filter_thumb);
        this.A02 = C36391kE.A0N(view, R.id.filter_thumb_image);
        this.A04 = (SelectionCheckView) view.findViewById(R.id.selection_check);
        this.A03 = C36391kE.A0P(view, R.id.filter_name);
        view.setOnClickListener(this);
    }

    public void onClick(View view) {
        int A042 = A04();
        if (A042 == -1) {
            return;
        }
        if (A042 <= 0 || this.A05.A01[A042 - 1] != null) {
            AnonymousClass6WR r3 = this.A05.A09;
            if (A042 != r3.A01) {
                r3.A06(new C81283wl((Object) this, A042, 42), new C81283wl((Object) this, A042, 43), A042);
            }
        }
    }
}
