package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1IA  reason: invalid class name */
public final class AnonymousClass1IA implements AnonymousClass1I9 {
    public /* bridge */ /* synthetic */ Object B7h(String str) {
        AnonymousClass00C.A0D(str, 0);
        try {
            return AnonymousClass96R.A00(new JSONObject(str));
        } catch (JSONException e) {
            throw new AnonymousClass1ID("CTWA: AdsEntryPointTransformer/fromData/JSONException", e);
        } catch (C19740wR e2) {
            throw new AnonymousClass1ID("CTWA: AdsEntryPointTransformer/fromData/InvalidJidException", e2);
        } catch (IllegalArgumentException e3) {
            throw new AnonymousClass1ID("CTWA: AdsEntryPointTransformer/fromData/IllegalArgumentException", e3);
        }
    }

    public /* bridge */ /* synthetic */ String Bvg(Object obj) {
        C175418aS r4 = (C175418aS) obj;
        AnonymousClass00C.A0D(r4, 0);
        try {
            String obj2 = r4.A02().toString();
            AnonymousClass00C.A08(obj2);
            return obj2;
        } catch (JSONException e) {
            throw new AnonymousClass1ID("CTWA: AdsEntryPointTransformer/toData/JSONException", e);
        }
    }
}
