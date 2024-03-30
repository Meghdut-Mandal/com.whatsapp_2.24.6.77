package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.whatsapp.R;
import com.whatsapp.settings.SettingsRowIconText;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3Jr  reason: invalid class name and case insensitive filesystem */
public abstract class C63343Jr {
    public final AnonymousClass17Y A00;
    public final AnonymousClass1H2 A01;
    public final C18820ts A02;
    public final C19770wU A03;
    public final WeakReference A04;

    public void A00(Drawable drawable, Integer num) {
        View A0Y;
        if ((this instanceof C44142Ma) && (A0Y = AnonymousClass000.A0Y(((C44142Ma) this).A00)) != null) {
            Chip chip = (Chip) A0Y;
            chip.setChipIcon(drawable);
            if (num != null) {
                chip.setChipIconTintResource(num.intValue());
            } else {
                chip.setChipIconTint((ColorStateList) null);
            }
        }
    }

    public final void A01(C63233Jg r19) {
        View A0Y = AnonymousClass000.A0Y(this.A04);
        if (A0Y != null) {
            Context context = A0Y.getContext();
            Resources resources = context.getResources();
            C63233Jg r7 = r19;
            if (r19 != null) {
                String str = r7.A03;
                if (str != null) {
                    long millis = r7.A01 + TimeUnit.SECONDS.toMillis(r7.A00);
                    Object[] A0M = AnonymousClass001.A0M();
                    C18820ts r12 = this.A02;
                    A0M[0] = C36361kB.A0o(r12.A0A(170), C36401kF.A0x(r12), millis);
                    A02(str, C36351kA.A0x(context, AnonymousClass3UM.A00(r12, millis), A0M, 1, R.string.f12nameremoved), r7.A02, resources.getColor(R.color.f6nameremoved));
                }
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.f7nameremoved);
                String str2 = r7.A02;
                if (str2 == null || str2.length() == 0) {
                    A00((Drawable) null, (Integer) null);
                } else {
                    this.A03.Bp1(new C80523vX(resources, this, str2, dimensionPixelSize, 4));
                }
            } else {
                int A012 = C224314h.A01(context, R.attr.f4nameremoved);
                A02(C36361kB.A0m(context, R.string.f12nameremoved), (String) null, (String) null, context.getResources().getColor(A012));
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.f7nameremoved);
                Drawable A013 = AnonymousClass3UF.A01(context, R.drawable.ib_emoji, A012);
                A013.setBounds(0, 0, dimensionPixelSize2, dimensionPixelSize2);
                A00(A013, Integer.valueOf(A012));
            }
        }
    }

    public void A02(String str, String str2, String str3, int i) {
        if (this instanceof AnonymousClass2MZ) {
            View A0Y = AnonymousClass000.A0Y(((AnonymousClass2MZ) this).A00);
            if (A0Y != null) {
                SettingsRowIconText settingsRowIconText = (SettingsRowIconText) A0Y;
                if (str3 != null) {
                    StringBuilder A0v = AnonymousClass000.A0v(str3);
                    A0v.append(' ');
                    String A0q = AnonymousClass000.A0q(str, A0v);
                    if (A0q != null) {
                        str = A0q;
                    }
                }
                settingsRowIconText.setText((CharSequence) str);
                settingsRowIconText.setSubText(str2);
                return;
            }
            return;
        }
        View A0Y2 = AnonymousClass000.A0Y(((C44142Ma) this).A00);
        if (A0Y2 != null) {
            TextView textView = (TextView) A0Y2;
            textView.setText(str);
            textView.setTextColor(i);
        }
    }

    public C63343Jr(AnonymousClass17Y r1, C18820ts r2, AnonymousClass1H2 r3, C19770wU r4, WeakReference weakReference) {
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = r3;
        this.A02 = r2;
        this.A04 = weakReference;
    }
}
