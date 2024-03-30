package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2Ku  reason: invalid class name and case insensitive filesystem */
public class C44012Ku extends C44022Kv {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public List A05;
    public List A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;

    public C44012Ku(AnonymousClass3T1 r6, String str, int i) {
        super(i, str, "interactive");
        C207219uk r4;
        String str2;
        C207149ud r0;
        String str3;
        if (r6 instanceof AnonymousClass2bZ) {
            r4 = ((AnonymousClass2bZ) r6).A00;
            if (r4 != null) {
                C206659tl r1 = r4.A03;
                if (r1 != null) {
                    this.A0B = true;
                    if (r1.A02 != null) {
                        str3 = "image";
                    } else {
                        str3 = "text";
                    }
                    this.A01 = str3;
                    this.A0C = A00(r1.A00);
                }
                this.A09 = C36421kH.A1a(r4.A09);
                this.A07 = A00(r4.A09);
                this.A0A = C36421kH.A1a(r4.A0A);
                this.A08 = A00(r4.A0A);
            }
        } else {
            r4 = null;
        }
        if (r6 instanceof AnonymousClass2cU) {
            this.A00 = C44022Kv.A01(((AnonymousClass2cU) r6).A00);
        }
        if ((r6 instanceof AnonymousClass2cT) && (r0 = ((AnonymousClass2cT) r6).A00) != null) {
            this.A03 = C44022Kv.A01(r0.A03);
        }
        if (C61583Cq.A00(r6) != null) {
            List<AnonymousClass3EY> list = C61583Cq.A00(r6).A02;
            boolean z = false;
            this.A09 = AnonymousClass000.A1V(C61583Cq.A00(r6).A00);
            this.A07 = A00(C61583Cq.A00(r6).A00);
            this.A0A = C61583Cq.A00(r6).A01 != null ? true : z;
            this.A08 = A00(C61583Cq.A00(r6).A01);
            if (!list.isEmpty()) {
                this.A05 = AnonymousClass001.A0I();
                for (AnonymousClass3EY r02 : list) {
                    this.A05.add(C44022Kv.A01(r02.A04));
                }
            }
        }
        int i2 = r6.A1I;
        if (i2 == 0 || i2 == 1) {
            if (C61583Cq.A00(r6) != null) {
                str2 = "button";
            } else {
                AnonymousClass3T1 A0S = r6.A0S();
                if (A0S == null || A0S.A1I != 54) {
                    str2 = "unsupported";
                }
            }
            this.A02 = str2;
        }
        if (i2 == 23) {
            str2 = "product";
        } else if (i2 == 49) {
            str2 = "button_reply";
        } else if (i2 == 52) {
            str2 = "product_list";
        } else if (i2 == 54) {
            str2 = "order_details";
        } else if (i2 == 45) {
            this.A02 = "list";
            if (r4 != null && !r4.A0C.isEmpty()) {
                this.A06 = AnonymousClass001.A0I();
                for (C206689to r03 : r4.A0C) {
                    List<C206729ts> list2 = r03.A02;
                    if (!list2.isEmpty()) {
                        ArrayList A0I = AnonymousClass001.A0I();
                        for (C206729ts r04 : list2) {
                            String A012 = C44022Kv.A01(r04.A02);
                            if (A012 != null) {
                                A0I.add(A012);
                            }
                        }
                        this.A06.add(A0I);
                    }
                }
                return;
            }
            return;
        } else if (i2 != 46) {
            str2 = "unsupported";
            if (!(r4 == null || r4.A00 != 5 || r4.A02() == null)) {
                r4.A02();
                String A022 = r4.A02();
                if (A022.equals("address_message")) {
                    str2 = "address_message";
                } else if (A022.equals("review_order")) {
                    String A032 = r4.A03();
                    if (!TextUtils.isEmpty(A032)) {
                        this.A04 = C202869mo.A02(A032);
                    }
                }
            }
        } else {
            str2 = "list_reply";
        }
        this.A02 = str2;
        str2 = "order_status";
        this.A02 = str2;
    }

    public static boolean A00(String str) {
        if (str == null) {
            return false;
        }
        return Pattern.compile("https?://\\S+").matcher(str).find();
    }

    public boolean A04(String str) {
        try {
            super.A04(str);
            JSONObject A1C = C36441kJ.A1C(str);
            this.A02 = A1C.optString("interactive_type", "unknown");
            boolean optBoolean = A1C.optBoolean("has_header");
            this.A0B = optBoolean;
            if (optBoolean) {
                this.A01 = A1C.optString("header_type", "unknown");
                this.A0C = A1C.optBoolean("header_contains_url");
            }
            this.A09 = A1C.optBoolean("has_body");
            this.A07 = A1C.optBoolean("body_contains_url");
            this.A0A = A1C.optBoolean("has_footer");
            this.A08 = A1C.optBoolean("footer_contains_url");
            JSONArray optJSONArray = A1C.optJSONArray("button_id_hashes");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                this.A05 = AnonymousClass001.A0I();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    this.A05.add(optJSONArray.get(i).toString());
                }
            }
            JSONArray optJSONArray2 = A1C.optJSONArray("row_id_hashes");
            if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                this.A06 = AnonymousClass001.A0I();
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    JSONArray jSONArray = (JSONArray) optJSONArray2.get(i2);
                    ArrayList A0I = AnonymousClass001.A0I();
                    for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                        A0I.add(jSONArray.get(i3).toString());
                    }
                    this.A06.add(A0I);
                }
            }
            if (A1C.has("list_reply_id_hash")) {
                this.A03 = A1C.optString("list_reply_id_hash");
            }
            if (A1C.has("button_reply_id_hash")) {
                this.A00 = A1C.optString("button_reply_id_hash");
            }
            if (!A1C.has("order_status")) {
                return true;
            }
            this.A04 = A1C.getString("order_status");
            return true;
        } catch (JSONException e) {
            Log.w("ConversationSketchInteractiveEvent: fromJsonString threw: ", e);
            return false;
        }
    }

    public C44012Ku() {
        super(-1, "unknown", "interactive");
        this.A02 = "unknown";
    }
}
