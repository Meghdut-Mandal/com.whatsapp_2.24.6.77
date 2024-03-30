package X;

import java.util.regex.Pattern;

/* renamed from: X.AGn  reason: case insensitive filesystem */
public final class C21309AGn implements C23035B1g {
    public /* bridge */ /* synthetic */ boolean BNb(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        if (charSequence == null || charSequence.length() == 0) {
            return false;
        }
        return !C165587tf.A1a(charSequence.toString(), Pattern.compile("[=#|^]"));
    }

    public /* bridge */ /* synthetic */ CharSequence BpE(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        AnonymousClass00C.A0D(charSequence, 0);
        return charSequence;
    }
}
