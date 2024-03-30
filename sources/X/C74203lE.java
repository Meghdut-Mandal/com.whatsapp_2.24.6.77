package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;
import java.util.Objects;

/* renamed from: X.3lE  reason: invalid class name and case insensitive filesystem */
public class C74203lE implements AnonymousClass4QR {
    public final int A00;
    public final int A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C74203lE r5 = (C74203lE) obj;
            if (!(this.A00 == r5.A00 && this.A01 == r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public Drawable BBE(Context context) {
        Drawable A012 = C013105r.A01(context, this.A00);
        if (A012 == null) {
            return null;
        }
        Drawable A013 = AnonymousClass08I.A01(A012);
        int i = this.A01;
        if (i == R.color.f6nameremoved) {
            i = C224514j.A00(context, R.attr.f4nameremoved, R.color.f6nameremoved);
        }
        AnonymousClass076.A06(A013, context.getResources().getColor(i));
        return A013;
    }

    public C74203lE(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        AnonymousClass000.A1J(A0M, this.A00);
        AnonymousClass000.A1K(A0M, this.A01);
        return Objects.hash(A0M);
    }
}
