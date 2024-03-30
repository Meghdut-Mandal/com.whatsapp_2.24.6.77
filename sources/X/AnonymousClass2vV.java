package X;

import com.whatsapp.calling.psa.view.GroupCallPsaActivity;
import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel;

/* renamed from: X.2vV  reason: invalid class name */
public class AnonymousClass2vV implements C16960qU, AnonymousClass05G {
    public Object A00;
    public final int A01;

    public AnonymousClass2vV(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003f, code lost:
        if ((r5 instanceof X.AnonymousClass2De) != false) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object B6N(java.lang.Object r5, X.C023509x r6) {
        /*
            r4 = this;
            int r0 = r4.A01
            if (r0 == 0) goto L_0x0013
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r0 = r4.A00
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r0 = (com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel) r0
            java.lang.Object r1 = com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel.A02(r0, r5, r6)
            X.0AO r0 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            if (r1 != r0) goto L_0x003a
            return r1
        L_0x0013:
            java.lang.Object r3 = r4.A00
            com.whatsapp.calling.psa.view.GroupCallPsaActivity r3 = (com.whatsapp.calling.psa.view.GroupCallPsaActivity) r3
            boolean r0 = r5 instanceof X.AnonymousClass2Dd
            if (r0 == 0) goto L_0x003d
            X.0yC r1 = r3.A0D
            r0 = 5710(0x164e, float:8.001E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0041
            com.whatsapp.calling.psa.view.GroupCallPsaBottomSheet r2 = new com.whatsapp.calling.psa.view.GroupCallPsaBottomSheet
            r2.<init>()
            X.497 r0 = new X.497
            r0.<init>(r3)
            r2.A02 = r0
            X.01z r1 = r3.getSupportFragmentManager()
            java.lang.String r0 = "GroupCallPsaBottomSheet"
            r2.A1f(r1, r0)
        L_0x003a:
            X.0AJ r1 = X.AnonymousClass0AJ.A00
            return r1
        L_0x003d:
            boolean r0 = r5 instanceof X.AnonymousClass2De
            if (r0 == 0) goto L_0x003a
        L_0x0041:
            r0 = 48
            android.content.Intent r0 = X.C36381kD.A0C(r3, r0)
            r3.startActivity(r0)
            r3.finish()
            goto L_0x003a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2vV.B6N(java.lang.Object, X.09x):java.lang.Object");
    }

    public final AnonymousClass00P BC8() {
        int i = this.A01;
        Object obj = this.A00;
        if (i != 0) {
            return new C03030Cw(2, obj, MemberSuggestedGroupsManagementViewModel.class, "onLoadingStates", "onLoadingStates(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }
        return new C12680iU(2, obj, GroupCallPsaActivity.class, "handleSuggestionResult", "handleSuggestionResult(Lcom/whatsapp/calling/psa/viewmodel/SuggestionResult;)V", 4);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass05G) || !(obj instanceof C16960qU)) {
            return false;
        }
        return AnonymousClass00C.A0J(BC8(), ((C16960qU) obj).BC8());
    }

    public final int hashCode() {
        return BC8().hashCode();
    }
}
