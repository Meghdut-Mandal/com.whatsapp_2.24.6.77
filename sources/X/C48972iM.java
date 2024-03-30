package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.whatsapp.R;
import com.whatsapp.calling.callhistory.CallLogActivity;
import java.lang.ref.WeakReference;

/* renamed from: X.2iM  reason: invalid class name and case insensitive filesystem */
public class C48972iM extends C132446Tt {
    public final WeakReference A00;
    public final /* synthetic */ CallLogActivity A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48972iM(CallLogActivity callLogActivity, CallLogActivity callLogActivity2) {
        super(callLogActivity2, true);
        this.A01 = callLogActivity;
        this.A00 = AnonymousClass001.A0F(callLogActivity2);
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Bitmap bitmap;
        CallLogActivity callLogActivity = this.A01;
        int dimensionPixelSize = callLogActivity.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        float dimension = callLogActivity.getResources().getDimension(R.dimen.f7nameremoved);
        Context A0G = C36441kJ.A0G(this.A00);
        if (A0G != null) {
            bitmap = callLogActivity.A0H.A07(A0G, callLogActivity.A0Q, dimension, dimensionPixelSize, false);
        } else {
            bitmap = null;
        }
        if (!C36431kI.A1Y(this)) {
            callLogActivity.A05.A0H(new C1501874h(this, bitmap, 45));
        }
        return null;
    }
}
