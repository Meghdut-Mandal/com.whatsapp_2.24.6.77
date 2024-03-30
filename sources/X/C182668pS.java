package X;

import android.content.Context;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.8pS  reason: invalid class name and case insensitive filesystem */
public class C182668pS extends C182628pO {
    public boolean A00;

    public /* bridge */ /* synthetic */ void A09(AnonymousClass3T1 r2, List list) {
        AnonymousClass2bU r22 = (AnonymousClass2bU) r2;
        super.A09(r22, list);
        this.A00.setMessage(r22);
    }

    public C182668pS(Context context, C33301f4 r3) {
        super(context, r3);
        A04();
        setId(R.id.gif_row);
    }

    public String getDefaultMessageText() {
        return getContext().getString(R.string.f12nameremoved);
    }

    public int getDrawableRes() {
        return R.drawable.msg_status_gif;
    }

    public int getIconSizeIncrease() {
        return C36341k9.A0F(this).getDimensionPixelSize(R.dimen.f7nameremoved);
    }
}
