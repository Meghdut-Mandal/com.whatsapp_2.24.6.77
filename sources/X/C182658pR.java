package X;

import android.content.Context;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.8pR  reason: invalid class name and case insensitive filesystem */
public class C182658pR extends C182628pO {
    public boolean A00;

    public /* bridge */ /* synthetic */ void A09(AnonymousClass3T1 r2, List list) {
        AnonymousClass2bU r22 = (AnonymousClass2bU) r2;
        super.A09(r22, list);
        this.A00.setMessage(r22);
    }

    public C182658pR(Context context, C33301f4 r2) {
        super(context, r2);
        A04();
    }

    public String getDefaultMessageText() {
        return getContext().getString(R.string.f12nameremoved);
    }

    public int getDrawableRes() {
        return R.drawable.msg_status_video;
    }
}
