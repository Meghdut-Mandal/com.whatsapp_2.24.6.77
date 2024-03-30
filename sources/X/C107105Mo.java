package X;

import android.app.ProgressDialog;
import android.content.Intent;
import com.whatsapp.R;
import com.whatsapp.profile.WebImagePicker;

/* renamed from: X.5Mo  reason: invalid class name and case insensitive filesystem */
public class C107105Mo extends C132446Tt {
    public ProgressDialog A00;
    public final C1273367w A01;
    public final /* synthetic */ WebImagePicker A02;

    public C107105Mo(C1273367w r1, WebImagePicker webImagePicker) {
        this.A02 = webImagePicker;
        this.A01 = r1;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Number number = (Number) obj;
        ProgressDialog progressDialog = this.A00;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        this.A00 = null;
        WebImagePicker webImagePicker = this.A02;
        if (webImagePicker.A0B == this) {
            webImagePicker.A0B = null;
        }
        int intValue = number.intValue();
        if (intValue == 0) {
            Intent A0D = C36431kI.A0D();
            A0D.putExtra("webImageSource", this.A01.A06);
            webImagePicker.setResult(-1, A0D);
            webImagePicker.finish();
        } else if (!C36431kI.A1Y(this)) {
            C36321k7.A1J(number, "webimage/download/error ", AnonymousClass000.A0u());
            if (intValue == 2) {
                boolean A002 = C20060wx.A00();
                int i = R.string.f12nameremoved;
                if (A002) {
                    i = R.string.f12nameremoved;
                }
                webImagePicker.BO5(i);
                return;
            }
            webImagePicker.A05.A06(R.string.f12nameremoved, 1);
        }
    }
}
