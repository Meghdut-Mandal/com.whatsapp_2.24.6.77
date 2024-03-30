package com.whatsapp.calling.avatar.data;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass52G;
import X.AnonymousClass5AJ;
import X.C009003v;
import X.C023509x;
import X.C123815x8;
import X.C1274768l;
import X.C36351kA;
import X.C90524aI;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.avatar.data.PersonalizedAvatarRepository$fetchARClass$2", f = "PersonalizedAvatarRepository.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
public final class PersonalizedAvatarRepository$fetchARClass$2 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ PersonalizedAvatarRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PersonalizedAvatarRepository$fetchARClass$2(PersonalizedAvatarRepository personalizedAvatarRepository, C023509x r3) {
        super(2, r3);
        this.this$0 = personalizedAvatarRepository;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new PersonalizedAvatarRepository$fetchARClass$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new PersonalizedAvatarRepository$fetchARClass$2(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        int i;
        AnonymousClass0AO r4 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            AnonymousClass0AN.A00(obj);
            PersonalizedAvatarRepository personalizedAvatarRepository = this.this$0;
            AnonymousClass5AJ r0 = personalizedAvatarRepository.A00;
            this.label = 1;
            obj = PersonalizedAvatarRepository.A00(personalizedAvatarRepository, r0, "PersonalizedAvatarRepository/fetchARClass", this);
            if (obj == r4) {
                return r4;
            }
        } else if (i2 == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        C1274768l r02 = (C1274768l) PersonalizedAvatarRepository.A01((C123815x8) obj, "PersonalizedAvatarRepository/fetchARClass");
        if (r02 != null) {
            List list = r02.A00.A00;
            if (list.size() > 1) {
                i = C36351kA.A06(list, 1);
            } else {
                i = 0;
            }
            return C90524aI.A0a(i);
        }
        throw AnonymousClass52G.A00;
    }
}
