package X;

import java.util.regex.Pattern;

/* renamed from: X.AGp  reason: case insensitive filesystem */
public final class C21311AGp implements C23035B1g {
    public static CharSequence A00(CharSequence charSequence) {
        AnonymousClass00C.A0D(charSequence, 0);
        CharSequence A0D = AnonymousClass099.A0D(charSequence);
        if (A0D.length() == 0) {
            return charSequence;
        }
        String obj = A0D.toString();
        if (!AnonymousClass098.A07(obj, "+", false)) {
            obj = AnonymousClass000.A0p("+55", obj, AnonymousClass000.A0u());
        }
        return C90464aC.A0f(C36411kG.A0y(obj, "[^\\d]"), AnonymousClass000.A0u(), obj.charAt(0));
    }

    public /* bridge */ /* synthetic */ boolean BNb(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        if (charSequence == null) {
            return false;
        }
        Pattern compile = Pattern.compile("^\\+[1-9]\\d{1,14}$");
        String obj2 = A00(charSequence).toString();
        if (AnonymousClass098.A07(obj2, "+55", false)) {
            return C165587tf.A1a(obj2, compile);
        }
        return false;
    }

    public /* bridge */ /* synthetic */ CharSequence BpE(Object obj) {
        return A00((CharSequence) obj);
    }
}
