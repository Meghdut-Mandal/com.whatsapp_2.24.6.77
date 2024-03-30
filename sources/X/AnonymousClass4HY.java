package X;

import android.os.Bundle;

/* renamed from: X.4HY  reason: invalid class name */
public final class AnonymousClass4HY extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ Enum $default;
    public final /* synthetic */ String $key = "SOURCE_KEY";
    public final /* synthetic */ AnonymousClass02E $this_enumArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4HY(AnonymousClass02E r2, Enum enumR) {
        super(0);
        this.$this_enumArg = r2;
        this.$default = enumR;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String string;
        Object obj;
        Bundle bundle = this.$this_enumArg.A0A;
        if (!(bundle == null || (string = bundle.getString(this.$key)) == null)) {
            try {
                obj = Enum.valueOf(C51282nZ.class, string);
            } catch (Throwable th) {
                obj = new AnonymousClass03N(th);
            }
            if (obj instanceof AnonymousClass03N) {
                obj = null;
            }
            if (obj != null) {
                return obj;
            }
        }
        return this.$default;
    }
}
