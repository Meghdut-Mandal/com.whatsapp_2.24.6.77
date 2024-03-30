package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.1xA  reason: invalid class name and case insensitive filesystem */
public class C41411xA extends AnonymousClass0D3 {
    public C41411xA(View view, C24801Dv r14, AnonymousClass17Y r15, C587330v r16, C21060yb r17, C20810yC r18, C20380xT r19) {
        super(view);
        Context context = view.getContext();
        AnonymousClass6YV.A0E(context, r19.A04("download-and-installation", "about-linked-devices"), r14, r15, C36401kF.A0O(view, R.id.linked_devices_description_text), r17, r18, C36391kE.A0v(context, "learn-more", AnonymousClass001.A0L(), 0, R.string.f12nameremoved), "learn-more");
        TextView A0O = C36391kE.A0O(view, R.id.link_device_button);
        A0O.setText(R.string.f12nameremoved);
        C66943Xx.A00(A0O, r16, 13);
    }
}
