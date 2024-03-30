package X;

import android.text.TextUtils;
import com.whatsapp.R;

/* renamed from: X.9dt  reason: invalid class name and case insensitive filesystem */
public class C198629dt {
    public static final AnonymousClass9IL A01 = new AnonymousClass9IL("ICICI", R.drawable.icici_watermark);
    public static final AnonymousClass9IL A02 = new AnonymousClass9IL("HDFC", R.drawable.hdfc_watermark);
    public final C201659k4 A00;

    public C198629dt(C201659k4 r1) {
        this.A00 = r1;
    }

    public AnonymousClass9IL A00(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            switch (str.hashCode()) {
                case 73456:
                    if (str.equals("JIO")) {
                        return new AnonymousClass9IL("JIO", R.drawable.jio_watermark);
                    }
                    break;
                case 81882:
                    if (str.equals("SBI")) {
                        return new AnonymousClass9IL("SBI", R.drawable.sbi_watermark);
                    }
                    break;
                case 2023329:
                    if (str.equals("AXIS")) {
                        return new AnonymousClass9IL("AXIS", R.drawable.axis_watermark);
                    }
                    break;
                case 2212537:
                    if (str.equals("HDFC")) {
                        return new AnonymousClass9IL("HDFC", R.drawable.hdfc_watermark);
                    }
                    break;
            }
        }
        if (this.A00.A08(str2)) {
            return A02;
        }
        return A01;
    }
}
