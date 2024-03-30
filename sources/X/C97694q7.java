package X;

import android.content.Context;

/* renamed from: X.4q7  reason: invalid class name and case insensitive filesystem */
public class C97694q7 extends C97824qK {
    public String A00 = "";
    public String A01;
    public final int A02;
    public final C124515yJ A03;

    public C97694q7(Context context, C124515yJ r4, int i) {
        super(context, i);
        int i2 = AnonymousClass000.A0X(context).densityDpi;
        int i3 = 320;
        if (i2 <= 320) {
            i3 = 250;
            if (i2 <= 250) {
                i3 = 72;
            }
        }
        this.A02 = i3;
        this.A03 = r4;
    }
}
