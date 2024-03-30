package X;

import java.security.AccessController;
import java.security.Provider;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.11n  reason: invalid class name */
public final class AnonymousClass11n extends Provider implements AnonymousClass11m {
    public static final Map A00 = new HashMap();
    public static final AnonymousClass11o A01 = new AnonymousClass11o();
    public static final String[] A02 = {"MD5", "SHA1", "SHA256", "SHA384"};
    public static final String[] A03 = {"AES", "XSalsa20"};
    public static final String[] A04 = {"PBEPBKDF2"};

    public AnonymousClass11n() {
        super("SC", 1.68d, "SpongyCastle Security Provider v1.68");
        AccessController.doPrivileged(new AnonymousClass11s(this));
    }

    public static void A00(String str, AnonymousClass11n r5, String[] strArr) {
        for (int i = 0; i != strArr.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(strArr[i]);
            sb.append("$Mappings");
            Class A002 = AnonymousClass11t.A00(sb.toString(), AnonymousClass11n.class);
            if (A002 != null) {
                try {
                    ((AnonymousClass11u) A002.newInstance()).A02(r5);
                } catch (Exception e) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("cannot create instance of ");
                    sb2.append(str);
                    sb2.append(strArr[i]);
                    sb2.append("$Mappings : ");
                    sb2.append(e);
                    throw new InternalError(sb2.toString());
                }
            }
        }
    }

    public void B0F(String str, String str2) {
        if (!containsKey(str)) {
            put(str, str2);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("duplicate provider key (");
        sb.append(str);
        sb.append(") found");
        throw new IllegalStateException(sb.toString());
    }

    public void B0G(String str, String str2, AnonymousClass122 r5) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".");
        sb.append(r5);
        B0F(sb.toString(), str2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(".OID.");
        sb2.append(r5);
        B0F(sb2.toString(), str2);
    }

    public void B0H(String str, Map map) {
        for (String str2 : map.keySet()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" ");
            sb.append(str2);
            String obj = sb.toString();
            if (!containsKey(obj)) {
                put(obj, map.get(str2));
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("duplicate provider attribute key (");
                sb2.append(obj);
                sb2.append(") found");
                throw new IllegalStateException(sb2.toString());
            }
        }
    }
}
