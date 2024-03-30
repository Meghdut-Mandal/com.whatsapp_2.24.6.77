package com.whatsapp.community.iq;

import X.AnonymousClass000;
import X.AnonymousClass03N;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AK;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass147;
import X.C009003v;
import X.C023509x;
import X.C124245xp;
import X.C62863Hv;
import X.C70033eU;
import X.C87164Ns;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.iq.GetGroupProfilePicturesProtocolHelper$sendGetGroupProfilePicturesRequestAsync$1", f = "GetGroupProfilePicturesProtocolHelper.kt", i = {0}, l = {80}, m = "invokeSuspend", n = {"iqId"}, s = {"L$0"})
public final class GetGroupProfilePicturesProtocolHelper$sendGetGroupProfilePicturesRequestAsync$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C87164Ns $callback;
    public final /* synthetic */ Map $otherGroupJidPhotoIdMap;
    public final /* synthetic */ AnonymousClass147 $parentGroupJid;
    public final /* synthetic */ AnonymousClass147 $subgroupJidMeParticipating;
    public Object L$0;
    public int label;
    public final /* synthetic */ GetGroupProfilePicturesProtocolHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetGroupProfilePicturesProtocolHelper$sendGetGroupProfilePicturesRequestAsync$1(GetGroupProfilePicturesProtocolHelper getGroupProfilePicturesProtocolHelper, C87164Ns r3, AnonymousClass147 r4, AnonymousClass147 r5, Map map, C023509x r7) {
        super(2, r7);
        this.this$0 = getGroupProfilePicturesProtocolHelper;
        this.$parentGroupJid = r4;
        this.$otherGroupJidPhotoIdMap = map;
        this.$subgroupJidMeParticipating = r5;
        this.$callback = r3;
    }

    public final C023509x create(Object obj, C023509x r9) {
        GetGroupProfilePicturesProtocolHelper getGroupProfilePicturesProtocolHelper = this.this$0;
        AnonymousClass147 r3 = this.$parentGroupJid;
        Map map = this.$otherGroupJidPhotoIdMap;
        return new GetGroupProfilePicturesProtocolHelper$sendGetGroupProfilePicturesRequestAsync$1(getGroupProfilePicturesProtocolHelper, this.$callback, r3, this.$subgroupJidMeParticipating, map, r9);
    }

    public final Object invokeSuspend(Object obj) {
        Object A01;
        AnonymousClass0AO r7 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            String A09 = this.this$0.A01.A09();
            GetGroupProfilePicturesProtocolHelper getGroupProfilePicturesProtocolHelper = this.this$0;
            AnonymousClass147 r2 = this.$parentGroupJid;
            Map map = this.$otherGroupJidPhotoIdMap;
            AnonymousClass147 r0 = this.$subgroupJidMeParticipating;
            this.L$0 = A09;
            this.label = 1;
            A01 = getGroupProfilePicturesProtocolHelper.A01(r2, r0, map, this);
            if (A01 == r7) {
                return r7;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
            A01 = ((AnonymousClass0AK) obj).value;
        } else {
            throw AnonymousClass000.A0e();
        }
        if (!(A01 instanceof AnonymousClass03N)) {
            C87164Ns r5 = this.$callback;
            AnonymousClass0AN.A00(A01);
            C62863Hv r6 = (C62863Hv) A01;
            C70033eU r52 = (C70033eU) r5;
            for (C124245xp A04 : r6.A01) {
                r52.A00.A0k.A04(A04, r6.A00);
            }
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GetGroupProfilePicturesProtocolHelper$sendGetGroupProfilePicturesRequestAsync$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
