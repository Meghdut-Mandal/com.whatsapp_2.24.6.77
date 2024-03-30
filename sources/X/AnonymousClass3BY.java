package X;

import com.whatsapp.util.Log;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3BY  reason: invalid class name */
public abstract class AnonymousClass3BY {
    public static JSONObject A02(C44022Kv r3) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("seq_id", r3.A00);
        jSONObject.put("event_type", r3.A01);
        jSONObject.put("message_type", r3.A02);
        return jSONObject;
    }

    public JSONObject A03() {
        String str;
        String str2;
        if (this instanceof C43952Ko) {
            C43952Ko r0 = (C43952Ko) this;
            try {
                JSONObject A1B = C36441kJ.A1B();
                JSONArray jSONArray = new JSONArray();
                for (Object put : r0.A00) {
                    jSONArray.put(put);
                }
                A1B.put("merchant_list", jSONArray);
                return A1B;
            } catch (JSONException e) {
                Log.e("ConversationSketchMerchantJIDKeyList: toJsonString threw: ", e);
                return null;
            }
        } else if (this instanceof C44022Kv) {
            C44022Kv r3 = (C44022Kv) this;
            if (r3 instanceof C43992Ks) {
                C43992Ks r32 = (C43992Ks) r3;
                try {
                    JSONObject A02 = A02(r32);
                    A02.put("contains_url", r32.A00);
                    return A02;
                } catch (JSONException e2) {
                    e = e2;
                    str = "ConversationSketchTextEvent: toJson threw: ";
                    Log.w(str, e);
                    return null;
                }
            } else if (r3 instanceof C44012Ku) {
                C44012Ku r33 = (C44012Ku) r3;
                try {
                    JSONObject A022 = A02(r33);
                    A022.put("interactive_type", r33.A02);
                    A022.put("has_header", r33.A0B);
                    if (r33.A0B) {
                        A022.put("header_type", r33.A01);
                        A022.put("header_contains_url", r33.A0C);
                    }
                    A022.put("has_body", r33.A09);
                    if (r33.A09) {
                        A022.put("body_contains_url", r33.A07);
                    }
                    A022.put("has_footer", r33.A0A);
                    if (r33.A0A) {
                        A022.put("footer_contains_url", r33.A08);
                    }
                    List list = r33.A05;
                    if (list != null && list.size() > 0) {
                        JSONArray jSONArray2 = new JSONArray();
                        for (Object put2 : r33.A05) {
                            jSONArray2.put(put2);
                        }
                        A022.put("button_id_hashes", jSONArray2);
                    }
                    List list2 = r33.A06;
                    if (list2 != null && list2.size() > 0) {
                        JSONArray jSONArray3 = new JSONArray();
                        for (List<Object> it : r33.A06) {
                            JSONArray jSONArray4 = new JSONArray();
                            for (Object put3 : it) {
                                jSONArray4.put(put3);
                            }
                            jSONArray3.put(jSONArray4);
                        }
                        A022.put("row_id_hashes", jSONArray3);
                    }
                    String str3 = r33.A03;
                    if (str3 != null) {
                        A022.put("list_reply_id_hash", str3);
                    }
                    String str4 = r33.A00;
                    if (str4 != null) {
                        A022.put("button_reply_id_hash", str4);
                    }
                    String str5 = r33.A04;
                    if (str5 == null) {
                        return A022;
                    }
                    A022.put("order_status", str5);
                    return A022;
                } catch (JSONException e3) {
                    e = e3;
                    str = "ConversationSketchInteractiveEvent: toJson threw: ";
                    Log.w(str, e);
                    return null;
                }
            } else if (r3 instanceof C44002Kt) {
                C44002Kt r34 = (C44002Kt) r3;
                try {
                    JSONObject A023 = A02(r34);
                    String str6 = r34.A01;
                    if (str6 != null) {
                        A023.put("header_type", str6);
                    }
                    String str7 = r34.A02;
                    if (str7 != null) {
                        A023.put("template_id_hash", str7);
                    }
                    List list3 = r34.A03;
                    if (list3 != null && list3.size() > 0) {
                        JSONArray jSONArray5 = new JSONArray();
                        for (Object put4 : r34.A03) {
                            jSONArray5.put(put4);
                        }
                        A023.put("button_id_hashes", jSONArray5);
                    }
                    String str8 = r34.A00;
                    if (str8 == null) {
                        return A023;
                    }
                    A023.put("template_button_reply_selected_id_hash", str8);
                    return A023;
                } catch (JSONException e4) {
                    e = e4;
                    str = "ConversationSketchHSMEvent: toJson threw: ";
                    Log.w(str, e);
                    return null;
                }
            } else {
                try {
                    return A02(r3);
                } catch (JSONException e5) {
                    e = e5;
                    str = "ConversationSketchEvent: toJson threw: ";
                    Log.w(str, e);
                    return null;
                }
            }
        } else if (this instanceof C43962Kp) {
            C43962Kp r35 = (C43962Kp) this;
            try {
                JSONObject A1B2 = C36441kJ.A1B();
                C43972Kq r02 = r35.A00;
                if (r02 != null) {
                    A1B2.put("current_conversation", r02.A03());
                }
                JSONArray jSONArray6 = new JSONArray();
                for (AnonymousClass3BY A03 : r35.A01) {
                    jSONArray6.put(A03.A03());
                }
                A1B2.put("completed_conversations", jSONArray6);
                return A1B2;
            } catch (JSONException e6) {
                e = e6;
                str = "ConversationSketchConversationMerchantList: toJsonString threw: ";
                Log.w(str, e);
                return null;
            }
        } else {
            C43972Kq r4 = (C43972Kq) this;
            try {
                JSONObject A1B3 = C36441kJ.A1B();
                A1B3.put("start_ts", r4.A00);
                A1B3.put("conversation_id", r4.A02);
                A1B3.put("business_jid", r4.A03);
                A1B3.put("msgs_skipped_count", r4.A01);
                JSONArray jSONArray7 = new JSONArray();
                for (AnonymousClass3BY A032 : r4.A04) {
                    JSONObject A033 = A032.A03();
                    if (A033 == null) {
                        str2 = null;
                    } else {
                        str2 = A033.toString();
                    }
                    jSONArray7.put(str2);
                }
                A1B3.put("msg_events", jSONArray7);
                return A1B3;
            } catch (JSONException e7) {
                Log.w("ConversationSketchConversation: toJsonString threw: ", e7);
                return null;
            }
        }
    }
}
