package X;

import com.whatsapp.jid.UserJid;
import java.util.List;
import java.util.Map;

public abstract class ACR implements C160087kR {
    public void B2J(C123815x8 r13) {
        IllegalStateException th;
        int i;
        C21700zf A0V;
        try {
            if (r13.A00 == 0) {
                Object obj = r13.A03.A00;
                if (obj != null) {
                    C177058d8 r2 = (C177058d8) this;
                    C603237k r6 = r2.A03;
                    UserJid A04 = r2.A04();
                    int i2 = r2.A00;
                    r6.A03.Boy(new C80533vY(r6, A04, i2, 1, -1));
                    AnonymousClass9IN r7 = r2.A04;
                    UserJid A042 = r2.A04();
                    AnonymousClass97P A05 = r2.A05();
                    AnonymousClass00C.A0D(A042, 0);
                    Integer A01 = C200469hS.A01(A05, i2);
                    if (A01 != null) {
                        C122765vO r62 = new C122765vO(A042, "graphql", false, false);
                        AnonymousClass9IO r5 = r7.A00;
                        int intValue = A01.intValue();
                        Integer num = r5.A00;
                        if (num != null) {
                            r5.A01.A04(r62, intValue, num.intValue());
                        }
                    }
                    if (r2 instanceof AnonymousClass8W3) {
                        AnonymousClass8W3 r22 = (AnonymousClass8W3) r2;
                        C21113A8y a8y = (C21113A8y) obj;
                        StringBuilder A0i = C36341k9.A0i(a8y);
                        A0i.append("GetSingleCollectionGraphQLService/sendRequest/success jid=");
                        AnonymousClass9XP r1 = r22.A01;
                        C36321k7.A1N(r1.A04, A0i);
                        AnonymousClass8W3.A00(r22);
                        r22.A02.BiN(a8y, r1);
                        return;
                    } else if (r2 instanceof AnonymousClass8W1) {
                        AnonymousClass8W1 r23 = (AnonymousClass8W1) r2;
                        C21114A8z a8z = (C21114A8z) obj;
                        AnonymousClass00C.A0D(a8z, 0);
                        r23.A08.A01("plm_details_view_tag");
                        r23.A01.A0H(r23.A03.A01, a8z.A02);
                        List list = a8z.A01;
                        if (list == null || list.isEmpty()) {
                            C21114A8z.A00(r23.A04, 4);
                            r23.A00.A0E("GetProductListGraphQLService/onSuccessResponse error", "error_code=0", true);
                            return;
                        }
                        r23.A04.Blo(a8z);
                        return;
                    } else if (r2 instanceof AnonymousClass8W2) {
                        AnonymousClass8W2 r24 = (AnonymousClass8W2) r2;
                        AnonymousClass9HE r4 = (AnonymousClass9HE) obj;
                        AnonymousClass00C.A0D(r4, 0);
                        r24.A0A.A01("view_product_tag");
                        AnonymousClass1KK r3 = r24.A01;
                        AnonymousClass9NZ r52 = r24.A07;
                        UserJid userJid = r52.A01;
                        AnonymousClass00C.A07(userJid);
                        r3.A0H(userJid, r4.A01);
                        C207269up r32 = r4.A00;
                        if (r32 != null) {
                            r24.A02.A0C(r32, userJid);
                            r24.A04.BXa(r52, r32.A0F);
                            return;
                        }
                        return;
                    } else if (r2 instanceof AnonymousClass8W4) {
                        AnonymousClass8W4 r25 = (AnonymousClass8W4) r2;
                        AnonymousClass9HD r42 = (AnonymousClass9HD) obj;
                        AnonymousClass00C.A0D(r42, 0);
                        C200939iV r63 = r25.A06;
                        if (r63.A08 == null && (A0V = C165597tg.A0V(r25.A08)) != null) {
                            A0V.A06("datasource_catalog");
                        }
                        UserJid userJid2 = r63.A07;
                        C21112A8x a8x = r42.A00;
                        AnonymousClass1KK r12 = r25.A01;
                        AnonymousClass00C.A07(userJid2);
                        r12.A0H(userJid2, r42.A01);
                        C23025B0v b0v = r25.A03;
                        if (a8x != null) {
                            b0v.BiO(a8x, r63);
                            return;
                        }
                        b0v.BXL(r63, 0);
                        r25.A00.A0E("GetProductCatalogGraphQLService/get product catalog error", "error_code=0", true);
                        return;
                    } else if (r2 instanceof AnonymousClass8W0) {
                        AnonymousClass8W0 r26 = (AnonymousClass8W0) r2;
                        AnonymousClass9VR r43 = (AnonymousClass9VR) obj;
                        AnonymousClass00C.A0D(r43, 0);
                        AnonymousClass8W0.A00(r26);
                        r26.A00.A00(r43, r26.A02);
                        return;
                    } else if (r2 instanceof C174308Vz) {
                        C174308Vz r27 = (C174308Vz) r2;
                        A90 a90 = (A90) obj;
                        AnonymousClass00C.A0D(a90, 0);
                        if (a90.A01.isEmpty()) {
                            r27.A03.BXJ(r27.A01, 0);
                            return;
                        } else {
                            r27.A03.Bi4(r27.A01, a90);
                            return;
                        }
                    } else {
                        C174298Vy r28 = (C174298Vy) r2;
                        AnonymousClass68d r44 = (AnonymousClass68d) obj;
                        AnonymousClass00C.A0D(r44, 0);
                        AnonymousClass9HC r64 = r28.A00;
                        AnonymousClass9HF r53 = r28.A01;
                        C202279lS r33 = r64.A01;
                        C29461Ws r29 = r33.A0B;
                        List list2 = r44.A00;
                        C198089ct A00 = C29461Ws.A00(r29, r53.A00);
                        synchronized (r29) {
                            try {
                                A00.A02 = list2;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        r33.A07.A0H(new C1503374w(r64.A00, r53, r44, 45));
                        return;
                    }
                } else {
                    th = AnonymousClass001.A09("No GraphQL Response available");
                }
            } else {
                Map map = r13.A04.A00;
                if (map != null) {
                    C177068d9 r210 = (C177068d9) this;
                    try {
                        if (!map.isEmpty()) {
                            C132286Sy r14 = (C132286Sy) AnonymousClass000.A0z(map).next();
                            switch (r14.A01) {
                                case 2498048:
                                    i = 451;
                                    break;
                                case 2498049:
                                case 2498050:
                                case 2498051:
                                case 2498052:
                                    i = 404;
                                    break;
                                case 2498053:
                                    i = 406;
                                    break;
                                case 2498054:
                                    i = 421;
                                    break;
                                case 2498055:
                                    i = 500;
                                    break;
                                case 2498056:
                                    i = 0;
                                    break;
                                default:
                                    i = -1;
                                    break;
                            }
                            r210.A03(r14, i);
                            return;
                        }
                        throw AnonymousClass001.A08("GraphQL errors map is empty");
                    } catch (Exception e) {
                        r210.BWk(e);
                        return;
                    }
                } else {
                    th = AnonymousClass001.A09("Error response received but no errors found");
                }
            }
            throw th;
        } catch (Exception e2) {
            BWk(e2);
        }
    }
}
