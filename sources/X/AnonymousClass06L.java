package X;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: X.06L  reason: invalid class name */
public final class AnonymousClass06L implements AnonymousClass06K {
    public final float A00;

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof AnonymousClass06L) && this.A00 == ((AnonymousClass06L) obj).A00;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.A00)});
    }

    public float BAD(RectF rectF) {
        return this.A00 * Math.min(rectF.width(), rectF.height());
    }

    public AnonymousClass06L(float f) {
        this.A00 = f;
    }
}
