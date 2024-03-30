package X;

import android.os.Bundle;
import android.os.Parcelable;

/* renamed from: X.5c0  reason: invalid class name and case insensitive filesystem */
public abstract class C111265c0 {
    public static final C128146Bb A00(AnonymousClass02E r5) {
        C134856bi r4;
        Bundle A0b = r5.A0b();
        Parcelable parcelable = A0b.getParcelable("argPrompt");
        if (parcelable instanceof C134856bi) {
            r4 = (C134856bi) parcelable;
        } else {
            r4 = null;
        }
        int i = A0b.getInt("argDisclosureId", -1);
        int i2 = A0b.getInt("argPromptIndex", -1);
        if (r4 == null || i == -1 || i2 == -1) {
            return null;
        }
        return new C128146Bb(r4, i, i2);
    }
}
