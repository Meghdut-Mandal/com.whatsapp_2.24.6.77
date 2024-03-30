package X;

import java.util.Map;

/* renamed from: X.2uL  reason: invalid class name and case insensitive filesystem */
public abstract class C55262uL {
    public static final AnonymousClass3KJ A00(Map map) {
        CharSequence charSequence;
        CharSequence charSequence2;
        if (map == null || (charSequence = (CharSequence) map.get("btn_primary_text")) == null || charSequence.length() == 0 || (charSequence2 = (CharSequence) map.get("btn_primary_url")) == null || charSequence2.length() == 0) {
            return null;
        }
        return new AnonymousClass3KJ(map);
    }
}
