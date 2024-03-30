package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.8gv  reason: invalid class name and case insensitive filesystem */
public final class C178678gv extends AnonymousClass6F2 {
    public C159627jf A00;
    public final C19970wo A01;
    public final AnonymousClass1VZ A02;
    public final AnonymousClass16S A03;
    public final C29121Vk A04;
    public final AnonymousClass9F9 A05;
    public final C29551Xb A06;
    public final C19770wU A07;
    public final AnonymousClass004 A08;

    public void A07(C128786Dp r25, C159627jf r26, AnonymousClass6PH r27, Map map) {
        AnonymousClass3T1 r18;
        String str;
        C128786Dp r4 = r25;
        C159627jf r3 = r26;
        Map map2 = map;
        C36321k7.A16(map2, r4, r3, 0);
        this.A00 = r3;
        Object obj = map2.get("is_wa_pay");
        if (obj == null || !(obj instanceof Boolean)) {
            obj = null;
            StringBuilder A0v = AnonymousClass000.A0v("is_wa_pay");
            A0v.append(" is null or not a ");
            A00(r3, this, Boolean.class, A0v);
        }
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            return;
        }
        if (bool.booleanValue()) {
            String str2 = r4.A04;
            C175928bI r42 = new C175928bI();
            C159627jf r2 = this.A00;
            if (r2 == null) {
                throw C36331k8.A0d("resourceResultCallback");
            }
            Object obj2 = map2.get("sender");
            if (obj2 == null || !(obj2 instanceof Map)) {
                A00(r2, this, Map.class, C36331k8.A0k("sender", " is null or not a "));
                obj2 = null;
            }
            Map map3 = (Map) obj2;
            if (map3 != null) {
                C159627jf r22 = this.A00;
                if (r22 == null) {
                    throw C36331k8.A0d("resourceResultCallback");
                }
                Object obj3 = map2.get("recipient");
                if (obj3 == null || !(obj3 instanceof Map)) {
                    A00(r22, this, Map.class, C36331k8.A0k("recipient", " is null or not a "));
                    obj3 = null;
                }
                Map map4 = (Map) obj3;
                if (map4 != null) {
                    C159627jf r23 = this.A00;
                    if (r23 == null) {
                        throw C36331k8.A0d("resourceResultCallback");
                    }
                    Object obj4 = map2.get("device_id");
                    if (obj4 == null || !(obj4 instanceof String)) {
                        A00(r23, this, String.class, C36331k8.A0k("device_id", " is null or not a "));
                        obj4 = null;
                    }
                    String str3 = (String) obj4;
                    if (str3 != null) {
                        r42.A0J = str3;
                        C159627jf r24 = this.A00;
                        if (r24 == null) {
                            throw C36331k8.A0d("resourceResultCallback");
                        }
                        Object obj5 = map4.get("mcc");
                        if (obj5 == null || !(obj5 instanceof String)) {
                            A00(r24, this, String.class, C36331k8.A0k("mcc", " is null or not a "));
                            obj5 = null;
                        }
                        String str4 = (String) obj5;
                        if (str4 != null) {
                            r42.A0M = str4;
                            C159627jf r28 = this.A00;
                            if (r28 == null) {
                                throw C36331k8.A0d("resourceResultCallback");
                            }
                            Object obj6 = map4.get("purpose_code");
                            if (obj6 == null || !(obj6 instanceof String)) {
                                A00(r28, this, String.class, C36331k8.A0k("purpose_code", " is null or not a "));
                                obj6 = null;
                            }
                            String str5 = (String) obj6;
                            if (str5 != null) {
                                r42.A0N = str5;
                                C159627jf r29 = this.A00;
                                if (r29 == null) {
                                    throw C36331k8.A0d("resourceResultCallback");
                                }
                                Object obj7 = map4.get("receiver_vpa");
                                if (obj7 == null || !(obj7 instanceof String)) {
                                    A00(r29, this, String.class, C36331k8.A0k("receiver_vpa", " is null or not a "));
                                    obj7 = null;
                                }
                                String str6 = (String) obj7;
                                if (str6 != null) {
                                    r42.A0O = str6;
                                    C159627jf r210 = this.A00;
                                    if (r210 == null) {
                                        throw C36331k8.A0d("resourceResultCallback");
                                    }
                                    Object obj8 = map3.get("sender_vpa");
                                    if (obj8 == null || !(obj8 instanceof String)) {
                                        A00(r210, this, String.class, C36331k8.A0k("sender_vpa", " is null or not a "));
                                        obj8 = null;
                                    }
                                    String str7 = (String) obj8;
                                    if (str7 != null) {
                                        r42.A0Q = str7;
                                        C159627jf r211 = this.A00;
                                        if (r211 == null) {
                                            throw C36331k8.A0d("resourceResultCallback");
                                        }
                                        Object obj9 = map3.get("sender_vpa_id");
                                        if (obj9 == null || !(obj9 instanceof String)) {
                                            A00(r211, this, String.class, C36331k8.A0k("sender_vpa_id", " is null or not a "));
                                            obj9 = null;
                                        }
                                        String str8 = (String) obj9;
                                        if (str8 != null) {
                                            r42.A0R = str8;
                                            C159627jf r212 = this.A00;
                                            if (r212 == null) {
                                                throw C36331k8.A0d("resourceResultCallback");
                                            }
                                            Object obj10 = map2.get("seq_no");
                                            if (obj10 == null || !(obj10 instanceof String)) {
                                                A00(r212, this, String.class, C36331k8.A0k("seq_no", " is null or not a "));
                                                obj10 = null;
                                            }
                                            String str9 = (String) obj10;
                                            if (str9 != null) {
                                                r42.A0S = str9;
                                                C159627jf r213 = this.A00;
                                                if (r213 == null) {
                                                    throw C36331k8.A0d("resourceResultCallback");
                                                }
                                                Object obj11 = map2.get("token");
                                                if (obj11 == null || !(obj11 instanceof String)) {
                                                    A00(r213, this, String.class, C36331k8.A0k("token", " is null or not a "));
                                                    obj11 = null;
                                                }
                                                String str10 = (String) obj11;
                                                if (str10 != null) {
                                                    r42.A0U = str10;
                                                    r42.A05 = C19970wo.A00(this.A01);
                                                    C159627jf r214 = this.A00;
                                                    if (r214 == null) {
                                                        throw C36331k8.A0d("resourceResultCallback");
                                                    }
                                                    Object obj12 = map3.get("is_first_send");
                                                    if (obj12 == null || !(obj12 instanceof Boolean)) {
                                                        A00(r214, this, Boolean.class, C36331k8.A0k("is_first_send", " is null or not a "));
                                                        obj12 = null;
                                                    }
                                                    Boolean bool2 = (Boolean) obj12;
                                                    if (bool2 != null) {
                                                        r42.A0I = bool2;
                                                        C146356vT A002 = C146356vT.A00();
                                                        Class<String> cls = String.class;
                                                        String str11 = "bank_info";
                                                        C159627jf r11 = this.A00;
                                                        if (r11 == null) {
                                                            throw C36331k8.A0d("resourceResultCallback");
                                                        }
                                                        Object obj13 = map3.get(str11);
                                                        if (obj13 != null && (obj13 instanceof String)) {
                                                            r42.A0C = C165617ti.A0P(A002, cls, obj13, "bankInfo");
                                                            C146356vT A003 = C146356vT.A00();
                                                            str11 = "mpin";
                                                            r11 = this.A00;
                                                            if (r11 == null) {
                                                                throw C36331k8.A0d("resourceResultCallback");
                                                            }
                                                            Object obj14 = map3.get(str11);
                                                            if (obj14 != null && (obj14 instanceof String)) {
                                                                r42.A0D = C165617ti.A0P(A003, cls, obj14, "pin");
                                                                C159627jf r1 = this.A00;
                                                                if (r1 == null) {
                                                                    throw C36331k8.A0d("resourceResultCallback");
                                                                }
                                                                Object obj15 = map2.get("order_id");
                                                                if (obj15 == null || !(obj15 instanceof String)) {
                                                                    A00(r1, this, cls, C36331k8.A0k("order_id", " is null or not a "));
                                                                    obj15 = null;
                                                                }
                                                                String str12 = (String) obj15;
                                                                if (str12 != null) {
                                                                    r42.A02 = new C207259uo(0, str12, "");
                                                                    C159627jf r112 = this.A00;
                                                                    if (r112 == null) {
                                                                        throw C36331k8.A0d("resourceResultCallback");
                                                                    }
                                                                    Object obj16 = map2.get("total_amount");
                                                                    if (obj16 == null || !(obj16 instanceof Map)) {
                                                                        A00(r112, this, Map.class, C36331k8.A0k("total_amount", " is null or not a "));
                                                                        obj16 = null;
                                                                    }
                                                                    Map map5 = (Map) obj16;
                                                                    if (map5 != null) {
                                                                        C199449fK r113 = new C199449fK();
                                                                        C159627jf r12 = this.A00;
                                                                        if (r12 == null) {
                                                                            throw C36331k8.A0d("resourceResultCallback");
                                                                        }
                                                                        Object obj17 = map5.get("value");
                                                                        if (obj17 == null || !(obj17 instanceof Integer)) {
                                                                            A00(r12, this, Integer.class, C36331k8.A0k("value", " is null or not a "));
                                                                            obj17 = null;
                                                                        }
                                                                        Number number = (Number) obj17;
                                                                        if (number != null) {
                                                                            r113.A01 = (long) number.intValue();
                                                                            C159627jf r122 = this.A00;
                                                                            if (r122 == null) {
                                                                                throw C36331k8.A0d("resourceResultCallback");
                                                                            }
                                                                            Object obj18 = map5.get("offset");
                                                                            if (obj18 == null || !(obj18 instanceof Integer)) {
                                                                                A00(r122, this, Integer.class, C36331k8.A0k("offset", " is null or not a "));
                                                                                obj18 = null;
                                                                            }
                                                                            Number number2 = (Number) obj18;
                                                                            if (number2 != null) {
                                                                                r113.A00 = number2.intValue();
                                                                                C159627jf r123 = this.A00;
                                                                                if (r123 == null) {
                                                                                    throw C36331k8.A0d("resourceResultCallback");
                                                                                }
                                                                                Object obj19 = map2.get("currency_code");
                                                                                if (obj19 == null || !(obj19 instanceof String)) {
                                                                                    A00(r123, this, cls, C36331k8.A0k("currency_code", " is null or not a "));
                                                                                    obj19 = null;
                                                                                }
                                                                                if (AnonymousClass00C.A0J(obj19, "INR")) {
                                                                                    r113.A02 = AnonymousClass16W.A05;
                                                                                    C207119ua A012 = r113.A01();
                                                                                    C222713q r13 = AnonymousClass11F.A00;
                                                                                    C159627jf r114 = this.A00;
                                                                                    if (r114 == null) {
                                                                                        throw C36331k8.A0d("resourceResultCallback");
                                                                                    }
                                                                                    Object obj20 = map4.get("jid");
                                                                                    if (obj20 == null || !(obj20 instanceof String)) {
                                                                                        A00(r114, this, cls, C36331k8.A0k("jid", " is null or not a "));
                                                                                        obj20 = null;
                                                                                    }
                                                                                    AnonymousClass11F A022 = r13.A02((String) obj20);
                                                                                    if (A022 != null) {
                                                                                        Object obj21 = map2.get("quoted_message_id");
                                                                                        if (!(obj21 instanceof String) || (str = (String) obj21) == null) {
                                                                                            r18 = null;
                                                                                        } else {
                                                                                            r18 = this.A02.A02(C165617ti.A0R(A022, str, false));
                                                                                        }
                                                                                        C29551Xb r16 = this.A06;
                                                                                        AnonymousClass2bV A004 = r16.A00(A022, r18, C79963uZ.A00, "", (List) null, 0);
                                                                                        ArrayList A0A = this.A03.A0A();
                                                                                        C159627jf r8 = this.A00;
                                                                                        if (r8 == null) {
                                                                                            throw C36331k8.A0d("resourceResultCallback");
                                                                                        }
                                                                                        Object obj22 = map3.get("credential_id");
                                                                                        if (obj22 == null || !(obj22 instanceof String)) {
                                                                                            A00(r8, this, cls, C36331k8.A0k("credential_id", " is null or not a "));
                                                                                            obj22 = null;
                                                                                        }
                                                                                        String str13 = (String) obj22;
                                                                                        if (str13 != null) {
                                                                                            C207249un A013 = AnonymousClass16S.A01(str13, A0A);
                                                                                            C159627jf r7 = this.A00;
                                                                                            if (r7 == null) {
                                                                                                throw C36331k8.A0d("resourceResultCallback");
                                                                                            }
                                                                                            Object obj23 = map2.get("transaction_type");
                                                                                            if (obj23 == null || !(obj23 instanceof String)) {
                                                                                                A00(r7, this, cls, C36331k8.A0k("transaction_type", " is null or not a "));
                                                                                                return;
                                                                                            }
                                                                                            boolean equals = obj23.equals("p2m");
                                                                                            C159627jf r72 = this.A00;
                                                                                            if (r72 == null) {
                                                                                                throw C36331k8.A0d("resourceResultCallback");
                                                                                            }
                                                                                            Object obj24 = map2.get("transaction_id");
                                                                                            if (obj24 == null || !(obj24 instanceof String)) {
                                                                                                A00(r72, this, cls, C36331k8.A0k("transaction_id", " is null or not a "));
                                                                                                obj24 = null;
                                                                                            }
                                                                                            String str14 = (String) obj24;
                                                                                            if (str14 != null) {
                                                                                                C36391kE.A1Q(new C183678rB(A013, A012, r42, this, A004, str14, str2, equals), this.A07);
                                                                                                return;
                                                                                            }
                                                                                            return;
                                                                                        }
                                                                                        return;
                                                                                    }
                                                                                    return;
                                                                                }
                                                                                return;
                                                                            }
                                                                            return;
                                                                        }
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                        }
                                                        A00(r11, this, cls, C36331k8.A0k(str11, " is null or not a "));
                                                        return;
                                                    }
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        C159627jf r215 = this.A00;
        if (r215 == null) {
            throw C36331k8.A0d("resourceResultCallback");
        }
        A05(r215, "not_supported", "pay to non-WA user is not supported yet");
    }

    public static void A00(C159627jf r2, AnonymousClass6F2 r3, Class cls, StringBuilder sb) {
        sb.append(new C019308f(cls).BHa());
        r3.A05(r2, "incorrect_input", sb.toString());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C178678gv(C19970wo r2, AnonymousClass1VZ r3, AnonymousClass16S r4, C29121Vk r5, C105705Fs r6, AnonymousClass9F9 r7, C29551Xb r8, C19770wU r9, AnonymousClass004 r10) {
        super(r6);
        C36321k7.A11(r6, r2, r9);
        AnonymousClass00C.A0D(r3, 5);
        C36321k7.A13(r4, r5, r10);
        AnonymousClass00C.A0D(r7, 9);
        this.A01 = r2;
        this.A07 = r9;
        this.A06 = r8;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r5;
        this.A08 = r10;
        this.A05 = r7;
    }

    public String A06() {
        return "native_upi_send_payment_message";
    }
}
