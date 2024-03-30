package com.whatsapp.calling.psa.viewmodel;

import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.psa.viewmodel.GroupCallPsaViewModel$fetchSuggestions$1", f = "GroupCallPsaViewModel.kt", i = {1}, l = {37, 39}, m = "invokeSuspend", n = {"suggestions"}, s = {"L$0"})
public final class GroupCallPsaViewModel$fetchSuggestions$1 extends AnonymousClass0A1 implements C009003v {
    public Object L$0;
    public int label;
    public final /* synthetic */ GroupCallPsaViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupCallPsaViewModel$fetchSuggestions$1(GroupCallPsaViewModel groupCallPsaViewModel, C023509x r3) {
        super(2, r3);
        this.this$0 = groupCallPsaViewModel;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new GroupCallPsaViewModel$fetchSuggestions$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new GroupCallPsaViewModel$fetchSuggestions$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004b, code lost:
        if (r7 == r4) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.0AO r4 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r6.label
            r3 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0038
            if (r0 == r1) goto L_0x004e
            if (r0 != r3) goto L_0x0084
            java.lang.Object r0 = r6.L$0
            java.util.List r0 = (java.util.List) r0
            X.AnonymousClass0AN.A00(r7)
        L_0x0013:
            com.whatsapp.calling.psa.viewmodel.GroupCallPsaViewModel r5 = r6.this$0
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            java.util.Iterator r3 = r0.iterator()
        L_0x001d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0074
            X.141 r2 = X.C36391kE.A0f(r3)
            X.171 r0 = r5.A01
            java.lang.String r1 = r0.A0H(r2)
            if (r1 == 0) goto L_0x001d
            X.3Ho r0 = new X.3Ho
            r0.<init>(r2, r1)
            r4.add(r0)
            goto L_0x001d
        L_0x0038:
            X.AnonymousClass0AN.A00(r7)
            com.whatsapp.calling.psa.viewmodel.GroupCallPsaViewModel r0 = r6.this$0
            X.39l r2 = r0.A00
            r6.label = r1
            r1 = 0
            com.whatsapp.calling.psa.data.GroupCallPsaDatasourceImpl$loadSuggestions$2 r0 = new com.whatsapp.calling.psa.data.GroupCallPsaDatasourceImpl$loadSuggestions$2
            r0.<init>(r2, r1)
            java.lang.Object r7 = X.C009403z.A00(r6, r0)
            if (r7 != r4) goto L_0x0051
        L_0x004d:
            return r4
        L_0x004e:
            X.AnonymousClass0AN.A00(r7)
        L_0x0051:
            java.util.List r7 = (java.util.List) r7
            com.whatsapp.calling.psa.viewmodel.GroupCallPsaViewModel r0 = r6.this$0
            X.0sR r1 = r0.A02
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x006e
            X.2De r0 = new X.2De
            r0.<init>()
        L_0x0062:
            r6.L$0 = r7
            r6.label = r3
            java.lang.Object r0 = r1.Bpf(r0, r6)
            if (r0 == r4) goto L_0x004d
            r0 = r7
            goto L_0x0013
        L_0x006e:
            X.2Dd r0 = new X.2Dd
            r0.<init>()
            goto L_0x0062
        L_0x0074:
            X.05L r2 = r5.A04
            r1 = 2131890074(0x7f120f9a, float:1.941483E38)
            X.3Pq r0 = new X.3Pq
            r0.<init>(r1, r4)
            r2.setValue(r0)
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0084:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.psa.viewmodel.GroupCallPsaViewModel$fetchSuggestions$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
