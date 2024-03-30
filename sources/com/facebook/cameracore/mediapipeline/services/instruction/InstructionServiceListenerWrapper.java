package com.facebook.cameracore.mediapipeline.services.instruction;

import X.AnonymousClass751;
import X.AnonymousClass759;
import X.AnonymousClass7c6;
import X.C36341k9;
import X.C80653vk;
import android.os.Handler;
import java.util.List;

public class InstructionServiceListenerWrapper {
    public final Handler mUIHandler = C36341k9.A0H();

    public void setVisibleAutomaticInstruction(int i, List list, List list2, List list3) {
        List list4 = list3;
        this.mUIHandler.post(new C80653vk(this, list4, list, list2, i, 1));
    }

    public void hideInstruction() {
        AnonymousClass759.A00(this.mUIHandler, this, 43);
    }

    public void showInstructionForToken(String str) {
        this.mUIHandler.post(new AnonymousClass751(3, str, this));
    }

    public void showInstructionWithCustomText(String str) {
        this.mUIHandler.post(new AnonymousClass751(4, str, this));
    }

    public InstructionServiceListenerWrapper(AnonymousClass7c6 r2) {
    }
}
