package X;

import org.json.JSONObject;

/* renamed from: X.2Ua  reason: invalid class name */
public final class AnonymousClass2Ua extends C1257160z {
    public void A03(JSONObject jSONObject, long j) {
        AnonymousClass35T r4;
        AnonymousClass00C.A0D(jSONObject, 0);
        JSONObject jSONObject2 = jSONObject.getJSONObject("whatsapp_biz_integrity_p2b_report");
        String optString = jSONObject2.optString("status");
        AnonymousClass00C.A0B(optString);
        if (!AnonymousClass000.A1Q(optString.length()) && !"INVALID".equals(optString) && !"NOT_FOUND".equals(optString)) {
            if ("PENDING".equals(optString)) {
                r4 = new AnonymousClass35T((AnonymousClass3AL) null, "PENDING");
            } else {
                JSONObject optJSONObject = jSONObject2.optJSONObject("detail");
                if (optJSONObject != null) {
                    String optString2 = optJSONObject.optString("report_url");
                    String optString3 = optJSONObject.optString("file_name");
                    String optString4 = optJSONObject.optString("media_key");
                    String optString5 = optJSONObject.optString("file_sha256");
                    String optString6 = optJSONObject.optString("encrypted_file_sha256");
                    String optString7 = optJSONObject.optString("direct_path");
                    int optInt = optJSONObject.optInt("file_size_bytes");
                    AnonymousClass00C.A0B(optString2);
                    if (optString2.length() != 0) {
                        AnonymousClass00C.A0B(optString3);
                        if (optString3.length() != 0) {
                            AnonymousClass00C.A0B(optString4);
                            if (optString4.length() != 0) {
                                AnonymousClass00C.A0B(optString5);
                                if (optString5.length() != 0) {
                                    AnonymousClass00C.A0B(optString6);
                                    if (optString6.length() != 0) {
                                        AnonymousClass00C.A0B(optString7);
                                        if (optString7.length() != 0) {
                                            r4 = new AnonymousClass35T(new AnonymousClass3AL(optString2, optString3, optString4, optInt, optString5, optString6, optString7), "AVAILABLE");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            this.A00 = r4;
        }
        r4 = new AnonymousClass35T((AnonymousClass3AL) null, "INVALID");
        this.A00 = r4;
    }
}
