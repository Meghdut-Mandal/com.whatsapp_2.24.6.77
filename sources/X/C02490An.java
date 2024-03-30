package X;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* renamed from: X.0An  reason: invalid class name and case insensitive filesystem */
public class C02490An {
    public final int A00;
    public final ColorStateList A01;
    public final Configuration A02;

    public C02490An(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        int hashCode;
        this.A01 = colorStateList;
        this.A02 = configuration;
        if (theme == null) {
            hashCode = 0;
        } else {
            hashCode = theme.hashCode();
        }
        this.A00 = hashCode;
    }
}
