package com.whatsapp.group;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass0AP;
import X.AnonymousClass147;
import X.AnonymousClass2VA;
import X.AnonymousClass2VB;
import X.AnonymousClass4O8;
import X.C009003v;
import X.C023509x;
import X.C07710Yz;
import X.C184058rp;
import X.C184818t3;
import X.C36321k7;
import X.C36331k8;
import X.C36391kE;
import X.C36401kF;
import X.C46222Vo;
import X.C46232Vp;
import X.C54432sw;
import X.C75043ma;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.group.CreateSubGroupSuggestionProtocolHelper$sendExistingGroupSuggestionWithCallback$1", f = "CreateSubGroupSuggestionProtocolHelper.kt", i = {}, l = {176}, m = "invokeSuspend", n = {}, s = {})
public final class CreateSubGroupSuggestionProtocolHelper$sendExistingGroupSuggestionWithCallback$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass4O8 $createExistingGroupSuggestionCallback;
    public final /* synthetic */ List $groupJids;
    public final /* synthetic */ AnonymousClass147 $linkedParentGroupJid;
    public int label;
    public final /* synthetic */ CreateSubGroupSuggestionProtocolHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateSubGroupSuggestionProtocolHelper$sendExistingGroupSuggestionWithCallback$1(AnonymousClass4O8 r2, CreateSubGroupSuggestionProtocolHelper createSubGroupSuggestionProtocolHelper, AnonymousClass147 r4, List list, C023509x r6) {
        super(2, r6);
        this.this$0 = createSubGroupSuggestionProtocolHelper;
        this.$linkedParentGroupJid = r4;
        this.$groupJids = list;
        this.$createExistingGroupSuggestionCallback = r2;
    }

    public final C023509x create(Object obj, C023509x r8) {
        return new CreateSubGroupSuggestionProtocolHelper$sendExistingGroupSuggestionWithCallback$1(this.$createExistingGroupSuggestionCallback, this.this$0, this.$linkedParentGroupJid, this.$groupJids, r8);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass4O8 r3;
        int i;
        AnonymousClass0AP r32;
        Object obj2;
        C184058rp r0;
        AnonymousClass0AO r7 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            AnonymousClass0AN.A00(obj);
            CreateSubGroupSuggestionProtocolHelper createSubGroupSuggestionProtocolHelper = this.this$0;
            AnonymousClass147 r4 = this.$linkedParentGroupJid;
            List list = this.$groupJids;
            ArrayList A0J = C36321k7.A0J(list);
            for (Object next : list) {
                AnonymousClass00C.A0E(next, "null cannot be cast to non-null type com.whatsapp.jid.PermanentGroupJid");
                A0J.add(next);
            }
            List A01 = C07710Yz.A01(A0J);
            this.label = 1;
            obj = createSubGroupSuggestionProtocolHelper.A01(r4, A01, this);
            if (obj == r7) {
                return r7;
            }
        } else if (i2 == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        C54432sw r9 = (C54432sw) obj;
        if (r9 instanceof AnonymousClass2VA) {
            List list2 = ((AnonymousClass2VA) r9).A00;
            if (C36401kF.A1a(list2)) {
                int size = this.$groupJids.size();
                r3 = this.$createExistingGroupSuggestionCallback;
                if (size == 1) {
                    C184818t3 r02 = (C184818t3) C36391kE.A0t(list2);
                    if (!(r02 == null || (r0 = (C184058rp) r02.A01) == null)) {
                        int i3 = r0.A00;
                        i = R.string.f12nameremoved;
                        if (i3 != 1) {
                            i = R.string.f12nameremoved;
                            if (i3 != 4) {
                                if (i3 == 3) {
                                    i = R.string.f12nameremoved;
                                } else {
                                    Log.e("CreateSubFroupSuggestionProcotolHendler/unknown error");
                                }
                            }
                        }
                    }
                    i = R.string.f12nameremoved;
                } else {
                    C75043ma r33 = (C75043ma) r3;
                    int size2 = r33.A01.size();
                    r32 = r33.A02;
                    obj2 = new C46232Vp(size2, size2 - list2.size());
                    r32.resumeWith(obj2);
                    return AnonymousClass0AJ.A00;
                }
            } else {
                C75043ma r03 = (C75043ma) this.$createExistingGroupSuggestionCallback;
                AnonymousClass0AP r34 = r03.A02;
                List list3 = r03.A01;
                r34.resumeWith(new C46232Vp(list3.size(), list3.size()));
                return AnonymousClass0AJ.A00;
            }
        } else {
            if (r9 instanceof AnonymousClass2VB) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("sendExistingGroupSuggestionWrapperForJavaCaller/Request failed for suggested existing group ");
                C36331k8.A1P(this.$groupJids, A0u);
                r3 = this.$createExistingGroupSuggestionCallback;
                i = R.string.f12nameremoved;
            }
            return AnonymousClass0AJ.A00;
        }
        r32 = ((C75043ma) r3).A02;
        obj2 = new C46222Vo(i);
        r32.resumeWith(obj2);
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CreateSubGroupSuggestionProtocolHelper$sendExistingGroupSuggestionWithCallback$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
