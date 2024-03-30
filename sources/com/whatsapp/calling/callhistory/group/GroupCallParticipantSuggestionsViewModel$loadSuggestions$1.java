package com.whatsapp.calling.callhistory.group;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass16D;
import X.AnonymousClass63R;
import X.AnonymousClass6O7;
import X.C007103b;
import X.C009003v;
import X.C009403z;
import X.C023409w;
import X.C023509x;
import X.C36321k7;
import X.C36361kB;
import X.C36381kD;
import X.C36391kE;
import android.os.SystemClock;
import com.whatsapp.contact.extensions.ContactManagerExtKt$asWaContacts$2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.callhistory.group.GroupCallParticipantSuggestionsViewModel$loadSuggestions$1", f = "GroupCallParticipantSuggestionsViewModel.kt", i = {0}, l = {65}, m = "invokeSuspend", n = {"selectedJids"}, s = {"L$0"})
public final class GroupCallParticipantSuggestionsViewModel$loadSuggestions$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ List $selectedContacts;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ GroupCallParticipantSuggestionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupCallParticipantSuggestionsViewModel$loadSuggestions$1(GroupCallParticipantSuggestionsViewModel groupCallParticipantSuggestionsViewModel, List list, C023509x r4) {
        super(2, r4);
        this.this$0 = groupCallParticipantSuggestionsViewModel;
        this.$selectedContacts = list;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new GroupCallParticipantSuggestionsViewModel$loadSuggestions$1(this.this$0, this.$selectedContacts, r5);
    }

    public final Object invokeSuspend(Object obj) {
        Set A0f;
        GroupCallParticipantSuggestionsViewModel groupCallParticipantSuggestionsViewModel;
        AnonymousClass0AO r4 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            GroupCallParticipantSuggestionsViewModel groupCallParticipantSuggestionsViewModel2 = this.this$0;
            long uptimeMillis = SystemClock.uptimeMillis();
            groupCallParticipantSuggestionsViewModel2.A01 = ((AnonymousClass63R) groupCallParticipantSuggestionsViewModel2.A07.getValue()).A00(C023409w.A00);
            this.this$0.A00 = SystemClock.uptimeMillis() - uptimeMillis;
            List list = this.$selectedContacts;
            ArrayList A0J = C36321k7.A0J(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C36361kB.A1S(A0J, it);
            }
            A0f = C007103b.A0f(A0J);
            groupCallParticipantSuggestionsViewModel = this.this$0;
            AnonymousClass6O7 r0 = groupCallParticipantSuggestionsViewModel.A01;
            if (r0 != null) {
                List list2 = r0.A00;
                AnonymousClass16D r2 = groupCallParticipantSuggestionsViewModel.A05;
                this.L$0 = A0f;
                this.L$1 = groupCallParticipantSuggestionsViewModel;
                this.label = 1;
                obj = C009403z.A00(this, new ContactManagerExtKt$asWaContacts$2(r2, list2, (C023509x) null));
                if (obj == r4) {
                    return r4;
                }
            } else {
                throw C36381kD.A0l();
            }
        } else if (i == 1) {
            groupCallParticipantSuggestionsViewModel = (GroupCallParticipantSuggestionsViewModel) this.L$1;
            A0f = (Set) this.L$0;
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        Iterable iterable = (Iterable) obj;
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            C36391kE.A1O(C36391kE.A0f(it2), A0f);
        }
        groupCallParticipantSuggestionsViewModel.A02 = (List) iterable;
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GroupCallParticipantSuggestionsViewModel$loadSuggestions$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
