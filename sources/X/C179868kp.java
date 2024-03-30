package X;

import android.content.Context;
import android.view.View;
import android.widget.ListView;
import com.whatsapp.R;

/* renamed from: X.8kp  reason: invalid class name and case insensitive filesystem */
public class C179868kp extends AnonymousClass80F {
    public boolean A00 = false;
    public final Context A01;
    public final View A02;
    public final ListView A03;
    public final C23075B3f A04;

    public C179868kp(View view, C23075B3f b3f) {
        super(view);
        this.A04 = b3f;
        this.A01 = view.getContext();
        this.A02 = C012005e.A02(view, R.id.view_more_row);
        this.A03 = (ListView) C012005e.A02(view, R.id.timeline_list_view);
    }
}
