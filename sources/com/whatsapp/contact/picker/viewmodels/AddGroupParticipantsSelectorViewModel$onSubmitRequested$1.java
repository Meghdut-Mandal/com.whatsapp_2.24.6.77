package com.whatsapp.contact.picker.viewmodels;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import X.C39661tC;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.contact.picker.viewmodels.AddGroupParticipantsSelectorViewModel$onSubmitRequested$1", f = "AddGroupParticipantsSelectorViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AddGroupParticipantsSelectorViewModel$onSubmitRequested$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ boolean $isSelectedContactsAlreadyInCommunity;
    public final /* synthetic */ List $selectedUserJids;
    public int label;
    public final /* synthetic */ C39661tC this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddGroupParticipantsSelectorViewModel$onSubmitRequested$1(C39661tC r2, List list, C023509x r4, boolean z) {
        super(2, r4);
        this.this$0 = r2;
        this.$isSelectedContactsAlreadyInCommunity = z;
        this.$selectedUserJids = list;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new AddGroupParticipantsSelectorViewModel$onSubmitRequested$1(this.this$0, this.$selectedUserJids, r6, this.$isSelectedContactsAlreadyInCommunity);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.label
            if (r0 != 0) goto L_0x00f6
            X.AnonymousClass0AN.A00(r8)
            X.1tC r1 = r7.this$0
            X.147 r4 = r1.A04
            if (r4 == 0) goto L_0x00e2
            boolean r0 = r7.$isSelectedContactsAlreadyInCommunity
            if (r0 != 0) goto L_0x00e2
            java.lang.String r0 = r1.A05
            r3 = 1
            boolean r2 = X.AnonymousClass000.A1V(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "AddGroupParticipantsSelector/ CommunityName is null for "
            java.lang.String r0 = X.AnonymousClass000.A0l(r4, r0, r1)
            X.C18740tg.A0D(r2, r0)
            X.1tC r0 = r7.this$0
            X.12q r1 = r0.A01
            X.147 r0 = r0.A03
            int r1 = r1.A06(r0)
            r0 = 3
            if (r1 == r0) goto L_0x0033
            r3 = 0
        L_0x0033:
            X.1tC r0 = r7.this$0
            X.0yC r1 = r0.A02
            r0 = 5021(0x139d, float:7.036E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x00df
            X.1tC r0 = r7.this$0
            X.1LV r2 = r0.A00
            X.147 r1 = r0.A04
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            X.17d r0 = r2.A08
            r0.A03()
            java.util.Map r0 = r0.A01
            java.lang.Object r0 = r0.get(r1)
            X.3Nc r0 = (X.C64213Nc) r0
            if (r0 == 0) goto L_0x00df
            X.3QK r2 = r0.A01
        L_0x005a:
            X.1tC r1 = r7.this$0
            java.util.List r0 = r7.$selectedUserJids
            int r5 = r0.size()
            if (r3 == 0) goto L_0x00b5
            r4 = 0
            if (r2 == 0) goto L_0x008a
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r0 = 2131755039(0x7f10001f, float:1.9140946E38)
        L_0x006c:
            X.2fu r6 = new X.2fu
            r6.<init>(r1, r0, r5)
        L_0x0071:
            X.1tC r5 = r7.this$0
            X.05L r4 = r5.A07
        L_0x0075:
            java.lang.Object r3 = r4.getValue()
            r2 = 2
            X.147 r1 = r5.A04
            X.3Pz r0 = new X.3Pz
            r0.<init>(r1, r6, r2)
            boolean r0 = r4.B3B(r3, r0)
            if (r0 == 0) goto L_0x0075
        L_0x0087:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x008a:
            boolean r0 = r1.A09
            r3 = 1
            if (r0 == 0) goto L_0x00a5
            java.lang.String r2 = r1.A05
            if (r2 == 0) goto L_0x0097
            r1 = 2131888033(0x7f1207a1, float:1.941069E38)
            goto L_0x00cf
        L_0x0097:
            java.lang.Object[] r1 = new java.lang.Object[r3]
            X.AnonymousClass000.A1L(r1, r5, r4)
            r0 = 2131888034(0x7f1207a2, float:1.9410692E38)
            X.2ft r6 = new X.2ft
            r6.<init>(r1, r0)
            goto L_0x0071
        L_0x00a5:
            java.lang.String r0 = "AddGroupParticipantsSelector/ Expected navigation to be launched from community home, but it was not."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r2 = r1.A05
            r1 = 2131887297(0x7f1204c1, float:1.9409197E38)
            if (r2 == 0) goto L_0x00dc
            r1 = 2131887296(0x7f1204c0, float:1.9409195E38)
            goto L_0x00cf
        L_0x00b5:
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x00c5
            java.lang.String r0 = r1.A05
            if (r0 == 0) goto L_0x00d9
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r4] = r0
            r0 = 2131755352(0x7f100158, float:1.914158E38)
            goto L_0x006c
        L_0x00c5:
            java.lang.String r2 = r1.A05
            r1 = 2131894696(0x7f1221a8, float:1.9424204E38)
            if (r2 == 0) goto L_0x00dc
            r1 = 2131894695(0x7f1221a7, float:1.9424202E38)
        L_0x00cf:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r4] = r2
        L_0x00d3:
            X.2ft r6 = new X.2ft
            r6.<init>(r0, r1)
            goto L_0x0071
        L_0x00d9:
            r1 = 2131894698(0x7f1221aa, float:1.9424208E38)
        L_0x00dc:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            goto L_0x00d3
        L_0x00df:
            r2 = 0
            goto L_0x005a
        L_0x00e2:
            X.05L r4 = r1.A07
        L_0x00e4:
            java.lang.Object r3 = r4.getValue()
            r2 = 0
            r1 = 1
            X.3Pz r0 = new X.3Pz
            r0.<init>(r2, r2, r1)
            boolean r0 = r4.B3B(r3, r0)
            if (r0 == 0) goto L_0x00e4
            goto L_0x0087
        L_0x00f6:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.picker.viewmodels.AddGroupParticipantsSelectorViewModel$onSubmitRequested$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AddGroupParticipantsSelectorViewModel$onSubmitRequested$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
