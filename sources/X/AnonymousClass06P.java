package X;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: X.06P  reason: invalid class name */
public final class AnonymousClass06P implements AnonymousClass06K {
    public final float A00;

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof AnonymousClass06P) && this.A00 == ((AnonymousClass06P) obj).A00;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.A00)});
    }

    public AnonymousClass06P(float f) {
        this.A00 = f;
    }

    public float BAD(RectF rectF) {
        return this.A00;
    }
}
