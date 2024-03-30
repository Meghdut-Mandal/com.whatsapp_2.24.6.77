package com.whatsapp.community;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass05L;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass11F;
import X.AnonymousClass141;
import X.AnonymousClass147;
import X.AnonymousClass3QK;
import X.AnonymousClass6PM;
import X.AnonymousClass6X6;
import X.C000300d;
import X.C005502l;
import X.C009003v;
import X.C023509x;
import X.C28391Sm;
import X.C28401Sn;
import X.C36341k9;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C62523Gm;
import X.C62833Hs;
import X.C65533Sl;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.CommunityMembersViewModel$refreshCommunityMembers$1", f = "CommunityMembersViewModel.kt", i = {}, l = {220}, m = "invokeSuspend", n = {}, s = {})
public final class CommunityMembersViewModel$refreshCommunityMembers$1 extends AnonymousClass0A1 implements C009003v {
    public Object L$0;
    public int label;
    public final /* synthetic */ CommunityMembersViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommunityMembersViewModel$refreshCommunityMembers$1(CommunityMembersViewModel communityMembersViewModel, C023509x r3) {
        super(2, r3);
        this.this$0 = communityMembersViewModel;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new CommunityMembersViewModel$refreshCommunityMembers$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new CommunityMembersViewModel$refreshCommunityMembers$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        CommunityMembersViewModel communityMembersViewModel;
        Object value;
        AnonymousClass147 r8;
        LinkedHashMap linkedHashMap;
        Object value2;
        Object obj2;
        Object value3;
        Integer num;
        String str;
        int i;
        int i2;
        Object obj3 = obj;
        AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i3 = this.label;
        if (i3 == 0) {
            AnonymousClass0AN.A00(obj3);
            communityMembersViewModel = this.this$0;
            C28391Sm r4 = communityMembersViewModel.A07;
            AnonymousClass147 r3 = communityMembersViewModel.A0I;
            C005502l r2 = communityMembersViewModel.A0J;
            this.L$0 = communityMembersViewModel;
            this.label = 1;
            obj3 = AnonymousClass0A2.A00(this, r2, new CommunityMembersDirectory$getCommunityDirectory$4((C28401Sn) r4, r3, (C023509x) null));
            if (obj3 == r6) {
                return r6;
            }
        } else if (i3 == 1) {
            communityMembersViewModel = (CommunityMembersViewModel) this.L$0;
            AnonymousClass0AN.A00(obj3);
        } else {
            throw AnonymousClass000.A0e();
        }
        Map map = (Map) obj3;
        AnonymousClass05L r11 = communityMembersViewModel.A0K;
        do {
            value = r11.getValue();
            Map map2 = (Map) value;
            C28391Sm r32 = communityMembersViewModel.A07;
            r8 = communityMembersViewModel.A0I;
            Collection<AnonymousClass6PM> values = map.values();
            C28401Sn r33 = (C28401Sn) r32;
            AnonymousClass00C.A0D(values, 1);
            LinkedHashMap A1G = C36431kI.A1G();
            AnonymousClass3QK A0L = C36421kH.A0L(r33.A02, r8);
            if (A0L != null) {
                C65533Sl r0 = AnonymousClass147.A01;
                AnonymousClass147 A03 = C65533Sl.A03(A0L.A02);
                if (A03 != null) {
                    AnonymousClass6X6 A0C = r33.A07.A07.A0C(A03);
                    for (AnonymousClass6PM r02 : values) {
                        UserJid userJid = r02.A03;
                        AnonymousClass6PM A08 = A0C.A08(userJid);
                        if (A08 != null) {
                            AnonymousClass00C.A07(userJid);
                            C36341k9.A1K(userJid, A1G, A08.A01);
                        }
                    }
                }
            }
            linkedHashMap = new LinkedHashMap(C000300d.A02(map.size()));
            Iterator A0y = AnonymousClass000.A0y(map);
            while (A0y.hasNext()) {
                Map.Entry A11 = AnonymousClass000.A11(A0y);
                Object key = A11.getKey();
                AnonymousClass141 A082 = communityMembersViewModel.A09.A08((AnonymousClass11F) A11.getKey());
                if (communityMembersViewModel.A06.A0M((AnonymousClass11F) A11.getKey())) {
                    str = communityMembersViewModel.A05.A00();
                } else if (A082 == null || (str = A082.A0X) == null) {
                    str = "";
                }
                AnonymousClass00C.A0B(str);
                Number A10 = C36441kJ.A10(A11.getKey(), A1G);
                if (A10 != null) {
                    i = A10.intValue();
                } else {
                    i = -1;
                }
                C62523Gm r03 = (C62523Gm) map2.get(A11.getKey());
                if (r03 != null) {
                    i2 = r03.A01;
                } else {
                    i2 = 0;
                }
                linkedHashMap.put(key, new C62523Gm(A082, (UserJid) A11.getKey(), str, ((AnonymousClass6PM) A11.getValue()).A01, i, i2));
            }
        } while (!r11.B3B(value, linkedHashMap));
        AnonymousClass05L r34 = communityMembersViewModel.A0M;
        do {
            value2 = r34.getValue();
            PhoneUserJid A0n = C36441kJ.A0n(communityMembersViewModel.A06);
            if (A0n != null) {
                obj2 = ((Map) r11.getValue()).get(A0n);
            } else {
                obj2 = null;
            }
        } while (!r34.B3B(value2, obj2));
        AnonymousClass05L r35 = communityMembersViewModel.A0L;
        do {
            value3 = r35.getValue();
            if (communityMembersViewModel.A0C.A0D(r8)) {
                num = Integer.valueOf(((Map) r11.getValue()).size());
            } else {
                num = null;
            }
        } while (!r35.B3B(value3, new C62833Hs(1, num)));
        return AnonymousClass0AJ.A00;
    }
}
