package X;

import android.graphics.text.LineBreakConfig;
import android.text.StaticLayout;

/* renamed from: X.6GD  reason: invalid class name */
public abstract class AnonymousClass6GD {
    public static final void A00(StaticLayout.Builder builder, int i, int i2) {
        builder.setLineBreakConfig(new LineBreakConfig.Builder().setLineBreakStyle(i).setLineBreakWordStyle(i2).build());
    }

    public static final boolean A01(StaticLayout staticLayout) {
        return staticLayout.isFallbackLineSpacingEnabled();
    }
}
