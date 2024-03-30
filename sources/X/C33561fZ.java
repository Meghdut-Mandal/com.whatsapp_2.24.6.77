package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.HomeActivity;

/* renamed from: X.1fZ  reason: invalid class name and case insensitive filesystem */
public class C33561fZ extends View {
    public final /* synthetic */ HomeActivity A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33561fZ(Context context, HomeActivity homeActivity) {
        super(context);
        this.A00 = homeActivity;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(HomeActivity.A0H(this.A00), 1073741824));
    }
}
