package X;

import com.whatsapp.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3S2  reason: invalid class name */
public class AnonymousClass3S2 {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final AnonymousClass1XQ[] A0D;

    public static AnonymousClass3S2 A01(byte[] bArr) {
        String str;
        if (bArr != null) {
            try {
                return A00(C36441kJ.A1C(new String(bArr, C19430v1.A0B)));
            } catch (JSONException unused) {
                str = "StickerMetadata/createFromWebpMetadata invalid metadata";
                Log.e(str);
                return null;
            } catch (UnsupportedEncodingException unused2) {
                str = "StickerMetadata/createFromWebpMetadata invalid metadata encoding";
                Log.e(str);
                return null;
            }
        }
        return null;
    }

    public String toString() {
        String obj;
        StringBuffer stringBuffer = new StringBuffer("StickerMetadata{");
        stringBuffer.append("emojis=");
        AnonymousClass1XQ[] r0 = this.A0D;
        if (r0 == null) {
            obj = "null";
        } else {
            obj = Arrays.asList(r0).toString();
        }
        stringBuffer.append(obj);
        stringBuffer.append(", isFirstPartySticker=");
        stringBuffer.append(this.A0B);
        stringBuffer.append(", isFromStickerMaker=");
        stringBuffer.append(this.A0C);
        stringBuffer.append(", isAvatarSticker=");
        stringBuffer.append(this.A0A);
        stringBuffer.append(", avatarStickerTemplateId=");
        stringBuffer.append(this.A01);
        stringBuffer.append(", isAiSticker=");
        stringBuffer.append(this.A07);
        stringBuffer.append(", isAvatarCountrySticker=");
        stringBuffer.append(this.A08);
        stringBuffer.append(", stickerMakerSourceType=");
        stringBuffer.append(this.A00);
        stringBuffer.append(", isSocialSticker=");
        stringBuffer.append(this.A09);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    public AnonymousClass3S2(String str, String str2, String str3, String str4, String str5, String str6, AnonymousClass1XQ[] r7, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A0D = r7;
        this.A03 = str;
        this.A04 = str2;
        this.A06 = str3;
        this.A02 = str5;
        this.A05 = str4;
        this.A0A = z3;
        this.A01 = str6;
        this.A0C = z2;
        this.A0B = z;
        this.A07 = z4;
        this.A08 = z5;
        this.A00 = i;
        this.A09 = z6;
    }

    public static AnonymousClass3S2 A00(JSONObject jSONObject) {
        String str;
        AnonymousClass1XQ[] r15;
        Object opt;
        ArrayList A0I = AnonymousClass001.A0I();
        JSONObject jSONObject2 = jSONObject;
        if (jSONObject2.has("emojis") && (opt = jSONObject2.opt("emojis")) != null) {
            if (opt instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) opt;
                for (int i = 0; i < jSONArray.length(); i++) {
                    String optString = jSONArray.optString(i, (String) null);
                    if (optString != null) {
                        A0I.add(C63873Lt.A00(optString));
                    }
                }
            } else if (opt instanceof String) {
                String str2 = (String) opt;
                int length = str2.length();
                if (length > 2) {
                    for (String str3 : str2.substring(1, length - 1).split(",")) {
                        if (str3 != null) {
                            A0I.add(C63873Lt.A00(str3));
                        }
                    }
                }
            } else {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("StickerMetadata/createFromWebpMetadata unrecognizable type of emoji metadata:");
                C36351kA.A1L(opt.getClass(), A0u);
            }
        }
        if (jSONObject2.has("sticker-pack-id")) {
            str = jSONObject2.optString("sticker-pack-id", (String) null);
        } else {
            str = null;
        }
        if (!A0I.isEmpty()) {
            r15 = (AnonymousClass1XQ[]) A0I.toArray(new AnonymousClass1XQ[0]);
        } else {
            r15 = null;
        }
        return new AnonymousClass3S2(str, jSONObject2.optString("sticker-pack-name", (String) null), jSONObject2.optString("sticker-pack-publisher", (String) null), jSONObject2.optString("android-app-store-link", (String) null), jSONObject2.optString("ios-app-store-link", (String) null), jSONObject2.optString("avatar-sticker-template-id", (String) null), r15, jSONObject2.optInt("sticker-maker-source-type", 0), AnonymousClass000.A1S(jSONObject2.optInt("is-first-party-sticker", 0), 1), AnonymousClass000.A1S(jSONObject2.optInt("is-from-sticker-maker", 0), 1), AnonymousClass000.A1S(jSONObject2.optInt("is-avatar-sticker", 0), 1), AnonymousClass000.A1S(jSONObject2.optInt("is-ai-sticker", 0), 1), AnonymousClass000.A1S(jSONObject2.optInt("is-avatar-country-sticker", 0), 1), AnonymousClass000.A1S(jSONObject2.optInt("is-social-sticker", 0), 1));
    }

    public byte[] A02() {
        JSONObject A1B = C36441kJ.A1B();
        try {
            A1B.put("sticker-pack-id", this.A03);
            A1B.put("sticker-pack-name", this.A04);
            A1B.put("sticker-pack-publisher", this.A06);
            String str = this.A05;
            if (str != null) {
                A1B.put("android-app-store-link", str);
            }
            String str2 = this.A02;
            if (str2 != null) {
                A1B.put("ios-app-store-link", str2);
            }
            AnonymousClass1XQ[] r5 = this.A0D;
            if (r5 != null) {
                ArrayList A14 = C36441kJ.A14(r4);
                for (AnonymousClass1XQ obj : r5) {
                    A14.add(obj.toString());
                }
                A1B.put("emojis", new JSONArray(A14));
            }
            if (this.A0B) {
                A1B.put("is-first-party-sticker", 1);
            }
            if (this.A0C) {
                A1B.put("is-from-sticker-maker", 1);
            }
            if (this.A0A) {
                A1B.put("is-avatar-sticker", 1);
            }
            String str3 = this.A01;
            if (str3 != null) {
                A1B.put("avatar-sticker-template-id", str3);
            }
            if (this.A07) {
                A1B.put("is-ai-sticker", 1);
            }
            if (this.A08) {
                A1B.put("is-avatar-country-sticker", 1);
            }
            int i = this.A00;
            if (i != 0) {
                A1B.put("sticker-maker-source-type", i);
            }
            if (this.A09) {
                A1B.put("is-social-sticker", 1);
            }
            return A1B.toString().getBytes();
        } catch (JSONException e) {
            Log.e("StickerMetadata/convertToBytes error during JSON conversion", e);
            return null;
        }
    }
}
