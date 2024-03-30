package X;

import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;

/* renamed from: X.72Q  reason: invalid class name */
public class AnonymousClass72Q implements Cloneable {
    public float A00 = 0.0f;
    public float A01 = 0.0f;
    public float A02 = 0.0f;
    public float A03 = 0.0f;
    public int A04;
    public int A05;
    public int A06;
    public int A07 = -16776961;
    public int A08 = -1;
    public int A09 = Integer.MAX_VALUE;
    public int A0A = -1;
    public int A0B = Integer.MIN_VALUE;
    public int A0C = 0;
    public int A0D = -7829368;
    public int A0E = Typeface.DEFAULT.getStyle();
    public Integer A0F;
    public boolean A0G = true;
    public boolean A0H = false;
    public float A0I;
    public float A0J;
    public float A0K = Float.MAX_VALUE;
    public float A0L = 1.0f;
    public int A0M;
    public int A0N;
    public int A0O;
    public int A0P;
    public int A0Q = Integer.MAX_VALUE;
    public int A0R = -16777216;
    public int A0S = -1;
    public ColorStateList A0T;
    public Typeface A0U;
    public TextUtils.TruncateAt A0V;
    public AnonymousClass048 A0W;
    public C120945sL A0X;
    public CharSequence A0Y;
    public Integer A0Z;
    public String A0a;
    public boolean A0b;
    public boolean A0c;

    public static void A00(AnonymousClass72Q r2, Integer num) {
        Integer num2;
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 1) {
                num2 = C023109s.A0C;
            } else if (intValue == 8388611 || intValue != 8388613) {
                num2 = C023109s.A00;
            } else {
                num2 = C023109s.A01;
            }
            r2.A0Z = num2;
        }
    }

    public AnonymousClass72Q() {
        Integer num = C023109s.A00;
        this.A0Z = num;
        this.A04 = -1;
        this.A05 = 0;
        this.A06 = 0;
        this.A0F = num;
        this.A0M = 0;
        this.A0N = 0;
        this.A0c = false;
        this.A0O = Integer.MIN_VALUE;
        this.A0P = Integer.MIN_VALUE;
        this.A0I = 0.0f;
        this.A0J = 0.0f;
        this.A0X = null;
    }

    public AnonymousClass72Q A01() {
        try {
            return (AnonymousClass72Q) super.clone();
        } catch (CloneNotSupportedException e) {
            throw AnonymousClass001.A0B(e);
        }
    }
}
