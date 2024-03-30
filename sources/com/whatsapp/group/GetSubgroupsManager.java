package com.whatsapp.group;

import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass040;
import X.AnonymousClass0A2;
import X.AnonymousClass147;
import X.AnonymousClass1LV;
import X.AnonymousClass3QK;
import X.C008903u;
import X.C023109s;
import X.C023509x;
import X.C20350xQ;
import X.C20800yB;
import X.C20810yC;
import X.C21000yV;
import X.C230917d;
import X.C35721j9;
import X.C64213Nc;
import X.C65073Qp;
import X.C65533Sl;
import android.os.Parcelable;
import com.whatsapp.community.mex.GetSubgroupsGraphQlHandler;
import com.whatsapp.protocol.groups.GetSubgroupsProtocolHelper;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class GetSubgroupsManager {
    public final AnonymousClass1LV A00;
    public final GetSubgroupsGraphQlHandler A01;
    public final C20810yC A02;
    public final GetSubgroupsProtocolHelper A03;
    public final AnonymousClass005 A04;
    public final AnonymousClass040 A05;

    public GetSubgroupsManager(AnonymousClass1LV r2, GetSubgroupsGraphQlHandler getSubgroupsGraphQlHandler, C20810yC r4, GetSubgroupsProtocolHelper getSubgroupsProtocolHelper, AnonymousClass005 r6, AnonymousClass040 r7) {
        AnonymousClass00C.A0D(r7, 1);
        AnonymousClass00C.A0D(r4, 2);
        AnonymousClass00C.A0D(r2, 3);
        AnonymousClass00C.A0D(r6, 4);
        AnonymousClass00C.A0D(getSubgroupsProtocolHelper, 6);
        this.A05 = r7;
        this.A02 = r4;
        this.A00 = r2;
        this.A04 = r6;
        this.A01 = getSubgroupsGraphQlHandler;
        this.A03 = getSubgroupsProtocolHelper;
    }

    public final void A03(AnonymousClass147 r10) {
        AnonymousClass00C.A0D(r10, 0);
        Parcelable.Creator creator = AnonymousClass147.CREATOR;
        AnonymousClass147 A032 = C65533Sl.A03(this.A00.A01(r10));
        boolean A012 = C20800yB.A01(C21000yV.A02, this.A02, 7598);
        AnonymousClass040 r2 = this.A05;
        GetSubgroupsManager$getSubgroups$1 getSubgroupsManager$getSubgroups$1 = new GetSubgroupsManager$getSubgroups$1(this, r10, A032, (C023509x) null, A012);
        AnonymousClass0A2.A02(C023109s.A00, C008903u.A00, getSubgroupsManager$getSubgroups$1, r2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004d A[Catch:{ Exception -> 0x005e }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C595634k r5, com.whatsapp.group.GetSubgroupsManager r6, X.AnonymousClass147 r7, X.AnonymousClass147 r8, X.C023509x r9) {
        /*
            boolean r0 = r9 instanceof X.C82593yx
            if (r0 == 0) goto L_0x0022
            r4 = r9
            X.3yx r4 = (X.C82593yx) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0022
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r2 = r4.result
            X.0AO r3 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L_0x0030
            if (r0 != r1) goto L_0x0028
            java.lang.Object r5 = r4.L$0
            X.34k r5 = (X.C595634k) r5
            goto L_0x0040
        L_0x0022:
            X.3yx r4 = new X.3yx
            r4.<init>(r6, r9)
            goto L_0x0012
        L_0x0028:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0030:
            X.AnonymousClass0AN.A00(r2)
            com.whatsapp.protocol.groups.GetSubgroupsProtocolHelper r0 = r6.A03     // Catch:{ Exception -> 0x005e }
            r4.L$0 = r5     // Catch:{ Exception -> 0x005e }
            r4.label = r1     // Catch:{ Exception -> 0x005e }
            java.lang.Object r2 = r0.A01(r7, r8, r4)     // Catch:{ Exception -> 0x005e }
            if (r2 != r3) goto L_0x0047
            return r3
        L_0x0040:
            X.AnonymousClass0AN.A00(r2)     // Catch:{ Exception -> 0x005e }
            X.0AK r2 = (X.AnonymousClass0AK) r2     // Catch:{ Exception -> 0x005e }
            java.lang.Object r2 = r2.value     // Catch:{ Exception -> 0x005e }
        L_0x0047:
            boolean r0 = r2 instanceof X.AnonymousClass03N     // Catch:{ Exception -> 0x005e }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0073
            X.AnonymousClass0AN.A00(r2)     // Catch:{ Exception -> 0x005e }
            java.util.List r2 = (java.util.List) r2     // Catch:{ Exception -> 0x005e }
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)     // Catch:{ Exception -> 0x005e }
            com.whatsapp.group.GetSubgroupsManager r1 = r5.A00     // Catch:{ Exception -> 0x005e }
            X.147 r0 = r5.A01     // Catch:{ Exception -> 0x005e }
            A02(r1, r0, r2)     // Catch:{ Exception -> 0x005e }
            goto L_0x0073
        L_0x005e:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "GetSubgroupsProtocolHelper/sendGetSubgroupsRequest/error: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0073:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.group.GetSubgroupsManager.A00(X.34k, com.whatsapp.group.GetSubgroupsManager, X.147, X.147, X.09x):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.whatsapp.group.GetSubgroupsManager r5, X.AnonymousClass147 r6, X.AnonymousClass147 r7, X.C023509x r8) {
        /*
            boolean r0 = r8 instanceof X.C82713z9
            if (r0 == 0) goto L_0x0026
            r4 = r8
            X.3z9 r4 = (X.C82713z9) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0026
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r3 = r4.result
            X.0AO r2 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L_0x0034
            if (r0 != r1) goto L_0x002c
            java.lang.Object r6 = r4.L$1
            X.147 r6 = (X.AnonymousClass147) r6
            java.lang.Object r5 = r4.L$0
            com.whatsapp.group.GetSubgroupsManager r5 = (com.whatsapp.group.GetSubgroupsManager) r5
            goto L_0x0046
        L_0x0026:
            X.3z9 r4 = new X.3z9
            r4.<init>(r5, r8)
            goto L_0x0012
        L_0x002c:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0034:
            X.AnonymousClass0AN.A00(r3)
            com.whatsapp.community.mex.GetSubgroupsGraphQlHandler r0 = r5.A01     // Catch:{ 1Ot -> 0x004f }
            r4.L$0 = r5     // Catch:{ 1Ot -> 0x004f }
            r4.L$1 = r6     // Catch:{ 1Ot -> 0x004f }
            r4.label = r1     // Catch:{ 1Ot -> 0x004f }
            java.lang.Object r3 = r0.A00(r6, r7, r4)     // Catch:{ 1Ot -> 0x004f }
            if (r3 != r2) goto L_0x0049
            return r2
        L_0x0046:
            X.AnonymousClass0AN.A00(r3)     // Catch:{ 1Ot -> 0x004f }
        L_0x0049:
            java.util.List r3 = (java.util.List) r3     // Catch:{ 1Ot -> 0x004f }
            A02(r5, r6, r3)     // Catch:{ 1Ot -> 0x004f }
            goto L_0x0079
        L_0x004f:
            r0 = move-exception
            int r2 = r0.errorCode
            r0 = -1
            if (r2 == r0) goto L_0x0084
            r0 = 400(0x190, float:5.6E-43)
            if (r2 == r0) goto L_0x007c
            r0 = 500(0x1f4, float:7.0E-43)
            if (r2 == r0) goto L_0x007c
            r0 = 403(0x193, float:5.65E-43)
            if (r2 == r0) goto L_0x007c
            r0 = 404(0x194, float:5.66E-43)
            if (r2 == r0) goto L_0x007c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "GetSubgroupsGraphQlHandler/fetch/unknown error: "
        L_0x006c:
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0079:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x007c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "GetSubgroupsGraphQlHandler/fetch/server error: "
            goto L_0x006c
        L_0x0084:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "GetSubgroupsGraphQlHandler/handleData/empty response: "
            goto L_0x006c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.group.GetSubgroupsManager.A01(com.whatsapp.group.GetSubgroupsManager, X.147, X.147, X.09x):java.lang.Object");
    }

    public static final void A02(GetSubgroupsManager getSubgroupsManager, AnonymousClass147 r8, List list) {
        C20350xQ r5 = (C20350xQ) getSubgroupsManager.A04.get();
        Log.i("groupChatManger/onSubGroupsChanged");
        AnonymousClass1LV r1 = r5.A08;
        AnonymousClass00C.A0D(r8, 0);
        AnonymousClass00C.A0D(list, 1);
        C230917d r6 = r1.A08;
        r6.A03();
        r6.A00.A03(r8, list);
        Map map = r6.A01;
        C64213Nc r7 = (C64213Nc) map.get(r8);
        if (r7 == null) {
            r7 = new C64213Nc();
        }
        C64213Nc r3 = new C64213Nc(r7.A00, r7.A01, new HashSet(list));
        for (AnonymousClass3QK r0 : r7.A02) {
            r6.A02.remove(r0.A02);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r6.A02.put(((AnonymousClass3QK) it.next()).A02, r8);
        }
        map.put(r8, r3);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            AnonymousClass3QK r32 = (AnonymousClass3QK) it2.next();
            C65073Qp A09 = r5.A0M.A09(r32.A02, false);
            if (A09 != null) {
                A09.A02 = r32.A00;
            }
        }
        r5.A04.Bp3(new C35721j9(r5, r8, 12));
    }
}
