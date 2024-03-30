package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.1yn  reason: invalid class name and case insensitive filesystem */
public class C42421yn extends AnonymousClass0D3 {
    public final ImageView A00;
    public final ImageView A01;
    public final ImageView A02;
    public final TextView A03;
    public final TextView A04;
    public final C587330v A05;
    public final C19970wo A06;
    public final C18820ts A07;
    public final C20810yC A08;

    public C42421yn(View view, C587330v r3, C19970wo r4, C18820ts r5, C20810yC r6) {
        super(view);
        this.A06 = r4;
        this.A08 = r6;
        this.A07 = r5;
        this.A05 = r3;
        this.A01 = C36401kF.A0G(view, R.id.device_icon);
        this.A03 = C36391kE.A0O(view, R.id.name);
        this.A04 = C36391kE.A0O(view, R.id.status);
        this.A02 = C36401kF.A0G(view, R.id.sync_badge);
        this.A00 = C36401kF.A0G(view, R.id.error_badge);
    }
}
