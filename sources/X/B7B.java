package X;

import android.content.SharedPreferences;

public class B7B extends C63473Ke {
    public Object A00;
    public final int A01;

    public B7B(C25621Ha r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ Object A00() {
        String str;
        int i = this.A01;
        SharedPreferences sharedPreferences = (SharedPreferences) ((C25621Ha) this.A00).A00.A02.getValue();
        switch (i) {
            case 0:
                str = "bonsai_agent_tos_accepted";
                break;
            case 1:
                str = "bonsai_invoke_tos_accepted";
                break;
            default:
                str = "bonsai_meta_ai_shortcut_tos_accepted";
                break;
        }
        if (C36371kC.A1U(sharedPreferences, str)) {
            return C188328zP.ACCEPTED;
        }
        return C188328zP.UNACCEPTED;
    }

    public /* bridge */ /* synthetic */ void A02(Object obj) {
        AnonymousClass1HY r3;
        boolean z;
        SharedPreferences.Editor editor;
        String str;
        SharedPreferences.Editor remove;
        int i = this.A01;
        C188328zP r5 = (C188328zP) obj;
        AnonymousClass00C.A0D(r5, 0);
        C25621Ha r0 = (C25621Ha) this.A00;
        switch (i) {
            case 0:
                r3 = r0.A00;
                z = r5.value;
                editor = C36351kA.A0A(r3.A02);
                str = "bonsai_agent_tos_accepted";
                break;
            case 1:
                r3 = r0.A00;
                z = r5.value;
                editor = C36351kA.A0A(r3.A02);
                str = "bonsai_invoke_tos_accepted";
                break;
            default:
                AnonymousClass1HY r02 = r0.A00;
                remove = C36351kA.A0A(r02.A02).putBoolean("bonsai_meta_ai_shortcut_tos_accepted", r5.value);
                break;
        }
        C36331k8.A0w(editor, str, z);
        remove = C19420v0.A00(r3.A00).remove("bonsai_tos_state");
        remove.apply();
    }
}
