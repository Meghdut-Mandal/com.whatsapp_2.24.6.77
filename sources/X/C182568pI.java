package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.8pI  reason: invalid class name and case insensitive filesystem */
public class C182568pI extends C182608pM {
    public C47112dU A00;
    public boolean A01;
    public final AnonymousClass1RY A02;

    public /* bridge */ /* synthetic */ CharSequence A06(AnonymousClass141 r10, AnonymousClass3T1 r11) {
        String str;
        AnonymousClass2bL r112 = (AnonymousClass2bL) r11;
        if (!(r112 instanceof C46902br) || (str = ((C46902br) r112).A03) == null) {
            str = "";
        }
        int i = R.drawable.ic_inline_live_location;
        if (r112 instanceof C46912bs) {
            i = R.drawable.msg_status_location;
        }
        Drawable A0D = C165587tf.A0D(getContext(), i);
        TextPaint paint = this.A01.getPaint();
        AnonymousClass141 r5 = r10;
        if (TextUtils.isEmpty(str)) {
            return super.A06(r10, r112);
        }
        CharSequence A022 = C37351mE.A02(paint, A0D, "");
        Context context = getContext();
        boolean z = r112.A1J.A02;
        return AnonymousClass3TZ.A02(context, this.A01, this.A03, this.A06, r5, this.A08, A022, z);
    }

    public C182568pI(Context context, AnonymousClass1RY r2, C33301f4 r3) {
        super(context, r3);
        A04();
        this.A02 = r2;
        A05();
    }

    public void A0A(AnonymousClass2bL r2, List list) {
        super.A09(r2, list);
        this.A00.setMessage(r2, list);
    }
}
