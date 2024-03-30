package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.1nJ  reason: invalid class name and case insensitive filesystem */
public class C37851nJ extends ArrayAdapter {
    public List A00;
    public C18820ts A01;
    public final boolean A02;
    public final Context A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37851nJ(Context context, C18820ts r3, List list, boolean z) {
        super(context, R.layout.f9nameremoved);
        AnonymousClass00C.A0D(r3, 2);
        this.A03 = context;
        this.A01 = r3;
        this.A00 = list;
        this.A02 = z;
    }

    public int getViewTypeCount() {
        return 1;
    }

    public int getCount() {
        return this.A00.size();
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A00.get(i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        Locale locale;
        String str;
        int i3;
        int i4;
        Context context = this.A03;
        View A0K = C36381kD.A0K(LayoutInflater.from(context), R.layout.f9nameremoved);
        A0K.setId(AnonymousClass04F.A00());
        CompoundButton compoundButton = (CompoundButton) C36361kB.A0G(A0K, R.id.language_checkbox);
        TextView A0M = C36341k9.A0M(A0K, R.id.language_name);
        List list = this.A00;
        A0M.setText(((AnonymousClass3IV) list.get(i)).A00);
        TextView A0M2 = C36341k9.A0M(A0K, R.id.language_name_translated);
        boolean z = this instanceof AnonymousClass2XG;
        if (z) {
            String language = AnonymousClass3SY.A02().getLanguage();
            Iterator it = this.A00.iterator();
            i2 = 0;
            while (true) {
                if (it.hasNext()) {
                    if (AnonymousClass00C.A0J(((AnonymousClass3IV) it.next()).A01, language)) {
                        break;
                    }
                    i2++;
                } else {
                    i2 = -1;
                    break;
                }
            }
        } else {
            i2 = !this.A02;
        }
        if (i == i2) {
            A0M2.setText(R.string.f12nameremoved);
        } else {
            String str2 = ((AnonymousClass3IV) list.get(i)).A01;
            String[] strArr = C26621Kw.A04;
            String displayLanguage = Locale.forLanguageTag(str2).getDisplayLanguage(Locale.getDefault());
            if (displayLanguage.length() > str2.length() || !str2.startsWith(displayLanguage)) {
                locale = Locale.getDefault();
            } else {
                locale = AnonymousClass3SY.A02();
            }
            Locale forLanguageTag = Locale.forLanguageTag(str2);
            AnonymousClass00C.A08(forLanguageTag);
            AnonymousClass00C.A0B(locale);
            String language2 = forLanguageTag.getLanguage();
            if (language2 != null) {
                int hashCode = language2.hashCode();
                if (hashCode != 3116) {
                    if (hashCode != 3588) {
                        if (hashCode == 3886 && language2.equals("zh")) {
                            if ("HK".equals(forLanguageTag.getCountry())) {
                                i3 = R.string.f12nameremoved;
                            } else {
                                boolean equals = "Hans".equals(C26621Kw.A04(forLanguageTag));
                                i3 = R.string.f12nameremoved;
                                if (equals) {
                                    i3 = R.string.f12nameremoved;
                                }
                            }
                        }
                    } else if (language2.equals("pt")) {
                        boolean contains = AnonymousClass1MD.A01.contains(forLanguageTag.getCountry());
                        i3 = R.string.f12nameremoved;
                        if (contains) {
                            i3 = R.string.f12nameremoved;
                        }
                    }
                    str = context.getString(i3);
                    AnonymousClass00C.A0B(str);
                    String A002 = AnonymousClass3SY.A00(str);
                    A0M2.setText(A002);
                    A0M.setContentDescription(A002);
                } else if (language2.equals("am") && AnonymousClass00C.A0J(locale.getLanguage(), "om")) {
                    str = context.getString(R.string.f12nameremoved);
                    AnonymousClass00C.A08(str);
                    String A0022 = AnonymousClass3SY.A00(str);
                    A0M2.setText(A0022);
                    A0M.setContentDescription(A0022);
                }
            }
            str = Locale.forLanguageTag(str2).getDisplayLanguage(locale);
            AnonymousClass00C.A08(str);
            String A00222 = AnonymousClass3SY.A00(str);
            A0M2.setText(A00222);
            A0M.setContentDescription(A00222);
        }
        if (z) {
            i4 = ((AnonymousClass2XG) this).A00;
        } else {
            i4 = 0;
        }
        compoundButton.setChecked(AnonymousClass000.A1S(i, i4));
        C011504z.A06(A0M2, 2);
        return A0K;
    }
}
