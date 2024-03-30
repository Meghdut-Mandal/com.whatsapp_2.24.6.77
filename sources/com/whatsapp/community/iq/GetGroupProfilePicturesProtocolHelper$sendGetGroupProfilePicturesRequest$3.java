package com.whatsapp.community.iq;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AK;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass0AR;
import X.AnonymousClass147;
import X.AnonymousClass19A;
import X.BAV;
import X.C009003v;
import X.C023509x;
import X.C16400pB;
import X.C185648uZ;
import X.C185658ua;
import X.C185718ug;
import X.C185738ui;
import X.C186018vH;
import X.C203399nx;
import X.C36371kC;
import X.C36441kJ;
import X.C50592lA;
import X.C50632lE;
import X.C90514aH;
import X.C90524aI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.iq.GetGroupProfilePicturesProtocolHelper$sendGetGroupProfilePicturesRequest$3", f = "GetGroupProfilePicturesProtocolHelper.kt", i = {}, l = {300}, m = "invokeSuspend", n = {}, s = {})
public final class GetGroupProfilePicturesProtocolHelper$sendGetGroupProfilePicturesRequest$3 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ String $iqId;
    public final /* synthetic */ Map $otherGroupJidPhotoIdMap;
    public final /* synthetic */ AnonymousClass147 $parentGroupJid;
    public final /* synthetic */ AnonymousClass147 $subgroupJidMeParticipating;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public final /* synthetic */ GetGroupProfilePicturesProtocolHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetGroupProfilePicturesProtocolHelper$sendGetGroupProfilePicturesRequest$3(GetGroupProfilePicturesProtocolHelper getGroupProfilePicturesProtocolHelper, AnonymousClass147 r3, AnonymousClass147 r4, String str, Map map, C023509x r7) {
        super(2, r7);
        this.this$0 = getGroupProfilePicturesProtocolHelper;
        this.$iqId = str;
        this.$parentGroupJid = r3;
        this.$otherGroupJidPhotoIdMap = map;
        this.$subgroupJidMeParticipating = r4;
    }

    public final C023509x create(Object obj, C023509x r9) {
        GetGroupProfilePicturesProtocolHelper getGroupProfilePicturesProtocolHelper = this.this$0;
        String str = this.$iqId;
        return new GetGroupProfilePicturesProtocolHelper$sendGetGroupProfilePicturesRequest$3(getGroupProfilePicturesProtocolHelper, this.$parentGroupJid, this.$subgroupJidMeParticipating, str, this.$otherGroupJidPhotoIdMap, r9);
    }

    public final Object invokeSuspend(Object obj) {
        C185718ug r7;
        Object obj2 = obj;
        AnonymousClass0AO r3 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj2);
            GetGroupProfilePicturesProtocolHelper getGroupProfilePicturesProtocolHelper = this.this$0;
            String str = this.$iqId;
            AnonymousClass147 r9 = this.$parentGroupJid;
            Map map = this.$otherGroupJidPhotoIdMap;
            AnonymousClass147 r11 = this.$subgroupJidMeParticipating;
            this.L$0 = getGroupProfilePicturesProtocolHelper;
            this.L$1 = str;
            this.L$2 = r9;
            this.L$3 = map;
            this.L$4 = r11;
            this.label = 1;
            AnonymousClass0AR A12 = C36371kC.A12(this);
            try {
                ArrayList A14 = C36441kJ.A14(map.size());
                Iterator A0y = AnonymousClass000.A0y(map);
                while (true) {
                    r7 = null;
                    if (!A0y.hasNext()) {
                        break;
                    }
                    Map.Entry A11 = AnonymousClass000.A11(A0y);
                    AnonymousClass147 r10 = (AnonymousClass147) A11.getKey();
                    String A10 = C90514aH.A10(A11);
                    if (A10 != null) {
                        r7 = new C185718ug(A10, 15);
                    }
                    C185658ua r6 = new C185658ua();
                    A14.add(new C185648uZ(r7, new C50632lE(r10, 1), new C50592lA(), r6));
                }
                if (r11 != null) {
                    r7 = new C185718ug(r11);
                }
                C186018vH r1 = new C186018vH(r7, (C16400pB) new C185738ui(r9, new C185718ug(str, 12)), (List) A14);
                AnonymousClass19A r112 = getGroupProfilePicturesProtocolHelper.A01;
                C203399nx r13 = r1.A00;
                AnonymousClass00C.A08(r13);
                r112.A0E(new BAV(getGroupProfilePicturesProtocolHelper, r1, A12, 0), r13, str, 375, GetGroupProfilePicturesProtocolHelper.A04);
            } catch (Exception e) {
                A12.resumeWith(new AnonymousClass0AK(C90524aI.A0t(e)));
            }
            obj2 = A12.A0G();
            if (obj2 == r3) {
                return r3;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj2);
        } else {
            throw AnonymousClass000.A0e();
        }
        return obj2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GetGroupProfilePicturesProtocolHelper$sendGetGroupProfilePicturesRequest$3) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
