package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.widget.RadioGroup;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3TD  reason: invalid class name */
public abstract class AnonymousClass3TD {
    public static String A01(Context context, int i, boolean z, boolean z2) {
        int i2;
        if (i <= 0) {
            if (z2) {
                i2 = R.string.f12nameremoved;
                if (z) {
                    i2 = R.string.f12nameremoved;
                }
            } else {
                i2 = R.string.f12nameremoved;
                if (z) {
                    i2 = R.string.f12nameremoved;
                }
            }
        } else if (i == 86400) {
            i2 = R.string.f12nameremoved;
            if (z) {
                i2 = R.string.f12nameremoved;
            }
        } else if (i == 604800) {
            i2 = R.string.f12nameremoved;
            if (z) {
                i2 = R.string.f12nameremoved;
            }
        } else if (i == 7776000) {
            i2 = R.string.f12nameremoved;
            if (z) {
                i2 = R.string.f12nameremoved;
            }
        } else {
            int i3 = R.plurals.f10nameremoved;
            if (i > 86400) {
                i /= 86400;
                i3 = R.plurals.f10nameremoved;
            } else if (i >= 3600) {
                i /= 3600;
                i3 = R.plurals.f10nameremoved;
            } else if (i >= 60) {
                i /= 60;
                i3 = R.plurals.f10nameremoved;
            }
            Resources resources = context.getResources();
            Object[] A0L = AnonymousClass001.A0L();
            C36331k8.A1W(A0L, i);
            return resources.getQuantityString(i3, i, A0L);
        }
        return context.getString(i2);
    }

    public static String A02(C18820ts r2, int i) {
        int i2;
        if (i <= 0) {
            return "";
        }
        if (i >= 86400) {
            i /= 86400;
            i2 = R.plurals.f10nameremoved;
        } else if (i >= 3600) {
            i /= 3600;
            i2 = R.plurals.f10nameremoved;
        } else if (i >= 60) {
            i /= 60;
            i2 = R.plurals.f10nameremoved;
        } else {
            i2 = R.plurals.f10nameremoved;
        }
        return C36331k8.A0g(r2, i, 0, i2);
    }

    public static void A03(RadioGroup radioGroup, C20810yC r11, int i, boolean z, boolean z2) {
        int[] iArr;
        if (!z) {
            AnonymousClass17Z r0 = AnonymousClass17Z.$redex_init_class;
        }
        if (r11.A0E(1397)) {
            iArr = C19430v1.A0K;
        } else {
            iArr = C19430v1.A0L;
        }
        int i2 = -1;
        AppCompatRadioButton[] appCompatRadioButtonArr = new AppCompatRadioButton[4];
        int i3 = 0;
        do {
            int i4 = iArr[i3];
            if (!z2 || i4 != 0) {
                Context context = radioGroup.getContext();
                AppCompatRadioButton appCompatRadioButton = new AppCompatRadioButton(new ContextThemeWrapper(context, R.style.f13nameremoved));
                appCompatRadioButton.setId(AnonymousClass04F.A00());
                appCompatRadioButton.setTag(Integer.valueOf(i4));
                appCompatRadioButton.setText(A01(context, i4, true, z));
                appCompatRadioButton.setLayoutParams(new RadioGroup.LayoutParams(-1, -2));
                appCompatRadioButtonArr[i3] = appCompatRadioButton;
                radioGroup.addView(appCompatRadioButton);
                if (i4 == i) {
                    i2 = i3;
                }
            }
            i3++;
        } while (i3 < 4);
        if (i2 >= 0) {
            appCompatRadioButtonArr[i2].setChecked(true);
        }
    }

    public static boolean A04(AnonymousClass16D r4, C220412q r5, AnonymousClass3T1 r6) {
        AnonymousClass11F r3 = r6.A1J.A00;
        if ((r3 instanceof C177618e5) || AnonymousClass000.A1S(r6.A0A & 16384, 16384) || AnonymousClass000.A1S(r6.A0A & 65536, 65536)) {
            return false;
        }
        C18740tg.A06(r3);
        if (A00(r4, r5, r3) != r6.A05) {
            return true;
        }
        return false;
    }

    public static int A00(AnonymousClass16D r1, C220412q r2, AnonymousClass11F r3) {
        C80103un A0B;
        if (AnonymousClass143.A0G(r3)) {
            AnonymousClass141 A08 = r1.A08(r3);
            if (A08 != null) {
                return A08.A02;
            }
            return 0;
        } else if (!(r3 instanceof UserJid) || (A0B = r2.A0B((UserJid) r3)) == null) {
            return 0;
        } else {
            return A0B.expiration;
        }
    }
}
