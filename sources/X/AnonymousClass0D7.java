package X;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: X.0D7  reason: invalid class name */
public final class AnonymousClass0D7 implements AnonymousClass06K {
    public final float A00;
    public final AnonymousClass06K A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass0D7)) {
            return false;
        }
        AnonymousClass0D7 r4 = (AnonymousClass0D7) obj;
        return this.A01.equals(r4.A01) && this.A00 == r4.A00;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, Float.valueOf(this.A00)});
    }

    public float BAD(RectF rectF) {
        return Math.max(0.0f, this.A01.BAD(rectF) + this.A00);
    }

    public AnonymousClass0D7(AnonymousClass06K r3, float f) {
        if (r3 instanceof AnonymousClass0D7) {
            throw new NullPointerException("adjustment");
        }
        this.A01 = r3;
        this.A00 = f;
    }
}
