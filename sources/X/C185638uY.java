package X;

import java.util.ArrayList;

/* renamed from: X.8uY  reason: invalid class name and case insensitive filesystem */
public final class C185638uY extends C592133b {
    public static final ArrayList A00 = C36351kA.A10(new String[]{"audio", "avatar_sticker", "buttons_response", "catalog", "cataloglink", "contact", "contact_array", "document", "genai_sticker", "gif", "image", "invite", "list", "list_response", "livelocation", "location", "native_flow_response", "order", "product", "productlink", "product_list", "ptt", "ptv", "sticker", "system", "unknown", "url", "vcard", "video"});

    public C185638uY(C16530pO r6, String str, byte[] bArr) {
        AnonymousClass6QB A0q = C36441kJ.A0q("raw");
        C203539oF.A0I(bArr, -9007199254740991L, 9007199254740991L);
        A0q.A01 = bArr;
        A0q.A08(str, "mediatype", A00);
        C18740tg.A0D(AnonymousClass000.A1V(r6), "Expected mixinGroup to be nonnull");
        C165597tg.A1D(A0q, r6);
        C592133b.A00(A0q, this);
    }
}
