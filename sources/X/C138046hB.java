package X;

import android.os.Build;
import android.text.StaticLayout;

/* renamed from: X.6hB  reason: invalid class name and case insensitive filesystem */
public final class C138046hB implements C158867iN {
    public boolean BLl(StaticLayout staticLayout, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            return AnonymousClass6GD.A01(staticLayout);
        }
        return i >= 28;
    }

    public StaticLayout B3n(C124955z4 r6) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(r6.A0D, 0, r6.A02, r6.A0B, r6.A08);
        obtain.setTextDirection(r6.A0A);
        obtain.setAlignment(r6.A09);
        obtain.setMaxLines(r6.A07);
        obtain.setEllipsize(r6.A0C);
        obtain.setEllipsizedWidth(r6.A01);
        obtain.setLineSpacing(0.0f, 1.0f);
        obtain.setIncludePad(r6.A0E);
        obtain.setBreakStrategy(r6.A00);
        obtain.setHyphenationFrequency(r6.A03);
        obtain.setIndents((int[]) null, (int[]) null);
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            AnonymousClass5XU.A00(obtain, r6.A04);
            if (i >= 28) {
                AnonymousClass5XV.A00(obtain);
                if (i >= 33) {
                    AnonymousClass6GD.A00(obtain, r6.A05, r6.A06);
                }
            }
        }
        return obtain.build();
    }
}
