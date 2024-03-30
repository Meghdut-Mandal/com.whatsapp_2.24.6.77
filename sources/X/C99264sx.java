package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;

/* renamed from: X.4sx  reason: invalid class name and case insensitive filesystem */
public final class C99264sx extends AnonymousClass0FL {
    public final C163327q1 A00 = new C163327q1((Object) this, 13);
    public final C006302t A01;
    public final /* synthetic */ WDSBottomSheetDialogFragment A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99264sx(Context context, WDSBottomSheetDialogFragment wDSBottomSheetDialogFragment, C03010Cu r5, int i) {
        super(context, i);
        this.A02 = wDSBottomSheetDialogFragment;
        AnonymousClass00C.A0B(context);
        this.A01 = (C006302t) r5;
    }

    public void onBackPressed() {
        if (!this.A02.A1l()) {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        View findViewById;
        super.onCreate(bundle);
        if (this.A01 != null && (findViewById = findViewById(R.id.design_bottom_sheet)) != null) {
            findViewById.addOnLayoutChangeListener(this.A00);
        }
    }

    public void onStart() {
        super.onStart();
        WDSBottomSheetDialogFragment.A0I(this, this.A02);
    }
}
