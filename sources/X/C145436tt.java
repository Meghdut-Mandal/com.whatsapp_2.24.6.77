package X;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.PrivateKey;
import java.util.EnumMap;
import java.util.List;
import java.util.NoSuchElementException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.6tt  reason: invalid class name and case insensitive filesystem */
public final class C145436tt implements C160047kN {
    public final /* synthetic */ AnonymousClass6OQ A00;
    public final /* synthetic */ C128936Ee A01;
    public final /* synthetic */ C160227kf A02;
    public final /* synthetic */ C120435rV A03;
    public final /* synthetic */ AnonymousClass64P A04;
    public final /* synthetic */ AnonymousClass6PT A05;
    public final /* synthetic */ PrivateKey A06;

    public void BWj(AnonymousClass5V6 r9) {
        AnonymousClass00C.A0D(r9, 0);
        AnonymousClass6PT r6 = this.A05;
        AnonymousClass6OQ r1 = this.A00;
        C160227kf r4 = this.A02;
        AnonymousClass6PT.A00(r1, this.A01, r9.node, r4, this.A04, r6, AnonymousClass3ME.A00(r9.node));
    }

    public C145436tt(AnonymousClass6OQ r1, C128936Ee r2, C160227kf r3, C120435rV r4, AnonymousClass64P r5, AnonymousClass6PT r6, PrivateKey privateKey) {
        this.A05 = r6;
        this.A06 = privateKey;
        this.A03 = r4;
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
        this.A04 = r5;
    }

    public void BVK() {
        this.A02.BVK();
    }

    public void BiS(C122515uy r19, Integer num) {
        Object obj;
        Throwable jSONException;
        List list;
        try {
            AnonymousClass6PT r5 = this.A05;
            JSONObject A022 = C130936Na.A02(r19, r5.A01, this.A06);
            if (A022.has("data")) {
                JSONObject A0y = C90484aE.A0y("data", A022);
                C120435rV r0 = this.A03;
                C160227kf r8 = r0.A00;
                AnonymousClass6PT r1 = r0.A01;
                if (r1 instanceof AnonymousClass5PF) {
                    JSONArray jSONArray = A0y.getJSONArray("waffle_ialsv");
                    int length = jSONArray.length();
                    int i = 0;
                    boolean z = false;
                    for (int i2 = 0; i2 < length; i2++) {
                        if (jSONArray.getJSONObject(i2).getBoolean("is_valid")) {
                            z = true;
                        }
                    }
                    EnumMap enumMap = new EnumMap(C108475Tq.class);
                    Integer num2 = num;
                    if (!z) {
                        obj = new C128236Bl(num2, enumMap, false);
                    } else {
                        JSONArray jSONArray2 = A0y.getJSONArray("waffle_xr");
                        int length2 = jSONArray2.length();
                        while (i < length2) {
                            JSONObject jSONObject = jSONArray2.getJSONObject(i);
                            AnonymousClass00C.A08(jSONObject);
                            long j = jSONObject.getLong("waffle_unique_id");
                            int i3 = jSONObject.getInt("response_code");
                            String A0e = C90474aD.A0e("waffle_da", jSONObject);
                            if ("story".equalsIgnoreCase(C90474aD.A0e("waffle_ds", jSONObject))) {
                                C108475Tq[] values = C108475Tq.values();
                                int length3 = values.length;
                                int i4 = 0;
                                while (i4 < length3) {
                                    C108475Tq r14 = values[i4];
                                    if (AnonymousClass00C.A0J(r14.iqValue, A0e)) {
                                        C128226Bk r11 = (C128226Bk) enumMap.get(r14);
                                        if (r11 == null) {
                                            r11 = new C128226Bk(AnonymousClass001.A0I(), AnonymousClass001.A0I(), AnonymousClass001.A0I());
                                            enumMap.put(r14, r11);
                                        }
                                        if (i3 != 0) {
                                            if (i3 != 1) {
                                                if (i3 == 2) {
                                                    list = r11.A00;
                                                    list.add(Long.valueOf(j));
                                                    i++;
                                                } else if (i3 != 3) {
                                                    if (i3 != 4) {
                                                        i++;
                                                    }
                                                }
                                            }
                                            list = r11.A01;
                                            list.add(Long.valueOf(j));
                                            i++;
                                        }
                                        list = r11.A02;
                                        list.add(Long.valueOf(j));
                                        i++;
                                    } else {
                                        i4++;
                                    }
                                }
                                jSONException = new NoSuchElementException("Array contains no element matching the predicate.");
                            } else {
                                jSONException = new JSONException("Error: unexpected response");
                            }
                            throw jSONException;
                        }
                        obj = new C128236Bl(num2, enumMap, true);
                    }
                } else {
                    obj = A0y;
                    if (!(r1 instanceof AnonymousClass5PD)) {
                        if (r1 instanceof AnonymousClass5PE) {
                            obj = Boolean.valueOf(A0y.optBoolean("success", false));
                        } else {
                            obj = new C120395rR(new C135086c7(new C146366vU(), String.class, A0y.optString("bloks_passthrough_params", ""), "WafflePostLinkResponse"), A0y.optBoolean("success", false));
                        }
                    }
                }
                r8.onSuccess(obj);
            } else if (A022.has("error")) {
                int optInt = C90484aE.A0y("error", A022).optInt("code", -1);
                AnonymousClass6PT.A00(this.A00, this.A01, (C203399nx) null, this.A02, this.A04, r5, optInt);
            }
        } catch (GeneralSecurityException e) {
            this.A02.BWl(e, (Integer) null);
        } catch (UnsupportedEncodingException e2) {
            this.A02.BWl(e2, (Integer) null);
        } catch (JSONException e3) {
            this.A02.BWl(e3, (Integer) null);
        }
    }
}
