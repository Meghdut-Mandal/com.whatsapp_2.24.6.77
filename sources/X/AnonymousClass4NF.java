package X;

import android.util.Patterns;

/* renamed from: X.4NF  reason: invalid class name */
public final class AnonymousClass4NF extends AnonymousClass00R implements C006302t {
    public static final AnonymousClass4NF A00 = new AnonymousClass4NF();

    public AnonymousClass4NF() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        boolean z = false;
        if (!(charSequence == null || charSequence.length() == 0 || !C36361kB.A1Z(charSequence, Patterns.EMAIL_ADDRESS))) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
