package com.whatsapp.calling.avatar.data;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass6CC;
import X.AnonymousClass6GG;
import X.C007103b;
import X.C009003v;
import X.C023509x;
import X.C119335pe;
import X.C123815x8;
import X.C1274468i;
import X.C1274968n;
import X.C1275068o;
import X.C146026uu;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.avatar.data.PersonalizedAvatarRepository$fetchMetadata$2", f = "PersonalizedAvatarRepository.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {})
public final class PersonalizedAvatarRepository$fetchMetadata$2 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ PersonalizedAvatarRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PersonalizedAvatarRepository$fetchMetadata$2(PersonalizedAvatarRepository personalizedAvatarRepository, C023509x r3) {
        super(2, r3);
        this.this$0 = personalizedAvatarRepository;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new PersonalizedAvatarRepository$fetchMetadata$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new PersonalizedAvatarRepository$fetchMetadata$2(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r1 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C119335pe r3 = this.this$0.A01;
            C146026uu B3y = r3.A01.B3y(new AnonymousClass6GG(r3, 1));
            PersonalizedAvatarRepository personalizedAvatarRepository = this.this$0;
            this.label = 1;
            obj = PersonalizedAvatarRepository.A00(personalizedAvatarRepository, B3y, "PersonalizedAvatarRepository/fetchMetadata", this);
            if (obj == r1) {
                return r1;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        C1275068o r0 = (C1275068o) PersonalizedAvatarRepository.A01((C123815x8) obj, "PersonalizedAvatarRepository/fetchMetadata");
        AnonymousClass6CC r12 = null;
        if (r0 == null) {
            return null;
        }
        C1274968n r02 = (C1274968n) C007103b.A0M(r0.A00);
        if (r02 != null) {
            r12 = (AnonymousClass6CC) C007103b.A0M(r02.A00.A00);
        }
        return new C1274468i(r12);
    }
}
