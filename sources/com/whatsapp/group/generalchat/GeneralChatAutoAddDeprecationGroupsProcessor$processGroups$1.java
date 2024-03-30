package com.whatsapp.group.generalchat;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass11F;
import X.AnonymousClass147;
import X.AnonymousClass16D;
import X.AnonymousClass1PS;
import X.AnonymousClass4KA;
import X.AnonymousClass97S;
import X.C009003v;
import X.C023509x;
import X.C12380hx;
import X.C15060md;
import X.C181508na;
import X.C18650tV;
import X.C188518zi;
import X.C19970wo;
import X.C20350xQ;
import X.C220412q;
import X.C27531Oo;
import X.C36411kG;
import X.C64933Qa;
import X.C65533Sl;
import com.whatsapp.util.Log;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.group.generalchat.GeneralChatAutoAddDeprecationGroupsProcessor$processGroups$1", f = "GeneralChatAutoAddDeprecationGroupsProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class GeneralChatAutoAddDeprecationGroupsProcessor$processGroups$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ Set $groupJids;
    public int label;
    public final /* synthetic */ AnonymousClass1PS this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GeneralChatAutoAddDeprecationGroupsProcessor$processGroups$1(AnonymousClass1PS r2, Set set, C023509x r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$groupJids = set;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new GeneralChatAutoAddDeprecationGroupsProcessor$processGroups$1(this.this$0, this.$groupJids, r5);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass1PS r8 = this.this$0;
            Set set = this.$groupJids;
            if (r8.A04.A0E(5021)) {
                AnonymousClass00C.A0D(set, 0);
                C12380hx r7 = new C12380hx(C15060md.A02(new AnonymousClass4KA(r8), new C18650tV(set, 0)));
                while (r7.hasNext()) {
                    C20350xQ r2 = (C20350xQ) r8.A06.get();
                    C64933Qa A0o = C36411kG.A0o((AnonymousClass11F) r7.next(), r8.A05);
                    long A00 = C19970wo.A00(r8.A01);
                    String str2 = C188518zi.AUTO_ADD_DISABLED_BY_SERVER.reason;
                    AnonymousClass147 A02 = C65533Sl.A02(A0o.A00);
                    AnonymousClass16D r5 = r2.A0C;
                    if (r5.A0A(A02) == null) {
                        str = "groupmgr/onGroupAutoAddDisabled/new group";
                    } else if (!r2.A0U.A0C(A02)) {
                        str = "groupmgr/onGroupAutoAddDisabled/not participant";
                    } else {
                        C220412q r1 = r2.A0M;
                        if (r1.A0S(A02)) {
                            r5.A0Y(A02);
                            r2.A08.A02(A02);
                            String A0D = r1.A0D(A02);
                            C27531Oo r22 = r2.A0c;
                            C188518zi A002 = AnonymousClass97S.A00(str2);
                            C181508na r12 = new C181508na(A0o, A00);
                            r12.A1i(A02, A0D, A002.versionId);
                            r12.A16(A0D);
                            r12.A0q((AnonymousClass11F) null);
                            r22.BJb(r12, 2);
                        }
                    }
                    Log.i(str);
                }
            }
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GeneralChatAutoAddDeprecationGroupsProcessor$processGroups$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
