package com.whatsapp.group;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass147;
import X.AnonymousClass3B1;
import X.AnonymousClass3QC;
import X.C009003v;
import X.C023509x;
import X.C36401kF;
import android.os.Bundle;
import com.whatsapp.R;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.group.SuggestGroupResultHandler$onResult$1$1$1", f = "SuggestGroupResultHandler.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
public final class SuggestGroupResultHandler$onResult$1$1$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ String $groupDescription;
    public final /* synthetic */ String $groupName;
    public final /* synthetic */ AnonymousClass147 $linkedParentGroupJid;
    public final /* synthetic */ Bundle $settingValuesBundle;
    public int label;
    public final /* synthetic */ AnonymousClass3B1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuggestGroupResultHandler$onResult$1$1$1(Bundle bundle, AnonymousClass3B1 r3, AnonymousClass147 r4, String str, String str2, C023509x r7) {
        super(2, r7);
        this.this$0 = r3;
        this.$linkedParentGroupJid = r4;
        this.$groupName = str;
        this.$groupDescription = str2;
        this.$settingValuesBundle = bundle;
    }

    public final C023509x create(Object obj, C023509x r9) {
        return new SuggestGroupResultHandler$onResult$1$1$1(this.$settingValuesBundle, this.this$0, this.$linkedParentGroupJid, this.$groupName, this.$groupDescription, r9);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass3QC r8;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        AnonymousClass0AO r2 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass3B1 r9 = this.this$0;
            AnonymousClass147 r10 = this.$linkedParentGroupJid;
            String str = this.$groupName;
            String str2 = this.$groupDescription;
            Boolean bool4 = null;
            if (r9.A07.A0E(7180)) {
                Bundle bundle = this.$settingValuesBundle;
                if (bundle != null) {
                    bool = Boolean.valueOf(bundle.getBoolean("edit_group_info"));
                } else {
                    bool = null;
                }
                Bundle bundle2 = this.$settingValuesBundle;
                if (bundle2 != null) {
                    bool2 = Boolean.valueOf(bundle2.getBoolean("add_other_participants"));
                } else {
                    bool2 = null;
                }
                Bundle bundle3 = this.$settingValuesBundle;
                if (bundle3 != null) {
                    bool3 = Boolean.valueOf(bundle3.getBoolean("send_messages"));
                } else {
                    bool3 = null;
                }
                Bundle bundle4 = this.$settingValuesBundle;
                if (bundle4 != null) {
                    bool4 = Boolean.valueOf(bundle4.getBoolean("require_membership_approval"));
                }
                r8 = new AnonymousClass3QC(bool, bool2, bool3, bool4);
            } else {
                r8 = null;
            }
            this.label = 1;
            C36401kF.A0L(r9.A01).Bu1(R.string.f12nameremoved);
            if (AnonymousClass0A2.A00(this, r9.A09, new SuggestGroupResultHandler$sendNewGroupSuggestionInCoroutineScope$2(r8, r9, r10, str, str2, (C023509x) null)) == r2) {
                return r2;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SuggestGroupResultHandler$onResult$1$1$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
