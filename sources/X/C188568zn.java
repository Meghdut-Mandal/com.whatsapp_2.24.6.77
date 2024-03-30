package X;

import com.whatsapp.R;

/* renamed from: X.8zn  reason: invalid class name and case insensitive filesystem */
public enum C188568zn {
    GOOGLE_PAY("gpay", 0, R.drawable.ic_app_gpay),
    PHONE_PE("phonepe", 1, R.drawable.ic_app_phonepe),
    PAY_TM("paytm", 2, R.drawable.ic_app_paytm);
    
    public final int appIcon;
    public final String methodName;
    public final String packageName;

    /* access modifiers changed from: public */
    static {
        C188568zn[] r0;
        A00 = C000900k.A00(r0);
    }

    /* access modifiers changed from: public */
    C188568zn(String str, int i, int i2) {
        this.packageName = r2;
        this.methodName = str;
        this.appIcon = i2;
    }
}
