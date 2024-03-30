package X;

import android.animation.TypeEvaluator;

/* renamed from: X.0ZG  reason: invalid class name */
public class AnonymousClass0ZG implements TypeEvaluator {
    public static final AnonymousClass0ZG A00 = new AnonymousClass0ZG();

    public Object evaluate(float f, Object obj, Object obj2) {
        int A0I = AnonymousClass000.A0I(obj);
        float f2 = ((float) ((A0I >> 24) & 255)) / 255.0f;
        int A0I2 = AnonymousClass000.A0I(obj2);
        float pow = (float) Math.pow((double) (((float) ((A0I >> 16) & 255)) / 255.0f), 2.2d);
        float pow2 = (float) Math.pow((double) (((float) ((A0I >> 8) & 255)) / 255.0f), 2.2d);
        float pow3 = (float) Math.pow((double) (((float) (A0I & 255)) / 255.0f), 2.2d);
        float pow4 = (float) Math.pow((double) (((float) ((A0I2 >> 16) & 255)) / 255.0f), 2.2d);
        float pow5 = (float) Math.pow((double) (((float) ((A0I2 >> 8) & 255)) / 255.0f), 2.2d);
        float f3 = pow + ((pow4 - pow) * f);
        float A002 = AnonymousClass001.A00((float) Math.pow((double) (((float) (A0I2 & 255)) / 255.0f), 2.2d), pow3, f);
        return Integer.valueOf((Math.round(((float) Math.pow((double) f3, 0.45454545454545453d)) * 255.0f) << 16) | (Math.round((f2 + (((((float) ((A0I2 >> 24) & 255)) / 255.0f) - f2) * f)) * 255.0f) << 24) | (Math.round(((float) Math.pow((double) (pow2 + ((pow5 - pow2) * f)), 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow((double) A002, 0.45454545454545453d)) * 255.0f));
    }
}
