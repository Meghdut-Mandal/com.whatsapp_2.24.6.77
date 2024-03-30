package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMutationResponseFragmentImpl;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2PictureType;
import java.lang.reflect.InvocationTargetException;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.9Y8  reason: invalid class name */
public abstract class AnonymousClass9Y8 {
    public final JSONObject A00;

    public static GraphQLXWA2PictureType A01(AnonymousClass9Y8 r2) {
        return (GraphQLXWA2PictureType) r2.A06(GraphQLXWA2PictureType.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
    }

    public static String A02(AnonymousClass9Y8 r1) {
        return r1.A07(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
    }

    public final AnonymousClass9Y8 A03(Class cls, String str) {
        JSONObject optJSONObject = this.A00.optJSONObject(str);
        if (optJSONObject == null) {
            return null;
        }
        try {
            return (AnonymousClass9Y8) cls.getConstructor(new Class[]{JSONObject.class}).newInstance(new Object[]{optJSONObject});
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[ExcHandler: IllegalAccessException | NoSuchMethodException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:4:0x000b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C23931Ak A04(java.lang.Class r10, java.lang.String r11) {
        /*
            r9 = this;
            org.json.JSONObject r0 = r9.A00
            org.json.JSONArray r8 = r0.optJSONArray(r11)
            r7 = 0
            if (r8 != 0) goto L_0x000a
            return r7
        L_0x000a:
            r6 = 1
            java.lang.Class[] r1 = new java.lang.Class[r6]     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x003b }
            java.lang.Class<org.json.JSONObject> r0 = org.json.JSONObject.class
            r5 = 0
            r1[r5] = r0     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x003b }
            java.lang.reflect.Constructor r4 = r10.getConstructor(r1)     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x003b }
            X.8Hc r3 = new X.8Hc     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x003b }
            r3.<init>()     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x003b }
            r2 = 0
        L_0x001c:
            int r0 = r8.length()     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x003b }
            if (r2 >= r0) goto L_0x0036
            org.json.JSONObject r1 = r8.optJSONObject(r2)     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x003b }
            if (r1 == 0) goto L_0x0033
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ InstantiationException | InvocationTargetException -> 0x0033, IllegalAccessException | NoSuchMethodException -> 0x003b }
            r0[r5] = r1     // Catch:{ InstantiationException | InvocationTargetException -> 0x0033, IllegalAccessException | NoSuchMethodException -> 0x003b }
            java.lang.Object r0 = r4.newInstance(r0)     // Catch:{ InstantiationException | InvocationTargetException -> 0x0033, IllegalAccessException | NoSuchMethodException -> 0x003b }
            r3.add((java.lang.Object) r0)     // Catch:{ InstantiationException | InvocationTargetException -> 0x0033, IllegalAccessException | NoSuchMethodException -> 0x003b }
        L_0x0033:
            int r2 = r2 + 1
            goto L_0x001c
        L_0x0036:
            X.1Ak r0 = r3.build()     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x003b }
            return r0
        L_0x003b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9Y8.A04(java.lang.Class, java.lang.String):X.1Ak");
    }

    public final C23931Ak A05(String str) {
        JSONArray optJSONArray = this.A00.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        AnonymousClass8Hc r2 = new AnonymousClass8Hc();
        for (int i = 0; i < optJSONArray.length(); i++) {
            r2.add((Object) optJSONArray.optString(i));
        }
        return r2.build();
    }

    public final Enum A06(Enum enumR, String str) {
        String optString = this.A00.optString(str);
        if (optString == null) {
            return enumR;
        }
        try {
            return Enum.valueOf(enumR.getClass(), C165617ti.A0Z(optString));
        } catch (IllegalArgumentException unused) {
            return enumR;
        }
    }

    public final String A07(String str) {
        JSONObject jSONObject = this.A00;
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str);
    }

    public AnonymousClass9Y8(JSONObject jSONObject) {
        this.A00 = jSONObject;
    }

    public static NewsletterMutationResponseFragmentImpl A00(AnonymousClass9Y8 r0, Class cls, String str) {
        AnonymousClass9Y8 A03 = r0.A03(cls, str);
        if (A03 != null) {
            return new NewsletterMutationResponseFragmentImpl(A03.A00);
        }
        return null;
    }
}
