package X;

import java.util.Objects;

/* renamed from: X.96W  reason: invalid class name */
public abstract /* synthetic */ class AnonymousClass96W {
    public static /* synthetic */ String A00(CharSequence[] charSequenceArr) {
        Objects.requireNonNull(", ", "delimiter");
        StringBuilder A0u = AnonymousClass000.A0u();
        int length = charSequenceArr.length;
        A0u.append(charSequenceArr[0]);
        for (int i = 1; i < length; i++) {
            A0u.append(", ");
            A0u.append(charSequenceArr[i]);
        }
        return A0u.toString();
    }
}
