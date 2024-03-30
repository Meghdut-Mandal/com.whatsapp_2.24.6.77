package com.whatsapp.updates.viewmodels;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass03X;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass11F;
import X.AnonymousClass142;
import X.AnonymousClass3EJ;
import X.AnonymousClass3EL;
import X.AnonymousClass3P0;
import X.AnonymousClass3PC;
import X.AnonymousClass3S7;
import X.AnonymousClass3T1;
import X.C000300d;
import X.C000400e;
import X.C007103b;
import X.C009003v;
import X.C023409w;
import X.C023509x;
import X.C13530k1;
import X.C13620kA;
import X.C18800tq;
import X.C18830tt;
import X.C19730wQ;
import X.C19970wo;
import X.C219612i;
import X.C222813r;
import X.C223613z;
import X.C36341k9;
import X.C36381kD;
import X.C36401kF;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C48002gX;
import X.C48012gY;
import X.C56472wL;
import X.C58442zs;
import X.C605938l;
import X.C61113Ap;
import X.C65663Sz;
import X.C89834Yb;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.json.JSONException;
import org.json.JSONObject;

@DebugMetadata(c = "com.whatsapp.updates.viewmodels.UpdatesViewModel$refreshStatusList$1", f = "UpdatesViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class UpdatesViewModel$refreshStatusList$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass3EL $myStatusState;
    public final /* synthetic */ boolean $shouldRankStatuses;
    public int label;
    public final /* synthetic */ UpdatesViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdatesViewModel$refreshStatusList$1(AnonymousClass3EL r2, UpdatesViewModel updatesViewModel, C023509x r4, boolean z) {
        super(2, r4);
        this.this$0 = updatesViewModel;
        this.$myStatusState = r2;
        this.$shouldRankStatuses = z;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new UpdatesViewModel$refreshStatusList$1(this.$myStatusState, this.this$0, r6, this.$shouldRankStatuses);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        AbstractMap abstractMap;
        int i;
        int i2;
        String A01;
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            UpdatesViewModel updatesViewModel = this.this$0;
            C58442zs r1 = updatesViewModel.A0W;
            AnonymousClass3EL r4 = this.$myStatusState;
            AnonymousClass3P0 r11 = (AnonymousClass3P0) updatesViewModel.A0f.A05.A04();
            if (r11 == null) {
                C023409w r13 = C023409w.A00;
                C023409w r14 = r13;
                r11 = new AnonymousClass3P0((C65663Sz) null, r13, r14, r13, C000400e.A0D(), C000400e.A0D());
            }
            UpdatesViewModel updatesViewModel2 = this.this$0;
            boolean z = updatesViewModel2.A0D;
            boolean z2 = updatesViewModel2.A0C;
            boolean z3 = updatesViewModel2.A0B;
            boolean z4 = this.$shouldRankStatuses;
            C18800tq r12 = r1.A00.A00;
            C18830tt r0 = r12.A00;
            C61113Ap r9 = new C61113Ap(C36431kI.A0v(r12), r11, (AnonymousClass3PC) r0.A40.get(), C18830tt.ADH(r0), r4, z, z2, z3, z4);
            AnonymousClass3EJ r10 = r9.A03;
            AnonymousClass3EL r6 = r9.A04;
            boolean z5 = r9.A06;
            AnonymousClass3T1 A02 = r10.A01.A02(C223613z.A00);
            C19730wQ r02 = r10.A00;
            r02.A0G();
            AnonymousClass142 r42 = r02.A0E;
            if (r42 != null) {
                if (A02 != null) {
                    str = r10.A02.A00(A02.A0I);
                } else {
                    str = null;
                }
                C48012gY r18 = new C48012gY(r42, A02, r6, str, z5);
                AnonymousClass3P0 r112 = r9.A01;
                List list = r112.A02;
                C48002gX r17 = null;
                if (r9.A08 || r9.A00.A00.A0E(56)) {
                    AnonymousClass3PC r62 = r9.A02;
                    AnonymousClass00C.A0D(list, 0);
                    synchronized (r62) {
                        if (r62.A09.A0E(56)) {
                            Map map = r62.A00;
                            if (map == null || map.isEmpty()) {
                                C605938l r5 = r62.A0B;
                                C19970wo r142 = r5.A02;
                                long A00 = C19970wo.A00(r142);
                                C219612i r43 = r5.A03;
                                if (r43.A00("status_ranking_map_expiration", 0) >= A00 && (A01 = r43.A01("status_ranking_map")) != null) {
                                    try {
                                        JSONObject A1C = C36441kJ.A1C(A01);
                                        Iterator<String> keys = A1C.keys();
                                        abstractMap = AnonymousClass001.A0J();
                                        while (keys.hasNext()) {
                                            String A0C = AnonymousClass001.A0C(keys);
                                            AnonymousClass11F A0N = C36421kH.A0N(A0C);
                                            if (A0N != null) {
                                                C36341k9.A1K(A0N, abstractMap, A1C.getInt(A0C));
                                            }
                                        }
                                    } catch (JSONException unused) {
                                        Log.e("Unable to fetch the ranking map");
                                    }
                                    r62.A00 = abstractMap;
                                }
                                abstractMap = C36431kI.A1G();
                                AnonymousClass3PC.A00(r62, r62.A06.A04(), abstractMap, r62.A04);
                                AnonymousClass3PC.A00(r62, r62.A07.A02(C56472wL.A00, false, false), abstractMap, r62.A02);
                                int i3 = r62.A03;
                                if (i3 != 0) {
                                    LinkedHashSet linkedHashSet = new LinkedHashSet(r62.A0A.A0W().keySet());
                                    ArrayList A0I = AnonymousClass001.A0I();
                                    Iterator it = linkedHashSet.iterator();
                                    while (it.hasNext()) {
                                        Object next = it.next();
                                        AnonymousClass11F r03 = (AnonymousClass11F) next;
                                        AnonymousClass00C.A0B(r03);
                                        if (r03 instanceof UserJid) {
                                            A0I.add(next);
                                        }
                                    }
                                    Iterator it2 = A0I.iterator();
                                    while (it2.hasNext()) {
                                        UserJid A002 = C222813r.A00(C36401kF.A0a(it2));
                                        if (A002 != null) {
                                            Integer num = (Integer) abstractMap.get(A002);
                                            if (num != null) {
                                                i2 = num.intValue();
                                            } else {
                                                i2 = 0;
                                            }
                                            C36341k9.A1K(A002, abstractMap, i2 + (r62.A05 * i3));
                                        }
                                    }
                                }
                                int i4 = r62.A01;
                                if (i4 != 0) {
                                    ArrayList A0A = r62.A08.A0A();
                                    ArrayList A0I2 = AnonymousClass001.A0I();
                                    Iterator it3 = A0A.iterator();
                                    while (it3.hasNext()) {
                                        Object next2 = it3.next();
                                        AnonymousClass11F r04 = (AnonymousClass11F) next2;
                                        AnonymousClass00C.A0B(r04);
                                        if (r04 instanceof UserJid) {
                                            A0I2.add(next2);
                                        }
                                    }
                                    for (Object next3 : A0I2) {
                                        AnonymousClass00C.A0B(next3);
                                        Integer num2 = (Integer) abstractMap.get(next3);
                                        if (num2 != null) {
                                            i = num2.intValue();
                                        } else {
                                            i = 0;
                                        }
                                        C36341k9.A1K(next3, abstractMap, i + (r62.A05 * i4));
                                    }
                                }
                                Map A09 = C000400e.A09(C007103b.A0a(C89834Yb.A00(C13620kA.A0F(abstractMap), 11), r5.A00));
                                LinkedHashMap linkedHashMap = new LinkedHashMap(C000300d.A02(A09.size()));
                                Iterator A0y = AnonymousClass000.A0y(A09);
                                while (A0y.hasNext()) {
                                    Map.Entry A11 = AnonymousClass000.A11(A0y);
                                    linkedHashMap.put(((Jid) A11.getKey()).getRawString(), A11.getValue());
                                }
                                r43.A04("status_ranking_map", C36381kD.A0y(new JSONObject(linkedHashMap)));
                                r43.A03("status_ranking_map_expiration", C19970wo.A00(r142) + r5.A01);
                                r62.A00 = abstractMap;
                            }
                            ArrayList A15 = C36441kJ.A15(list);
                            AnonymousClass03X.A08(A15, r62.A0C);
                            list = new C13530k1(A15);
                        }
                    }
                }
                ArrayList A0I3 = AnonymousClass001.A0I();
                Iterator it4 = list.iterator();
                while (it4.hasNext()) {
                    AnonymousClass3EJ.A00(C36441kJ.A0h(it4), r10, A0I3, z5, false);
                }
                List list2 = r112.A03;
                ArrayList A0I4 = AnonymousClass001.A0I();
                Iterator it5 = list2.iterator();
                while (it5.hasNext()) {
                    AnonymousClass3EJ.A00(C36441kJ.A0h(it5), r10, A0I4, z5, false);
                }
                List list3 = r112.A01;
                ArrayList A0I5 = AnonymousClass001.A0I();
                Iterator it6 = list3.iterator();
                while (it6.hasNext()) {
                    AnonymousClass3EJ.A00(C36441kJ.A0h(it6), r10, A0I5, z5, true);
                }
                if (C36401kF.A1a(list3) && r9.A00.A00.A0E(5226)) {
                    r17 = C48002gX.A00;
                }
                AnonymousClass3S7 r16 = new AnonymousClass3S7(r17, r18, A0I3, A0I4, A0I5, r9.A07, false, r9.A05);
                UpdatesViewModel updatesViewModel3 = this.this$0;
                boolean z6 = this.$shouldRankStatuses;
                updatesViewModel3.A0Q.A0C(r16);
                Collection collection = (Collection) updatesViewModel3.A0T.A04();
                if (collection == null || collection.isEmpty()) {
                    UpdatesViewModel.A08(updatesViewModel3);
                }
                if (!updatesViewModel3.A0K) {
                    updatesViewModel3.A0K = z6;
                }
                return AnonymousClass0AJ.A00;
            }
            throw AnonymousClass001.A09("Me contact cannot be null");
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((UpdatesViewModel$refreshStatusList$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
