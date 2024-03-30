package X;

import com.whatsapp.contact.picker.AddGroupParticipantsSelector;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: X.49v  reason: invalid class name and case insensitive filesystem */
public final class C835549v extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AddGroupParticipantsSelector this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C835549v(AddGroupParticipantsSelector addGroupParticipantsSelector) {
        super(0);
        this.this$0 = addGroupParticipantsSelector;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Set<Object> A16;
        AddGroupParticipantsSelector addGroupParticipantsSelector = this.this$0;
        String[] stringArrayExtra = addGroupParticipantsSelector.getIntent().getStringArrayExtra("contacts_loader_keys");
        AnonymousClass313 r5 = addGroupParticipantsSelector.A05;
        if (r5 != null) {
            if (stringArrayExtra != null) {
                A16 = AnonymousClass02R.A0E(stringArrayExtra);
            } else {
                A16 = C36441kJ.A16();
            }
            Set set = (Set) addGroupParticipantsSelector.A0O.getValue();
            if (set == null) {
                set = C36411kG.A15(C70263es.A00);
            }
            if (!A16.isEmpty()) {
                ArrayList A0I = AnonymousClass001.A0I();
                for (Object obj : A16) {
                    Object obj2 = r5.A00.get(obj);
                    if (obj2 != null) {
                        A0I.add(obj2);
                    }
                }
                Set A0f = C007103b.A0f(A0I);
                if (!A0f.isEmpty()) {
                    return new AnonymousClass314(A0f);
                }
            }
            return new AnonymousClass314(set);
        }
        throw C36331k8.A0d("contactsLoaderFactory");
    }
}
