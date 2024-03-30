package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: X.53y  reason: invalid class name */
public class AnonymousClass53y extends AnonymousClass1LZ {
    public final C19970wo A00;
    public final C19730wQ A01;

    public String A0B() {
        return "critical_block";
    }

    public String A0C() {
        return "setting_locale";
    }

    public boolean A0H() {
        return true;
    }

    public C201669k5 A0A(C202599mH r12, String str, boolean z) {
        String[] strArr = r12.A06;
        C199769fw r3 = r12.A01;
        AnonymousClass8SS r2 = r12.A03;
        if (strArr.length != 1 || !"setting_locale".equals(strArr[0]) || !C199769fw.A03.equals(r3) || r2 == null || !r2.A0u() || (r2.bitField0_ & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) == 0) {
            return null;
        }
        C99814u0 r0 = r2.localeSetting_;
        C99814u0 r1 = r0;
        if (r0 == null) {
            r0 = C99814u0.DEFAULT_INSTANCE;
        }
        if ((r0.bitField0_ & 1) == 0) {
            return null;
        }
        if (r1 == null) {
            r1 = C99814u0.DEFAULT_INSTANCE;
        }
        return new C1032154k(r12.A02, str, r1.locale_, r2.timestamp_);
    }

    public C1032154k A0I() {
        C18740tg.A0C(!this.A01.A0L());
        Locale locale = Locale.getDefault();
        String[] strArr = C26621Kw.A04;
        return new C1032154k((C201539jo) null, (String) null, locale.toLanguageTag(), C19970wo.A00(this.A00));
    }

    public AnonymousClass53y(C19730wQ r1, C19970wo r2, AnonymousClass1AC r3) {
        super(r3);
        this.A00 = r2;
        this.A01 = r1;
    }

    public List A0D(boolean z) {
        Locale locale = Locale.getDefault();
        String[] strArr = C26621Kw.A04;
        return Collections.singletonList(new C1032154k((C201539jo) null, (String) null, locale.toLanguageTag(), C19970wo.A00(this.A00)));
    }

    public /* bridge */ /* synthetic */ void A0F(C201669k5 r1) {
        A06(r1);
    }

    public /* bridge */ /* synthetic */ void A0G(C201669k5 r1, C201669k5 r2) {
        A07(r1);
    }
}
