package com.whatsapp.group;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass147;
import X.AnonymousClass2VC;
import X.AnonymousClass2VD;
import X.AnonymousClass3B1;
import X.AnonymousClass3KN;
import X.AnonymousClass3QC;
import X.C009003v;
import X.C023509x;
import X.C1503574y;
import X.C225314u;
import X.C36321k7;
import X.C54442sx;
import X.C80253v6;
import android.app.Activity;
import android.content.res.Resources;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.group.SuggestGroupResultHandler$sendNewGroupSuggestionInCoroutineScope$2", f = "SuggestGroupResultHandler.kt", i = {}, l = {134}, m = "invokeSuspend", n = {}, s = {})
public final class SuggestGroupResultHandler$sendNewGroupSuggestionInCoroutineScope$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ String $groupDescription;
    public final /* synthetic */ String $groupName;
    public final /* synthetic */ AnonymousClass3QC $groupPermissionsRequestParams;
    public final /* synthetic */ AnonymousClass147 $linkedParentGroupJid;
    public int label;
    public final /* synthetic */ AnonymousClass3B1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuggestGroupResultHandler$sendNewGroupSuggestionInCoroutineScope$2(AnonymousClass3QC r2, AnonymousClass3B1 r3, AnonymousClass147 r4, String str, String str2, C023509x r7) {
        super(2, r7);
        this.this$0 = r3;
        this.$linkedParentGroupJid = r4;
        this.$groupName = str;
        this.$groupDescription = str2;
        this.$groupPermissionsRequestParams = r2;
    }

    public final C023509x create(Object obj, C023509x r9) {
        return new SuggestGroupResultHandler$sendNewGroupSuggestionInCoroutineScope$2(this.$groupPermissionsRequestParams, this.this$0, this.$linkedParentGroupJid, this.$groupName, this.$groupDescription, r9);
    }

    public final Object invokeSuspend(Object obj) {
        String quantityString;
        AnonymousClass0AO r2 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            CreateSubGroupSuggestionProtocolHelper createSubGroupSuggestionProtocolHelper = this.this$0.A08;
            AnonymousClass147 r5 = this.$linkedParentGroupJid;
            String str = this.$groupName;
            String str2 = this.$groupDescription;
            AnonymousClass3QC r4 = this.$groupPermissionsRequestParams;
            this.label = 1;
            obj = createSubGroupSuggestionProtocolHelper.A00(r4, r5, str, str2, this);
            if (obj == r2) {
                return r2;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        C54442sx r9 = (C54442sx) obj;
        if (r9 instanceof AnonymousClass2VC) {
            AnonymousClass3KN r22 = ((AnonymousClass2VC) r9).A00;
            this.this$0.A05.A04(r22, this.$linkedParentGroupJid);
            Activity activity = this.this$0.A01;
            AnonymousClass00C.A0E(activity, "null cannot be cast to non-null type com.whatsapp.DialogActivity");
            ((C225314u) activity).Bnv();
            AnonymousClass3B1 r3 = this.this$0;
            AnonymousClass147 r52 = this.$linkedParentGroupJid;
            AnonymousClass147 r42 = r22.A02;
            Activity activity2 = r3.A01;
            if (activity2.isFinishing() || activity2.isDestroyed()) {
                Log.w("SuggestGroupResultHandler/skipping result snackbar as hosting activity state changed");
            } else {
                Resources resources = activity2.getResources();
                if (!(resources == null || (quantityString = resources.getQuantityString(R.plurals.f10nameremoved, 1)) == null)) {
                    r3.A04.A0H(new C1503574y(r3, r42, r52, quantityString, 15));
                }
            }
        } else if (r9 instanceof AnonymousClass2VD) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("SuggestGroupResultHandler/Request failed for suggested group ");
            C36321k7.A1Z(A0u, this.$groupName);
            Activity activity3 = this.this$0.A01;
            AnonymousClass00C.A0E(activity3, "null cannot be cast to non-null type com.whatsapp.DialogActivity");
            ((C225314u) activity3).Bnv();
            AnonymousClass3B1 r23 = this.this$0;
            C80253v6.A00(r23.A04, r23, 11);
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SuggestGroupResultHandler$sendNewGroupSuggestionInCoroutineScope$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
